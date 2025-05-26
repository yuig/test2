package com.amazonaws.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* loaded from: classes3.dex */
public enum ClassLoaderHelper {
    ;

    public static URL getResource(String str, Class<?>... clsArr) {
        return getResource(str, false, clsArr);
    }

    public static InputStream getResourceAsStream(String str, Class<?>... clsArr) {
        return getResourceAsStream(str, false, clsArr);
    }

    private static URL getResourceViaClasses(String str, Class<?>[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class<?> cls : clsArr) {
            URL resource = cls.getResource(str);
            if (resource != null) {
                return resource;
            }
        }
        return null;
    }

    private static URL getResourceViaContext(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        return contextClassLoader.getResource(str);
    }

    public static Class<?> loadClass(String str, Class<?>... clsArr) {
        return loadClass(str, true, clsArr);
    }

    private static Class<?> loadClassViaClasses(String str, Class<?>[] clsArr) {
        if (clsArr == null) {
            return null;
        }
        for (Class<?> cls : clsArr) {
            ClassLoader classLoader = cls.getClassLoader();
            if (classLoader != null) {
                try {
                    return classLoader.loadClass(str);
                } catch (ClassNotFoundException unused) {
                    continue;
                }
            }
        }
        return null;
    }

    private static Class<?> loadClassViaContext(String str) {
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader == null) {
            return null;
        }
        try {
            return contextClassLoader.loadClass(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static URL getResource(String str, boolean z13, Class<?>... clsArr) {
        URL resourceViaContext;
        if (z13) {
            resourceViaContext = getResourceViaClasses(str, clsArr);
            if (resourceViaContext == null) {
                resourceViaContext = getResourceViaContext(str);
            }
        } else {
            resourceViaContext = getResourceViaContext(str);
            if (resourceViaContext == null) {
                resourceViaContext = getResourceViaClasses(str, clsArr);
            }
        }
        return resourceViaContext == null ? ClassLoaderHelper.class.getResource(str) : resourceViaContext;
    }

    public static InputStream getResourceAsStream(String str, boolean z13, Class<?>... clsArr) {
        URL resource = getResource(str, z13, clsArr);
        if (resource == null) {
            return null;
        }
        try {
            return resource.openStream();
        } catch (IOException unused) {
            return null;
        }
    }

    public static Class<?> loadClass(String str, boolean z13, Class<?>... clsArr) {
        Class<?> loadClassViaContext;
        if (z13) {
            loadClassViaContext = loadClassViaClasses(str, clsArr);
            if (loadClassViaContext == null) {
                loadClassViaContext = loadClassViaContext(str);
            }
        } else {
            loadClassViaContext = loadClassViaContext(str);
            if (loadClassViaContext == null) {
                loadClassViaContext = loadClassViaClasses(str, clsArr);
            }
        }
        return loadClassViaContext == null ? Class.forName(str) : loadClassViaContext;
    }
}
