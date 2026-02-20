package Singleton;

/**
 * Singleton patterni için en güvenli yöntem enum kullanmaktır. Thread safe'dir, reflection ve seriliaziation ile başka bir nesne oluşturulamaz.
 */
public enum EnumSingleton {
    INSTANCE
}