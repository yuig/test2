package hd;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bugsnag.android.n2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class g implements Application.ActivityLifecycleCallbacks, Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public static final g f68797a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f68798b;

    /* renamed from: c, reason: collision with root package name */
    public static final Handler f68799c;

    /* renamed from: d, reason: collision with root package name */
    public static Application f68800d;

    /* renamed from: e, reason: collision with root package name */
    public static int f68801e;

    /* renamed from: f, reason: collision with root package name */
    public static int f68802f;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f68803g;

    /* renamed from: h, reason: collision with root package name */
    public static final long f68804h;

    /* renamed from: i, reason: collision with root package name */
    public static boolean f68805i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f68806j;

    /* renamed from: k, reason: collision with root package name */
    public static volatile long f68807k;

    /* renamed from: l, reason: collision with root package name */
    public static volatile long f68808l;

    static {
        g gVar = new g();
        f68797a = gVar;
        f68798b = new ArrayList();
        f68799c = new Handler(Looper.getMainLooper(), gVar);
        f68804h = SystemClock.elapsedRealtime();
        f68805i = true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        f68803g = false;
        if (!f68805i) {
            f68806j = false;
            f68805i = true;
            long j13 = (message.arg1 << 32) | message.arg2;
            ArrayList arrayList = f68798b;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                n2 n2Var = (n2) ((WeakReference) it.next()).get();
                                if (n2Var == null) {
                                    it.remove();
                                } else {
                                    n2Var.e(j13, false);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            f68807k = j13;
        }
        return true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f68801e++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f68801e = Math.max(0, f68801e - 1);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        ArrayList arrayList = f68798b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n2 n2Var = (n2) ((WeakReference) it.next()).get();
                        if (n2Var == null) {
                            it.remove();
                        } else {
                            n2Var.h(activity.getClass().getSimpleName(), true);
                        }
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStopped(Activity activity) {
        ArrayList arrayList = f68798b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    return;
                }
                try {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n2 n2Var = (n2) ((WeakReference) it.next()).get();
                        if (n2Var == null) {
                            it.remove();
                        } else {
                            n2Var.h(activity.getClass().getSimpleName(), false);
                        }
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.f80348a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (f68802f == 0 && !f68803g) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            ArrayList arrayList = f68798b;
            synchronized (arrayList) {
                try {
                    if (!arrayList.isEmpty()) {
                        try {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                n2 n2Var = (n2) ((WeakReference) it.next()).get();
                                if (n2Var == null) {
                                    it.remove();
                                } else {
                                    n2Var.e(elapsedRealtime, true);
                                }
                            }
                        } catch (Exception unused) {
                        }
                        Unit unit = Unit.f80348a;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            f68808l = elapsedRealtime;
        }
        f68802f++;
        f68799c.removeMessages(1);
        f68806j = true;
        f68803g = false;
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList arrayList2 = f68798b;
            synchronized (arrayList2) {
                try {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            n2 n2Var2 = (n2) ((WeakReference) it2.next()).get();
                            if (n2Var2 == null) {
                                it2.remove();
                            } else {
                                n2Var2.h(activity.getClass().getSimpleName(), true);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    Unit unit2 = Unit.f80348a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int max = Math.max(0, f68802f - 1);
        f68802f = max;
        if (max == 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (activity.isChangingConfigurations()) {
                f68803g = true;
                Handler handler = f68799c;
                Message obtainMessage = handler.obtainMessage(1);
                obtainMessage.arg1 = (int) ((elapsedRealtime >>> 32) & 4294967295L);
                obtainMessage.arg2 = (int) (elapsedRealtime & 4294967295L);
                handler.sendMessageDelayed(obtainMessage, 700L);
            } else {
                ArrayList arrayList = f68798b;
                synchronized (arrayList) {
                    try {
                        if (!arrayList.isEmpty()) {
                            try {
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    n2 n2Var = (n2) ((WeakReference) it.next()).get();
                                    if (n2Var == null) {
                                        it.remove();
                                    } else {
                                        n2Var.e(elapsedRealtime, false);
                                    }
                                }
                            } catch (Exception unused) {
                            }
                            Unit unit = Unit.f80348a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                f68806j = false;
                f68807k = elapsedRealtime;
            }
        }
        if (Build.VERSION.SDK_INT < 29) {
            ArrayList arrayList2 = f68798b;
            synchronized (arrayList2) {
                try {
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    try {
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            n2 n2Var2 = (n2) ((WeakReference) it2.next()).get();
                            if (n2Var2 == null) {
                                it2.remove();
                            } else {
                                n2Var2.h(activity.getClass().getSimpleName(), false);
                            }
                        }
                    } catch (Exception unused2) {
                    }
                    Unit unit2 = Unit.f80348a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }
}
