package df;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f54702a;

    /* renamed from: b, reason: collision with root package name */
    public final z6.a f54703b;

    /* renamed from: c, reason: collision with root package name */
    public z0 f54704c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f54705d;

    /* renamed from: e, reason: collision with root package name */
    public Messenger f54706e;

    /* renamed from: f, reason: collision with root package name */
    public final int f54707f;

    /* renamed from: g, reason: collision with root package name */
    public final int f54708g;

    /* renamed from: h, reason: collision with root package name */
    public final String f54709h;

    /* renamed from: i, reason: collision with root package name */
    public final int f54710i;

    /* renamed from: j, reason: collision with root package name */
    public final String f54711j;

    public a1(Context context, int i13, int i14, int i15, String applicationId, String str) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Context applicationContext = context.getApplicationContext();
        this.f54702a = applicationContext != null ? applicationContext : context;
        this.f54707f = i13;
        this.f54708g = i14;
        this.f54709h = applicationId;
        this.f54710i = i15;
        this.f54711j = str;
        this.f54703b = new z6.a(this);
    }

    public final void a(Bundle bundle) {
        if (this.f54705d) {
            this.f54705d = false;
            z0 z0Var = this.f54704c;
            if (z0Var == null) {
                return;
            }
            z0Var.b(bundle);
        }
    }

    public final Context b() {
        return this.f54702a;
    }

    public abstract void c(Bundle bundle);

    public final boolean d() {
        synchronized (this) {
            boolean z13 = false;
            if (this.f54705d) {
                return false;
            }
            y0 y0Var = y0.f54883a;
            int i13 = this.f54710i;
            if (!p001if.a.b(y0.class)) {
                try {
                    if (y0.f54883a.g(y0.f54885c, new int[]{i13}).f254a == -1) {
                        return false;
                    }
                } catch (Throwable th3) {
                    p001if.a.a(y0.class, th3);
                }
            }
            y0 y0Var2 = y0.f54883a;
            Intent d2 = y0.d(b());
            if (d2 != null) {
                z13 = true;
                this.f54705d = true;
                b().bindService(d2, this, 1);
            }
            return z13;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        this.f54706e = new Messenger(service);
        Bundle bundle = new Bundle();
        bundle.putString("com.facebook.platform.extra.APPLICATION_ID", this.f54709h);
        String str = this.f54711j;
        if (str != null) {
            bundle.putString("com.facebook.platform.extra.NONCE", str);
        }
        c(bundle);
        Message obtain = Message.obtain((Handler) null, this.f54707f);
        obtain.arg1 = this.f54710i;
        obtain.setData(bundle);
        obtain.replyTo = new Messenger(this.f54703b);
        try {
            Messenger messenger = this.f54706e;
            if (messenger == null) {
                return;
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            a(null);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f54706e = null;
        try {
            this.f54702a.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        a(null);
    }
}
