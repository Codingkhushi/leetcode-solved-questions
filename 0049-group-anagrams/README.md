<h2><a href="https://leetcode.com/problems/group-anagrams">49. Group Anagrams</a></h2><h3>Medium</h3><hr><p>Given an array of strings <code>strs</code>, group the <span data-keyword="anagram">anagrams</span> together. You can return the answer in <strong>any order</strong>.</p>

<p>&nbsp;</p>
<p><strong class="example">Example 1:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">strs = [&quot;eat&quot;,&quot;tea&quot;,&quot;tan&quot;,&quot;ate&quot;,&quot;nat&quot;,&quot;bat&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[[&quot;bat&quot;],[&quot;nat&quot;,&quot;tan&quot;],[&quot;ate&quot;,&quot;eat&quot;,&quot;tea&quot;]]</span></p>

<p><strong>Explanation:</strong></p>

<ul>
	<li>There is no string in strs that can be rearranged to form <code>&quot;bat&quot;</code>.</li>
	<li>The strings <code>&quot;nat&quot;</code> and <code>&quot;tan&quot;</code> are anagrams as they can be rearranged to form each other.</li>
	<li>The strings <code>&quot;ate&quot;</code>, <code>&quot;eat&quot;</code>, and <code>&quot;tea&quot;</code> are anagrams as they can be rearranged to form each other.</li>
</ul>
</div>

<p><strong class="example">Example 2:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">strs = [&quot;&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[[&quot;&quot;]]</span></p>
</div>

<p><strong class="example">Example 3:</strong></p>

<div class="example-block">
<p><strong>Input:</strong> <span class="example-io">strs = [&quot;a&quot;]</span></p>

<p><strong>Output:</strong> <span class="example-io">[[&quot;a&quot;]]</span></p>
</div>

<p>&nbsp;</p>
<p><strong>Constraints:</strong></p>


<ul>
	<li><code>1 &lt;= strs.length &lt;= 10<sup>4</sup></code></li>
	<li><code>0 &lt;= strs[i].length &lt;= 100</code></li>
	<li><code>strs[i]</code> consists of lowercase English letters.</li>
</ul>


<p><strong>Dry Run:</strong></p>
Initial State:

Input strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
Create a HashMap<String, List<String>> map = new HashMap<>();
The map is initially empty.
First iteration (s = "eat"):

Convert s into a character array: char[] s1 = {'e', 'a', 't'}.
Sort s1: {'a', 'e', 't'}.
Convert the sorted array back to a string: sorted = "aet".
Check if map contains the key "aet". Since it doesn't, create a new list for this key: map.put("aet", new ArrayList<>());.
Add "eat" to the list: map.get("aet").add("eat");.
Map state: { "aet": ["eat"] }.
Second iteration (s = "tea"):

Convert s into a character array: char[] s1 = {'t', 'e', 'a'}.
Sort s1: {'a', 'e', 't'}.
Convert the sorted array back to a string: sorted = "aet".
"aet" is already a key in the map, so add "tea" to the existing list: map.get("aet").add("tea");.
Map state: { "aet": ["eat", "tea"] }.
Third iteration (s = "tan"):

Convert s into a character array: char[] s1 = {'t', 'a', 'n'}.
Sort s1: {'a', 'n', 't'}.
Convert the sorted array back to a string: sorted = "ant".
"ant" is not a key in the map, so create a new list for it: map.put("ant", new ArrayList<>());.
Add "tan" to the list: map.get("ant").add("tan");.
Map state: { "aet": ["eat", "tea"], "ant": ["tan"] }.
Fourth iteration (s = "ate"):

Convert s into a character array: char[] s1 = {'a', 't', 'e'}.
Sort s1: {'a', 'e', 't'}.
Convert the sorted array back to a string: sorted = "aet".
"aet" is already a key in the map, so add "ate" to the existing list: map.get("aet").add("ate");.
Map state: { "aet": ["eat", "tea", "ate"], "ant": ["tan"] }.
Fifth iteration (s = "nat"):

Convert s into a character array: char[] s1 = {'n', 'a', 't'}.
Sort s1: {'a', 'n', 't'}.
Convert the sorted array back to a string: sorted = "ant".
"ant" is already a key in the map, so add "nat" to the existing list: map.get("ant").add("nat");.
Map state: { "aet": ["eat", "tea", "ate"], "ant": ["tan", "nat"] }.
Sixth iteration (s = "bat"):

Convert s into a character array: char[] s1 = {'b', 'a', 't'}.
Sort s1: {'a', 'b', 't'}.
Convert the sorted array back to a string: sorted = "abt".
"abt" is not a key in the map, so create a new list for it: map.put("abt", new ArrayList<>());.
Add "bat" to the list: map.get("abt").add("bat");.
Map state: { "aet": ["eat", "tea", "ate"], "ant": ["tan", "nat"], "abt": ["bat"] }.
Final step:

Convert the values of the map into a list: new ArrayList<>(map.values()).
Output: [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]].
