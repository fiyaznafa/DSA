package misc;

import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddressTest {

    @Test
    public void test1(){
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(noUniqueEmails(emails));
    }

    @Test
    public void test2(){
        String[] emails = {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        System.out.println(noUniqueEmails(emails));
    }

    @Test
    public void test3(){
        String[] emails = {"test.email+alex@leetcode.com","test.email.leet+alex@code.com"};
        System.out.println(noUniqueEmails(emails));
    }


    private int noUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String str:emails){
            set.add(processDomain(str));
        }
        return set.size();
    }

    private String processDomain(String str) {
        int right=0;
        StringBuilder sb = new StringBuilder();
        while(right <str.length()){
            if(str.charAt(right)=='@')break;
            else if(str.charAt(right)=='.');
            else if(str.charAt(right)=='+'){
                while(str.charAt(right)!='@')right++;
                break;
            }
            else sb.append(str.charAt(right));
            right++;
        }
        sb.append(str.substring(right));
        return sb.toString();
    }
}
