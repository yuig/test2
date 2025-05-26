package com.pinterest.boardAutoCollages;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.q1;
import androidx.lifecycle.m1;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import h32.d4;
import kh2.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o82.b3;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/boardAutoCollages/q;", "Lo82/v2;", "<init>", "()V", "boardAutoCollages_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class q extends n0 {
    public static final /* synthetic */ int T0 = 0;
    public a82.b L0;
    public View M0;
    public GestaltSpinner N0;
    public final xk2.v O0 = xk2.m.b(new m(this, 0));
    public final xk2.v P0 = xk2.m.b(new m(this, 1));
    public final xk2.v Q0 = xk2.m.b(new m(this, 3));
    public final m1 R0;
    public final d4 S0;

    public q() {
        xk2.k q13 = jq.b.q(12, new q1(this, 12), xk2.n.NONE);
        int i13 = 11;
        this.R0 = a1.s(this, kotlin.jvm.internal.k0.f80436a.b(m0.class), new mq.e0(q13, i13), new mq.f0(null, q13, i13), new mq.g0(this, q13, i13));
        this.S0 = d4.FEED;
    }

    @Override // nl1.d
    public final void S7(fo1.a toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) toolbar;
        gestaltToolbarImpl.b0(getResources().getString(q0.board_auto_collages_title));
        gestaltToolbarImpl.g0();
    }

    @Override // o82.i3
    public final do2.i U8() {
        return new wb.c(k9().a(), 8);
    }

    @Override // o82.i3
    public final u50.r V8() {
        return new mq.z(k9().c(), 14);
    }

    @Override // o82.i3
    public final void X8(b3 adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        b3.G(adapter, 100, new m(this, 2), new d(), new l(this, 0), new a8.v(this, 21), null, 96);
    }

    @Override // nl1.d, uk1.c
    /* renamed from: getViewType, reason: from getter */
    public final d4 getF63534k0() {
        return this.S0;
    }

    public final m0 k9() {
        return (m0) this.R0.getValue();
    }

    @Override // yq0.t
    public final a7.e m8() {
        a7.e eVar = new a7.e(p0.fragment_board_auto_collages, o0.p_recycler_view);
        eVar.c(o0.swipe_container);
        return eVar;
    }

    @Override // yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        k9().h((String) this.O0.getValue(), (String) this.P0.getValue(), (String) this.Q0.getValue());
    }

    @Override // o82.v2, o82.i3, yq0.t, yk1.k, nl1.d, androidx.fragment.app.Fragment
    public final void onViewCreated(View v13, Bundle bundle) {
        Intrinsics.checkNotNullParameter(v13, "v");
        super.onViewCreated(v13, bundle);
        View findViewById = v13.findViewById(o0.progress_overlay);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        Intrinsics.checkNotNullParameter(findViewById, "<set-?>");
        this.M0 = findViewById;
        View findViewById2 = v13.findViewById(o0.progress_overlay_loading_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltSpinner gestaltSpinner = (GestaltSpinner) findViewById2;
        Intrinsics.checkNotNullParameter(gestaltSpinner, "<set-?>");
        this.N0 = gestaltSpinner;
        kh2.b0.D1(this, new p(this, null));
    }

    @Override // nl1.d
    public final nc0.f x7(View mainView) {
        Intrinsics.checkNotNullParameter(mainView, "mainView");
        return (nc0.f) mainView.findViewById(o0.toolbar);
    }
}
