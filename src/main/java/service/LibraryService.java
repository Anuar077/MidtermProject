package service;

import model.BookType;

import java.util.ArrayList;
import java.util.List;


public class LibraryService {

    public List getAvailableBrands(BookType type){

        List brands = new ArrayList();

        if(type.equals(BookType.Comedy)){
            brands.add("Comedy book");
            brands.add(("Comedy book2"));
            brands.add(("Comedy book3"));

        }else if(type.equals(BookType.Fiction)){
            brands.add("Fiction book");
            brands.add("Fiction book2");

        }else if(type.equals(BookType.Drama)){
            brands.add("Drama book");

        }else {
            brands.add("Drama book2");
        }
        return brands;
    }
}