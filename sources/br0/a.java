package br0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import rm1.k;
import rm1.q;
import rq.o2;

/* loaded from: classes5.dex */
public final class a extends s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f23729i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ rm1.c f23730j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f23731k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i13, rm1.c cVar, q qVar) {
        super(1);
        this.f23729i = i13;
        this.f23730j = cVar;
        this.f23731k = qVar;
    }

    public final void b(k bind) {
        int i13 = this.f23729i;
        rm1.c cVar = this.f23730j;
        q qVar = this.f23731k;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 7));
                bind.a(cVar);
                break;
            default:
                Intrinsics.checkNotNullParameter(bind, "$this$bind");
                bind.b(new o2(qVar, 10));
                bind.a(cVar);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23729i) {
            case 0:
                b((k) obj);
                break;
            default:
                b((k) obj);
                break;
        }
        return Unit.f80348a;
    }
}
