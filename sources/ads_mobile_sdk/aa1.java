package ads_mobile_sdk;

import a.w2;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class aa1 implements MediationAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w2 f2326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f2327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h80 f2328c;

    public aa1(h80 h80Var, mo2 mo2Var, Function1 function1) {
        this.f2326a = mo2Var;
        this.f2327b = function1;
        this.f2328c = h80Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((mo2) this.f2326a).a(adError);
    }
}
