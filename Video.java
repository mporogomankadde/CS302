package Mid_Term_Project;

public class Video implements Comparable <Video>{
    String title;
    double durationInMinutes;
    int views;
    int likes;
    double watchTime;

    public Video(){
        this.title = "Titanic";
        this.durationInMinutes = 2.45;
        this.views = 23;
        this.likes = 100;
        this.watchTime = 23.00;
    }

    public Video(String title, double durationInMinutes, int views, int likes, double watchTime) {
        this.title = title;
        this.durationInMinutes = durationInMinutes;
        this.views = views;
        this.likes = likes;
        this.watchTime = watchTime;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(double durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public double getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(double watchTime) {
        this.watchTime = watchTime;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)return false;
        if(!(obj instanceof Video))return false;
        Video v = (Video) obj;
        return (watchTime == v.watchTime) && (title.equals(v.title));
    }
    @Override
    public int compareTo(Video o) {
          return (int) (watchTime - o.watchTime);
    }
    @Override
    public String toString() {
        return "Video: {" +
                "  Title: " + title +
                ", DurationInMinutes: " + durationInMinutes +
                ", Views: " + views +
                ", Likes: " + likes +
                ", WatchTime: " + watchTime +
                '}';
    }
}
