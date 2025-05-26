package b2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import t3.e4;
import t3.f2;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e4 f21113i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f21114j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f21115k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u2.q f21116l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l f21117m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e4 e4Var, long j13, boolean z13, u2.q qVar, l lVar) {
        super(2);
        this.f21113i = e4Var;
        this.f21114j = j13;
        this.f21115k = z13;
        this.f21116l = qVar;
        this.f21117m = lVar;
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
        com.bumptech.glide.d.a(f2.f115994q.c(this.f21113i), q2.i.c(-1426434671, new b(this.f21114j, this.f21115k, this.f21116l, this.f21117m), oVar), oVar, 56);
        return Unit.f80348a;
    }
}
