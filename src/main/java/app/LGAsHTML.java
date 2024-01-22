package app;

import java.util.ArrayList;

import io.javalin.http.Context;
import io.javalin.http.Handler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 * Example Index HTML class using Javalin
 * <p>
 * Generate a static HTML page using Javalin
 * by writing the raw HTML into a Java String object
 *
 */
public class LGAsHTML implements Handler {

    // URL of this page relative to http://localhost:7001/
    public static final String URL = "/";

    @Override
    public void handle(Context context) throws Exception {
        // Create a simple HTML webpage in a String
        String html = "";

        // Add some Head information
        html = html + "<head>" + 
               "<title>Closing the Gap</title>";
        html= html + "<body>";

<<<<<<< HEAD
        html = html + "<div class=\"topnav\">" +
        "<a class=\"menu\" href=\"home.html\">Home</a>" +
        "<a class=\"menu\" href=\"target.html\">Target Audience</a>" +
        "<a class=\"menu\" href=\"level2A.html\">Statistics</a>" +
        "<a class=\"menu\" href=\"support.html\">Support</a>" +
        "<a class=\"menu\" href=\"aboutus.html\">About us</a>" +
        "</div>";
    
        html = html + "<ul class=\"breadcrumb\">" +
            "<li><a href=\"home.html\">Logo</a></li>"+
            "<li><a href=\"level2A.html\">Statistics</a></li>" +
            "<li><a href=\"notsure\">Outcome 5</a></li>"+
            "<li><a href=\"comparepopup.html\">Comparison</a></li>" +
        "</ul>";
=======
    html= html + "<div class='topnav'>" +
        "<a class='menu' href='#home'>Home</a>"
        + "<a >Target Audience</a>" +   
        "<a>Statistics</a>" + "<a>Support</a>" + 
        "<a> About us </a>" +
    "</div>";
    html = html + 
        "<ul class='breadcrumb'>" +
            "<li><a href='#'>Logo</a></li>" +
            "<li><a href='#'>Statistics</a></li>" +
           " <li><a href='#'>Outcome 5</a></li>" +
            "<li><a href='#''>Comparison</a></li>" +
       " </ul>";
>>>>>>> ba466adbf9bd479bce1bd1aff64170b24cff6f11
                
        html = html +  "<div class='container'>" + "<div class='sidebar'>" + "<h2>Age</h2>" +
    "<div class='section'>" +
        
"<form action='/action_page.php>'" +
    "<label for='fname'>State/ Territory</label><br>" +
    "<input type='text' id='fname' name='fname' value='Search by name or LGAs code...' style='text-align: match-parent;' size='50'><br>" +
        "<div class='checkbox-container'>" +
           " <ul>"  +
                 "<input type=checkbox' id='nsw'>" +"<label for='nsw'>Select all</label>" +
                "<li>" +
                "<input type=checkbox' id='nsw'>" +
                "<label for='nsw'>New South Wales - NSW</label>"
                 + "</li>" +
                 "<li>" +
                  "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Albury - 10050</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Armidale Regional - 10180</label>" +
                 "</li>" +
                 "<li>" + 
                 "<input type='checkbox' id='nsw'>" +
                  "<label for='nsw'>Ballina - 10250</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Balranald - 10300</label>" +
                 "</li>" +
                 "<li> " +
                 "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Bathurst Religional - 10470</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                  "<label for='nsw'>Victoria - Vic.</label>" +
                 "</li>" + 
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                "<label for='nsw'>Alpine - 20110</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Ararat - 20260</label>" +
                  "</li>" +
                 "<li>" + 
                "<input type='checkbox' id='nsw'>" + 
                 "<label for='nsw'>Ballarat - 20660</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>"+
                 "<label for='nsw'>Banyule - 20660</label>" +
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                "<label for='nsw'>Bass Coast - 20740</label>" + 
                 "</li>" +
                 "<li>" +
                 "<input type='checkbox' id='nsw'>" +
                 "<label for='nsw'>Baw Baw - 20830</label>" + 
                "</li>" +
                "</ul>" +
        "</div>" +
    "</div>" + 
    "<div class='section'>" + 
        "<h3>Status</h3>" +
        "<div class='checkbox-container'>" +
            "<ul>" +
                "<li>" +
            "<input type='checkbox' id='indigenous'>" +
            "<label for='indigenous'>Select all</label>" +
                "</li>" + 
                "<li>" +
            "<input type='checkbox' id='indigenous'>" +
            "<label for='indigenous'>Indigenous</label>" +
            "</li>" +
            "<li>" +
            "<input type='checkbox' id='indigenous'>" +
            "<label for='indigenous'>Non- indigenous</label>" +
            "</li>" +
            "<li>" +
            "<input type='checkbox' id='indigenous'>" + 
            "<label for='indigenous'>Indigenous status was not specified</label>" +
            "</li>" +
       "</div>" +
    "</div>" +
   "<div class='section'>" +
        "<h3>Gender</h3>" +
        "<div class='checkbox-container'>" +
            "<ul>" +
              "<li>" +
                "<input type='checkbox' id='select-all'>" +
                "<label for='select-all'>Select all</label>" +
              "</li>" +
              "<li>" +
                "<input type='checkbox' id='female'>" +
                "<label for='female'>Female</label>" +
             "</li>" +
              "<li>" +
                "<input type='checkbox' id='male'>" +
                "<label for='male'>Male</label>" +
              "</li>" +
            "</ul>" +
          "</div>" +
   "</div>" +

"</div>" +
                    
                    "<div id='btns'></div>" +
                "</div>" +
            "</div>" +
            "<div class='contant'>" +
                "<ul class='tab-list__list'>" + 
                    "<li class='tab-list__item'><a href='#tab-1' class='tab-list__link tab-list__link--is-active'>Data Set 1</a></li>" +
                    "<li class='tab-list__item'><a href='#tab-2' class='tab-list__link'>Data Set 2</a></li>" +
                    "<li class='tab-list__item'><a href='#tab-3' class='tab-list__link'>Data Set 3</a></li>" +
                    "<li class='tab-list__item'><a href='#tab-4' class='tab-list__link'>Data Set 4</a></li>" +
               "</ul>" +
                "<div class='header'>" +
                    "<p>Age</p>" +
                    
                "</div>" +
                "<div class='tag' style='font-size:x-small'>NSW, Albury <button>X</button></div>" +
    "<div class='tag' style='font-size:x-small'>NSW, Ballina <button style='font-size:x-small'>X</button></div>" +
    "<div class='tag' style='font-size:x-small'>NSW, Bathurst Regional <button style='font-size:x-small'>X</button></div>" +
   "<div class='tag' style='font-size:x-small' >Vic, Alpine <button style='font-size:x-small'>X</button></div>" +
    "<div class='tag' style='font-size:x-small'>Vic, Banyule <button style='font-size:x-small'>X</button></div>" +
    "<div class='tag' style='font-size:x-small'>Female <button style='font-size:x-small'>X</button></div>" +
    "<div class='tag' style='font-size:x-small'>Indigenous <button style='font-size:x-small'>X</button></div>" +
            "</div>" +
            "<div class='center-body'>" +
            "<div>" +
    "<p style='font-size: medium;  ; '> View by</p>" +
    
            "</div>" +
            "/div>" +
            "</div>" +
        "</div>" +
           "</div>" +
           "</body>";
        // Add some CSS (external file)
        html = html + "<link rel='stylesheet' type='text/css' href='common.css' />";
        html = html + "</head>";

        // Add the body
        html = html + "<body>";

        // Add the topnav
        // This uses a Java v15+ Text Block
        html = html + """
            <div class='topnav'>
                <a href='/'>Homepage</a>
            </div>
        """;

        // Add header content block
        html = html + """
            <div class='header'>
                <h1>
                    <img src='logo.png' class='top-image' alt='RMIT logo' height='75'>
                    Week 05 exercise index.html page
                </h1>
            </div>
        """;

        // Add Div for page Content
        html = html + "<div class='content'>";

        // Next we will ask this *class* for the movies
        ArrayList<String> movieTitles = getMovieTitles();

        // Add HTML for the movies list
        html = html + "<h1>All Movies</h1>";
        
        // Start the HTML list
        html = html + "<ul>";

        // Finally we can print out all of the movies
        for (String title : movieTitles) {
            html = html + "<li>" + title + "</li>";
        }

        // Finish the List HTML
        html = html + "</ul>";
        
        // Altneratively we can use JDBCConnection to add HTML for the movies list
        JDBCConnection jdbc = new JDBCConnection();
       // ArrayList<Milestore1> movies = jdbc.();
        //html = html + "<h1>All Movies with Years (from JDBCConnection)</h1>" +
         //             "<ul>";
        //for (Movie movie : movies) {
          //  html = html + "<li>" + movie.name + " was made in " + movie.year + "</li>";
        //}
        html = html + "</ul>";

        // TODO: Add your code here for the other queries 

        int movieCount = jdbc.countMovies();
        html = html + "<h1>Number of Movies (from JDBCConnection)</h1>" + movieCount;

        // Close Content div
        html = html + "</div>";

        // Footer
        html = html + """
            <div class='footer'>
                <p>COSC3056 Module 0 - Week 05</p>
            </div>
        """;

        // Finish the HTML webpage
        html = html + "</body>" + "</html>";


        // DO NOT MODIFY THIS
        // Makes Javalin render the webpage
        context.html(html);
    }

