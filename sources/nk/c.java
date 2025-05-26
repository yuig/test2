package nk;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f91061o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f91062a;

    /* renamed from: b, reason: collision with root package name */
    public final w f91063b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91064c;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91068g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f91069h;

    /* renamed from: i, reason: collision with root package name */
    public final a0 f91070i;

    /* renamed from: m, reason: collision with root package name */
    public fi.h f91074m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f91075n;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f91065d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f91066e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f91067f = new Object();

    /* renamed from: k, reason: collision with root package name */
    public final fi.d f91072k = new fi.d(this, 2);

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f91073l = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f91071j = new WeakReference(null);

    public c(Context context, w wVar, String str, Intent intent, a0 a0Var) {
        this.f91062a = context;
        this.f91063b = wVar;
        this.f91064c = str;
        this.f91069h = intent;
        this.f91070i = a0Var;
    }

    public static /* bridge */ /* synthetic */ void b(c cVar, x xVar) {
        IInterface iInterface = cVar.f91075n;
        ArrayList arrayList = cVar.f91065d;
        w wVar = cVar.f91063b;
        if (iInterface != null || cVar.f91068g) {
            if (!cVar.f91068g) {
                xVar.run();
                return;
            } else {
                wVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(xVar);
                return;
            }
        }
        wVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(xVar);
        fi.h hVar = new fi.h(1, cVar);
        cVar.f91074m = hVar;
        cVar.f91068g = true;
        if (cVar.f91062a.bindService(cVar.f91069h, hVar, 1)) {
            return;
        }
        wVar.c("Failed to bind to the service.", new Object[0]);
        cVar.f91068g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f91061o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f91064c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f91064c, 10);
                    handlerThread.start();
                    hashMap.put(this.f91064c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f91064c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    public final void c(x xVar, TaskCompletionSource taskCompletionSource) {
        a().post(new y(this, xVar.c(), taskCompletionSource, xVar));
    }

    public final void d(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f91067f) {
            this.f91066e.remove(taskCompletionSource);
        }
        a().post(new z(this));
    }

    public final RemoteException e() {
        return new RemoteException(String.valueOf(this.f91064c).concat(" : Binder has died."));
    }

    public final void f() {
        HashSet hashSet = this.f91066e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(e());
        }
        hashSet.clear();
    }
}
