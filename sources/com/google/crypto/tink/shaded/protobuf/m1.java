package com.google.crypto.tink.shaded.protobuf;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class m1 {

    /* renamed from: c, reason: collision with root package name */
    public static final m1 f33656c = new m1();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f33658b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final w0 f33657a = new w0();

    public static m1 a() {
        return f33656c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.crypto.tink.shaded.protobuf.g1] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.crypto.tink.shaded.protobuf.g1] */
    public final q1 b(Class cls) {
        f1 B;
        f1 f1Var;
        Class cls2;
        l0.a(cls, "messageType");
        ConcurrentHashMap concurrentHashMap = this.f33658b;
        q1 q1Var = (q1) concurrentHashMap.get(cls);
        if (q1Var != null) {
            return q1Var;
        }
        w0 w0Var = this.f33657a;
        w0Var.getClass();
        Class cls3 = r1.f33688a;
        if (!f0.class.isAssignableFrom(cls) && (cls2 = r1.f33688a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        a1 a13 = w0Var.f33703a.a(cls);
        o1 o1Var = (o1) a13;
        if ((o1Var.f33674d & 2) == 2) {
            boolean isAssignableFrom = f0.class.isAssignableFrom(cls);
            b bVar = o1Var.f33671a;
            if (isAssignableFrom) {
                f1Var = new g1(r1.f33690c, w.f33700a, bVar);
            } else {
                v1 v1Var = r1.f33689b;
                v vVar = w.f33701b;
                if (vVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                f1Var = new g1(v1Var, vVar, bVar);
            }
            B = f1Var;
        } else if (f0.class.isAssignableFrom(cls)) {
            B = u0.f33697a[o1Var.d().ordinal()] != 1 ? f1.B(a13, i1.f33634b, r0.f33687b, r1.f33690c, w.f33700a, z0.f33717b) : f1.B(a13, i1.f33634b, r0.f33687b, r1.f33690c, null, z0.f33717b);
        } else if (u0.f33697a[o1Var.d().ordinal()] != 1) {
            h1 h1Var = i1.f33633a;
            p0 p0Var = r0.f33686a;
            v1 v1Var2 = r1.f33689b;
            v vVar2 = w.f33701b;
            if (vVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            B = f1.B(a13, h1Var, p0Var, v1Var2, vVar2, z0.f33716a);
        } else {
            B = f1.B(a13, i1.f33633a, r0.f33686a, r1.f33689b, null, z0.f33716a);
        }
        q1 q1Var2 = (q1) concurrentHashMap.putIfAbsent(cls, B);
        return q1Var2 != null ? q1Var2 : B;
    }

    public final q1 c(Object obj) {
        return b(obj.getClass());
    }
}
