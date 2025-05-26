package g0;

import androidx.appcompat.app.z;
import com.google.common.util.concurrent.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class r implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public List f63218a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f63219b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f63220c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicInteger f63221d;

    /* renamed from: e, reason: collision with root package name */
    public final c0 f63222e = com.bumptech.glide.d.L(new gc.c(this, 18));

    /* renamed from: f, reason: collision with root package name */
    public r4.i f63223f;

    public r(ArrayList arrayList, boolean z13, f0.d dVar) {
        this.f63218a = arrayList;
        this.f63219b = new ArrayList(arrayList.size());
        this.f63220c = z13;
        this.f63221d = new AtomicInteger(arrayList.size());
        d(new z(this, 6), l3.c.s());
        if (this.f63218a.isEmpty()) {
            this.f63223f.b(new ArrayList(this.f63219b));
            return;
        }
        for (int i13 = 0; i13 < this.f63218a.size(); i13++) {
            this.f63219b.add(null);
        }
        List list = this.f63218a;
        for (int i14 = 0; i14 < list.size(); i14++) {
            c0 c0Var = (c0) list.get(i14);
            c0Var.d(new d.d(this, i14, c0Var, 4), dVar);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z13) {
        List list = this.f63218a;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).cancel(z13);
            }
        }
        return this.f63222e.cancel(z13);
    }

    @Override // com.google.common.util.concurrent.c0
    public final void d(Runnable runnable, Executor executor) {
        this.f63222e.d(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j13, TimeUnit timeUnit) {
        return (List) this.f63222e.get(j13, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f63222e.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f63222e.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        List<c0> list = this.f63218a;
        c0 c0Var = this.f63222e;
        if (list != null && !c0Var.isDone()) {
            loop0: for (c0 c0Var2 : list) {
                while (!c0Var2.isDone()) {
                    try {
                        c0Var2.get();
                    } catch (Error e13) {
                        throw e13;
                    } catch (InterruptedException e14) {
                        throw e14;
                    } catch (Throwable unused) {
                        if (this.f63220c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) c0Var.get();
    }
}
