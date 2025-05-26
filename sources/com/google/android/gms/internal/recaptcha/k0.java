package com.google.android.gms.internal.recaptcha;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class k0 {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f31765b = new m0();

    /* renamed from: a, reason: collision with root package name */
    public final p0 f31766a;

    public k0() {
        p0 p0Var;
        p0[] p0VarArr = new p0[2];
        p0VarArr[0] = c0.f31740a;
        try {
            p0Var = (p0) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            p0Var = f31765b;
        }
        p0VarArr[1] = p0Var;
        l0 l0Var = new l0();
        l0Var.f31768a = p0VarArr;
        Charset charset = d0.f31745a;
        this.f31766a = l0Var;
    }
}
