package w1;

import java.util.List;
import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class n0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127407i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f127408j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f127409k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f127410l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n0(Object obj, boolean z13, int i13, int i14) {
        super(2);
        this.f127407i = i14;
        this.f127410l = obj;
        this.f127408j = z13;
        this.f127409k = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127407i;
        boolean z13 = this.f127408j;
        int i15 = this.f127409k;
        Object obj = this.f127410l;
        switch (i14) {
            case 0:
                g1.h((b2.t0) obj, z13, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                kh2.s0.p((List) obj, z13, oVar, i2.u.p(i15 | 1));
                break;
            default:
                g3.a(z13, (Function0) obj, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127407i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z13, Function0 function0, int i13) {
        super(2);
        this.f127407i = 2;
        this.f127408j = z13;
        this.f127410l = function0;
        this.f127409k = i13;
    }
}
