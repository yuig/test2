package ng2;

import com.google.android.gms.ads.AdSize;
import io.embrace.android.embracesdk.internal.config.remote.RemoteConfig;
import io.embrace.android.embracesdk.internal.config.remote.WebViewVitals;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.p;
import tg2.s;
import tg2.t;

/* loaded from: classes4.dex */
public final /* synthetic */ class c extends p implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        WebViewVitals webViewVitals;
        Integer num;
        RemoteConfig remoteConfig = ((t) ((s) this.receiver)).f117628b;
        return Integer.valueOf((remoteConfig == null || (webViewVitals = remoteConfig.f73062q) == null || (num = webViewVitals.f73096b) == null) ? AdSize.MEDIUM_RECTANGLE_WIDTH : num.intValue());
    }
}
