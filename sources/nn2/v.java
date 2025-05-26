package nn2;

import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import lb.p0;
import pn2.f1;

/* loaded from: classes2.dex */
public final class v extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91646i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f91647j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(Object obj, int i13) {
        super(0);
        this.f91646i = i13;
        this.f91647j = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f91646i;
        Object obj = this.f91647j;
        switch (i13) {
            case 0:
                w wVar = (w) obj;
                p0 p0Var = wVar.f91648k;
                return CollectionsKt.F0(((ln2.o) p0Var.f82653b).f84112e.j(wVar.f91649l, (vm2.f) p0Var.f82654c));
            case 1:
                return new pn2.i(((pn2.l) obj).e());
            default:
                return rn2.m.d(rn2.l.CANNOT_COMPUTE_ERASED_BOUND, ((f1) obj).toString());
        }
    }
}
