package lb2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f82797i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f82798j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ mr1.c f82799k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, mr1.c cVar, int i13) {
        super(1);
        this.f82797i = i13;
        this.f82798j = qVar;
        this.f82799k = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f82797i;
        mr1.c cVar = this.f82799k;
        q qVar = this.f82798j;
        switch (i13) {
            case 0:
                qr1.t authResult = (qr1.t) obj;
                Intrinsics.checkNotNullParameter(authResult, "authResult");
                return q.a(qVar, authResult, cVar);
            default:
                qVar.getClass();
                cVar.H3(i.f82772q);
                return Unit.f80348a;
        }
    }
}
