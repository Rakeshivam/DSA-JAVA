public class String_builder {
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");

        for (char ch='a'; ch<='z'; ch++) {
            sb.append(ch +" ");
        }// abcdefgh..........z
        // O(26)
        System.out.println(sb);
    }
    

}
