package i51;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f71616i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ r f71617j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(r rVar, int i13) {
        super(1);
        this.f71616i = i13;
        this.f71617j = rVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f71616i;
        r rVar = this.f71617j;
        switch (i13) {
            case 0:
                a0 it = (a0) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return a0.b(it, false, false, false, ((o) rVar).f71600a, null, RecyclerViewTypes.VIEW_TYPE_COUNTRY_CODE);
            default:
                g it2 = (g) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return g.e(it2, false, null, null, null, false, ((o) rVar).f71600a, false, 95);
        }
    }
}
