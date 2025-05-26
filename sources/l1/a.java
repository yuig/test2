package l1;

import i2.u;
import kh2.a1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class a extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f81298i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o f81299j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function0 f81300k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f81301l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function1 f81302m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f81303n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f81304o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(o oVar, Function0 function0, u2.q qVar, Function1 function1, int i13, int i14, int i15) {
        super(2);
        this.f81298i = i15;
        this.f81299j = oVar;
        this.f81300k = function0;
        this.f81301l = qVar;
        this.f81302m = function1;
        this.f81303n = i13;
        this.f81304o = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f81298i;
        int i15 = this.f81303n;
        switch (i14) {
            case 0:
                int p13 = u.p(i15 | 1);
                a1.a(this.f81299j, this.f81300k, this.f81301l, this.f81302m, oVar, p13, this.f81304o);
                break;
            default:
                int p14 = u.p(i15 | 1);
                a1.a(this.f81299j, this.f81300k, this.f81301l, this.f81302m, oVar, p14, this.f81304o);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f81298i) {
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
