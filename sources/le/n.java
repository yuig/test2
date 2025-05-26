package le;

import J.N;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.AccessToken;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.base.PowerMonitor;

/* loaded from: classes3.dex */
public final class n extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83074a;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f83074a) {
            case 0:
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(intent, "intent");
                if (Intrinsics.d("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && v.f83119p.get()) {
                    e t13 = e.f83036f.t();
                    AccessToken accessToken = t13.f83040c;
                    t13.c(accessToken, accessToken);
                    break;
                }
                break;
            default:
                PowerMonitor.f97313b.f97314a = intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED");
                N.MCImhGql();
                break;
        }
    }
}
