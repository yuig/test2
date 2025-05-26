package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class t3 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f25243i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f25244j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function2 f25245k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25246l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function2 f25247m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ d3 f25248n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function2 f25249o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ kl2.l f25250p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ a4 f25251q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(boolean z13, int i13, Function2 function2, kl2.l lVar, Function2 function22, d3 d3Var, Function2 function23, kl2.l lVar2, a4 a4Var) {
        super(2);
        this.f25243i = z13;
        this.f25244j = i13;
        this.f25245k = function2;
        this.f25246l = lVar;
        this.f25247m = function22;
        this.f25248n = d3Var;
        this.f25249o = function23;
        this.f25250p = lVar2;
        this.f25251q = a4Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        i2.o oVar = (i2.o) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            i2.s sVar = (i2.s) oVar;
            if (sVar.z()) {
                sVar.Q();
                return Unit.f80348a;
            }
        }
        y3.c(this.f25243i, this.f25244j, this.f25245k, this.f25246l, q2.i.c(433906483, new c(4, this.f25250p, this.f25251q), oVar), this.f25247m, this.f25248n, this.f25249o, oVar, 24576);
        return Unit.f80348a;
    }
}
