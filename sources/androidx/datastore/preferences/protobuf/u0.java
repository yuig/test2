package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class u0 {

    /* renamed from: b, reason: collision with root package name */
    public static final s0 f18144b = new s0();

    /* renamed from: a, reason: collision with root package name */
    public final a1 f18145a;

    public u0() {
        a1 a1Var;
        a1[] a1VarArr = new a1[2];
        a1VarArr[0] = c0.f18036a;
        try {
            a1Var = (a1) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            a1Var = f18144b;
        }
        a1VarArr[1] = a1Var;
        t0 t0Var = new t0();
        t0Var.f18140a = a1VarArr;
        Charset charset = j0.f18080a;
        this.f18145a = t0Var;
    }
}
