package com.google.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: b, reason: collision with root package name */
    public static final e1 f33895b = new e1();

    /* renamed from: a, reason: collision with root package name */
    public final m1 f33896a;

    public g1() {
        m1 m1Var;
        m1[] m1VarArr = new m1[2];
        m1VarArr[0] = h0.f33901a;
        try {
            m1Var = (m1) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            m1Var = f33895b;
        }
        m1VarArr[1] = m1Var;
        f1 f1Var = new f1();
        f1Var.f33884a = m1VarArr;
        Charset charset = w0.f34008a;
        this.f33896a = f1Var;
    }
}
