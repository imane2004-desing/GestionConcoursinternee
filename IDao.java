/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author hp
 */
public class IDao {
    boolean create(T obj);
    T read(int id);
    boolean update(T obj);
    boolean delete(int id);
    List<T> getAll();
}
