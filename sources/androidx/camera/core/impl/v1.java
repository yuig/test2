package androidx.camera.core.impl;

import a.o3;
import android.util.ArrayMap;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class v1 implements v0 {

    /* renamed from: b */
    public static final v.j2 f16978b;

    /* renamed from: c */
    public static final v1 f16979c;

    /* renamed from: a */
    public final TreeMap f16980a;

    static {
        v.j2 j2Var = new v.j2(1);
        f16978b = j2Var;
        f16979c = new v1(new TreeMap(j2Var));
    }

    public v1(TreeMap treeMap) {
        this.f16980a = treeMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static v1 b(p1 p1Var) {
        if (v1.class.equals(p1Var.getClass())) {
            return (v1) p1Var;
        }
        TreeMap treeMap = new TreeMap(f16978b);
        v1 v1Var = (v1) p1Var;
        for (c cVar : v1Var.a()) {
            Set<u0> g13 = v1Var.g(cVar);
            ArrayMap arrayMap = new ArrayMap();
            for (u0 u0Var : g13) {
                arrayMap.put(u0Var, v1Var.e(cVar, u0Var));
            }
            treeMap.put(cVar, arrayMap);
        }
        return new v1(treeMap);
    }

    @Override // androidx.camera.core.impl.v0
    public final Set a() {
        return Collections.unmodifiableSet(this.f16980a.keySet());
    }

    @Override // androidx.camera.core.impl.v0
    public final boolean d(c cVar) {
        return this.f16980a.containsKey(cVar);
    }

    @Override // androidx.camera.core.impl.v0
    public final Object e(c cVar, u0 u0Var) {
        Map map = (Map) this.f16980a.get(cVar);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + cVar);
        }
        if (map.containsKey(u0Var)) {
            return map.get(u0Var);
        }
        throw new IllegalArgumentException("Option does not exist: " + cVar + " with priority=" + u0Var);
    }

    @Override // androidx.camera.core.impl.v0
    public final Object f(c cVar) {
        Map map = (Map) this.f16980a.get(cVar);
        if (map != null) {
            return map.get((u0) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + cVar);
    }

    @Override // androidx.camera.core.impl.v0
    public final Set g(c cVar) {
        Map map = (Map) this.f16980a.get(cVar);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.v0
    public final void h(o3 o3Var) {
        for (Map.Entry entry : this.f16980a.tailMap(new c(Void.class, null, "camera2.captureRequest.option.")).entrySet()) {
            if (!((c) entry.getKey()).f16809a.startsWith("camera2.captureRequest.option.")) {
                return;
            }
            c cVar = (c) entry.getKey();
            u.a aVar = (u.a) o3Var.f130b;
            v0 v0Var = (v0) o3Var.f131c;
            aVar.f119717b.q(cVar, v0Var.i(cVar), v0Var.f(cVar));
        }
    }

    @Override // androidx.camera.core.impl.v0
    public final u0 i(c cVar) {
        Map map = (Map) this.f16980a.get(cVar);
        if (map != null) {
            return (u0) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + cVar);
    }

    @Override // androidx.camera.core.impl.v0
    public final Object j(c cVar, Object obj) {
        try {
            return f(cVar);
        } catch (IllegalArgumentException unused) {
            return obj;
        }
    }
}
