package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f31814c = new z0();

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f31816b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final k0 f31815a = new k0();

    public static z0 a() {
        return f31814c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [com.google.android.gms.internal.recaptcha.s0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [com.google.android.gms.internal.recaptcha.s0] */
    public final a1 b(Object obj) {
        t0 d2;
        t0 t0Var;
        Class cls;
        Class<?> cls2 = obj.getClass();
        Charset charset = d0.f31745a;
        ConcurrentHashMap concurrentHashMap = this.f31816b;
        a1 a1Var = (a1) concurrentHashMap.get(cls2);
        if (a1Var != null) {
            return a1Var;
        }
        k0 k0Var = this.f31815a;
        k0Var.getClass();
        Class cls3 = b1.f31735a;
        if (!b0.class.isAssignableFrom(cls2) && (cls = b1.f31735a) != null && !cls.isAssignableFrom(cls2)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        q0 zzb = k0Var.f31766a.zzb(cls2);
        y0 y0Var = (y0) zzb;
        if ((y0Var.f31810d & 2) == 2) {
            if (b0.class.isAssignableFrom(cls2)) {
                t0Var = new s0(b1.f31738d, x.f31805a);
            } else {
                e1 e1Var = b1.f31736b;
                w wVar = x.f31806b;
                if (wVar == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                t0Var = new s0(e1Var, wVar);
            }
            d2 = t0Var;
        } else if (b0.class.isAssignableFrom(cls2)) {
            if (y0Var.a() == 1) {
                int i13 = u0.f31801a;
                d2 = t0.d(zzb, h0.f31754b, b1.f31738d, x.f31805a, n0.f31773b);
            } else {
                int i14 = u0.f31801a;
                d2 = t0.d(zzb, h0.f31754b, b1.f31738d, null, n0.f31773b);
            }
        } else if (y0Var.a() == 1) {
            int i15 = u0.f31801a;
            j0 j0Var = h0.f31753a;
            e1 e1Var2 = b1.f31736b;
            w wVar2 = x.f31806b;
            if (wVar2 == null) {
                throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
            }
            d2 = t0.d(zzb, j0Var, e1Var2, wVar2, n0.f31772a);
        } else {
            int i16 = u0.f31801a;
            d2 = t0.d(zzb, h0.f31753a, b1.f31737c, null, n0.f31772a);
        }
        a1 a1Var2 = (a1) concurrentHashMap.putIfAbsent(cls2, d2);
        return a1Var2 != null ? a1Var2 : d2;
    }
}
