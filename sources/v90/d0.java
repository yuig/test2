package v90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class d0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f124875i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f124876j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f124877k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(i0 i0Var, int i13, int i14) {
        super(2);
        this.f124875i = i14;
        this.f124876j = i0Var;
        this.f124877k = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f124875i;
        i0 i0Var = this.f124876j;
        int i15 = this.f124877k;
        switch (i14) {
            case 0:
                i0.Y7(i0Var, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                i0.Z7(i0Var, oVar, i2.u.p(i15 | 1));
                break;
            default:
                i0.a8(i0Var, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f124875i) {
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
}
