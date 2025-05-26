package jm0;

import android.content.Context;
import androidx.recyclerview.widget.PinterestStaggeredGridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.board.detail.floatingtoolbar.FloatingToolbarView;
import com.pinterest.feature.board.selectpins.BoardSelectPinsHeaderView;
import com.pinterest.feature.profile.emptystate.EmptyStateBannerView;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m60.d0;
import o82.q2;
import u50.i0;

/* loaded from: classes5.dex */
public final class d extends dl2.j implements Function2 {

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f76960r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f76961s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, bl2.c cVar) {
        super(2, cVar);
        this.f76961s = jVar;
    }

    @Override // dl2.a
    public final bl2.c create(Object obj, bl2.c cVar) {
        d dVar = new d(this.f76961s, cVar);
        dVar.f76960r = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((lm0.a) obj, (bl2.c) obj2)).invokeSuspend(Unit.f80348a);
    }

    @Override // dl2.a
    public final Object invokeSuspend(Object obj) {
        um0.a aVar;
        cl2.a aVar2 = cl2.a.COROUTINE_SUSPENDED;
        ue.c.H(obj);
        lm0.a aVar3 = (lm0.a) this.f76960r;
        int i13 = j.f76978k1;
        j jVar = this.f76961s;
        jVar.getClass();
        jVar.f76986h1 = aVar3.f83841k;
        Context requireContext = jVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
        CharSequence a13 = aVar3.f83831a.a(requireContext);
        GestaltToolbarImpl gestaltToolbarImpl = jVar.R0;
        Unit unit = null;
        if (gestaltToolbarImpl == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl.b0(a13);
        GestaltToolbarImpl gestaltToolbarImpl2 = jVar.R0;
        if (gestaltToolbarImpl2 == null) {
            Intrinsics.r("toolbar");
            throw null;
        }
        gestaltToolbarImpl2.m();
        Context requireContext2 = jVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
        i0 q23 = g3.q2(aVar3.f83832b, requireContext2);
        GestaltText gestaltText = jVar.T0;
        if (gestaltText == null) {
            Intrinsics.r("metadata");
            throw null;
        }
        pk.a0.q(gestaltText, q23);
        GestaltIconButton gestaltIconButton = jVar.U0;
        if (gestaltIconButton == null) {
            Intrinsics.r("filterButton");
            throw null;
        }
        int i14 = 4;
        g3.y(gestaltIconButton, new kl0.t(aVar3, i14));
        d0 d0Var = jVar.P0;
        if (d0Var == null) {
            Intrinsics.r("gridColumnCountProvider");
            throw null;
        }
        int a14 = d0Var.a(aVar3.f83833c.toGridRepStyle());
        boolean z13 = jVar.f76985g1 != a14;
        jVar.f76985g1 = a14;
        if (z13) {
            RecyclerView g83 = jVar.g8();
            l2 l2Var = g83 != null ? g83.f19242n : null;
            PinterestStaggeredGridLayoutManager pinterestStaggeredGridLayoutManager = l2Var instanceof PinterestStaggeredGridLayoutManager ? (PinterestStaggeredGridLayoutManager) l2Var : null;
            if (pinterestStaggeredGridLayoutManager != null) {
                pinterestStaggeredGridLayoutManager.h1(a14);
                jVar.P8();
                pinterestStaggeredGridLayoutManager.e1(0, 0);
                q2 q2Var = (q2) jVar.f139732f0;
                if (q2Var != null) {
                    q2Var.h();
                }
            }
        }
        FloatingToolbarView floatingToolbarView = jVar.V0;
        if (floatingToolbarView == null) {
            Intrinsics.r("boardTools");
            throw null;
        }
        floatingToolbarView.x(aVar3.f83838h.f113049a, new f(jVar, 3), new f(jVar, i14));
        FloatingToolbarView floatingToolbarView2 = jVar.W0;
        if (floatingToolbarView2 == null) {
            Intrinsics.r("organizeTools");
            throw null;
        }
        um0.e eVar = aVar3.f83839i;
        floatingToolbarView2.x(eVar.f122698d, new f(jVar, 5), new f(jVar, 6));
        BoardSelectPinsHeaderView boardSelectPinsHeaderView = jVar.X0;
        if (boardSelectPinsHeaderView == null) {
            Intrinsics.r("organizeHeader");
            throw null;
        }
        boardSelectPinsHeaderView.L(eVar.f122699e);
        wm0.h hVar = jVar.Y0;
        if (hVar != null) {
            hVar.e(aVar3.f83836f);
            um0.a aVar4 = jVar.Z0;
            RecyclerView g84 = jVar.g8();
            if (aVar4 != null && g84 != null) {
                if (eVar.f122700f) {
                    aVar4.b(g84);
                } else {
                    aVar4.c();
                }
                unit = Unit.f80348a;
            }
            if (unit == null && (aVar = jVar.Z0) != null) {
                aVar.c();
                Unit unit2 = Unit.f80348a;
            }
        }
        EmptyStateBannerView emptyStateBannerView = (EmptyStateBannerView) jVar.f76979a1.getValue();
        Context requireContext3 = jVar.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
        emptyStateBannerView.o(g3.x2(aVar3.f83834d, requireContext3));
        PinterestSwipeRefreshLayout pinterestSwipeRefreshLayout = jVar.f139734h0;
        if (pinterestSwipeRefreshLayout != null) {
            pinterestSwipeRefreshLayout.setEnabled(aVar3.f83837g);
        }
        return Unit.f80348a;
    }
}
