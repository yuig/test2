package gb1;

import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f64730i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f64731j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f64732k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(String str, boolean z13, int i13) {
        super(1);
        this.f64730i = i13;
        this.f64731j = str;
        this.f64732k = z13;
    }

    public final rn1.a b(rn1.a it) {
        int i13 = this.f64730i;
        boolean z13 = this.f64732k;
        String str = this.f64731j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                vn1.g gVar = vn1.g.HEADING_700;
                return rn1.a.y(it, bs1.c.h2(str), z13 ? vn1.c.DEFAULT : vn1.c.SUBTLE, null, null, gVar, 0, null, null, null, null, false, 0, bs1.c.h2(str), null, null, null, null, false, null, null, 2093036);
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, null, null, 0, fm1.c.VISIBLE, null, new rm1.d(new rm1.f(rm1.q.CHECK_CIRCLE, rm1.i.LG), z13 ? rm1.c.INFO : rm1.c.ERROR, null, 0, null, 28), null, false, 0, null, null, null, null, null, false, null, null, 2096830);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, bs1.c.h2(str), null, null, e0.b(vn1.e.BOLD), z13 ? vn1.g.BODY_400 : it.f108853k, 0, null, null, null, null, false, 0, bs1.c.h2(str), null, null, null, null, false, null, null, 2093030);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f64730i) {
        }
        return b((rn1.a) obj);
    }
}
