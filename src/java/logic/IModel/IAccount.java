/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.IModel;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Александр
 */
public interface IAccount {

    /**
     * Создание учетной записи
     * @param login String Строка с логином, не более 20 символ
     * @param password String Строка с паролем, не более 20 символ
     * @param name String Строка с именем, не более 50 символ
     * @param roleId Integer Идентификатор роли
     * @param priority Integer Приоритет
     * @param email String E-Mail адрес, не более 32 символ
     * @return Boolean
     * @throws SQLException
     *
     * Добавлен Андреем 21.05.2011 19:52
     */
    boolean add(String login, String password, String name, int roleId, String email);

    String autorize(String login, String paswd);

    /**
     * Удаление учетной записи
     * @param id Integer  Идентификатор записи
     * @return Boolean
     * @throws SQLException
     *
     * Добавлен Андреем 21.05.2011 19:52
     */
    boolean deleteById(int id);

    /**
     * Возвращает существующих пользователей
     * @return ArrayList<HashMap>
     */
    ArrayList<HashMap> getAll();

    /**
     * Возвращает учетную запись пользователя по имени и роли
     * @param name String Строка с именем, не более 50 символ
     * @param role String Строка с названием роли, не более 20 символ
     * @return ArrayList
     *
     * Добавлен Андреем 22.05.2011 12:05
     */
    ArrayList<HashMap> getByNameAndRole(String name, String role);

    /**
     * Получение приоритета пользователя
     *
     * @return int возвращает приоритет пользователя. (адекватно работает после вызова функции авторизаци
     * @see checkAccount)
     * в случаее ошибки возвращает -1
     * Добавил Александр 18.05.2011 20:16
     */
    int getPriority();

    /**
     * Получение приоритета пользователя
     *
     * @return int возвращает приоритет пользователя, который зарегестрирован под указанным логином.
     * в случаее ошибки возвращает -1
     * Добавил Александр 18.05.2011 20:16
     */
    int getPriority(String login);

    int getPriority(int id);

    /**
     * Проверяет на уникальность логинв
     * @param String login
     * @return boolean
     */
    boolean isUnique(String login);

    /**
     * Редактирование учетной записи
     * @param id Integer Идентификатор записи
     * @param login String Строка с логином, не более 20 символ
     * @param password String Строка с паролем, не более 20 символ
     * @param name String Строка с именем, не более 50 символ
     * @param roleId Integer Идентификатор роли
     * @param priority Integer Приоритет
     * @param email String E-Mail адрес, не более 32 символ
     * @return Boolean
     * @throws SQLException
     *
     * Добавлен Андреем 21.05.2011 19:52
     */
    public boolean setById(int id, String login, String password, String name, int roleId,  String email);

    public HashMap getInfo(String login);
}
