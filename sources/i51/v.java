package i51;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71607i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ a0 f71608j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0 a0Var, int i13) {
        super(1);
        this.f71607i = i13;
        this.f71608j = a0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a0 a0Var = this.f71608j;
        int i13 = this.f71607i;
        switch (i13) {
            case 0:
                x31.a filter = (x31.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(filter, "filter");
                        return pp2.a.n(filter, a0Var.f71573h);
                    default:
                        Intrinsics.checkNotNullParameter(filter, "filter");
                        return pp2.a.n(filter, a0Var.f71573h);
                }
            case 1:
                a0 it = (a0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return a0Var;
                    default:
                        Intrinsics.checkNotNullParameter(it, "it");
                        return a0Var;
                }
            case 2:
                x31.a filter2 = (x31.a) obj;
                switch (i13) {
                    case 0:
                        Intrinsics.checkNotNullParameter(filter2, "filter");
                        return pp2.a.n(filter2, a0Var.f71573h);
                    default:
                        Intrinsics.checkNotNullParameter(filter2, "filter");
                        return pp2.a.n(filter2, a0Var.f71573h);
                }
            case 3:
                g it2 = (g) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                boolean z13 = a0Var.f71567b;
                x31.p pVar = a0Var.f71573h;
                return g.e(it2, z13, null, (x31.a) CollectionsKt.T(ph.a.F0(pVar)), ph.a.M0(bp1.h.J(pVar.f131638d, new v(a0Var, 2)), pVar), false, null, false, RecyclerViewTypes.VIEW_TYPE_SCHEDULED_PIN_SECTION_HEADER);
            default:
                a0 it3 = (a0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return a0Var;
                    default:
                        Intrinsics.checkNotNullParameter(it3, "it");
                        return a0Var;
                }
        }
    }
}
