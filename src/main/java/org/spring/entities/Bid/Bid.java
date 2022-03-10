package org.spring.entities.Bid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spring.entities.Client.Client;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clients")
public class Bid {
    @Id
    private int id;
    @Enumerated(EnumType.STRING)
    private Status status;
    private int creditTerm;
    private int creditSum;
    @OneToOne
    @JoinColumn(name = "passport")
    private Client client;
}
