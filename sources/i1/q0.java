package i1;

import j1.p2;
import j1.q2;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class q0 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final q0 f70873j = new q0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final q0 f70874k = new q0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final q0 f70875l = new q0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final q0 f70876m = new q0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final q0 f70877n = new q0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final q0 f70878o = new q0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final q0 f70879p = new q0(6);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f70880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i13) {
        super(1);
        this.f70880i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f70880i;
        long d2 = lb.l0.d(0, 0);
        switch (i13) {
            case 0:
                long a13 = b3.w.a(((b3.w) obj).f21392a, c3.f.f25511t);
                return new j1.s(b3.w.d(a13), b3.w.h(a13), b3.w.g(a13), b3.w.e(a13));
            case 1:
                q0 q0Var = f70873j;
                q0.e eVar = new q0.e((c3.d) obj, 4);
                p2 p2Var = q2.f74205a;
                return new p2(q0Var, eVar);
            case 2:
                long j13 = ((n4.j) obj).f89186a;
                return new n4.j(d2);
            case 3:
                ((Number) obj).intValue();
                return 0;
            case 4:
                long j14 = ((n4.j) obj).f89186a;
                return new n4.j(d2);
            case 5:
                ((Number) obj).intValue();
                return 0;
            default:
                return androidx.compose.animation.a.f17068c;
        }
    }
}
