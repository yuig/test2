package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class dc2 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ic2 f4231a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc2(ic2 ic2Var) {
        super(1);
        this.f4231a = ic2Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MediationInterstitialAd mediationAd = (MediationInterstitialAd) obj;
        Intrinsics.checkNotNullParameter(mediationAd, "mediationAd");
        ic2 ic2Var = this.f4231a;
        ic2Var.getClass();
        Intrinsics.checkNotNullParameter(mediationAd, "<set-?>");
        ic2Var.f6319e = mediationAd;
        return Unit.f80348a;
    }
}
