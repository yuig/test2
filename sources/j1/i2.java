package j1;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class i2 extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f74117i;

    /* renamed from: j, reason: collision with root package name */
    public static final i2 f74100j = new i2(1);

    /* renamed from: k, reason: collision with root package name */
    public static final i2 f74101k = new i2(2);

    /* renamed from: l, reason: collision with root package name */
    public static final i2 f74102l = new i2(3);

    /* renamed from: m, reason: collision with root package name */
    public static final i2 f74103m = new i2(4);

    /* renamed from: n, reason: collision with root package name */
    public static final i2 f74104n = new i2(5);

    /* renamed from: o, reason: collision with root package name */
    public static final i2 f74105o = new i2(6);

    /* renamed from: p, reason: collision with root package name */
    public static final i2 f74106p = new i2(7);

    /* renamed from: q, reason: collision with root package name */
    public static final i2 f74107q = new i2(8);

    /* renamed from: r, reason: collision with root package name */
    public static final i2 f74108r = new i2(9);

    /* renamed from: s, reason: collision with root package name */
    public static final i2 f74109s = new i2(10);

    /* renamed from: t, reason: collision with root package name */
    public static final i2 f74110t = new i2(11);

    /* renamed from: u, reason: collision with root package name */
    public static final i2 f74111u = new i2(12);

    /* renamed from: v, reason: collision with root package name */
    public static final i2 f74112v = new i2(13);

    /* renamed from: w, reason: collision with root package name */
    public static final i2 f74113w = new i2(14);

    /* renamed from: x, reason: collision with root package name */
    public static final i2 f74114x = new i2(15);

    /* renamed from: y, reason: collision with root package name */
    public static final i2 f74115y = new i2(16);

    /* renamed from: z, reason: collision with root package name */
    public static final i2 f74116z = new i2(17);
    public static final i2 A = new i2(18);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(int i13) {
        super(1);
        this.f74117i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74117i) {
            case 0:
                ep.b.A(obj);
                throw null;
            case 1:
                long j13 = ((n4.f) obj).f89176a;
                return new q(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (4294967295L & j13)));
            case 2:
                float f13 = ((q) obj).f74199a;
                return new n4.f((Float.floatToRawIntBits(r9.f74200b) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
            case 3:
                return new p(((n4.e) obj).f89175a);
            case 4:
                return new n4.e(((p) obj).f74189a);
            case 5:
                return new p(((Number) obj).floatValue());
            case 6:
                return Float.valueOf(((p) obj).f74189a);
            case 7:
                long j14 = ((n4.h) obj).f89180a;
                return new q((int) (j14 >> 32), (int) (4294967295L & j14));
            case 8:
                q qVar = (q) obj;
                return new n4.h(d7.b.a(Math.round(qVar.f74199a), Math.round(qVar.f74200b)));
            case 9:
                long j15 = ((n4.j) obj).f89186a;
                return new q((int) (j15 >> 32), (int) (4294967295L & j15));
            case 10:
                q qVar2 = (q) obj;
                int round = Math.round(qVar2.f74199a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(qVar2.f74200b);
                return new n4.j(lb.l0.d(round, round2 >= 0 ? round2 : 0));
            case 11:
                return new p(((Number) obj).intValue());
            case 12:
                return Integer.valueOf((int) ((p) obj).f74189a);
            case 13:
                long j16 = ((a3.c) obj).f482a;
                return new q(a3.c.d(j16), a3.c.e(j16));
            case 14:
                q qVar3 = (q) obj;
                return new a3.c(com.bumptech.glide.c.d(qVar3.f74199a, qVar3.f74200b));
            case 15:
                a3.d dVar = (a3.d) obj;
                return new s(dVar.f484a, dVar.f485b, dVar.f486c, dVar.f487d);
            case 16:
                s sVar = (s) obj;
                return new a3.d(sVar.f74221a, sVar.f74222b, sVar.f74223c, sVar.f74224d);
            case 17:
                long j17 = ((a3.f) obj).f497a;
                return new q(a3.f.d(j17), a3.f.b(j17));
            default:
                q qVar4 = (q) obj;
                return new a3.f(bs1.c.c(qVar4.f74199a, qVar4.f74200b));
        }
    }
}
