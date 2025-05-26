package f2;

import b3.o0;
import lb.l0;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final s f60907a = new s();

    /* renamed from: b, reason: collision with root package name */
    public static final float f60908b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f60909c;

    /* renamed from: d, reason: collision with root package name */
    public static final b3.k f60910d;

    static {
        float f13 = h2.f.f66541o;
        f60908b = f13;
        f60909c = f13;
        f60910d = androidx.compose.ui.graphics.a.h();
    }

    public static k c(i2.o oVar) {
        return e((a) ((i2.s) oVar).m(d.f60828a));
    }

    public static void d(d3.h hVar, long j13, long j14, long j15, float f13, float f14) {
        long c13 = l0.c(f13, f13);
        long c14 = l0.c(f14, f14);
        a3.d c15 = com.bumptech.glide.d.c(com.bumptech.glide.c.d(a3.c.d(j13), 0.0f), bs1.c.c(a3.f.d(j14), a3.f.b(j14)));
        a3.e eVar = new a3.e(c15.f484a, c15.f485b, c15.f486c, c15.f487d, c13, c14, c14, c13);
        b3.k kVar = f60910d;
        o0.b(kVar, eVar);
        d3.h.o0(hVar, kVar, j15);
        kVar.f21334a.rewind();
    }

    public static k e(a aVar) {
        k kVar = aVar.K;
        if (kVar != null) {
            return kVar;
        }
        long a13 = d.a(aVar, h2.f.f66535i);
        h2.b bVar = h2.f.f66528b;
        long a14 = d.a(aVar, bVar);
        h2.b bVar2 = h2.f.f66539m;
        long a15 = d.a(aVar, bVar2);
        long a16 = d.a(aVar, bVar2);
        long a17 = d.a(aVar, bVar);
        long m13 = androidx.compose.ui.graphics.a.m(b3.w.b(d.a(aVar, h2.f.f66531e), h2.f.f66532f), aVar.f60800p);
        h2.b bVar3 = h2.f.f66529c;
        long a18 = d.a(aVar, bVar3);
        float f13 = h2.f.f66530d;
        long b13 = b3.w.b(a18, f13);
        h2.b bVar4 = h2.f.f66533g;
        long a19 = d.a(aVar, bVar4);
        float f14 = h2.f.f66534h;
        k kVar2 = new k(a13, a14, a15, a16, a17, m13, b13, b3.w.b(a19, f14), b3.w.b(d.a(aVar, bVar4), f14), b3.w.b(d.a(aVar, bVar3), f13));
        aVar.K = kVar2;
        return kVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(o1.l r18, u2.q r19, f2.k r20, boolean r21, long r22, i2.o r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.s.a(o1.l, u2.q, f2.k, boolean, long, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0216  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(f2.e0 r27, u2.q r28, boolean r29, f2.k r30, kotlin.jvm.functions.Function2 r31, kl2.l r32, float r33, float r34, i2.o r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.s.b(f2.e0, u2.q, boolean, f2.k, kotlin.jvm.functions.Function2, kl2.l, float, float, i2.o, int, int):void");
    }
}
