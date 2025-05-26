package com.pinterest.ads.feature.owc.view.core;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import fu.c;
import kh2.m2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ads/feature/owc/view/core/AdsCoreScrollingModule;", "Lcom/pinterest/ads/feature/owc/view/base/BaseAdsScrollingModule;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ads_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class AdsCoreScrollingModule extends BaseAdsScrollingModule {
    public d0 E0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdsCoreScrollingModule(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public void K1() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (!m2.u1(context)) {
            super.K1();
            return;
        }
        c cVar = this.f35327n0;
        if (cVar != null) {
            cVar.d5();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public void O1() {
        c cVar;
        if (this.f35337x0) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (!m2.u1(context) || (cVar = this.f35327n0) == null) {
                return;
            }
            cVar.d5();
        }
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    /* renamed from: s1 */
    public boolean getA0() {
        Intrinsics.checkNotNullExpressionValue(getContext(), "getContext(...)");
        return !m2.u1(r0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdsCoreScrollingModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
