package kh2;

import ads_mobile_sdk.ci1$$ExternalSyntheticThrowCCEIfNotNull0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.icu.text.DecimalFormatSymbols;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.pinterest.api.model.dl0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.jo0;
import com.pinterest.api.model.js;
import com.pinterest.api.model.rs;
import com.pinterest.api.model.vz0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.buttongroup.GestaltButtonGroup;
import com.pinterest.gestalt.radioGroup.GestaltRadioGroup;
import il.o4;
import java.io.File;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import so.a4;
import so.c8;
import so.d7;
import so.e7;
import so.n5;
import so.p5;
import so.v6;
import x40.uc;

/* loaded from: classes4.dex */
public abstract class r {

    /* renamed from: c, reason: collision with root package name */
    public static String f79662c = "";

    /* renamed from: d, reason: collision with root package name */
    public static String f79663d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f79664e = "";

    /* renamed from: f, reason: collision with root package name */
    public static String f79665f = "";

    /* renamed from: g, reason: collision with root package name */
    public static String f79666g = "";

    /* renamed from: h, reason: collision with root package name */
    public static String f79667h = "";

    public static androidx.lifecycle.l1 A(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (androidx.lifecycle.l1) newInstance;
        } catch (IllegalAccessException e13) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e13);
        } catch (InstantiationException e14) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e14);
        } catch (NoSuchMethodException e15) {
            throw new RuntimeException(a.a.h("Cannot create an instance of ", modelClass), e15);
        }
    }

    public static void A0(iz0.n nVar, ni1.t2 t2Var) {
        nVar.T0 = t2Var;
    }

    public static final Object B(ro2.l lVar, no2.a deserializer) {
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        if (!(deserializer instanceof qo2.b) || lVar.d().f108976a.f109020i) {
            return deserializer.e(lVar);
        }
        String discriminator = w(deserializer.a(), lVar.d());
        ro2.n f13 = lVar.f();
        oo2.g a13 = deserializer.a();
        if (!(f13 instanceof ro2.c0)) {
            StringBuilder sb3 = new StringBuilder("Expected ");
            kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
            sb3.append(l0Var.b(ro2.c0.class));
            sb3.append(" as the serialized body of ");
            sb3.append(a13.i());
            sb3.append(", but had ");
            sb3.append(l0Var.b(f13.getClass()));
            throw j1.h(-1, sb3.toString());
        }
        ro2.c0 element = (ro2.c0) f13;
        ro2.n nVar = (ro2.n) element.get(discriminator);
        String str = null;
        if (nVar != null) {
            ro2.h0 g13 = ro2.o.g(nVar);
            Intrinsics.checkNotNullParameter(g13, "<this>");
            if (!(g13 instanceof ro2.z)) {
                str = g13.b();
            }
        }
        try {
            no2.a deserializer2 = F((qo2.b) deserializer, lVar, str);
            ro2.c d2 = lVar.d();
            Intrinsics.checkNotNullParameter(d2, "<this>");
            Intrinsics.checkNotNullParameter(discriminator, "discriminator");
            Intrinsics.checkNotNullParameter(element, "element");
            Intrinsics.checkNotNullParameter(deserializer2, "deserializer");
            so2.s sVar = new so2.s(d2, element, discriminator, deserializer2.a());
            Intrinsics.checkNotNullParameter(deserializer2, "deserializer");
            return B(sVar, deserializer2);
        } catch (SerializationException e13) {
            String message = e13.getMessage();
            Intrinsics.f(message);
            throw j1.i(-1, message, element.toString());
        }
    }

    public static void B0(am0.b bVar, x02.i2 i2Var) {
        bVar.Z0 = i2Var;
    }

    public static final Matrix C(nm.q qVar) {
        float[] fArr = new float[9];
        int i13 = 0;
        for (int i14 = 0; i14 < 9; i14++) {
            fArr[i14] = 0.0f;
        }
        Iterator it = qVar.f91364a.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i15 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            nm.s sVar = (nm.s) next;
            if (i13 < 9) {
                fArr[i13] = sVar.d();
            }
            i13 = i15;
        }
        Matrix matrix = new Matrix();
        matrix.setValues(fArr);
        return matrix;
    }

    public static void C0(cp.f fVar, x02.i2 i2Var) {
        fVar.Y0 = i2Var;
    }

    public static boolean D(int[] iArr, int[] iArr2, int[] iArr3) {
        boolean z13;
        int i13 = 5;
        while (true) {
            z13 = true;
            if (i13 < 0) {
                break;
            }
            int i14 = iArr[6 + i13] ^ Integer.MIN_VALUE;
            int i15 = Integer.MIN_VALUE ^ iArr2[i13];
            if (i14 < i15) {
                z13 = false;
                break;
            }
            if (i14 > i15) {
                break;
            }
            i13--;
        }
        if (z13) {
            q1(iArr, 6, iArr2, 0, iArr3);
        } else {
            q1(iArr2, 0, iArr, 6, iArr3);
        }
        return z13;
    }

    public static void D0(h90.r rVar, x02.i2 i2Var) {
        rVar.Q0 = i2Var;
    }

    public static boolean E(int[] iArr, int[] iArr2) {
        for (int i13 = 5; i13 >= 0; i13--) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static void E0(lq0.o0 o0Var, x02.i2 i2Var) {
        o0Var.f84403z0 = i2Var;
    }

    public static final no2.a F(qo2.b bVar, po2.a decoder, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        no2.a f13 = bVar.f(decoder, str);
        if (f13 != null) {
            return f13;
        }
        kg.n.j(str, bVar.h());
        throw null;
    }

    public static void F0(lq0.o0 o0Var, lb0.q qVar) {
        o0Var.H0 = qVar;
    }

    public static final no2.h G(qo2.b bVar, po2.d encoder, Object value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        no2.h g13 = bVar.g(encoder, value);
        if (g13 != null) {
            return g13;
        }
        rl2.d subClass = kotlin.jvm.internal.k0.f80436a.b(value.getClass());
        rl2.d baseClass = bVar.h();
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String f13 = subClass.f();
        if (f13 == null) {
            f13 = String.valueOf(subClass);
        }
        kg.n.j(f13, baseClass);
        throw null;
    }

    public static void G0(e81.d dVar, a4 a4Var) {
        dVar.f57763j0 = a4Var;
    }

    public static int[] H(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[6];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i13] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i13++;
        }
        return iArr;
    }

    public static void H0(su0.i iVar, c8 c8Var) {
        iVar.B0 = c8Var;
    }

    public static long[] I(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 192) {
            throw new IllegalArgumentException();
        }
        long[] jArr = new long[3];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            jArr[i13] = bigInteger.longValue();
            bigInteger = bigInteger.shiftRight(64);
            i13++;
        }
        return jArr;
    }

    public static void I0(yq1.l2 l2Var, so.k0 k0Var) {
        l2Var.f139904j0 = k0Var;
    }

    public static byte[] J() {
        byte[] s13 = jk.r.s(32);
        s13[0] = (byte) (s13[0] | 7);
        byte b13 = (byte) (s13[31] & 63);
        s13[31] = b13;
        s13[31] = (byte) (b13 | 128);
        return s13;
    }

    public static void J0(am0.b bVar, uk1.e eVar) {
        bVar.f15517a1 = eVar;
    }

    public static int K(int[] iArr) {
        return iArr[0] & 1;
    }

    public static void K0(cp.f fVar, uk1.e eVar) {
        fVar.X0 = eVar;
    }

    public static final int L() {
        return hf0.b.f69002b;
    }

    public static void L0(e81.d dVar, uk1.e eVar) {
        dVar.N0 = eVar;
    }

    public static String M(wy0 user, yk1.v resources, qb0.f formatter) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        Integer V2 = user.V2();
        Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
        int intValue = V2.intValue();
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(formatter, "formatter");
        String quantityString = ((yk1.a) resources).f139224a.getQuantityString(m60.w0.plural_followers_only_lowercase, intValue, new Object[0]);
        ((qb0.a) formatter).getClass();
        return a.a.D(qb0.j.b(intValue), " ", quantityString);
    }

    public static void M0(h90.r rVar, uk1.e eVar) {
        rVar.L0 = eVar;
    }

    public static DecimalFormatSymbols N(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static void N0(yq1.l2 l2Var, uk1.e eVar) {
        l2Var.f139905k0 = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final View O(ViewParent viewParent) {
        Intrinsics.checkNotNullParameter(viewParent, "<this>");
        if (viewParent instanceof RecyclerView) {
            return (View) viewParent;
        }
        if (viewParent.getParent() == null) {
            return null;
        }
        ViewParent parent = viewParent.getParent();
        Intrinsics.checkNotNullExpressionValue(parent, "getParent(...)");
        return O(parent);
    }

    public static void O0(zw1.c cVar, uk1.e eVar) {
        cVar.f142944k0 = eVar;
    }

    public static final List P(vz0 vz0Var) {
        Object obj;
        Intrinsics.checkNotNullParameter(vz0Var, "<this>");
        if (vz0Var.j() == null) {
            return kotlin.collections.q0.f80391a;
        }
        rs j13 = vz0Var.j();
        List h10 = j13 != null ? j13.h() : null;
        if (h10 == null) {
            h10 = kotlin.collections.q0.f80391a;
        }
        rs j14 = vz0Var.j();
        List k13 = j14 != null ? j14.k() : null;
        if (k13 == null) {
            k13 = kotlin.collections.q0.f80391a;
        }
        List<String> M = CollectionsKt.M(k13);
        ArrayList arrayList = new ArrayList();
        for (String str : M) {
            Iterator it = h10.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((js) obj).f(), str)) {
                    break;
                }
            }
            js jsVar = (js) obj;
            if (jsVar != null) {
                arrayList.add(jsVar);
            }
        }
        return arrayList;
    }

    public static void P0(iz0.n nVar, e01.a aVar) {
        nVar.L0 = aVar;
    }

    public static int Q(re0.a aVar, Resources resources) {
        switch (re0.b.f107536a[aVar.ordinal()]) {
            case 1:
                return resources.getDimensionPixelSize(eo1.c.image_size_xsmall_in_dp);
            case 2:
                return resources.getDimensionPixelSize(eo1.c.image_size_small_in_dp);
            case 3:
                return resources.getDimensionPixelSize(eo1.c.image_size_medium_in_dp);
            case 4:
                return resources.getDimensionPixelSize(eo1.c.image_size_lego_medium_in_dp);
            case 5:
                return resources.getDimensionPixelSize(eo1.c.image_size_large_in_dp);
            case 6:
                return resources.getDimensionPixelSize(eo1.c.image_size_xlarge_in_dp);
            case 7:
                return resources.getDimensionPixelSize(eo1.c.image_size_xxlarge_in_dp);
            case 8:
                return resources.getDimensionPixelSize(eo1.c.image_size_xxxlarge_in_dp);
            case 9:
                return resources.getDimensionPixelSize(eo1.c.image_size_lego_attribution);
            case 10:
                return resources.getDimensionPixelSize(eo1.c.lego_image_width_default);
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                return -1;
            default:
                throw new IllegalStateException("ImageSize not valid");
        }
    }

    public static void Q0(tv0.j jVar, dl1.t tVar) {
        jVar.f119534k0 = tVar;
    }

    public static boolean R(int[] iArr, int[] iArr2) {
        for (int i13 = 5; i13 >= 0; i13--) {
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

    public static void R0(cp.f fVar, k22.m mVar) {
        fVar.W0 = mVar;
    }

    public static final boolean S(vz0 vz0Var) {
        List k13;
        Intrinsics.checkNotNullParameter(vz0Var, "<this>");
        rs j13 = vz0Var.j();
        return (j13 == null || (k13 = j13.k()) == null || !(k13.isEmpty() ^ true)) ? false : true;
    }

    public static void S0(h90.r rVar, nr0.t tVar) {
        rVar.N0 = tVar;
    }

    public static void T(lq0.o0 o0Var, g70.h hVar) {
        o0Var.K0 = hVar;
    }

    public static void T0(h90.r rVar, yk1.v vVar) {
        rVar.M0 = vVar;
    }

    public static void U(lq0.o0 o0Var, e12.d dVar) {
        o0Var.G0 = dVar;
    }

    public static void U0(lq0.o0 o0Var, e7 e7Var) {
        o0Var.C0 = e7Var;
    }

    public static void V(h90.r rVar, pb0.a aVar) {
        rVar.R0 = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean V0(ul2.b1 b1Var) {
        Intrinsics.checkNotNullParameter(b1Var, "<this>");
        if (b1Var instanceof rl2.m) {
            Field l13 = he2.k.l(b1Var);
            if (l13 != null && !l13.isAccessible()) {
                return false;
            }
            Intrinsics.checkNotNullParameter(b1Var, "<this>");
            Method m13 = he2.k.m(b1Var.x());
            if (m13 != null && !m13.isAccessible()) {
                return false;
            }
            rl2.m mVar = (rl2.m) b1Var;
            Intrinsics.checkNotNullParameter(mVar, "<this>");
            Method m14 = he2.k.m(mVar.getSetter());
            if (m14 != null && !m14.isAccessible()) {
                return false;
            }
        } else {
            Field l14 = he2.k.l(b1Var);
            if (l14 != null && !l14.isAccessible()) {
                return false;
            }
            Intrinsics.checkNotNullParameter(b1Var, "<this>");
            Method m15 = he2.k.m(b1Var.x());
            if (m15 != null && !m15.isAccessible()) {
                return false;
            }
        }
        return true;
    }

    public static void W(h90.r rVar, np0.d dVar) {
        rVar.P0 = dVar;
    }

    public static final boolean W0(z40.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return ((uc) fVar).f133470g != null;
    }

    public static void X(h90.r rVar, nx.k kVar) {
        rVar.S0 = kVar;
    }

    public static boolean X0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 6; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void Y(cp.f fVar, v6 v6Var) {
        fVar.R0 = v6Var;
    }

    public static boolean Y0(long[] jArr) {
        if (jArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 3; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void Z(cp.f fVar, no1.d dVar) {
        fVar.V0 = dVar;
    }

    public static final boolean Z0(gm1.c cVar, GestaltButtonGroup buttonGroup) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        return (cVar instanceof xl1.a) && cVar.j() == buttonGroup.d().f28012a.f139308i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x023c A[LOOP:2: B:154:0x023a->B:155:0x023c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(j1.g2 r23, u2.q r24, kotlin.jvm.functions.Function1 r25, u2.e r26, kotlin.jvm.functions.Function1 r27, kl2.m r28, i2.o r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 1081
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.a(j1.g2, u2.q, kotlin.jvm.functions.Function1, u2.e, kotlin.jvm.functions.Function1, kl2.m, i2.o, int, int):void");
    }

    public static void a0(cp.f fVar, p12.b bVar) {
        fVar.U0 = bVar;
    }

    public static final boolean a1(gm1.c cVar, GestaltButtonGroup buttonGroup) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(buttonGroup, "buttonGroup");
        return (cVar instanceof xl1.a) && cVar.j() == buttonGroup.d().f28013b.f139308i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(java.lang.Object r18, u2.q r19, kotlin.jvm.functions.Function1 r20, u2.e r21, java.lang.String r22, kotlin.jvm.functions.Function1 r23, kl2.m r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.b(java.lang.Object, u2.q, kotlin.jvm.functions.Function1, u2.e, java.lang.String, kotlin.jvm.functions.Function1, kl2.m, i2.o, int, int):void");
    }

    public static void b0(cp.f fVar, kp.m mVar) {
        fVar.S0 = mVar;
    }

    public static boolean b1(int[] iArr) {
        for (int i13 = 0; i13 < 6; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final void c(ra0.u state, u2.q qVar, Function0 function0, Function0 function02, Function1 function1, ra0.v vVar, i2.o oVar, int i13, int i14) {
        ra0.v toHeight;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1165570077);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function0 function03 = (i14 & 4) != 0 ? ra0.n.f106969i : function0;
        Function0 function04 = (i14 & 8) != 0 ? ra0.o.f106974i : function02;
        Function1 function12 = (i14 & 16) != 0 ? ra0.p.f106976i : function1;
        if ((i14 & 32) != 0) {
            float f13 = ra0.h0.f106929a;
            toHeight = ra0.h0.b(null, sVar, 262144, 31);
        } else {
            toHeight = vVar;
        }
        r1.p0 a13 = r1.q0.a(sVar);
        sVar.W(-1295854149);
        Iterator it = state.f107006a.iterator();
        int i15 = 0;
        while (true) {
            if (!it.hasNext()) {
                i15 = -1;
                break;
            } else if (f0.h.h0((ra0.z) it.next(), state.f107007b, sVar)) {
                break;
            } else {
                i15++;
            }
        }
        sVar.r(false);
        sVar.W(-1295851176);
        am.d dVar = i2.n.f71185a;
        if (i15 > 0) {
            Integer valueOf = Integer.valueOf(i15);
            sVar.W(-1295849229);
            boolean h10 = sVar.h(a13) | sVar.f(i15);
            Object J2 = sVar.J();
            if (h10 || J2 == dVar) {
                J2 = new ra0.q(a13, i15, null);
                sVar.g0(J2);
            }
            sVar.r(false);
            i2.u.e(valueOf, (Function2) J2, sVar);
        }
        sVar.r(false);
        r1.b bVar = new r1.b(toHeight.f107013b);
        float f14 = ra0.h0.f106929a;
        Intrinsics.checkNotNullParameter(toHeight, "$this$toHeight");
        sVar.W(-1573576563);
        float d2 = ra0.h0.d(toHeight.f107012a, sVar, 64);
        sVar.W(-1449205016);
        boolean e13 = sVar.e(d2);
        Object J3 = sVar.J();
        float f15 = toHeight.f107014c;
        if (e13 || J3 == dVar) {
            J3 = new n4.e(((r0 - 1) * f15) + (d2 * toHeight.f107013b));
            sVar.g0(J3);
        }
        float f16 = ((n4.e) J3).f89175a;
        sVar.r(false);
        sVar.r(false);
        u2.q c13 = androidx.compose.foundation.layout.e.c(qVar2, f16);
        p1.g gVar = p1.l.f98543a;
        ra0.v vVar2 = toHeight;
        u2.q qVar3 = qVar2;
        bp1.h.b(0, 400, null, p1.l.g(toHeight.f107015d), p1.l.g(f15), toHeight.f107016e, bVar, a13, sVar, c13, new e.c(state, toHeight, function03, function04, function12, 10), false, false);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1.n(state, qVar3, function03, function04, function12, vVar2, i13, i14);
        }
    }

    public static void c0(lq0.o0 o0Var, no1.e eVar) {
        o0Var.F0 = eVar;
    }

    public static boolean c1(long[] jArr) {
        for (int i13 = 0; i13 < 3; i13++) {
            if (jArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x0239, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r0.J(), java.lang.Integer.valueOf(r11)) == false) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(ra0.z r21, boolean r22, u2.q r23, kotlin.jvm.functions.Function0 r24, ra0.a0 r25, boolean r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.d(ra0.z, boolean, u2.q, kotlin.jvm.functions.Function0, ra0.a0, boolean, i2.o, int, int):void");
    }

    public static void d0(lq0.o0 o0Var) {
        o0Var.getClass();
    }

    public static void d1(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr2[5] & 4294967295L;
        long j19 = iArr[0] & 4294967295L;
        long j23 = j19 * j13;
        iArr3[0] = (int) j23;
        long j24 = (j19 * j14) + (j23 >>> 32);
        iArr3[1] = (int) j24;
        long j25 = (j19 * j15) + (j24 >>> 32);
        iArr3[2] = (int) j25;
        long j26 = (j19 * j16) + (j25 >>> 32);
        iArr3[3] = (int) j26;
        long j27 = (j19 * j17) + (j26 >>> 32);
        iArr3[4] = (int) j27;
        long j28 = (j19 * j18) + (j27 >>> 32);
        iArr3[5] = (int) j28;
        iArr3[6] = (int) (j28 >>> 32);
        int i13 = 1;
        for (int i14 = 6; i13 < i14; i14 = 6) {
            long j29 = iArr[i13] & 4294967295L;
            long j33 = j13;
            long j34 = (j29 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j34;
            int i15 = i13 + 1;
            long j35 = (j29 * j14) + (iArr3[i15] & 4294967295L) + (j34 >>> 32);
            iArr3[i15] = (int) j35;
            long j36 = j14;
            long j37 = (j29 * j15) + (iArr3[r18] & 4294967295L) + (j35 >>> 32);
            iArr3[i13 + 2] = (int) j37;
            long j38 = (j29 * j16) + (iArr3[r6] & 4294967295L) + (j37 >>> 32);
            iArr3[i13 + 3] = (int) j38;
            long j39 = (j29 * j17) + (iArr3[r6] & 4294967295L) + (j38 >>> 32);
            iArr3[i13 + 4] = (int) j39;
            long j43 = j39 >>> 32;
            long j44 = (j29 * j18) + (iArr3[r3] & 4294967295L) + j43;
            iArr3[i13 + 5] = (int) j44;
            iArr3[i13 + 6] = (int) (j44 >>> 32);
            j13 = j33;
            i13 = i15;
            j14 = j36;
        }
    }

    public static final void e(uc0.d1 d1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(351248891);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(d1Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.d1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                d1Var = (uc0.d1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(d1Var.f121825e, sVar);
            d1Var.i(new uc0.i(new oc0.a(q2.i.c(-302049229, new androidx.compose.foundation.lazy.layout.v(18, z13, d1Var), sVar))));
            gh0.b.d(((uc0.c1) z13.getValue()).f121766b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(d1Var, i13, i14, 13);
        }
    }

    public static void e0(lq0.o0 o0Var, r12.a aVar) {
        o0Var.L0 = aVar;
    }

    public static int e1(int[] iArr, int[] iArr2, int[] iArr3) {
        int i13 = 0;
        long j13 = 4294967295L;
        long j14 = iArr2[0] & 4294967295L;
        long j15 = iArr2[1] & 4294967295L;
        long j16 = iArr2[2] & 4294967295L;
        long j17 = iArr2[3] & 4294967295L;
        long j18 = iArr2[4] & 4294967295L;
        long j19 = iArr2[5] & 4294967295L;
        long j23 = 0;
        while (i13 < 6) {
            long j24 = j19;
            long j25 = iArr[i13] & j13;
            long j26 = j14;
            long j27 = (iArr3[i13] & j13) + (j25 * j14);
            iArr3[i13] = (int) j27;
            int i14 = i13 + 1;
            long j28 = (j25 * j15) + (iArr3[i14] & j13) + (j27 >>> 32);
            iArr3[i14] = (int) j28;
            long j29 = (j25 * j16) + (iArr3[r6] & j13) + (j28 >>> 32);
            iArr3[i13 + 2] = (int) j29;
            long j33 = (j25 * j17) + (iArr3[r6] & j13) + (j29 >>> 32);
            iArr3[i13 + 3] = (int) j33;
            long j34 = (j25 * j18) + (iArr3[r6] & j13) + (j33 >>> 32);
            iArr3[i13 + 4] = (int) j34;
            long j35 = (j25 * j24) + (iArr3[r6] & j13) + (j34 >>> 32);
            iArr3[i13 + 5] = (int) j35;
            long j36 = j23 + (iArr3[r0] & j13) + (j35 >>> 32);
            iArr3[i13 + 6] = (int) j36;
            j23 = j36 >>> 32;
            i13 = i14;
            j19 = j24;
            j14 = j26;
            j15 = j15;
            j13 = 4294967295L;
        }
        return (int) j23;
    }

    public static final r72.u1 f(File file, int i13, int i14) {
        int i15 = com.pinterest.shuffles.scene.composer.z.f52181a;
        Size n13 = ig1.b.n1(com.pinterest.shuffles.scene.composer.z.a(i13, i14, i15, Integer.MAX_VALUE));
        r72.x0 x0Var = r72.x0.f106703e;
        String uri = Uri.fromFile(file).toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        r72.x0 a13 = r72.x0.a(x0Var, new r72.y0(uri, n13.getWidth(), n13.getHeight(), i15), null, 14);
        r72.u1 u1Var = r72.u1.f106668t;
        int i16 = r72.a2.f106437b;
        return r72.u1.f(u1Var, gi2.b.c0(), null, 0.0d, 0.0d, null, a13, null, null, null, null, null, null, null, 262110);
    }

    public static void f0(lq0.o0 o0Var, d7 d7Var) {
        o0Var.B0 = d7Var;
    }

    public static uk.q f1(byte[] bArr) {
        try {
            o4 I = o4.I(bArr, com.google.crypto.tink.shaded.protobuf.u.a());
            el.h0 h0Var = el.h0.f59491b;
            ml.a a13 = el.c1.a(I.F());
            el.v0 v0Var = new el.v0(I, a13);
            el.a1 a1Var = (el.a1) h0Var.f59492a.get();
            a1Var.getClass();
            return !a1Var.f59456d.containsKey(new el.y0(el.v0.class, a13)) ? new el.u(v0Var) : h0Var.b(v0Var);
        } catch (IOException e13) {
            throw new GeneralSecurityException("Failed to parse proto", e13);
        }
    }

    public static final void g(String str, String str2) {
        HashSet hashSet = tb0.h.f117076w;
        tb0.h hVar = tb0.g.f117075a;
        tb0.k kVar = new tb0.k();
        kVar.c("ErrorType", str);
        kVar.c("Message", str2);
        hVar.k("PushTokenRegistrationError", kVar.f117102a);
    }

    public static void g0(lq0.o0 o0Var, q12.b bVar) {
        o0Var.D0 = bVar;
    }

    public static final void g1(v2.a aVar, SparseArray sparseArray) {
        int size = sparseArray.size();
        for (int i13 = 0; i13 < size; i13++) {
            int keyAt = sparseArray.keyAt(i13);
            AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
            v2.c cVar = v2.c.f123849a;
            if (cVar.d(autofillValue)) {
                cVar.i(autofillValue).toString();
                ep.b.A(aVar.f123846b.f123851a.get(Integer.valueOf(keyAt)));
            } else {
                if (cVar.b(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for date", "message");
                    throw new xk2.o("An operation is not implemented: b/138604541: Add onFill() callback for date");
                }
                if (cVar.c(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541: Add onFill() callback for list", "message");
                    throw new xk2.o("An operation is not implemented: b/138604541: Add onFill() callback for list");
                }
                if (cVar.e(autofillValue)) {
                    Intrinsics.checkNotNullParameter("An operation is not implemented: b/138604541:  Add onFill() callback for toggle", "message");
                    throw new xk2.o("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public static final u2.p h(s3.m mVar, int i13) {
        u2.p pVar = ((u2.p) mVar).f120042a.f120047f;
        if (pVar == null || (pVar.f120045d & i13) == 0) {
            return null;
        }
        while (pVar != null) {
            int i14 = pVar.f120044c;
            if ((i14 & 2) != 0) {
                return null;
            }
            if ((i14 & i13) != 0) {
                return pVar;
            }
            pVar = pVar.f120047f;
        }
        return null;
    }

    public static void h0(tv0.j jVar, ag1.b bVar) {
        jVar.f119535l0 = bVar;
    }

    public static final void h1(v2.a aVar, ViewStructure viewStructure) {
        v2.b bVar = v2.b.f123848a;
        v2.e eVar = aVar.f123846b;
        int a13 = bVar.a(viewStructure, eVar.f123851a.size());
        for (Map.Entry entry : eVar.f123851a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            ci1$$ExternalSyntheticThrowCCEIfNotNull0.m(entry.getValue());
            ViewStructure b13 = bVar.b(viewStructure, a13);
            if (b13 != null) {
                v2.c cVar = v2.c.f123849a;
                AutofillId a14 = cVar.a(viewStructure);
                Intrinsics.f(a14);
                cVar.g(b13, a14, intValue);
                bVar.d(b13, intValue, aVar.f123845a.getContext().getPackageName(), null, null);
                cVar.h(b13, 1);
                throw null;
            }
            a13++;
        }
    }

    public static final void i(no2.h hVar, no2.h hVar2, String str) {
        if (hVar instanceof no2.f) {
            oo2.g a13 = hVar2.a();
            Intrinsics.checkNotNullParameter(a13, "<this>");
            if (qo2.w0.a(a13).contains(str)) {
                StringBuilder w13 = a.a.w("Sealed class '", hVar2.a().i(), "' cannot be serialized as base class '", hVar.a().i(), "' because it has property name that conflicts with JSON class discriminator '");
                w13.append(str);
                w13.append("'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                throw new IllegalStateException(w13.toString().toString());
            }
        }
    }

    public static void i0(cp.f fVar, fp.b bVar) {
        fVar.T0 = bVar;
    }

    public static byte[] i1(byte[] bArr) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        byte[] bArr2 = new byte[32];
        bArr2[0] = 9;
        return x(bArr, bArr2);
    }

    public static int j(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j18 >>> 32);
    }

    public static void j0(am0.b bVar, m60.f0 f0Var) {
        bVar.Y0 = f0Var;
    }

    public static final n4.i j1(a3.d dVar) {
        return new n4.i(Math.round(dVar.f484a), Math.round(dVar.f485b), Math.round(dVar.f486c), Math.round(dVar.f487d));
    }

    public static void k(x92.b bVar) {
        n60.o.w(bVar, "conversationmessage.id", "conversationmessage.text", "conversationmessage.created_at", "conversationmessage.pin()");
        n60.o.w(bVar, "conversationmessage.pins()", "pin.rich_summary()", "conversationmessage.board()", "conversationmessage.user()");
        n60.o.w(bVar, "conversationmessage.sender()", "conversationmessage.type", "conversationmessage.message_type", "conversationmessage.user_did_it_data()");
        n60.o.w(bVar, "userdiditdata.id", "userdiditdata.details", "userdiditdata.pin()", "userdiditdata.user()");
        n60.o.A(bVar, "userdiditdata.images", "1080x", "conversation.read_times_ms", "conversationmessage.reactions");
        bVar.e("conversationmessage.deleted_by");
    }

    public static void k0(zw1.c cVar) {
        cVar.getClass();
    }

    public static byte[] k1(uk.q qVar) {
        return qVar instanceof el.u ? ((el.u) qVar).f59536a.f59546b.d() : ((el.v0) el.h0.f59491b.h(qVar)).f59546b.d();
    }

    public static int l(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j18 >>> 32);
    }

    public static void l0(h90.r rVar, lh0.e0 e0Var) {
        rVar.U0 = e0Var;
    }

    public static String l1(String str) {
        if (str == null) {
            return null;
        }
        return str.length() <= 16 ? str : a.a.C(kotlin.text.e0.C(16, str), "...");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0235, code lost:
    
        if (((lh0.g1) r13).o("ce_android_community_insights_v2", "pwt_control", r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0242, code lost:
    
        r30.e("pin.has_displayable_community_content");
        r30.e("pin.top_community_insight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0248, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0263, code lost:
    
        if (r15.g("ce_android_style_decoder", r5) == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0265, code lost:
    
        n60.o.w(r30, "pin.has_displayable_community_content", "pin.top_community_insight", "pin.pear_styles()", "pearstyle.id");
        n60.o.v(r30, "pearstyle.title", "pearstyle.vertical", "pearstyle.category");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x026b, code lost:
    
        n60.o.w(r30, "pin.user_mention_tags", "aggregatedpindata.has_xy_tags", "user.allow_idea_pin_downloads", "pin.formatted_description");
        r30.e("pin.is_call_to_create");
        r30.e("pin.is_go_linkless");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0284, code lost:
    
        if (r31 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0286, code lost:
    
        n60.o.w(r30, "pin.is_promoted", "pin.ad_data()", "pin.is_eligible_for_aggregated_comments", "pin.promoted_is_removable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0291, code lost:
    
        n60.o.w(r30, "richpinproductmetadata.id", "richpinproductmetadata.name", "richpinproductmetadata.type", "richpinproductmetadata.offer_summary");
        n60.o.w(r30, "richpinproductmetadata.label_info", "richpinproductmetadata.offers", "richpinproductmetadata.shipping_info", "richpinproductmetadata.additional_images");
        n60.o.w(r30, "richpinproductmetadata.item_id", "richpinproductmetadata.item_set_id", "richpinproductmetadata.has_multi_images", "richpinproductmetadata.brand");
        r30.e("pin.is_translatable");
        r30.e("user.comments_disabled");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("pwt", "group");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x02cb, code lost:
    
        if (((lh0.g1) r13).o("android_closeup_pear_styles", "pwt", r5) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x02cd, code lost:
    
        r15.c("android_closeup_pear_styles");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x02d0, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02d7, code lost:
    
        if (r15.g("android_closeup_pear_styles", r5) == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x02d9, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter("pwt_control", "group");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x02e6, code lost:
    
        if (((lh0.g1) r13).o("android_closeup_pear_styles", "pwt_control", r5) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x02e8, code lost:
    
        n60.o.w(r30, "pin.pear_styles()", "pearstyle.id", "pearstyle.title", "pearstyle.vertical");
        r30.e("pearstyle.category");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x02f0, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x02f9, code lost:
    
        if (r15.g("ce_android_pin_activity_in_closeup", r5) == null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x02fb, code lost:
    
        n60.o.v(r30, "pin.social_insight_pear_styles()", "socialinsightpearstyle.title", "socialinsightpearstyle.vertical");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0304, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x030d, code lost:
    
        if (r15.g("ce_android_activity_on_pins_insight_l2", r5) == null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0342, code lost:
    
        r30.e("pin.top_community_insight");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0345, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x034e, code lost:
    
        if (r15.g("closeup_efficient_refinement_android", r5) == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0350, code lost:
    
        r30.e("pin.is_eligible_for_related_pins_tabs");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0355, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x035e, code lost:
    
        if (r15.g("android_closeup_shopping_refinements", r5) == null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0360, code lost:
    
        r30.e("pin.is_eligible_for_closeup_one_bar_refinements");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0365, code lost:
    
        r1 = n00.v.f88794a;
        bz.h.e(r30);
        r30.e("board.is_featured_for_active_campaign");
        r30.e("pin.digital_media_source_type_label");
        r1 = lh0.a4.f83298b;
        r13 = (lh0.g1) r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0380, code lost:
    
        if (r13.o("android_waista_genai_async", "enabled", r1) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0386, code lost:
    
        if (r13.l("android_waista_genai_async") == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0393, code lost:
    
        if (r15.o("android_ctx_affiliate_disclaimer", "enabled", r1) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0399, code lost:
    
        if (r15.l("android_ctx_affiliate_disclaimer") == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03a0, code lost:
    
        n60.o.w(r30, "pin.ad_destination_url", "pin.promoted_android_deep_link", "pin.ad_targeting_attribution()", "pin.promoter()");
        r1 = n00.d.f88768a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03b1, code lost:
    
        if (bz.h.k(r2) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03b3, code lost:
    
        n60.o.w(r30, "pin.collection_pin()", "collectionpin.root_pin_id", "collectionpin.item_data", "collectionpinitem.pin_id");
        n60.o.w(r30, "collectionpinitem.item_id", "collectionpinitem.images", "collectionpinitem.title", "collectionpinitem.link");
        n60.o.w(r30, "collectionpinitem.dominant_color", "collectionpinitem.image_signature", "collectionpinitem.price_value", "collectionpinitem.price_currency");
        n60.o.w(r30, "collectionpin.catalog_collection_type", "collectionpin.slideshow_collections_aspect_ratio", "collectionpin.is_dynamic_collections", "collectionpin.collections_header_text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03df, code lost:
    
        n60.o.w(r30, "pin.ad_group_id", "pin.call_to_action_text", "pin.promoted_quiz_pin_data", "pin.promoted_is_quiz");
        n60.o.w(r30, "pin.promoted_is_sideswipe_disabled", "pin.promoted_is_auto_assembled", "pin.dpa_creative_type", "pin.promoted_is_showcase");
        r30.e("pin.is_premiere");
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03fa, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x039b, code lost:
    
        r30.e("pin.affiliate_link");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0388, code lost:
    
        r30.e("pin.digital_media_source_type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0312, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x031b, code lost:
    
        if (r15.g("ce_android_activity_on_pins_insight_trending", r5) == null) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x031e, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0327, code lost:
    
        if (r15.g("ce_android_activity_on_pins_insight_user_cohorts", r5) == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x032a, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0333, code lost:
    
        if (r15.g("ce_android_activity_on_pins_insight_rare_find", r5) == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0336, code lost:
    
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, "activate");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x033f, code lost:
    
        if (r15.g("ce_android_activity_on_pins_insight_encourage_actions", r5) == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0240, code lost:
    
        if (r15.g("ce_android_timely_insight_v2", r5) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(x92.b r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1026
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.r.m(x92.b, boolean):void");
    }

    public static void m0(lq0.o0 o0Var, lh0.p0 p0Var) {
        o0Var.I0 = p0Var;
    }

    public static final boolean m1(f30 pin) {
        jo0 q13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (!n1(pin)) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            dl0 v63 = pin.v6();
            if (v63 == null || (q13 = v63.q()) == null || j1.T(q13, "0.8.0") < 0) {
                return false;
            }
        }
        return true;
    }

    public static int n(int i13, int i14, int i15, int[] iArr, int[] iArr2) {
        long j13 = (iArr[i13] & 4294967295L) + (iArr2[i14] & 4294967295L) + (i15 & 4294967295L);
        iArr2[i14] = (int) j13;
        long j14 = (iArr[i13 + 1] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j13 >>> 32);
        iArr2[i14 + 1] = (int) j14;
        long j15 = (iArr[i13 + 2] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j14 >>> 32);
        iArr2[i14 + 2] = (int) j15;
        long j16 = (iArr[i13 + 3] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j15 >>> 32);
        iArr2[i14 + 3] = (int) j16;
        long j17 = (iArr[i13 + 4] & 4294967295L) + (iArr2[r6] & 4294967295L) + (j16 >>> 32);
        iArr2[i14 + 4] = (int) j17;
        long j18 = (iArr[i13 + 5] & 4294967295L) + (4294967295L & iArr2[r10]) + (j17 >>> 32);
        iArr2[i14 + 5] = (int) j18;
        return (int) (j18 >>> 32);
    }

    public static void n0(lt.d dVar, lh0.g gVar) {
        dVar.f84736d0 = gVar;
    }

    public static final boolean n1(f30 pin) {
        jo0 q13;
        Intrinsics.checkNotNullParameter(pin, "pin");
        dl0 v63 = pin.v6();
        return (v63 == null || (q13 = v63.q()) == null || j1.T(q13, "0.7.0") != 0) ? false : true;
    }

    public static int o(int[] iArr, int[] iArr2) {
        long j13 = (iArr[6] & 4294967295L) + (iArr2[12] & 4294967295L);
        int i13 = (int) j13;
        iArr[6] = i13;
        iArr2[12] = i13;
        long j14 = (iArr[7] & 4294967295L) + (iArr2[13] & 4294967295L) + (j13 >>> 32);
        int i14 = (int) j14;
        iArr[7] = i14;
        iArr2[13] = i14;
        long j15 = (iArr[8] & 4294967295L) + (iArr2[14] & 4294967295L) + (j14 >>> 32);
        int i15 = (int) j15;
        iArr[8] = i15;
        iArr2[14] = i15;
        long j16 = (iArr[9] & 4294967295L) + (iArr2[15] & 4294967295L) + (j15 >>> 32);
        int i16 = (int) j16;
        iArr[9] = i16;
        iArr2[15] = i16;
        long j17 = (iArr[10] & 4294967295L) + (iArr2[16] & 4294967295L) + (j16 >>> 32);
        int i17 = (int) j17;
        iArr[10] = i17;
        iArr2[16] = i17;
        long j18 = (iArr[11] & 4294967295L) + (4294967295L & iArr2[17]) + (j17 >>> 32);
        int i18 = (int) j18;
        iArr[11] = i18;
        iArr2[17] = i18;
        return (int) (j18 >>> 32);
    }

    public static void o0(yq1.l2 l2Var, lh0.y1 y1Var) {
        l2Var.f139906l0 = y1Var;
    }

    public static void o1(int[] iArr, int[] iArr2) {
        long j13 = iArr[0] & 4294967295L;
        int i13 = 12;
        int i14 = 0;
        int i15 = 5;
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
                long j29 = j26 & 4294967295L;
                long j33 = (iArr2[6] & 4294967295L) + (j28 >>> 32);
                long j34 = (j27 * j13) + (f13 & 4294967295L);
                int i23 = (int) j34;
                iArr2[3] = (i23 << 1) | (i19 >>> 31);
                long f14 = d7.g.f(j27, j18, j34 >>> 32, j29);
                long f15 = d7.g.f(j27, j24, f14 >>> 32, j28 & 4294967295L);
                long j35 = j33 + (f15 >>> 32);
                long j36 = f15 & 4294967295L;
                long j37 = iArr[4] & 4294967295L;
                long j38 = (iArr2[7] & 4294967295L) + (j35 >>> 32);
                long j39 = j35 & 4294967295L;
                long j43 = (iArr2[8] & 4294967295L) + (j38 >>> 32);
                long j44 = j38 & 4294967295L;
                long j45 = (j37 * j13) + (f14 & 4294967295L);
                int i24 = (int) j45;
                iArr2[4] = (i24 << 1) | (i23 >>> 31);
                int i25 = i24 >>> 31;
                long f16 = d7.g.f(j37, j18, j45 >>> 32, j36);
                long f17 = d7.g.f(j37, j24, f16 >>> 32, j39);
                long f18 = d7.g.f(j37, j27, f17 >>> 32, j44);
                long j46 = f17 & 4294967295L;
                long j47 = j43 + (f18 >>> 32);
                long j48 = iArr[5] & 4294967295L;
                long j49 = (iArr2[9] & 4294967295L) + (j47 >>> 32);
                long j53 = j47 & 4294967295L;
                long j54 = (iArr2[10] & 4294967295L) + (j49 >>> 32);
                long j55 = 4294967295L & j49;
                long j56 = (j48 * j13) + (f16 & 4294967295L);
                int i26 = (int) j56;
                iArr2[5] = (i26 << 1) | i25;
                long f19 = d7.g.f(j48, j18, j56 >>> 32, j46);
                long f23 = d7.g.f(j48, j24, f19 >>> 32, f18 & 4294967295L);
                long f24 = d7.g.f(j48, j27, f23 >>> 32, j53);
                long f25 = d7.g.f(j48, j37, f24 >>> 32, j55);
                long j57 = j54 + (f25 >>> 32);
                int i27 = (int) f19;
                iArr2[6] = (i27 << 1) | (i26 >>> 31);
                int i28 = (int) f23;
                iArr2[7] = (i27 >>> 31) | (i28 << 1);
                int i29 = (int) f24;
                iArr2[8] = (i29 << 1) | (i28 >>> 31);
                int i33 = (int) f25;
                iArr2[9] = (i29 >>> 31) | (i33 << 1);
                int i34 = i33 >>> 31;
                int i35 = (int) j57;
                iArr2[10] = i34 | (i35 << 1);
                iArr2[11] = (i35 >>> 31) | ((iArr2[11] + ((int) (j57 >>> 32))) << 1);
                return;
            }
            i15 = i16;
        }
    }

    public static final void p(GestaltRadioGroup gestaltRadioGroup, Function1 invokeAfterStateMutation) {
        Intrinsics.checkNotNullParameter(gestaltRadioGroup, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        gestaltRadioGroup.u(new la1.k(18, gestaltRadioGroup, invokeAfterStateMutation));
    }

    public static void p0(com.pinterest.feature.search.results.goldstandard.viewpager.steps.a aVar, so.j3 j3Var) {
        aVar.f47627j0 = j3Var;
    }

    public static int p1(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j18 >> 32);
    }

    public static final void q(GestaltButtonGroup gestaltButtonGroup, u50.f0 text) {
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        gestaltButtonGroup.a(new fx.e(8, text));
    }

    public static void q0(h90.r rVar, n5 n5Var) {
        rVar.O0 = n5Var;
    }

    public static void q1(int[] iArr, int i13, int[] iArr2, int i14, int[] iArr3) {
        long j13 = (iArr[i13] & 4294967295L) - (iArr2[i14] & 4294967295L);
        iArr3[0] = (int) j13;
        long j14 = ((iArr[i13 + 1] & 4294967295L) - (iArr2[i14 + 1] & 4294967295L)) + (j13 >> 32);
        iArr3[1] = (int) j14;
        long j15 = ((iArr[i13 + 2] & 4294967295L) - (iArr2[i14 + 2] & 4294967295L)) + (j14 >> 32);
        iArr3[2] = (int) j15;
        long j16 = ((iArr[i13 + 3] & 4294967295L) - (iArr2[i14 + 3] & 4294967295L)) + (j15 >> 32);
        iArr3[3] = (int) j16;
        long j17 = ((iArr[i13 + 4] & 4294967295L) - (iArr2[i14 + 4] & 4294967295L)) + (j16 >> 32);
        iArr3[4] = (int) j17;
        iArr3[5] = (int) (((iArr[i13 + 5] & 4294967295L) - (iArr2[i14 + 5] & 4294967295L)) + (j17 >> 32));
    }

    public static final void r(GestaltButtonGroup gestaltButtonGroup, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        gestaltButtonGroup.a(new qp.j(2, visibility));
    }

    public static void r0(lq0.o0 o0Var, cp.a0 a0Var) {
        o0Var.J0 = a0Var;
    }

    public static void r1(int[] iArr, int[] iArr2) {
        long j13 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j13 >> 32);
        iArr2[1] = (int) j14;
        long j15 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j14 >> 32);
        iArr2[2] = (int) j15;
        long j16 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j15 >> 32);
        iArr2[3] = (int) j16;
        long j17 = ((iArr2[4] & 4294967295L) - (iArr[4] & 4294967295L)) + (j16 >> 32);
        iArr2[4] = (int) j17;
        iArr2[5] = (int) (((iArr2[5] & 4294967295L) - (4294967295L & iArr[5])) + (j17 >> 32));
    }

    public static final void s(GestaltButtonGroup gestaltButtonGroup, u50.i0 text) {
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(text, "text");
        gestaltButtonGroup.a(new fx.e(9, text));
    }

    public static void s0(su0.i iVar, ag1.h hVar) {
        iVar.C0 = hVar;
    }

    public static BigInteger s1(int[] iArr) {
        byte[] bArr = new byte[24];
        for (int i13 = 0; i13 < 6; i13++) {
            int i14 = iArr[i13];
            if (i14 != 0) {
                e0.t.K0(bArr, i14, (5 - i13) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final void t(GestaltButtonGroup gestaltButtonGroup, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(gestaltButtonGroup, "<this>");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        gestaltButtonGroup.a(new qp.j(3, visibility));
    }

    public static void t0(am0.b bVar, p5 p5Var) {
        bVar.f15518b1 = p5Var;
    }

    public static BigInteger t1(long[] jArr) {
        byte[] bArr = new byte[24];
        for (int i13 = 0; i13 < 3; i13++) {
            long j13 = jArr[i13];
            if (j13 != 0) {
                e0.t.N0(j13, (2 - i13) << 3, bArr);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final void u(View view, String viewName) {
        Intrinsics.checkNotNullParameter(viewName, "viewName");
        if (Build.VERSION.SDK_INT != 28 || view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth > 0 || measuredHeight <= 0) {
            return;
        }
        HashSet hashSet = tb0.h.f117076w;
        tb0.g.f117075a.h(df.j1.U("Zero or negative width (%d), view (%s)", new Object[]{Integer.valueOf(measuredWidth), viewName, Locale.US}));
    }

    public static void u0(to0.o oVar, so.m0 m0Var) {
        oVar.X0 = m0Var;
    }

    public static final i1.r0 u1(i1.n1 n1Var, i1.o1 o1Var) {
        return new i1.r0(n1Var, o1Var, 0.0f, 12);
    }

    public static final void v(oo2.n kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof oo2.m) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof oo2.f) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString());
        }
        if (kind instanceof oo2.d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself".toString());
        }
    }

    public static void v0(lq0.o0 o0Var, yk1.j jVar) {
        o0Var.A0 = jVar;
    }

    public static final qa2.e v1(qa2.e eVar, a.z0 actionHandler) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        wa2.m pinFeatureConfig = wa2.m.a(eVar.f103256a, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, null, false, false, null, null, actionHandler, false, null, null, false, false, null, null, false, -1, -8388609, 1023);
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        return new qa2.e(pinFeatureConfig);
    }

    public static final String w(oo2.g gVar, ro2.c json) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : gVar.getAnnotations()) {
            if (annotation instanceof ro2.j) {
                return ((ro2.j) annotation).discriminator();
            }
        }
        return json.f108976a.f109021j;
    }

    public static void w0(zw1.c cVar, so.z0 z0Var) {
        cVar.f142943j0 = z0Var;
    }

    public static gi.m w1(Object obj) {
        return new gi.m(obj.getClass().getSimpleName());
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
        long[] jArr = new long[11];
        byte[] copyOf = Arrays.copyOf(bArr, 32);
        int i13 = 0;
        copyOf[0] = (byte) (copyOf[0] & 248);
        byte b13 = (byte) (copyOf[31] & Byte.MAX_VALUE);
        copyOf[31] = b13;
        copyOf[31] = (byte) (b13 | 64);
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length);
        copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
        for (int i14 = 0; i14 < 7; i14++) {
            byte[][] bArr3 = el.a.f59442b;
            if (MessageDigest.isEqual(bArr3[i14], copyOf2)) {
                throw new InvalidKeyException("Banned public key: " + l3.c.u(bArr3[i14]));
            }
        }
        long[] C = el.a.C(copyOf2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i15 = 10;
        System.arraycopy(C, 0, jArr2, 0, 10);
        while (i13 < 32) {
            int i16 = copyOf[31 - i13] & 255;
            int i17 = 0;
            while (i17 < 8) {
                int i18 = (i16 >> (7 - i17)) & 1;
                el.a.G2(i18, jArr4, jArr2);
                el.a.G2(i18, jArr5, jArr3);
                byte[] bArr4 = copyOf;
                long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                int i19 = i16;
                long[] jArr10 = new long[19];
                long[] jArr11 = jArr;
                long[] jArr12 = new long[19];
                int i23 = i13;
                long[] jArr13 = new long[19];
                int i24 = i17;
                long[] jArr14 = new long[19];
                long[] jArr15 = new long[19];
                long[] jArr16 = jArr9;
                long[] jArr17 = new long[19];
                long[] jArr18 = new long[19];
                el.a.F2(jArr4, jArr4, jArr5);
                el.a.E2(jArr5, copyOf3, jArr5);
                long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                el.a.F2(jArr2, jArr2, jArr3);
                el.a.E2(jArr3, copyOf4, jArr3);
                el.a.t2(jArr14, jArr2, jArr5);
                el.a.t2(jArr15, jArr4, jArr3);
                el.a.y2(jArr14);
                el.a.x2(jArr14);
                el.a.y2(jArr15);
                el.a.x2(jArr15);
                long[] jArr19 = jArr2;
                System.arraycopy(jArr14, 0, copyOf4, 0, 10);
                el.a.F2(jArr14, jArr14, jArr15);
                el.a.E2(jArr15, copyOf4, jArr15);
                el.a.C2(jArr18, jArr14);
                el.a.C2(jArr17, jArr15);
                el.a.t2(jArr15, jArr17, C);
                el.a.y2(jArr15);
                el.a.x2(jArr15);
                System.arraycopy(jArr18, 0, jArr6, 0, 10);
                System.arraycopy(jArr15, 0, jArr7, 0, 10);
                el.a.C2(jArr12, jArr4);
                el.a.C2(jArr13, jArr5);
                el.a.t2(jArr8, jArr12, jArr13);
                el.a.y2(jArr8);
                el.a.x2(jArr8);
                el.a.E2(jArr13, jArr12, jArr13);
                Arrays.fill(jArr10, 10, 18, 0L);
                int i25 = 0;
                for (int i26 = 10; i25 < i26; i26 = 10) {
                    jArr10[i25] = jArr13[i25] * 121665;
                    i25++;
                }
                el.a.x2(jArr10);
                el.a.F2(jArr10, jArr10, jArr12);
                el.a.t2(jArr16, jArr13, jArr10);
                el.a.y2(jArr16);
                el.a.x2(jArr16);
                el.a.G2(i18, jArr8, jArr6);
                el.a.G2(i18, jArr16, jArr7);
                i17 = i24 + 1;
                jArr2 = jArr6;
                i16 = i19;
                copyOf = bArr4;
                jArr = jArr11;
                i13 = i23;
                jArr6 = jArr19;
                long[] jArr20 = jArr4;
                jArr4 = jArr8;
                jArr8 = jArr20;
                long[] jArr21 = jArr5;
                jArr5 = jArr16;
                jArr9 = jArr21;
                long[] jArr22 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr22;
            }
            i13++;
            i15 = 10;
        }
        long[] jArr23 = jArr;
        int i27 = i15;
        long[] jArr24 = new long[i27];
        el.a.f2(jArr24, jArr5);
        el.a.q2(jArr23, jArr4, jArr24);
        long[] jArr25 = new long[i27];
        long[] jArr26 = new long[i27];
        long[] jArr27 = new long[11];
        long[] jArr28 = new long[11];
        long[] jArr29 = new long[11];
        el.a.q2(jArr25, C, jArr23);
        el.a.F2(jArr26, C, jArr23);
        long[] jArr30 = new long[i27];
        jArr30[0] = 486662;
        el.a.F2(jArr28, jArr26, jArr30);
        el.a.q2(jArr28, jArr28, jArr3);
        el.a.F2(jArr28, jArr28, jArr2);
        el.a.q2(jArr28, jArr28, jArr25);
        el.a.q2(jArr28, jArr28, jArr2);
        for (int i28 = 0; i28 < 10; i28++) {
            jArr27[i28] = jArr28[i28] * 4;
        }
        el.a.x2(jArr27);
        el.a.q2(jArr28, jArr25, jArr3);
        el.a.E2(jArr28, jArr28, jArr3);
        el.a.q2(jArr29, jArr26, jArr2);
        el.a.F2(jArr28, jArr28, jArr29);
        el.a.C2(jArr28, jArr28);
        if (MessageDigest.isEqual(el.a.u(jArr27), el.a.u(jArr28))) {
            return el.a.u(jArr23);
        }
        throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: " + l3.c.u(bArr2));
    }

    public static void x0(lq0.o0 o0Var, ny1.w wVar) {
        o0Var.E0 = wVar;
    }

    public static final s71.l y(Context context, boolean z13, int i13, boolean z14) {
        s71.l lVar;
        String f23;
        Intrinsics.checkNotNullParameter(context, "context");
        int a03 = bs1.c.a0(vc2.a.visual_search_button_margin);
        int i14 = z14 ? 0 : a03;
        int a04 = bs1.c.a0(vc2.a.visual_search_button_padding);
        s71.l lVar2 = new s71.l(context, null, !z13, null, a04, a04, false, 0L, 0, rm1.q.FACE_TRYON, rm1.i.MD, null, null, false, false, false, false, null, false, null, 16751514);
        ViewGroup.LayoutParams layoutParams = lVar2.getLayoutParams();
        Intrinsics.g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i13;
        com.bumptech.glide.c.a1(layoutParams2, 0, i14, a03, a03);
        if (z13) {
            lVar = lVar2;
            f23 = bs1.c.f2(lVar, vc2.f.try_on);
        } else {
            lVar = lVar2;
            f23 = bs1.c.f2(lVar, vc2.f.try_similar_looks);
        }
        lVar.g(f23, true);
        if (!z13) {
            s71.l.a(lVar, s71.a.COLLAPSE, 0L, 14);
        }
        return lVar;
    }

    public static void y0(iz0.n nVar, ni1.d0 d0Var) {
        nVar.U0 = d0Var;
    }

    public static final yb0.n z(Context context, String userName, Function0 onUnfollowConfirmed) {
        yb0.n a13;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(onUnfollowConfirmed, "onUnfollowConfirmed");
        int i13 = yb0.n.f138503p;
        String string = context.getString(nz1.f.private_profile_unfollow_title, userName);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        String string2 = context.getString(nz1.f.private_profile_unfollow_body);
        String string3 = context.getString(m60.x0.unfollow);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        String string4 = context.getString(m60.x0.close_modal);
        Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
        a13 = xa0.j.a(context, string, string2, string3, (r20 & 16) != 0 ? "" : string4, (r20 & 32) != 0 ? yb0.k.f138491j : new uv0.f(20, onUnfollowConfirmed), (r20 & 64) != 0 ? yb0.k.f138492k : null, (r20 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? yb0.k.f138493l : null, (r20 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? yb0.l.f138495j : null);
        return a13;
    }

    public static void z0(iz0.n nVar, qa2.d dVar) {
        nVar.S0 = dVar;
    }
}
