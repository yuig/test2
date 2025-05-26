package tc0;

import kh2.g3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p1.f1;

/* loaded from: classes5.dex */
public final class r0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f1 f117304i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f117305j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f117306k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f117307l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f117308m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f117309n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f117310o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f117311p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(f1 f1Var, int i13, boolean z13, Function1 function1, Function0 function0, Function1 function12, int i14, int i15) {
        super(2);
        this.f117304i = f1Var;
        this.f117305j = i13;
        this.f117306k = z13;
        this.f117307l = function1;
        this.f117308m = function0;
        this.f117309n = function12;
        this.f117310o = i14;
        this.f117311p = i15;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f117310o | 1);
        Function1 function1 = this.f117309n;
        g3.c(this.f117304i, this.f117305j, this.f117306k, this.f117307l, this.f117308m, function1, (i2.o) obj, p13, this.f117311p);
        return Unit.f80348a;
    }
}
