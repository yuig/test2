package ads_mobile_sdk;

import a.w2;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ea1 implements MediationAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f4773a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f4774b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h80 f4775c;

    public ea1(h80 h80Var, mo2 mo2Var, Function1 function1) {
        this.f4773a = mo2Var;
        this.f4774b = function1;
        this.f4775c = h80Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((mo2) this.f4773a).a(adError);
    }
}
