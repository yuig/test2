package nc0;

import b4.g;
import i2.o;
import i2.u;
import kh2.k3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.s;
import u2.q;

/* loaded from: classes5.dex */
public final class b extends s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ rm1.d f90343i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ gc0.a f90344j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ rm1.d f90345k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ gc0.a f90346l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f90347m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ q f90348n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function0 f90349o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Function0 f90350p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f90351q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f90352r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f90353s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(rm1.d dVar, gc0.a aVar, rm1.d dVar2, gc0.a aVar2, g gVar, q qVar, Function0 function0, Function0 function02, e eVar, int i13, int i14) {
        super(2);
        this.f90343i = dVar;
        this.f90344j = aVar;
        this.f90345k = dVar2;
        this.f90346l = aVar2;
        this.f90347m = gVar;
        this.f90348n = qVar;
        this.f90349o = function0;
        this.f90350p = function02;
        this.f90351q = eVar;
        this.f90352r = i13;
        this.f90353s = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = u.p(this.f90352r | 1);
        Function0 function0 = this.f90350p;
        e eVar = this.f90351q;
        k3.n(this.f90343i, this.f90344j, this.f90345k, this.f90346l, this.f90347m, this.f90348n, this.f90349o, function0, eVar, (o) obj, p13, this.f90353s);
        return Unit.f80348a;
    }
}
