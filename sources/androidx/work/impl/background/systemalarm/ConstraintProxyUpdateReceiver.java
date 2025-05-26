package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kb.b0;
import lb.j0;
import n.g;

/* loaded from: classes3.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20013a = b0.h("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            j0.h(context).f82608e.a(new g(this, intent, context, goAsync(), 1));
            return;
        }
        b0.e().a(f20013a, "Ignoring unknown action " + action);
    }
}
