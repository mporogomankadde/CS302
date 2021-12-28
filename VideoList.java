package Mid_Term_Project;

import java.util.Arrays;

public class VideoList {
    private Video [] videos;
    private int size;

    public Video[] getVideos() {
        return videos;
    }

    public VideoList(){
        videos = new Video[10];
        size = 0;
    }
    public void add(Video o){
        videos[size]=o;
        size++;
        if(size == videos.length)resize();
    }
    public int size(){
        return size;
    }
    private void resize() {
        videos = Arrays.copyOf(videos, videos.length * 2);
    }

    @Override
    public String toString() {
        return "VideoList: {" +
                "Videos: " + Arrays.toString(videos) +
                ", Size: " + size +
                '}';
    }
}
