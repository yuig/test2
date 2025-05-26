package yy0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class v extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f140474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d f140475j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f140476k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f140477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f140478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f140479n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(d dVar, u2.q qVar, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f140474i = i15;
        this.f140475j = dVar;
        this.f140476k = qVar;
        this.f140477l = function1;
        this.f140478m = i13;
        this.f140479n = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f140474i;
        int i15 = this.f140478m;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                dn.c.c(this.f140475j, this.f140476k, this.f140477l, oVar, p13, this.f140479n);
                break;
            default:
                dn.c.g(this.f140475j, this.f140476k, this.f140477l, oVar, i2.u.p(i15 | 1), this.f140479n);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f140474i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
