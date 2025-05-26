package en;

import android.app.ActivityManager;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.view.WindowManager;
import b7.c;
import bk.q;
import com.facebook.login.z;
import com.google.android.gms.common.api.d;
import d7.a0;
import df.j1;
import fn.e;
import hn.g;
import hn.i;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f59641a = new b();

    public static void a(Context context) {
        b bVar = f59641a;
        Context applicationContext = context.getApplicationContext();
        j1.b(applicationContext, "Application Context cannot be null");
        if (bVar.f59642a) {
            return;
        }
        bVar.f59642a = true;
        q b13 = q.b();
        ((z) b13.f23107c).getClass();
        d dVar = new d(16);
        d dVar2 = (d) b13.f23106b;
        Handler handler = new Handler();
        dVar2.getClass();
        b13.f23108d = new gn.a(handler, applicationContext, dVar, b13);
        hn.b bVar2 = hn.b.f69593d;
        boolean z13 = applicationContext instanceof Application;
        if (z13) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar2);
        }
        c.f22032f = (UiModeManager) applicationContext.getSystemService("uimode");
        WindowManager windowManager = kn.b.f80207a;
        kn.b.f80209c = applicationContext.getResources().getDisplayMetrics().density;
        kn.b.f80207a = (WindowManager) applicationContext.getSystemService("window");
        e eVar = kn.d.f80211a;
        applicationContext.registerReceiver(new kn.c(0 == true ? 1 : 0), new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        g.f69601b.f69602a = applicationContext.getApplicationContext();
        hn.a aVar = hn.a.f69587f;
        if (!aVar.f69590c) {
            hn.e eVar2 = aVar.f69591d;
            eVar2.getClass();
            if (z13) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(eVar2);
            }
            eVar2.f69599c = aVar;
            eVar2.f69597a = true;
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z14 = runningAppProcessInfo.importance == 100 || eVar2.b();
            eVar2.f69598b = z14;
            eVar2.a(z14);
            aVar.f69592e = eVar2.f69598b;
            aVar.f69590c = true;
        }
        i iVar = i.f69604d;
        iVar.f69605a = new WeakReference(applicationContext);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        applicationContext.registerReceiver(new a0(iVar, 4), intentFilter);
    }
}
