package nl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public final class f extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f91213b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f91214a;

    public f(Context context) {
        this.f91214a = context;
    }

    public static void a(Context context) {
        AtomicReference atomicReference = f91213b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            while (!atomicReference.compareAndSet(null, fVar)) {
                if (atomicReference.get() != null) {
                    return;
                }
            }
            context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f91215j) {
            try {
                Iterator it = ((g1.e) g.f91216k.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f91214a.unregisterReceiver(this);
    }
}
