package org.spring.entities.Treaty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.spring.entities.Bid.Bid;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.time.LocalDate;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "clients")
public class Treaty {
    @Id
    private int id;
    @Basic
    private LocalDate date;
    @Enumerated(EnumType.STRING)
    private Status status;
    @OneToOne
    private Bid bid;
}
