package av;

import android.content.Context;
import com.pinterest.ads.feature.owc.view.base.AdsNonCollapsibleBottomSheetBehavior;
import com.pinterest.ads.feature.owc.view.base.BaseAdsBottomSheetBehavior;
import cu.i;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import pk.a0;

/* loaded from: classes3.dex */
public final class a extends i {

    /* renamed from: q, reason: collision with root package name */
    public final AdsNonCollapsibleBottomSheetBehavior f20504q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, boolean z13) {
        super(context, null, 0, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f20504q = new AdsNonCollapsibleBottomSheetBehavior(context, null, z13);
    }

    @Override // cu.i
    /* renamed from: g */
    public final BaseAdsBottomSheetBehavior getF35368t() {
        return this.f20504q;
    }

    @Override // cu.i
    public final void x() {
        a0.o(i(), x0.see_more, new Object[0]);
    }
}
