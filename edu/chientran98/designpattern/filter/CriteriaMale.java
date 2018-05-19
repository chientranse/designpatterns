package edu.chientran98.designpattern.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author yeula
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter((person) -> person.getGender().equalsIgnoreCase("male")).collect(Collectors.toList());
    }

}
