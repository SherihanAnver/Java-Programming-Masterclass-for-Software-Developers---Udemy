public class PlayingCat {
    public static boolean isCatPlaying(boolean summer,int temperature){
        boolean result = false;
        if((summer && (temperature >=25 && temperature <= 45)) || (!summer && (temperature >=25 && temperature <= 35))){
            result = true;
        }
        return result;
    }
}
