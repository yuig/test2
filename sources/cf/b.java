package cf;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import df.c0;
import df.e0;
import df.e1;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import le.v;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27635a = new b();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f27636b = new HashMap();

    public static final void a(String str) {
        if (p001if.a.b(b.class)) {
            return;
        }
        try {
            f27635a.b(str);
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
        }
    }

    public static final boolean c() {
        if (p001if.a.b(b.class)) {
            return false;
        }
        try {
            e0 e0Var = e0.f54743a;
            c0 b13 = e0.b(v.b());
            if (b13 != null) {
                return b13.f54728e.contains(e1.Enabled);
            }
            return false;
        } catch (Throwable th3) {
            p001if.a.a(b.class, th3);
            return false;
        }
    }

    public final void b(String str) {
        if (p001if.a.b(this)) {
            return;
        }
        HashMap hashMap = f27636b;
        try {
            NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) hashMap.get(str);
            if (registrationListener != null) {
                Object systemService = v.a().getSystemService("servicediscovery");
                if (systemService == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
                }
                try {
                    ((NsdManager) systemService).unregisterService(registrationListener);
                } catch (IllegalArgumentException unused) {
                    v vVar = v.f83104a;
                }
                hashMap.remove(str);
            }
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }

    public final boolean d(String str) {
        if (p001if.a.b(this)) {
            return false;
        }
        try {
            HashMap hashMap = f27636b;
            if (hashMap.containsKey(str)) {
                return true;
            }
            v vVar = v.f83104a;
            String str2 = "fbsdk_" + Intrinsics.n(z.m("15.0.2", '.', '|'), "android-") + '_' + ((Object) str);
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            Object systemService = v.a().getSystemService("servicediscovery");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.net.nsd.NsdManager");
            }
            a aVar = new a(str2, str);
            hashMap.put(str, aVar);
            ((NsdManager) systemService).registerService(nsdServiceInfo, 1, aVar);
            return true;
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
            return false;
        }
    }
}
