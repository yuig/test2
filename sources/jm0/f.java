package jm0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lm0.c0;
import lm0.d0;
import so.ba;

/* loaded from: classes5.dex */
public final class f extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f76964i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ j f76965j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, int i13) {
        super(1);
        this.f76964i = i13;
        this.f76965j = jVar;
    }

    public final void b(int i13) {
        int i14 = this.f76964i;
        j jVar = this.f76965j;
        switch (i14) {
            case 2:
                lm0.p pVar = new lm0.p(i13);
                int i15 = j.f76978k1;
                jVar.n9(pVar);
                break;
            case 3:
                lm0.l lVar = new lm0.l(new sk0.g(i13));
                int i16 = j.f76978k1;
                jVar.n9(lVar);
                break;
            case 4:
                lm0.l lVar2 = new lm0.l(new sk0.h(i13));
                int i17 = j.f76978k1;
                jVar.n9(lVar2);
                break;
            case 5:
                lm0.i a13 = d0.a(new tk0.o(i13));
                int i18 = j.f76978k1;
                jVar.n9(a13);
                break;
            default:
                lm0.i a14 = d0.a(new tk0.p(i13));
                int i19 = j.f76978k1;
                jVar.n9(a14);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f76964i;
        j jVar = this.f76965j;
        switch (i13) {
            case 0:
                String sectionId = (String) obj;
                Intrinsics.checkNotNullParameter(sectionId, "sectionId");
                lm0.j jVar2 = new lm0.j(sectionId);
                int i14 = j.f76978k1;
                jVar.n9(jVar2);
                return Unit.f80348a;
            case 1:
                c0 vmState = (c0) obj;
                Intrinsics.checkNotNullParameter(vmState, "vmState");
                ni1.d0 d0Var = jVar.O0;
                if (d0Var != null) {
                    return ((ba) d0Var).a(vmState.f83850b, new mq.w(jVar, 4), new a8.v(jVar, 29)).a(vmState.f83852d, vmState.f83849a);
                }
                Intrinsics.r("pgcVMStateConverterFactory");
                throw null;
            case 2:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 3:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 4:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            case 5:
                b(((Number) obj).intValue());
                return Unit.f80348a;
            default:
                b(((Number) obj).intValue());
                return Unit.f80348a;
        }
    }
}
