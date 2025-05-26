package ads_mobile_sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class kx2 extends BroadcastReceiver implements a.n6 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f7559a = true;

    public kx2(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        context.registerReceiver(this, intentFilter);
    }

    @Override // a.n6
    public final void a(HashMap hashMap) {
        boolean z13;
        synchronized (this) {
            z13 = this.f7559a;
        }
        hashMap.put("up", Boolean.valueOf(z13));
    }

    @Override // a.n6
    public final void b(HashMap hashMap) {
        boolean z13;
        synchronized (this) {
            z13 = this.f7559a;
        }
        hashMap.put("up", Boolean.valueOf(z13));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            synchronized (this) {
                this.f7559a = true;
            }
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            a();
        }
    }

    @Override // a.n6
    public final void a(HashMap hashMap, Context context, View view) {
        boolean z13;
        synchronized (this) {
            z13 = this.f7559a;
        }
        hashMap.put("up", Boolean.valueOf(z13));
    }

    public final synchronized void a() {
        this.f7559a = false;
    }
}
