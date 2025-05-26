package l82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final /* synthetic */ class f0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h0 f82223a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u50.s f82224b;

    public /* synthetic */ f0(h0 h0Var, u50.s sVar) {
        this.f82223a = h0Var;
        this.f82224b = sVar;
    }

    @Override // l82.g0
    public final void i(e resultBuilder) {
        h0 this$0 = this.f82223a;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        u50.s event = this.f82224b;
        Intrinsics.checkNotNullParameter(event, "$event");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        this$0.a(event, resultBuilder);
    }
}
