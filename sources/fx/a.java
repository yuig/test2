package fx;

import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryFlashlightView;
import en1.i0;
import im1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.o;

/* loaded from: classes3.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63066i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AdsStlCategoryFlashlightView f63067j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(AdsStlCategoryFlashlightView adsStlCategoryFlashlightView, int i13) {
        super(1);
        this.f63066i = i13;
        this.f63067j = adsStlCategoryFlashlightView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f63066i;
        AdsStlCategoryFlashlightView adsStlCategoryFlashlightView = this.f63067j;
        switch (i13) {
            case 0:
                f it = (f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = AdsStlCategoryFlashlightView.f35477b;
                adsStlCategoryFlashlightView.L(it);
                return Unit.f80348a;
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                int i15 = AdsStlCategoryFlashlightView.f35477b;
                adsStlCategoryFlashlightView.getClass();
                adsStlCategoryFlashlightView.f35478a.F(m.f72668n, new a(adsStlCategoryFlashlightView, 2));
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                return new i0(((f) ((o) adsStlCategoryFlashlightView.f35478a.f33803a)).f63084h);
        }
    }
}
