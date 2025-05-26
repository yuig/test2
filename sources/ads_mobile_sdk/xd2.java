package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes2.dex */
public final class xd2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yd2 f13616a = yd2.f14206d;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            yd2 yd2Var = this.f13616a;
            yd2Var.a(true, yd2Var.f14209c);
            this.f13616a.f14208b = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            yd2 yd2Var2 = this.f13616a;
            yd2Var2.a(false, yd2Var2.f14209c);
            this.f13616a.f14208b = false;
        }
    }
}
