package f2;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements kl2.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f60911i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o1.l f60912j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f60913k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f60914l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(o1.l lVar, k kVar, boolean z13, int i13) {
        super(3);
        this.f60911i = i13;
        this.f60912j = lVar;
        this.f60913k = kVar;
        this.f60914l = z13;
    }

    public final void b(e0 e0Var, i2.o oVar, int i13) {
        switch (this.f60911i) {
            case 0:
                s.f60907a.a(this.f60912j, null, this.f60913k, this.f60914l, 0L, oVar, 196608, 18);
                break;
            default:
                s.f60907a.a(this.f60912j, null, this.f60913k, this.f60914l, 0L, oVar, 196608, 18);
                break;
        }
    }

    @Override // kl2.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.f60911i) {
            case 0:
                b((e0) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
            default:
                b((e0) obj, (i2.o) obj2, ((Number) obj3).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
