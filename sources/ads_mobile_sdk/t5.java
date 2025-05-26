package ads_mobile_sdk;

import a.h4;
import a.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t5 {

    /* renamed from: a, reason: collision with root package name */
    public final a.la f11403a;

    public t5(a.la laVar) {
        this.f11403a = laVar;
    }

    public final /* synthetic */ r5 a() {
        sj0 a13 = this.f11403a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (r5) a13;
    }

    public final ba0 b() {
        h4 h4Var;
        h4Var = ((r5) this.f11403a.f10110b).adUnitPatterns_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getAdUnitPatternsList(...)");
        return new ba0(unmodifiableList);
    }

    public final void a(ba0 ba0Var, ArrayList values) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.la laVar = this.f11403a;
        laVar.b();
        r5 r5Var = (r5) laVar.f10110b;
        h4Var = r5Var.adUnitPatterns_;
        if (!((j) h4Var).f6594a) {
            r5Var.adUnitPatterns_ = e0.t.a(h4Var);
        }
        h4Var2 = r5Var.adUnitPatterns_;
        z2.a(values, h4Var2);
    }
}
