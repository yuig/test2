package androidx.appcompat.widget;

import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f16601a;

    /* renamed from: b */
    public final Object f16602b;

    /* renamed from: c */
    public final Object f16603c;

    public /* synthetic */ j(int i13, Object obj, Object obj2) {
        this.f16601a = i13;
        this.f16603c = obj;
        this.f16602b = obj2;
    }

    private void a() {
        n.m mVar;
        n nVar = (n) this.f16603c;
        n.o oVar = nVar.f88563c;
        if (oVar != null && (mVar = oVar.f88652e) != null) {
            mVar.w(oVar);
        }
        View view = (View) nVar.f88568h;
        if (view != null && view.getWindowToken() != null) {
            h hVar = (h) this.f16602b;
            if (!hVar.b()) {
                if (hVar.f88718f != null) {
                    hVar.d(0, 0, false, false);
                }
            }
            nVar.f16658r = hVar;
        }
        nVar.f16660t = null;
    }

    private void b() {
        ((Runnable) this.f16602b).run();
    }

    private void c() {
        try {
            try {
                g0.b bVar = (g0.b) this.f16603c;
                Object d2 = g0.m.d((com.google.common.util.concurrent.c0) this.f16602b);
                r4.i iVar = bVar.f63189b;
                if (iVar != null) {
                    iVar.b(d2);
                }
            } catch (CancellationException unused) {
                ((g0.b) this.f16603c).cancel(false);
                ((g0.b) this.f16603c).f63187g = null;
                return;
            } catch (ExecutionException e13) {
                g0.b bVar2 = (g0.b) this.f16603c;
                Throwable cause = e13.getCause();
                r4.i iVar2 = bVar2.f63189b;
                if (iVar2 != null) {
                    iVar2.d(cause);
                }
            }
            ((g0.b) this.f16603c).f63187g = null;
        } catch (Throwable th3) {
            ((g0.b) this.f16603c).f63187g = null;
            throw th3;
        }
    }

    private void d() {
        Object obj = this.f16603c;
        try {
            ((g0.c) obj).onSuccess(g0.m.c((Future) this.f16602b));
        } catch (Error e13) {
            e = e13;
            ((g0.c) obj).onFailure(e);
        } catch (RuntimeException e14) {
            e = e14;
            ((g0.c) obj).onFailure(e);
        } catch (ExecutionException e15) {
            Throwable cause = e15.getCause();
            if (cause == null) {
                ((g0.c) obj).onFailure(e15);
            } else {
                ((g0.c) obj).onFailure(cause);
            }
        }
    }

    private void e() {
        Object obj = this.f16602b;
        boolean isCancelled = ((com.google.common.util.concurrent.c0) obj).isCancelled();
        Object obj2 = this.f16603c;
        if (isCancelled) {
            ((ao2.m) obj2).cancel(null);
            return;
        }
        try {
            xk2.q qVar = xk2.s.f135225b;
            ((ao2.m) obj2).resumeWith(r4.h.g((com.google.common.util.concurrent.c0) obj));
        } catch (ExecutionException e13) {
            xk2.q qVar2 = xk2.s.f135225b;
            Throwable cause = e13.getCause();
            Intrinsics.f(cause);
            ((ao2.m) obj2).resumeWith(ue.c.m(cause));
        }
    }

    private void f() {
        try {
            Method method = c5.e.f25794d;
            Object obj = this.f16603c;
            Object obj2 = this.f16602b;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                c5.e.f25795e.invoke(obj2, obj, Boolean.FALSE);
            }
        } catch (RuntimeException e13) {
            if (e13.getClass() == RuntimeException.class && e13.getMessage() != null && e13.getMessage().startsWith("Unable to stop")) {
                throw e13;
            }
        } catch (Throwable th3) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th3);
        }
    }

    private void g() {
        y6.a aVar = (y6.a) this.f16603c;
        Object obj = this.f16602b;
        if (aVar.f137894c.get()) {
            y6.b bVar = aVar.f137896e;
            if (bVar.f137905i == aVar) {
                SystemClock.uptimeMillis();
                bVar.f137905i = null;
                bVar.b();
            }
        } else {
            y6.b bVar2 = aVar.f137896e;
            if (bVar2.f137904h != aVar) {
                if (bVar2.f137905i == aVar) {
                    SystemClock.uptimeMillis();
                    bVar2.f137905i = null;
                    bVar2.b();
                }
            } else if (!bVar2.f137900d) {
                SystemClock.uptimeMillis();
                bVar2.f137904h = null;
                y6.c cVar = bVar2.f137898b;
                if (cVar != null) {
                    x6.b bVar3 = (x6.b) cVar;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar3.k(obj);
                    } else {
                        bVar3.i(obj);
                    }
                }
            }
        }
        aVar.f137893b = y6.g.FINISHED;
    }

    private void h() {
        androidx.recyclerview.widget.e eVar = (androidx.recyclerview.widget.e) this.f16603c;
        Object obj = eVar.f19365f;
        if (((androidx.recyclerview.widget.f) obj).f19376g == eVar.f19361b) {
            androidx.recyclerview.widget.f fVar = (androidx.recyclerview.widget.f) obj;
            List list = (List) eVar.f19363d;
            androidx.recyclerview.widget.w wVar = (androidx.recyclerview.widget.w) this.f16602b;
            Runnable runnable = (Runnable) eVar.f19364e;
            List list2 = fVar.f19375f;
            fVar.f19374e = list;
            fVar.f19375f = Collections.unmodifiableList(list);
            wVar.a(fVar.f19370a);
            fVar.a(runnable);
        }
    }

    private void i() {
        tb.s sVar;
        lb.o oVar = ((sb.c) this.f16603c).f112226a.f82610g;
        String str = (String) this.f16602b;
        synchronized (oVar.f82647k) {
            try {
                lb.a1 c13 = oVar.c(str);
                sVar = c13 != null ? c13.f82558a : null;
            } finally {
            }
        }
        if (sVar == null || !sVar.e()) {
            return;
        }
        synchronized (((sb.c) this.f16603c).f112228c) {
            ((sb.c) this.f16603c).f112231f.put(b7.c.q(sVar), sVar);
            Object obj = this.f16603c;
            ((sb.c) this.f16603c).f112232g.put(b7.c.q(sVar), pb.m.a(((sb.c) obj).f112233h, sVar, ((sb.c) obj).f112227b.f125445b, (sb.c) obj));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:234:0x072e, code lost:
    
        if (android.text.TextUtils.isEmpty(r1.f95193m) == false) goto L723;
     */
    /* JADX WARN: Removed duplicated region for block: B:221:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x018c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 2896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.j.run():void");
    }

    public final String toString() {
        switch (this.f16601a) {
            case 3:
                return j.class.getSimpleName() + "," + ((g0.c) this.f16603c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ j(Object obj, Object obj2, int i13) {
        this.f16601a = i13;
        this.f16602b = obj;
        this.f16603c = obj2;
    }
}
