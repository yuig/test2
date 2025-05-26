package px1;

import com.pinterest.partnerAnalytics.feature.filter.FilterSelectionView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class s extends kotlin.jvm.internal.p implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Object obj, int i13) {
        super(1, obj, t.class, "handleClick", "handleClick(Lcom/pinterest/partnerAnalytics/feature/filter/FilterSelectionAdapter$FilterSelection;)V", 0);
        this.f101690a = i13;
        if (i13 == 1) {
            super(1, obj, t.class, "handleNestedClick", "handleNestedClick(Lcom/pinterest/partnerAnalytics/feature/filter/FilterSelectionAdapter$FilterSelection;)V", 0);
            return;
        }
        if (i13 == 2) {
            super(1, obj, FilterSelectionView.class, "onFilterSelected", "onFilterSelected(Lcom/pinterest/partnerAnalytics/feature/filter/FilterSelectionAdapter$FilterSelection;)V", 0);
        } else if (i13 != 3) {
        } else {
            super(1, obj, FilterSelectionView.class, "onNestedFilterSelected", "onNestedFilterSelected(Lcom/pinterest/partnerAnalytics/feature/filter/FilterSelectionAdapter$FilterSelection;)V", 0);
        }
    }

    public final void h(q p03) {
        switch (this.f101690a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                t tVar = (t) this.receiver;
                tVar.getClass();
                int i13 = p03.f101681a;
                tVar.i(tVar.f101695h);
                tVar.i(i13);
                tVar.f101695h = i13;
                tVar.f101691d.invoke(p03);
                break;
            case 1:
                Intrinsics.checkNotNullParameter(p03, "p0");
                t tVar2 = (t) this.receiver;
                tVar2.getClass();
                int i14 = p03.f101681a;
                tVar2.i(tVar2.f101696i);
                tVar2.i(i14);
                tVar2.f101696i = i14;
                tVar2.f101692e.invoke(p03);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(p03, "p0");
                FilterSelectionView filterSelectionView = (FilterSelectionView) this.receiver;
                int i15 = FilterSelectionView.f50184h;
                filterSelectionView.getClass();
                int i16 = p03.f101681a;
                if (i16 != filterSelectionView.f50189e) {
                    filterSelectionView.h(i16);
                    filterSelectionView.f50188d.invoke(p03);
                    List list = p03.f101688h;
                    if (!list.isEmpty()) {
                        filterSelectionView.g(0);
                        filterSelectionView.f50190f.invoke(d7.b.F(list));
                        break;
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                FilterSelectionView filterSelectionView2 = (FilterSelectionView) this.receiver;
                int i17 = FilterSelectionView.f50184h;
                filterSelectionView2.getClass();
                int i18 = p03.f101681a;
                if (i18 != filterSelectionView2.f50191g) {
                    filterSelectionView2.g(i18);
                    filterSelectionView2.f50190f.invoke(p03);
                    break;
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f101690a) {
            case 0:
                h((q) obj);
                break;
            case 1:
                h((q) obj);
                break;
            case 2:
                h((q) obj);
                break;
            default:
                h((q) obj);
                break;
        }
        return Unit.f80348a;
    }
}
