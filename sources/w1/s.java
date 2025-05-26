package w1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class s extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f127474i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ b4.g f127475j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f127476k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f127477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Map f127478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127479n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f127480o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f127481p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f127482q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f127483r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g4.d f127484s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b3.x f127485t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function1 f127486u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f127487v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f127488w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f127489x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u2.q qVar, b4.g gVar, Function1 function1, boolean z13, Map map, b4.q0 q0Var, int i13, boolean z14, int i14, int i15, g4.d dVar, b3.x xVar, Function1 function12, int i16, int i17, int i18) {
        super(2);
        this.f127474i = qVar;
        this.f127475j = gVar;
        this.f127476k = function1;
        this.f127477l = z13;
        this.f127478m = map;
        this.f127479n = q0Var;
        this.f127480o = i13;
        this.f127481p = z14;
        this.f127482q = i14;
        this.f127483r = i15;
        this.f127484s = dVar;
        this.f127485t = xVar;
        this.f127486u = function12;
        this.f127487v = i16;
        this.f127488w = i17;
        this.f127489x = i18;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f127487v | 1);
        int p14 = i2.u.p(this.f127488w);
        g4.d dVar = this.f127484s;
        b3.x xVar = this.f127485t;
        g1.f(this.f127474i, this.f127475j, this.f127476k, this.f127477l, this.f127478m, this.f127479n, this.f127480o, this.f127481p, this.f127482q, this.f127483r, dVar, xVar, this.f127486u, (i2.o) obj, p13, p14, this.f127489x);
        return Unit.f80348a;
    }
}
