package services;

import entity.Customer;

public class CustomerServiceImpl implements CustomerService{

    @Override
    public Customer add(Customer customer) {
        if (customer.getAge() < 18){
            System.out.println("yasiniz 18den kucuk oldugu icin giris yapamiyorsunuz.");

        }
        System.out.println(customer.getFirstName() + " " + customer.getLastName() +  " , Hostelimize hosgeldiniz...");
        System.out.println("---------- oda numarasini yukaridan assagiya dogru sirasiyla sayarak giriniz. -----------");
        return customer;
    }
}
