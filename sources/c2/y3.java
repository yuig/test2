package c2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.functions.Function2;

/* loaded from: classes2.dex */
public abstract class y3 {

    /* renamed from: a, reason: collision with root package name */
    public static final i2.w3 f25423a = new i2.w3(t0.f25233r);

    /* renamed from: b, reason: collision with root package name */
    public static final float f25424b = 16;

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ab, code lost:
    
        if (r0.g(r73) == false) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01c5, code lost:
    
        if (r0.g(r75) == false) goto L158;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0228  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(u2.q r59, c2.a4 r60, kotlin.jvm.functions.Function2 r61, kotlin.jvm.functions.Function2 r62, kl2.l r63, kotlin.jvm.functions.Function2 r64, int r65, boolean r66, kl2.l r67, boolean r68, b3.x0 r69, float r70, long r71, long r73, long r75, long r77, long r79, kl2.l r81, i2.o r82, int r83, int r84, int r85) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.y3.a(u2.q, c2.a4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kl2.l, kotlin.jvm.functions.Function2, int, boolean, kl2.l, boolean, b3.x0, float, long, long, long, long, long, kl2.l, i2.o, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01bf, code lost:
    
        if (r0.g(r58) == false) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0495  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(p1.m1 r43, u2.q r44, c2.a4 r45, kotlin.jvm.functions.Function2 r46, kotlin.jvm.functions.Function2 r47, kl2.l r48, kotlin.jvm.functions.Function2 r49, int r50, boolean r51, kl2.l r52, boolean r53, b3.x0 r54, float r55, long r56, long r58, long r60, long r62, long r64, kl2.l r66, i2.o r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 1204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.y3.b(p1.m1, u2.q, c2.a4, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kl2.l, kotlin.jvm.functions.Function2, int, boolean, kl2.l, boolean, b3.x0, float, long, long, long, long, long, kl2.l, i2.o, int, int, int):void");
    }

    public static final void c(boolean z13, int i13, Function2 function2, kl2.l lVar, Function2 function22, Function2 function23, p1.m1 m1Var, Function2 function24, i2.o oVar, int i14) {
        int i15;
        int i16;
        int i17;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-468424875);
        if ((i14 & 6) == 0) {
            i15 = (sVar.i(z13) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        if ((i14 & 48) == 0) {
            i15 |= sVar.f(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i15 |= sVar.j(function2) ? 256 : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 3072) == 0) {
            i15 |= sVar.j(lVar) ? 2048 : 1024;
        }
        if ((i14 & 24576) == 0) {
            i15 |= sVar.j(function22) ? 16384 : 8192;
        }
        if ((196608 & i14) == 0) {
            i15 |= sVar.j(function23) ? 131072 : 65536;
        }
        if ((1572864 & i14) == 0) {
            i15 |= sVar.h(m1Var) ? 1048576 : 524288;
        }
        if ((i14 & 12582912) == 0) {
            i15 |= sVar.j(function24) ? 8388608 : 4194304;
        }
        if ((i15 & 4793491) == 4793490 && sVar.z()) {
            sVar.Q();
        } else {
            boolean z14 = ((i15 & 7168) == 2048) | ((i15 & 896) == 256) | ((57344 & i15) == 16384) | ((3670016 & i15) == 1048576) | ((458752 & i15) == 131072) | ((i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32) | ((i15 & 14) == 4) | ((29360128 & i15) == 8388608);
            Object J2 = sVar.J();
            if (z14 || J2 == i2.n.f71185a) {
                i16 = 1;
                i17 = 0;
                J2 = new w3(function2, function22, function23, i13, z13, m1Var, function24, lVar);
                sVar.g0(J2);
            } else {
                i16 = 1;
                i17 = 0;
            }
            q3.k1.b(null, (Function2) J2, sVar, i17, i16);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new x3(z13, i13, function2, lVar, function22, function23, m1Var, function24, i14);
        }
    }

    public static final a4 d(i2.o oVar) {
        i2 c13 = g2.c(j2.Closed, oVar);
        am.d dVar = i2.n.f71185a;
        i2.s sVar = (i2.s) oVar;
        Object J2 = sVar.J();
        if (J2 == dVar) {
            J2 = new i4();
            sVar.g0(J2);
        }
        i4 i4Var = (i4) J2;
        i2.s sVar2 = (i2.s) oVar;
        Object J3 = sVar2.J();
        if (J3 == dVar) {
            J3 = new a4(c13, i4Var);
            sVar2.g0(J3);
        }
        return (a4) J3;
    }
}
