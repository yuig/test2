package se;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import le.v;

/* loaded from: classes3.dex */
public final class a implements ServiceConnection {
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName name, IBinder service) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(service, "service");
        AtomicBoolean atomicBoolean = c.f112322a;
        h hVar = h.f112358a;
        Context context = v.a();
        Object obj = null;
        if (!p001if.a.b(h.class)) {
            try {
                Intrinsics.checkNotNullParameter(context, "context");
                obj = h.f112358a.k(context, "com.android.vending.billing.IInAppBillingService$Stub", "asInterface", null, new Object[]{service});
            } catch (Throwable th3) {
                p001if.a.a(h.class, th3);
            }
        }
        c.f112328g = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName name) {
        Intrinsics.checkNotNullParameter(name, "name");
    }
}
