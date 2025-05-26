package pr0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ao2.m0;
import ar0.s;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import ey.c3;
import ey.e0;
import h61.h;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import ky.k;
import m60.w;
import qa2.h0;
import s92.i;
import s92.o;
import uj2.q;

/* loaded from: classes.dex */
public final class g extends s {

    /* renamed from: a, reason: collision with root package name */
    public final a f101166a;

    /* renamed from: b, reason: collision with root package name */
    public final q f101167b;

    /* renamed from: c, reason: collision with root package name */
    public final c f101168c;

    /* renamed from: d, reason: collision with root package name */
    public final w f101169d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f101170e;

    /* renamed from: f, reason: collision with root package name */
    public final Class f101171f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f101172g;

    /* renamed from: h, reason: collision with root package name */
    public final i f101173h;

    /* renamed from: i, reason: collision with root package name */
    public final c3 f101174i;

    /* renamed from: j, reason: collision with root package name */
    public final qc2.d f101175j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f101176k;

    /* renamed from: l, reason: collision with root package name */
    public xj2.c f101177l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f101178m;

    /* renamed from: n, reason: collision with root package name */
    public final b f101179n;

    public g(a aVar, q imageDrawnEventObservable, c cVar, w wVar, Class cls, Class cls2, h hVar, i iVar, c3 c3Var, int i13) {
        aVar = (i13 & 1) != 0 ? null : aVar;
        cVar = (i13 & 4) != 0 ? null : cVar;
        wVar = (i13 & 8) != 0 ? null : wVar;
        cls = (i13 & 16) != 0 ? null : cls;
        cls2 = (i13 & 32) != 0 ? null : cls2;
        hVar = (i13 & 64) != 0 ? null : hVar;
        iVar = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : iVar;
        c3Var = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : c3Var;
        Intrinsics.checkNotNullParameter(imageDrawnEventObservable, "imageDrawnEventObservable");
        this.f101166a = aVar;
        this.f101167b = imageDrawnEventObservable;
        this.f101168c = cVar;
        this.f101169d = wVar;
        this.f101170e = cls;
        this.f101171f = cls2;
        this.f101172g = hVar;
        this.f101173h = iVar;
        this.f101174i = c3Var;
        this.f101175j = new qc2.d();
        this.f101176k = true;
        this.f101178m = true;
        if (wVar == null || cls2 == null) {
            return;
        }
        b bVar = new b(this);
        this.f101179n = bVar;
        wVar.h(bVar);
    }

    public static void q(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        new py.e(pinUid).i();
    }

    @Override // ar0.s, ar0.x
    public final void a(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        n();
        super.a(recyclerView);
    }

    @Override // ar0.s, ar0.y
    public final void c(RecyclerView recyclerView, int i13, int i14) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.c(recyclerView, i13, i14);
        p(recyclerView, (i13 == 0 && i14 == 0) ? false : true);
    }

    @Override // ar0.s, ar0.x
    public final void f(RecyclerView recyclerView) {
        w wVar;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        b bVar = this.f101179n;
        if (bVar != null && (wVar = this.f101169d) != null && wVar.c(bVar)) {
            wVar.j(bVar);
        }
        super.f(recyclerView);
    }

    @Override // ar0.s, ar0.x
    public final void h(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.h(recyclerView);
        s(recyclerView);
    }

    @Override // ar0.s
    public final void j(RecyclerView recyclerView, View view) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        super.j(recyclerView, view);
        c cVar = this.f101168c;
        if (cVar != null) {
            cVar.a(view);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ar0.s
    public final void k(RecyclerView recyclerView, View view) {
        wa2.a T;
        String pinUid;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(view, "view");
        if ((view instanceof h0) && (T = com.bumptech.glide.d.T((qa2.b) view)) != null && !T.h() && (pinUid = ((h0) view).getPinUid()) != null) {
            Intrinsics.checkNotNullParameter(pinUid, "pinUid");
            new py.e(pinUid).i();
        }
        super.k(recyclerView, view);
    }

    public final void n() {
        xj2.c cVar = this.f101177l;
        if (cVar != null && !cVar.isDisposed()) {
            cVar.dispose();
        }
        this.f101177l = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(android.view.ViewGroup r18, pr0.d r19) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pr0.g.o(android.view.ViewGroup, pr0.d):void");
    }

    public final void p(RecyclerView recyclerView, boolean z13) {
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (this.f101178m) {
            i iVar = this.f101173h;
            c3 c3Var = this.f101174i;
            Object obj = this.f101172g;
            a aVar = this.f101166a;
            if (z13) {
                o(recyclerView, null);
                if (aVar != null) {
                    aVar.b(obj);
                }
                if (iVar != null && c3Var != null) {
                    c3Var.a(new my.e(iVar, o.ABORTED));
                }
                n();
                this.f101178m = false;
                return;
            }
            ny.f feedPinCellTypeCounts = new ny.f();
            feedPinCellTypeCounts.f92519a = 0;
            feedPinCellTypeCounts.f92520b = 0;
            feedPinCellTypeCounts.f92521c = 0;
            feedPinCellTypeCounts.f92522d = 0;
            feedPinCellTypeCounts.f92523e = 0;
            feedPinCellTypeCounts.f92524f = 0;
            feedPinCellTypeCounts.f92525g = 0;
            feedPinCellTypeCounts.f92526h = 0;
            e0 feedStoryContainerTypeCounts = new e0();
            feedStoryContainerTypeCounts.f60478a = 0;
            feedStoryContainerTypeCounts.f60479b = 0;
            feedStoryContainerTypeCounts.f60480c = 0;
            Intrinsics.checkNotNullParameter(feedPinCellTypeCounts, "feedPinCellTypeCounts");
            Intrinsics.checkNotNullParameter(feedStoryContainerTypeCounts, "feedStoryContainerTypeCounts");
            d dVar = new d();
            dVar.f101157a = 0;
            dVar.f101158b = 0;
            dVar.f101159c = 0;
            dVar.f101160d = 0;
            dVar.f101161e = feedPinCellTypeCounts;
            dVar.f101162f = feedStoryContainerTypeCounts;
            o(recyclerView, dVar);
            Objects.toString(aVar);
            boolean z14 = !this.f101176k || ((i13 = dVar.f101158b) > 0 && (i14 = dVar.f101157a) > 0 && i13 >= i14);
            boolean z15 = dVar.f101159c == dVar.f101160d;
            if (z14 && z15) {
                Objects.toString(aVar);
                if (aVar != null) {
                    aVar.o(dVar.f101157a, feedPinCellTypeCounts, feedStoryContainerTypeCounts, obj);
                }
                if (iVar != null && c3Var != null) {
                    c3Var.a(new my.e(iVar, o.COMPLETE));
                }
                n();
                this.f101178m = false;
            }
        }
    }

    public final void r(boolean z13) {
        this.f101176k = z13;
        if (z13) {
            return;
        }
        q qVar = this.f101167b;
        boolean z14 = qVar instanceof k;
        w wVar = this.f101169d;
        if (z14) {
            if (wVar != null) {
                wVar.d(new ky.i());
            }
        } else if (qVar instanceof ky.d) {
            if (m0.f20172b) {
                new py.i("", s92.c.UNKNOWN, null, 0, 0).i();
            } else if (wVar != null) {
                wVar.d(new ky.b());
            }
        }
    }

    public final void s(RecyclerView recyclerView) {
        n();
        this.f101177l = this.f101167b.E(new ug0.d(18, new i2.i(18, this, recyclerView)), new ug0.d(19, f.f101165i));
    }
}
