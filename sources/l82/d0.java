package l82;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class d0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u50.s[] f82216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h0 f82217b;

    public /* synthetic */ d0(u50.s[] sVarArr, h0 h0Var) {
        this.f82216a = sVarArr;
        this.f82217b = h0Var;
    }

    @Override // l82.g0
    public final void i(e resultBuilder) {
        u50.s[] events = this.f82216a;
        Intrinsics.checkNotNullParameter(events, "$events");
        h0 this$0 = this.f82217b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(resultBuilder, "resultBuilder");
        for (u50.s sVar : events) {
            this$0.a(sVar, resultBuilder);
        }
    }
}
