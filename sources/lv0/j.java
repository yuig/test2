package lv0;

import com.pinterest.ui.grid.PinterestRecyclerView;
import jk2.l1;
import jv0.o;
import kotlin.jvm.internal.Intrinsics;
import kv0.s;
import mv0.y;
import nx.d0;
import sq0.c0;
import wk1.q;

/* loaded from: classes5.dex */
public final class j extends q {

    /* renamed from: a, reason: collision with root package name */
    public final o f85027a;

    /* renamed from: b, reason: collision with root package name */
    public final s f85028b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n70.o pinalytics, jv0.i itemsProvider, o viewListener, String str, aq.e eVar, uj2.q networkStateStream) {
        super(pinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(viewListener, "viewListener");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        this.f85027a = viewListener;
        d0 d0Var = pinalytics.f122379a;
        Intrinsics.checkNotNullExpressionValue(d0Var, "getPinalytics(...)");
        this.f85028b = new s(itemsProvider, str, d0Var, viewListener, eVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t3(lv0.j r7, int r8, int r9) {
        /*
            r7.getClass()
            r0 = 20
            r1 = 1
            r2 = 0
            if (r9 >= r0) goto Lb
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            yk1.n r3 = r7.getView()
            jv0.j r3 = (jv0.j) r3
            r4 = 0
            java.lang.String r5 = "addButtonHint"
            if (r3 == 0) goto L3e
            int r8 = r8 * r9
            mv0.y r3 = (mv0.y) r3
            r9 = 2
            int[] r9 = new int[r9]
            com.pinterest.gestalt.text.GestaltText r6 = r3.N0
            if (r6 == 0) goto L3a
            r6.getLocationOnScreen(r9)
            r6 = r9[r1]
            com.pinterest.ui.grid.PinterestRecyclerView r3 = r3.K0
            if (r3 == 0) goto L34
            r3.getLocationOnScreen(r9)
            r9 = r9[r1]
            int r9 = r9 + r8
            if (r9 <= r6) goto L3e
            r8 = r1
            goto L3f
        L34:
            java.lang.String r7 = "pinterestRecyclerView"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r4
        L3a:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r4
        L3e:
            r8 = r2
        L3f:
            if (r0 == 0) goto L44
            if (r8 != 0) goto L44
            goto L45
        L44:
            r1 = r2
        L45:
            yk1.n r7 = r7.getView()
            jv0.j r7 = (jv0.j) r7
            if (r7 == 0) goto L82
            mv0.y r7 = (mv0.y) r7
            android.animation.AnimatorSet r8 = r7.S0
            if (r8 == 0) goto L59
            r8.end()
            r8.cancel()
        L59:
            com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating r8 = r7.M0
            if (r8 == 0) goto L7c
            android.animation.AnimatorSet r8 = mv0.y.V8(r8, r0)
            r7.S0 = r8
            android.animation.AnimatorSet r8 = r7.T0
            if (r8 == 0) goto L6d
            r8.end()
            r8.cancel()
        L6d:
            com.pinterest.gestalt.text.GestaltText r8 = r7.N0
            if (r8 == 0) goto L78
            android.animation.AnimatorSet r8 = mv0.y.V8(r8, r1)
            r7.T0 = r8
            goto L82
        L78:
            kotlin.jvm.internal.Intrinsics.r(r5)
            throw r4
        L7c:
            java.lang.String r7 = "addButton"
            kotlin.jvm.internal.Intrinsics.r(r7)
            throw r4
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: lv0.j.t3(lv0.j, int, int):void");
    }

    @Override // wk1.q
    public final void addDataSources(vq0.a dataSources) {
        Intrinsics.checkNotNullParameter(dataSources, "dataSources");
        ((wk1.i) dataSources).b(this.f85028b);
    }

    @Override // wk1.q, yk1.p, yk1.b
    public final void onUnbind() {
        super.onUnbind();
        this.f85027a.onUnbind();
    }

    @Override // wk1.q, yk1.p
    /* renamed from: u3, reason: merged with bridge method [inline-methods] */
    public final void r3(jv0.j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((c0) view);
        this.f85027a.b(view);
        s sVar = this.f85028b;
        uj2.q K1 = sVar.K1();
        yi0.a aVar = sVar.f81008p;
        uk2.d dVar = (uk2.d) aVar.f139069c;
        ep.g gVar = new ep.g(12, h.f85024i);
        ck2.i.b(dVar, "other is null");
        int i13 = 2;
        jk2.c cVar = new jk2.c(K1, gVar, dVar, 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "withLatestFrom(...)");
        addDisposable(nl.b.s(cVar, new i(this, 0), null, null, 6));
        l1 A = sVar.K1().A(wj2.c.a());
        Intrinsics.checkNotNullExpressionValue(A, "observeOn(...)");
        addDisposable(nl.b.s(A, new i(this, 1), null, null, 6));
        y yVar = (y) view;
        PinterestRecyclerView pinterestRecyclerView = yVar.K0;
        if (pinterestRecyclerView != null) {
            pinterestRecyclerView.c(new ho0.a(yVar, i13));
        }
        addDisposable(nl.b.s((uk2.d) aVar.f139069c, new i(this, i13), null, null, 6));
    }
}
