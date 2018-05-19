package edu.chientran98.designpattern.filter;

import java.util.List;

/**
 *
 * @author yeula
 */
public class OrCriteria implements Criteria {

    private Criteria criteria1;
    private Criteria criteria2;

    public OrCriteria(Criteria criteria1, Criteria criteria2) {
        this.criteria1 = criteria1;
        this.criteria2 = criteria2;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> results = criteria1.meetCriteria(persons);
        criteria2.meetCriteria(persons).stream().filter((person) -> !results.contains(person)).forEach((person) -> results.add(person));
        return results;
    }

}
