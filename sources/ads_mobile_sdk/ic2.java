package ads_mobile_sdk;

import a.w0;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationInterstitialAd;
import com.google.android.gms.ads.mediation.MediationRewardedAd;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class ic2 extends ds0 implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final RtbAdapter f6316b;

    /* renamed from: c, reason: collision with root package name */
    public View f6317c;

    /* renamed from: d, reason: collision with root package name */
    public a.p1 f6318d;

    /* renamed from: e, reason: collision with root package name */
    public MediationInterstitialAd f6319e;

    /* renamed from: f, reason: collision with root package name */
    public MediationRewardedAd f6320f;

    /* renamed from: g, reason: collision with root package name */
    public MediationAppOpenAd f6321g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic2(RtbAdapter rtbAdapter) {
        super(rtbAdapter);
        Intrinsics.checkNotNullParameter(rtbAdapter, "rtbAdapter");
        this.f6316b = rtbAdapter;
    }
}
