package mv0;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.mo;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.ui.imageview.WebImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f88416a;

    public x(y yVar) {
        this.f88416a = yVar;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        y yVar = this.f88416a;
        RoundedCornersLayout roundedCornersLayout = yVar.G0;
        if (roundedCornersLayout == null) {
            Intrinsics.r("pagePreviewContainer");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        WebImageView webImageView = yVar.H0;
        if (webImageView == null) {
            Intrinsics.r("pagePreview");
            throw null;
        }
        int z14 = webImageView.z1();
        WebImageView webImageView2 = yVar.H0;
        if (webImageView2 == null) {
            Intrinsics.r("pagePreview");
            throw null;
        }
        layoutParams2.G = new mo(z14, webImageView2.k0()).toString();
        roundedCornersLayout.setLayoutParams(layoutParams2);
    }
}
