package w1;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class t extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: j, reason: collision with root package name */
    public static final t f127499j = new t(1);

    /* renamed from: k, reason: collision with root package name */
    public static final t f127500k = new t(2);

    /* renamed from: l, reason: collision with root package name */
    public static final t f127501l = new t(3);

    /* renamed from: m, reason: collision with root package name */
    public static final t f127502m = new t(4);

    /* renamed from: n, reason: collision with root package name */
    public static final t f127503n = new t(6);

    /* renamed from: o, reason: collision with root package name */
    public static final t f127504o = new t(7);

    /* renamed from: p, reason: collision with root package name */
    public static final t f127505p = new t(8);

    /* renamed from: q, reason: collision with root package name */
    public static final t f127506q = new t(9);

    /* renamed from: r, reason: collision with root package name */
    public static final t f127507r = new t(10);

    /* renamed from: s, reason: collision with root package name */
    public static final t f127508s = new t(11);

    /* renamed from: t, reason: collision with root package name */
    public static final t f127509t = new t(12);

    /* renamed from: u, reason: collision with root package name */
    public static final t f127510u = new t(13);

    /* renamed from: v, reason: collision with root package name */
    public static final t f127511v = new t(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127512i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i13) {
        super(1);
        this.f127512i = i13;
    }

    public final h4.h b(b2.p0 p0Var) {
        switch (this.f127512i) {
            case 8:
                long j13 = p0Var.f21158f;
                int i13 = b4.p0.f21640c;
                return new h4.h(((int) (j13 & 4294967295L)) - g1.t((int) (4294967295L & j13), p0Var.f21159g.f21571a), 0);
            case 9:
                String str = p0Var.f21159g.f21571a;
                long j14 = p0Var.f21158f;
                int i14 = b4.p0.f21640c;
                int q13 = g1.q((int) (j14 & 4294967295L), str);
                if (q13 != -1) {
                    return new h4.h(0, q13 - ((int) (4294967295L & p0Var.f21158f)));
                }
                return null;
            case 10:
                Integer d2 = p0Var.d();
                if (d2 == null) {
                    return null;
                }
                int intValue = d2.intValue();
                long j15 = p0Var.f21158f;
                int i15 = b4.p0.f21640c;
                return new h4.h(((int) (4294967295L & j15)) - intValue, 0);
            case 11:
                Integer c13 = p0Var.c();
                if (c13 == null) {
                    return null;
                }
                int intValue2 = c13.intValue();
                long j16 = p0Var.f21158f;
                int i16 = b4.p0.f21640c;
                return new h4.h(0, intValue2 - ((int) (4294967295L & j16)));
            case 12:
                Integer b13 = p0Var.b();
                if (b13 == null) {
                    return null;
                }
                int intValue3 = b13.intValue();
                long j17 = p0Var.f21158f;
                int i17 = b4.p0.f21640c;
                return new h4.h(((int) (4294967295L & j17)) - intValue3, 0);
            default:
                Integer a13 = p0Var.a();
                if (a13 == null) {
                    return null;
                }
                int intValue4 = a13.intValue();
                long j18 = p0Var.f21158f;
                int i18 = b4.p0.f21640c;
                return new h4.h(0, intValue4 - ((int) (4294967295L & j18)));
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127512i;
        switch (i13) {
            case 0:
                return Long.valueOf(((Number) obj).longValue());
            case 1:
                return Unit.f80348a;
            case 2:
                return Unit.f80348a;
            case 3:
                return Unit.f80348a;
            case 4:
                j1.a1 a1Var = (j1.a1) obj;
                a1Var.f74021a = 1000;
                a1Var.a(0, Float.valueOf(1.0f));
                a1Var.a(499, Float.valueOf(1.0f));
                a1Var.a(500, Float.valueOf(0.0f));
                a1Var.a(999, Float.valueOf(0.0f));
                return Unit.f80348a;
            case 5:
                return Unit.f80348a;
            case 6:
                b2.p0 p0Var = (b2.p0) obj;
                switch (i13) {
                    case 6:
                        b2.z0 z0Var = p0Var.f21157e;
                        z0Var.f21274a = null;
                        if (p0Var.f21159g.f21571a.length() > 0) {
                            if (!p0Var.e()) {
                                z0Var.f21274a = null;
                                if (p0Var.f21159g.f21571a.length() > 0) {
                                    String str = p0Var.f21159g.f21571a;
                                    long j13 = p0Var.f21158f;
                                    int i14 = b4.p0.f21640c;
                                    int q13 = g1.q((int) (4294967295L & j13), str);
                                    if (q13 != -1) {
                                        p0Var.l(q13, q13);
                                        break;
                                    }
                                }
                            } else {
                                z0Var.f21274a = null;
                                if (p0Var.f21159g.f21571a.length() > 0) {
                                    String str2 = p0Var.f21159g.f21571a;
                                    long j14 = p0Var.f21158f;
                                    int i15 = b4.p0.f21640c;
                                    int t13 = g1.t((int) (4294967295L & j14), str2);
                                    if (t13 != -1) {
                                        p0Var.l(t13, t13);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        b2.z0 z0Var2 = p0Var.f21157e;
                        z0Var2.f21274a = null;
                        if (p0Var.f21159g.f21571a.length() > 0) {
                            if (!p0Var.e()) {
                                z0Var2.f21274a = null;
                                if (p0Var.f21159g.f21571a.length() > 0) {
                                    String str3 = p0Var.f21159g.f21571a;
                                    long j15 = p0Var.f21158f;
                                    int i16 = b4.p0.f21640c;
                                    int t14 = g1.t((int) (4294967295L & j15), str3);
                                    if (t14 != -1) {
                                        p0Var.l(t14, t14);
                                        break;
                                    }
                                }
                            } else {
                                z0Var2.f21274a = null;
                                if (p0Var.f21159g.f21571a.length() > 0) {
                                    String str4 = p0Var.f21159g.f21571a;
                                    long j16 = p0Var.f21158f;
                                    int i17 = b4.p0.f21640c;
                                    int q14 = g1.q((int) (4294967295L & j16), str4);
                                    if (q14 != -1) {
                                        p0Var.l(q14, q14);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f80348a;
            case 7:
                b2.p0 p0Var2 = (b2.p0) obj;
                switch (i13) {
                    case 6:
                        b2.z0 z0Var3 = p0Var2.f21157e;
                        z0Var3.f21274a = null;
                        if (p0Var2.f21159g.f21571a.length() > 0) {
                            if (!p0Var2.e()) {
                                z0Var3.f21274a = null;
                                if (p0Var2.f21159g.f21571a.length() > 0) {
                                    String str5 = p0Var2.f21159g.f21571a;
                                    long j17 = p0Var2.f21158f;
                                    int i18 = b4.p0.f21640c;
                                    int q15 = g1.q((int) (4294967295L & j17), str5);
                                    if (q15 != -1) {
                                        p0Var2.l(q15, q15);
                                        break;
                                    }
                                }
                            } else {
                                z0Var3.f21274a = null;
                                if (p0Var2.f21159g.f21571a.length() > 0) {
                                    String str6 = p0Var2.f21159g.f21571a;
                                    long j18 = p0Var2.f21158f;
                                    int i19 = b4.p0.f21640c;
                                    int t15 = g1.t((int) (4294967295L & j18), str6);
                                    if (t15 != -1) {
                                        p0Var2.l(t15, t15);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    default:
                        b2.z0 z0Var4 = p0Var2.f21157e;
                        z0Var4.f21274a = null;
                        if (p0Var2.f21159g.f21571a.length() > 0) {
                            if (!p0Var2.e()) {
                                z0Var4.f21274a = null;
                                if (p0Var2.f21159g.f21571a.length() > 0) {
                                    String str7 = p0Var2.f21159g.f21571a;
                                    long j19 = p0Var2.f21158f;
                                    int i23 = b4.p0.f21640c;
                                    int t16 = g1.t((int) (4294967295L & j19), str7);
                                    if (t16 != -1) {
                                        p0Var2.l(t16, t16);
                                        break;
                                    }
                                }
                            } else {
                                z0Var4.f21274a = null;
                                if (p0Var2.f21159g.f21571a.length() > 0) {
                                    String str8 = p0Var2.f21159g.f21571a;
                                    long j23 = p0Var2.f21158f;
                                    int i24 = b4.p0.f21640c;
                                    int q16 = g1.q((int) (4294967295L & j23), str8);
                                    if (q16 != -1) {
                                        p0Var2.l(q16, q16);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                }
                return Unit.f80348a;
            case 8:
                return b((b2.p0) obj);
            case 9:
                return b((b2.p0) obj);
            case 10:
                return b((b2.p0) obj);
            case 11:
                return b((b2.p0) obj);
            case 12:
                return b((b2.p0) obj);
            case 13:
                return b((b2.p0) obj);
            default:
                List list = (List) obj;
                Object obj2 = list.get(1);
                Intrinsics.g(obj2, "null cannot be cast to non-null type kotlin.Boolean");
                m1.f1 f1Var = ((Boolean) obj2).booleanValue() ? m1.f1.Vertical : m1.f1.Horizontal;
                Object obj3 = list.get(0);
                Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new p2(f1Var, ((Float) obj3).floatValue());
        }
    }
}
