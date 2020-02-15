public class score {

    public int calculateScore(String word){
        int score = 0;

        for (int i = 0; i < word.length(); i++) {

            String onePoint = "AEIOULNRSTaeioulnrst";
            String twoPoint = "DGdg";
            String threePoint = "BCMPbcmp";
            String fourPoint = "FHVWYfhwy";
            String fivePoint = "Kk";
            String eightPoint = "JXjx";
            String tenPoint = "QZqz";

            if(onePoint.contains(word.charAt(i)+"")){
                score = score + 1;
            }
            if(twoPoint.contains(word.charAt(i)+"")){
                score = score + 2;
            }
            if(threePoint.contains(word.charAt(i)+"")){
                score = score + 3;
            }
            if(fourPoint.contains(word.charAt(i)+"")){
                score = score + 4;
            }
            if(fivePoint.contains(word.charAt(i)+"")){
                score = score + 5;
            }
            if(eightPoint.contains(word.charAt(i)+"")){
                score = score + 8;
            }
            if(tenPoint.contains(word.charAt(i)+"")){
                score = score + 10;
            }
        }
        return score;
    }
}
