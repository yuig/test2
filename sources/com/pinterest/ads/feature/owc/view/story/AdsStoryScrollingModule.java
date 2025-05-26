package com.pinterest.ads.feature.owc.view.story;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.feature.pincarouselads.view.a0;
import com.pinterest.video.core.view.PinterestVideoView;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/story/AdsStoryScrollingModule;", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsScrollingModule;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AdsStoryScrollingModule extends BaseAdsScrollingModule {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsStoryScrollingModule(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void a() {
        super.a();
        a0 b13 = n1().b();
        if (b13 != null) {
            PinterestVideoView pinterestVideoView = b13.f47367l;
            if (pinterestVideoView != null) {
                pinterestVideoView.q0().o(pinterestVideoView);
            }
            Unit unit = Unit.f80348a;
        }
        Set set = this.f35320g0;
        if (set == null) {
            Intrinsics.r("obstructionViews");
            throw null;
        }
        set.add(K0());
        d2();
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule, cu.a
    public final void j() {
        super.j();
        a0 b13 = n1().b();
        if (b13 != null) {
            PinterestVideoView pinterestVideoView = b13.f47367l;
            if (pinterestVideoView != null) {
                pinterestVideoView.q0().u(pinterestVideoView);
            }
            Unit unit = Unit.f80348a;
        }
        Set set = this.f35320g0;
        if (set == null) {
            Intrinsics.r("obstructionViews");
            throw null;
        }
        set.clear();
        d2();
    }

    public /* synthetic */ AdsStoryScrollingModule(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsStoryScrollingModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
