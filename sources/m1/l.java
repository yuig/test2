package m1;

import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ o f85431i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s3 f85432j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ e f85433k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, s3 s3Var, e eVar) {
        super(0);
        this.f85431i = oVar;
        this.f85432j = s3Var;
        this.f85433k = eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        a3.d N0;
        o oVar = this.f85431i;
        b bVar = oVar.f85482r;
        while (bVar.f85290a.m()) {
            k2.e eVar = bVar.f85290a;
            if (eVar.l()) {
                throw new NoSuchElementException("MutableVector is empty.");
            }
            a3.d dVar = (a3.d) ((i) eVar.f78182a[eVar.f78184c - 1]).f85370a.invoke();
            if (dVar != null && !oVar.O0(oVar.f85486v, dVar)) {
                break;
            }
            ao2.m mVar = ((i) eVar.o(eVar.f78184c - 1)).f85371b;
            Unit unit = Unit.f80348a;
            xk2.q qVar = xk2.s.f135225b;
            mVar.resumeWith(unit);
        }
        if (oVar.f85485u && (N0 = oVar.N0()) != null && oVar.O0(oVar.f85486v, N0)) {
            oVar.f85485u = false;
        }
        this.f85432j.f85576e = o.M0(oVar, this.f85433k);
        return Unit.f80348a;
    }
}
