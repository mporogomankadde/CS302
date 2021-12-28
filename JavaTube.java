package Mid_Term_Project;

import java.util.*;

public class JavaTube {

    class sortVideosByTitle implements Comparator <Video> {

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getTitle().compareTo(o2.getTitle());
        }
    }
    static class sortVideosByViews implements Comparator <Video>{

        @Override
        public int compare(Video o1, Video o2) {
            return o1.getViews()-o2.getViews();
        }
    }
    public void sortCookingVideoByIngredentList(CookingVideo [] cookingVideos){
        class SortIngredient implements Comparator <CookingVideo> {

            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return o1.getIngredientsList().length - o2.getIngredientsList().length;
            }
        }
        //sortCookingVideoByIngredentList sc= new sortCookingVideoByIngredentList();
        //Arrays.sort(cookingVideo,sc)
    }
    public void printAllCookingRecipies (CookingVideo [] cookingVideos){
        for( CookingVideo e: cookingVideos){
            System.out.println(e);
        }
    }
    public void videoPrinter (Video [] videos){
        for (Video e : videos){
            System.out.println(e.toString());
        }
    }
    public void sortCookingVideoByServingSizeDescending(CookingVideo[] cookingVideos){
        Arrays.sort(cookingVideos, new Comparator<CookingVideo>() {               //16
            @Override
            public int compare(CookingVideo o1, CookingVideo o2) {
                return (o1.getRecipe().getServings()-o2.getRecipe().getServings())*-1;
            }
        });
    }

    public static void main(String[] args) {



        Recipe r = new Recipe("Making peach pie","Peach,brown sugar,cinnamon,salt,butter,cacao ","cook 1 hr",45,3,5);
        Recipe r1 = new Recipe("Frosty Ice cream","Milk, cream ,sugar,egg white, vanilla extract","store in freezer for 1 hr",2,30,2);
        Recipe r2 = new Recipe("Spaghetti ","pasta,olive, tomato sauce, onion, garlic, lemmon, chili","cook 1 hr",30,3,2);
        Recipe r3 = new Recipe("Pizza vegan","dough,tomato sauce,cheese","cook 1 and half hr",20,45,8);
        Recipe r4 = new Recipe("Sweet potato pie","sweet potato ,salt and pepper,olive oil ","cook 1 hr",10,25,10);

        //1
        CookingVideo c1 = new CookingVideo("Making minestrone supe", 20.0, 2345,8032,34.0,r);
        CookingVideo c2 = new CookingVideo("Baking Irish bread", 30.0, 455,2894,37.0,r1);
        CookingVideo c3 = new CookingVideo("Chicken ", 40.0, 28958,878589,45.0,r2);
        CookingVideo c4 = new CookingVideo("Rice", 50.0, 43453454,784,23.0,r3);
        CookingVideo c5 = new CookingVideo("Pie", 40.0, 3434,1267348,34.0,r4);
        //2
        GamingVideo g1 = new GamingVideo("PoolTable",23.2,98747,359083,324.0,"Pool");
        GamingVideo g2 = new GamingVideo("Golf",45.0,7848,77466,420.0,"Free shot");
        GamingVideo g3 = new GamingVideo("Soccer",90,14425,672873,220.0,"Goal kick");
        GamingVideo g4 = new GamingVideo("Pine Pone",34.0,63765,782937,830.0,"10 score");
        GamingVideo g5 = new GamingVideo("Foot Ball",90,2508932,20787920,610.0,"Final");

        Video [] videos  = {c1,c2,c3,c4,c5,g1,g2,g3,g4,g5}; //3
        CookingVideo [] cookingVideos1 ={c1,c2,c3,c4,c5};//4
        GamingVideo [] gamingVideos = {g1,g2,g3,g4,g5}; //5
        JavaTube javaTube = new JavaTube();
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT ALL VIDEO ARRAY USING VIDEO PRINTER @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.videoPrinter(videos);  //6
        Arrays.sort(videos);            //7
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT ALL VIDEO ARRAY TO COMPARE THE OUT PUT @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.videoPrinter(videos);  //8
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORTING VIDEOS BY TITLE USING MEMBER INNER CLASS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        JavaTube.sortVideosByTitle jsv = javaTube.new sortVideosByTitle();//Non-static inner class call
        Arrays.sort(videos,jsv);              //9
        for(Video v: videos){
            System.out.println(v);//10
        }
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORTING VIDEOS BY VIEWS USING STATIC INNER CLASS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");

        JavaTube.sortVideosByViews jsvv = new JavaTube.sortVideosByViews(); //Static inner class call
        Arrays.sort(videos,jsvv);
        for(Video v : videos){
            System.out.println(v);//11
        }
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT ALL VIDEOS TO COMPARE OUTPUT @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.videoPrinter(videos);       //12 Printing all videos to compare the output.
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT COOKING VIDEOS USING PRINT ALL COOKING VIDEO @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.printAllCookingRecipies(cookingVideos1); //13 The question says list but the method accepts arrays
        javaTube.videoPrinter(cookingVideos1);
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORT COOKING VIDEO BY INGREDIENT LIST @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.sortCookingVideoByIngredentList(cookingVideos1);// 14Local inner class
        javaTube.videoPrinter(cookingVideos1);//15
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORT COOKING VIDEOS BY SERVING SIZE DESCENDING ORDER @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.sortCookingVideoByServingSizeDescending(cookingVideos1);           //16
        javaTube.videoPrinter(cookingVideos1);                                      //17
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT ALL COOKING RECIPES USING COOKING VIDEO METHOD @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        javaTube.printAllCookingRecipies(cookingVideos1);                           //18
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ LAMBDA @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");
        Arrays.sort(gamingVideos,(o1, o2) -> o1.game.compareTo(o2.game) );//19
        System.out.println(Arrays.toString(gamingVideos));
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ PRINT COOKING AND GAMING VIDEOS BY USING VIDEO LIST CALSS @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");

        VideoList videoList = new VideoList();
        for(CookingVideo c : cookingVideos1){   //20
            videoList.add(c);
        }
        for(GamingVideo g : gamingVideos){
            videoList.add(g);
        }
        System.out.println(videoList.toString()); //21
        System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORT VIDEOS BY VIEWS  @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @\n");

        JavaTube.sortVideosByViews svv = new JavaTube. sortVideosByViews();
        Arrays.sort(cookingVideos1,svv);
        javaTube.videoPrinter(cookingVideos1);  //22


    }
}
