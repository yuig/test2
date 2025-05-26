package qa2;

import com.pinterest.api.model.f30;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f103368i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ LegoPinGridCellImpl f103369j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f30 f103370k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(LegoPinGridCellImpl legoPinGridCellImpl, f30 f30Var, int i13) {
        super(0);
        this.f103368i = i13;
        this.f103369j = legoPinGridCellImpl;
        this.f103370k = f30Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f103368i;
        f30 f30Var = this.f103370k;
        LegoPinGridCellImpl legoPinGridCellImpl = this.f103369j;
        switch (i13) {
            case 0:
                legoPinGridCellImpl.k2();
                ni1.d deepLinkHelper = legoPinGridCellImpl.getDeepLinkHelper();
                String uid = f30Var.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                deepLinkHelper.c(uid);
                return Unit.f80348a;
            default:
                return Boolean.valueOf(((es.v) legoPinGridCellImpl.getAdsCommonDisplay()).E(f30Var, legoPinGridCellImpl.Y()) && !((es.v) legoPinGridCellImpl.getAdsCommonDisplay()).h(f30Var));
        }
    }
}
