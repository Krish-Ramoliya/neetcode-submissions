class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        anagrams = {}

        for word in strs:
            key = tuple(sorted(word))
            anagrams.setdefault(key,[]).append(word)

        return list(anagrams.values())
        