package c2;

import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public final class y0 extends kotlin.jvm.internal.s implements Function2 {

    /* renamed from: j, reason: collision with root package name */
    public static final y0 f25389j = new y0(0);

    /* renamed from: k, reason: collision with root package name */
    public static final y0 f25390k = new y0(1);

    /* renamed from: l, reason: collision with root package name */
    public static final y0 f25391l = new y0(2);

    /* renamed from: m, reason: collision with root package name */
    public static final y0 f25392m = new y0(3);

    /* renamed from: n, reason: collision with root package name */
    public static final y0 f25393n = new y0(4);

    /* renamed from: o, reason: collision with root package name */
    public static final y0 f25394o = new y0(5);

    /* renamed from: p, reason: collision with root package name */
    public static final y0 f25395p = new y0(6);

    /* renamed from: q, reason: collision with root package name */
    public static final y0 f25396q = new y0(7);

    /* renamed from: r, reason: collision with root package name */
    public static final y0 f25397r = new y0(8);

    /* renamed from: s, reason: collision with root package name */
    public static final y0 f25398s = new y0(9);

    /* renamed from: t, reason: collision with root package name */
    public static final y0 f25399t = new y0(10);

    /* renamed from: u, reason: collision with root package name */
    public static final y0 f25400u = new y0(11);

    /* renamed from: v, reason: collision with root package name */
    public static final y0 f25401v = new y0(12);

    /* renamed from: w, reason: collision with root package name */
    public static final y0 f25402w = new y0(13);

    /* renamed from: x, reason: collision with root package name */
    public static final y0 f25403x = new y0(14);

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f25404i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(int i13) {
        super(2);
        this.f25404i = i13;
    }

    public final Integer b(q3.r rVar, int i13) {
        switch (this.f25404i) {
            case 7:
                return Integer.valueOf(rVar.d(i13));
            case 8:
                return Integer.valueOf(rVar.P(i13));
            case 9:
                return Integer.valueOf(rVar.D(i13));
            case 10:
                return Integer.valueOf(rVar.N(i13));
            case 11:
                return Integer.valueOf(rVar.d(i13));
            case 12:
                return Integer.valueOf(rVar.P(i13));
            case 13:
                return Integer.valueOf(rVar.D(i13));
            default:
                return Integer.valueOf(rVar.N(i13));
        }
    }

    public final void e(i2.o oVar, int i13) {
        switch (this.f25404i) {
            case 0:
                if ((i13 & 3) == 2) {
                    i2.s sVar = (i2.s) oVar;
                    if (sVar.z()) {
                        sVar.Q();
                        break;
                    }
                }
                break;
            case 1:
                if ((i13 & 3) == 2) {
                    i2.s sVar2 = (i2.s) oVar;
                    if (sVar2.z()) {
                        sVar2.Q();
                        break;
                    }
                }
                break;
            case 2:
                if ((i13 & 3) == 2) {
                    i2.s sVar3 = (i2.s) oVar;
                    if (sVar3.z()) {
                        sVar3.Q();
                        break;
                    }
                }
                break;
            case 3:
                if ((i13 & 3) == 2) {
                    i2.s sVar4 = (i2.s) oVar;
                    if (sVar4.z()) {
                        sVar4.Q();
                        break;
                    }
                }
                break;
            case 4:
                if ((i13 & 3) == 2) {
                    i2.s sVar5 = (i2.s) oVar;
                    if (sVar5.z()) {
                        sVar5.Q();
                        break;
                    }
                }
                break;
            default:
                if ((i13 & 3) == 2) {
                    i2.s sVar6 = (i2.s) oVar;
                    if (sVar6.z()) {
                        sVar6.Q();
                        break;
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f25404i) {
            case 0:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 1:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 2:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 3:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 4:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 5:
                e((i2.o) obj, ((Number) obj2).intValue());
                break;
            case 6:
                break;
        }
        return b((q3.r) obj, ((Number) obj2).intValue());
    }
}
