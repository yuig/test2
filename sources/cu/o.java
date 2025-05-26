package cu;

import android.content.res.Resources;
import com.pinterest.ads.feature.owc.view.base.BaseAdsScrollingModule;
import com.pinterest.api.model.b40;
import kh2.m2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import m60.r0;

/* loaded from: classes3.dex */
public final class o extends s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f53243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ BaseAdsScrollingModule f53244j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(BaseAdsScrollingModule baseAdsScrollingModule, int i13) {
        super(0);
        this.f53243i = i13;
        this.f53244j = baseAdsScrollingModule;
    }

    public final Integer b() {
        int i13 = this.f53243i;
        BaseAdsScrollingModule baseAdsScrollingModule = this.f53244j;
        switch (i13) {
            case 0:
                Resources resources = baseAdsScrollingModule.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Intrinsics.checkNotNullParameter(resources, "<this>");
                return Integer.valueOf((int) resources.getDimension(r0.onetap_pin_media_corner_radius));
            default:
                Resources resources2 = baseAdsScrollingModule.getResources();
                Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                return Integer.valueOf(m2.O0(resources2));
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        int i13 = this.f53243i;
        BaseAdsScrollingModule baseAdsScrollingModule = this.f53244j;
        switch (i13) {
            case 2:
                return Boolean.valueOf(baseAdsScrollingModule.f35325l0 != null ? b40.r0(baseAdsScrollingModule.Y0()) : false);
            case 3:
                return Boolean.valueOf(baseAdsScrollingModule.T0() > 0);
            case 4:
                return Boolean.valueOf(baseAdsScrollingModule.n1().f35422i <= ((float) baseAdsScrollingModule.f35322i0));
            case 5:
                return Boolean.valueOf(baseAdsScrollingModule.f35325l0 != null ? ((es.c) as.c.a()).S(baseAdsScrollingModule.Y0()) : false);
            default:
                return Boolean.valueOf(baseAdsScrollingModule.f35325l0 != null ? b40.X0(baseAdsScrollingModule.Y0()) : false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f53243i;
        BaseAdsScrollingModule baseAdsScrollingModule = this.f53244j;
        switch (i13) {
            case 0:
                return b();
            case 1:
                return b();
            case 2:
                return invoke();
            case 3:
                return invoke();
            case 4:
                return invoke();
            case 5:
                return invoke();
            case 6:
                return invoke();
            case 7:
                return new n(baseAdsScrollingModule, 1);
            default:
                return new q(baseAdsScrollingModule, 0);
        }
    }
}
