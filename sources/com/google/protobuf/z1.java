package com.google.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class z1 {

    /* renamed from: c, reason: collision with root package name */
    public static final z1 f34015c = new z1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f34017b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final g1 f34016a = new g1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.protobuf.t1] */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.google.protobuf.t1] */
    public final d2 a(Class cls) {
        s1 E;
        s1 s1Var;
        Class cls2;
        w0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f34017b;
        d2 d2Var = (d2) concurrentHashMap.get(cls);
        if (d2Var != null) {
            return d2Var;
        }
        g1 g1Var = this.f34016a;
        g1Var.getClass();
        Class cls3 = e2.f33876a;
        if (!n0.class.isAssignableFrom(cls) && (cls2 = e2.f33876a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        l1 a13 = g1Var.f33896a.a(cls);
        b2 b2Var = (b2) a13;
        if ((b2Var.f33861d & 2) == 2) {
            boolean isAssignableFrom = n0.class.isAssignableFrom(cls);
            o1 o1Var = b2Var.f33858a;
            if (isAssignableFrom) {
                s1Var = new t1(e2.f33879d, a0.f33850a, o1Var);
            } else {
                i2 C = e2.C();
                z zVar = a0.f33851b;
                if (zVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                s1Var = new t1(C, zVar, o1Var);
            }
            E = s1Var;
        } else if (n0.class.isAssignableFrom(cls)) {
            E = b2Var.d() == y1.PROTO2 ? s1.E(a13, v1.f34007b, c1.f33866b, e2.f33879d, a0.f33850a, k1.f33921b) : s1.E(a13, v1.f34007b, c1.f33866b, e2.f33879d, null, k1.f33921b);
        } else if (b2Var.d() == y1.PROTO2) {
            u1 u1Var = v1.f34006a;
            a1 a1Var = c1.f33865a;
            i2 C2 = e2.C();
            z zVar2 = a0.f33851b;
            if (zVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            E = s1.E(a13, u1Var, a1Var, C2, zVar2, k1.f33920a);
        } else {
            E = s1.E(a13, v1.f34006a, c1.f33865a, e2.D(), null, k1.f33920a);
        }
        d2 d2Var2 = (d2) concurrentHashMap.putIfAbsent(cls, E);
        return d2Var2 != null ? d2Var2 : E;
    }

    public final d2 b(Object obj) {
        return a(obj.getClass());
    }
}
