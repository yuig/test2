package lb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.y2;
import com.google.android.gms.cloudmessaging.zzq;
import com.google.android.gms.common.ConnectionResult;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import jk2.r1;
import kh2.j1;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.impl.CronetUrlRequest;

/* loaded from: classes.dex */
public final class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82680a;

    /* renamed from: b, reason: collision with root package name */
    public Object f82681b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f82682c;

    public /* synthetic */ x(int i13, Object obj, Object obj2) {
        this.f82680a = i13;
        this.f82682c = obj;
        this.f82681b = obj2;
    }

    private void a() {
        try {
            ((Runnable) this.f82682c).run();
            synchronized (((ub.j) this.f82681b).f121668d) {
                ((ub.j) this.f82681b).a();
            }
        } catch (Throwable th3) {
            synchronized (((ub.j) this.f82681b).f121668d) {
                ((ub.j) this.f82681b).a();
                throw th3;
            }
        }
    }

    private void b() {
        de.k kVar = (de.k) ((de.i) this.f82681b);
        kVar.f54516b.a();
        synchronized (kVar.f54517c) {
            synchronized (((pd.w) this.f82682c)) {
                try {
                    pd.v vVar = ((pd.w) this.f82682c).f99767a;
                    de.i iVar = (de.i) this.f82681b;
                    vVar.getClass();
                    if (vVar.f99765a.contains(new pd.u(iVar, he.g.f68947b))) {
                        ((pd.w) this.f82682c).f99788v.b();
                        pd.w wVar = (pd.w) this.f82682c;
                        de.i iVar2 = (de.i) this.f82681b;
                        wVar.getClass();
                        try {
                            ((de.k) iVar2).o(wVar.f99788v, wVar.f99784r, wVar.f99791y);
                            ((pd.w) this.f82682c).h((de.i) this.f82681b);
                        } catch (Throwable th3) {
                            throw new pd.d(th3);
                        }
                    }
                    ((pd.w) this.f82682c).d();
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        jh.j jVar;
        Throwable a13;
        int i13 = 0;
        switch (this.f82680a) {
            case 0:
                boolean isCancelled = ((com.google.common.util.concurrent.c0) this.f82681b).isCancelled();
                Object obj = this.f82682c;
                if (isCancelled) {
                    ((ao2.m) obj).cancel(null);
                    return;
                }
                try {
                    xk2.q qVar = xk2.s.f135225b;
                    ((ao2.m) obj).resumeWith(b1.b((com.google.common.util.concurrent.c0) this.f82681b));
                    return;
                } catch (ExecutionException e13) {
                    xk2.q qVar2 = xk2.s.f135225b;
                    Throwable cause = e13.getCause();
                    Intrinsics.f(cause);
                    ((ao2.m) obj).resumeWith(ue.c.m(cause));
                    return;
                }
            case 1:
                kb.b0.e().a(mb.a.f86834e, "Scheduling work " + ((tb.s) this.f82681b).f117016a);
                ((mb.a) this.f82682c).f86835a.c((tb.s) this.f82681b);
                return;
            case 2:
                a();
                return;
            case 3:
                Process.setThreadPriority(10);
                ((Runnable) this.f82681b).run();
                return;
            case 4:
                b();
                return;
            case 5:
                sd.b bVar = (sd.b) this.f82682c;
                if (bVar.f112303d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f82681b).run();
                    return;
                } catch (Throwable th3) {
                    bVar.f112302c.g(th3);
                    return;
                }
            case 6:
                hh.g gVar = (hh.g) this.f82681b;
                IBinder iBinder = (IBinder) this.f82682c;
                synchronized (gVar) {
                    if (iBinder == null) {
                        gVar.a(0, "Null service connection");
                    } else {
                        try {
                            gVar.f69114c = new tb.c(iBinder);
                            gVar.f69112a = 2;
                            ((ScheduledExecutorService) gVar.f69117f.f69125c).execute(new hh.f(gVar, i13));
                        } catch (RemoteException e14) {
                            gVar.a(0, e14.getMessage());
                        }
                    }
                }
                return;
            case 7:
                hh.g gVar2 = (hh.g) this.f82681b;
                int i14 = ((hh.i) this.f82682c).f69118a;
                synchronized (gVar2) {
                    hh.i iVar = (hh.i) gVar2.f69116e.get(i14);
                    if (iVar != null) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("Timing out request: ");
                        sb3.append(i14);
                        Log.w("MessengerIpcClient", sb3.toString());
                        gVar2.f69116e.remove(i14);
                        iVar.c(new zzq("Timed out waiting for response", null));
                        gVar2.c();
                    }
                }
                return;
            case 8:
                Object obj2 = this.f82682c;
                com.google.android.gms.common.api.internal.b0 b0Var = (com.google.android.gms.common.api.internal.b0) obj2;
                com.google.android.gms.common.api.internal.z zVar = (com.google.android.gms.common.api.internal.z) ((com.google.android.gms.common.api.internal.f) b0Var.f30793f).f30815j.get((com.google.android.gms.common.api.internal.a) b0Var.f30790c);
                if (zVar == null) {
                    return;
                }
                Object obj3 = this.f82681b;
                if (((ConnectionResult) obj3).f30732g != 0) {
                    zVar.u((ConnectionResult) obj3, null);
                    return;
                }
                b0Var.f30788a = true;
                if (((com.google.android.gms.common.api.c) b0Var.f30789b).requiresSignIn()) {
                    if (!b0Var.f30788a || (jVar = (jh.j) b0Var.f30791d) == null) {
                        return;
                    }
                    ((com.google.android.gms.common.api.c) b0Var.f30789b).getRemoteService(jVar, (Set) b0Var.f30792e);
                    return;
                }
                try {
                    Object obj4 = ((com.google.android.gms.common.api.internal.b0) obj2).f30789b;
                    ((com.google.android.gms.common.api.c) obj4).getRemoteService(null, ((com.google.android.gms.common.api.c) obj4).b());
                    return;
                } catch (SecurityException e15) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e15);
                    ((com.google.android.gms.common.api.c) b0Var.f30789b).disconnect("Failed to get service from broker.");
                    zVar.u(new ConnectionResult(10), null);
                    return;
                }
            case 9:
                jk.w wVar = ((jk.e) this.f82682c).f76330b;
                qq2.c cVar = (qq2.c) this.f82681b;
                List list = (List) cVar.f104883b;
                ArrayList g13 = jk.e.g((List) cVar.f104884c);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!list.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(list));
                }
                if (!g13.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(g13));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                wVar.c(jk.d.b(bundle));
                return;
            case 10:
                Object obj5 = (Future) this.f82681b;
                boolean z13 = obj5 instanceof tk.a;
                Object obj6 = this.f82682c;
                if (z13 && (a13 = ((tk.a) obj5).a()) != null) {
                    ((com.google.common.util.concurrent.w) obj6).onFailure(a13);
                    return;
                }
                try {
                    ((com.google.common.util.concurrent.w) obj6).onSuccess(dl2.b.H0((Future) this.f82681b));
                    return;
                } catch (ExecutionException e16) {
                    ((com.google.common.util.concurrent.w) obj6).onFailure(e16.getCause());
                    return;
                } catch (Throwable th4) {
                    ((com.google.common.util.concurrent.w) obj6).onFailure(th4);
                    return;
                }
            case 11:
                Iterator it = ((List) this.f82681b).iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    Object obj7 = this.f82682c;
                    if (!hasNext) {
                        ((List) this.f82681b).clear();
                        ((c02.u) obj7).f24476w.remove((List) this.f82681b);
                        return;
                    }
                    y2 y2Var = (y2) it.next();
                    c02.u uVar = (c02.u) obj7;
                    uVar.f24471r.add(y2Var);
                    ViewPropertyAnimator animate = y2Var.f19717a.animate();
                    c02.l lVar = uVar.f24462i;
                    ViewPropertyAnimator e17 = lVar.e(animate);
                    e17.setDuration(lVar.getDuration()).setStartDelay(lVar.w()).setInterpolator(lVar.o()).setListener(new c02.k(uVar, y2Var, e17)).start();
                }
            case 12:
                ((uj2.l) ((uj2.n) this.f82682c)).f((uj2.m) this.f82681b);
                return;
            case 13:
                ((jk2.q) this.f82682c).f76642a.c(this.f82681b);
                return;
            case 14:
                ((jk2.x) this.f82682c).f76382a.d((r1) this.f82681b);
                return;
            case 15:
                ((kk2.d) this.f82682c).f79926b.onSuccess(this.f82681b);
                return;
            case 16:
                ((ao2.m) this.f82682c).i((bo2.e) this.f82681b, Unit.f80348a);
                return;
            case 17:
                break;
            case 18:
                ((CronetUrlRequest) this.f82682c).d();
                ByteBuffer byteBuffer = (ByteBuffer) this.f82681b;
                this.f82681b = null;
                try {
                    synchronized (((CronetUrlRequest) this.f82682c).f97393f) {
                        try {
                            if (!((CronetUrlRequest) this.f82682c).h()) {
                                Object obj8 = this.f82682c;
                                ((CronetUrlRequest) obj8).f97392e = true;
                                ((CronetUrlRequest) obj8).f97397j.onReadCompleted((CronetUrlRequest) obj8, ((CronetUrlRequest) obj8).A, byteBuffer);
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Exception e18) {
                    CronetUrlRequest.b((CronetUrlRequest) this.f82682c, e18);
                    return;
                }
            default:
                sp2.j m13 = ((tb.c) this.f82681b).m();
                if (m13 == null) {
                    throw new IllegalStateException("No pending post available");
                }
                ((sp2.e) this.f82682c).c(m13);
                return;
        }
        while (true) {
            try {
                ((Runnable) this.f82681b).run();
            } catch (Throwable th5) {
                j1.l0(kotlin.coroutines.j.f80412a, th5);
            }
            ho2.i iVar2 = (ho2.i) this.f82682c;
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ho2.i.f69762i;
            Runnable o13 = iVar2.o();
            if (o13 == null) {
                return;
            }
            this.f82681b = o13;
            i13++;
            if (i13 >= 16 && iVar2.f69764d.k(iVar2)) {
                iVar2.f69764d.g(iVar2, this);
                return;
            }
        }
    }

    public final String toString() {
        switch (this.f82680a) {
            case 10:
                int i13 = 0;
                com.google.android.material.internal.a aVar = new com.google.android.material.internal.a(x.class.getSimpleName(), i13);
                com.google.common.util.concurrent.w wVar = (com.google.common.util.concurrent.w) this.f82682c;
                gi.m mVar = new gi.m(9, i13);
                ((gi.m) aVar.f32698f).f65094c = mVar;
                aVar.f32698f = mVar;
                mVar.f65095d = wVar;
                return aVar.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ x(Object obj, Object obj2, int i13) {
        this.f82680a = i13;
        this.f82681b = obj;
        this.f82682c = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(CronetUrlRequest cronetUrlRequest, int i13) {
        this(cronetUrlRequest);
        this.f82680a = 18;
    }

    public x(sp2.e eVar) {
        this.f82680a = 19;
        this.f82682c = eVar;
        this.f82681b = new tb.c(17);
    }

    public x(CronetUrlRequest cronetUrlRequest) {
        this.f82680a = 18;
        this.f82682c = cronetUrlRequest;
    }

    public x(com.google.common.util.concurrent.c0 futureToObserve, ao2.o continuation) {
        this.f82680a = 0;
        Intrinsics.checkNotNullParameter(futureToObserve, "futureToObserve");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f82681b = futureToObserve;
        this.f82682c = continuation;
    }
}
