package p01;

import com.pinterest.framework.multisection.datasource.pagedlist.h0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.s;
import t3.s1;

/* loaded from: classes5.dex */
public final class m extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98382i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ n f98383j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h0 f98384k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, h0 h0Var) {
        super(1);
        this.f98382i = 0;
        this.f98384k = h0Var;
        this.f98383j = nVar;
    }

    public final void b(Throwable th3) {
        int i13 = this.f98382i;
        h0 h0Var = this.f98384k;
        n nVar = this.f98383j;
        switch (i13) {
            case 1:
                tb0.h hVar = nVar.f98388d;
                String simpleName = h0Var.getClass().getSimpleName();
                String message = th3.getMessage();
                hVar.q(th3, s1.c("RelatedPinsFilteringDataManager loadMore pagination failure for PagedList ", simpleName, " ", message != null ? message : ""), tb0.p.RELATED_PINS);
                nVar.a().P(h0Var.a(), new o01.g());
                break;
            default:
                tb0.h hVar2 = nVar.f98388d;
                String simpleName2 = h0Var.getClass().getSimpleName();
                String message2 = th3.getMessage();
                hVar2.q(th3, s1.c("RelatedPinsFilteringDataManager initial data load failure for PagedList ", simpleName2, " ", message2 != null ? message2 : ""), tb0.p.RELATED_PINS);
                nVar.a().P(0, new o01.f());
                nVar.f98386b.onPinsLoadedAfterFilterUpdate(h0Var);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f98382i) {
            case 0:
                h0 h0Var = this.f98384k;
                if (!h0Var.t0()) {
                    this.f98383j.a().P(h0Var.a(), new o01.g());
                }
                break;
            case 1:
                b((Throwable) obj);
                break;
            default:
                b((Throwable) obj);
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(n nVar, h0 h0Var, int i13) {
        super(1);
        this.f98382i = i13;
        this.f98383j = nVar;
        this.f98384k = h0Var;
    }
}
