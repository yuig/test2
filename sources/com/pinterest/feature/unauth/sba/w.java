package com.pinterest.feature.unauth.sba;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.m1;
import com.pinterest.design.brio.widget.progress.PinterestSwipeRefreshLayout;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.grid.PinterestRecyclerView;
import ea1.t0;
import ea1.u0;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/feature/unauth/sba/w;", "Lo82/i3;", "<init>", "()V", "identity_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class w extends b {
    public static final /* synthetic */ int I0 = 0;
    public final m1 F0;
    public il1.a G0;
    public final d4 H0;

    public w() {
        int i13 = 13;
        xk2.k r13 = d7.g.r(17, new t0(this, i13), xk2.n.NONE);
        int i14 = 14;
        this.F0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(s0.class), new u0(r13, i13), new ca1.m(r13, i14), new ca1.n(this, r13, i14));
        this.H0 = d4.UNKNOWN_VIEW;
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new w41.g0(b9().a(), 11);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new kd1.j(b9().c(), 4);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        y yVar = y.f48879a;
        mj.m mVar = new mj.m(29);
        b3.G(adapter, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, new q(this, 4), yVar, new ns.i(14), mVar, null, 96);
        final int i13 = 0;
        o82.q qVar = new o82.q(this) { // from class: com.pinterest.feature.unauth.sba.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f48844b;

            {
                this.f48844b = this;
            }

            @Override // o82.q
            public final wt1.d b(ao2.j0 it) {
                int i14 = i13;
                w this$0 = this.f48844b;
                switch (i14) {
                    case 0:
                        int i15 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b93 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        return b93.h(requireContext, S);
                    case 1:
                        int i16 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b94 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner2 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                        Context requireContext2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        return b94.h(requireContext2, S2);
                    default:
                        int i17 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b95 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner3 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S3 = bf.b.S(viewLifecycleOwner3);
                        Context requireContext3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                        return b95.h(requireContext3, S3);
                }
            }
        };
        adapter.I(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SHOPPING_MODULE, new q(this, 5), new p90.m(9), qVar);
        a.e eVar = new a.e(0);
        b3.G(adapter, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_TEMPLATE_DETAILS_MODULE, new q(this, 6), yVar, new ns.i(15), eVar, null, 96);
        final int i14 = 1;
        o82.q qVar2 = new o82.q(this) { // from class: com.pinterest.feature.unauth.sba.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f48844b;

            {
                this.f48844b = this;
            }

            @Override // o82.q
            public final wt1.d b(ao2.j0 it) {
                int i142 = i14;
                w this$0 = this.f48844b;
                switch (i142) {
                    case 0:
                        int i15 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b93 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        return b93.h(requireContext, S);
                    case 1:
                        int i16 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b94 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner2 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                        Context requireContext2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        return b94.h(requireContext2, S2);
                    default:
                        int i17 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b95 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner3 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S3 = bf.b.S(viewLifecycleOwner3);
                        Context requireContext3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                        return b95.h(requireContext3, S3);
                }
            }
        };
        final int i15 = 2;
        adapter.I(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_HAIR_PATTERN_QUERIES_MODULE, new q(this, i15), new p90.m(10), qVar2);
        o82.q qVar3 = new o82.q(this) { // from class: com.pinterest.feature.unauth.sba.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f48844b;

            {
                this.f48844b = this;
            }

            @Override // o82.q
            public final wt1.d b(ao2.j0 it) {
                int i142 = i15;
                w this$0 = this.f48844b;
                switch (i142) {
                    case 0:
                        int i152 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b93 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner);
                        Context requireContext = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                        return b93.h(requireContext, S);
                    case 1:
                        int i16 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b94 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner2 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S2 = bf.b.S(viewLifecycleOwner2);
                        Context requireContext2 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                        return b94.h(requireContext2, S2);
                    default:
                        int i17 = w.I0;
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        Intrinsics.checkNotNullParameter(it, "it");
                        s0 b95 = this$0.b9();
                        androidx.lifecycle.z viewLifecycleOwner3 = this$0.getViewLifecycleOwner();
                        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                        androidx.lifecycle.u S3 = bf.b.S(viewLifecycleOwner3);
                        Context requireContext3 = this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                        return b95.h(requireContext3, S3);
                }
            }
        };
        adapter.I(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_SEE_IT_STYLED_MODULE, new q(this, 3), new p90.m(11), qVar3);
    }

    public final s0 b9() {
        return (s0) this.F0.getValue();
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF58505l0() {
        return this.H0;
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(vq1.c.fragment_unauth_preload_experience, vq1.b.p_recycler_view);
        eVar.c(vq1.b.swipe_container);
        return eVar;
    }

    @Override // o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        s0 b93 = b9();
        il1.a aVar = this.G0;
        if (aVar == null) {
            Intrinsics.r("fragmentFactory");
            throw null;
        }
        b93.i(aVar);
        View findViewById = v13.findViewById(vq1.b.authenticate_header);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        AuthenticateHeader authenticateHeader = (AuthenticateHeader) findViewById;
        authenticateHeader.L(new q(this, 0), new q(this, 1));
        View findViewById2 = v13.findViewById(vq1.b.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = v13.findViewById(vq1.b.swipe_container);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        authenticateHeader.getViewTreeObserver().addOnGlobalLayoutListener(new r(authenticateHeader, (PinterestRecyclerView) findViewById2, (PinterestSwipeRefreshLayout) findViewById3));
        androidx.lifecycle.z viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        kotlin.jvm.internal.j.z(bf.b.S(viewLifecycleOwner), null, null, new u(this, null), 3);
    }
}
