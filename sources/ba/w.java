package ba;

import kh2.k3;
import kh2.m2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import z9.e0;

/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22302i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f22303j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f22304k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f22305l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f22306m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xk2.g f22307n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ xk2.g f22308o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ xk2.g f22309p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ xk2.g f22310q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f22311r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f22312s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(om0.z zVar, u2.q qVar, om1.f fVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, int i13, int i14) {
        super(2);
        this.f22302i = 3;
        this.f22303j = zVar;
        this.f22305l = qVar;
        this.f22304k = fVar;
        this.f22306m = function0;
        this.f22307n = function02;
        this.f22308o = function03;
        this.f22309p = function04;
        this.f22310q = function05;
        this.f22311r = i13;
        this.f22312s = i14;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f22302i;
        int i15 = this.f22311r;
        xk2.g gVar = this.f22310q;
        xk2.g gVar2 = this.f22309p;
        xk2.g gVar3 = this.f22308o;
        xk2.g gVar4 = this.f22307n;
        Object obj = this.f22306m;
        Object obj2 = this.f22304k;
        Object obj3 = this.f22303j;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i15 | 1);
                int i16 = this.f22312s;
                m2.G((e0) obj3, (z9.b0) obj2, this.f22305l, (u2.e) obj, (Function1) gVar4, (Function1) gVar3, (Function1) gVar2, (Function1) gVar, oVar, p13, i16);
                break;
            case 1:
                int p14 = i2.u.p(i15 | 1);
                int i17 = this.f22312s;
                m2.G((e0) obj3, (z9.b0) obj2, this.f22305l, (u2.e) obj, (Function1) gVar4, (Function1) gVar3, (Function1) gVar2, (Function1) gVar, oVar, p14, i17);
                break;
            case 2:
                int p15 = i2.u.p(i15 | 1);
                int i18 = this.f22312s;
                m2.G((e0) obj3, (z9.b0) obj2, this.f22305l, (u2.e) obj, (Function1) gVar4, (Function1) gVar3, (Function1) gVar2, (Function1) gVar, oVar, p15, i18);
                break;
            default:
                int p16 = i2.u.p(i15 | 1);
                int i19 = this.f22312s;
                k3.g((om0.z) obj3, this.f22305l, (om1.f) obj2, (Function0) obj, (Function0) gVar4, (Function0) gVar3, (Function0) gVar2, (Function0) gVar, oVar, p16, i19);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f22302i) {
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
    public /* synthetic */ w(e0 e0Var, z9.b0 b0Var, u2.q qVar, u2.e eVar, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i13, int i14, int i15) {
        super(2);
        this.f22302i = i15;
        this.f22303j = e0Var;
        this.f22304k = b0Var;
        this.f22305l = qVar;
        this.f22306m = eVar;
        this.f22307n = function1;
        this.f22308o = function12;
        this.f22309p = function13;
        this.f22310q = function14;
        this.f22311r = i13;
        this.f22312s = i14;
    }
}
