package lv0;

import com.pinterest.ui.grid.PinterestRecyclerView;
import jv0.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import mv0.y;
import sq0.r;
import sq0.t;
import sq0.v;

/* loaded from: classes5.dex */
public final class i extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85025i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f85026j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, int i13) {
        super(1);
        this.f85025i = i13;
        this.f85026j = jVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f85025i;
        j jVar = this.f85026j;
        switch (i13) {
            case 0:
                Integer num = (Integer) obj;
                Intrinsics.f(num);
                j.t3(jVar, num.intValue(), jVar.f85028b.a());
                return Unit.f80348a;
            case 1:
                v vVar = (v) obj;
                if (vVar instanceof r) {
                    jv0.j jVar2 = (jv0.j) jVar.getViewIfBound();
                    if (jVar2 != null) {
                        PinterestRecyclerView pinterestRecyclerView = ((y) jVar2).K0;
                        if (pinterestRecyclerView == null) {
                            Intrinsics.r("pinterestRecyclerView");
                            throw null;
                        }
                        pinterestRecyclerView.h(0, true);
                    }
                    jVar.f85027a.a(k.f77639f);
                } else if (vVar instanceof t) {
                    jVar.f85027a.a(k.f77640g);
                }
                return Unit.f80348a;
            default:
                j.t3(jVar, ((Number) obj).intValue(), jVar.f85028b.a());
                return Unit.f80348a;
        }
    }
}
