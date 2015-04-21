package cqrs.replay;

import java.util.List;
import java.util.Map;
import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.metamodel.Metamodel;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class ProjectionsEntityManager implements EntityManager
{
    @PersistenceContext
    EntityManager em;

    @Override
    @Transactional
    public void persist(Object o)
    {
        this.em.persist(o);
    }

    @Override
    @Transactional
    public <T> T merge(T t)
    {
        return this.em.merge(t);
    }

    @Override
    @Transactional
    public void remove(Object o)
    {
        this.em.remove(o);
    }

    @Override
    @Transactional
    public <T> T find(Class<T> tClass, Object o)
    {
        return this.em.find(tClass, o);
    }

    @Override
    @Transactional
    public <T> T getReference(Class<T> tClass, Object o)
    {
        return this.em.getReference(tClass, o);
    }

    @Override
    @Transactional
    public void flush()
    {
        this.em.flush();
    }

    @Override
    @Transactional
    public void setFlushMode(FlushModeType flushModeType)
    {
        this.em.setFlushMode(flushModeType);
    }

    @Override
    @Transactional
    public FlushModeType getFlushMode()
    {
        return this.em.getFlushMode();
    }

    @Override
    @Transactional
    public void lock(Object o, LockModeType lockModeType)
    {
        this.em.lock(o, lockModeType);
    }

    @Override
    @Transactional
    public void refresh(Object o)
    {
        this.em.refresh(o);
    }

    @Override
    @Transactional
    public void clear()
    {
        this.em.clear();
    }

    @Override
    @Transactional
    public boolean contains(Object o)
    {
        return this.em.contains(o);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Query createQuery(String s)
    {
        return this.em.createQuery(s);
    }

    @Override
    @Transactional
    public Query createNamedQuery(String s)
    {
        return this.em.createNamedQuery(s);
    }

    @Override
    @Transactional
    public Query createNativeQuery(String s)
    {
        return this.em.createNativeQuery(s);
    }

    @Override
    @Transactional
    public Query createNativeQuery(String s, Class aClass)
    {
        return this.em.createNativeQuery(s, aClass);
    }

    @Override
    @Transactional
    public Query createNativeQuery(String s, String s2)
    {
        return this.em.createNativeQuery(s, s2);
    }

    @Override
    public StoredProcedureQuery createNamedStoredProcedureQuery(String name) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String procedureName) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String procedureName, Class... resultClasses) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public StoredProcedureQuery createStoredProcedureQuery(String procedureName, String... resultSetMappings) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    @Transactional
    public void joinTransaction()
    {
        this.em.joinTransaction();
    }

    @Override
    public boolean isJoinedToTransaction() {
        throw new IllegalStateException("not implemented");
    }

    @Override
    @Transactional
    public Object getDelegate()
    {
        return this.em.getDelegate();
    }

    @Override
    @Transactional
    public void close()
    {
        this.em.close();
    }

    @Override
    @Transactional
    public boolean isOpen()
    {
        return this.em.isOpen();
    }

    @Override
    @Transactional
    public EntityTransaction getTransaction()
    {
        return this.em.getTransaction();
    }

    @Override
    public <T> T find(Class<T> entityClass, Object primaryKey, Map<String, Object> properties)
    {
        return em.find(entityClass,primaryKey,properties);
    }

    @Override
    public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode)
    {
        return em.find(entityClass,primaryKey,lockMode);
    }

    @Override
    public <T> T find(Class<T> entityClass, Object primaryKey, LockModeType lockMode, Map<String, Object> properties)
    {
        return em.find(entityClass,primaryKey,lockMode,properties);
    }

    @Override
    public void lock(Object entity, LockModeType lockMode, Map<String, Object> properties)
    {
        em.lock(entity,lockMode,properties);
    }

    @Override
    public void refresh(Object entity, Map<String, Object> properties)
    {
        em.refresh(entity,properties);
    }

    @Override
    public void refresh(Object entity, LockModeType lockMode)
    {
        em.refresh(entity,lockMode);
    }

    @Override
    public void refresh(Object entity, LockModeType lockMode, Map<String, Object> properties)
    {
        em.refresh(entity,lockMode,properties);
    }

    @Override
    public void detach(Object entity)
    {
        em.detach(entity);
    }

    @Override
    public LockModeType getLockMode(Object entity)
    {
        return em.getLockMode(entity);
    }

    @Override
    public void setProperty(String propertyName, Object value)
    {
        em.setProperty(propertyName, value);
    }

    @Override
    public Map<String, Object> getProperties()
    {
        return em.getProperties();
    }

    @Override
    public <T> TypedQuery<T> createQuery(CriteriaQuery<T> criteriaQuery)
    {
        return em.createQuery(criteriaQuery);
    }

    @Override
    public Query createQuery(CriteriaUpdate updateQuery) {
        return em.createQuery(updateQuery);
    }

    @Override
    public Query createQuery(CriteriaDelete deleteQuery) {
        return em.createQuery(deleteQuery);
    }

    @Override
    public <T> TypedQuery<T> createQuery(String qlString, Class<T> resultClass)
    {
        return em.createQuery(qlString, resultClass);
    }

    @Override
    public <T> TypedQuery<T> createNamedQuery(String name, Class<T> resultClass)
    {
        return em.createNamedQuery(name, resultClass);
    }

    @Override
    public <T> T unwrap(Class<T> cls)
    {
        return em.unwrap(cls);
    }

    @Override
    public EntityManagerFactory getEntityManagerFactory()
    {
        return em.getEntityManagerFactory();
    }

    @Override
    public CriteriaBuilder getCriteriaBuilder()
    {
        return em.getCriteriaBuilder();
    }

    @Override
    public Metamodel getMetamodel()
    {
        return em.getMetamodel();
    }

    @Override
    public <T> EntityGraph<T> createEntityGraph(Class<T> rootType) {
        throw new IllegalStateException("not implemented");
    }

    @Override
    public EntityGraph<?> createEntityGraph(String graphName) {
        return this.em.createEntityGraph(graphName);
    }

    @Override
    public EntityGraph<?> getEntityGraph(String graphName) {
        return this.em.getEntityGraph(graphName);
    }

    @Override
    public <T> List<EntityGraph<? super T>> getEntityGraphs(Class<T> entityClass) {
        return this.em.getEntityGraphs(entityClass);
    }
}