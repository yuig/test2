package androidx.datastore.preferences.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: c */
    public static final j1 f18082c = new j1();

    /* renamed from: b */
    public final ConcurrentHashMap f18084b = new ConcurrentHashMap();

    /* renamed from: a */
    public final u0 f18083a = new u0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.datastore.preferences.protobuf.d1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.datastore.preferences.protobuf.d1] */
    public final n1 a(Class cls) {
        c1 x13;
        c1 c1Var;
        Class cls2;
        j0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f18084b;
        n1 n1Var = (n1) concurrentHashMap.get(cls);
        if (n1Var != null) {
            return n1Var;
        }
        u0 u0Var = this.f18083a;
        u0Var.getClass();
        Class cls3 = o1.f18114a;
        if (!g0.class.isAssignableFrom(cls) && (cls2 = o1.f18114a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        z0 a13 = u0Var.f18145a.a(cls);
        l1 l1Var = (l1) a13;
        if ((l1Var.f18102d & 2) == 2) {
            boolean isAssignableFrom = g0.class.isAssignableFrom(cls);
            b bVar = l1Var.f18099a;
            if (isAssignableFrom) {
                c1Var = new d1(o1.f18117d, v.f18151a, bVar);
            } else {
                w1 C = o1.C();
                u uVar = v.f18152b;
                if (uVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c1Var = new d1(C, uVar, bVar);
            }
            x13 = c1Var;
        } else if (g0.class.isAssignableFrom(cls)) {
            x13 = l1Var.d() == i1.PROTO2 ? c1.x(a13, f1.f18065b, q0.f18133b, o1.f18117d, v.f18151a, y0.f18174b) : c1.x(a13, f1.f18065b, q0.f18133b, o1.f18117d, null, y0.f18174b);
        } else if (l1Var.d() == i1.PROTO2) {
            e1 e1Var = f1.f18064a;
            o0 o0Var = q0.f18132a;
            w1 C2 = o1.C();
            u uVar2 = v.f18152b;
            if (uVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            x13 = c1.x(a13, e1Var, o0Var, C2, uVar2, y0.f18173a);
        } else {
            x13 = c1.x(a13, f1.f18064a, q0.f18132a, o1.D(), null, y0.f18173a);
        }
        n1 n1Var2 = (n1) concurrentHashMap.putIfAbsent(cls, x13);
        return n1Var2 != null ? n1Var2 : x13;
    }
}
