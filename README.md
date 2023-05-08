# framework1

Contrainte
    Classe
        Les attributs doivent etre encapsulées sous le format getNomAttribut et setNomAttribut
        remplacer NomAttribut par le nom de votre attribut.

        Chaque fonction doit-etre annotée avec MyAnnotation de la classe Utilitaire.MyAnnotaion de framework.jar
        l'annotation doit-etre initialisée comme suit:
        
        ex:
            @MyAnnotation(url = "login", ParametersNames = {})
            public ModelView login(){
                ModelView m = new ModelView();
                m.setView("userspace.jsp");
                m.addItem("user", this);
                return m;
            }
        
        avec les deux parametres url, parametresnames
            dans url on donne l'url qui doit matcher avec la fonction
            dans parametresnames contient les noms donnés à chaque parametre de la fonction
    
    Configuration Servlet
        dans la balise init-param > param-value, mettre la classe commune de vos objets
        la servlet Frontservlet est configuree pour que tous les url y tombent exceptées les fichier jsp
    
    Liens
    Le lien contenu dans la balise doit correspondre a l'une des fonctions dans la classe
        ex: html <a href="get-emp">Voir tous les employés</a>
            Java
                @MyAnnotaion (url = get-emp, ParametersNames = {})
                fonction obtenir les employés

    Lien/Formulaire
        +Si on utilise une fonction parametrée
            Si on fait passer une id dans une url et que cette id est un parametre de la fonction à appellée
            l'id doit correspondre au parametre exigé dans la fonction, on doit préciser le nom du/des parametre(s) dans ParametersNames 
            ex: html <a href="detais-emp?idEmp=1">Voir tous les employés</a>
                Java 
                    @MyAnnotaion (url = detais-emp, ParametersNames = { idEmp })
                    fonction obtenir les employés (idEmp)
            Meme cas pour les formulaires les noms des input doivent correspondre aux noms des parametres

        +Si on utilise une fonction propre à la classe qui n'a pas besoin de parametre
            Pour un formulaire, les noms des champs doivent correspondre aux attributs de la classe utilisée
            ex: html 
                        <input type='text' name='nom'>
                Java
                    public class emp{
                        String nom;
                        public void setNom(String nom) { this.nom = nom; }
                        public String getNom() { return this.nom; }
                        @MyAnnotaion (url = inserer-emp, ParametersNames = {})
                        public ModelView insert(){
                            fonction d'insertion vers une base de donnée ou autre
                            this.insert();
                        }
                    }
        NB: 