package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class q6 {

    /* renamed from: b, reason: collision with root package name */
    public static final u6 f31602b = new u6();

    /* renamed from: a, reason: collision with root package name */
    public final b7 f31603a;

    public q6() {
        b7 b7Var;
        b7[] b7VarArr = new b7[2];
        b7VarArr[0] = b6.f31305a;
        try {
            b7Var = (b7) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            b7Var = f31602b;
        }
        b7VarArr[1] = b7Var;
        v6 v6Var = new v6();
        v6Var.f31673a = b7VarArr;
        Charset charset = c6.f31325a;
        this.f31603a = v6Var;
    }
}
