package ads_mobile_sdk;

import com.google.android.gms.ads.mediation.MediationRewardedAd;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class s91 extends s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u91 f11009a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(u91 u91Var) {
        super(1);
        this.f11009a = u91Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit unit;
        MediationRewardedAd mediationAd = (MediationRewardedAd) obj;
        Intrinsics.checkNotNullParameter(mediationAd, "mediationAd");
        u91 u91Var = this.f11009a;
        synchronized (u91Var) {
            Intrinsics.checkNotNullParameter(mediationAd, "<set-?>");
            u91Var.f11894e = mediationAd;
            unit = Unit.f80348a;
        }
        return unit;
    }
}
