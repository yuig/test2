package androidx.datastore.preferences.protobuf;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: b, reason: collision with root package name */
    public static volatile t f18137b;

    /* renamed from: c, reason: collision with root package name */
    public static final t f18138c;

    /* renamed from: a, reason: collision with root package name */
    public final Map f18139a = Collections.emptyMap();

    static {
        try {
            Class.forName("androidx.datastore.preferences.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
        }
        f18138c = new t();
    }

    public static t a() {
        t tVar = f18137b;
        if (tVar == null) {
            synchronized (t.class) {
                try {
                    tVar = f18137b;
                    if (tVar == null) {
                        if (s.f18134a != null) {
                            try {
                                tVar = s.a();
                            } catch (Exception unused) {
                            }
                            f18137b = tVar;
                        }
                        tVar = f18138c;
                        f18137b = tVar;
                    }
                } finally {
                }
            }
        }
        return tVar;
    }
}
