
import

@RestController
public class AccountController{
    @PostMapping("/account")
    public Account create(@RequestBody Account account){
        return accountService.create(account);
    }
}