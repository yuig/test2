package androidx.lifecycle;

import android.os.Looper;
import do2.t2;
import do2.u2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class b0 extends s {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f18586b;

    /* renamed from: c, reason: collision with root package name */
    public p.a f18587c;

    /* renamed from: d, reason: collision with root package name */
    public r f18588d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f18589e;

    /* renamed from: f, reason: collision with root package name */
    public int f18590f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18591g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f18592h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f18593i;

    /* renamed from: j, reason: collision with root package name */
    public final t2 f18594j;

    public b0(z provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f18674a = new AtomicReference(null);
        this.f18586b = true;
        this.f18587c = new p.a();
        r rVar = r.INITIALIZED;
        this.f18588d = rVar;
        this.f18593i = new ArrayList();
        this.f18589e = new WeakReference(provider);
        this.f18594j = u2.a(rVar);
    }

    @Override // androidx.lifecycle.s
    public final void a(y object) {
        x mVar;
        z zVar;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        r rVar = this.f18588d;
        r initialState = r.DESTROYED;
        if (rVar != initialState) {
            initialState = r.INITIALIZED;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        a0 a0Var = new a0();
        Intrinsics.f(object);
        HashMap hashMap = d0.f18609a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z13 = object instanceof x;
        boolean z14 = object instanceof f;
        if (z13 && z14) {
            mVar = new h((f) object, (x) object);
        } else if (z14) {
            mVar = new h((f) object, null);
        } else if (z13) {
            mVar = (x) object;
        } else {
            Class<?> cls = object.getClass();
            if (d0.c(cls) == 2) {
                Object obj = d0.f18610b.get(cls);
                Intrinsics.f(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    d0.a((Constructor) list.get(0), object);
                    mVar = new e();
                } else {
                    int size = list.size();
                    j[] jVarArr = new j[size];
                    for (int i13 = 0; i13 < size; i13++) {
                        d0.a((Constructor) list.get(i13), object);
                        jVarArr[i13] = null;
                    }
                    mVar = new e(jVarArr);
                }
            } else {
                mVar = new m(object);
            }
        }
        a0Var.f18581b = mVar;
        a0Var.f18580a = initialState;
        if (((a0) this.f18587c.c(object, a0Var)) == null && (zVar = (z) this.f18589e.get()) != null) {
            boolean z15 = this.f18590f != 0 || this.f18591g;
            r c13 = c(object);
            this.f18590f++;
            while (a0Var.f18580a.compareTo(c13) < 0 && this.f18587c.f98280e.containsKey(object)) {
                this.f18593i.add(a0Var.f18580a);
                o oVar = q.Companion;
                r rVar2 = a0Var.f18580a;
                oVar.getClass();
                q b13 = o.b(rVar2);
                if (b13 == null) {
                    throw new IllegalStateException("no event up from " + a0Var.f18580a);
                }
                a0Var.a(zVar, b13);
                ArrayList arrayList = this.f18593i;
                arrayList.remove(arrayList.size() - 1);
                c13 = c(object);
            }
            if (!z15) {
                h();
            }
            this.f18590f--;
        }
    }

    @Override // androidx.lifecycle.s
    public final void b(y observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        this.f18587c.d(observer);
    }

    public final r c(y yVar) {
        a0 a0Var;
        HashMap hashMap = this.f18587c.f98280e;
        p.c cVar = hashMap.containsKey(yVar) ? ((p.c) hashMap.get(yVar)).f98285d : null;
        r state1 = (cVar == null || (a0Var = (a0) cVar.f98283b) == null) ? null : a0Var.f18580a;
        ArrayList arrayList = this.f18593i;
        r rVar = arrayList.isEmpty() ^ true ? (r) ep.b.h(arrayList, 1) : null;
        r state12 = this.f18588d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (rVar == null || rVar.compareTo(state1) >= 0) ? state1 : rVar;
    }

    public final void d(String str) {
        if (this.f18586b) {
            o.b.l().f92736b.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(a.a.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(q event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.getTargetState());
    }

    public final void f(r rVar) {
        r rVar2 = this.f18588d;
        if (rVar2 == rVar) {
            return;
        }
        if (rVar2 == r.INITIALIZED && rVar == r.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + rVar + ", but was " + this.f18588d + " in component " + this.f18589e.get()).toString());
        }
        this.f18588d = rVar;
        if (this.f18591g || this.f18590f != 0) {
            this.f18592h = true;
            return;
        }
        this.f18591g = true;
        h();
        this.f18591g = false;
        if (this.f18588d == r.DESTROYED) {
            this.f18587c = new p.a();
        }
    }

    public final void g(r state) {
        Intrinsics.checkNotNullParameter(state, "state");
        d("setCurrentState");
        f(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r8.f18592h = false;
        r8.f18594j.i(r8.f18588d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.b0.h():void");
    }
}
