package nu0;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.api.model.mo;
import com.pinterest.design.widget.RoundedCornersLayout;
import com.pinterest.feature.ideaPinCreation.drafts.view.IdeaPinDraftPreview;
import pk.a0;

/* loaded from: classes5.dex */
public final class c extends hs1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IdeaPinDraftPreview f92318a;

    public c(IdeaPinDraftPreview ideaPinDraftPreview) {
        this.f92318a = ideaPinDraftPreview;
    }

    @Override // hs1.c
    public final void a(boolean z13) {
        IdeaPinDraftPreview ideaPinDraftPreview = this.f92318a;
        a0.k0(ideaPinDraftPreview.f46469c);
        RoundedCornersLayout roundedCornersLayout = ideaPinDraftPreview.f46468b;
        ViewGroup.LayoutParams layoutParams = roundedCornersLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.G = new mo(ideaPinDraftPreview.f46470d.z1(), ideaPinDraftPreview.f46470d.k0()).toString();
        roundedCornersLayout.setLayoutParams(layoutParams2);
    }

    @Override // hs1.c
    public final void d() {
        a0.w1(this.f92318a.f46469c);
    }
}
