package app;

import static spark.Spark.*;

public class App 
{
    public static void main( String[] args )
    {

        port(4567);

        staticFiles.externalLocation("src/main/resources/public");

        get("/", (req, res) -> {

            res.redirect("/html/index.html");

            return null;

        });

    }

}
