package ads_mobile_sdk;

import a.df;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pn {

    /* renamed from: a, reason: collision with root package name */
    public final df f9745a;

    public pn(df dfVar) {
        this.f9745a = dfVar;
    }

    public final /* synthetic */ xv a() {
        sj0 a13 = this.f9745a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (xv) a13;
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        df dfVar = this.f9745a;
        dfVar.b();
        xv xvVar = (xv) dfVar.f10110b;
        xvVar.getClass();
        value.getClass();
        i13 = xvVar.bitField0_;
        xvVar.bitField0_ = i13 | 1;
        xvVar.clickString_ = value;
    }
}
