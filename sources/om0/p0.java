package om0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class p0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f96557i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ float f96558j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f96559k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f96560l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f96561m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f96562n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(String str, float f13, u2.q qVar, int i13, int i14) {
        super(2);
        this.f96562n = str;
        this.f96558j = f13;
        this.f96559k = qVar;
        this.f96560l = i13;
        this.f96561m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f96557i;
        int i15 = this.f96560l;
        Object obj = this.f96562n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                kotlin.jvm.internal.r.c((q0) obj, this.f96559k, this.f96558j, oVar, p13, this.f96561m);
                break;
            default:
                oe.f.a((String) obj, this.f96558j, this.f96559k, oVar, i2.u.p(i15 | 1), this.f96561m);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f96557i) {
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
    public p0(q0 q0Var, u2.q qVar, float f13, int i13, int i14) {
        super(2);
        this.f96562n = q0Var;
        this.f96559k = qVar;
        this.f96558j = f13;
        this.f96560l = i13;
        this.f96561m = i14;
    }
}
