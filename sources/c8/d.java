package c8;

import a.z0;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;
import androidx.appcompat.app.i0;
import androidx.media3.exoplayer.scheduler.Requirements;
import d7.n0;
import z7.i;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public Context f26941a;

    /* renamed from: b, reason: collision with root package name */
    public int f26942b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26943c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26944d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26945e = n0.o(null);

    /* renamed from: f, reason: collision with root package name */
    public Object f26946f;

    /* renamed from: g, reason: collision with root package name */
    public Object f26947g;

    public d(Context context, z0 z0Var, Requirements requirements) {
        this.f26941a = context.getApplicationContext();
        this.f26943c = z0Var;
        this.f26944d = requirements;
    }

    public final void a() {
        int a13 = ((Requirements) this.f26944d).a(this.f26941a);
        if (this.f26942b != a13) {
            this.f26942b = a13;
            i iVar = (i) ((z0) this.f26943c).f196b;
            Requirements requirements = i.f140941l;
            iVar.b(this, a13);
        }
    }

    public final int b() {
        this.f26942b = ((Requirements) this.f26944d).a(this.f26941a);
        IntentFilter intentFilter = new IntentFilter();
        if ((((Requirements) this.f26944d).f18842a & 1) != 0) {
            if (n0.f53866a >= 24) {
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f26941a.getSystemService("connectivity");
                connectivityManager.getClass();
                c cVar = new c(this);
                this.f26947g = cVar;
                connectivityManager.registerDefaultNetworkCallback(cVar);
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if ((((Requirements) this.f26944d).f18842a & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((((Requirements) this.f26944d).f18842a & 4) != 0) {
            if (n0.f53866a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if ((((Requirements) this.f26944d).f18842a & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        i0 i0Var = new i0(this);
        this.f26946f = i0Var;
        this.f26941a.registerReceiver(i0Var, intentFilter, null, (Handler) this.f26945e);
        return this.f26942b;
    }
}
