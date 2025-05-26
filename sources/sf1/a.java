package sf1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112505i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i1 f112506j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(i1 i1Var, int i13) {
        super(1);
        this.f112505i = i13;
        this.f112506j = i1Var;
    }

    public final rl1.q b(rl1.q it) {
        int i13 = this.f112505i;
        i1 i1Var = this.f112506j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, i1Var.f112618a, i1Var.f112619b, false, null, null, false, false, null, 0, new rl1.d(i1Var.f112620c), null, 1532);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rl1.q.e(it, i1Var.f112621d, i1Var.f112622e, false, null, null, false, false, null, 0, new rl1.d(i1Var.f112623f), null, 1532);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                fm1.c cVar = fm1.c.VISIBLE;
                return rl1.q.e(it, i1Var.f112618a, i1Var.f112619b, false, null, null, false, false, cVar, 0, new rl1.d(i1Var.f112620c), null, 1404);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f112505i) {
        }
        return b((rl1.q) obj);
    }
}