    /**
     * Get all of the Movie Titles in the database
     * @return
     *    Returns an ArrayList of String with ONLY the movie titles
     */
    public ArrayList<String> getMovieTitles() {
        // Create the ArrayList to return - of Strings for the movie titles
        ArrayList<String> movies = new ArrayList<String>();

        // Setup the variable for the JDBC connection
        Connection connection = null;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(JDBCConnection.DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query
            String query = "SELECT * FROM movie";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);

            // Process all of the results
            // The "results" variable is similar to an array
            // We can iterate through all of the database query results
            while (results.next()) {
                // We can lookup a column of the a single record in the
                // result using the column name
                // BUT, we must be careful of the column type!
                String movieName     = results.getString("mvtitle");

                // Store the movieName in the ArrayList to return
                movies.add(movieName);
            }

            // Close the statement because we are done with it
            statement.close();
        } catch (SQLException e) {
            // If there is an error, lets just pring the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }

        // Finally we return all of the movie titles
        return movies;
    }
    public int countMovies() {
        // Create the ArrayList to return - this time of Movie objects

        // Setup the variable for the JDBC connection
        Connection connection = null;
        int count = 0;

        try {
            // Connect to JDBC data base
            connection = DriverManager.getConnection(JDBCConnection.DATABASE);

            // Prepare a new SQL Query & Set a timeout
            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);

            // The Query
            String query = "SELECT COUNT (*) AS movieCount FROM movie;";
            
            // Get Result
            ResultSet results = statement.executeQuery(query);

            // Process all of the results
            // The "results" variable is similar to an array
            // We can iterate through all of the database query results
            while (results.next()) {
                // Create a Movie Object
                count = results.getInt("movieCount");

                // Lookup the columns we want, and set the movie object field
                // BUT, we must be careful of the column type!
                

                // Add the movie object to the array
             
            }

            // Close the statement because we are done with it
            statement.close();
        } catch (SQLException e) {
            // If there is an error, lets just print the error
            System.err.println(e.getMessage());
        } finally {
            // Safety code to cleanup
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }

        // Finally we return all of the movies
        return count;
    }

}
