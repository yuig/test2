package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class j7 {

    /* renamed from: c, reason: collision with root package name */
    public static final j7 f31480c = new j7();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f31482b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final q6 f31481a = new q6();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [com.google.android.gms.internal.measurement.e7] */
    /* JADX WARN: Type inference failed for: r4v9, types: [com.google.android.gms.internal.measurement.e7] */
    public final n7 a(Class cls) {
        c7 i13;
        c7 c7Var;
        Class cls2;
        Charset charset = c6.f31325a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f31482b;
        n7 n7Var = (n7) concurrentHashMap.get(cls);
        if (n7Var != null) {
            return n7Var;
        }
        q6 q6Var = this.f31481a;
        q6Var.getClass();
        Class cls3 = o7.f31571a;
        if (!a6.class.isAssignableFrom(cls) && (cls2 = o7.f31571a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        y6 zza = q6Var.f31603a.zza(cls);
        l7 l7Var = (l7) zza;
        if ((l7Var.f31510d & 2) == 2) {
            boolean isAssignableFrom = a6.class.isAssignableFrom(cls);
            a7 a7Var = l7Var.f31507a;
            if (isAssignableFrom) {
                c7Var = new e7(o7.f31573c, s5.f31635a, a7Var);
            } else {
                t7 t7Var = o7.f31572b;
                t5 t5Var = s5.f31636b;
                if (t5Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                c7Var = new e7(t7Var, t5Var, a7Var);
            }
            i13 = c7Var;
        } else if (a6.class.isAssignableFrom(cls)) {
            i13 = s6.f31637a[l7Var.b().ordinal()] != 1 ? c7.i(zza, f7.f31391b, o6.f31570b, o7.f31573c, s5.f31635a, z6.f31720b) : c7.i(zza, f7.f31391b, o6.f31570b, o7.f31573c, null, z6.f31720b);
        } else if (s6.f31637a[l7Var.b().ordinal()] != 1) {
            g7 g7Var = f7.f31390a;
            n6 n6Var = o6.f31569a;
            t7 t7Var2 = o7.f31572b;
            t5 t5Var2 = s5.f31636b;
            if (t5Var2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            i13 = c7.i(zza, g7Var, n6Var, t7Var2, t5Var2, z6.f31719a);
        } else {
            i13 = c7.i(zza, f7.f31390a, o6.f31569a, o7.f31572b, null, z6.f31719a);
        }
        n7 n7Var2 = (n7) concurrentHashMap.putIfAbsent(cls, i13);
        return n7Var2 != null ? n7Var2 : i13;
    }
}
