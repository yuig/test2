package ug1;

import com.pinterest.api.model.cl;
import com.pinterest.api.model.e40;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView;
import h32.t;
import java.util.HashMap;
import java.util.Iterator;
import kh2.u2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import nx.d0;

/* loaded from: classes5.dex */
public final class e extends yk1.b {

    /* renamed from: a, reason: collision with root package name */
    public final v7 f122161a;

    /* renamed from: b, reason: collision with root package name */
    public final d0 f122162b;

    /* renamed from: c, reason: collision with root package name */
    public final g70.h f122163c;

    /* renamed from: d, reason: collision with root package name */
    public t f122164d;

    /* renamed from: e, reason: collision with root package name */
    public HashMap f122165e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f122166f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v7 board, d0 pinalytics, g70.h boardNavigator) {
        super(0);
        Intrinsics.checkNotNullParameter(board, "board");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(boardNavigator, "boardNavigator");
        this.f122161a = board;
        this.f122162b = pinalytics;
        this.f122163c = boardNavigator;
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        Object obj;
        String c13;
        tg1.d view = (tg1.d) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3(view);
        v7 v7Var = this.f122161a;
        String a13 = v7Var.a1();
        tg1.c cVar = null;
        if (a13 == null || z.j(a13)) {
            String b13 = v7Var.b1();
            if (b13 == null || z.j(b13)) {
                Iterator it = kh2.d.U0(v7Var).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (((e40) obj).c() != null) {
                            break;
                        }
                    }
                }
                e40 e40Var = (e40) obj;
                c13 = e40Var != null ? e40Var.c() : null;
            } else {
                c13 = v7Var.b1();
            }
        } else {
            c13 = v7Var.a1();
        }
        String j13 = v7Var.j1();
        String A = kh2.d.A(v7Var);
        String uid = v7Var.getUid();
        cl T0 = v7Var.T0();
        if (com.bumptech.glide.d.o0(T0 != null ? T0.k() : null)) {
            Intrinsics.checkNotNullParameter(v7Var, "<this>");
            cl T02 = v7Var.T0();
            wy0 i13 = T02 != null ? T02.i() : null;
            if (i13 == null) {
                i13 = v7Var.k1();
            }
            if (i13 != null) {
                cVar = new tg1.c(i13.getUid(), i13.Z2(), dl2.b.s0(i13), i13.q2());
            }
        }
        Intrinsics.f(uid);
        tg1.e model = new tg1.e(uid, c13, j13, A, cVar);
        SpotlightBoardBaseView spotlightBoardBaseView = (SpotlightBoardBaseView) view;
        Intrinsics.checkNotNullParameter(model, "model");
        spotlightBoardBaseView.getF48596i().loadUrl(c13);
        spotlightBoardBaseView.getF48597j().i(new wg1.g(model, 0));
        spotlightBoardBaseView.getF48598k().i(new wg1.g(model, 1));
        spotlightBoardBaseView.getF48600m().i(new wg1.g(model, 2));
        spotlightBoardBaseView.getF48601n().H2(new wg1.g(model, 3));
        spotlightBoardBaseView.getF48599l().setVisibility(cVar == null ? 8 : 0);
        spotlightBoardBaseView.setContentDescription(spotlightBoardBaseView.getResources().getString(i82.f.content_description_today_article_view, j13));
    }

    public final HashMap p3() {
        HashMap hashMap;
        HashMap hashMap2 = this.f122165e;
        if (hashMap2 != null) {
            hashMap = new HashMap();
            hashMap.putAll(hashMap2);
        } else {
            hashMap = new HashMap();
        }
        hashMap.putAll(u2.S(this.f122161a));
        Integer num = this.f122166f;
        bs1.c.G1("grid_index", num != null ? num.toString() : null, hashMap);
        Integer num2 = this.f122166f;
        bs1.c.G1("board_index", num2 != null ? num2.toString() : null, hashMap);
        return hashMap;
    }
}
