public int countVowels(String str) { //this is how I managed to do it. In CodeWars website it doesn't work
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            count++;
        }
    }
    return count;
}