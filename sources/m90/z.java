package m90;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z extends o82.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86719b;

    public /* synthetic */ z(int i13) {
        this.f86719b = i13;
    }

    @Override // o82.o
    public final Object j(l82.i0 i0Var) {
        switch (this.f86719b) {
            case 0:
                k1 item = (k1) i0Var;
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof j1) {
                    return ((j1) item).f86667a;
                }
                if (item instanceof f1) {
                    return ((f1) item).f86649a;
                }
                if (item instanceof i1) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            case 1:
                p90.d1 item2 = (p90.d1) i0Var;
                Intrinsics.checkNotNullParameter(item2, "item");
                if (item2 instanceof p90.c1) {
                    return ((p90.c1) item2).f99179a;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                ml0.t0 item3 = (ml0.t0) i0Var;
                Intrinsics.checkNotNullParameter(item3, "item");
                return item3.f87503a;
            case 3:
                pd1.b item4 = (pd1.b) i0Var;
                Intrinsics.checkNotNullParameter(item4, "item");
                return item4.f99803a;
            default:
                r52.a item5 = (r52.a) i0Var;
                Intrinsics.checkNotNullParameter(item5, "item");
                return item5.f106256a;
        }
    }
}
