package lh0;

import com.pinterest.error.NetworkResponseError;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f1 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f83342i = 0;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f83343j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1 f83344k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g1 g1Var, boolean z13) {
        super(1);
        this.f83344k = g1Var;
        this.f83343j = z13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f83342i;
        boolean z13 = this.f83343j;
        g1 g1Var = this.f83344k;
        switch (i13) {
            case 0:
                g1Var.f83369u.set(true);
                if (z13) {
                    g1Var.f83354f.k("ExperimentsBgFetchSuccess", kotlin.collections.q0.f80391a);
                }
                break;
            default:
                Throwable throwable = (Throwable) obj;
                if (throwable instanceof NetworkResponseError) {
                    v.f1 f1Var = ((NetworkResponseError) throwable).f45043a;
                    if (f1Var != null && z13) {
                        tb0.h hVar = g1Var.f83354f;
                        tb0.k kVar = new tb0.k();
                        kVar.c("ResponseCode", String.valueOf(f1Var.f123449b));
                        hVar.k("ExperimentsBgFetchFailure", kVar.f117102a);
                    }
                } else {
                    Intrinsics.f(throwable);
                    if (rl2.g0.Y(throwable) && z13) {
                        tb0.h hVar2 = g1Var.f83354f;
                        tb0.k kVar2 = new tb0.k();
                        Intrinsics.checkNotNullParameter(throwable, "throwable");
                        kVar2.a(null, null, throwable);
                        hVar2.k("ExperimentsBgFetchFailure", kVar2.f117102a);
                    }
                }
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(boolean z13, g1 g1Var) {
        super(1);
        this.f83343j = z13;
        this.f83344k = g1Var;
    }
}
