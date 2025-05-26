package hk1;

import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pk.a0;

/* loaded from: classes2.dex */
public final class r extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final r f69364j = new r(0);

    /* renamed from: k, reason: collision with root package name */
    public static final r f69365k = new r(1);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f69366i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i13) {
        super(1);
        this.f69366i = i13;
    }

    public final g b(g it) {
        switch (this.f69366i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                q0 q0Var = q0.f80391a;
                it.getClass();
                return g.e(q0Var);
            default:
                Intrinsics.checkNotNullParameter(it, "state");
                return g.e(CollectionsKt.m0(new ak1.b(a0.V0(a0.V0(new u50.d(eo1.a.grid_cell_carousel_index_dot_size), new u50.d(eo1.a.grid_cell_carousel_indicator_vertical_spacing)), new u50.d(eo1.a.grid_cell_carousel_indicator_vertical_spacing)), "carousel_index_tracker"), it.f69351a));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f69366i) {
        }
        return b((g) obj);
    }
}
