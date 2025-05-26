package fi;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.engage.zzp;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: n, reason: collision with root package name */
    public static final HashMap f62188n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f62189a;

    /* renamed from: b, reason: collision with root package name */
    public final b f62190b;

    /* renamed from: g, reason: collision with root package name */
    public boolean f62195g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f62196h;

    /* renamed from: l, reason: collision with root package name */
    public h f62200l;

    /* renamed from: m, reason: collision with root package name */
    public IInterface f62201m;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f62192d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f62193e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final Object f62194f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public final d f62198j = new d(this, 0);

    /* renamed from: k, reason: collision with root package name */
    public final AtomicInteger f62199k = new AtomicInteger(0);

    /* renamed from: c, reason: collision with root package name */
    public final String f62191c = "AppEngageService";

    /* renamed from: i, reason: collision with root package name */
    public final WeakReference f62197i = new WeakReference(null);

    public i(Context context, b bVar, Intent intent) {
        this.f62189a = context;
        this.f62190b = bVar;
        this.f62196h = intent;
    }

    public static /* bridge */ /* synthetic */ void b(i iVar, c cVar) {
        IInterface iInterface = iVar.f62201m;
        ArrayList arrayList = iVar.f62192d;
        int i13 = 0;
        b bVar = iVar.f62190b;
        if (iInterface != null || iVar.f62195g) {
            if (!iVar.f62195g) {
                cVar.run();
                return;
            } else {
                bVar.c("Waiting to bind to the service.", new Object[0]);
                arrayList.add(cVar);
                return;
            }
        }
        bVar.c("Initiate binding to the service.", new Object[0]);
        arrayList.add(cVar);
        h hVar = new h(i13, iVar);
        iVar.f62200l = hVar;
        iVar.f62195g = true;
        if (iVar.f62189a.bindService(iVar.f62196h, hVar, 1)) {
            return;
        }
        bVar.c("Failed to bind to the service.", new Object[0]);
        iVar.f62195g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(new zzp());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f62188n;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f62191c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f62191c, 10);
                    handlerThread.start();
                    hashMap.put(this.f62191c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f62191c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return handler;
    }

    public final void c(TaskCompletionSource taskCompletionSource) {
        synchronized (this.f62194f) {
            this.f62193e.remove(taskCompletionSource);
        }
        a().post(new e(this));
    }

    public final RemoteException d() {
        return new RemoteException(String.valueOf(this.f62191c).concat(" : Binder has died."));
    }

    public final void e() {
        HashSet hashSet = this.f62193e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(d());
        }
        hashSet.clear();
    }
}
