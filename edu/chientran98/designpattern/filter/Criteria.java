package edu.chientran98.designpattern.filter;

import java.util.List;

/**
 *
 * @author yeula
 */
public interface Criteria {

    public List<Person> meetCriteria(List<Person> persons);
}
