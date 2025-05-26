package ra0;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final class m0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ j0 f106962i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f106963j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ float f106964k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f106965l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ u50.i f106966m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f106967n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f106968o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, u2.q qVar, float f13, float f14, u50.i iVar, int i13, int i14) {
        super(2);
        this.f106962i = j0Var;
        this.f106963j = qVar;
        this.f106964k = f13;
        this.f106965l = f14;
        this.f106966m = iVar;
        this.f106967n = i13;
        this.f106968o = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f106967n | 1);
        float f13 = this.f106965l;
        u50.i iVar = this.f106966m;
        kh2.s0.d(this.f106962i, this.f106963j, this.f106964k, f13, iVar, (i2.o) obj, p13, this.f106968o);
        return Unit.f80348a;
    }
}
