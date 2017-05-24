package com.example.caching.persistence.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.caching.entity.User;
import com.example.caching.persistence.IUserPersistence;

@Repository
@Transactional
public class UserPersistenceImpl implements IUserPersistence {

    @PersistenceContext
    private EntityManager entityManager;

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Long createNewUser(User pUser) {

        getEntityManager().persist(pUser);
        return pUser.getIdUser();
    }

    @Override
    public List<User> listUser() {
        final String queryString = "select model from " + User.class.getName() + " model";
        final Query query = getEntityManager().createQuery(queryString);
        query.setHint("org.hibernate.cacheable", Boolean.TRUE);

        final List resultList = query.getResultList();
        final List<User> vList = resultList;
        System.out.println("size list of users " + vList.size());
        return vList;
    }

}
