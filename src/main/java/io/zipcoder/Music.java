package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int count = 0;
        int upCount = 0;

        for (int i = 0; i < playList.length; i++) {
            if(selection.equals(playList[i])){
                count = Math.abs(startIndex - i);
                upCount = Math.abs(startIndex + playList.length - i);
            }

        }
        return Math.min(count,upCount);
    }
}
