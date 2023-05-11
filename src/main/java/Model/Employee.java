package Model;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String first_name;
    @Column
    private String last_name;
    @Column
    private String gender;
    @Column
    private int age;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    @Column
    private City city;


}
