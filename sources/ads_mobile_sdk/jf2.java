package ads_mobile_sdk;

import a.b3;
import a.o3;
import ads_mobile_sdk.jf2;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class jf2 {

    /* renamed from: o, reason: collision with root package name */
    public static final HashMap f6784o = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f6785a;

    /* renamed from: b, reason: collision with root package name */
    public final u71 f6786b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6787c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6788d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f6789e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f6790f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6791g;

    /* renamed from: h, reason: collision with root package name */
    public final Intent f6792h;

    /* renamed from: i, reason: collision with root package name */
    public final b3 f6793i;

    /* renamed from: j, reason: collision with root package name */
    public final WeakReference f6794j;

    /* renamed from: k, reason: collision with root package name */
    public final IBinder.DeathRecipient f6795k;

    /* renamed from: l, reason: collision with root package name */
    public final AtomicInteger f6796l;

    /* renamed from: m, reason: collision with root package name */
    public if2 f6797m;

    /* renamed from: n, reason: collision with root package name */
    public IInterface f6798n;

    public jf2(Context context, u71 u71Var, Intent intent, b3 b3Var) {
        this(context, u71Var, intent, b3Var, 0);
    }

    public final void a(TaskCompletionSource taskCompletionSource) {
        this.f6789e.add(taskCompletionSource);
        taskCompletionSource.getTask().addOnCompleteListener(new o3(0, this, taskCompletionSource));
    }

    public final void b(jd2 jd2Var) {
        Handler handler;
        HashMap hashMap = f6784o;
        synchronized (hashMap) {
            try {
                if (!hashMap.containsKey(this.f6787c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f6787c, 10);
                    handlerThread.start();
                    hashMap.put(this.f6787c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) hashMap.get(this.f6787c);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        handler.post(jd2Var);
    }

    public jf2(Context context, u71 u71Var, Intent intent, b3 b3Var, int i13) {
        this.f6788d = new ArrayList();
        this.f6789e = new HashSet();
        this.f6790f = new Object();
        this.f6795k = new IBinder.DeathRecipient() { // from class: a.j6
            @Override // android.os.IBinder.DeathRecipient
            public final void binderDied() {
                jf2.this.a();
            }
        };
        this.f6796l = new AtomicInteger(0);
        this.f6785a = context;
        this.f6786b = u71Var;
        this.f6787c = "PrewarmService";
        this.f6792h = intent;
        this.f6793i = b3Var;
        this.f6794j = new WeakReference(null);
    }

    public final void a(jd2 jd2Var) {
        if (this.f6798n == null && !this.f6791g) {
            this.f6786b.a("Initiate binding to the service.", new Object[0]);
            this.f6788d.add(jd2Var);
            if2 if2Var = new if2(this);
            this.f6797m = if2Var;
            this.f6791g = true;
            if (this.f6785a.bindService(this.f6792h, if2Var, 1)) {
                return;
            }
            this.f6786b.a("Failed to bind to the service.", new Object[0]);
            this.f6791g = false;
            Iterator it = this.f6788d.iterator();
            while (it.hasNext()) {
                jd2 jd2Var2 = (jd2) it.next();
                kf2 kf2Var = new kf2();
                TaskCompletionSource taskCompletionSource = jd2Var2.f6765a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(kf2Var);
                }
            }
            this.f6788d.clear();
            return;
        }
        if (this.f6791g) {
            this.f6786b.a("Waiting to bind to the service.", new Object[0]);
            this.f6788d.add(jd2Var);
        } else {
            jd2Var.run();
        }
    }

    public final /* synthetic */ void a(TaskCompletionSource taskCompletionSource, Task task) {
        synchronized (this.f6790f) {
            this.f6789e.remove(taskCompletionSource);
        }
    }

    public final void a() {
        this.f6786b.a("reportBinderDeath", new Object[0]);
        if (this.f6794j.get() == null) {
            this.f6786b.a("%s : Binder has died.", this.f6787c);
            Iterator it = this.f6788d.iterator();
            while (it.hasNext()) {
                jd2 jd2Var = (jd2) it.next();
                RemoteException remoteException = new RemoteException(a.a.p(new StringBuilder(), this.f6787c, " : Binder has died."));
                TaskCompletionSource taskCompletionSource = jd2Var.f6765a;
                if (taskCompletionSource != null) {
                    taskCompletionSource.trySetException(remoteException);
                }
            }
            this.f6788d.clear();
            synchronized (this.f6790f) {
                try {
                    Iterator it2 = this.f6789e.iterator();
                    while (it2.hasNext()) {
                        ((TaskCompletionSource) it2.next()).trySetException(new RemoteException(this.f6787c + " : Binder has died."));
                    }
                    this.f6789e.clear();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            return;
        }
        throw new ClassCastException();
    }
}
