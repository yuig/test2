package gk1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class t0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f65267i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d0 f65268j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t0(d0 d0Var, int i13) {
        super(1);
        this.f65267i = i13;
        this.f65268j = d0Var;
    }

    public final x0 b(x0 it) {
        int i13 = this.f65267i;
        d0 d0Var = this.f65268j;
        switch (i13) {
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, false, false, false, null, 0, false, null, null, false, null, false, null, false, false, false, null, null, false, ((q) d0Var).f65255a, null, -1, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return x0.b(it, false, false, false, null, ((y) d0Var).f65319a, false, null, null, false, null, false, null, false, false, false, null, null, false, false, null, -8193, 255);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f65267i) {
            case 0:
                l it = (l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List<ni1.f0> list = it.f65239a;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
                for (ni1.f0 f0Var : list) {
                    if (f0Var instanceof qj1.b) {
                        f0Var = qj1.b.f((qj1.b) f0Var, null, !((a0) this.f65268j).f65213a, 29);
                    }
                    arrayList.add(f0Var);
                }
                break;
        }
        return b((x0) obj);
    }
}
