package jn0;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rg0.m0;

/* loaded from: classes5.dex */
public final class h extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f77093i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m0 f77094j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(m0 m0Var, int i13) {
        super(1);
        this.f77093i = i13;
        this.f77094j = m0Var;
    }

    public final yl1.b b(yl1.b it) {
        int i13 = this.f77093i;
        m0 m0Var = this.f77094j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(m0Var.f108056d), false, null, null, null, null, null, null, 0, null, 1022);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return yl1.b.f(it, bs1.c.p2(m0Var.f108055c), false, null, null, null, null, null, null, 0, null, 1022);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f77093i) {
        }
        return b((yl1.b) obj);
    }
}
