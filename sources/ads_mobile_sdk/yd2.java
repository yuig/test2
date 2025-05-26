package ads_mobile_sdk;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class yd2 {

    /* renamed from: d, reason: collision with root package name */
    public static final yd2 f14206d = new yd2();

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f14207a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f14208b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f14209c = false;

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f14207a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean isDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f14208b, isDeviceLocked);
        this.f14209c = isDeviceLocked;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z13, boolean z14) {
        if ((z14 || z13) == (this.f14209c || this.f14208b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(u3.f11813c.f11814a).iterator();
        while (it.hasNext()) {
            v3 v3Var = ((t3) it.next()).f11329d;
            boolean z15 = z14 || z13;
            if (v3Var.f12300b.get() != 0) {
                fr1.f5252a.a((WebView) v3Var.f12300b.get(), "setDeviceLockState", z15 ? "locked" : "unlocked");
            }
        }
    }
}
