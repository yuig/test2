package androidx.datastore.preferences.protobuf;

import a.cb;
import java.util.Map;

/* loaded from: classes.dex */
public final class x0 {
    public static int a(int i13, Object obj, Object obj2) {
        w0 w0Var = (w0) obj;
        v0 v0Var = (v0) obj2;
        int i14 = 0;
        if (!w0Var.isEmpty()) {
            for (Map.Entry entry : w0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                v0Var.getClass();
                int D = q.D(i13);
                int a13 = v0.a(v0Var.f18153a, key, value);
                i14 = cb.A(a13, a13, D, i14);
            }
        }
        return i14;
    }
}
