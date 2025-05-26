package androidx.appcompat.app;

import J.N;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.g1;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.impl.CronetLibraryLoader;
import org.chromium.net.impl.CronetUploadDataStream;
import org.chromium.net.impl.CronetUrlRequestContext;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16140a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f16141b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(hb0.d dVar) {
        this(dVar, 14);
        this.f16140a = 14;
    }

    private void b() {
        Object obj;
        synchronized (((androidx.lifecycle.h0) this.f16141b).f18631a) {
            obj = ((androidx.lifecycle.h0) this.f16141b).f18636f;
            ((androidx.lifecycle.h0) this.f16141b).f18636f = androidx.lifecycle.h0.f18630k;
        }
        ((androidx.lifecycle.h0) this.f16141b).k(obj);
    }

    public final yk2.o a() {
        ja.s sVar = (ja.s) this.f16141b;
        yk2.o oVar = new yk2.o();
        Cursor o13 = sVar.f75262a.o(new oa.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null);
        while (o13.moveToNext()) {
            try {
                oVar.add(Integer.valueOf(o13.getInt(0)));
            } finally {
            }
        }
        Unit unit = Unit.f80348a;
        dl2.b.J(o13, null);
        yk2.o a13 = g1.a(oVar);
        if (!a13.f139270a.isEmpty()) {
            if (((ja.s) this.f16141b).f75269h == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            oa.i iVar = ((ja.s) this.f16141b).f75269h;
            if (iVar == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            iVar.G();
        }
        return a13;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    @Override // java.lang.Runnable
    public final void run() {
        Set set;
        ArrayList arrayList;
        switch (this.f16140a) {
            case 0:
                n0 n0Var = (n0) this.f16141b;
                if ((n0Var.Z & 1) != 0) {
                    n0Var.A(0);
                }
                if ((n0Var.Z & 4096) != 0) {
                    n0Var.A(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_STL_SHOPPING_MODULE);
                }
                n0Var.Y = false;
                n0Var.Z = 0;
                return;
            case 1:
                t3.c0 c0Var = (t3.c0) this.f16141b;
                c0Var.removeCallbacks(this);
                MotionEvent motionEvent = c0Var.f115894m0;
                if (motionEvent != null) {
                    r3 = motionEvent.getToolType(0) == 3 ? 1 : 0;
                    int actionMasked = motionEvent.getActionMasked();
                    if (r3 != 0) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    c0Var.I(motionEvent, (actionMasked == 7 || actionMasked == 9) ? 7 : 2, c0Var.f115896n0, false);
                    return;
                }
                return;
            case 2:
                b();
                return;
            case 3:
                ((l8.v) this.f16141b).m();
                return;
            case 4:
                ReentrantReadWriteLock.ReadLock readLock = ((ja.s) this.f16141b).f75262a.f75186i.readLock();
                Intrinsics.checkNotNullExpressionValue(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    try {
                        try {
                        } catch (IllegalStateException e13) {
                            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e13);
                            set = kotlin.collections.s0.f80394a;
                        }
                    } catch (SQLiteException e14) {
                        Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e14);
                        set = kotlin.collections.s0.f80394a;
                    }
                    if (((ja.s) this.f16141b).c() && ((ja.s) this.f16141b).f75267f.compareAndSet(true, false) && !((ja.s) this.f16141b).f75262a.g().getWritableDatabase().R1()) {
                        oa.b writableDatabase = ((ja.s) this.f16141b).f75262a.g().getWritableDatabase();
                        writableDatabase.e0();
                        try {
                            set = a();
                            writableDatabase.c0();
                            if (!set.isEmpty()) {
                                ja.s sVar = (ja.s) this.f16141b;
                                synchronized (sVar.f75272k) {
                                    try {
                                        Iterator it = sVar.f75272k.iterator();
                                        while (true) {
                                            p.e eVar = (p.e) it;
                                            if (eVar.hasNext()) {
                                                ((ja.q) ((Map.Entry) eVar.next()).getValue()).a(set);
                                            } else {
                                                Unit unit = Unit.f80348a;
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                                return;
                            }
                            return;
                        } finally {
                            writableDatabase.p0();
                        }
                    }
                    return;
                } finally {
                    readLock.unlock();
                    ((ja.s) this.f16141b).getClass();
                }
            case 5:
                ViewPager viewPager = (ViewPager) this.f16141b;
                viewPager.E(0);
                viewPager.t();
                return;
            case 6:
                com.bumptech.glide.o oVar = (com.bumptech.glide.o) this.f16141b;
                oVar.f29832c.h(oVar);
                return;
            case 7:
                pd.c cVar = (pd.c) this.f16141b;
                cVar.getClass();
                while (true) {
                    try {
                        cVar.b((pd.b) cVar.f99639c.remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            case 8:
                yh.f fVar = (yh.f) this.f16141b;
                long j13 = yh.f.b(fVar.f139041a).getLong("app_set_id_last_used_time", -1L);
                long j14 = j13 != -1 ? j13 + 33696000000L : -1L;
                if (j14 == -1 || System.currentTimeMillis() <= j14) {
                    return;
                }
                Context context = fVar.f139041a;
                if (!yh.f.b(context).edit().remove("app_set_id").commit()) {
                    String valueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", valueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(valueOf) : new String("Failed to clear app set ID generated for App "));
                }
                if (context.getSharedPreferences("app_set_id_storage", 0).edit().remove("app_set_id_last_used_time").commit()) {
                    return;
                }
                String valueOf2 = String.valueOf(context.getPackageName());
                Log.e("AppSet", valueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(valueOf2) : new String("Failed to clear app set ID last used time for App "));
                return;
            case 9:
                ti.a aVar = (ti.a) this.f16141b;
                synchronized (aVar.f117681a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f117690j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f117683c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                Context context2 = (Context) this.f16141b;
                AtomicReference atomicReference = ik.a.f72383e;
                try {
                    jk.w b13 = jk.w.b(context2);
                    synchronized (b13) {
                        b13.f79903f = true;
                        b13.a();
                    }
                    return;
                } catch (SecurityException unused2) {
                    Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    return;
                }
            case 11:
                try {
                    ((ik.a) this.f16141b).f72384a.d();
                    return;
                } catch (Exception e15) {
                    Log.e("SplitCompat", "Failed to cleanup splitcompat storage", e15);
                    return;
                }
            case 12:
                w6.b bVar = ((p000do.b) this.f16141b).f55642a;
                ((Future) bVar.f128110d).cancel(true);
                bVar.f128107a.clear();
                bVar.b(null);
                return;
            case 13:
                w6.b bVar2 = (w6.b) this.f16141b;
                File[] listFiles = ((File) bVar2.f128109c).listFiles();
                if (listFiles == null) {
                    return;
                }
                int length = listFiles.length;
                while (r3 < length) {
                    bVar2.c(listFiles[r3].getName());
                    r3++;
                }
                return;
            case 14:
                hb0.d dVar = (hb0.d) this.f16141b;
                if (dVar != null) {
                    dVar.e();
                    return;
                }
                return;
            case 15:
                se0.o oVar2 = (se0.o) this.f16141b;
                oVar2.unscheduleSelf(this);
                float f13 = oVar2.f112407e;
                float f14 = (oVar2.f112411i + f13) % 360.0f;
                if (f13 != f14) {
                    oVar2.f112407e = f14;
                    oVar2.invalidateSelf();
                }
                if (oVar2.f112409g) {
                    oVar2.scheduleSelf(oVar2.f112417o, SystemClock.uptimeMillis() + oVar2.f112410h);
                    return;
                }
                return;
            case 16:
                Object obj = this.f16141b;
                try {
                    ((tq0.h) obj).p(false, false);
                } catch (IllegalArgumentException e16) {
                    HashSet hashSet = tb0.h.f117076w;
                    tb0.h hVar = tb0.g.f117075a;
                    Object[] objArr = new Object[2];
                    tq0.h hVar2 = (tq0.h) obj;
                    objArr[0] = Boolean.valueOf(hVar2.s());
                    objArr[1] = hVar2.f119004a != null ? "non-null" : "null";
                    hVar.h(j1.U("isActive=%s, _handler=%s", objArr));
                    hVar.p(e16);
                }
                Handler handler = ((tq0.h) obj).f119004a;
                if (handler != null) {
                    handler.postDelayed(this, 30000L);
                    return;
                }
                return;
            case 17:
                androidx.appcompat.widget.m0 m0Var = (androidx.appcompat.widget.m0) this.f16141b;
                ((at1.h) m0Var.f16645d).onResourcesReady(m0Var.f16643b);
                return;
            case 18:
                at1.e eVar2 = (at1.e) this.f16141b;
                at1.f fVar2 = eVar2.f20454e;
                CountDownLatch countDownLatch = eVar2.f20451b;
                at1.h hVar3 = eVar2.f20452c;
                at1.j jVar = eVar2.f20453d;
                Future future = fVar2.f20457c;
                try {
                    if (future == null) {
                        throw new IllegalStateException("Cannot call completeCreationFromWorkerThread when there's no pending task");
                    }
                    try {
                        fVar2.f20456b = future.get();
                        fVar2.f20455a.getClass();
                        at1.i iVar = (at1.i) jVar;
                        iVar.f20462d = 1 | iVar.f20462d;
                    } catch (InterruptedException unused3) {
                        hVar3.onResourcesError("Fatal Error! InterruptedException caught while trying to retrieve newly created resource");
                        fVar2.f20457c = null;
                        ArrayList arrayList2 = fVar2.f20458d;
                        if (arrayList2 != null) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                ((CountDownLatch) it2.next()).countDown();
                            }
                        }
                    } catch (ExecutionException unused4) {
                        hVar3.onResourcesError("Fatal Error! ExecutionException caught while trying to retrieve newly created resource");
                        fVar2.f20457c = null;
                        ArrayList arrayList3 = fVar2.f20458d;
                        if (arrayList3 != null) {
                            Iterator it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                ((CountDownLatch) it3.next()).countDown();
                            }
                        }
                    }
                    if (arrayList != null) {
                        break;
                    }
                    return;
                } finally {
                    fVar2.f20457c = null;
                    ArrayList arrayList4 = fVar2.f20458d;
                    if (arrayList4 != null) {
                        Iterator it4 = arrayList4.iterator();
                        while (it4.hasNext()) {
                            ((CountDownLatch) it4.next()).countDown();
                        }
                        fVar2.f20458d.clear();
                        fVar2.f20458d = null;
                    }
                    countDownLatch.countDown();
                }
            case 19:
                Object obj2 = this.f16141b;
                try {
                    ((CronetUploadDataStream) obj2).f97378c.d();
                    ((CronetUploadDataStream) obj2).f97377b.close();
                    return;
                } catch (Exception e17) {
                    Log.e("cr_CronetUploadDataStream", "Exception thrown when closing", e17);
                    return;
                }
            default:
                CronetLibraryLoader.b();
                synchronized (((CronetUrlRequestContext) this.f16141b).f97415a) {
                    Object obj3 = this.f16141b;
                    N.M6Dz0nZ5(((CronetUrlRequestContext) obj3).f97419e, (CronetUrlRequestContext) obj3);
                }
                return;
        }
    }

    public /* synthetic */ v(Object obj, int i13) {
        this.f16140a = i13;
        this.f16141b = obj;
    }

    public /* synthetic */ v(yh.f fVar) {
        this.f16140a = 8;
        this.f16141b = fVar;
    }
}
