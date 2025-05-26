package d7;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* loaded from: classes3.dex */
public final class x extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a */
    public final b0 f53898a;

    public x(b0 b0Var) {
        this.f53898a = b0Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        this.f53898a.l(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
    }
}
