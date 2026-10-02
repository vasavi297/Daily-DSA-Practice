class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> freq = new HashMap<>();
        for(String word : words)
        {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }
        PriorityQueue<String> minHeap = new PriorityQueue<>((a,b) -> {
            if(freq.get(a).equals(freq.get(b)))
            {
                return b.compareTo(a);
            }
            return freq.get(a) - freq.get(b);
        });
        for(String word : freq.keySet())
        {
            minHeap.add(word);
            if(minHeap.size() > k)
            {
                minHeap.poll();
            }
        }
        ArrayList<String> result = new ArrayList<>();
        while(! minHeap.isEmpty())
        {
            result.add(minHeap.poll());
        }
        Collections.reverse(result);
        return result;
    }
}