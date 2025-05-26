package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class jq2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.o9 f6926a;

    public jq2(a.o9 o9Var) {
        this.f6926a = o9Var;
    }

    public final /* synthetic */ pk a() {
        sj0 a13 = this.f6926a.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return (pk) a13;
    }

    public final void a(String value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.o9 o9Var = this.f6926a;
        o9Var.b();
        pk pkVar = (pk) o9Var.f10110b;
        pkVar.getClass();
        value.getClass();
        i13 = pkVar.bitField0_;
        pkVar.bitField0_ = i13 | 2;
        pkVar.errorDescription_ = value;
    }

    public final void a(fk value) {
        int i13;
        Intrinsics.checkNotNullParameter(value, "value");
        a.o9 o9Var = this.f6926a;
        o9Var.b();
        pk pkVar = (pk) o9Var.f10110b;
        pkVar.getClass();
        pkVar.errorType_ = value.f5188a;
        i13 = pkVar.bitField0_;
        pkVar.bitField0_ = i13 | 1;
    }
}
