package w1;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class p extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b4.g f127424i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f127425j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b4.q0 f127426k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f127427l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f127428m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f127429n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f127430o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f127431p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Map f127432q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b3.x f127433r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f127434s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f127435t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(b4.g gVar, u2.q qVar, b4.q0 q0Var, Function1 function1, int i13, boolean z13, int i14, int i15, Map map, b3.x xVar, int i16, int i17) {
        super(2);
        this.f127424i = gVar;
        this.f127425j = qVar;
        this.f127426k = q0Var;
        this.f127427l = function1;
        this.f127428m = i13;
        this.f127429n = z13;
        this.f127430o = i14;
        this.f127431p = i15;
        this.f127432q = map;
        this.f127433r = xVar;
        this.f127434s = i16;
        this.f127435t = i17;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f127434s | 1);
        Map map = this.f127432q;
        b3.x xVar = this.f127433r;
        g1.a(this.f127424i, this.f127425j, this.f127426k, this.f127427l, this.f127428m, this.f127429n, this.f127430o, this.f127431p, map, xVar, (i2.o) obj, p13, this.f127435t);
        return Unit.f80348a;
    }
}
