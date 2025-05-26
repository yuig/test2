package oh1;

import kotlin.jvm.internal.Intrinsics;
import wt1.c0;
import wt1.d0;

/* loaded from: classes5.dex */
public final class y extends m {
    public final m60.w F;
    public final String G;
    public final x H;
    public final mh1.d I;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public y(nh1.a r25, m60.w r26, yk1.v r27, x02.u r28, x02.c r29, a12.d r30, x02.p1 r31, x02.i2 r32, nx.f0 r33, uk1.e r34, uj2.q r35, lh0.j4 r36, rg0.s r37, qh1.e r38, ap.o r39, nx.d1 r40, b60.b r41, lh0.v0 r42, lb0.r r43, lb0.q r44, androidx.appcompat.widget.c2 r45) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: oh1.y.<init>(nh1.a, m60.w, yk1.v, x02.u, x02.c, a12.d, x02.p1, x02.i2, nx.f0, uk1.e, uj2.q, lh0.j4, rg0.s, qh1.e, ap.o, nx.d1, b60.b, lh0.v0, lb0.r, lb0.q, androidx.appcompat.widget.c2):void");
    }

    @Override // oh1.m, wk1.q, sq0.a0
    public final void onRecyclerRefresh() {
        this.f94539u.clear();
        super.onRecyclerRefresh();
    }

    @Override // wk1.q
    public final void onStateUpdated(c0 state, d0 remoteList) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(remoteList, "remoteList");
        super.onStateUpdated(state, remoteList);
        if (isBound() && (state instanceof wt1.y) && ((mh1.d) remoteList).f49127q.size() == 0) {
            yk1.n view = getView();
            Intrinsics.checkNotNullExpressionValue(view, "<get-view>(...)");
            rh1.k kVar = (rh1.k) ((com.pinterest.feature.unifiedcomments.d) view);
            if (kVar.Y8().g0(null)) {
                return;
            }
            kVar.Y8().H0();
        }
    }

    @Override // oh1.m
    public final mh1.d x3() {
        return this.I;
    }

    @Override // oh1.m
    public final r z3() {
        return this.H;
    }
}
