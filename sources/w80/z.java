package w80;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import i2.z1;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import s80.i7;
import s80.l7;

/* loaded from: classes5.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final float f128435a = 4;

    /* renamed from: b, reason: collision with root package name */
    public static final float f128436b = 60;

    /* renamed from: c, reason: collision with root package name */
    public static final float f128437c = 44;

    /* renamed from: d, reason: collision with root package name */
    public static final float f128438d = 14;

    /* renamed from: e, reason: collision with root package name */
    public static final e f128439e = f(rm1.q.DRAW, i7.collage_composer_action_draw, Integer.valueOf(l7.composer_content_description_drawing_tool));

    /* renamed from: f, reason: collision with root package name */
    public static final e f128440f = f(rm1.q.TEXT, i7.collage_composer_action_text, Integer.valueOf(l7.composer_content_description_text_tool));

    /* renamed from: g, reason: collision with root package name */
    public static final e f128441g = new e(rm1.q.ADD, d.Primary, i7.collage_composer_action_add, Integer.valueOf(l7.composer_content_description_cutout_browser));

    /* renamed from: h, reason: collision with root package name */
    public static final e f128442h = f(rm1.q.CAMERA_ROLL, i7.collage_composer_action_gallery, Integer.valueOf(l7.composer_content_description_photo_picker));

    /* renamed from: i, reason: collision with root package name */
    public static final e f128443i = f(rm1.q.CAMERA, i7.collage_composer_action_camera, Integer.valueOf(l7.composer_content_description_camera_tool));

    public static final void a(f fVar, boolean z13, u2.q qVar, c cVar, Function1 function1, Function2 function2, i2.o oVar, int i13, int i14) {
        c cVar2;
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1910555168);
        int i16 = i14 & 4;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        if ((i14 & 8) != 0) {
            i15 = i13 & (-7169);
            cVar2 = new c();
        } else {
            cVar2 = cVar;
            i15 = i13;
        }
        Function1 function12 = (i14 & 16) != 0 ? i.f128304i : function1;
        Function2 function22 = (i14 & 32) != 0 ? j.f128309i : function2;
        u2.q c13 = androidx.compose.foundation.layout.e.c(qVar2, cVar2.f128266d);
        p1.g gVar = p1.l.f98543a;
        p1.e1 a13 = p1.c1.a(p1.l.h(com.bumptech.glide.d.A(eo1.c.space_300, sVar), u2.b.f120026n), u2.b.f120023k, sVar, 48);
        int i17 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, c13);
        s3.k.Qo.getClass();
        Function0 function0 = s3.j.f110798b;
        if (!(sVar.f71265a instanceof i2.f)) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(function0);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        Iterator it = fVar.f128282a.iterator();
        while (true) {
            boolean z14 = true;
            if (!it.hasNext()) {
                break;
            }
            e eVar = (e) it.next();
            sVar.W(1968122464);
            int i18 = 0;
            boolean h10 = ((((458752 & i13) ^ 196608) > 131072 && sVar.h(function22)) || (i13 & 196608) == 131072) | sVar.h(eVar);
            Object J2 = sVar.J();
            Object obj = i2.n.f71185a;
            if (h10 || J2 == obj) {
                J2 = new k(function22, eVar, i18);
                sVar.g0(J2);
            }
            sVar.r(false);
            u2.q j13 = androidx.compose.ui.platform.a.j(androidx.compose.ui.layout.b.g(nVar, (Function1) J2), eVar.f128274a.name());
            sVar.W(1968130133);
            if ((((57344 & i13) ^ 24576) <= 16384 || !sVar.h(function12)) && (i13 & 24576) != 16384) {
                z14 = false;
            }
            boolean h13 = z14 | sVar.h(eVar);
            Object J3 = sVar.J();
            if (h13 || J3 == obj) {
                J3 = new l(function12, eVar, i18);
                sVar.g0(J3);
            }
            sVar.r(false);
            b(eVar, z13, j13, cVar2.f128265c, false, (Function0) J3, sVar, i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 16);
        }
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.b(fVar, z13, qVar2, cVar2, function12, function22, i13, i14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(w80.e r19, boolean r20, u2.q r21, w80.a r22, boolean r23, kotlin.jvm.functions.Function0 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.z.b(w80.e, boolean, u2.q, w80.a, boolean, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(w80.e r23, u2.q r24, boolean r25, kotlin.jvm.functions.Function0 r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.z.c(w80.e, u2.q, boolean, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final void d(f fVar, u2.q qVar, c cVar, Function1 function1, Function2 function2, i2.o oVar, int i13, int i14) {
        boolean z13;
        int i15 = i13;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-730113120);
        int i16 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i16 != 0 ? nVar : qVar;
        c cVar2 = (i14 & 4) != 0 ? new c() : cVar;
        Function1 function12 = (i14 & 8) != 0 ? p.f128362i : function1;
        Function2 function22 = (i14 & 16) != 0 ? q.f128366i : function2;
        u2.q c13 = androidx.compose.foundation.layout.e.c(qVar2, cVar2.f128266d);
        p1.g gVar = p1.l.f98543a;
        p1.e1 a13 = p1.c1.a(p1.l.h(com.bumptech.glide.d.A(eo1.c.space_300, sVar), u2.b.f120026n), u2.b.f120023k, sVar, 48);
        int i17 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, c13);
        s3.k.Qo.getClass();
        Function0 function0 = s3.j.f110798b;
        boolean z14 = sVar.f71265a instanceof i2.f;
        if (!z14) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(function0);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        float A = com.bumptech.glide.d.A(eo1.c.space_100, sVar);
        Iterator it = fVar.f128282a.iterator();
        while (true) {
            int i18 = 1;
            if (!it.hasNext()) {
                sVar.r(true);
                f2 t13 = sVar.t();
                if (t13 != null) {
                    t13.f71113d = new i1.s0(fVar, qVar2, cVar2, function12, function22, i13, i14, 5);
                    return;
                }
                return;
            }
            e eVar = (e) it.next();
            sVar.W(1453117756);
            boolean h10 = ((((57344 & i15) ^ 24576) > 16384 && sVar.h(function22)) || (i15 & 24576) == 16384) | sVar.h(eVar);
            Object J2 = sVar.J();
            Object obj = i2.n.f71185a;
            if (h10 || J2 == obj) {
                J2 = new k(function22, eVar, i18);
                sVar.g0(J2);
            }
            sVar.r(false);
            u2.q j13 = androidx.compose.ui.platform.a.j(androidx.compose.ui.layout.b.g(nVar, (Function1) J2), eVar.f128274a.name());
            sVar.W(1453121233);
            boolean h13 = ((((i15 & 7168) ^ 3072) > 2048 && sVar.h(function12)) || (i15 & 3072) == 2048) | sVar.h(eVar);
            Object J3 = sVar.J();
            if (h13 || J3 == obj) {
                J3 = new l(function12, eVar, i18);
                sVar.g0(J3);
            }
            Function0 function02 = (Function0) J3;
            sVar.r(false);
            if (eVar.f128276c == d.Primary) {
                sVar.W(2097187410);
                p1.e1 a14 = p1.c1.a(p1.l.f98543a, u2.b.f120022j, sVar, 0);
                int i19 = sVar.P;
                z1 o14 = sVar.o();
                u2.q X2 = ao2.m0.X(sVar, nVar);
                s3.k.Qo.getClass();
                Function0 function03 = s3.j.f110798b;
                if (!z14) {
                    com.bumptech.glide.c.j0();
                    throw null;
                }
                sVar.a0();
                z13 = z14;
                if (sVar.O) {
                    sVar.n(function03);
                } else {
                    sVar.j0();
                }
                tb.f.f0(sVar, a14, s3.j.f110801e);
                tb.f.f0(sVar, o14, s3.j.f110800d);
                s3.h hVar2 = s3.j.f110802f;
                if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
                    ep.b.y(i19, sVar, i19, hVar2);
                }
                tb.f.f0(sVar, X2, s3.j.f110799c);
                androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.m(nVar, A), sVar);
                c(eVar, j13, false, function02, sVar, 0, 4);
                androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.m(nVar, A), sVar);
                sVar.r(true);
                sVar.r(false);
            } else {
                z13 = z14;
                sVar.W(2098271201);
                c(eVar, j13, false, function02, sVar, 0, 4);
                sVar.r(false);
            }
            i15 = i13;
            z14 = z13;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0317  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(w80.b r33, boolean r34, u2.q r35, w80.c r36, kotlin.jvm.functions.Function0 r37, kotlin.jvm.functions.Function0 r38, kotlin.jvm.functions.Function0 r39, kotlin.jvm.functions.Function0 r40, kotlin.jvm.functions.Function0 r41, kotlin.jvm.functions.Function1 r42, boolean r43, i2.o r44, int r45, int r46, int r47) {
        /*
            Method dump skipped, instructions count: 874
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.z.e(w80.b, boolean, u2.q, w80.c, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, boolean, i2.o, int, int, int):void");
    }

    public static e f(rm1.q qVar, int i13, Integer num) {
        return new e(qVar, d.Secondary, i13, num);
    }
}
