package xs0;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f135826i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f135827j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f135828k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i13, int i14, List list) {
        super(1);
        this.f135826i = i14;
        this.f135827j = list;
        this.f135828k = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f135828k;
        int i14 = this.f135826i;
        List list = this.f135827j;
        switch (i14) {
            case 0:
                sl1.i it = (sl1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List<xk2.w> list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                for (xk2.w wVar : list2) {
                    arrayList.add(new sl1.e((String) wVar.f135234a, (String) wVar.f135235b, (Integer) wVar.f135236c, 4));
                }
                return sl1.i.e(it, arrayList, this.f135828k, sl1.h.SM, false, null, null, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
            case 1:
                y01.h0 it2 = (y01.h0) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return y01.h0.e(it2, h42.a.e(it2.f136412a, CollectionsKt.J0(list), i13, 12), null, 2);
            default:
                androidx.recyclerview.widget.w it3 = (androidx.recyclerview.widget.w) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                return new wt1.m(it3, list, i13);
        }
    }
}
