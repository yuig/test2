package ads_mobile_sdk;

import a.w2;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ga1 implements MediationAdLoadCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f5487a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w2 f5488b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h80 f5489c;

    public ga1(h80 h80Var, mo2 mo2Var, Function1 function1) {
        this.f5487a = function1;
        this.f5488b = mo2Var;
        this.f5489c = h80Var;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdLoadCallback
    public final void onFailure(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ((mo2) this.f5488b).a(adError);
    }
}
