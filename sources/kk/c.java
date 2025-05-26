package kk;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.internal.zzag;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f79864n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f79865a;

    /* renamed from: b, reason: collision with root package name */
    public final fi.b f79866b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f79871g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f79872h;

    /* renamed from: l, reason: collision with root package name */
    public ja.v f79876l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f79877m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f79868d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f79869e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f79870f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final fi.d f79874j = new fi.d(this, 1);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f79875k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f79867c = "SplitInstallService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f79873i = new WeakReference(null);

    public c(Context context, fi.b bVar, Intent intent) {
        this.f79865a = context;
        this.f79866b = bVar;
        this.f79872h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(c cVar, u uVar) {
        IInterface iInterface = cVar.f79877m;
        ArrayList arrayList = cVar.f79868d;
        fi.b bVar = cVar.f79866b;
        if (iInterface != null || cVar.f79871g) {
            if (!cVar.f79871g) {
                uVar.run();
                return;
            } else {
                bVar.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(uVar);
                return;
            }
        }
        bVar.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(uVar);
        ja.v vVar = new ja.v(cVar);
        cVar.f79876l = vVar;
        cVar.f79871g = true;
        if (cVar.f79865a.bindService(cVar.f79872h, vVar, 1)) {
            return;
        }
        bVar.g("Failed to bind to the service.", new Object[0]);
        cVar.f79871g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((u) it.next()).b(new zzag());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f79864n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f79867c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f79867c, 10);
                    handlerThread.start();
                    hashMap.put(this.f79867c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f79867c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f79870f) {
            this.f79869e.remove(taskCompletionSource);
        }
        a().post(new b(this, 1));
    }

    public final void d() {
        HashSet hashSet = this.f79869e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.f79867c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
