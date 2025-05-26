package ap2;

import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f20332a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f20333b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f20334c;

    /* renamed from: d, reason: collision with root package name */
    public static final Object f20335d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f20336e;

    static {
        boolean z13 = false;
        try {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            Class<?> loadClass = contextClassLoader.loadClass("java.nio.file.Files");
            Class<?> loadClass2 = contextClassLoader.loadClass("java.nio.file.Path");
            Class<?> loadClass3 = contextClassLoader.loadClass("java.nio.file.attribute.FileAttribute");
            Class<?> loadClass4 = contextClassLoader.loadClass("java.nio.file.LinkOption");
            f20333b = loadClass.getMethod("isSymbolicLink", loadClass2);
            loadClass.getMethod("delete", loadClass2);
            loadClass.getMethod("readSymbolicLink", loadClass2);
            Object newInstance = Array.newInstance(loadClass3, 0);
            f20336e = newInstance;
            loadClass.getMethod("createSymbolicLink", loadClass2, loadClass2, newInstance.getClass());
            Object newInstance2 = Array.newInstance(loadClass4, 0);
            f20335d = newInstance2;
            loadClass.getMethod("exists", loadClass2, newInstance2.getClass());
            f20334c = File.class.getMethod("toPath", new Class[0]);
            loadClass2.getMethod("toFile", new Class[0]);
            z13 = true;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
        f20332a = z13;
    }
}
