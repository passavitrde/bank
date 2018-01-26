import java.util.HashMap;
import java.util.Map;

public class Bank {
   private String bankName;
   private Map<Integer,Customer> customers;
   public Bank(String name){
       this.bankName=name;
       this.customers=new HashMap<Integer, Customer>();
   }
   public void addCustomer(Customer c){
       customers.put(c.getId(),c);
   }
   public Customer findCustomerById(int custId){
       return customers.get(custId);
   }
   public final boolean validateCustomer(int custId,int pin){
       Customer customer = findCustomerById(custId);
       if(customer!=null&&customer.match(pin)){
           return true;
       }
       return false;
   }
}
