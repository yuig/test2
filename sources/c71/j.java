package c71;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wt1.c0;
import wt1.d0;

/* loaded from: classes5.dex */
public final /* synthetic */ class j extends kotlin.jvm.internal.p implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26773a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Object obj, int i13) {
        super(2, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/pinterest/multisection/datasource/StatefulList$State;Lcom/pinterest/multisection/datasource/StatefulList;)V", 0);
        this.f26773a = i13;
        if (i13 == 1) {
            super(2, obj, m.class, "onStateUpdated", "onStateUpdated(Lcom/pinterest/multisection/datasource/StatefulList$State;Lcom/pinterest/multisection/datasource/StatefulList;)V", 0);
        } else if (i13 != 2) {
        } else {
            super(2, obj, m.class, "resetFiltersAndLoadData", "resetFiltersAndLoadData$results_release(ZZ)V", 0);
        }
    }

    public final void h(c0 p03, d0 p13) {
        switch (this.f26773a) {
            case 0:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                ((m) this.receiver).onStateUpdated(p03, p13);
                break;
            default:
                Intrinsics.checkNotNullParameter(p03, "p0");
                Intrinsics.checkNotNullParameter(p13, "p1");
                ((m) this.receiver).onStateUpdated(p03, p13);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f26773a) {
            case 0:
                h((c0) obj, (d0) obj2);
                break;
            case 1:
                h((c0) obj, (d0) obj2);
                break;
            default:
                ((m) this.receiver).N3(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue());
                break;
        }
        return Unit.f80348a;
    }
}
