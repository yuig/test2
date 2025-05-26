package ads_mobile_sdk;

import a.h4;
import a.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class pa1 {

    /* renamed from: a, reason: collision with root package name */
    public final a.c8 f9610a;

    public pa1(a.c8 c8Var) {
        this.f9610a = c8Var;
    }

    public final /* synthetic */ na1 a() {
        sj0 a13 = this.f9610a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (na1) a13;
    }

    public final ba0 b() {
        h4 h4Var;
        h4Var = ((na1) this.f9610a.f10110b).adNetworkInfo_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getAdNetworkInfoList(...)");
        return new ba0(unmodifiableList);
    }

    public final void a(ba0 ba0Var, ArrayList values) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.c8 c8Var = this.f9610a;
        c8Var.b();
        na1 na1Var = (na1) c8Var.f10110b;
        h4Var = na1Var.adNetworkInfo_;
        if (!((j) h4Var).f6594a) {
            na1Var.adNetworkInfo_ = e0.t.a(h4Var);
        }
        h4Var2 = na1Var.adNetworkInfo_;
        z2.a(values, h4Var2);
    }
}
