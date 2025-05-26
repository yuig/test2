package c2;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y4 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p1.u f25425i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ boolean f25426j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f25427k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ l1 f25428l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f25429m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ o1.k f25430n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f25431o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(p1.u uVar, boolean z13, boolean z14, l1 l1Var, Function0 function0, o1.k kVar, int i13) {
        super(2);
        this.f25425i = uVar;
        this.f25426j = z13;
        this.f25427k = z14;
        this.f25428l = l1Var;
        this.f25429m = function0;
        this.f25430n = kVar;
        this.f25431o = i13;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f25431o | 1);
        Function0 function0 = this.f25429m;
        o1.k kVar = this.f25430n;
        z4.b(this.f25425i, this.f25426j, this.f25427k, this.f25428l, function0, kVar, (i2.o) obj, p13);
        return Unit.f80348a;
    }
}
