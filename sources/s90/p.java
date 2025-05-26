package s90;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f112001i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ v f112002j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f112003k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(v vVar, int i13, int i14) {
        super(2);
        this.f112001i = i14;
        this.f112002j = vVar;
        this.f112003k = i13;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f112001i;
        v vVar = this.f112002j;
        int i15 = this.f112003k;
        switch (i14) {
            case 0:
                v.Y7(vVar, oVar, i2.u.p(i15 | 1));
                break;
            case 1:
                v.Z7(vVar, oVar, i2.u.p(i15 | 1));
                break;
            default:
                v.a8(vVar, oVar, i2.u.p(i15 | 1));
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f112001i) {
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
