package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s2 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25183i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f25184j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f25185k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f25186l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f25187m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f25188n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f25189o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(long j13, b4.q0 q0Var, Float f13, Function2 function2, int i13, int i14) {
        super(2);
        this.f25184j = j13;
        this.f25187m = q0Var;
        this.f25188n = f13;
        this.f25189o = function2;
        this.f25185k = i13;
        this.f25186l = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f25183i;
        int i15 = this.f25185k;
        Object obj = this.f25188n;
        Object obj2 = this.f25189o;
        Object obj3 = this.f25187m;
        switch (i14) {
            case 0:
                u2.a((g3.b) obj3, (String) obj, (u2.q) obj2, this.f25184j, oVar, i2.u.p(i15 | 1), this.f25186l);
                break;
            case 1:
                int p13 = i2.u.p(i15 | 1);
                int i16 = this.f25186l;
                q5.b(this.f25184j, (b4.q0) obj3, (Float) obj, (Function2) obj2, oVar, p13, i16);
                break;
            default:
                int p14 = i2.u.p(i15 | 1);
                int i17 = this.f25186l;
                om0.o1.f((om0.q1) obj3, (u2.q) obj2, this.f25184j, (Function0) obj, oVar, p14, i17);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f25183i) {
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
    public s2(g3.b bVar, String str, u2.q qVar, long j13, int i13, int i14) {
        super(2);
        this.f25187m = bVar;
        this.f25188n = str;
        this.f25189o = qVar;
        this.f25184j = j13;
        this.f25185k = i13;
        this.f25186l = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(om0.q1 q1Var, u2.q qVar, long j13, Function0 function0, int i13, int i14) {
        super(2);
        this.f25187m = q1Var;
        this.f25189o = qVar;
        this.f25184j = j13;
        this.f25188n = function0;
        this.f25185k = i13;
        this.f25186l = i14;
    }
}
