package p1;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s80.b7;

/* loaded from: classes2.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f98604i = 3;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f98605j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f98606k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f98607l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f98608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f98609n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f98610o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(int i13, int i14, u2.q qVar, br1.f0 f0Var, Function1 function1, boolean z13) {
        super(2);
        this.f98606k = z13;
        this.f98609n = f0Var;
        this.f98605j = qVar;
        this.f98610o = function1;
        this.f98607l = i13;
        this.f98608m = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f98604i;
        int i15 = this.f98607l;
        Object obj = this.f98610o;
        Object obj2 = this.f98609n;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                boolean z13 = this.f98606k;
                int i16 = this.f98608m;
                androidx.compose.foundation.layout.b.a(this.f98605j, (u2.e) obj2, z13, (kl2.l) obj, oVar, p13, i16);
                break;
            case 1:
                w80.z.c((w80.e) obj2, this.f98605j, this.f98606k, (Function0) obj, oVar, i2.u.p(i15 | 1), this.f98608m);
                break;
            case 2:
                int p14 = i2.u.p(i15 | 1);
                gh0.b.t((b7) obj2, (w80.h1) obj, this.f98605j, this.f98606k, oVar, p14, this.f98608m);
                break;
            default:
                int p15 = i2.u.p(i15 | 1);
                boolean z14 = this.f98606k;
                br1.e0.b(p15, this.f98608m, oVar, this.f98605j, (br1.f0) obj2, (Function1) obj, z14);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f98604i) {
            case 0:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
            default:
                b((i2.o) obj, ((Number) obj2).intValue());
                break;
        }
        return Unit.f80348a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(b7 b7Var, w80.h1 h1Var, u2.q qVar, boolean z13, int i13, int i14) {
        super(2);
        this.f98609n = b7Var;
        this.f98610o = h1Var;
        this.f98605j = qVar;
        this.f98606k = z13;
        this.f98607l = i13;
        this.f98608m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(u2.q qVar, u2.e eVar, boolean z13, kl2.l lVar, int i13, int i14) {
        super(2);
        this.f98605j = qVar;
        this.f98609n = eVar;
        this.f98606k = z13;
        this.f98610o = lVar;
        this.f98607l = i13;
        this.f98608m = i14;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(w80.e eVar, u2.q qVar, boolean z13, Function0 function0, int i13, int i14) {
        super(2);
        this.f98609n = eVar;
        this.f98605j = qVar;
        this.f98606k = z13;
        this.f98610o = function0;
        this.f98607l = i13;
        this.f98608m = i14;
    }
}
