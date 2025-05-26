package f2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u2.q f60940i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e0 f60941j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f60942k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ o1.l f60943l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kl2.l f60944m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kl2.l f60945n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f60946o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(u2.q qVar, e0 e0Var, boolean z13, o1.l lVar, kl2.l lVar2, kl2.l lVar3, int i13) {
        super(2);
        this.f60940i = qVar;
        this.f60941j = e0Var;
        this.f60942k = z13;
        this.f60943l = lVar;
        this.f60944m = lVar2;
        this.f60945n = lVar3;
        this.f60946o = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f60946o | 1);
        kl2.l lVar = this.f60944m;
        kl2.l lVar2 = this.f60945n;
        c0.c(this.f60940i, this.f60941j, this.f60942k, this.f60943l, lVar, lVar2, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
