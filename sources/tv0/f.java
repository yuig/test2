package tv0;

import h32.g0;
import h32.u0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import lh0.s1;

/* loaded from: classes5.dex */
public final class f extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f119521i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h f119522j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(h hVar, int i13) {
        super(0);
        this.f119521i = i13;
        this.f119522j = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f119521i;
        h hVar = this.f119522j;
        switch (i13) {
            case 0:
                s1 s1Var = hVar.f119529m0;
                if (s1Var != null) {
                    return Boolean.valueOf(s1Var.d());
                }
                Intrinsics.r("experiments");
                throw null;
            default:
                hVar.s7().F(g0.SPONSOR_TAG, u0.CANCEL_BUTTON);
                return Unit.f80348a;
        }
    }
}
