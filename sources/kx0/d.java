package kx0;

import android.content.Context;
import androidx.lifecycle.z;
import com.pinterest.feature.newshub.detail.view.NewsHubDetailContentView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import m60.f0;
import m60.r0;
import pk.a0;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81061i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f81062j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(o oVar, int i13) {
        super(0);
        this.f81061i = i13;
        this.f81062j = oVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f81061i;
        o oVar = this.f81062j;
        switch (i13) {
            case 0:
                return new cr.h(oVar.requireContext(), oVar.s7());
            case 1:
                Context requireContext = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                return new r(requireContext, oVar.j9());
            case 2:
                Context requireContext2 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                ux0.c cVar = new ux0.c(requireContext2);
                kg.t.O(cVar.f48710a);
                a0.k0(cVar.f48711b);
                int dimensionPixelOffset = cVar.getResources().getDimensionPixelOffset(eo1.c.margin_double);
                int dimensionPixelOffset2 = cVar.getResources().getDimensionPixelOffset(eo1.c.margin);
                cVar.f48712c.setPaddingRelative(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2);
                cVar.f48713d.d(new l(cVar, 0));
                cVar.setPaddingRelative(dimensionPixelOffset2, 0, dimensionPixelOffset2, cVar.getResources().getDimensionPixelOffset(r0.lego_floating_nav_bottom_bar_height) + dimensionPixelOffset);
                k listener = new k(oVar);
                Intrinsics.checkNotNullParameter(listener, "listener");
                cVar.f123237f = listener;
                return cVar;
            case 3:
                Context requireContext3 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                return new s(requireContext3);
            case 4:
                Context requireContext4 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                z viewLifecycleOwner = oVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new tj0.z(requireContext4, oVar.s7(), f0.i0(wa2.i.a(oVar.W8().f103320a, false, false, false, false, false, false, false, null, null, null, null, -1, -16777217, 1023)), bf.b.S(viewLifecycleOwner));
            default:
                Context requireContext5 = oVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext5, "requireContext(...)");
                return new NewsHubDetailContentView(requireContext5);
        }
    }
}
