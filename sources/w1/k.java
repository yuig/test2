package w1;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class k extends kotlin.jvm.internal.s implements Function2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127318i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Function1 f127319j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u2.q f127320k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f127321l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f127322m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127323n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f127324o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ j1 f127325p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f127326q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f127327r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f127328s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ h4.p0 f127329t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f127330u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ o1.l f127331v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b3.s f127332w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kl2.l f127333x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f127334y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ int f127335z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(h4.f0 f0Var, Function1 function1, u2.q qVar, b4.q0 q0Var, h4.p0 p0Var, Function1 function12, o1.l lVar, b3.s sVar, boolean z13, int i13, int i14, h4.o oVar, j1 j1Var, boolean z14, boolean z15, kl2.l lVar2, int i15, int i16, int i17) {
        super(2);
        this.f127318i = 2;
        this.B = f0Var;
        this.f127319j = function1;
        this.f127320k = qVar;
        this.f127323n = q0Var;
        this.f127329t = p0Var;
        this.f127330u = function12;
        this.f127331v = lVar;
        this.f127332w = sVar;
        this.f127321l = z13;
        this.f127327r = i13;
        this.f127328s = i14;
        this.f127324o = oVar;
        this.f127325p = j1Var;
        this.f127322m = z14;
        this.f127326q = z15;
        this.f127333x = lVar2;
        this.f127334y = i15;
        this.f127335z = i16;
        this.A = i17;
    }

    public final void b(i2.o oVar, int i13) {
        int i14 = this.f127318i;
        int i15 = this.f127335z;
        int i16 = this.f127334y;
        Object obj = this.f127324o;
        Object obj2 = this.B;
        switch (i14) {
            case 0:
                int p13 = i2.u.p(i16 | 1);
                int p14 = i2.u.p(i15);
                o1.l lVar = this.f127331v;
                int i17 = this.A;
                m.a((h4.f0) obj2, this.f127319j, this.f127320k, this.f127321l, this.f127322m, this.f127323n, (k1) obj, this.f127325p, this.f127326q, this.f127327r, this.f127328s, this.f127329t, this.f127330u, lVar, this.f127332w, this.f127333x, oVar, p13, p14, i17);
                break;
            case 1:
                int p15 = i2.u.p(i16 | 1);
                int p16 = i2.u.p(i15);
                o1.l lVar2 = this.f127331v;
                int i18 = this.A;
                m.b((String) obj2, this.f127319j, this.f127320k, this.f127321l, this.f127322m, this.f127323n, (k1) obj, this.f127325p, this.f127326q, this.f127327r, this.f127328s, this.f127329t, this.f127330u, lVar2, this.f127332w, this.f127333x, oVar, p15, p16, i18);
                break;
            default:
                int p17 = i2.u.p(i16 | 1);
                int p18 = i2.u.p(i15);
                boolean z13 = this.f127322m;
                int i19 = this.A;
                g1.d((h4.f0) obj2, this.f127319j, this.f127320k, this.f127323n, this.f127329t, this.f127330u, this.f127331v, this.f127332w, this.f127321l, this.f127327r, this.f127328s, (h4.o) obj, this.f127325p, z13, this.f127326q, this.f127333x, oVar, p17, p18, i19);
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f127318i) {
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
    public /* synthetic */ k(Object obj, Function1 function1, u2.q qVar, boolean z13, boolean z14, b4.q0 q0Var, k1 k1Var, j1 j1Var, boolean z15, int i13, int i14, h4.p0 p0Var, Function1 function12, o1.l lVar, b3.s sVar, kl2.l lVar2, int i15, int i16, int i17, int i18) {
        super(2);
        this.f127318i = i18;
        this.B = obj;
        this.f127319j = function1;
        this.f127320k = qVar;
        this.f127321l = z13;
        this.f127322m = z14;
        this.f127323n = q0Var;
        this.f127324o = k1Var;
        this.f127325p = j1Var;
        this.f127326q = z15;
        this.f127327r = i13;
        this.f127328s = i14;
        this.f127329t = p0Var;
        this.f127330u = function12;
        this.f127331v = lVar;
        this.f127332w = sVar;
        this.f127333x = lVar2;
        this.f127334y = i15;
        this.f127335z = i16;
        this.A = i17;
    }
}
