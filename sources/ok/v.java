package ok;

import java.io.Serializable;

/* loaded from: classes3.dex */
public abstract class v implements Serializable {
    public static v a(Object obj) {
        return obj == null ? a.f95409a : new y(obj);
    }

    public static y d(String str) {
        str.getClass();
        return new y(str);
    }

    public abstract Object b();

    public abstract boolean c();
}
