package pd2;

import a.cb;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class q0 {

    /* renamed from: a */
    public final TreeMap f99868a;

    /* renamed from: b */
    public final LinkedHashMap f99869b;

    public q0(Map spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        Intrinsics.checkNotNullParameter(spec, "<this>");
        this.f99868a = new TreeMap(spec);
        this.f99869b = new LinkedHashMap();
    }

    public final Set a() {
        Set keySet = this.f99868a.keySet();
        Intrinsics.checkNotNullExpressionValue(keySet, "<get-keys>(...)");
        return keySet;
    }

    public void b(String paramName, p0 newValue) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Class<?> cls = d(paramName).getClass();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        rl2.d b13 = l0Var.b(cls);
        rl2.d b14 = l0Var.b(newValue.getClass());
        if (!Intrinsics.d(b13, b14)) {
            throw new IllegalArgumentException(kotlin.text.t.b("\n                Can't set value `" + newValue + "` of type `" + b14.f() + "`\n                to parameter `" + paramName + "`, which has a type `" + b13.f() + "`\n            ").toString());
        }
        Object obj = this.f99868a.get(paramName);
        Intrinsics.f(obj);
        qd2.c b15 = ((u) obj).b();
        if (b15 == null || b15.a(newValue)) {
            this.f99869b.put(paramName, newValue);
            return;
        }
        throw new IllegalArgumentException(kotlin.text.t.b("\n                Can't set value `" + newValue + "` to parameter `" + paramName + "`.\n                Value is not within param limits: `" + b15 + "`\n            ").toString());
    }

    public final void c(LinkedHashMap values) {
        Intrinsics.checkNotNullParameter(values, "values");
        for (Map.Entry entry : values.entrySet()) {
            b((String) entry.getKey(), (p0) entry.getValue());
        }
    }

    public final p0 d(String paramName) {
        Intrinsics.checkNotNullParameter(paramName, "paramName");
        TreeMap treeMap = this.f99868a;
        if (!treeMap.containsKey(paramName)) {
            StringBuilder o13 = cb.o("\n                Unknown parameter '", paramName, "'.\n                Available parameters in settings: ");
            o13.append(treeMap.keySet());
            o13.append("\n            ");
            throw new IllegalArgumentException(kotlin.text.t.b(o13.toString()).toString());
        }
        p0 p0Var = (p0) this.f99869b.get(paramName);
        if (p0Var != null) {
            return p0Var;
        }
        Object obj = treeMap.get(paramName);
        Intrinsics.f(obj);
        return ((u) obj).a();
    }

    public final LinkedHashMap e() {
        TreeMap treeMap = this.f99868a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(y0.a(treeMap.size()));
        for (Map.Entry entry : treeMap.entrySet()) {
            Object key = entry.getKey();
            p0 p0Var = (p0) this.f99869b.get(entry.getKey());
            if (p0Var == null) {
                p0Var = ((u) entry.getValue()).a();
            }
            linkedHashMap.put(key, p0Var);
        }
        return linkedHashMap;
    }

    public /* synthetic */ q0() {
        this(z0.d());
    }
}
