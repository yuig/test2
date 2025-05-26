package vu;

import android.content.Context;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e extends AdsBrowserBottomSheet {

    /* renamed from: u, reason: collision with root package name */
    public final boolean f126646u;

    /* renamed from: v, reason: collision with root package name */
    public final String f126647v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context, boolean z13, boolean z14, String str) {
        super(context, null, 0, z13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f126646u = z14;
        this.f126647v = str;
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void o() {
        fu.c cVar;
        if (!this.f126646u) {
            super.o();
            return;
        }
        cu.a aVar = this.f53211m;
        if (aVar == null || (cVar = ((BaseAdsScrollingModule) aVar).f35327n0) == null) {
            return;
        }
        cVar.d5();
    }

    @Override // cu.i
    public final void s(String str, String str2, String str3, boolean z13, boolean z14) {
        x();
        z();
    }

    @Override // com.pinterest.ads.feature.owc.view.core.AdsBrowserBottomSheet, cu.i
    public final void x() {
        if (!this.f126646u || this.f126647v == null) {
            super.x();
        } else {
            i().i(new wt.c(this, 13));
        }
    }
}
