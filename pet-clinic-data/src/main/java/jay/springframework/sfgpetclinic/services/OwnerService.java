package jay.springframework.sfgpetclinic.services;

import jay.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
