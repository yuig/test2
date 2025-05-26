package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class g2 {

    /* renamed from: a, reason: collision with root package name */
    public static final float f24759a;

    /* renamed from: b, reason: collision with root package name */
    public static final float f24760b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f24761c = 400;

    /* renamed from: d, reason: collision with root package name */
    public static final j1.o2 f24762d = new j1.o2(RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER, (j1.c0) null, 6);

    static {
        float f13 = 56;
        f24759a = f13;
        f24760b = f13;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kl2.l r36, u2.q r37, c2.i2 r38, boolean r39, b3.x0 r40, float r41, long r42, long r44, long r46, kotlin.jvm.functions.Function2 r48, i2.o r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 586
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.g2.a(kl2.l, u2.q, c2.i2, boolean, b3.x0, float, long, long, long, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final void b(boolean z13, Function0 function0, Function0 function02, long j13, i2.o oVar, int i13) {
        int i14;
        boolean z14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1983403750);
        if ((i13 & 6) == 0) {
            i14 = (sVar.i(z13) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function0) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(function02) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i13 & 3072) == 0) {
            i14 |= sVar.g(j13) ? 2048 : 1024;
        }
        if ((i14 & 1171) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            String s13 = j1.s(1, sVar);
            am.d dVar = i2.n.f71185a;
            u2.q qVar = u2.n.f120041b;
            int i15 = 0;
            if (z13) {
                sVar.W(487729414);
                int i16 = i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER;
                boolean z15 = i16 == 32;
                Object J2 = sVar.J();
                if (z15 || J2 == dVar) {
                    J2 = new c2(function0, null);
                    sVar.g0(J2);
                }
                u2.q a13 = n3.f0.a(qVar, function0, (Function2) J2);
                boolean h10 = (i16 == 32) | sVar.h(s13);
                Object J3 = sVar.J();
                if (h10 || J3 == dVar) {
                    J3 = new e2(i15, s13, function0);
                    sVar.g0(J3);
                }
                z14 = true;
                qVar = z3.l.a(a13, true, (Function1) J3);
                sVar.r(false);
            } else {
                z14 = true;
                sVar.W(487978282);
                sVar.r(false);
            }
            u2.q j14 = androidx.compose.foundation.layout.e.f17184c.j(qVar);
            boolean z16 = (i14 & 7168) == 2048 ? z14 : false;
            if ((i14 & 896) != 256) {
                z14 = false;
            }
            boolean z17 = z16 | z14;
            Object J4 = sVar.J();
            if (z17 || J4 == dVar) {
                J4 = new k1.p(j13, function02, 2);
                sVar.g0(J4);
            }
            androidx.compose.foundation.a.a(j14, (Function1) J4, sVar, 0);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new a2(z13, function0, function02, j13, i13);
        }
    }

    public static final i2 c(j2 j2Var, i2.o oVar) {
        f2 f2Var = f2.f24723i;
        Object[] objArr = new Object[0];
        y0 y0Var = y0.f25395p;
        h2 h2Var = new h2(f2Var, 0);
        r2.s sVar = r2.t.f106065a;
        r2.s sVar2 = new r2.s(y0Var, h2Var);
        boolean h10 = ((i2.s) oVar).h(f2Var);
        i2.s sVar3 = (i2.s) oVar;
        Object J2 = sVar3.J();
        if (h10 || J2 == i2.n.f71185a) {
            J2 = new v(2, j2Var, f2Var);
            sVar3.g0(J2);
        }
        return (i2) so.a.i(objArr, sVar2, (Function0) J2, sVar3, 0, 4);
    }
}
