public class LipogramAnalyzer {
    String line;
    public LipogramAnalyzer(String text){
        this.line = text;
    }
    public String mark(char letter){
        return line.replace(letter, '#');
    }
    public String allWordsWith(char Letter){
        String result = "";
        String word = "";
        for(int i=0;i<line.length();i++){
            if(line.charAt(i) == ' '){
                if(word.indexOf(Letter)!=-1 && result.indexOf(word)==-1){
                    result += word+"\n";
                    System.out.println("Result:" + result);
                }
                word = "";

            } else {
                word += line.charAt(i);
                System.out.println("Word:" + word);
            }

        }

        return result;
    }
    
}
