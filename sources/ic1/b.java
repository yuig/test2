package ic1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import jk2.e0;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes5.dex */
public final class b extends xk1.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f72066k = 0;

    /* renamed from: l, reason: collision with root package name */
    public final Object f72067l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j20.a countryService) {
        super(null);
        Intrinsics.checkNotNullParameter(countryService, "countryService");
        this.f72067l = countryService;
        o(RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE, new ac1.j(8));
    }

    @Override // sq0.e0
    public final int getItemViewType(int i13) {
        switch (this.f72066k) {
            case 0:
                return RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE;
            default:
                Object obj = CollectionsKt.F0(this.f135191h).get(i13);
                nc1.e eVar = obj instanceof nc1.e ? (nc1.e) obj : null;
                if (eVar != null) {
                    return eVar.getViewType();
                }
                throw new IllegalStateException("Item should be ProfileVisibilityMenuItem");
        }
    }

    @Override // xk1.c
    public final uj2.q k() {
        int i13 = this.f72066k;
        Object obj = this.f72067l;
        switch (i13) {
            case 0:
                ArrayList arrayList = new ArrayList();
                uj2.q t13 = ((j20.a) obj).a().r(tk2.e.f118017c).l(wj2.c.a()).u().t(new a(0, new w1.g(arrayList, 19)));
                Intrinsics.checkNotNullExpressionValue(t13, "flatMap(...)");
                return t13;
            default:
                uj2.q j13 = new hk2.h(new e0(((x2) obj).d0().Q("me")), new a(4, new kc1.w(this, 6)), 1).j();
                Intrinsics.checkNotNullExpressionValue(j13, "toObservable(...)");
                return j13;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(x2 userRepository) {
        super(null);
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        this.f72067l = userRepository;
        o(1, new ac1.j(17));
        o(3, new ac1.j(18));
    }
}
