package kh2;

import ads_mobile_sdk.e21;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import c50.ma;
import com.pinterest.api.model.ew;
import com.pinterest.api.model.j01;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.pc0;
import com.pinterest.api.model.qx;
import com.pinterest.api.model.uu;
import com.pinterest.api.model.uw;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.sheet.header.GestaltSheetHeader;
import com.pinterest.ui.imageview.WebImageView;
import com.pinterest.video.core.view.PinterestVideoView;
import h32.a4;
import h32.d4;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import so.c6;

/* loaded from: classes4.dex */
public abstract class w implements vm.d, pc.a {
    public static BigInteger A0(int[] iArr) {
        byte[] bArr = new byte[28];
        for (int i13 = 0; i13 < 7; i13++) {
            int i14 = iArr[i13];
            if (i14 != 0) {
                e0.t.K0(bArr, i14, (6 - i13) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final wy0 B(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        String T0 = d.T0(v7Var);
        if (T0 == null || kotlin.text.z.j(T0)) {
            return null;
        }
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (Intrinsics.d(T0, f13 != null ? f13.getF39332b() : null)) {
            return f13;
        }
        wy0 e13 = ew.e(T0);
        return e13 == null ? v7Var.k1() : e13;
    }

    public static void B0(tc.g writer, pc.v customScalarAdapters, e50.g1 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("query");
        a10.e eVar = pc.c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f57349a);
        writer.M0("imageSpec");
        eVar.d(writer, customScalarAdapters, "345x");
        writer.M0("referrerSource");
        eVar.d(writer, customScalarAdapters, value.f57350b);
        pc.r0 r0Var = value.f57351c;
        if (r0Var instanceof pc.q0) {
            writer.M0("first");
            pc.c.d(pc.c.f99526g).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        pc.r0 r0Var2 = value.f57352d;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("after");
            pc.c.d(pc.c.b(eVar)).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
    }

    public static int[] C(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 224) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[7];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i13] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i13++;
        }
        return iArr;
    }

    public static final x81.h C0(uw uwVar, f42.c makeupCategory) {
        Intrinsics.checkNotNullParameter(uwVar, "<this>");
        Intrinsics.checkNotNullParameter(makeupCategory, "makeupCategory");
        int v03 = v0(uwVar.p(), 0);
        Integer A = uwVar.A();
        Integer y13 = uwVar.y();
        Integer r13 = uwVar.r();
        Integer z13 = uwVar.z();
        Integer C = uwVar.C();
        Integer q13 = uwVar.q();
        int v04 = v0(uwVar.v(), -1);
        Integer u13 = uwVar.u();
        Integer w13 = uwVar.w();
        Integer s13 = uwVar.s();
        Integer t13 = uwVar.t();
        Integer x13 = uwVar.x();
        return new x81.h(v03, A.intValue(), r13.intValue(), y13.intValue(), z13.intValue(), C.intValue(), q13.intValue(), v04, u13.intValue(), w13.intValue(), s13.intValue(), t13.intValue(), x13.intValue(), uwVar.B(), makeupCategory);
    }

    public static int D(int[] iArr) {
        return iArr[0] & 1;
    }

    public static boolean D0(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static kh.b E(Context context) {
        return new kh.b(context, null, kh.b.f79407k, jh.o.f76185b, com.google.android.gms.common.api.e.f30758c);
    }

    public static final Drawable G(Context context, v32.c reactionType, Integer num) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        switch (wa2.w.f128950a[reactionType.ordinal()]) {
            case 1:
                BitmapDrawable C = com.bumptech.glide.d.C(new rm1.d(new rm1.f(rm1.q.HEART_OUTLINE), null, null, 0, null, 30), context);
                if (num != null) {
                    int intValue = num.intValue();
                    Object obj = d5.a.f53679a;
                    C.setColorFilter(new PorterDuffColorFilter(context.getColor(intValue), PorterDuff.Mode.SRC_IN));
                }
                return C;
            case 2:
                int i13 = cz1.b.ic_reaction_love_nonpds;
                Object obj2 = d5.a.f53679a;
                return context.getDrawable(i13);
            case 3:
                int i14 = cz1.b.ic_reaction_haha_nonpds;
                Object obj3 = d5.a.f53679a;
                return context.getDrawable(i14);
            case 4:
                int i15 = cz1.b.ic_reaction_thanks_nonpds;
                Object obj4 = d5.a.f53679a;
                return context.getDrawable(i15);
            case 5:
                int i16 = cz1.b.ic_reaction_good_idea_nonpds;
                Object obj5 = d5.a.f53679a;
                return context.getDrawable(i16);
            case 6:
                int i17 = cz1.b.ic_reaction_wow_nonpds;
                Object obj6 = d5.a.f53679a;
                return context.getDrawable(i17);
            default:
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final rl2.d H(rl2.e eVar) {
        am2.g gVar;
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        if (eVar instanceof rl2.d) {
            return (rl2.d) eVar;
        }
        if (!(eVar instanceof rl2.w)) {
            throw new ul2.u1("Cannot calculate JVM erasure for type: " + eVar);
        }
        rl2.u uVar = ul2.s1.f122598d[0];
        Object invoke = ((ul2.s1) ((rl2.w) eVar)).f122600b.invoke();
        Intrinsics.checkNotNullExpressionValue(invoke, "getValue(...)");
        List list = (List) invoke;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            rl2.v vVar = (rl2.v) next;
            Intrinsics.g(vVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            am2.j b13 = ((ul2.q1) vVar).f122585a.w0().b();
            gVar = b13 instanceof am2.g ? (am2.g) b13 : null;
            if (gVar != null && gVar.c() != am2.h.INTERFACE && gVar.c() != am2.h.ANNOTATION_CLASS) {
                gVar = next;
                break;
            }
        }
        rl2.v vVar2 = (rl2.v) gVar;
        if (vVar2 == null) {
            vVar2 = (rl2.v) CollectionsKt.firstOrNull(list);
        }
        return vVar2 != null ? I(vVar2) : kotlin.jvm.internal.k0.f80436a.b(Object.class);
    }

    public static final rl2.d I(rl2.v vVar) {
        rl2.d H;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        ul2.q1 q1Var = (ul2.q1) vVar;
        rl2.e d2 = q1Var.d();
        if (d2 != null && (H = H(d2)) != null) {
            return H;
        }
        throw new ul2.u1("Cannot calculate JVM erasure for type: " + q1Var);
    }

    public static final s3.q1 J(s3.f2 f2Var) {
        return com.bumptech.glide.c.S0(f2Var, 16);
    }

    public static int K(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginEnd();
    }

    public static int L(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.getMarginStart();
    }

    public static final Drawable M(Context context, v32.c reactionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        int i13 = wa2.w.f128950a[reactionType.ordinal()];
        if (i13 == 2) {
            int i14 = cz1.b.ic_reaction_face_love_simple_nonpds;
            Object obj = d5.a.f53679a;
            return context.getDrawable(i14);
        }
        if (i13 == 3) {
            int i15 = cz1.b.ic_reaction_face_haha_simple_nonpds;
            Object obj2 = d5.a.f53679a;
            return context.getDrawable(i15);
        }
        if (i13 == 4) {
            int i16 = cz1.b.ic_reaction_face_thanks_simple_nonpds;
            Object obj3 = d5.a.f53679a;
            return context.getDrawable(i16);
        }
        if (i13 == 5) {
            int i17 = cz1.b.ic_reaction_face_good_idea_simple_nonpds;
            Object obj4 = d5.a.f53679a;
            return context.getDrawable(i17);
        }
        if (i13 != 6) {
            return null;
        }
        int i18 = cz1.b.ic_reaction_face_wow_simple_nonpds;
        Object obj5 = d5.a.f53679a;
        return context.getDrawable(i18);
    }

    public static final ArrayList N(vd0.a skinToneOptionsArray) {
        Object obj;
        Intrinsics.checkNotNullParameter(skinToneOptionsArray, "skinToneOptionsArray");
        ArrayList arrayList = new ArrayList();
        Iterator it = skinToneOptionsArray.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Object e13 = vd0.c.f125622b.e(((vd0.c) it.next()).f125623a, e71.a.class);
            Intrinsics.g(e13, "null cannot be cast to non-null type com.pinterest.feature.search.results.skintone.model.SkinToneFilter");
            e71.a aVar = (e71.a) e13;
            Iterator it2 = e71.a.f57616f.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (Intrinsics.d(aVar.getId(), ((e71.a) obj).getId())) {
                    break;
                }
            }
            e71.a aVar2 = (e71.a) obj;
            if (aVar2 != null) {
                bm1.l lVar = aVar2.f57621e;
                Intrinsics.checkNotNullParameter(lVar, "<set-?>");
                aVar.f57621e = lVar;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public static final long O(double d2) {
        return r0(4294967296L, (float) d2);
    }

    public static final long P(float f13) {
        return r0(4294967296L, f13);
    }

    public static final long Q(int i13) {
        return r0(4294967296L, i13);
    }

    public static final int R(int i13, String str) {
        int i14 = m60.o.f85933a;
        int b13 = ma.b(i13, str);
        float[] fArr = new float[3];
        Color.colorToHSV(b13, fArr);
        fArr[1] = Math.min(fArr[1], 0.6f);
        fArr[2] = Math.min(Math.max(fArr[2], 0.7f), 0.8f);
        return Color.HSVToColor(fArr);
    }

    public static final String S(Context context, v32.c reactionType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactionType, "reactionType");
        switch (wa2.w.f128950a[reactionType.ordinal()]) {
            case 1:
                String string = context.getString(cz1.e.pin_reaction_none);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                return string;
            case 2:
                String string2 = context.getString(cz1.e.pin_reaction_love);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                return string2;
            case 3:
                String string3 = context.getString(cz1.e.pin_reaction_haha);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = context.getString(cz1.e.pin_reaction_thanks);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                return string4;
            case 5:
                String string5 = context.getString(cz1.e.pin_reaction_good_idea);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                return string5;
            case 6:
                String string6 = context.getString(cz1.e.pin_reaction_wow);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                return string6;
            default:
                return "";
        }
    }

    public static boolean T(int[] iArr, int[] iArr2) {
        for (int i13 = 6; i13 >= 0; i13--) {
            int i14 = iArr[i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i13];
            if (i14 < i15) {
                return false;
            }
            if (i14 > i15) {
                return true;
            }
        }
        return true;
    }

    public static void U(tb1.h hVar) {
        hVar.getClass();
    }

    public static void V(tb1.h hVar) {
        hVar.getClass();
    }

    public static void W(o82.i3 i3Var, m60.f0 f0Var) {
        i3Var.f93622u0 = f0Var;
    }

    public static void X(tb1.h hVar, x10.a aVar) {
        hVar.f117143m0 = aVar;
    }

    public static void Y(tb1.h hVar, dv0.q qVar) {
        hVar.f117142l0 = qVar;
    }

    public static void Z(o82.i3 i3Var, c6 c6Var) {
        i3Var.f93623v0 = c6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01e2, code lost:
    
        r24 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01ec, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L315;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x021d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e2 A[EDGE_INSN: B:105:0x01e2->B:106:0x01e2 BREAK  A[LOOP:1: B:57:0x01ad->B:61:0x01d9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0239 A[LOOP:4: B:98:0x0237->B:99:0x0239, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(j1.g2 r22, u2.q r23, j1.h0 r24, kotlin.jvm.functions.Function1 r25, kl2.l r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.w.a(j1.g2, u2.q, j1.h0, kotlin.jvm.functions.Function1, kl2.l, i2.o, int, int):void");
    }

    public static void a0(hx1.f fVar, so.c1 c1Var) {
        fVar.f70531k0 = c1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.Object r16, u2.q r17, j1.h0 r18, java.lang.String r19, kl2.l r20, i2.o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.w.b(java.lang.Object, u2.q, j1.h0, java.lang.String, kl2.l, i2.o, int, int):void");
    }

    public static void b0(tb1.h hVar, n91.z zVar) {
        hVar.f117140j0 = zVar;
    }

    public static final void c(cm1.d state, u2.q qVar, Function0 function0, Function0 function02, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1332265093);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            function0 = hm1.c.f69577i;
        }
        if ((i14 & 8) != 0) {
            function02 = hm1.d.f69578i;
        }
        e(state, qVar, new rq.m1(state, function0, function02, 12), sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.r((Object) state, qVar, (Object) function0, (Object) function02, i13, i14, 23);
        }
    }

    public static void c0(hx1.f fVar, uk1.e eVar) {
        fVar.f70530j0 = eVar;
    }

    public static void d0(tb1.h hVar, uk1.e eVar) {
        hVar.f117154x0 = eVar;
    }

    public static final void e(cm1.d state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(207963137);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        int i15 = 16;
        androidx.compose.ui.viewinterop.a.a(new rq.a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, i15), qVar, new com.pinterest.framework.screens.q(i15, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 7, qVar, state, aVar);
        }
    }

    public static void e0(tb1.h hVar, i92.k kVar) {
        hVar.f117141k0 = kVar;
    }

    public static void f0(we1.y1 y1Var, ku1.l lVar) {
        y1Var.f129705c = lVar;
    }

    public static final long g(int i13) {
        if (i13 > 0) {
            return i13;
        }
        throw new IllegalArgumentException("The span value should be higher than 0".toString());
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0008. Please report as an issue. */
    public static boolean g0(v.e0 e0Var) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            int i13 = e0Var.f123435a;
            w.l lVar = e0Var.f123436b;
            switch (i13) {
            }
            bool = (Boolean) lVar.a(key);
        } catch (BufferUnderflowException e13) {
            if (y.b.f136245a.b(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                m0.p("FlashAvailability", String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)));
            } else {
                m0.t("FlashAvailability", String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)), e13);
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            m0.X0("FlashAvailability", "Characteristics did not contain key FLASH_INFO_AVAILABLE. Flash is not available.");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void h(byte b13, byte b14, byte b15, byte b16, char[] cArr, int i13) {
        if (!k(b14)) {
            if ((((b14 + 112) + (b13 << 28)) >> 30) == 0 && !k(b15) && !k(b16)) {
                int i14 = ((b13 & 7) << 18) | ((b14 & 63) << 12) | ((b15 & 63) << 6) | (b16 & 63);
                cArr[i13] = (char) ((i14 >>> 10) + 55232);
                cArr[i13 + 1] = (char) ((i14 & 1023) + 56320);
                return;
            }
        }
        throw new e21("Protocol message had invalid UTF-8.");
    }

    public static final boolean h0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        wy0 f13 = ((b60.d) com.bumptech.glide.d.E()).f();
        if (f13 == null) {
            return false;
        }
        String T0 = d.T0(v7Var);
        if (T0 == null) {
            T0 = "";
        }
        return dl2.b.S1(f13, T0);
    }

    public static void i(byte b13, byte b14, byte b15, char[] cArr, int i13) {
        if (k(b14) || ((b13 == -32 && b14 < -96) || ((b13 == -19 && b14 >= -96) || k(b15)))) {
            throw new e21("Protocol message had invalid UTF-8.");
        }
        cArr[i13] = (char) (((b13 & 15) << 12) | ((b14 & 63) << 6) | (b15 & 63));
    }

    public static final boolean i0(v7 v7Var) {
        Intrinsics.checkNotNullParameter(v7Var, "<this>");
        Boolean G0 = v7Var.G0();
        Intrinsics.checkNotNullExpressionValue(G0, "getCollaboratedByMe(...)");
        return G0.booleanValue() || h0(v7Var);
    }

    public static void j(byte b13, byte b14, char[] cArr, int i13) {
        if (b13 < -62 || k(b14)) {
            throw new e21("Protocol message had invalid UTF-8.");
        }
        cArr[i13] = (char) (((b13 & 31) << 6) | (b14 & 63));
    }

    public static boolean j0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 7; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(byte b13) {
        return b13 > -65;
    }

    public static final boolean k0(long j13) {
        n4.n[] nVarArr = n4.m.f89188b;
        return (j13 & 1095216660480L) == 0;
    }

    public static final byte[] l(byte[] bArr, byte[] bArr2) {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(new byte[]{0, 0, 0, 16});
        messageDigest.update(bArr);
        messageDigest.update(bArr2);
        byte[] digest = messageDigest.digest();
        if (digest.length < 4) {
            return null;
        }
        return new byte[]{0, digest[0], digest[1], digest[2], digest[3]};
    }

    public static boolean l0(int[] iArr) {
        for (int i13 = 0; i13 < 7; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean m(x2.c cVar, long j13) {
        if (!((u2.p) cVar).f120042a.f120054m) {
            return false;
        }
        s3.x xVar = com.bumptech.glide.c.U0(cVar).f110837y.f110805b;
        if (!xVar.X0().f120054m) {
            return false;
        }
        long j14 = xVar.f102180c;
        long c03 = xVar.c0(0L);
        float d2 = a3.c.d(c03);
        float e13 = a3.c.e(c03);
        float f13 = ((int) (j14 >> 32)) + d2;
        float f14 = ((int) (j14 & 4294967295L)) + e13;
        float d13 = a3.c.d(j13);
        if (d2 > d13 || d13 > f13) {
            return false;
        }
        float e14 = a3.c.e(j13);
        return e13 <= e14 && e14 <= f14;
    }

    public static final void m0(qx model, h32.u0 elementType, nx.d0 pinalytics) {
        Intrinsics.checkNotNullParameter(model, "model");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        HashMap hashMap = new HashMap();
        hashMap.put("news_type", String.valueOf(model.u().getValue()));
        hashMap.put("display_mode", String.valueOf(model.g().getValue()));
        pinalytics.f0(elementType, null, model.getF39332b(), hashMap, false);
    }

    public static final void n(x2.c cVar, x2.b bVar) {
        x2.e eVar = (x2.e) cVar;
        eVar.N0(bVar);
        eVar.P0(bVar);
    }

    public static void n0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr2[5] & 4294967295L;
        long j19 = iArr2[6] & 4294967295L;
        long j23 = iArr[0] & 4294967295L;
        long j24 = j23 * j13;
        iArr3[0] = (int) j24;
        long j25 = (j23 * j14) + (j24 >>> 32);
        iArr3[1] = (int) j25;
        long j26 = (j23 * j15) + (j25 >>> 32);
        iArr3[2] = (int) j26;
        long j27 = (j23 * j16) + (j26 >>> 32);
        iArr3[3] = (int) j27;
        long j28 = (j23 * j17) + (j27 >>> 32);
        iArr3[4] = (int) j28;
        long j29 = (j23 * j18) + (j28 >>> 32);
        iArr3[5] = (int) j29;
        long j33 = (j23 * j19) + (j29 >>> 32);
        iArr3[6] = (int) j33;
        iArr3[7] = (int) (j33 >>> 32);
        int i13 = 1;
        for (int i14 = 7; i13 < i14; i14 = 7) {
            long j34 = iArr[i13] & 4294967295L;
            long j35 = j13;
            long j36 = (j34 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j36;
            int i15 = i13 + 1;
            long j37 = (j34 * j14) + (iArr3[i15] & 4294967295L) + (j36 >>> 32);
            iArr3[i15] = (int) j37;
            long j38 = j14;
            long j39 = (j34 * j15) + (iArr3[r18] & 4294967295L) + (j37 >>> 32);
            iArr3[i13 + 2] = (int) j39;
            long j43 = (j34 * j16) + (iArr3[r6] & 4294967295L) + (j39 >>> 32);
            iArr3[i13 + 3] = (int) j43;
            long j44 = (j34 * j17) + (iArr3[r6] & 4294967295L) + (j43 >>> 32);
            iArr3[i13 + 4] = (int) j44;
            long j45 = (j34 * j18) + (iArr3[r6] & 4294967295L) + (j44 >>> 32);
            iArr3[i13 + 5] = (int) j45;
            long j46 = j45 >>> 32;
            long j47 = (j34 * j19) + (iArr3[r3] & 4294967295L) + j46;
            iArr3[i13 + 6] = (int) j47;
            iArr3[i13 + 7] = (int) (j47 >>> 32);
            j13 = j35;
            i13 = i15;
            j14 = j38;
        }
    }

    public static final void o(s3.j2 j2Var, Function1 function1) {
        if (function1.invoke(j2Var) != s3.i2.ContinueTraversal) {
            return;
        }
        b0.X1(j2Var, function1);
    }

    public static int o0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr2[5] & 4294967295L;
        long j19 = iArr2[6] & 4294967295L;
        long j23 = 0;
        int i13 = 0;
        while (i13 < 7) {
            long j24 = j19;
            long j25 = iArr[i13] & 4294967295L;
            long j26 = j18;
            long j27 = (iArr3[i13] & 4294967295L) + (j25 * j13);
            iArr3[i13] = (int) j27;
            int i14 = i13 + 1;
            long j28 = j14;
            long j29 = (j25 * j14) + (iArr3[i14] & 4294967295L) + (j27 >>> 32);
            iArr3[i14] = (int) j29;
            long j33 = (j25 * j15) + (iArr3[r25] & 4294967295L) + (j29 >>> 32);
            iArr3[i13 + 2] = (int) j33;
            long j34 = (j25 * j16) + (iArr3[r8] & 4294967295L) + (j33 >>> 32);
            iArr3[i13 + 3] = (int) j34;
            long j35 = (j25 * j17) + (iArr3[r8] & 4294967295L) + (j34 >>> 32);
            iArr3[i13 + 4] = (int) j35;
            long j36 = (j25 * j26) + (iArr3[r8] & 4294967295L) + (j35 >>> 32);
            iArr3[i13 + 5] = (int) j36;
            long j37 = (j25 * j24) + (iArr3[r8] & 4294967295L) + (j36 >>> 32);
            iArr3[i13 + 6] = (int) j37;
            long j38 = j23 + (iArr3[r2] & 4294967295L) + (j37 >>> 32);
            iArr3[i13 + 7] = (int) j38;
            j23 = j38 >>> 32;
            i13 = i14;
            j19 = j24;
            j18 = j26;
            j14 = j28;
            j15 = j15;
        }
        return (int) j23;
    }

    public static int p(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (j13 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j16;
        long j17 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j17;
        long j18 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (j17 >>> 32);
        iArr3[5] = (int) j18;
        long j19 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (j18 >>> 32);
        iArr3[6] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static int q(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) + (iArr2[0] & 4294967295L) + (iArr3[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = (iArr[1] & 4294967295L) + (iArr2[1] & 4294967295L) + (iArr3[1] & 4294967295L) + (j13 >>> 32);
        iArr3[1] = (int) j14;
        long j15 = (iArr[2] & 4294967295L) + (iArr2[2] & 4294967295L) + (iArr3[2] & 4294967295L) + (j14 >>> 32);
        iArr3[2] = (int) j15;
        long j16 = (iArr[3] & 4294967295L) + (iArr2[3] & 4294967295L) + (iArr3[3] & 4294967295L) + (j15 >>> 32);
        iArr3[3] = (int) j16;
        long j17 = (iArr[4] & 4294967295L) + (iArr2[4] & 4294967295L) + (iArr3[4] & 4294967295L) + (j16 >>> 32);
        iArr3[4] = (int) j17;
        long j18 = (iArr[5] & 4294967295L) + (iArr2[5] & 4294967295L) + (iArr3[5] & 4294967295L) + (j17 >>> 32);
        iArr3[5] = (int) j18;
        long j19 = (iArr[6] & 4294967295L) + (iArr2[6] & 4294967295L) + (iArr3[6] & 4294967295L) + (j18 >>> 32);
        iArr3[6] = (int) j19;
        return (int) (j19 >>> 32);
    }

    public static final long q0(long j13) {
        return j13 < 95617584000000L ? j13 : TimeUnit.NANOSECONDS.toMillis(j13);
    }

    public static int r(boolean[] zArr, int i13, int[] iArr, boolean z13) {
        int i14 = 0;
        for (int i15 : iArr) {
            int i16 = 0;
            while (i16 < i15) {
                zArr[i13] = z13;
                i16++;
                i13++;
            }
            i14 += i15;
            z13 = !z13;
        }
        return i14;
    }

    public static final long r0(long j13, float f13) {
        long floatToIntBits = j13 | (Float.floatToIntBits(f13) & 4294967295L);
        n4.n[] nVarArr = n4.m.f89188b;
        return floatToIntBits;
    }

    public static boolean s(byte b13) {
        return b13 >= 0;
    }

    public static ByteBuffer s0(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16) {
        int i17;
        int i18;
        byte b13;
        int i19;
        ByteBuffer order = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
        int position = byteBuffer.position();
        int i23 = i15;
        while (byteBuffer.hasRemaining() && i23 < i16) {
            if (i13 == 2) {
                i17 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24);
            } else if (i13 == 3) {
                i17 = (byteBuffer.get() & 255) << 24;
            } else if (i13 != 4) {
                if (i13 == 21) {
                    i18 = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                    b13 = byteBuffer.get();
                } else if (i13 != 22) {
                    if (i13 == 268435456) {
                        i18 = (byteBuffer.get() & 255) << 24;
                        i19 = (byteBuffer.get() & 255) << 16;
                    } else if (i13 == 1342177280) {
                        i18 = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                        i19 = (byteBuffer.get() & 255) << 8;
                    } else {
                        if (i13 != 1610612736) {
                            throw new IllegalStateException();
                        }
                        i18 = ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 8);
                        i19 = byteBuffer.get() & 255;
                    }
                    i17 = i18 | i19;
                } else {
                    i18 = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                    b13 = byteBuffer.get();
                }
                i19 = (b13 & 255) << 24;
                i17 = i18 | i19;
            } else {
                float h10 = d7.n0.h(byteBuffer.getFloat(), -1.0f, 1.0f);
                i17 = (int) (h10 < 0.0f ? (-h10) * (-2.1474836E9f) : h10 * 2.1474836E9f);
            }
            int i24 = (int) ((i17 * i23) / i16);
            if (i13 == 2) {
                order.put((byte) (i24 >> 16));
                order.put((byte) (i24 >> 24));
            } else if (i13 == 3) {
                order.put((byte) (i24 >> 24));
            } else if (i13 != 4) {
                if (i13 == 21) {
                    order.put((byte) (i24 >> 8));
                    order.put((byte) (i24 >> 16));
                    order.put((byte) (i24 >> 24));
                } else if (i13 == 22) {
                    order.put((byte) i24);
                    order.put((byte) (i24 >> 8));
                    order.put((byte) (i24 >> 16));
                    order.put((byte) (i24 >> 24));
                } else if (i13 == 268435456) {
                    order.put((byte) (i24 >> 24));
                    order.put((byte) (i24 >> 16));
                } else if (i13 == 1342177280) {
                    order.put((byte) (i24 >> 24));
                    order.put((byte) (i24 >> 16));
                    order.put((byte) (i24 >> 8));
                } else {
                    if (i13 != 1610612736) {
                        throw new IllegalStateException();
                    }
                    order.put((byte) (i24 >> 24));
                    order.put((byte) (i24 >> 16));
                    order.put((byte) (i24 >> 8));
                    order.put((byte) i24);
                }
            } else if (i24 < 0) {
                order.putFloat((-i24) / (-2.1474836E9f));
            } else {
                order.putFloat(i24 / 2.1474836E9f);
            }
            if (byteBuffer.position() == position + i14) {
                i23++;
                position = byteBuffer.position();
            }
        }
        order.put(byteBuffer);
        order.flip();
        return order;
    }

    public static final void t(GestaltSheetHeader gestaltSheetHeader, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSheetHeader, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        kn1.h hVar = new kn1.h((kn1.b) ((u50.o) gestaltSheetHeader.f49584a.f33803a));
        init.invoke(hVar);
        gestaltSheetHeader.T(new an1.i(hVar, 8));
    }

    public static void u(int[] iArr, int[] iArr2) {
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        iArr2[2] = iArr[2];
        iArr2[3] = iArr[3];
        iArr2[4] = iArr[4];
        iArr2[5] = iArr[5];
        iArr2[6] = iArr[6];
    }

    public static Intent u0(Context context, androidx.appcompat.app.i0 i0Var, IntentFilter intentFilter, int i13) {
        if ((i13 & 4) == 0) {
            return context.registerReceiver(i0Var, intentFilter, null, null, i13 & 1);
        }
        Object obj = d5.a.f53679a;
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (s0.x(context, str) == 0) {
            return context.registerReceiver(i0Var, intentFilter, str, null);
        }
        throw new RuntimeException(a.a.k("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static r72.z1 v(r72.z1 copy, String str, r72.l1 l1Var, double d2, double d13, r72.k0 k0Var, int i13) {
        String id3 = (i13 & 1) != 0 ? copy.b() : str;
        r72.l1 offset = (i13 & 2) != 0 ? copy.c() : l1Var;
        double e13 = (i13 & 4) != 0 ? copy.e() : d2;
        double d14 = (i13 & 8) != 0 ? copy.d() : d13;
        r72.k0 effectData = (i13 & 16) != 0 ? copy.a() : k0Var;
        Intrinsics.checkNotNullParameter(copy, "$this$copy");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(offset, "offset");
        Intrinsics.checkNotNullParameter(effectData, "effectData");
        if (copy instanceof r72.u1) {
            return r72.u1.f((r72.u1) copy, id3, offset, e13, d14, effectData, null, null, null, null, null, null, null, null, 262112);
        }
        if (copy instanceof r72.y1) {
            return r72.y1.f((r72.y1) copy, id3, offset, e13, d14, effectData, null, 32);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static int v0(String str, int i13) {
        tb0.p productArea = tb0.p.VIRTUAL_TRY_ON;
        Intrinsics.checkNotNullParameter(productArea, "productArea");
        if (str == null || kotlin.text.z.j(str)) {
            return i13;
        }
        try {
            return Color.parseColor(str);
        } catch (IllegalArgumentException e13) {
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.q(e13, "Invalid color ".concat(str), productArea);
            return i13;
        }
    }

    public static final ja.c0 w(Uri fileUri, String filePath, Integer num, Long l13, Float f13) {
        int g13;
        long c13;
        float b13;
        Intrinsics.checkNotNullParameter(fileUri, "fileUri");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        ja.c0 c0Var = new ja.c0(1);
        c0Var.j("REGISTER_MEDIA_TYPE", pc0.REGISTER_TYPE_VIDEO.getValue());
        if (num != null) {
            g13 = num.intValue();
        } else {
            k01.f39239g.getClass();
            g13 = j01.g(filePath);
        }
        c0Var.h(g13, "REGISTER_MEDIA_ROTATION");
        c0Var.j("MEDIA_TYPE", uu.VIDEO.getValue());
        c0Var.j("MEDIA_URI", fileUri.toString());
        if (l13 != null) {
            c13 = l13.longValue();
        } else {
            k01.f39239g.getClass();
            c13 = j01.c(filePath);
        }
        c0Var.i(c13, "video_duration");
        if (f13 != null) {
            b13 = f13.floatValue();
        } else {
            k01.f39239g.getClass();
            b13 = j01.b(filePath);
        }
        Intrinsics.checkNotNullParameter("aspect_ratio", "key");
        c0Var.f75176a.put("aspect_ratio", Float.valueOf(b13));
        return c0Var;
    }

    public static final no2.b w0(to2.d dVar, Type type) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        no2.b x13 = he2.k.x(dVar, type, true);
        if (x13 != null) {
            return x13;
        }
        Class v13 = he2.k.v(type);
        Intrinsics.checkNotNullParameter(v13, "<this>");
        rl2.d w03 = lb.l0.w0(v13);
        Intrinsics.checkNotNullParameter(w03, "<this>");
        String className = w03.f();
        if (className == null) {
            className = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(className, "className");
        throw new SerializationException("Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static PinterestVideoView x(Context context, sf1.x1 videoViewModel, nx.d0 d0Var, int i13, int i14, int i15, boolean z13, sf1.w0 w0Var, String pinId, String pageIndex, String str, float f13, float f14, int i16, int i17, float f15, String str2, String str3, boolean z14, boolean z15, bc2.q videoTracks, Function1 playerEventListenerCreator, sf1.l btrCallback) {
        sf1.j1 j1Var;
        int intValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoViewModel, "videoViewModel");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        Intrinsics.checkNotNullParameter(playerEventListenerCreator, "playerEventListenerCreator");
        Intrinsics.checkNotNullParameter(btrCallback, "btrCallback");
        Integer[] numArr = PinterestVideoView.f52749c1;
        PinterestVideoView z16 = bk.f.z(context, n3.E(d0Var, tb0.p.CLOSEUP), videoViewModel.f112796f, 8);
        z16.N0 = btrCallback;
        z16.j0();
        z16.e0(bc2.m.PIN_CLOSEUP);
        Pair[] pairArr = new Pair[3];
        pairArr[0] = new Pair("is_closeup_video", "true");
        pairArr[1] = new Pair("video_play_type", "video");
        pairArr[2] = new Pair("idea_pin_session_id", str3 == null ? "" : str3);
        Map g13 = kotlin.collections.z0.g(pairArr);
        nx.z0 z0Var = z16.C0;
        z0Var.putAll(g13);
        Integer num = videoTracks.f22678g;
        if (num != null && (intValue = num.intValue()) > -1) {
            z0Var.put("grid_index", String.valueOf(intValue));
        }
        videoViewModel.f112795e.getClass();
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        HashMap hashMap = new HashMap();
        hashMap.put("story_pin_page_id", pageIndex);
        hashMap.put("story_pin_raw_index", pageIndex);
        if (str != null) {
            hashMap.put("story_pin_page_uuid", str);
        }
        z0Var.putAll(hashMap);
        z16.U = i13;
        z16.setLayoutParams(new RelativeLayout.LayoutParams(i16, i17));
        ViewGroup.LayoutParams layoutParams = z16.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        c0.d.m2((RelativeLayout.LayoutParams) layoutParams, i16, i17, i14, i15);
        z16.setX(f13);
        z16.setY(f14);
        z16.M(f15);
        z16.z(videoViewModel.f112794d);
        z16.P(videoViewModel.f112791a || z15);
        z16.t0(z15);
        z16.H0 = videoViewModel.f112793c;
        z16.g0(nc2.j.AUTOPLAY_BY_STATE);
        z16.R(true);
        z16.O(videoViewModel.f112792b || z13);
        if (z16.f18950o != 2) {
            z16.f18950o = 2;
            z16.F();
        }
        z16.setVisibility(0);
        z16.setKeepScreenOn(true);
        z16.F0 = pinId;
        z16.D0 = (h32.g0) sf1.c.f112522o.invoke(Boolean.valueOf(z14));
        h32.u0 u0Var = h32.u0.PIN_STORY_PIN_VIDEO;
        if (u0Var != null) {
            z16.E0 = u0Var;
        }
        if (str2 != null) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            WebImageView webImageView = z16.K0;
            webImageView.setScaleType(scaleType);
            webImageView.g2(f15, f15, f15, f15);
            webImageView.loadUrl(str2);
        }
        z16.u0((ic2.d) playerEventListenerCreator.invoke(z16));
        h32.i0 p13 = d0Var != null ? d0Var.p() : null;
        String uid = a.a.D(pinId, "-", pageIndex);
        d4 d4Var = p13 != null ? p13.f67081a : null;
        a4 a4Var = p13 != null ? p13.f67082b : null;
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(videoTracks, "videoTracks");
        oc2.i.g(z16, new bc2.k(uid, videoTracks.a(), d4Var, a4Var, videoTracks, null), new ec2.g(hf0.b.f69002b, bc2.j.OTHER, false, RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SHARE_PIN_VIDEO_GRID_CELL_FULL_SPAN), 4);
        if (w0Var != null && (j1Var = w0Var.f112788a.G) != null && ((rf1.p0) j1Var).R3()) {
            qc2.f fVar = qc2.f.DISABLED;
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            z16.O = fVar;
        }
        z16.U0 = 50L;
        z16.P(nc2.h.f90406b);
        return z16;
    }

    public static void x0(int[] iArr, int[] iArr2) {
        long j13 = iArr[0] & 4294967295L;
        int i13 = 14;
        int i14 = 0;
        int i15 = 6;
        while (true) {
            int i16 = i15 - 1;
            long j14 = iArr[i15] & 4294967295L;
            long j15 = j14 * j14;
            iArr2[i13 - 1] = (i14 << 31) | ((int) (j15 >>> 33));
            i13 -= 2;
            iArr2[i13] = (int) (j15 >>> 1);
            i14 = (int) j15;
            if (i16 <= 0) {
                long j16 = j13 * j13;
                long j17 = (j16 >>> 33) | ((i14 << 31) & 4294967295L);
                iArr2[0] = (int) j16;
                long j18 = iArr[1] & 4294967295L;
                long j19 = j17 + (j18 * j13);
                int i17 = (int) j19;
                iArr2[1] = (i17 << 1) | (((int) (j16 >>> 32)) & 1);
                int i18 = i17 >>> 31;
                long j23 = (iArr2[2] & 4294967295L) + (j19 >>> 32);
                long j24 = iArr[2] & 4294967295L;
                long j25 = j23 + (j24 * j13);
                int i19 = (int) j25;
                iArr2[2] = (i19 << 1) | i18;
                long f13 = d7.g.f(j24, j18, j25 >>> 32, iArr2[3] & 4294967295L);
                long j26 = (iArr2[4] & 4294967295L) + (f13 >>> 32);
                long j27 = iArr[3] & 4294967295L;
                long j28 = (iArr2[5] & 4294967295L) + (j26 >>> 32);
                long j29 = (j27 * j13) + (f13 & 4294967295L);
                int i23 = (int) j29;
                iArr2[3] = (i23 << 1) | (i19 >>> 31);
                long f14 = d7.g.f(j27, j18, j29 >>> 32, j26 & 4294967295L);
                long f15 = d7.g.f(j27, j24, f14 >>> 32, j28 & 4294967295L);
                long j33 = (iArr2[6] & 4294967295L) + (j28 >>> 32) + (f15 >>> 32);
                long j34 = f15 & 4294967295L;
                long j35 = iArr[4] & 4294967295L;
                long j36 = (iArr2[7] & 4294967295L) + (j33 >>> 32);
                long j37 = (iArr2[8] & 4294967295L) + (j36 >>> 32);
                long j38 = j36 & 4294967295L;
                long j39 = (j35 * j13) + (f14 & 4294967295L);
                int i24 = (int) j39;
                iArr2[4] = (i23 >>> 31) | (i24 << 1);
                long f16 = d7.g.f(j35, j18, j39 >>> 32, j34);
                long f17 = d7.g.f(j35, j24, f16 >>> 32, j33 & 4294967295L);
                long j43 = f16 & 4294967295L;
                long f18 = d7.g.f(j35, j27, f17 >>> 32, j38);
                long j44 = f17 & 4294967295L;
                long j45 = j37 + (f18 >>> 32);
                long j46 = f18 & 4294967295L;
                long j47 = iArr[5] & 4294967295L;
                long j48 = (iArr2[9] & 4294967295L) + (j45 >>> 32);
                long j49 = (iArr2[10] & 4294967295L) + (j48 >>> 32);
                long j53 = j48 & 4294967295L;
                long j54 = (j47 * j13) + j43;
                int i25 = (int) j54;
                iArr2[5] = (i25 << 1) | (i24 >>> 31);
                int i26 = i25 >>> 31;
                long f19 = d7.g.f(j47, j18, j54 >>> 32, j44);
                long f23 = d7.g.f(j47, j24, f19 >>> 32, j46);
                long f24 = d7.g.f(j47, j27, f23 >>> 32, j45 & 4294967295L);
                long j55 = f23 & 4294967295L;
                long f25 = d7.g.f(j47, j35, f24 >>> 32, j53);
                long j56 = j49 + (f25 >>> 32);
                long j57 = iArr[6] & 4294967295L;
                long j58 = (iArr2[11] & 4294967295L) + (j56 >>> 32);
                long j59 = j56 & 4294967295L;
                long j63 = (iArr2[12] & 4294967295L) + (j58 >>> 32);
                long j64 = 4294967295L & j58;
                long j65 = (j57 * j13) + (f19 & 4294967295L);
                int i27 = (int) j65;
                iArr2[6] = (i27 << 1) | i26;
                int i28 = i27 >>> 31;
                long f26 = d7.g.f(j57, j18, j65 >>> 32, j55);
                long f27 = d7.g.f(j57, j24, f26 >>> 32, f24 & 4294967295L);
                long f28 = d7.g.f(j57, j27, f27 >>> 32, f25 & 4294967295L);
                long f29 = d7.g.f(j57, j35, f28 >>> 32, j59);
                long f33 = d7.g.f(j57, j47, f29 >>> 32, j64);
                long j66 = j63 + (f33 >>> 32);
                int i29 = (int) f26;
                iArr2[7] = (i29 << 1) | i28;
                int i33 = (int) f27;
                iArr2[8] = (i29 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) f28;
                iArr2[9] = i34 | (i35 << 1);
                int i36 = i35 >>> 31;
                int i37 = (int) f29;
                iArr2[10] = i36 | (i37 << 1);
                int i38 = (int) f33;
                iArr2[11] = (i38 << 1) | (i37 >>> 31);
                int i39 = (int) j66;
                iArr2[12] = (i38 >>> 31) | (i39 << 1);
                iArr2[13] = (i39 >>> 31) | ((iArr2[13] + ((int) (j66 >>> 32))) << 1);
                return;
            }
            i15 = i16;
        }
    }

    public static final ha2.z y0(List list, z9.n nVar, Integer num, String str) {
        HashMap hashMap = new HashMap();
        List list2 = list;
        int i13 = 0;
        for (Object obj : list2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            hashMap.put(Integer.valueOf(i13), (qf1.l0) obj);
            i13 = i14;
        }
        ha2.x xVar = num != null ? new ha2.x(num.intValue(), null, str, null, null, 26) : null;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
        int i15 = 0;
        for (Object obj2 : list2) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            qf1.l0 l0Var = (qf1.l0) obj2;
            int labelResId = l0Var.f103740a.getLabelResId();
            qf1.k0 k0Var = l0Var.f103740a;
            arrayList.add(new ha2.a0(labelResId, i15, null, l0Var.f103741b, null, k0Var.getSubtitleResId(), k0Var.getSubtitleColorResId(), null, null, 916));
            i15 = i16;
        }
        return new ha2.z(xVar, arrayList, new cl0.b(hashMap, nVar, 4));
    }

    public static boolean z(int[] iArr, int[] iArr2) {
        for (int i13 = 6; i13 >= 0; i13--) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static int z0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = (iArr[0] & 4294967295L) - (iArr2[0] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = ((iArr[1] & 4294967295L) - (iArr2[1] & 4294967295L)) + (j13 >> 32);
        iArr3[1] = (int) j14;
        long j15 = ((iArr[2] & 4294967295L) - (iArr2[2] & 4294967295L)) + (j14 >> 32);
        iArr3[2] = (int) j15;
        long j16 = ((iArr[3] & 4294967295L) - (iArr2[3] & 4294967295L)) + (j15 >> 32);
        iArr3[3] = (int) j16;
        long j17 = ((iArr[4] & 4294967295L) - (iArr2[4] & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j17;
        long j18 = ((iArr[5] & 4294967295L) - (iArr2[5] & 4294967295L)) + (j17 >> 32);
        iArr3[5] = (int) j18;
        long j19 = ((iArr[6] & 4294967295L) - (iArr2[6] & 4294967295L)) + (j18 >> 32);
        iArr3[6] = (int) j19;
        return (int) (j19 >> 32);
    }

    @Override // vm.d
    public xm.b A(String str, vm.a aVar, int i13, int i14, Map map) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i13 < 0 || i14 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i13 + 'x' + i14);
        }
        int F = F();
        if (map != null) {
            vm.b bVar = vm.b.MARGIN;
            if (map.containsKey(bVar)) {
                F = Integer.parseInt(map.get(bVar).toString());
            }
        }
        boolean[] y13 = y(str);
        int length = y13.length;
        int i15 = F + length;
        int max = Math.max(i13, i15);
        int max2 = Math.max(1, i14);
        int i16 = max / i15;
        int i17 = (max - (length * i16)) / 2;
        xm.b bVar2 = new xm.b(max, max2);
        int i18 = 0;
        while (i18 < length) {
            if (y13[i18]) {
                bVar2.c(i17, 0, i16, max2);
            }
            i18++;
            i17 += i16;
        }
        return bVar2;
    }

    public int F() {
        return 10;
    }

    public abstract Object p0();

    public /* bridge */ /* synthetic */ void t0(Context context, com.bumptech.glide.b bVar, com.bumptech.glide.j jVar) {
    }

    public abstract boolean[] y(String str);
}
