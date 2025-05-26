package jk;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import androidx.appcompat.widget.x;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import androidx.recyclerview.widget.n3;
import ao2.g0;
import ao2.m0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.ho;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.lo;
import com.pinterest.api.model.no;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.so;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.ws;
import com.pinterest.api.model.zs;
import com.pinterest.feature.bubbles.view.BubbleContentSeparatorCellView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.xmediahandler.MetadataOnlyResult;
import com.pinterest.xmediahandler.RustBridge$Metadata;
import h32.d4;
import h32.f1;
import h32.i0;
import h32.w0;
import i2.f2;
import i2.q1;
import i2.z1;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import kh2.c3;
import kh2.j1;
import kh2.p2;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lh0.e0;
import lh0.p0;
import lq0.r1;
import m60.d0;
import ni1.t2;
import nx.f0;
import ra0.t0;
import ra0.v0;
import so.e8;
import so.g7;
import so.g8;
import so.q6;
import so.r8;
import u50.k0;
import uc0.o1;
import uc0.p1;
import x02.i2;

/* loaded from: classes3.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static bk.m f76358a;

    public static void A(jm0.j jVar, zf0.f fVar) {
        jVar.Q0 = fVar;
    }

    public static void B(r1 r1Var, rg0.s sVar) {
        r1Var.V0 = sVar;
    }

    public static void C(ui0.e eVar, rg0.s sVar) {
        eVar.C0 = sVar;
    }

    public static void D(jm0.j jVar) {
        jVar.getClass();
    }

    public static void E(r1 r1Var, p0 p0Var) {
        r1Var.U0 = p0Var;
    }

    public static void F(r1 r1Var, g7 g7Var) {
        r1Var.R0 = g7Var;
    }

    public static void G(jm0.j jVar, d0 d0Var) {
        jVar.P0 = d0Var;
    }

    public static void H(k90.c cVar, d0 d0Var) {
        cVar.f78724h1 = d0Var;
    }

    public static void I(tu0.h hVar, e8 e8Var) {
        hVar.f119334r0 = e8Var;
    }

    public static void J(tu0.h hVar, g8 g8Var) {
        hVar.f119336t0 = g8Var;
    }

    public static void K(r1 r1Var, x xVar) {
        r1Var.T0 = xVar;
    }

    public static void L(k90.c cVar, hs.d dVar) {
        cVar.f78731o1 = dVar;
    }

    public static void M(r1 r1Var, yk1.j jVar) {
        r1Var.X0 = jVar;
    }

    public static void N(r1 r1Var, r20.a aVar) {
        r1Var.W0 = aVar;
    }

    public static void O(jm0.j jVar, ni1.d0 d0Var) {
        jVar.O0 = d0Var;
    }

    public static void P(jm0.j jVar, qa2.d dVar) {
        jVar.M0 = dVar;
    }

    public static void Q(jm0.j jVar, t2 t2Var) {
        jVar.N0 = t2Var;
    }

    public static void R(r1 r1Var, i2 i2Var) {
        r1Var.S0 = i2Var;
    }

    public static void S(hz.h hVar, f0 f0Var) {
        hVar.f70615s0 = f0Var;
    }

    public static void T(k90.c cVar, n3 n3Var) {
        cVar.f78726j1 = n3Var;
    }

    public static void U(tu0.h hVar, uk1.e eVar) {
        hVar.f119335s0 = eVar;
    }

    public static void V(ui0.e eVar, uk1.e eVar2) {
        eVar.A0 = eVar2;
    }

    public static void W(jm0.j jVar, n3 n3Var) {
        jVar.L0 = n3Var;
    }

    public static void X(BubbleContentSeparatorCellView bubbleContentSeparatorCellView, ku1.l lVar) {
        bubbleContentSeparatorCellView.f45416e = lVar;
    }

    public static int Y(int[] iArr, int[] iArr2, int i13, int[] iArr3, int i14) {
        int i15;
        int length = iArr.length;
        int i16 = 0;
        while (true) {
            i15 = iArr2[0];
            if (i15 != 0) {
                break;
            }
            int i17 = i13;
            int i18 = 0;
            while (true) {
                i17--;
                if (i17 >= 0) {
                    int i19 = iArr2[i17];
                    iArr2[i17] = i18;
                    i18 = i19;
                }
            }
            i16 += 32;
        }
        int i23 = 0;
        while ((i15 & 1) == 0) {
            i15 >>>= 1;
            i23++;
        }
        if (i23 > 0) {
            int i24 = 0;
            while (true) {
                i13--;
                if (i13 < 0) {
                    break;
                }
                int i25 = iArr2[i13];
                iArr2[i13] = (i24 << (-i23)) | (i25 >>> i23);
                i24 = i25;
            }
            i16 += i23;
        }
        for (int i26 = 0; i26 < i16; i26++) {
            if ((iArr3[0] & 1) != 0) {
                i14 = (i14 < 0 ? j1.K(length, iArr, iArr3) : j1.B1(length, iArr, iArr3)) + i14;
            }
            int i27 = i14;
            int i28 = length;
            while (true) {
                i28--;
                if (i28 >= 0) {
                    int i29 = iArr3[i28];
                    iArr3[i28] = (i27 << 31) | (i29 >>> 1);
                    i27 = i29;
                }
            }
        }
        return i14;
    }

    public static void Z(int[] iArr, int[] iArr2, int[] iArr3) {
        int length = iArr.length;
        if (j1.h1(iArr2, length)) {
            throw new IllegalArgumentException("'x' cannot be 0");
        }
        if (j1.d1(iArr2, length)) {
            System.arraycopy(iArr2, 0, iArr3, 0, length);
            return;
        }
        int[] iArr4 = new int[length];
        System.arraycopy(iArr2, 0, iArr4, 0, length);
        int[] iArr5 = new int[length];
        iArr5[0] = 1;
        int Y = (1 & iArr4[0]) == 0 ? Y(iArr, iArr4, length, iArr5, 0) : 0;
        if (j1.d1(iArr4, length)) {
            if (Y < 0) {
                j1.B(iArr.length, iArr5, iArr, iArr3);
                return;
            } else {
                System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                return;
            }
        }
        int[] iArr6 = new int[length];
        System.arraycopy(iArr, 0, iArr6, 0, length);
        int[] iArr7 = new int[length];
        int i13 = length;
        int i14 = 0;
        while (true) {
            int i15 = i13 - 1;
            if (iArr4[i15] == 0 && iArr6[i15] == 0) {
                i13--;
            } else if (j1.j0(i13, iArr4, iArr6)) {
                j1.B1(i13, iArr6, iArr4);
                Y = Y(iArr, iArr4, i13, iArr5, (j1.B1(length, iArr7, iArr5) - i14) + Y);
                if (j1.d1(iArr4, i13)) {
                    if (Y < 0) {
                        j1.B(iArr.length, iArr5, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr5, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            } else {
                j1.B1(i13, iArr4, iArr6);
                i14 = Y(iArr, iArr6, i13, iArr7, (j1.B1(length, iArr5, iArr7) - Y) + i14);
                if (j1.d1(iArr6, i13)) {
                    if (i14 < 0) {
                        j1.B(iArr.length, iArr7, iArr, iArr3);
                        return;
                    } else {
                        System.arraycopy(iArr7, 0, iArr3, 0, iArr.length);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(u2.q r28, kotlin.jvm.functions.Function0 r29, kotlin.jvm.functions.Function0 r30, i2.o r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.v.a(u2.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, i2.o, int, int):void");
    }

    public static final int a0(ol2.e eVar, IntRange range) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        int i13 = range.f80453a;
        int i14 = range.f80454b;
        if (i14 < Integer.MAX_VALUE) {
            eVar.getClass();
            return ol2.f.f96455b.f(i13, i14 + 1);
        }
        if (i13 <= Integer.MIN_VALUE) {
            eVar.getClass();
            return ol2.f.f96455b.e();
        }
        eVar.getClass();
        return ol2.f.f96455b.f(i13 - 1, i14) + 1;
    }

    public static final void b(p1 p1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-428027720);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(p1Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                l1 v03 = c3.v0(p1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                p1Var = (p1) v03;
            }
            sVar.s();
            q1 z13 = bs1.c.z(p1Var.f121825e, sVar);
            p1Var.i(new uc0.i(new oc0.a(q2.i.c(1836412656, new androidx.compose.foundation.lazy.layout.v(21, z13, p1Var), sVar))));
            gh0.b.d(((o1) z13.getValue()).f121840b, null, sVar, 8, 2);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(p1Var, i13, i14, 16);
        }
    }

    public static final um0.d0 b0() {
        int i13 = l70.d.reorder_pins_error_message;
        String[] formatArgs = new String[0];
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return new um0.d0(new k92.n(new k92.c(new k0(i13, new ArrayList(0)), null, null, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_GRID_CELL), null));
    }

    public static final void c(float f13, u2.q qVar, t0 t0Var, Function2 content, i2.o oVar, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(content, "content");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1953979800);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.e(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 != 0) {
            i15 |= 384;
        } else if ((i13 & 896) == 0) {
            i15 |= sVar.h(t0Var) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i14 & 8) != 0) {
            i15 |= 3072;
        } else if ((i13 & 7168) == 0) {
            i15 |= sVar.j(content) ? 2048 : 1024;
        }
        if ((i15 & 5851) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            if (i17 != 0) {
                t0Var = t0.EndOnTop;
            }
            float f14 = 1 - f13;
            boolean z13 = t0Var == t0.EndOnTop;
            sVar.W(-1725794183);
            boolean e13 = sVar.e(f14) | sVar.i(z13);
            Object J2 = sVar.J();
            if (e13 || J2 == i2.n.f71185a) {
                J2 = new v0(f14, z13);
                sVar.g0(J2);
            }
            q3.p0 p0Var = (q3.p0) J2;
            sVar.r(false);
            int i18 = (i15 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | ((i15 >> 9) & 14);
            int i19 = sVar.P;
            z1 o13 = sVar.o();
            u2.q X = m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            int i23 = ((i18 << 6) & 896) | 6;
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
            tb.f.f0(sVar, p0Var, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i19))) {
                ep.b.y(i19, sVar, i19, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            content.invoke(sVar, Integer.valueOf((i23 >> 6) & 14));
            sVar.r(true);
        }
        u2.q qVar2 = qVar;
        t0 t0Var2 = t0Var;
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.b(f13, qVar2, t0Var2, content, i13, i14);
        }
    }

    public static final kk2.b c0(ko2.e eVar, Function2 function2) {
        if (eVar.get(g0.f20154b) == null) {
            return new kk2.b(new jo2.e(eVar, function2), 0);
        }
        throw new IllegalArgumentException(("Single context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had " + eVar).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(ra0.s0 r13, u2.q r14, kotlin.jvm.functions.Function2 r15, i2.o r16, int r17, int r18) {
        /*
            r4 = r13
            r12 = r15
            r1 = r17
            java.lang.String r0 = "overlap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "content"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            r0 = r16
            i2.s r0 = (i2.s) r0
            r2 = 8728135(0x852e47, float:1.2230722E-38)
            r0.Y(r2)
            r2 = r18 & 1
            if (r2 == 0) goto L1f
            r2 = r1 | 6
            goto L2f
        L1f:
            r2 = r1 & 14
            if (r2 != 0) goto L2e
            boolean r2 = r0.h(r13)
            if (r2 == 0) goto L2b
            r2 = 4
            goto L2c
        L2b:
            r2 = 2
        L2c:
            r2 = r2 | r1
            goto L2f
        L2e:
            r2 = r1
        L2f:
            r3 = r18 & 2
            if (r3 == 0) goto L37
            r2 = r2 | 48
        L35:
            r5 = r14
            goto L48
        L37:
            r5 = r1 & 112(0x70, float:1.57E-43)
            if (r5 != 0) goto L35
            r5 = r14
            boolean r6 = r0.h(r14)
            if (r6 == 0) goto L45
            r6 = 32
            goto L47
        L45:
            r6 = 16
        L47:
            r2 = r2 | r6
        L48:
            r6 = r18 & 4
            if (r6 == 0) goto L4f
            r2 = r2 | 384(0x180, float:5.38E-43)
            goto L5f
        L4f:
            r6 = r1 & 896(0x380, float:1.256E-42)
            if (r6 != 0) goto L5f
            boolean r6 = r0.j(r15)
            if (r6 == 0) goto L5c
            r6 = 256(0x100, float:3.59E-43)
            goto L5e
        L5c:
            r6 = 128(0x80, float:1.8E-43)
        L5e:
            r2 = r2 | r6
        L5f:
            r6 = r2 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r6 != r7) goto L70
            boolean r6 = r0.z()
            if (r6 != 0) goto L6c
            goto L70
        L6c:
            r0.Q()
            goto L8d
        L70:
            if (r3 == 0) goto L75
            u2.n r3 = u2.n.f120041b
            goto L76
        L75:
            r3 = r5
        L76:
            r13.getClass()
            r5 = r2 & 112(0x70, float:1.57E-43)
            int r2 = r2 << 3
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r10 = r5 | r2
            r5 = 1061158912(0x3f400000, float:0.75)
            ra0.t0 r7 = r4.f107004a
            r11 = 0
            r6 = r3
            r8 = r15
            r9 = r0
            c(r5, r6, r7, r8, r9, r10, r11)
            r5 = r3
        L8d:
            i2.f2 r7 = r0.t()
            if (r7 == 0) goto La3
            l1.p r8 = new l1.p
            r3 = 18
            r0 = r8
            r1 = r17
            r2 = r18
            r4 = r13
            r6 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f71113d = r8
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jk.v.d(ra0.s0, u2.q, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static boolean d0(w0 event) {
        d4 d4Var;
        Intrinsics.checkNotNullParameter(event, "event");
        List j13 = kotlin.collections.f0.j(f1.PIN_CLICK, f1.PIN_SCREENSHOT, f1.PIN_SAVE_TO_DEVICE);
        f1 f1Var = event.f67324b;
        if (CollectionsKt.L(j13, f1Var)) {
            return true;
        }
        f1 f1Var2 = f1.TIMED_PAIR_END;
        i0 i0Var = event.f67330h;
        if (f1Var == f1Var2 && i0Var != null) {
            boolean z13 = i0Var.f67081a == d4.PIN;
            boolean z14 = i0Var.f67084d == h32.g0.PIN_CLOSEUP_BODY;
            boolean z15 = f1Var == f1Var2;
            if (z13 && z14 && z15) {
                return true;
            }
        }
        if (i0Var != null && (d4Var = i0Var.f67081a) != null && ((f1Var == f1.TIMED_PAIR_BEGIN || f1Var == f1Var2) && d4Var == d4.OFF_PINTEREST)) {
            return true;
        }
        if (i0Var != null) {
            boolean z16 = i0Var.f67081a == d4.PIN;
            boolean z17 = f1Var == f1.VIEW;
            if (z16 && z17) {
                return true;
            }
        }
        return CollectionsKt.L(kotlin.collections.f0.j(f1.STORY_PIN_CREATE, f1.STORY_PIN_CREATE_FAILURE, f1.STORY_PIN_CREATE_CANCELLED, f1.STORY_PIN_EDIT, f1.STORY_PIN_EDIT_FAILURE, f1.STORY_PIN_EDIT_CANCELLED), f1Var);
    }

    public static void e(x92.b bVar) {
        n60.o.A(bVar, "userdiditdata.images", "1080x", "userdiditdata.pin()", "userdiditdata.id");
        n60.o.w(bVar, "userdiditdata.user()", "userdiditdata.done_at", "userdiditdata.pin()", "userdiditdata.details");
        n60.o.w(bVar, "userdiditdata.recommend_score", "userdiditdata.image_signatures", "userdiditdata.images", "userdiditdata.reaction_counts");
        n60.o.v(bVar, "userdiditdata.comment_count", "userdiditdata.reaction_by_me", "userdiditdata.highlighted_by_pin_owner");
        n00.d.f88768a.b(bVar);
        bVar.e("pin.image_signature");
        bVar.e("pin.aggregated_pin_data()");
        bVar.e("pin.done_by_me");
        n60.o.w(bVar, "aggregatedpindata.id", "aggregatedpindata.aggregated_stats", "pin.rich_summary()", "aggregatedpindata.did_it_data");
        n60.o.v(bVar, "pin.is_whitelisted_for_tried_it", "pin.is_eligible_for_aggregated_comments", "pin.can_delete_did_it_and_comments");
    }

    public static final ex.d e0(int i13) {
        return new ex.d(i13, 17);
    }

    public static void f(x92.b bVar) {
        bVar.e("pin.rich_metadata()");
        n00.d.f88768a.b(bVar);
    }

    public static final int f0(int i13, int i14) {
        return (i13 >>> (32 - i14)) & ((-i14) >> 31);
    }

    public static final String g(Number from, Number until) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void h(int i13, int i14) {
        if (i14 <= i13) {
            throw new IllegalArgumentException(g(Integer.valueOf(i13), Integer.valueOf(i14)).toString());
        }
    }

    public static final zs i(zs zsVar, boolean z13) {
        Intrinsics.checkNotNullParameter(zsVar, "<this>");
        zsVar.getClass();
        ws wsVar = new ws(zsVar, 0);
        wsVar.f43362j = Boolean.valueOf(z13);
        boolean[] zArr = wsVar.f43368p;
        if (zArr.length > 9) {
            zArr[9] = true;
        }
        zs a13 = wsVar.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static MetadataOnlyResult j(String str) {
        FileInputStream fileInputStream;
        File file = new File(str);
        int length = (int) file.length();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (z.h(lowerCase, ".webp", false)) {
            byte[] bArr = new byte[length];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr, 0, length);
                dl2.b.J(fileInputStream, null);
                return RustBridge$Metadata.f52857a.stripImageRetainMetadata(bArr);
            } finally {
            }
        } else {
            int i13 = 262144 > length ? length : 262144;
            byte[] bArr2 = new byte[i13];
            fileInputStream = new FileInputStream(file);
            try {
                fileInputStream.read(bArr2, 0, i13);
                dl2.b.J(fileInputStream, null);
                RustBridge$Metadata rustBridge$Metadata = RustBridge$Metadata.f52857a;
                MetadataOnlyResult stripImageRetainMetadata = rustBridge$Metadata.stripImageRetainMetadata(bArr2);
                if ((!StringsKt.E(stripImageRetainMetadata.getError(), "failed to fill whole buffer", false) && stripImageRetainMetadata.getSuccess()) || i13 >= length) {
                    return stripImageRetainMetadata;
                }
                byte[] bArr3 = new byte[length];
                fileInputStream = new FileInputStream(file);
                try {
                    fileInputStream.read(bArr3, 0, length);
                    dl2.b.J(fileInputStream, null);
                    return rustBridge$Metadata.stripImageRetainMetadata(bArr3);
                } finally {
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }

    public static final int k(int i13) {
        return 31 - Integer.numberOfLeadingZeros(i13);
    }

    public static final so l(pu puVar) {
        Intrinsics.checkNotNullParameter(puVar, "<this>");
        if (puVar instanceof k01) {
            xk2.w wVar = ((k01) puVar).f39240c;
            int intValue = ((Number) wVar.f135234a).intValue();
            int intValue2 = ((Number) wVar.f135235b).intValue();
            so.f41948c.getClass();
            return ho.a(intValue, intValue2);
        }
        if (!(puVar instanceof d30)) {
            return null;
        }
        d30 item = (d30) puVar;
        Intrinsics.checkNotNullParameter(item, "item");
        int f13 = new k6.g(item.e()).f(1, "Orientation");
        Pair pair = (f13 == 6 || f13 == 8) ? new Pair(item.h().f80347b, item.h().f80346a) : item.h();
        int intValue3 = ((Number) pair.f80346a).intValue();
        int intValue4 = ((Number) pair.f80347b).intValue();
        so.f41948c.getClass();
        return ho.a(intValue3, intValue4);
    }

    public static final String m(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        try {
            Signature[] signatures = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), 64).signatures;
            StringBuilder sb3 = new StringBuilder();
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
            int length = signatures.length;
            int i13 = 0;
            while (i13 < length) {
                Signature signature = signatures[i13];
                i13++;
                messageDigest.update(signature.toByteArray());
                sb3.append(Base64.encodeToString(messageDigest.digest(), 0));
                sb3.append(":");
            }
            if (sb3.length() > 0) {
                sb3.setLength(sb3.length() - 1);
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "sb.toString()");
            return sb4;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException unused) {
            return "";
        }
    }

    public static final String n(zs zsVar) {
        String n13;
        String n14;
        Intrinsics.checkNotNullParameter(zsVar, "<this>");
        String z13 = zsVar.z();
        String n15 = (z13 == null || (n13 = z.n(z13, "null", "")) == null || (n14 = z.n(n13, "[", "")) == null) ? null : z.n(n14, "]", "");
        return n15 == null ? "" : n15;
    }

    public static final String o(zs zsVar) {
        sr srVar;
        Intrinsics.checkNotNullParameter(zsVar, "<this>");
        Map B = zsVar.B();
        String j13 = (B == null || (srVar = (sr) B.get("236x")) == null) ? null : srVar.j();
        return j13 == null ? "" : j13;
    }

    public static final so p(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            double d2 = ((so) next).d();
            do {
                Object next2 = it.next();
                double d13 = ((so) next2).d();
                if (Double.compare(d2, d13) > 0) {
                    next = next2;
                    d2 = d13;
                }
            } while (it.hasNext());
        }
        so soVar = (so) next;
        double d14 = soVar.d();
        so soVar2 = lo.f39845e;
        if (d14 >= soVar2.d()) {
            double d15 = soVar.d();
            soVar2 = no.f40447e;
            if (d15 <= soVar2.d()) {
                return soVar;
            }
        }
        return soVar2;
    }

    public static Object q(Object obj, String str) {
        try {
            return Class.forName(str).getDeclaredMethod("getNoop", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return obj;
        }
    }

    public static void r(hz.h hVar, r8 r8Var) {
        hVar.f70616t0 = r8Var;
    }

    public static void s(hz.h hVar, cz.e eVar) {
        hVar.f70614r0 = eVar;
    }

    public static void t(ui0.e eVar, so.z1 z1Var) {
        eVar.f122260z0 = z1Var;
    }

    public static void u(k90.c cVar, pb0.a aVar) {
        cVar.f78727k1 = aVar;
    }

    public static void v(k90.c cVar, np0.d dVar) {
        cVar.f78728l1 = dVar;
    }

    public static void w(k90.c cVar, nx.k kVar) {
        cVar.f78729m1 = kVar;
    }

    public static void x(k90.c cVar, q6 q6Var) {
        cVar.f78725i1 = q6Var;
    }

    public static void y(k90.c cVar, e0 e0Var) {
        cVar.f78730n1 = e0Var;
    }

    public static void z(ui0.e eVar, hf0.c cVar) {
        eVar.B0 = cVar;
    }
}
