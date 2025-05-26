package ads_mobile_sdk;

import a.h4;
import a.z2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class p5 {

    /* renamed from: a, reason: collision with root package name */
    public final a.y7 f9557a;

    public p5(a.y7 y7Var) {
        this.f9557a = y7Var;
    }

    public final /* synthetic */ n5 a() {
        sj0 a13 = this.f9557a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (n5) a13;
    }

    public final void b(ba0 ba0Var, ArrayList values) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.y7 y7Var = this.f9557a;
        y7Var.b();
        n5 n5Var = (n5) y7Var.f10110b;
        h4Var = n5Var.includingRegexes_;
        if (!((j) h4Var).f6594a) {
            n5Var.includingRegexes_ = e0.t.a(h4Var);
        }
        h4Var2 = n5Var.includingRegexes_;
        z2.a(values, h4Var2);
    }

    public final ba0 c() {
        h4 h4Var;
        h4Var = ((n5) this.f9557a.f10110b).includingRegexes_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getIncludingRegexesList(...)");
        return new ba0(unmodifiableList);
    }

    public final void a(ba0 ba0Var, ArrayList values) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(values, "values");
        a.y7 y7Var = this.f9557a;
        y7Var.b();
        n5 n5Var = (n5) y7Var.f10110b;
        h4Var = n5Var.excludingRegexes_;
        if (!((j) h4Var).f6594a) {
            n5Var.excludingRegexes_ = e0.t.a(h4Var);
        }
        h4Var2 = n5Var.excludingRegexes_;
        z2.a(values, h4Var2);
    }

    public final ba0 b() {
        h4 h4Var;
        h4Var = ((n5) this.f9557a.f10110b).excludingRegexes_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getExcludingRegexesList(...)");
        return new ba0(unmodifiableList);
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.y7 y7Var = this.f9557a;
        y7Var.b();
        n5 n5Var = (n5) y7Var.f10110b;
        n5Var.getClass();
        value.getClass();
        i13 = n5Var.bitField0_;
        n5Var.bitField0_ = i13 | 1;
        n5Var.effectiveAdUnitId_ = value;
    }
}
