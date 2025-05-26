package m90;

import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collage.cutoutpicker.browse.components.CutoutPickerCarouselView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class o extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f86679i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ w f86680j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(w wVar, int i13) {
        super(0);
        this.f86679i = i13;
        this.f86680j = wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f86679i;
        w wVar = this.f86680j;
        switch (i13) {
            case 0:
                f fVar = f.f86647a;
                int i14 = w.X0;
                wVar.m9(fVar);
                return Unit.f80348a;
            case 1:
                qa2.e v13 = kh2.r.v1(a0.a(), new a.z0(wVar, 1));
                n5 n5Var = wVar.L0;
                if (n5Var == null) {
                    Intrinsics.r("gridViewsHelperFactory");
                    throw null;
                }
                FragmentActivity requireActivity = wVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return n5Var.a(requireActivity, wVar, v13.a(), (h32.i0) wVar.S0.getValue());
            case 2:
                return com.bumptech.glide.d.i0(null, wVar.getF119340x0(), wVar.W0, "");
            case 3:
                Context requireContext = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                CutoutPickerCarouselView cutoutPickerCarouselView = new CutoutPickerCarouselView(6, requireContext, (AttributeSet) null);
                u onClick = new u(wVar, 0);
                Intrinsics.checkNotNullParameter(onClick, "onClick");
                cutoutPickerCarouselView.f44624i.setValue(onClick);
                RecyclerView g83 = wVar.g8();
                if (g83 != null) {
                    kh2.j1.i1(g83, cutoutPickerCarouselView);
                }
                return cutoutPickerCarouselView;
            default:
                Context requireContext2 = wVar.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                return ph.a.w(requireContext2, wVar.f7());
        }
    }
}
