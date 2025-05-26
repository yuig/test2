package sw0;

import android.content.Context;
import h32.f1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public boolean f115584b;

    /* renamed from: a, reason: collision with root package name */
    public final xk2.v f115583a = xk2.m.b(k.f115504q);

    /* renamed from: c, reason: collision with root package name */
    public final xk2.v f115585c = xk2.m.b(k.f115502o);

    /* renamed from: d, reason: collision with root package name */
    public final xk2.v f115586d = xk2.m.b(k.f115503p);

    public static final void a(w wVar, t tVar) {
        vb0.j.f125466a.R(wVar.e().isWriteLockedByCurrentThread(), "Cache must be write locked", tb0.p.MEDIA_GALLERY, new Object[0]);
        String str = tVar.f115574a;
        File file = new File(str);
        String parent = file.getParent();
        if (parent == null) {
            parent = "";
        }
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        String str2 = name == null ? "" : name;
        if (wVar.d().get(parent) == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(tVar);
            wVar.d().put(parent, new s(parent, str2, tVar.f115574a, tVar.f115576c, arrayList));
            return;
        }
        s sVar = (s) wVar.d().get(parent);
        if (sVar != null) {
            sVar.f115573e.add(tVar);
            long j13 = sVar.f115572d;
            long j14 = tVar.f115576c;
            if (j14 > j13) {
                Intrinsics.checkNotNullParameter(str, "<set-?>");
                sVar.f115571c = str;
                sVar.f115572d = j14;
            }
        }
    }

    public final void b() {
        vb0.j.f125466a.R(e().getReadLockCount() != 0, "Cache must be read locked", tb0.p.MEDIA_GALLERY, new Object[0]);
    }

    public final List c() {
        b();
        Collection values = d().values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Collection collection = values;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((s) it.next()).f115573e);
        }
        return CollectionsKt.x0(kotlin.collections.g0.r(arrayList), new u(1));
    }

    public final HashMap d() {
        return (HashMap) this.f115585c.getValue();
    }

    public final ReentrantReadWriteLock e() {
        return (ReentrantReadWriteLock) this.f115583a.getValue();
    }

    public final List f(String dirKey) {
        Intrinsics.checkNotNullParameter(dirKey, "dirKey");
        b();
        s sVar = (s) d().get(dirKey);
        if (sVar == null) {
            return kotlin.collections.q0.f80391a;
        }
        return CollectionsKt.x0(sVar.f115573e, new u(2));
    }

    public final void g(Context context, nx.d0 pinalytics, boolean z13) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        ReentrantReadWriteLock.ReadLock readLock = e().readLock();
        readLock.lock();
        try {
            boolean z14 = this.f115584b;
            xk2.v vVar = this.f115586d;
            if (z14 == z13 && !((AtomicBoolean) vVar.getValue()).get() && (!d().isEmpty())) {
                return;
            }
            Unit unit = Unit.f80348a;
            readLock.unlock();
            ((AtomicBoolean) vVar.getValue()).set(false);
            kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
            kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
            xk2.v vVar2 = y.f115589f;
            v vVar3 = new v(this, z13, context, h0Var, h0Var2);
            long nanoTime = System.nanoTime();
            vVar3.invoke();
            String valueOf = String.valueOf((System.nanoTime() - nanoTime) / 1.0E9f);
            pinalytics.g(f1.MEDIA_GALLERY_PERFORMANCE_STATS, "", ep.b.o("media_gallery_performance_log", "Populate:" + z13 + ":" + h0Var.f80426a + ":" + h0Var2.f80426a + ":" + valueOf), false);
        } finally {
            readLock.unlock();
        }
    }
}
