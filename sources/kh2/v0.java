package kh2;

import io.embrace.android.embracesdk.internal.config.remote.AppExitInfoConfig;
import io.embrace.android.embracesdk.internal.config.remote.DataRemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.WebViewVitals;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class v0 extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79723i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sg2.a f79724j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v0(sg2.a aVar, int i13) {
        super(0);
        this.f79723i = i13;
        this.f79724j = aVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Boolean bool;
        DataRemoteConfig dataRemoteConfig;
        WebViewVitals webViewVitals;
        Float f13;
        int i13 = this.f79723i;
        sg2.a aVar = this.f79724j;
        switch (i13) {
            case 0:
                tg2.c cVar = ((sg2.b) aVar).f112886k;
                AppExitInfoConfig appExitInfoConfig = cVar.f117597c;
                Boolean a13 = cVar.f117595a.a(appExitInfoConfig != null ? appExitInfoConfig.f72992b : null);
                return Boolean.valueOf(a13 != null ? a13.booleanValue() : cVar.f117596b.isAeiCaptureEnabled());
            case 1:
                RemoteConfig remoteConfig = ((sg2.b) aVar).f112884i.f117611a;
                if (remoteConfig != null && (bool = remoteConfig.f73057l) != null) {
                    r1 = bool.booleanValue();
                }
                return Boolean.valueOf(r1);
            case 2:
                return Boolean.valueOf(((sg2.b) aVar).f112877b.f117602c.isPowerSaveModeCaptureEnabled());
            case 3:
                return Boolean.valueOf(((sg2.b) aVar).f112877b.f117602c.isMemoryWarningCaptureEnabled());
            case 4:
                return Boolean.valueOf(((sg2.b) aVar).f112877b.f117602c.isNetworkConnectivityCaptureEnabled());
            case 5:
                tg2.e eVar = ((sg2.b) aVar).f112877b;
                RemoteConfig remoteConfig2 = eVar.f117601b;
                if (remoteConfig2 != null && (dataRemoteConfig = remoteConfig2.f73055j) != null) {
                    r2 = dataRemoteConfig.f73002a;
                }
                Boolean a14 = eVar.f117600a.a(r2);
                return Boolean.valueOf(a14 != null ? a14.booleanValue() : true);
            case 6:
                tg2.t tVar = ((sg2.b) aVar).f112887l;
                RemoteConfig remoteConfig3 = tVar.f117628b;
                return Boolean.valueOf(tVar.f117627a.b((remoteConfig3 == null || (webViewVitals = remoteConfig3.f73062q) == null || (f13 = webViewVitals.f73095a) == null) ? 100.0f : f13.floatValue()));
            default:
                return Boolean.valueOf(((sg2.b) aVar).f112878c.f117610b.isWebViewBreadcrumbCaptureEnabled());
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f79723i) {
        }
        return invoke();
    }
}
