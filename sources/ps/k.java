package ps;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.sr;
import com.pinterest.feature.pincarouselads.view.BaseRecyclerCellView;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jk2.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qa2.w;
import rr.n0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final hs1.q f101238a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f101239b;

    /* renamed from: c, reason: collision with root package name */
    public int f101240c;

    /* renamed from: d, reason: collision with root package name */
    public int f101241d;

    /* renamed from: e, reason: collision with root package name */
    public long f101242e;

    /* renamed from: f, reason: collision with root package name */
    public xj2.c f101243f;

    public k(hs1.q imageCache) {
        Intrinsics.checkNotNullParameter(imageCache, "imageCache");
        this.f101238a = imageCache;
        this.f101241d = 4;
        this.f101242e = BaseRecyclerCellView.AUTOSCROLL_DELAY;
    }

    public static void b(k kVar, List chips, ts.a size, int i13) {
        sr srVar;
        String j13;
        if ((i13 & 2) != 0) {
            size = ts.a.SIZE236x;
        }
        i completionHandler = i.f101233j;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(chips, "chips");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(completionHandler, "completionHandler");
        Iterator it = chips.iterator();
        while (it.hasNext()) {
            f30 f30Var = (f30) it.next();
            kh2.d.R0(f30Var, ts.a.SIZE236x, 2);
            Map A4 = f30Var.A4();
            if (A4 != null && (srVar = (sr) A4.get(size.getValue())) != null && (j13 = srVar.j()) != null) {
                ((hs1.m) kVar.f101238a).q(j13, null, new h(kVar, completionHandler));
            }
        }
    }

    public static /* synthetic */ void d(k kVar, int i13, boolean z13, w wVar, Function0 function0, int i14) {
        if ((i14 & 2) != 0) {
            z13 = false;
        }
        boolean z14 = z13;
        i iVar = i.f101234k;
        Function0 function02 = wVar;
        if ((i14 & 8) != 0) {
            function02 = j.f101236j;
        }
        kVar.c(i13, z14, iVar, function02, function0);
    }

    public final int a() {
        return Math.max(this.f101240c - 1, 0);
    }

    public final void c(int i13, boolean z13, Function1 onError, Function0 onCompletion, Function0 callback) {
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(onCompletion, "onCompletion");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f101239b) {
            return;
        }
        this.f101239b = true;
        int min = Math.min(i13, 4);
        this.f101241d = min;
        g gVar = z13 ? new g((min - this.f101240c) + 1, min + 1, 0L) : new g(Integer.MAX_VALUE, min, this.f101242e);
        this.f101243f = new j1(uj2.q.x(gVar.a(), BaseRecyclerCellView.AUTOSCROLL_DELAY, TimeUnit.MILLISECONDS, tk2.e.f118016b).I(gVar.b()), new ep.a(12, new hs.a(2, this, gVar)), 0).A(wj2.c.a()).F(new n0(15, new hs.a(3, this, callback)), new n0(16, onError), new f(0, onCompletion), ck2.i.f27924d);
    }

    public final void e() {
        if (this.f101239b) {
            this.f101239b = false;
            xj2.c cVar = this.f101243f;
            if (cVar != null) {
                cVar.dispose();
            }
        }
    }
}
