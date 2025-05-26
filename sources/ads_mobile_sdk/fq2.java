package ads_mobile_sdk;

import a.h4;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class fq2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.s1 f5241a;

    public fq2(a.s1 s1Var) {
        this.f5241a = s1Var;
    }

    public final /* synthetic */ tk a() {
        sj0 a13 = this.f5241a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (tk) a13;
    }

    public final ba0 b() {
        h4 h4Var;
        h4Var = ((tk) this.f5241a.f10110b).thirdPartySdk_;
        List unmodifiableList = Collections.unmodifiableList(h4Var);
        Intrinsics.checkNotNullExpressionValue(unmodifiableList, "getThirdPartySdkList(...)");
        return new ba0(unmodifiableList);
    }

    public final void a(ba0 ba0Var, sk value) {
        h4 h4Var;
        h4 h4Var2;
        Intrinsics.checkNotNullParameter(ba0Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        a.s1 s1Var = this.f5241a;
        s1Var.b();
        tk tkVar = (tk) s1Var.f10110b;
        tkVar.getClass();
        h4Var = tkVar.thirdPartySdk_;
        if (!((j) h4Var).f6594a) {
            tkVar.thirdPartySdk_ = e0.t.a(h4Var);
        }
        h4Var2 = tkVar.thirdPartySdk_;
        h4Var2.add(value);
    }
}
