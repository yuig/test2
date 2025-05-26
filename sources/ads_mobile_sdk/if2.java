package ads_mobile_sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* loaded from: classes2.dex */
public final class if2 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jf2 f6390a;

    public if2(jf2 jf2Var) {
        this.f6390a = jf2Var;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f6390a.f6786b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f6390a.b(new gf2(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f6390a.f6786b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f6390a.b(new hf2(this));
    }
}
