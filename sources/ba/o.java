package ba;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22284i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r2.d f22285j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f22286k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f22287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(r2.d dVar, Function2 function2, int i13, int i14) {
        super(2);
        this.f22284i = i14;
        this.f22285j = dVar;
        this.f22286k = function2;
        this.f22287l = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f22284i;
        Function2 function2 = this.f22286k;
        r2.d dVar = this.f22285j;
        int i15 = this.f22287l;
        switch (i14) {
            case 0:
                if ((i13 & 11) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                s0.t(dVar, function2, oVar, ((i15 >> 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8);
                break;
            default:
                s0.t(dVar, function2, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22284i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
