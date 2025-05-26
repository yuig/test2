package tq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f118938i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y f118939j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(y yVar, int i13) {
        super(0);
        this.f118938i = i13;
        this.f118939j = yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f118938i;
        y yVar = this.f118939j;
        switch (i13) {
            case 0:
                nx.d0 d0Var = yVar.f118982v;
                if (d0Var != null) {
                    return new xo0.o(d0Var, new pb0.g(), null, null, 60);
                }
                Intrinsics.r("pinalytics");
                throw null;
            case 1:
                return Boolean.valueOf(yVar.e().w() && !yVar.e().f());
            default:
                return Integer.valueOf(bs1.c.b0(yVar, eo1.c.space_1100));
        }
    }
}
