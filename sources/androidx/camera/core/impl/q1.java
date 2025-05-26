package androidx.camera.core.impl;

import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class q1 extends v1 implements p1 {

    /* renamed from: d, reason: collision with root package name */
    public static final u0 f16947d = u0.OPTIONAL;

    public static q1 c() {
        return new q1(new TreeMap(v1.f16978b));
    }

    public static q1 k(v0 v0Var) {
        TreeMap treeMap = new TreeMap(v1.f16978b);
        for (c cVar : v0Var.a()) {
            Set<u0> g13 = v0Var.g(cVar);
            ArrayMap arrayMap = new ArrayMap();
            for (u0 u0Var : g13) {
                arrayMap.put(u0Var, v0Var.e(cVar, u0Var));
            }
            treeMap.put(cVar, arrayMap);
        }
        return new q1(treeMap);
    }

    public final void q(c cVar, u0 u0Var, Object obj) {
        u0 u0Var2;
        TreeMap treeMap = this.f16980a;
        Map map = (Map) treeMap.get(cVar);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put(cVar, arrayMap);
            arrayMap.put(u0Var, obj);
            return;
        }
        u0 u0Var3 = (u0) Collections.min(map.keySet());
        if (Objects.equals(map.get(u0Var3), obj) || u0Var3 != (u0Var2 = u0.REQUIRED) || u0Var != u0Var2) {
            map.put(u0Var, obj);
            return;
        }
        throw new IllegalArgumentException("Option values conflicts: " + cVar.f16809a + ", existing value (" + u0Var3 + ")=" + map.get(u0Var3) + ", conflicting (" + u0Var + ")=" + obj);
    }

    public final void s(c cVar, Object obj) {
        q(cVar, f16947d, obj);
    }
}
