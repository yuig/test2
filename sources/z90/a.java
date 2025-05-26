package z90;

import i2.o;
import i2.u;
import kh2.k3;
import kh2.s0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;
import u50.i0;

/* loaded from: classes5.dex */
public final class a extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141331i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ i0 f141332j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ q f141333k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f141334l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f141335m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(i0 i0Var, q qVar, int i13, int i14, int i15) {
        super(2);
        this.f141331i = i15;
        this.f141332j = i0Var;
        this.f141333k = qVar;
        this.f141334l = i13;
        this.f141335m = i14;
    }

    public final void b(o oVar, int i13) {
        int i14 = this.f141331i;
        q qVar = this.f141333k;
        i0 i0Var = this.f141332j;
        int i15 = this.f141335m;
        int i16 = this.f141334l;
        switch (i14) {
            case 0:
                s0.s(i0Var, qVar, oVar, u.p(i16 | 1), i15);
                break;
            default:
                k3.a(i0Var, qVar, oVar, u.p(i16 | 1), i15);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f141331i) {
            case 0:
                b((o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }
}
