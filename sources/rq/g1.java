package rq;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g1 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f109201i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h1 f109202j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1(h1 h1Var, int i13) {
        super(0);
        this.f109201i = i13;
        this.f109202j = h1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f109201i;
        h1 h1Var = this.f109202j;
        switch (i13) {
        }
        return Boolean.valueOf(h1Var.b().K());
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f109201i) {
            case 0:
                h1 h1Var = this.f109202j;
                xr.a aVar = h1Var.f109230l;
                if (aVar != null) {
                    nx.b0 pinAuxHelper = h1Var.getPinAuxHelper();
                    ur.a aVar2 = h1Var.f109233o;
                    if (aVar2 != null) {
                        return h1Var.getImpressionHelper(aVar, pinAuxHelper, aVar2, h1Var.getAdFormats(), h1Var.b().o());
                    }
                    Intrinsics.r("adsCoreDependencies");
                    throw null;
                }
                Intrinsics.r("attributionReporting");
                throw null;
            case 1:
                return invoke();
            case 2:
                return invoke();
            case 3:
                return invoke();
            default:
                return invoke();
        }
    }
}
