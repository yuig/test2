package jk;

import android.app.Activity;
import android.app.PendingIntent;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.splitinstall.SplitInstallException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final l f76329a;

    /* renamed from: b, reason: collision with root package name */
    public final w f76330b;

    /* renamed from: c, reason: collision with root package name */
    public final u f76331c;

    /* renamed from: d, reason: collision with root package name */
    public final m f76332d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f76333e = new Handler(Looper.getMainLooper());

    public e(l lVar, w wVar, u uVar, m mVar) {
        this.f76329a = lVar;
        this.f76330b = wVar;
        this.f76331c = uVar;
        this.f76332d = mVar;
    }

    public static ArrayList g(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override // jk.b
    public final synchronized void a(c91.b bVar) {
        w wVar = this.f76330b;
        synchronized (wVar) {
            wVar.f79898a.g("registerListener", new Object[0]);
            wVar.f79901d.add(bVar);
            wVar.a();
        }
    }

    @Override // jk.b
    public final synchronized void b(c cVar) {
        w wVar = this.f76330b;
        synchronized (wVar) {
            wVar.f79898a.g("unregisterListener", new Object[0]);
            if (cVar == null) {
                throw new NullPointerException("Unregistered Play Core listener should not be null.");
            }
            wVar.f79901d.remove(cVar);
            wVar.a();
        }
    }

    @Override // jk.b
    public final Task c(List list) {
        m mVar = this.f76332d;
        mVar.getClass();
        synchronized (m.class) {
            HashSet hashSet = new HashSet(mVar.a());
            Iterator it = list.iterator();
            boolean z13 = false;
            while (it.hasNext()) {
                z13 |= hashSet.add((String) it.next());
            }
            if (z13) {
                try {
                    mVar.f76350a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", hashSet).apply();
                } catch (Exception unused) {
                }
            }
        }
        l lVar = this.f76329a;
        kk.c cVar = lVar.f76349b;
        if (cVar == null) {
            l.f76346c.c("onError(%d)", -14);
            return Tasks.forException(new SplitInstallException(-14));
        }
        l.f76346c.g("deferredUninstall(%s)", list);
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        kk.w wVar = new kk.w(lVar, taskCompletionSource, list, taskCompletionSource);
        cVar.a().post(new kk.w(cVar, wVar.a(), taskCompletionSource, wVar));
        return taskCompletionSource.getTask();
    }

    @Override // jk.b
    public final Set d() {
        return this.f76331c.c();
    }

    @Override // jk.b
    public final boolean e(d dVar, Activity activity) {
        PendingIntent pendingIntent;
        if (dVar.f76321b != 8 || (pendingIntent = dVar.f76327h) == null) {
            return false;
        }
        activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1170, null, 0, 0, 0);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (r7.containsAll(r2) != false) goto L26;
     */
    @Override // jk.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.tasks.Task f(qq2.c r12) {
        /*
            Method dump skipped, instructions count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.e.f(qq2.c):com.google.android.gms.tasks.Task");
    }
}
