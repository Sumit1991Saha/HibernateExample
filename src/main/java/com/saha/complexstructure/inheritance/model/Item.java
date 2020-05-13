package com.saha.complexstructure.inheritance.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.DiscriminatorType.*;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Table(name = "item_i")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class Item {

  @Id
  @GeneratedValue
  protected Long id;

  @Column(length = 100)
  protected String title;

  @Column(length = 3000)
  protected String description;

  @Column(name = "unit_cost")
  protected Float unitCost;

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Item item = (Item) o;

    if (description != null ? !description.equals(item.description) : item.description != null) return false;
    if (id != null ? !id.equals(item.id) : item.id != null) return false;
    if (!title.equals(item.title)) return false;
    if (unitCost != null ? !unitCost.equals(item.unitCost) : item.unitCost != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + title.hashCode();
    result = 31 * result + (description != null ? description.hashCode() : 0);
    result = 31 * result + (unitCost != null ? unitCost.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Item{");
    sb.append("id=").append(id);
    sb.append(", title='").append(title).append('\'');
    sb.append(", description='").append(description).append('\'');
    sb.append(", unitCost=").append(unitCost);
    sb.append('}');
    return sb.toString();
  }
}