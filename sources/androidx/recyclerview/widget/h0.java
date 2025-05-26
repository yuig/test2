package androidx.recyclerview.widget;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h0 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal f19434e = new ThreadLocal();

    /* renamed from: f, reason: collision with root package name */
    public static final s3.o f19435f = new s3.o(2);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f19436a;

    /* renamed from: b, reason: collision with root package name */
    public long f19437b;

    /* renamed from: c, reason: collision with root package name */
    public long f19438c;

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f19439d;

    public static y2 c(RecyclerView recyclerView, int i13, long j13) {
        int g13 = recyclerView.f19226f.f19441a.g();
        for (int i14 = 0; i14 < g13; i14++) {
            y2 w13 = RecyclerView.w1(recyclerView.f19226f.f19441a.f(i14));
            if (w13.f19719c == i13 && !w13.t()) {
                return null;
            }
        }
        q2 q2Var = recyclerView.f19220c;
        try {
            recyclerView.c2();
            y2 o13 = q2Var.o(i13, j13);
            if (o13 != null) {
                if (!o13.s() || o13.t()) {
                    q2Var.a(o13, false);
                } else {
                    q2Var.l(o13.f19717a);
                }
            }
            recyclerView.d2(false);
            return o13;
        } catch (Throwable th3) {
            recyclerView.d2(false);
            throw th3;
        }
    }

    public final void a(RecyclerView recyclerView, int i13, int i14) {
        if (recyclerView.f19252s) {
            int[] iArr = RecyclerView.A0;
            if (this.f19437b == 0) {
                this.f19437b = recyclerView.K1();
                recyclerView.post(this);
            }
        }
        g1.i iVar = recyclerView.f19229g0;
        iVar.f63271a = i13;
        iVar.f63272b = i14;
    }

    public final void b(long j13) {
        g0 g0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        g0 g0Var2;
        ArrayList arrayList = this.f19436a;
        int size = arrayList.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i14);
            if (recyclerView3.getWindowVisibility() == 0) {
                g1.i iVar = recyclerView3.f19229g0;
                iVar.c(recyclerView3, false);
                i13 += iVar.f63274d;
            }
        }
        ArrayList arrayList2 = this.f19439d;
        arrayList2.ensureCapacity(i13);
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i16);
            if (recyclerView4.getWindowVisibility() == 0) {
                g1.i iVar2 = recyclerView4.f19229g0;
                int abs = Math.abs(iVar2.f63272b) + Math.abs(iVar2.f63271a);
                for (int i17 = 0; i17 < iVar2.f63274d * 2; i17 += 2) {
                    if (i15 >= arrayList2.size()) {
                        g0Var2 = new g0();
                        arrayList2.add(g0Var2);
                    } else {
                        g0Var2 = (g0) arrayList2.get(i15);
                    }
                    int[] iArr = iVar2.f63273c;
                    int i18 = iArr[i17 + 1];
                    g0Var2.f19414a = i18 <= abs;
                    g0Var2.f19415b = abs;
                    g0Var2.f19416c = i18;
                    g0Var2.f19417d = recyclerView4;
                    g0Var2.f19418e = iArr[i17];
                    i15++;
                }
            }
        }
        Collections.sort(arrayList2, f19435f);
        for (int i19 = 0; i19 < arrayList2.size() && (recyclerView = (g0Var = (g0) arrayList2.get(i19)).f19417d) != null; i19++) {
            y2 c13 = c(recyclerView, g0Var.f19418e, g0Var.f19414a ? Long.MAX_VALUE : j13);
            if (c13 != null && c13.f19718b != null && c13.s() && !c13.t() && (recyclerView2 = (RecyclerView) c13.f19718b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f19226f.f19441a.g() != 0) {
                    g2 g2Var = recyclerView2.M;
                    if (g2Var != null) {
                        g2Var.k();
                    }
                    l2 l2Var = recyclerView2.f19242n;
                    q2 q2Var = recyclerView2.f19220c;
                    if (l2Var != null) {
                        l2Var.D0(q2Var);
                        recyclerView2.f19242n.E0(q2Var);
                    }
                    q2Var.f19602a.clear();
                    q2Var.j();
                }
                g1.i iVar3 = recyclerView2.f19229g0;
                iVar3.c(recyclerView2, true);
                if (iVar3.f63274d != 0) {
                    try {
                        int i23 = j5.k.f74682a;
                        Trace.beginSection("RV Nested Prefetch");
                        w2 w2Var = recyclerView2.f19231h0;
                        b2 b2Var = recyclerView2.f19240m;
                        w2Var.f19680d = 1;
                        w2Var.f19681e = b2Var.e();
                        w2Var.f19683g = false;
                        w2Var.f19684h = false;
                        w2Var.f19685i = false;
                        for (int i24 = 0; i24 < iVar3.f63274d * 2; i24 += 2) {
                            c(recyclerView2, iVar3.f63273c[i24], j13);
                        }
                        Trace.endSection();
                        g0Var.a();
                    } catch (Throwable th3) {
                        int i25 = j5.k.f74682a;
                        Trace.endSection();
                        throw th3;
                    }
                }
            }
            g0Var.a();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i13 = j5.k.f74682a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f19436a;
            if (arrayList.isEmpty()) {
                this.f19437b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i14);
                if (recyclerView.getWindowVisibility() == 0) {
                    j13 = Math.max(recyclerView.getDrawingTime(), j13);
                }
            }
            if (j13 == 0) {
                this.f19437b = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j13) + this.f19438c);
                this.f19437b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th3) {
            this.f19437b = 0L;
            int i15 = j5.k.f74682a;
            Trace.endSection();
            throw th3;
        }
    }
}
