package com.pinterest.feature.pincarouselads.view;

import android.view.View;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.navigation.view.lego.LegoFloatingBottomNavBar;
import h32.f1;
import h32.g0;
import h32.u0;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements View.OnLongClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47377a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f47378b;

    public /* synthetic */ h(View view, int i13) {
        this.f47377a = i13;
        this.f47378b = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        int i13 = this.f47377a;
        View view2 = this.f47378b;
        switch (i13) {
            case 0:
                l this$0 = (l) view2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                l21.g gVar = this$0.f47394h;
                if (gVar != null) {
                    Intrinsics.f(view);
                    gVar.I1(view);
                }
                return true;
            default:
                LegoFloatingBottomNavBar this$02 = (LegoFloatingBottomNavBar) view2;
                int i14 = LegoFloatingBottomNavBar.N;
                Intrinsics.checkNotNullParameter(this$02, "this$0");
                d0 d0Var = this$02.f49962j;
                if (d0Var != null) {
                    d0Var.h0((r18 & 1) != 0 ? f1.TAP : f1.LONG_PRESS, (r18 & 2) != 0 ? null : u0.PROFILE_BUTTON, (r18 & 4) != 0 ? null : g0.NAVIGATION, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                }
                mr1.a aVar = this$02.f49978z;
                if (aVar == null) {
                    Intrinsics.r("accountSwitcher");
                    throw null;
                }
                Object obj = ((lb2.n) aVar).f82783a.get();
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                if (com.bumptech.glide.c.a0((UserDeserializer) obj).size() > 1) {
                    this$02.v().d(new y42.e(new yj1.d(this$02, 25)));
                }
                return true;
        }
    }
}
