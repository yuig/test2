package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kb.b0;
import lb.j0;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20014a = b0.h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        b0.e().a(f20014a, "Received intent " + intent);
        try {
            j0 h10 = j0.h(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            h10.getClass();
            synchronized (j0.f82604n) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = h10.f82613j;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    h10.f82613j = goAsync;
                    if (h10.f82612i) {
                        goAsync.finish();
                        h10.f82613j = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e13) {
            b0.e().d(f20014a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e13);
        }
    }
}
