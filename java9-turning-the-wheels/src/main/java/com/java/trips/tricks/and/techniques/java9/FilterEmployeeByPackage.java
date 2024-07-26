package com.java.trips.tricks.and.techniques.java9;

import java.io.ObjectInputFilter;

/**
 * Une classe qui contient une méthode statique pour filtrer
 * les objets désérialisés en fonction de leur package
 */
public class FilterEmployeeByPackage {

    /**
     * This method applies a filter to control the deserialization of objects based on their package.
     *
     * @param filterInfo
     *         the filter information, which includes details about the class being deserialized.
     * @return the status indicating whether the deserialization is allowed, rejected, or undecided. - Returns {@code ObjectInputFilter.Status.ALLOWED} if the
     * class being deserialized belongs to the package "java.util". - Returns {@code ObjectInputFilter.Status.REJECTED} if the class being deserialized does not
     * belong to the package "java.util". - Returns {@code ObjectInputFilter.Status.UNDECIDED} if the class being deserialized is null.
     */
    static ObjectInputFilter.Status empFilter(ObjectInputFilter.FilterInfo filterInfo) {
        //Générer le type de classe dont l'objet est sérialisé
        Class<?> serialClass = filterInfo.serialClass();
        if(serialClass != null) {

            //vérifier si l'objet désérialisé fait partie d'un package spécifique
            // retourne ObjectInputFilter.Status:
            //ALLOWED si la classe de l'objet en cours de désérialisation appartient au package java.util.
            //REJECTED si la classe de l'objet en cours de désérialisation n'appartient pas au package java.util.
            //UNDECIDED si la classe de l'objet en cours de désérialisation est null.
            return serialClass.getPackage().getName().equals("java.util") ? ObjectInputFilter.Status.ALLOWED : ObjectInputFilter.Status.REJECTED;
        }

        return ObjectInputFilter.Status.UNDECIDED;
    }

}
