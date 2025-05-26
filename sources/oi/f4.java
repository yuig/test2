package oi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class f4 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final a7 f94747a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f94748b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f94749c;

    public f4(a7 a7Var) {
        this.f94747a = a7Var;
    }

    public final void a() {
        a7 a7Var = this.f94747a;
        a7Var.N();
        a7Var.zzl().p();
        a7Var.zzl().p();
        if (this.f94748b) {
            a7Var.zzj().f95276n.c("Unregistering connectivity change receiver");
            this.f94748b = false;
            this.f94749c = false;
            try {
                a7Var.f94666l.f95197a.unregisterReceiver(this);
            } catch (IllegalArgumentException e13) {
                a7Var.zzj().f95268f.b(e13, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        a7 a7Var = this.f94747a;
        a7Var.N();
        String action = intent.getAction();
        a7Var.zzj().f95276n.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            a7Var.zzj().f95271i.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        e4 e4Var = a7Var.f94656b;
        a7.p(e4Var);
        boolean x13 = e4Var.x();
        if (this.f94749c != x13) {
            this.f94749c = x13;
            a7Var.zzl().y(new ae.r(this, x13, 2));
        }
    }
}
