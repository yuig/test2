package c5;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static String f25799d;

    /* renamed from: g, reason: collision with root package name */
    public static d0 f25802g;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25803a;

    /* renamed from: b, reason: collision with root package name */
    public final NotificationManager f25804b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f25798c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static HashSet f25800e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public static final Object f25801f = new Object();

    public e0(Context context) {
        this.f25803a = context;
        this.f25804b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i13, Notification notification) {
        Bundle J2 = ph.a.J(notification);
        if (J2 == null || !J2.getBoolean("android.support.useSideChannel")) {
            this.f25804b.notify(null, i13, notification);
            return;
        }
        a0 a0Var = new a0(this.f25803a.getPackageName(), i13, notification);
        synchronized (f25801f) {
            try {
                if (f25802g == null) {
                    f25802g = new d0(this.f25803a.getApplicationContext());
                }
                f25802g.f25788c.obtainMessage(0, a0Var).sendToTarget();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f25804b.cancel(null, i13);
    }
}
