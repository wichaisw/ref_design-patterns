package creational.builder;

public class QueryBuildDirector {

    /**
     * create a query bases on from and where value
     * @param from
     * @param where
     * @param builder to define end result of the query or the representation of the query
     * @return
     */
    public Query buildQuery(String from, String where, QueryBuilder builder) {
        builder.from(from);
        builder.where(where);
        return builder.getQuery();
    }
}
