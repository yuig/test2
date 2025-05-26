package kl0;

import android.content.Context;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.k5;
import so.m5;
import we1.d2;

/* loaded from: classes5.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f80098i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f80099j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(z zVar, int i13) {
        super(0);
        this.f80098i = i13;
        this.f80099j = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f80098i;
        z zVar = this.f80099j;
        switch (i13) {
            case 0:
                return new k(zVar);
            case 1:
                Context requireContext = zVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner = zVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                return new d2(requireContext, bf.b.S(viewLifecycleOwner));
            case 2:
                k5 k5Var = zVar.f80144m1;
                if (k5Var == null) {
                    Intrinsics.r("stlFocusModuleCarouselViewFactory");
                    throw null;
                }
                Context requireContext2 = zVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                androidx.lifecycle.z viewLifecycleOwner2 = zVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                return new bx0.i(requireContext2, bf.b.S(viewLifecycleOwner2), zVar.s7(), f62.d.shop_the_look_focus_carousel_layout, bx0.z.FOCUS, (m5) k5Var.f113517a.f114091b.Y0.get());
            case 3:
                Context requireContext3 = zVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext3, "requireContext(...)");
                com.pinterest.feature.board.detail.b bVar = zVar.f80145n1;
                return new com.pinterest.feature.board.organize.l(requireContext3, new WeakReference(bVar != null ? ((hl0.v) bVar).G : null));
            default:
                Context requireContext4 = zVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext4, "requireContext(...)");
                nx.d0 s73 = zVar.s7();
                androidx.lifecycle.z viewLifecycleOwner3 = zVar.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
                androidx.lifecycle.u S = bf.b.S(viewLifecycleOwner3);
                wa2.m i03 = m60.f0.i0(zVar.W8().f103320a);
                com.pinterest.feature.board.detail.b bVar2 = zVar.f80145n1;
                return new v42.k(requireContext4, s73, S, i03, new WeakReference(bVar2 != null ? ((hl0.v) bVar2).G : null), true, true, false, false, false, null, 3712);
        }
    }
}
