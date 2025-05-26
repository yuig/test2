package s;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes2.dex */
public final class c extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f110246g;

    public c(Context context) {
        this.f110246g = context;
    }

    @Override // s.q
    public final void onCustomTabsServiceConnected(ComponentName componentName, k kVar) {
        kVar.e();
        this.f110246g.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
