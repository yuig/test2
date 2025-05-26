package xh2;

import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Type;

/* loaded from: classes4.dex */
public interface d {
    Object a(InputStream inputStream, Type type);

    String b(Object obj, Type type);

    String c(Class cls, Object obj);

    String d(Object obj);

    void e(Object obj, Type type, OutputStream outputStream);

    Object f(Class cls, String str);

    Object g(InputStream inputStream, Class cls);

    void h(Object obj, Class cls, OutputStream outputStream);
}
