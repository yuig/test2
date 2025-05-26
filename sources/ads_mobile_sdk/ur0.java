package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ur0 implements a.ca {

    /* renamed from: a, reason: collision with root package name */
    public final a.o8 f12164a;

    /* renamed from: b, reason: collision with root package name */
    public final a.o8 f12165b;

    public ur0(a.o8 o8Var, q70 q70Var) {
        this.f12164a = o8Var;
        this.f12165b = q70Var;
    }

    @Override // a.v7
    public final Object get() {
        a.a5 javascriptEngine = (a.a5) this.f12164a.get();
        zr consentManager = (zr) this.f12165b.get();
        Intrinsics.checkNotNullParameter(javascriptEngine, "javascriptEngine");
        Intrinsics.checkNotNullParameter(consentManager, "consentManager");
        return new qr0(javascriptEngine, consentManager);
    }
}
