package s80;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class c4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111481i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f111482j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f111483k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111484l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f111485m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(Function1 function1, u2.q qVar, int i13, int i14) {
        super(2);
        this.f111482j = function1;
        this.f111483k = qVar;
        this.f111484l = i13;
        this.f111485m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f111481i;
        Function1 function1 = this.f111482j;
        u2.q qVar = this.f111483k;
        int i15 = this.f111485m;
        int i16 = this.f111484l;
        switch (i14) {
            case 0:
                kh2.u2.l(i2.u.p(i16 | 1), i15, oVar, qVar, function1);
                break;
            default:
                oe.f.c(i2.u.p(i16 | 1), i15, oVar, qVar, function1);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f111481i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(u2.q qVar, Function1 function1, int i13, int i14) {
        super(2);
        this.f111483k = qVar;
        this.f111482j = function1;
        this.f111484l = i13;
        this.f111485m = i14;
    }
}
