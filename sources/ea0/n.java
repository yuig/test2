package ea0;

import a.z0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.collage.remix.components.CollageRemixCarouselView;
import com.pinterest.collage.remix.components.CollageTemplateCarouselView;
import kh2.j1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import so.n5;

/* loaded from: classes5.dex */
public final class n extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f57979i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ t f57980j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(t tVar, int i13) {
        super(0);
        this.f57979i = i13;
        this.f57980j = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.pinterest.collage.remix.components.CollageTemplateCarouselView] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        CollageRemixCarouselView collageRemixCarouselView;
        AttributeSet attributeSet = null;
        int i13 = this.f57979i;
        t tVar = this.f57980j;
        switch (i13) {
            case 0:
                qa2.e v13 = kh2.r.v1(v.c(), new z0(tVar, 3));
                n5 n5Var = tVar.L0;
                if (n5Var == null) {
                    Intrinsics.r("gridViewsHelperFactory");
                    throw null;
                }
                FragmentActivity requireActivity = tVar.requireActivity();
                Intrinsics.checkNotNullExpressionValue(requireActivity, "requireActivity(...)");
                return n5Var.a(requireActivity, tVar, v13.a(), (h32.i0) tVar.Q0.getValue());
            case 1:
                return com.bumptech.glide.d.i0(tVar.V0, tVar.U0, tVar.T0, "");
            default:
                int i14 = t.W0;
                tVar.getClass();
                int i15 = 6;
                if (com.bumptech.glide.d.G(tVar, "RetrievalExtras.COLLAGE_IS_TEMPLATES", false)) {
                    Context requireContext = tVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext(...)");
                    collageRemixCarouselView = new CollageTemplateCarouselView(i15, requireContext, attributeSet);
                } else {
                    Context requireContext2 = tVar.requireContext();
                    Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext(...)");
                    collageRemixCarouselView = new CollageRemixCarouselView(i15, requireContext2, attributeSet);
                }
                int Z = bs1.c.Z(collageRemixCarouselView, eo1.c.space_300);
                collageRemixCarouselView.setPaddingRelative(collageRemixCarouselView.getPaddingStart(), Z, collageRemixCarouselView.getPaddingEnd(), Z);
                collageRemixCarouselView.g6(new q(tVar, 1));
                collageRemixCarouselView.l1(new q(tVar, 2));
                RecyclerView g83 = tVar.g8();
                if (g83 != null) {
                    j1.i1(g83, collageRemixCarouselView);
                }
                return collageRemixCarouselView;
        }
    }
}
