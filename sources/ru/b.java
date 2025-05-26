package ru;

import android.content.Context;
import android.util.AttributeSet;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import kotlin.jvm.internal.Intrinsics;
import pu.o;
import u50.r;

/* loaded from: classes3.dex */
public class b extends BaseAdsScrollingModule {
    public final r E0;
    public int F0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i13, r eventIntake) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        this.E0 = eventIntake;
        this.f35327n0 = new a(this);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public void K1() {
        this.E0.a(o.f101366a);
    }

    @Override // com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule
    public final void U1() {
        this.f35322i0 = this.F0 - K0().j();
    }
}
