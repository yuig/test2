package ads_mobile_sdk;

import a.w2;
import com.google.android.gms.ads.AdError;
import kotlin.jvm.internal.Intrinsics;
import xk2.s;

/* loaded from: classes2.dex */
public final class mo2 implements w2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ao2.m f8316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qo2 f8317b;

    public mo2(qo2 qo2Var, ao2.m mVar) {
        this.f8316a = mVar;
        this.f8317b = qo2Var;
    }

    public final void a(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        ao2.m mVar = this.f8316a;
        xk2.q qVar = s.f135225b;
        mVar.resumeWith(new mk0(new wi.s(adError.getCode(), adError.getMessage(), adError.getDomain())));
    }
}
