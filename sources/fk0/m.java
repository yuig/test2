package fk0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f62311i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ q f62312j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(q qVar, int i13) {
        super(1);
        this.f62311i = i13;
        this.f62312j = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f62311i;
        q qVar = this.f62312j;
        switch (i13) {
            case 0:
                xn1.j event = (xn1.j) obj;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof xn1.i) {
                    int i14 = q.f62319j0;
                    kh2.j.x2(qVar.d8(), new b(((xn1.i) event).f135454c));
                }
                break;
            default:
                on1.i it = (on1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof on1.g) {
                    int i15 = q.f62319j0;
                    kh2.j.x2(qVar.d8(), f.f62279a);
                } else if (it instanceof on1.h) {
                    int i16 = q.f62319j0;
                    kh2.j.x2(qVar.d8(), e.f62278a);
                }
                break;
        }
        return Unit.f80348a;
    }
}
