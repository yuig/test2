package kk;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import d7.a0;
import java.util.HashSet;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public final fi.b f79898a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f79899b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f79900c;

    /* renamed from: d, reason: collision with root package name */
    public final HashSet f79901d = new HashSet();

    /* renamed from: e, reason: collision with root package name */
    public a0 f79902e = null;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f79903f = false;

    public t(fi.b bVar, IntentFilter intentFilter, Context context) {
        this.f79898a = bVar;
        this.f79899b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.f79900c = applicationContext != null ? applicationContext : context;
    }

    public final void a() {
        a0 a0Var;
        if ((this.f79903f || !this.f79901d.isEmpty()) && this.f79902e == null) {
            a0 a0Var2 = new a0(this);
            this.f79902e = a0Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f79900c.registerReceiver(a0Var2, this.f79899b, 2);
            } else {
                this.f79900c.registerReceiver(a0Var2, this.f79899b);
            }
        }
        if (this.f79903f || !this.f79901d.isEmpty() || (a0Var = this.f79902e) == null) {
            return;
        }
        this.f79900c.unregisterReceiver(a0Var);
        this.f79902e = null;
    }
}
