/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import DAO.EventoDAO;

/**
 *
 * @author AAC
 */

public abstract class DAOFactory {

    // List of DAO types supported by the factory
    public static final int SQLSERVER = 1;
    //public static final int CLOUDSCAPE = 2;
    //public static final int ORACLE = 3;
    //public static final int SYBASE = 4;
    //public static final int MYSQL = 5;

    // There will be a method for each DAO that can be created. The concrete factories will have to implement these methods.
    public abstract EventoDAO getEventoDAO();

    public static DAOFactory getDAOFactory(int whichFactory){

        switch(whichFactory){
          case SQLSERVER: 
              return new SQLServerDAOFactory();
          default: 
              return null;
        }
    }
}
