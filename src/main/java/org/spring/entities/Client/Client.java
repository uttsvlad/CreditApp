package org.spring.entities.Client;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spring.entities.Bid.Bid;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clients")
public class Client {
    @Id
    private int passport;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String telNumber;
    private String job;
    @Enumerated(EnumType.STRING)
    private MaritalStatus maritalStatus;
    private int creditSum;
    @OneToMany
    private List<Bid> bids;
}
