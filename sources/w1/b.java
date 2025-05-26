package w1;

import kh2.n3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127155i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f127156j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ long f127157k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f127158l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f127159m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f127160n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, u2.q qVar, long j13, int i13, int i14, int i15) {
        super(2);
        this.f127155i = i15;
        this.f127160n = obj;
        this.f127156j = qVar;
        this.f127157k = j13;
        this.f127158l = i13;
        this.f127159m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127155i;
        int i15 = this.f127158l;
        Object obj = this.f127160n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                f.a((b2.l) obj, this.f127156j, this.f127157k, oVar, p13, this.f127159m);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                n3.d((ia0.b) obj, this.f127156j, this.f127157k, oVar, p14, this.f127159m);
                break;
            default:
                br1.e0.f((String) obj, this.f127157k, this.f127156j, oVar, i2.u.p(i15 | 1), this.f127159m);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127155i) {
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
    public b(String str, long j13, u2.q qVar, int i13, int i14) {
        super(2);
        this.f127155i = 2;
        this.f127160n = str;
        this.f127157k = j13;
        this.f127156j = qVar;
        this.f127158l = i13;
        this.f127159m = i14;
    }
}
