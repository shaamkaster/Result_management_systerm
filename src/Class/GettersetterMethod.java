
package Class;

/**
 *
 * @author Shamantha
 */
public class GettersetterMethod {
    private String name;
    private String pass;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    public GettersetterMethod(String name, String pass) {
        this.name = name;
        this.pass = pass;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }
}
