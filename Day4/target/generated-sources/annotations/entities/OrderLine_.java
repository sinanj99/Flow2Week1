package entities;

import entities.ItemType;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-09-20T15:42:05")
@StaticMetamodel(OrderLine.class)
public class OrderLine_ { 

    public static volatile SingularAttribute<OrderLine, ItemType> itemType;
    public static volatile SingularAttribute<OrderLine, Integer> qty;
    public static volatile SingularAttribute<OrderLine, Integer> id;

}