package edu.chientran98.designpattern.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yeula
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<Filter>();

    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        filters.stream().forEach((filter) -> filter.execute(request));
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
