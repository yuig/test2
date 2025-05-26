package ia0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import s1.o0;

/* loaded from: classes5.dex */
public final class y extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List f71999i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ u2.q f72000j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ o0 f72001k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ float f72002l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f72003m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function1 f72004n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f72005o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f72006p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f72007q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(List list, u2.q qVar, o0 o0Var, float f13, float f14, Function1 function1, Function1 function12, int i13, int i14) {
        super(2);
        this.f71999i = list;
        this.f72000j = qVar;
        this.f72001k = o0Var;
        this.f72002l = f13;
        this.f72003m = f14;
        this.f72004n = function1;
        this.f72005o = function12;
        this.f72006p = i13;
        this.f72007q = i14;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int p13 = i2.u.p(this.f72006p | 1);
        Function1 function1 = this.f72004n;
        Function1 function12 = this.f72005o;
        z.d(this.f71999i, this.f72000j, this.f72001k, this.f72002l, this.f72003m, function1, function12, (i2.o) obj, p13, this.f72007q);
        return Unit.f80348a;
    }
}
