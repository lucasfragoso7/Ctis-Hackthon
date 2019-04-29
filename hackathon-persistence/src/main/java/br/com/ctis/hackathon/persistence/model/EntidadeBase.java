package br.com.ctis.hackathon.persistence.model;


import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Entidade persistente base. Todas as entidades devem herdar diretamente ou indiretamente dessa classe.
 */
@MappedSuperclass
public abstract class EntidadeBase<K > implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Retorno o identificador da entidade.
     * 
     * @return identificador
     */
    public abstract K getId();

    /*
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {

        if (this == obj) {

            return true;
        }

        if (obj == null) {

            return false;
        }

        if (getClass() != obj.getClass()) {

            return false;
        }

        EntidadeBase<?> other = (EntidadeBase<?>) obj;

        EqualsBuilder eb = new EqualsBuilder();

        eb.append(getId(), other.getId());

        return eb.isEquals();
    }

    /*
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {

        return new HashCodeBuilder().append(getId()).toHashCode();
    }

}
