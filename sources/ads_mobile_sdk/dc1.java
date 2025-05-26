package ads_mobile_sdk;

import a.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class dc1 {

    /* renamed from: a, reason: collision with root package name */
    public final n f4230a;

    public dc1(n nVar) {
        this.f4230a = nVar;
    }

    public final /* synthetic */ bc1 a() {
        sj0 a13 = this.f4230a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (bc1) a13;
    }

    public final void a(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        n nVar = this.f4230a;
        nVar.b();
        bc1 bc1Var = (bc1) nVar.f10110b;
        bc1Var.getClass();
        bc1Var.action_ = value;
    }
}
