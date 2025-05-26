package kd1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.l2;
import androidx.recyclerview.widget.y2;
import h32.a4;
import h32.d4;
import h32.g0;
import h32.i0;
import h32.v2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import nx.d0;
import nx.v;
import qa2.j0;

/* loaded from: classes5.dex */
public final class c extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f79237i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f79238j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(k kVar, int i13) {
        super(0);
        this.f79237i = i13;
        this.f79238j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f79237i) {
            case 0:
                m171invoke();
                return Unit.f80348a;
            case 1:
                m171invoke();
                return Unit.f80348a;
            default:
                k kVar = this.f79238j;
                j0 j0Var = kVar.K0;
                if (j0Var == null) {
                    Intrinsics.r("pinGridCellFactory");
                    throw null;
                }
                Context requireContext = kVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                View view = (View) ((qa2.d) j0Var).a(requireContext, true);
                int i13 = (int) (hf0.b.c().widthPixels / 2.6d);
                view.setLayoutParams(new FrameLayout.LayoutParams(i13, i13));
                return view;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m171invoke() {
        i0 i0Var;
        int k13;
        int l13;
        KeyEvent.Callback callback;
        int i13 = this.f79237i;
        k kVar = this.f79238j;
        switch (i13) {
            case 0:
                v2 x13 = ll.j.x(kVar.S0, null, 0, 0, "", null, null, 52);
                if (x13 != null) {
                    d0 s73 = kVar.s7();
                    Intrinsics.checkNotNullParameter(s73, "<this>");
                    i0 source = s73.p();
                    if (source != null) {
                        Intrinsics.checkNotNullParameter(source, "source");
                        d4 d4Var = source.f67081a;
                        if (d4Var == null) {
                            d4Var = d4.PIN;
                        }
                        d4 d4Var2 = d4Var;
                        a4 a4Var = source.f67082b;
                        if (a4Var == null) {
                            a4Var = a4.PIN_PRODUCT;
                        }
                        i0Var = new i0(d4Var2, a4Var, source.f67083c, g0.COMPLETE_THE_LOOK_STORY, source.f67085e, source.f67086f);
                    } else {
                        i0Var = new i0(d4.PIN, a4.PIN_PRODUCT, null, g0.COMPLETE_THE_LOOK_STORY, null, null);
                    }
                    kh2.j.x2(kVar.e9(), new zw0.c(i0Var, x13));
                    break;
                }
                break;
            default:
                int i14 = k.X0;
                RecyclerView g83 = kVar.g8();
                l2 l2Var = g83 != null ? g83.f19242n : null;
                LinearLayoutManager linearLayoutManager = l2Var instanceof LinearLayoutManager ? (LinearLayoutManager) l2Var : null;
                if (linearLayoutManager != null && (k13 = linearLayoutManager.k1()) <= (l13 = linearLayoutManager.l1())) {
                    while (true) {
                        RecyclerView g84 = kVar.g8();
                        y2 Y0 = g84 != null ? g84.Y0(k13, false) : null;
                        if (Y0 != null && (callback = Y0.f19717a) != null) {
                            v vVar = callback instanceof v ? (v) callback : null;
                            if (vVar != null) {
                                vVar.markImpressionStart();
                            }
                        }
                        if (k13 == l13) {
                            break;
                        } else {
                            k13++;
                        }
                    }
                }
                break;
        }
    }
}
