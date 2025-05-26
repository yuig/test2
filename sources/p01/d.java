package p01;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import t3.s1;
import wt1.c0;

/* loaded from: classes5.dex */
public final class d extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98355i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f98356j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f98357k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, h0 h0Var) {
        super(1);
        this.f98355i = 0;
        this.f98357k = h0Var;
        this.f98356j = fVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f98355i;
        h0 h0Var = this.f98357k;
        f fVar = this.f98356j;
        switch (i13) {
            case 1:
                tb0.h hVar = fVar.f98364d;
                String simpleName = h0Var.getClass().getSimpleName();
                String message = th3.getMessage();
                hVar.q(th3, s1.c("RelatedPinsFilteringDataManager loadMore pagination failure for PagedList ", simpleName, " ", message != null ? message : ""), tb0.p.RELATED_PINS);
                fVar.b();
                break;
            default:
                tb0.h hVar2 = fVar.f98364d;
                String simpleName2 = h0Var.getClass().getSimpleName();
                String message2 = th3.getMessage();
                hVar2.q(th3, s1.c("RelatedPinsFilteringDataManager initial data load failure for PagedList ", simpleName2, " ", message2 != null ? message2 : ""), tb0.p.RELATED_PINS);
                fVar.a().P(0, new o01.f());
                fVar.f98362b.onPinsLoadedAfterFilterUpdate(h0Var);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(wt1.c0 r13) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p01.d.e(wt1.c0):void");
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f98355i) {
            case 0:
                e((c0) obj);
                break;
            case 1:
                b((Throwable) obj);
                break;
            case 2:
                e((c0) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, h0 h0Var, int i13) {
        super(1);
        this.f98355i = i13;
        this.f98356j = fVar;
        this.f98357k = h0Var;
    }
}
