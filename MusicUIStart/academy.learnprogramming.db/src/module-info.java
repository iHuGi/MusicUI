module academy.learnprogramming.db {
    requires java.sql;
    requires org.xerial.sqlitejdbc;
    requires transitive academy.learnprogramming.common;

    exports academy.learnprogramming.db;
}