import com.java.trips.tricks.and.techniques.java9.com.mathmoduleservice.MathService;

module MathServiceModule {
    provides MathService with MathService;
    exports com.java.trips.tricks.and.techniques.java9.com.mathmoduleservice; /* Export le package à tous les modules. */
    /*exports com.java.trips.tricks.and.techniques.java9.com.mathmoduleservice  to MathModule, MathProject;*/
    /*restreint l'utilisation du package aux modules MathModule et MathProject*/


}
