package xo;

import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.api.model.v7;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.permissions.cell.view.BoardPermissionSettingCell;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.grid.PinterestRecyclerView;
import jk2.l1;
import kotlin.jvm.internal.Intrinsics;
import x02.a2;
import x02.x0;

/* loaded from: classes3.dex */
public final class d0 extends s implements se0.k, sq0.w, yo.a {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f135473x = 0;

    /* renamed from: d, reason: collision with root package name */
    public PinterestSwipeRefreshLayout f135474d;

    /* renamed from: e, reason: collision with root package name */
    public RecyclerView f135475e;

    /* renamed from: f, reason: collision with root package name */
    public PinterestRecyclerView f135476f;

    /* renamed from: g, reason: collision with root package name */
    public LinearLayout f135477g;

    /* renamed from: h, reason: collision with root package name */
    public GestaltText f135478h;

    /* renamed from: i, reason: collision with root package name */
    public BoardPermissionSettingCell f135479i;

    /* renamed from: j, reason: collision with root package name */
    public x0 f135480j;

    /* renamed from: k, reason: collision with root package name */
    public gi.m f135481k;

    /* renamed from: l, reason: collision with root package name */
    public m60.w f135482l;

    /* renamed from: m, reason: collision with root package name */
    public z12.a f135483m;

    /* renamed from: n, reason: collision with root package name */
    public z12.f f135484n;

    /* renamed from: o, reason: collision with root package name */
    public h12.a f135485o;

    /* renamed from: p, reason: collision with root package name */
    public f12.a f135486p;

    /* renamed from: q, reason: collision with root package name */
    public u20.d f135487q;

    /* renamed from: r, reason: collision with root package name */
    public ap.o f135488r;

    /* renamed from: s, reason: collision with root package name */
    public v7 f135489s;

    /* renamed from: t, reason: collision with root package name */
    public bp.f f135490t;

    /* renamed from: u, reason: collision with root package name */
    public ek2.j f135491u;

    /* renamed from: v, reason: collision with root package name */
    public bp.g f135492v;

    /* renamed from: w, reason: collision with root package name */
    public Boolean f135493w;

    @Override // se0.k
    public final void V1() {
        bp.g gVar = this.f135492v;
        if (gVar != null) {
            gVar.E();
        }
    }

    @Override // sq0.w
    public final void loadMoreData() {
        bp.m D;
        bp.g gVar = this.f135492v;
        if (gVar == null || (D = gVar.D()) == null) {
            return;
        }
        D.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        bp.g oVar;
        super.onAttachedToWindow();
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = this.f135474d;
        pinterestSwipeRefreshLayout.f44880n = this;
        androidx.recyclerview.widget.c0 c0Var = new androidx.recyclerview.widget.c0(this, 2);
        RecyclerView recyclerView = this.f135475e;
        recyclerView.o(c0Var);
        l2 l2Var = recyclerView.f19242n;
        if (l2Var != null) {
            ar0.g gVar = new ar0.g(l2Var);
            gVar.f20379f = this;
            recyclerView.o(gVar);
            PinterestRecyclerView pinterestRecyclerView = this.f135476f;
            ar0.g gVar2 = new ar0.g(pinterestRecyclerView.f52535e);
            gVar2.f20379f = this;
            pinterestRecyclerView.b(gVar2);
            n nVar = new n(gVar, pinterestSwipeRefreshLayout);
            v7 v7Var = this.f135489s;
            if (v7Var == null) {
                Intrinsics.r("board");
                throw null;
            }
            if (kh2.w.i0(v7Var)) {
                v7 v7Var2 = this.f135489s;
                if (v7Var2 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                bp.f fVar = this.f135490t;
                if (fVar == null) {
                    Intrinsics.r("itemClickListener");
                    throw null;
                }
                z12.a aVar = this.f135483m;
                if (aVar == null) {
                    Intrinsics.r("collaboratorInviteFeedPagingService");
                    throw null;
                }
                h12.a aVar2 = this.f135485o;
                if (aVar2 == null) {
                    Intrinsics.r("boardInviteApi");
                    throw null;
                }
                oVar = new bp.l(v7Var2, fVar, nVar, aVar, aVar2);
            } else {
                v7 v7Var3 = this.f135489s;
                if (v7Var3 == null) {
                    Intrinsics.r("board");
                    throw null;
                }
                bp.f fVar2 = this.f135490t;
                if (fVar2 == null) {
                    Intrinsics.r("itemClickListener");
                    throw null;
                }
                z12.f fVar3 = this.f135484n;
                if (fVar3 == null) {
                    Intrinsics.r("userFeedPagingService");
                    throw null;
                }
                f12.a aVar3 = this.f135486p;
                if (aVar3 == null) {
                    Intrinsics.r("boardCollaboratorService");
                    throw null;
                }
                oVar = new bp.o(v7Var3, fVar2, nVar, fVar3, aVar3);
            }
            this.f135492v = oVar;
        }
        recyclerView.H2(this.f135492v);
        u20.d dVar = this.f135487q;
        if (dVar == null) {
            Intrinsics.r("sendShareServiceWrapper");
            throw null;
        }
        l1 A = u20.d.d(dVar, 15).A(wj2.c.a());
        vo.a aVar4 = new vo.a(13, new c0(this, 0));
        vo.a aVar5 = new vo.a(14, f.f135502p);
        ck2.c cVar = ck2.i.f27923c;
        a2 a2Var = ck2.i.f27924d;
        A.F(aVar4, aVar5, cVar, a2Var);
        V1();
        x0 x0Var = this.f135480j;
        if (x0Var == null) {
            Intrinsics.r("boardRepository");
            throw null;
        }
        v7 v7Var4 = this.f135489s;
        if (v7Var4 == null) {
            Intrinsics.r("board");
            throw null;
        }
        String uid = v7Var4.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        this.f135491u = (ek2.j) x0Var.R(uid).F(new vo.a(15, new c0(this, 1)), new vo.a(16, f.f135503q), cVar, a2Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ek2.j jVar;
        ek2.j jVar2 = this.f135491u;
        if (jVar2 != null && !jVar2.isDisposed() && (jVar = this.f135491u) != null) {
            bk2.c.dispose(jVar);
        }
        super.onDetachedFromWindow();
    }
}
