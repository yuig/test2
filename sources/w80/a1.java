package w80;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import i2.f2;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import s80.i7;
import s80.l7;

/* loaded from: classes5.dex */
public abstract class a1 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f128248a = new g(rm1.q.CANCEL, i7.collage_composer_action_close, m60.x0.close_modal);

    /* renamed from: b, reason: collision with root package name */
    public static final g f128249b = new g(rm1.q.UNDO, i7.collage_composer_action_undo, m60.x0.undo);

    /* renamed from: c, reason: collision with root package name */
    public static final g f128250c = new g(rm1.q.REDO, i7.collage_composer_action_redo, l7.redo);

    /* renamed from: d, reason: collision with root package name */
    public static final g f128251d = new g(rm1.q.ELLIPSIS, i7.collage_composer_action_more, m60.x0.more);

    /* renamed from: e, reason: collision with root package name */
    public static final g f128252e = new g(rm1.q.DIRECTIONAL_ARROW_RIGHT, i7.collage_composer_action_next, m60.x0.next);

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r9)) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(w80.h r20, u2.q r21, om1.f r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function2 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: w80.a1.a(w80.h, u2.q, om1.f, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, i2.o, int, int):void");
    }

    public static final void b(g gVar, u2.q qVar, om1.f fVar, Function0 function0, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(971769229);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        om1.f fVar2 = (i14 & 4) != 0 ? om1.f.WASH_WHITE : fVar;
        Function0 function02 = (i14 & 8) != 0 ? s0.f128384i : function0;
        boolean z13 = true;
        boolean z14 = !kotlin.text.z.j((CharSequence) dl2.b.u2(gVar.f128289b, sVar));
        am.d dVar = i2.n.f71185a;
        if (z14) {
            sVar.W(-1033903106);
            yl1.b bVar = new yl1.b(gVar.f128289b, gVar.f128290c, null, null, yl1.d.PRIMARY.getColorPalette(), pk.a0.o1((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b)), null, null, 0, null, 972);
            sVar.W(1213585202);
            if ((((i13 & 7168) ^ 3072) <= 2048 || !sVar.h(function02)) && (i13 & 3072) != 2048) {
                z13 = false;
            }
            Object J2 = sVar.J();
            if (z13 || J2 == dVar) {
                J2 = new m1.e0(8, function02);
                sVar.g0(J2);
            }
            sVar.r(false);
            rl2.g0.b(bVar, qVar2, (Function1) J2, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 0);
            sVar.r(false);
        } else {
            sVar.W(-1033480297);
            om1.e eVar = om1.e.LG;
            String D0 = kh2.a1.D0(gVar.f128292e, sVar);
            om1.c cVar = new om1.c(gVar.f128288a, eVar, fVar2, null, ep.b.x(D0, "string", D0), gVar.f128290c, 0, 968);
            sVar.W(1213599926);
            boolean z15 = (((i13 & 7168) ^ 3072) > 2048 && sVar.h(function02)) || (i13 & 3072) == 2048;
            Object J3 = sVar.J();
            if (z15 || J3 == dVar) {
                J3 = new m1.e0(9, function02);
                sVar.g0(J3);
            }
            sVar.r(false);
            ig1.b.b(cVar, qVar2, (Function1) J3, sVar, 8 | (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER), 0);
            sVar.r(false);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((u50.o) gVar, qVar2, (Object) fVar2, (Object) function02, i13, i14, 9);
        }
    }

    public static final void c(x1 state, u2.q qVar, om1.f fVar, float f13, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function1, i2.o oVar, int i13, int i14) {
        float f14;
        om1.f fVar2;
        int i15;
        g gVar;
        u2.q qVar2;
        Function1 function12;
        g gVar2;
        g gVar3;
        boolean z13;
        float f15;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(703925620);
        u2.q qVar3 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        om1.f fVar3 = (i14 & 4) != 0 ? om1.f.WASH_WHITE : fVar;
        float f16 = (i14 & 8) != 0 ? 0 : f13;
        Function0 function06 = (i14 & 16) != 0 ? t0.f128388i : function0;
        Function0 function07 = (i14 & 32) != 0 ? u0.f128391i : function02;
        Function0 function08 = (i14 & 64) != 0 ? v0.f128395i : function03;
        Function0 function09 = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? w0.f128399i : function04;
        Function0 function010 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? x0.f128419i : function05;
        Function1 function13 = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? y0.f128434i : function1;
        sVar.W(-587771414);
        boolean h10 = sVar.h(state);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        boolean z14 = true;
        if (h10 || J2 == dVar) {
            g[] elements = new g[3];
            w1 w1Var = state.f128420a;
            f14 = f16;
            if (w1Var.f128403a) {
                fVar2 = fVar3;
                i15 = 27;
                gVar = g.e(f128248a, null, w1Var.f128404b, 27);
            } else {
                fVar2 = fVar3;
                i15 = 27;
                gVar = null;
            }
            elements[0] = gVar;
            w1 w1Var2 = state.f128421b;
            elements[1] = w1Var2.f128403a ? g.e(f128249b, null, w1Var2.f128404b, i15) : null;
            w1 w1Var3 = state.f128422c;
            elements[2] = w1Var3.f128403a ? g.e(f128250c, null, w1Var3.f128404b, i15) : null;
            Intrinsics.checkNotNullParameter(elements, "elements");
            ArrayList A = kotlin.collections.c0.A(elements);
            g[] elements2 = new g[2];
            w1 w1Var4 = state.f128423d;
            if (w1Var4.f128403a) {
                qVar2 = qVar3;
                function12 = function13;
                gVar2 = null;
                gVar3 = g.e(f128251d, null, w1Var4.f128404b, 27);
            } else {
                qVar2 = qVar3;
                function12 = function13;
                gVar2 = null;
                gVar3 = null;
            }
            elements2[0] = gVar3;
            w1 w1Var5 = state.f128424e;
            elements2[1] = w1Var5.f128403a ? g.e(f128252e, state.f128425f, w1Var5.f128404b, 25) : gVar2;
            Intrinsics.checkNotNullParameter(elements2, "elements");
            ArrayList A2 = kotlin.collections.c0.A(elements2);
            if (state.f128427h) {
                f15 = f14;
                z13 = false;
            } else {
                z13 = false;
                f15 = 0;
            }
            J2 = new h(A, A2, f15);
            sVar.g0(J2);
        } else {
            qVar2 = qVar3;
            fVar2 = fVar3;
            f14 = f16;
            function12 = function13;
            z13 = false;
        }
        h hVar = (h) J2;
        sVar.r(z13);
        sVar.W(-587737590);
        boolean z15 = ((((57344 & i13) ^ 24576) > 16384 && sVar.h(function06)) || (i13 & 24576) == 16384) | ((((458752 & i13) ^ 196608) > 131072 && sVar.h(function07)) || (i13 & 196608) == 131072) | ((((3670016 & i13) ^ 1572864) > 1048576 && sVar.h(function08)) || (i13 & 1572864) == 1048576) | ((((29360128 & i13) ^ 12582912) > 8388608 && sVar.h(function09)) || (i13 & 12582912) == 8388608) | ((((234881024 & i13) ^ 100663296) > 67108864 && sVar.h(function010)) || (i13 & 100663296) == 67108864);
        Object J3 = sVar.J();
        if (z15 || J3 == dVar) {
            J3 = new y(function06, function07, function08, function09, function010, 1);
            sVar.g0(J3);
        }
        Function1 function14 = (Function1) J3;
        sVar.r(false);
        sVar.W(-587728287);
        Function1 function15 = function12;
        if ((((1879048192 & i13) ^ 805306368) <= 536870912 || !sVar.h(function15)) && (i13 & 805306368) != 536870912) {
            z14 = false;
        }
        Object J4 = sVar.J();
        if (z14 || J4 == dVar) {
            J4 = new r1.k(2, function15);
            sVar.g0(J4);
        }
        sVar.r(false);
        a(hVar, qVar2, fVar2, function14, (Function2) J4, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8 | (i13 & 896), 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new z0(state, qVar2, fVar2, f14, function06, function07, function08, function09, function010, function15, i13, i14);
        }
    }
}
