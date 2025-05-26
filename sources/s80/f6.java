package s80;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f6 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111536i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ x f111537j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f6(x xVar, int i13) {
        super(1);
        this.f111536i = i13;
        this.f111537j = xVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f111536i;
        x xVar = this.f111537j;
        switch (i13) {
            case 0:
                j it = (j) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return j.e(it, ((t) xVar).f111797a, null, null, null, null, null, null, null, null, null, null, null, false, false, false, null, 131070);
            default:
                n6 it2 = (n6) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                s sVar = (s) xVar;
                boolean z13 = sVar.f111786a;
                return n6.b(it2, null, null, false, z13, z13, sVar.f111787b, null, null, null, null, null, null, null, null, false, null, false, null, 2097039);
        }
    }
}
