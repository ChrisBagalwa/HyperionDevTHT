# This program groups the anagrams together in the list
# Code reviewer: Chris Bagalwa
# 16/01/2023

class Solution:
   # Define the groupAnagrams function
   def groupAnagrams(self, strs):
      # Create an empty dictionary to store the anagrams
      result = {}
      # Iterate through all the strings in the input list
      for i in strs:
         # Sort the current string and use it as the key in the dictionary
         x = "".join(sorted(i))
         # If the key already exists in the dictionary, 
         # append the current string to the list of anagrams
         if x in result:
            result[x].append(i)
         # If the key does not exist, 
         # create a new key-value pair in the dictionary where the key is the sorted string
         # and the value is a list containing the current string
         else:
            result[x] = [i]
      # Return the values of the dictionary as a list of lists
      return list(result.values())

# Display group the anagrams together in the list
print(Solution().groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))