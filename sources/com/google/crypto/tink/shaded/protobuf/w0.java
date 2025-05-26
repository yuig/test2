package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: b, reason: collision with root package name */
    public static final t0 f33702b = new t0();

    /* renamed from: a, reason: collision with root package name */
    public final b1 f33703a;

    public w0() {
        b1 b1Var;
        b1[] b1VarArr = new b1[2];
        b1VarArr[0] = b0.f33593a;
        try {
            b1Var = (b1) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            b1Var = f33702b;
        }
        b1VarArr[1] = b1Var;
        v0 v0Var = new v0();
        v0Var.f33699a = b1VarArr;
        Charset charset = l0.f33646a;
        this.f33703a = v0Var;
    }
}
