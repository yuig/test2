package ek1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f59318i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ g0 f59319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(g0 g0Var, int i13) {
        super(1);
        this.f59318i = i13;
        this.f59319j = g0Var;
    }

    public final r1 b(r1 state) {
        int i13 = this.f59318i;
        g0 g0Var = this.f59319j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(state, "state");
                return r1.b(state, null, null, 0, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, !((d0) g0Var).f59226a, false, false, null, null, false, null, false, false, false, -1, 4193279);
            case 1:
                Intrinsics.checkNotNullParameter(state, "it");
                return r1.b(state, null, null, ((w) g0Var).f59387a, null, null, null, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -65, 4194303);
            default:
                Intrinsics.checkNotNullParameter(state, "it");
                return r1.b(state, null, null, 0, null, null, ((z) g0Var).f59400a, false, false, null, 0, null, null, false, false, null, false, false, null, null, false, false, false, false, null, null, false, false, false, null, null, false, null, false, false, false, -513, 4194303);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f59318i) {
        }
        return b((r1) obj);
    }
}
