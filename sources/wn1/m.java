package wn1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f130565i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vn1.c f130566j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rm1.d f130567k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(vn1.c cVar, rm1.d dVar, int i13) {
        super(1);
        this.f130565i = i13;
        this.f130566j = cVar;
        this.f130567k = dVar;
    }

    public final rn1.a b(rn1.a it) {
        switch (this.f130565i) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, this.f130566j, null, null, vn1.g.BODY_100, 0, fm1.c.VISIBLE, null, null, this.f130567k, false, 0, null, null, null, null, null, false, null, null, 2096557);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, this.f130566j, null, null, vn1.g.BODY_100, 0, fm1.c.VISIBLE, null, null, this.f130567k, false, 0, null, null, null, new u50.b0(eo1.c.space_100), null, false, null, null, 2063789);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f130565i) {
        }
        return b((rn1.a) obj);
    }
}
