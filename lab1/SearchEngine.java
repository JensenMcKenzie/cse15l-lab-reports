import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler{
    ArrayList<String> list = new ArrayList<String>();

    public String handleRequest(URI url){
        if (url.getPath().equals("/")){
            String result = "";
            for (String s : list){
                if (result.equals("")){
                    result = s;
                } else {
                    result += ", " + s;
                }
            }
            return (result.equals("") ? "No items in list" : "List: " + result);
        }
        else if (url.getPath().equals("/add")) {
            String [] parameters = url.getQuery().split("=");
            System.out.println(parameters[0] + parameters[1]);
            if (parameters[0].equals("s")){
                list.add(parameters[1]);
                return "Added " + parameters[1] + " to the list!";
            }
            else{
                return "Incorrect query parameter!";
            }
        }
        else if (url.getPath().equals("/search")){
            String [] parameters = url.getQuery().split("=");
            System.out.println(parameters[0] + parameters[1]);
            if (parameters[0].equals("s")){
                String result = "";
                for (String s : list){
                    if (s.contains(parameters[1])){
                        if (result.equals("")){
                            result = s;
                        }
                        else{
                            result += ", " + s;
                        }
                    }
                }
                return (result.equals("") ? "No results found!" : "Found in list: {" + result + "} containing the query \"" + parameters[1] + "\"");
            }else{
                return "Incorrect query parameter!";
            }
        }
        else{
            return "404 Not Found!";
        }
    }
}

class SearchEngine {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}