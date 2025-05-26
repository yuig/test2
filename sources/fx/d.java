package fx;

import com.pinterest.adsStlUiLibrary.ui.categories.item.AdsStlCategoryView;
import en1.i0;
import im1.m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import u50.o;

/* loaded from: classes3.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f63073i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ AdsStlCategoryView f63074j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AdsStlCategoryView adsStlCategoryView, int i13) {
        super(1);
        this.f63073i = i13;
        this.f63074j = adsStlCategoryView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f63073i;
        AdsStlCategoryView adsStlCategoryView = this.f63074j;
        switch (i13) {
            case 0:
                f it = (f) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                int i14 = AdsStlCategoryView.f35479b;
                adsStlCategoryView.L(it);
                return Unit.f80348a;
            case 1:
                Intrinsics.checkNotNullParameter((gm1.a) obj, "it");
                int i15 = AdsStlCategoryView.f35479b;
                adsStlCategoryView.getClass();
                adsStlCategoryView.f35480a.F(m.f72668n, new d(adsStlCategoryView, 2));
                return Unit.f80348a;
            default:
                Intrinsics.checkNotNullParameter((Unit) obj, "it");
                return new i0(((f) ((o) adsStlCategoryView.f35480a.f33803a)).f63084h);
        }
    }
}
