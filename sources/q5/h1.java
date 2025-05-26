package q5;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import oi.d6;
import oi.f7;
import oi.k5;
import oi.t3;
import oi.u4;
import oi.y5;

/* loaded from: classes3.dex */
public final class h1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102453a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f102454b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f102455c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f102456d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f102457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f102458f;

    public /* synthetic */ h1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i13) {
        this.f102453a = i13;
        this.f102458f = obj;
        this.f102454b = obj2;
        this.f102455c = obj3;
        this.f102456d = obj4;
        this.f102457e = obj5;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0081 -> B:9:0x008e). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        Object m13;
        List<ActivityManager.ProcessErrorStateInfo> processesInErrorState;
        ActivityManager.ProcessErrorStateInfo processErrorStateInfo;
        Object obj;
        switch (this.f102453a) {
            case 0:
                j1.h((View) this.f102454b, (q4) this.f102456d);
                ((ValueAnimator) this.f102457e).start();
                return;
            case 1:
                com.bugsnag.android.b bVar = (com.bugsnag.android.b) this.f102454b;
                Context context = ((com.bugsnag.android.o) this.f102455c).f29375i;
                bVar.getClass();
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    Object systemService = context.getSystemService("activity");
                    m13 = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                } catch (Throwable th3) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    m13 = ue.c.m(th3);
                }
                if (m13 instanceof xk2.r) {
                    m13 = null;
                }
                ActivityManager activityManager = (ActivityManager) m13;
                int myPid = Process.myPid();
                if (activityManager == null) {
                    processesInErrorState = null;
                } else {
                    try {
                        processesInErrorState = activityManager.getProcessesInErrorState();
                    } catch (RuntimeException unused) {
                        processErrorStateInfo = null;
                    }
                }
                if (processesInErrorState == null) {
                    processesInErrorState = kotlin.collections.q0.f80391a;
                }
                Iterator<T> it = processesInErrorState.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((ActivityManager.ProcessErrorStateInfo) obj).pid == myPid) {
                        }
                    } else {
                        obj = null;
                    }
                }
                processErrorStateInfo = (ActivityManager.ProcessErrorStateInfo) obj;
                if (processErrorStateInfo == null) {
                    if (((AtomicInteger) this.f102456d).getAndIncrement() < 300) {
                        ((Handler) this.f102457e).postDelayed(this, 100L);
                        return;
                    }
                    return;
                }
                com.bugsnag.android.b bVar2 = (com.bugsnag.android.b) this.f102454b;
                com.bugsnag.android.x0 x0Var = (com.bugsnag.android.x0) this.f102458f;
                bVar2.getClass();
                String str = processErrorStateInfo.shortMsg;
                if (!x0Var.f29685a.f29727l.isEmpty()) {
                    com.bugsnag.android.t0 t0Var = (com.bugsnag.android.t0) x0Var.f29685a.f29727l.get(0);
                    if (kotlin.text.z.p(str, "ANR", false)) {
                        Intrinsics.checkNotNullParameter(str, "<this>");
                        Intrinsics.checkNotNullParameter("ANR", "oldValue");
                        Intrinsics.checkNotNullParameter("", "newValue");
                        int L = StringsKt.L(str, "ANR", 0, false, 2);
                        if (L >= 0) {
                            str = StringsKt.U(str, L, 3 + L, "").toString();
                        }
                    }
                    t0Var.f29640a.f29656b = str;
                }
                ((com.bugsnag.android.o) this.f102455c).f(x0Var, null);
                return;
            case 2:
                d6 m14 = ((u4) ((k5) this.f102458f).f24333a).m();
                AtomicReference atomicReference = (AtomicReference) this.f102454b;
                String str2 = (String) this.f102456d;
                String str3 = (String) this.f102457e;
                m14.p();
                m14.w();
                m14.A(new y5(m14, atomicReference, str2, str3, m14.L(false)));
                return;
            default:
                Object obj2 = this.f102458f;
                ArrayList arrayList = new ArrayList();
                try {
                    t3 t3Var = ((d6) obj2).f94726d;
                    if (t3Var == null) {
                        ((d6) obj2).zzj().f95268f.a((String) this.f102454b, (String) this.f102455c, "Failed to get conditional properties; not connected to service");
                    } else {
                        com.bumptech.glide.d.t((zzo) this.f102456d);
                        arrayList = f7.i0(t3Var.b((String) this.f102454b, (String) this.f102455c, (zzo) this.f102456d));
                        ((d6) obj2).J();
                        f7 o13 = ((d6) obj2).o();
                        o13.L((com.google.android.gms.internal.measurement.u0) this.f102457e, arrayList);
                        obj2 = o13;
                    }
                } catch (RemoteException e13) {
                    ((d6) obj2).zzj().f95268f.d("Failed to get conditional properties; remote exception", (String) this.f102454b, (String) this.f102455c, e13);
                } finally {
                    ((d6) obj2).o().L((com.google.android.gms.internal.measurement.u0) this.f102457e, arrayList);
                }
                return;
        }
    }

    public h1(k5 k5Var, AtomicReference atomicReference, String str, String str2) {
        this.f102453a = 2;
        this.f102458f = k5Var;
        this.f102454b = atomicReference;
        this.f102455c = null;
        this.f102456d = str;
        this.f102457e = str2;
    }

    public h1(com.bugsnag.android.b bVar, com.bugsnag.android.o oVar, AtomicInteger atomicInteger, Handler handler, com.bugsnag.android.x0 x0Var) {
        this.f102453a = 1;
        this.f102454b = bVar;
        this.f102455c = oVar;
        this.f102456d = atomicInteger;
        this.f102457e = handler;
        this.f102458f = x0Var;
    }
}
