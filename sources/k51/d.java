package k51;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f78318i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b22.l f78319j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(b22.l lVar, int i13) {
        super(1);
        this.f78318i = i13;
        this.f78319j = lVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        b22.l lVar = this.f78319j;
        switch (this.f78318i) {
            case 0:
                v it = (v) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return v.b(it, null, lVar, null, 5);
            default:
                o it2 = (o) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return o.e(it2, lVar, bm1.n.UNSELECTED, 1);
        }
    }
}
