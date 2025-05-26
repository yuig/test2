package w1;

import a.cb;
import android.view.KeyEvent;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f1 f127264a = new f1();

    /* renamed from: b, reason: collision with root package name */
    public static final n3.a f127265b = new n3.a(1008);

    /* renamed from: c, reason: collision with root package name */
    public static final c2.n2 f127266c = new c2.n2(0, 0);

    public static final u2.q A(l1 l1Var, b2.t0 t0Var, h4.f0 f0Var, e0 e0Var, boolean z13, boolean z14, h4.y yVar, z2 z2Var, int i13) {
        return ao2.m0.p(u2.n.f120041b, t3.p.f116119m, new f2(l1Var, t0Var, f0Var, z13, z14, yVar, z2Var, e0Var, i13));
    }

    public static final u2.q B(u2.q qVar, p2 p2Var, o1.l lVar, boolean z13) {
        return ao2.m0.p(qVar, t3.p.f116119m, new n2(p2Var, z13, lVar, 0));
    }

    public static final u2.q C(u2.q qVar, b4.g gVar, b4.q0 q0Var, Function1 function1, int i13, boolean z13, int i14, int i15, g4.d dVar, List list, Function1 function12, b3.x xVar, Function1 function13) {
        return qVar.j(u2.n.f120041b).j(new TextAnnotatedStringElement(gVar, q0Var, dVar, function1, i13, z13, i14, i15, list, function12, xVar, function13));
    }

    public static final void D(int i13, int i14) {
        if (i13 <= 0 || i14 <= 0) {
            throw new IllegalArgumentException(cb.j("both minLines ", i13, " and maxLines ", i14, " must be greater than zero").toString());
        }
        if (i13 > i14) {
            throw new IllegalArgumentException(a.a.f("minLines ", i13, " must be less than or equal to maxLines ", i14).toString());
        }
    }

    public static final void E(int i13, int i14, int i15) {
        if (i13 < 0 || i13 > i14) {
            throw new IllegalStateException(cb.l(a.a.t("OffsetMapping.originalToTransformed returned invalid mapping: ", i15, " -> ", i13, " is not in range of transformed text [0, "), i14, ']').toString());
        }
    }

    public static final void F(int i13, int i14, int i15) {
        if (i13 < 0 || i13 > i14) {
            throw new IllegalStateException(cb.l(a.a.t("OffsetMapping.transformedToOriginal returned invalid mapping: ", i15, " -> ", i13, " is not in range of original text [0, "), i14, ']').toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ec A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(b4.g r42, u2.q r43, b4.q0 r44, kotlin.jvm.functions.Function1 r45, int r46, boolean r47, int r48, int r49, java.util.Map r50, b3.x r51, i2.o r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 875
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.a(b4.g, u2.q, b4.q0, kotlin.jvm.functions.Function1, int, boolean, int, int, java.util.Map, b3.x, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.String r29, u2.q r30, b4.q0 r31, kotlin.jvm.functions.Function1 r32, int r33, boolean r34, int r35, int r36, b3.x r37, i2.o r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.b(java.lang.String, u2.q, b4.q0, kotlin.jvm.functions.Function1, int, boolean, int, int, b3.x, i2.o, int, int):void");
    }

    public static final void c(b2.t0 t0Var, Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1985516685);
        int i15 = 4;
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(t0Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            Object J2 = sVar.J();
            am.d dVar = i2.n.f71185a;
            if (J2 == dVar) {
                J2 = new l1.o();
                sVar.g0(J2);
            }
            l1.o oVar2 = (l1.o) J2;
            Object J3 = sVar.J();
            if (J3 == dVar) {
                J3 = new j1.q0(oVar2, 10);
                sVar.g0(J3);
            }
            kh2.a1.b(oVar2, (Function0) J3, new j1.x0(17, t0Var, oVar2), null, t0Var.j(), function2, sVar, ((i14 << 12) & 458752) | 54, 8);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(t0Var, function2, i13, i15);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0548 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0572 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x05e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x05fd  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x061f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0667  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0676 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0699  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06bf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x06ee  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0727 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x074e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0775 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0796  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x07b2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0804  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x081f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07d5  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0798  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x06e8  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06b2  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x035c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0379 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r0v88, types: [u2.q] */
    /* JADX WARN: Type inference failed for: r11v1, types: [i2.o, i2.s] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(h4.f0 r52, kotlin.jvm.functions.Function1 r53, u2.q r54, b4.q0 r55, h4.p0 r56, kotlin.jvm.functions.Function1 r57, o1.l r58, b3.s r59, boolean r60, int r61, int r62, h4.o r63, w1.j1 r64, boolean r65, boolean r66, kl2.l r67, i2.o r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 2373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.d(h4.f0, kotlin.jvm.functions.Function1, u2.q, b4.q0, h4.p0, kotlin.jvm.functions.Function1, o1.l, b3.s, boolean, int, int, h4.o, w1.j1, boolean, boolean, kl2.l, i2.o, int, int, int):void");
    }

    public static final void e(u2.q qVar, b2.t0 t0Var, Function2 function2, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-20551815);
        if ((i13 & 6) == 0) {
            i14 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.j(t0Var) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= sVar.j(function2) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & RecyclerViewTypes.VIEW_TYPE_SEARCH_PRODUCT_COLLAGE_STORY) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            q3.p0 e13 = p1.q.e(u2.b.f120013a, true);
            int i15 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            if (!(sVar.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, e13, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i15))) {
                ep.b.y(i15, sVar, i15, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            int i16 = i14 >> 3;
            c(t0Var, function2, sVar, (i16 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | (i16 & 14));
            sVar.r(true);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new androidx.compose.foundation.lazy.layout.u0(qVar, t0Var, function2, i13, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x038a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0260  */
    /* JADX WARN: Type inference failed for: r0v1, types: [i2.o, i2.s] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v33, types: [kotlin.collections.q0] */
    /* JADX WARN: Type inference failed for: r11v34, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v36, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r12v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.Object, w1.v2] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(u2.q r34, b4.g r35, kotlin.jvm.functions.Function1 r36, boolean r37, java.util.Map r38, b4.q0 r39, int r40, boolean r41, int r42, int r43, g4.d r44, b3.x r45, kotlin.jvm.functions.Function1 r46, i2.o r47, int r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.f(u2.q, b4.g, kotlin.jvm.functions.Function1, boolean, java.util.Map, b4.q0, int, boolean, int, int, g4.d, b3.x, kotlin.jvm.functions.Function1, i2.o, int, int, int):void");
    }

    public static final void g(b2.t0 t0Var, i2.o oVar, int i13) {
        int i14;
        x1 x1Var;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1436003720);
        int i15 = 4;
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(t0Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 3) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            l1 l1Var = t0Var.f21219d;
            int i16 = 0;
            if (l1Var != null) {
                int i17 = 1;
                if (((Boolean) l1Var.f127369o.getValue()).booleanValue()) {
                    l1 l1Var2 = t0Var.f21219d;
                    b4.g gVar = (l1Var2 == null || (x1Var = l1Var2.f127355a) == null) ? null : x1Var.f127567a;
                    if (gVar != null && gVar.f21571a.length() > 0) {
                        sVar.W(-285446808);
                        boolean h10 = sVar.h(t0Var);
                        Object J2 = sVar.J();
                        Object obj = i2.n.f71185a;
                        if (h10 || J2 == obj) {
                            J2 = new b2.q0(t0Var, i16);
                            sVar.g0(J2);
                        }
                        y1 y1Var = (y1) J2;
                        n4.b bVar = (n4.b) sVar.m(t3.f2.f115983f);
                        h4.y yVar = t0Var.f21217b;
                        long j13 = t0Var.l().f67560b;
                        int i18 = b4.p0.f21640c;
                        int b13 = yVar.b((int) (j13 >> 32));
                        l1 l1Var3 = t0Var.f21219d;
                        r2 d2 = l1Var3 != null ? l1Var3.d() : null;
                        Intrinsics.f(d2);
                        b4.m0 m0Var = d2.f127471a;
                        a3.d c13 = m0Var.c(ql2.s.g(b13, 0, m0Var.f21615a.f21603a.f21571a.length()));
                        long d13 = com.bumptech.glide.c.d((bVar.l0(a2.f127150a) / 2) + c13.f484a, c13.f487d);
                        boolean g13 = sVar.g(d13);
                        Object J3 = sVar.J();
                        if (g13 || J3 == obj) {
                            J3 = new o0(d13);
                            sVar.g0(J3);
                        }
                        b2.l lVar = (b2.l) J3;
                        u2.n nVar = u2.n.f120041b;
                        boolean j14 = sVar.j(y1Var) | sVar.j(t0Var);
                        Object J4 = sVar.J();
                        if (j14 || J4 == obj) {
                            J4 = new s0(y1Var, t0Var, null);
                            sVar.g0(J4);
                        }
                        u2.q a13 = n3.f0.a(nVar, y1Var, (Function2) J4);
                        boolean g14 = sVar.g(d13);
                        Object J5 = sVar.J();
                        if (g14 || J5 == obj) {
                            J5 = new d(d13, i17);
                            sVar.g0(J5);
                        }
                        f.a(lVar, z3.l.a(a13, false, (Function1) J5), 0L, sVar, 0, 4);
                        sVar.r(false);
                    }
                }
            }
            sVar.W(-284257090);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new j1.t0(t0Var, i13, i15);
        }
    }

    public static final void h(b2.t0 t0Var, boolean z13, i2.o oVar, int i13) {
        int i14;
        r2 d2;
        b4.m0 m0Var;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(626339208);
        if ((i13 & 6) == 0) {
            i14 = (sVar.j(t0Var) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= sVar.i(z13) ? 32 : 16;
        }
        int i15 = 0;
        if ((i14 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else if (z13) {
            sVar.W(-1286242594);
            l1 l1Var = t0Var.f21219d;
            b4.m0 m0Var2 = null;
            if (l1Var != null && (d2 = l1Var.d()) != null && (m0Var = d2.f127471a) != null) {
                if (!(t0Var.f21219d != null ? r6.f127370p : true)) {
                    m0Var2 = m0Var;
                }
            }
            if (m0Var2 == null) {
                sVar.W(-1285984396);
            } else {
                sVar.W(-1285984395);
                if (b4.p0.b(t0Var.l().f67560b)) {
                    sVar.W(-1679637798);
                    sVar.r(false);
                } else {
                    sVar.W(-1680616096);
                    int b13 = t0Var.f21217b.b((int) (t0Var.l().f67560b >> 32));
                    int b14 = t0Var.f21217b.b((int) (t0Var.l().f67560b & 4294967295L));
                    m4.h a13 = m0Var2.a(b13);
                    m4.h a14 = m0Var2.a(Math.max(b14 - 1, 0));
                    l1 l1Var2 = t0Var.f21219d;
                    if (l1Var2 == null || !((Boolean) l1Var2.f127367m.getValue()).booleanValue()) {
                        sVar.W(-1679975078);
                        sVar.r(false);
                    } else {
                        sVar.W(-1680216289);
                        jk.r.a(true, a13, t0Var, sVar, ((i14 << 6) & 896) | 6);
                        sVar.r(false);
                    }
                    l1 l1Var3 = t0Var.f21219d;
                    if (l1Var3 == null || !((Boolean) l1Var3.f127368n.getValue()).booleanValue()) {
                        sVar.W(-1679655654);
                        sVar.r(false);
                    } else {
                        sVar.W(-1679895904);
                        jk.r.a(false, a14, t0Var, sVar, ((i14 << 6) & 896) | 6);
                        sVar.r(false);
                    }
                    sVar.r(false);
                }
                l1 l1Var4 = t0Var.f21219d;
                if (l1Var4 != null) {
                    boolean z14 = !Intrinsics.d(t0Var.f21234s.f67559a.f21571a, t0Var.l().f67559a.f21571a);
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = l1Var4.f127366l;
                    if (z14) {
                        parcelableSnapshotMutableState.setValue(Boolean.FALSE);
                    }
                    if (l1Var4.b()) {
                        if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                            t0Var.t();
                        } else {
                            t0Var.m();
                        }
                    }
                    Unit unit = Unit.f80348a;
                }
            }
            sVar.r(false);
            sVar.r(false);
        } else {
            sVar.W(651305535);
            sVar.r(false);
            t0Var.m();
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new n0(t0Var, z13, i13, i15);
        }
    }

    public static final void i(l1 l1Var) {
        h4.m0 m0Var = l1Var.f127359e;
        if (m0Var != null) {
            l1Var.f127374t.invoke(h4.f0.a(l1Var.f127358d.f67570a, null, 0L, 3));
            h4.g0 g0Var = m0Var.f67592a;
            if (d7.g.z(g0Var.f67563b, m0Var)) {
                g0Var.f67562a.b();
            }
        }
        l1Var.f127359e = null;
    }

    public static final a3.d j(q3.r0 r0Var, int i13, h4.n0 n0Var, b4.m0 m0Var, boolean z13, int i14) {
        a3.d c13 = m0Var != null ? m0Var.c(n0Var.f67596b.b(i13)) : a3.d.f483e;
        int R = r0Var.R(a2.f127150a);
        float f13 = c13.f484a;
        return new a3.d(z13 ? (i14 - f13) - R : f13, c13.f485b, z13 ? i14 - f13 : R + f13, c13.f487d);
    }

    public static final boolean k(int i13, KeyEvent keyEvent) {
        return ((int) (l3.c.G(keyEvent) >> 32)) == i13;
    }

    public static final ArrayList l(List list, Function0 function0) {
        x2 x2Var;
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            q3.o0 o0Var = (q3.o0) list.get(i13);
            Object a13 = o0Var.a();
            Intrinsics.g(a13, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
            l0.h hVar = ((y2) a13).f127586b;
            b4.m0 m0Var = (b4.m0) ((v2) hVar.f81220c).f127550b.getValue();
            if (m0Var == null) {
                x2Var = new x2(0, 0, u2.f127546i);
            } else {
                n4.i j13 = kh2.r.j1(m0Var.k(hVar.f81218a, hVar.f81219b).d());
                x2Var = new x2(j13.f89184c - j13.f89182a, j13.f89185d - j13.f89183b, new j1.q0(j13, 13));
            }
            int i14 = x2Var.f127578a;
            int min = Math.min(i14, 262142);
            int i15 = Integer.MAX_VALUE;
            int min2 = i14 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i14, 262142);
            int g13 = bs1.c.g(min2 == Integer.MAX_VALUE ? min : min2);
            int i16 = x2Var.f127579b;
            if (i16 != Integer.MAX_VALUE) {
                i15 = Math.min(g13, i16);
            }
            arrayList.add(new Pair(o0Var.Q(bs1.c.a(min, min2, Math.min(g13, i16), i15)), x2Var.f127580c));
        }
        return arrayList;
    }

    public static final void m(h4.g0 g0Var, l1 l1Var, h4.f0 f0Var, h4.o oVar, h4.y yVar) {
        h4.k kVar = l1Var.f127358d;
        kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
        e.f fVar = new e.f(kVar, l1Var.f127374t, j0Var, 6);
        h4.a0 a0Var = g0Var.f67562a;
        a0Var.e(f0Var, oVar, fVar, l1Var.f127375u);
        h4.m0 m0Var = new h4.m0(g0Var, a0Var);
        g0Var.f67563b.set(m0Var);
        j0Var.f80434a = m0Var;
        l1Var.f127359e = m0Var;
        v(l1Var, f0Var, yVar);
    }

    public static h4.n0 n(long j13, h4.n0 n0Var) {
        int i13 = b4.p0.f21640c;
        h4.y yVar = n0Var.f67596b;
        int b13 = yVar.b((int) (j13 >> 32));
        int b14 = yVar.b((int) (j13 & 4294967295L));
        int min = Math.min(b13, b14);
        int max = Math.max(b13, b14);
        b4.d dVar = new b4.d(n0Var.f67595a);
        dVar.a(new b4.g0(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, m4.k.f85799c, null, 61439), min, max);
        return new h4.n0(dVar.e(), yVar);
    }

    public static final int o(float f13) {
        return Math.round((float) Math.ceil(f13));
    }

    public static final h4.n0 p(h4.p0 p0Var, b4.g gVar) {
        ((a.e) p0Var).getClass();
        int length = gVar.f21571a.length();
        int length2 = gVar.f21571a.length();
        int min = Math.min(length, 100);
        for (int i13 = 0; i13 < min; i13++) {
            E(i13, length2, i13);
        }
        E(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i14 = 0; i14 < min2; i14++) {
            F(i14, length, i14);
        }
        F(length2, length, length2);
        return new h4.n0(gVar, new c2.n2(gVar.f21571a.length(), gVar.f21571a.length()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int q(int r4, java.lang.String r5) {
        /*
            boolean r0 = h6.m.c()
            r1 = 0
            if (r0 == 0) goto L13
            h6.m r0 = h6.m.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L25
            h6.g r0 = r0.f67733e
            int r0 = r0.E(r4, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            if (r1 == 0) goto L2c
            int r4 = r1.intValue()
            return r4
        L2c:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.following(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.q(int, java.lang.String):int");
    }

    public static final int r(int i13, String str) {
        int length = str.length();
        while (i13 < length) {
            if (str.charAt(i13) == '\n') {
                return i13;
            }
            i13++;
        }
        return str.length();
    }

    public static final int s(int i13, String str) {
        while (i13 > 0) {
            if (str.charAt(i13 - 1) == '\n') {
                return i13;
            }
            i13--;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0010, code lost:
    
        if (r0.b() == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int t(int r4, java.lang.String r5) {
        /*
            boolean r0 = h6.m.c()
            r1 = 0
            if (r0 == 0) goto L13
            h6.m r0 = h6.m.a()
            int r2 = r0.b()
            r3 = 1
            if (r2 != r3) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            if (r0 == 0) goto L2c
            int r2 = r4 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            h6.g r0 = r0.f67733e
            int r0 = r0.F(r2, r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = -1
            if (r0 != r3) goto L2b
            goto L2c
        L2b:
            r1 = r2
        L2c:
            if (r1 == 0) goto L33
            int r4 = r1.intValue()
            return r4
        L33:
            java.text.BreakIterator r0 = java.text.BreakIterator.getCharacterInstance()
            r0.setText(r5)
            int r4 = r0.preceding(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: w1.g1.t(int, java.lang.String):int");
    }

    public static final u2.q u(u2.q qVar, l1 l1Var, z2.j jVar) {
        return androidx.compose.ui.input.key.a.b(qVar, new j1.x0(13, jVar, l1Var));
    }

    public static final void v(l1 l1Var, h4.f0 f0Var, h4.y yVar) {
        s2.i P = bk.f.P();
        Function1 f13 = P != null ? P.f() : null;
        s2.i X = bk.f.X(P);
        try {
            r2 d2 = l1Var.d();
            if (d2 == null) {
                return;
            }
            h4.m0 m0Var = l1Var.f127359e;
            if (m0Var == null) {
                return;
            }
            q3.x c13 = l1Var.c();
            if (c13 == null) {
                return;
            }
            w(f0Var, l1Var.f127355a, d2.f127471a, c13, m0Var, l1Var.b(), yVar);
            Unit unit = Unit.f80348a;
        } finally {
            bk.f.c0(P, X, f13);
        }
    }

    public static void w(h4.f0 f0Var, x1 x1Var, b4.m0 m0Var, q3.x xVar, h4.m0 m0Var2, boolean z13, h4.y yVar) {
        long a13;
        a3.d dVar;
        if (z13) {
            int b13 = yVar.b(b4.p0.d(f0Var.f67560b));
            if (b13 < m0Var.f21615a.f21603a.f21571a.length()) {
                dVar = m0Var.b(b13);
            } else if (b13 != 0) {
                dVar = m0Var.b(b13 - 1);
            } else {
                a13 = b2.a(x1Var.f127568b, x1Var.f127573g, x1Var.f127574h, b2.f127170a, 1);
                dVar = new a3.d(0.0f, 0.0f, 1.0f, (int) (a13 & 4294967295L));
            }
            long c03 = xVar.c0(com.bumptech.glide.c.d(dVar.f484a, dVar.f485b));
            a3.d c13 = com.bumptech.glide.d.c(com.bumptech.glide.c.d(a3.c.d(c03), a3.c.e(c03)), bs1.c.c(dVar.d(), dVar.c()));
            if (Intrinsics.d((h4.m0) m0Var2.f67592a.f67563b.get(), m0Var2)) {
                m0Var2.f67593b.f(c13);
            }
        }
    }

    public static final u2.q x(u2.q qVar, l1 l1Var, b2.t0 t0Var) {
        return androidx.compose.ui.input.key.a.b(qVar, new j1.x0(11, l1Var, t0Var));
    }

    public static final u2.q y(u2.q qVar, o1.l lVar, boolean z13, Function1 function1) {
        if (!z13) {
            return qVar;
        }
        return ao2.m0.p(qVar, t3.p.f116119m, new k1.n1(2, function1, lVar));
    }

    public static final u2.q z(boolean z13, z2.s sVar, o1.l lVar, Function1 function1) {
        return androidx.compose.foundation.c.a(lVar, androidx.compose.ui.focus.a.w(androidx.compose.ui.focus.a.k(u2.n.f120041b, sVar), function1), z13);
    }
}
