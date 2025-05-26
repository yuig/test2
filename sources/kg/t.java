package kg;

import android.app.job.JobScheduler;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.RectF;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import androidx.lifecycle.l1;
import androidx.lifecycle.u1;
import ao2.m0;
import bb1.z;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.i40;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zs;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.avatargroup.GestaltAvatarGroup;
import com.pinterest.gestalt.bannerOverlay.GestaltBannerOverlay;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.gestalt.toolbar.GestaltToolbarImpl;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.screens.b2;
import df.j1;
import ey.w;
import h32.g0;
import h32.u0;
import i2.f2;
import i2.q1;
import i2.z1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import kh2.c3;
import kh2.g3;
import kh2.p2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y0;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.serialization.MissingFieldException;
import m60.f0;
import m60.u;
import m60.x0;
import ni1.a2;
import nx.d0;
import okhttp3.ResponseBody;
import p1.c1;
import p1.e1;
import p1.x;
import p1.y;
import pd2.q0;
import pk.a0;
import q91.o0;
import rq.n0;
import so.na;
import so.oa;
import so.s3;
import so.tb;
import so.x6;
import u50.h0;
import u50.i0;
import x02.i2;
import x02.v1;
import yk1.v;
import yn2.c0;
import yq1.b1;

/* loaded from: classes3.dex */
public abstract class t {

    /* renamed from: a */
    public static Method f79381a;

    /* renamed from: b */
    public static Method f79382b;

    /* renamed from: c */
    public static boolean f79383c;

    public static final boolean A(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return com.bumptech.glide.d.o0((Boolean) z(bundle, key, ab0.a.f1691a));
    }

    public static void A0(tj0.k kVar, uk1.e eVar) {
        kVar.f117878d1 = eVar;
    }

    public static final int B(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter("com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE_SOURCE", "key");
        Integer num = (Integer) z(bundle, "com.pinterest.EXTRA_CUTOUT_LOCAL_IMAGE_SOURCE", ab0.b.f1692a);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static void B0(b1 b1Var, uk1.e eVar) {
        b1Var.f139785j0 = eVar;
    }

    public static final Object C(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return z(bundle, key, ab0.c.f1693a);
    }

    public static void C0(qv0.g gVar, na naVar) {
        gVar.A0 = naVar;
    }

    public static final String D(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = (String) z(bundle, key, ab0.d.f1694a);
        return str == null ? "" : str;
    }

    public static void D0(ow1.g gVar, gw1.f fVar) {
        gVar.f97943l0 = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.pinterest.api.model.d30, com.pinterest.api.model.pu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [com.pinterest.api.model.d30] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public static final Pair E(d30 item, float f13) {
        Intrinsics.checkNotNullParameter(item, "photoItem");
        try {
            Intrinsics.checkNotNullParameter(item, "item");
            int f14 = new k6.g(item.e()).f(1, "Orientation");
            item = (f14 == 6 || f14 == 8) ? new Pair(item.h().f80347b, item.h().f80346a) : item.h();
        } catch (FileNotFoundException unused) {
            item = item.h();
        }
        return new Pair(Integer.valueOf(ml2.c.c(f13)), Integer.valueOf(ml2.c.b(f13 * ((((Number) item.f80347b).doubleValue() * 1.0d) / ((Number) item.f80346a).doubleValue()))));
    }

    public static void E0(b51.e eVar, i92.k kVar) {
        eVar.f21997k0 = kVar;
    }

    public static final ArrayList F(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return j1.B0(f30Var) ? G(f30Var) : M(f30Var);
    }

    public static void F0(z zVar, i92.k kVar) {
        zVar.f22583l0 = kVar;
    }

    public static final ArrayList G(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        ArrayList arrayList = new ArrayList();
        List<i40> f13 = b40.f(f30Var);
        if (f13 != null) {
            for (i40 i40Var : f13) {
                Map c13 = i40Var.c();
                if (c13 == null) {
                    return arrayList;
                }
                sr srVar = (sr) c13.get("736x");
                if (srVar != null) {
                    int doubleValue = (int) srVar.k().doubleValue();
                    int doubleValue2 = (int) srVar.h().doubleValue();
                    String j13 = srVar.j();
                    if (j13 == null) {
                        j13 = "";
                    }
                    String str = j13;
                    String d2 = i40Var.d();
                    String D = com.bumptech.glide.c.D(f30Var);
                    String h43 = f30Var.h4();
                    String z63 = f30Var.z6();
                    String N3 = f30Var.N3();
                    String f39332b = f30Var.getF39332b();
                    Boolean d53 = f30Var.d5();
                    String g13 = srVar.g();
                    Boolean p63 = f30Var.p6();
                    Intrinsics.f(f39332b);
                    Intrinsics.f(d53);
                    boolean booleanValue = d53.booleanValue();
                    Intrinsics.f(p63);
                    arrayList.add(new m21.b(doubleValue, doubleValue2, str, null, d2, D, h43, z63, N3, f39332b, null, null, booleanValue, false, g13, p63.booleanValue(), false, null, null, null, false, 3825664));
                }
            }
        }
        arrayList.add(0, M(f30Var).get(0));
        return arrayList;
    }

    public static void G0(o0 o0Var, i92.k kVar) {
        o0Var.f103156g0 = kVar;
    }

    public static final String H(pz0 pz0Var) {
        Intrinsics.checkNotNullParameter(pz0Var, "<this>");
        wy0 c13 = pz0Var.c();
        if (c13 != null) {
            return c13.Z2();
        }
        return null;
    }

    public static void H0(tj0.k kVar, i92.k kVar2) {
        kVar.Y0 = kVar2;
    }

    public static gq2.a I(String str) {
        eq2.e eVar;
        eq2.e eVar2;
        eq2.e eVar3;
        eq2.e eVar4;
        eq2.e eVar5;
        eq2.e eVar6;
        hq2.l lVar;
        eq2.e eVar7 = (eq2.e) fq2.b.f62796a.get(nq2.c.a(str));
        eq2.d b13 = eVar7 == null ? null : eVar7.b();
        if (b13 == null) {
            try {
                eq2.e eVar8 = (eq2.e) fq2.b.f62798c.get(new yp2.c(str));
                b13 = eVar8 == null ? null : eVar8.b();
            } catch (IllegalArgumentException unused) {
            }
            if (b13 == null) {
                yp2.c cVar = (yp2.c) eq2.b.f59929a.get(nq2.c.a(str));
                b13 = (cVar == null || (eVar6 = (eq2.e) eq2.b.f59930b.get(cVar)) == null) ? null : eVar6.b();
                if (b13 == null) {
                    yp2.c cVar2 = (yp2.c) cq2.b.f53032a.get(nq2.c.a(str));
                    b13 = (cVar2 == null || (eVar5 = (eq2.e) cq2.b.f53033b.get(cVar2)) == null) ? null : eVar5.b();
                }
                if (b13 == null) {
                    Hashtable hashtable = bq2.a.f23701a;
                    char[] charArray = str.toCharArray();
                    boolean z13 = false;
                    for (int i13 = 0; i13 != charArray.length; i13++) {
                        char c13 = charArray[i13];
                        if ('a' <= c13 && 'z' >= c13) {
                            charArray[i13] = (char) (c13 - ' ');
                            z13 = true;
                        }
                    }
                    yp2.c cVar3 = (yp2.c) hashtable.get(z13 ? new String(charArray) : str);
                    b13 = (cVar3 == null || (eVar4 = (eq2.e) cq2.b.f53033b.get(cVar3)) == null) ? null : eVar4.b();
                }
                if (b13 == null) {
                    yp2.c cVar4 = (yp2.c) dq2.a.f56142a.get(nq2.c.a(str));
                    b13 = (cVar4 == null || (eVar3 = (eq2.e) dq2.a.f56143b.get(cVar4)) == null) ? null : eVar3.b();
                }
                if (b13 == null) {
                    yp2.c cVar5 = (yp2.c) zp2.b.f142628a.get(nq2.c.a(str));
                    b13 = (cVar5 == null || (eVar2 = (eq2.e) zp2.b.f142629b.get(cVar5)) == null) ? null : eVar2.b();
                }
                if (b13 == null) {
                    yp2.c cVar6 = (yp2.c) aq2.a.f20359a.get(nq2.c.a(str));
                    b13 = (cVar6 == null || (eVar = (eq2.e) aq2.a.f20360b.get(cVar6)) == null) ? null : eVar.b();
                }
                if (b13 == null) {
                    try {
                        yp2.c cVar7 = new yp2.c(str);
                        eq2.e eVar9 = (eq2.e) eq2.b.f59930b.get(cVar7);
                        eq2.d b14 = eVar9 != null ? eVar9.b() : null;
                        if (b14 == null) {
                            eq2.e eVar10 = (eq2.e) cq2.b.f53033b.get(cVar7);
                            b14 = eVar10 == null ? null : eVar10.b();
                        }
                        if (b14 == null) {
                            eq2.e eVar11 = (eq2.e) dq2.a.f56143b.get(cVar7);
                            b14 = eVar11 != null ? eVar11.b() : null;
                        }
                        if (b14 == null) {
                            eq2.e eVar12 = (eq2.e) zp2.b.f142629b.get(cVar7);
                            b14 = eVar12 == null ? null : eVar12.b();
                        }
                        if (b14 == null) {
                            eq2.e eVar13 = (eq2.e) aq2.a.f20360b.get(cVar7);
                            b14 = eVar13 == null ? null : eVar13.b();
                        }
                        b13 = b14;
                    } catch (IllegalArgumentException unused2) {
                    }
                }
            }
        }
        if (b13 == null) {
            return null;
        }
        hq2.f fVar = b13.f59938b;
        eq2.c cVar8 = b13.f59939c;
        synchronized (cVar8) {
            try {
                if (((hq2.l) cVar8.f59935d) == null) {
                    cVar8.f59935d = cVar8.f59933b.e(((yp2.g) cVar8.f59934c).f139624a).j();
                }
                lVar = (hq2.l) cVar8.f59935d;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        BigInteger bigInteger = b13.f59940d;
        gq2.a aVar = new gq2.a();
        aVar.f65981a = fVar;
        aVar.f65982b = lVar.j();
        aVar.f65983c = bigInteger;
        return aVar;
    }

    public static void I0(b1 b1Var) {
        b1Var.getClass();
    }

    public static String J(int i13, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb3 = new StringBuilder("$");
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 == 1 || i15 == 2) {
                sb3.append('[');
                sb3.append(iArr2[i14]);
                sb3.append(']');
            } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                sb3.append('.');
                String str = strArr[i14];
                if (str != null) {
                    sb3.append(str);
                }
            }
        }
        return sb3.toString();
    }

    public static void J0(b51.e eVar, v vVar) {
        eVar.f21998l0 = vVar;
    }

    public static final PointF K(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        return new PointF(motionEvent.getX(), motionEvent.getY());
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K0(nx.d0 r5, java.lang.String r6) {
        /*
            java.lang.String r0 = "pinalytics"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            ou1.f r1 = v()
            zp.f r1 = (zp.f) r1
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r2 = "source"
            r0.<init>(r2, r6)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0}
            java.util.HashMap r0 = kotlin.collections.z0.f(r0)
            h32.u0 r2 = h32.u0.CREATE_BOARD_BUTTON
            h32.g0 r3 = h32.g0.MODAL_DIALOG
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r0)
            r5.h(r3, r2, r4)
            ou1.b r5 = ou1.b.NAVBAR_PLUS_BUTTON
            java.lang.String r5 = r5.getValue()
            boolean r5 = kotlin.jvm.internal.Intrinsics.d(r6, r5)
            if (r5 == 0) goto L59
            lh0.t1 r5 = r1.f142405h
            r5.getClass()
            lh0.z3 r0 = lh0.a4.f83298b
            lh0.z0 r5 = r5.f83481a
            lh0.g1 r5 = (lh0.g1) r5
            java.lang.String r2 = "enabled"
            java.lang.String r3 = "android_curation_board_create_no_pin"
            boolean r0 = r5.o(r3, r2, r0)
            if (r0 != 0) goto L50
            boolean r5 = r5.l(r3)
            if (r5 == 0) goto L59
        L50:
            xk2.v r5 = com.pinterest.screens.b2.f50551b
            java.lang.Object r5 = r5.getValue()
            com.pinterest.framework.screens.ScreenLocation r5 = (com.pinterest.framework.screens.ScreenLocation) r5
            goto L61
        L59:
            xk2.v r5 = com.pinterest.screens.b2.f50550a
            java.lang.Object r5 = r5.getValue()
            com.pinterest.framework.screens.ScreenLocation r5 = (com.pinterest.framework.screens.ScreenLocation) r5
        L61:
            com.pinterest.navigation.NavigationImpl r5 = com.pinterest.navigation.Navigation.w1(r5)
            java.lang.String r0 = "com.pinterest.EXTRA_IS_JUMPSTART_ENABLED"
            r2 = 1
            r5.Y1(r0, r2)
            if (r6 == 0) goto L72
            java.lang.String r0 = "com.pinterest.EXTRA_SOURCE"
            r5.m0(r0, r6)
        L72:
            m60.w r6 = r1.f142398a
            r6.d(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.t.K0(nx.d0, java.lang.String):void");
    }

    public static final String L(String pinUid) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        return "shuffle_" + pinUid;
    }

    public static void L0(d0 pinalytics, String str, String str2, d32.c entryPointSource, String str3, int i13) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 8) != 0) {
            entryPointSource = d32.c.UNKNOWN;
        }
        if ((i13 & 16) != 0) {
            str3 = null;
        }
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        zp.f fVar = (zp.f) v();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        pinalytics.F(g0.MODAL_DIALOG, u0.CREATE_COLLAGE_BUTTON);
        NavigationImpl w13 = Navigation.w1((ScreenLocation) b2.f50552c.getValue());
        if (str == null) {
            str = "";
        }
        w13.m0("CutoutComposerExtras.EXTRA_DRAFT_COLLAGE_ID", str);
        if (str2 == null) {
            str2 = "";
        }
        w13.m0("CutoutComposerExtras.EXTRA_REMIX_PIN_ID", str2);
        w13.z(entryPointSource.getValue(), "CutoutComposerExtras.EXTRA_ENTRY_POINT_SOURCE");
        if (str3 == null) {
            str3 = "";
        }
        w13.m0("com.pinterest.EXTRA_BOARD_ID", str3);
        fVar.f142398a.d(w13);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.ArrayList M(com.pinterest.api.model.f30 r26) {
        /*
            r0 = r26
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            bc2.q r7 = dl2.b.S0(r0, r2)
            m21.b r13 = new m21.b
            if (r7 == 0) goto L1d
            bc2.c r3 = r7.f22677f
            if (r3 == 0) goto L1d
            int r3 = r3.f22648a
        L1b:
            r4 = r3
            goto L22
        L1d:
            int r3 = bs1.c.z0(r26)
            goto L1b
        L22:
            if (r7 == 0) goto L2c
            bc2.c r3 = r7.f22677f
            if (r3 == 0) goto L2c
            int r3 = r3.f22649b
        L2a:
            r5 = r3
            goto L31
        L2c:
            int r3 = bs1.c.x0(r26)
            goto L2a
        L31:
            java.lang.String r3 = bs1.c.y0(r26)
            if (r3 != 0) goto L39
            java.lang.String r3 = ""
        L39:
            r6 = r3
            java.lang.String r8 = r26.z4()
            java.lang.String r9 = com.bumptech.glide.c.D(r26)
            java.lang.String r10 = r26.h4()
            java.lang.String r11 = r26.r4()
            java.lang.String r12 = r26.c4()
            java.lang.String r3 = r26.getF39332b()
            java.lang.String r14 = "getUid(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r14)
            java.lang.Boolean r14 = r26.d5()
            java.lang.String r15 = "getIsPromoted(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L7a
            java.lang.Boolean r14 = r26.F4()
            java.lang.String r15 = "getIsDownstreamPromotion(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L76
            goto L7a
        L76:
            r14 = 0
        L77:
            r16 = r14
            goto L7c
        L7a:
            r14 = 1
            goto L77
        L7c:
            as1.b r14 = as1.b.a()
            java.lang.String r15 = "get(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r14, r15)
            com.pinterest.api.model.sr r14 = bs1.b.a(r0, r14)
            if (r14 == 0) goto L8f
            java.lang.String r2 = r14.g()
        L8f:
            r18 = r2
            java.lang.Boolean r0 = r26.p6()
            java.lang.String r2 = "getShouldMute(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            boolean r19 = r0.booleanValue()
            r22 = 0
            r25 = 3825664(0x3a6000, float:5.360897E-39)
            r14 = 0
            r15 = 0
            r17 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r24 = 0
            r0 = r3
            r3 = r13
            r2 = r13
            r13 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1.add(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.t.M(com.pinterest.api.model.f30):java.util.ArrayList");
    }

    public static void M0(d0 pinalytics, Context context, ou1.e entryType, String str, String str2, int i13, int i14) {
        String str3 = (i14 & 8) != 0 ? null : str;
        String str4 = (i14 & 16) != 0 ? null : str2;
        int i15 = (i14 & 32) != 0 ? 0 : i13;
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        zp.f fVar = (zp.f) v();
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(entryType, "entryType");
        ((bw0.b) fVar.f142399b.get()).a().l(wj2.c.a()).o(new jp.d(21, new e.f(fVar, context, new zp.e(pinalytics, context, entryType, str3, str4, i15, fVar), 17)), new jp.d(22, new ba.s(9, fVar, context)));
    }

    public static final int N(rm1.d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        rm1.g gVar = dVar.f108695a;
        if (gVar instanceof rm1.f) {
            return ((rm1.f) gVar).f108703b.getDimenAttrRes();
        }
        if (gVar instanceof rm1.e) {
            return ((rm1.e) gVar).f108701b.getDimenAttrRes();
        }
        throw new NoWhenBranchMatchedException();
    }

    public static od2.a N0(int i13, String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Map g13 = z0.g(new Pair("strength", new pd2.k(1.0f, null).c(0.0f, 1.0f)), new Pair("exposure", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("contrast", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("shadows", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("highlights", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("vibrance", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("saturation", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("temperature", jq.b.n(0.0f, null, -1.0f, 1.0f)), new Pair("tint", jq.b.n(0.0f, null, -1.0f, 1.0f)));
        return new od2.a(name, "///////////////////////////////////\n/////////// adjusts ///////////////\n\nmat3 {{name}}_matAdapt = mat3(\n    0.8951, -0.7502, 0.0389,\n    0.2664, 1.7135, -0.0685,\n    -0.1614, 0.0367, 1.0296\n);\n\nmat3 {{name}}_matAdaptInv = mat3(\n    0.9869929054667123, 0.43230526972339456, -0.008528664575177328,\n    -0.14705425642099013, 0.5183602715367776, 0.04004282165408487,\n    0.15996265166373125, 0.0492912282128556, 0.9684866957875502\n);\n\nvec3 {{name}}_adaptMul(vec3 color, vec3 coef) {\n    color = {{name}}_matAdapt * color;\n    color *= coef;\n    color = {{name}}_matAdaptInv * color;\n\n    return color;\n}\n\nvec3 {{name}}_temperatureCorrection(vec3 col, float temperature, float tint) {\n    temperature *= 0.7;\n    tint *= 0.7;\n\n    vec3 D50 = vec3(0.96422, 1.0, 0.82521);\n    vec3 D65 = vec3(0.95047, 1.0, 1.08883);\n    vec3 CCT2K = vec3(1.274335, 1.0, 0.145233);\n    vec3 CCT4K = vec3(1.009802, 1.0, 0.644496);\n    vec3 CCT20K = vec3(0.995451, 1.0, 1.886109);\n\n    vec3 from, to;\n    if (temperature < 0.0) {\n        to = CCT20K;\n        from = D65;\n    } else {\n        to = CCT4K;\n        from = D65;\n    }\n\n    float lum = luminance(col);\n    // mask by luminance\n    float temp = abs(temperature) * (1.0 - pow(lum, 2.72));\n\n    // from\n    vec3 refWhiteRGB = from;\n    // to\n    vec3 refWhite = vec3(mix(from.x, to.x, temp), mix(1.0, 0.9, tint), mix(from.z, to.z, temp));\n\n    vec3 d = {{name}}_matAdapt * refWhite;\n    vec3 s = {{name}}_matAdapt * refWhiteRGB;\n\n    vec3 xyz = RGBtoXYZ(col);\n    xyz = {{name}}_adaptMul(xyz, d / s);\n    col = XYZtoRGB(xyz);\n\n    // brightness compensation\n    vec3 res = col * (1.0 + (temp + tint) / 10.0);\n\n    return res;\n}\n\nvec3 {{name}}_shadows(vec3 hsl, float shadows) {\n    float s = hsl.y;\n    float l = hsl.z;\n\n    float a = 1.0;\n    float b = 4.0;\n    float c = 5.0;\n    float d = 25.0;\n\n    if (shadows >= 0.0) {\n        shadows = 0.3 * shadows;\n    } else {\n        shadows = -0.4 * pow(-shadows, 1.3);\n    }\n\n    float strength = shadows * pow(l, a) * pow(1.0 - l, b) * exp(-c * l) * d;\n\n    l += strength;\n    s -= 0.2 * shadows;\n\n    return vec3(hsl.x, s, l);\n}\n\nvec3 {{name}}_highlights(vec3 hsl, float highlights) {\n    float s = hsl.y;\n    float l = hsl.z;\n\n    float a = 0.2;\n\n    float strength = 0.3 * highlights * exp(-(1.0 - l) / a);\n    l += strength;\n    s += 0.1 * highlights;\n\n    return vec3(hsl.x, s, l);\n}\n\nvec3 {{name}}_evCorrection(vec3 rgb, float exposure) {\n    vec3 result = clamp(rgb * pow(2.0, 0.4 * exposure), 0.0, 1.0);\n    return result;\n}\n\nvec3 {{name}}_contrastBrightness(vec3 rgb, float contrast, float brightness) {\n    float contrastCompensationFactor = (1.0 + 0.15 * contrast) / (1.0 - 0.15 * contrast);\n    vec3 result = contrastCompensationFactor * (rgb - 0.5) + 0.5 + brightness;\n    return result;\n}\n\nvec3 {{name}}_saturate(vec3 rgb, float saturation) {\n    if (saturation > 0.0) {\n        saturation *= 0.5;\n    }\n\n    float luma = dot(rgb, vec3(0.2, 0.7, 0.1));\n    vec3 gray = vec3(luma, luma, luma);\n\n    vec3 diff = rgb - gray;\n\n    diff *= (1.0 + saturation);\n    return clamp(gray + diff, 0.0, 1.0);\n}\n\nvec3 {{name}}_vibrate(vec3 rgb, float vibrance)\n{\n    float hue_a, a, f, p1, p2, p3, i, h, s, v, amt, _max, _min, dlt;\n    float br1, br2, br3, br4, br5, br2_or_br1, br3_or_br1, br4_or_br1, br5_or_br1;\n    int use;\n\n    _min = min(min(rgb.r, rgb.g), rgb.b);\n    _max = max(max(rgb.r, rgb.g), rgb.b);\n    dlt = _max - _min + 0.00001 /*Hack to fix divide zero infinities*/;\n    h = 0.0;\n    v = _max;\n\n    br1 = step(_max, 0.0);\n    s = (dlt / _max) * (1.0 - br1);\n    h = -1.0 * br1;\n\n    br2 = 1.0 - step(_max - rgb.r, 0.0);\n    br2_or_br1 = max(br2, br1);\n    h = ((rgb.g - rgb.b) / dlt) * (1.0 - br2_or_br1) + (h*br2_or_br1);\n\n    br3 = 1.0 - step(_max - rgb.g, 0.0);\n\n    br3_or_br1 = max(br3, br1);\n    h = (2.0 + (rgb.b - rgb.r) / dlt) * (1.0 - br3_or_br1) + (h*br3_or_br1);\n\n    br4 = 1.0 - br2*br3;\n    br4_or_br1 = max(br4, br1);\n    h = (4.0 + (rgb.r - rgb.g) / dlt) * (1.0 - br4_or_br1) + (h*br4_or_br1);\n\n    h = h*(1.0 - br1);\n\n    hue_a = abs(h); // between h of -1 and 1 are skin tones\n    a = dlt;      // Reducing enhancements on small rgb differences\n\n    // Reduce the enhancements on skin tones.\n    a = step(1.0, hue_a) * a * (hue_a * 0.67 + 0.33) + step(hue_a, 1.0) * a;\n    a *= (vibrance - 1.0);\n    s = (1.0 - a) * s + a * pow(s, 0.25);\n\n    i = floor(h);\n    f = h - i;\n\n    p1 = v * (1.0 - s);\n    p2 = v * (1.0 - (s * f));\n    p3 = v * (1.0 - (s * (1.0 - f)));\n\n    rgb = vec3(0.0);\n    i += 6.0;\n    //use = 1 << ((int)i % 6);\n    use = int(pow(2.0,mod(i,6.0)));\n    a = float(use & 1); // i == 0;\n    use >>= 1;\n    rgb += a * vec3(v, p3, p1);\n\n    a = float(use & 1); // i == 1;\n    use >>= 1;\n    rgb += a * vec3(p2, v, p1);\n\n    a = float(use & 1); // i == 2;\n    use >>= 1;\n    rgb += a * vec3(p1, v, p3);\n\n    a = float(use & 1); // i == 3;\n    use >>= 1;\n    rgb += a * vec3(p1, p2, v);\n\n    a = float(use & 1); // i == 4;\n    use >>= 1;\n    rgb += a * vec3(p3, p1, v);\n\n    a = float(use & 1); // i == 5;\n    use >>= 1;\n    rgb += a * vec3(v, p1, p2);\n\n    return rgb;\n}\n\n///////////////////////////////////////////////////\n\n\nvec4 {{name}}(FragmentEffectInput data) {\n    vec4 color = data.color;\n    \n    float exposure = {{settings.exposure}};\n    float contrast = {{settings.contrast}};\n    float shadows = {{settings.shadows}};\n    float highlights = {{settings.highlights}};\n    float vibrance = {{settings.vibrance}} + 1.0;\n    float saturation = {{settings.saturation}};\n    float temperature = {{settings.temperature}};\n    float tint = {{settings.tint}};\n\n    vec4 lutColor = texture({{resources.lut}}, color.rgb);\n    vec3 rgb = mix(color.rgb, lutColor.rgb, {{settings.strength}} * color.a);\n    float a = color.a;\n    rgb /= a;\n\n    rgb = {{name}}_evCorrection(rgb, exposure);\n    vec3 hsl = RGB2HSL(rgb);\n    hsl = {{name}}_shadows(hsl, shadows);\n    hsl = {{name}}_highlights(hsl, highlights);\n    rgb = HSL2RGB(hsl);\n    rgb = {{name}}_contrastBrightness(rgb, contrast, 0.0);\n    rgb = {{name}}_vibrate(rgb, vibrance);\n    rgb = {{name}}_saturate(rgb, saturation);\n    rgb = {{name}}_temperatureCorrection(rgb, temperature, tint);\n\n    rgb *= a;\n\n    color.rgb = rgb;\n    return color;\n}", new q0(g13), y0.b(new Pair("lut", new md2.a(md2.b.Lut3D, String.valueOf(i13)))));
    }

    public static final void O(GestaltIcon gestaltIcon) {
        Intrinsics.checkNotNullParameter(gestaltIcon, "<this>");
        gestaltIcon.g2(rm1.a.f108688j);
    }

    public static final wa2.m O0(boolean z13, boolean z14) {
        f30 f30Var = a2.f90595a;
        return wa2.m.a(f0.i0(bs1.c.q(z13)), false, false, false, false, false, false, true, false, false, false, false, z13, false, false, false, false, false, z13, false, null, false, z14, null, null, null, false, null, "board", false, false, null, null, false, 2138042367, -262145, 1021);
    }

    public static final void P() {
        new ny.i().i();
        dl2.b.f55293b = false;
        u.f85943a.f(new w());
    }

    public static void P0(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[8];
        S(jArr, jArr2, jArr4);
        S0(jArr4, jArr3);
    }

    public static final boolean Q(f30 f30Var) {
        List y13;
        we0 we0Var;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        se0 g63 = f30Var.g6();
        Boolean p13 = (g63 == null || (y13 = g63.y()) == null || (we0Var = (we0) CollectionsKt.firstOrNull(y13)) == null) ? null : we0Var.p();
        if (p13 == null) {
            return false;
        }
        return p13.booleanValue();
    }

    public static od2.a Q0() {
        return new od2.a("opacity", "vec4 {{name}}(FragmentEffectInput data) {\n    return data.color * {{settings.opacity}};\n}", new q0(y0.b(new Pair("opacity", jq.b.n(1.0f, null, 0.0f, 1.0f)))));
    }

    public static void R(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        jArr2[0] = j13 & 576460752303423487L;
        jArr2[1] = ((j13 >>> 59) ^ (j14 << 5)) & 576460752303423487L;
        jArr2[2] = ((j14 >>> 54) ^ (j15 << 10)) & 576460752303423487L;
        jArr2[3] = (j15 >>> 49) ^ (j16 << 15);
    }

    public static final List R0(l62.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        yn2.i q13 = c0.q(c0.j(CollectionsKt.K(aVar.f81609a), v80.a.f124478j), v80.a.f124479k);
        Intrinsics.checkNotNullParameter(q13, "<this>");
        yn2.z selector = yn2.z.f139593i;
        Intrinsics.checkNotNullParameter(q13, "<this>");
        Intrinsics.checkNotNullParameter(selector, "selector");
        yn2.c cVar = new yn2.c(q13, selector, 0);
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        return c0.t(new yn2.n(cVar, 1));
    }

    public static void S(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        R(jArr, jArr4);
        R(jArr2, jArr5);
        T(jArr4[0], jArr5[0], jArr3, 0);
        T(jArr4[1], jArr5[1], jArr3, 1);
        T(jArr4[2], jArr5[2], jArr3, 2);
        T(jArr4[3], jArr5[3], jArr3, 3);
        for (int i13 = 5; i13 > 0; i13--) {
            jArr3[i13] = jArr3[i13] ^ jArr3[i13 - 1];
        }
        T(jArr4[0] ^ jArr4[1], jArr5[0] ^ jArr5[1], jArr3, 1);
        T(jArr4[2] ^ jArr4[3], jArr5[2] ^ jArr5[3], jArr3, 3);
        for (int i14 = 7; i14 > 1; i14--) {
            jArr3[i14] = jArr3[i14] ^ jArr3[i14 - 2];
        }
        long j13 = jArr4[0] ^ jArr4[2];
        long j14 = jArr4[1] ^ jArr4[3];
        long j15 = jArr5[0] ^ jArr5[2];
        long j16 = jArr5[1] ^ jArr5[3];
        T(j13 ^ j14, j15 ^ j16, jArr3, 3);
        long[] jArr6 = new long[3];
        T(j13, j15, jArr6, 0);
        T(j14, j16, jArr6, 1);
        long j17 = jArr6[0];
        long j18 = jArr6[1];
        long j19 = jArr6[2];
        long j23 = jArr3[2] ^ j17;
        jArr3[2] = j23;
        long j24 = jArr3[3] ^ (j17 ^ j18);
        jArr3[3] = j24;
        long j25 = jArr3[4] ^ (j19 ^ j18);
        jArr3[4] = j25;
        long j26 = jArr3[5] ^ j19;
        jArr3[5] = j26;
        long j27 = jArr3[0];
        long j28 = jArr3[1];
        long j29 = jArr3[6];
        long j33 = jArr3[7];
        jArr3[0] = j27 ^ (j28 << 59);
        jArr3[1] = (j28 >>> 5) ^ (j23 << 54);
        jArr3[2] = (j23 >>> 10) ^ (j24 << 49);
        jArr3[3] = (j24 >>> 15) ^ (j25 << 44);
        jArr3[4] = (j25 >>> 20) ^ (j26 << 39);
        jArr3[5] = (j26 >>> 25) ^ (j29 << 34);
        jArr3[6] = (j29 >>> 30) ^ (j33 << 29);
        jArr3[7] = j33 >>> 35;
    }

    public static void S0(long[] jArr, long[] jArr2) {
        long j13 = jArr[0];
        long j14 = jArr[1];
        long j15 = jArr[2];
        long j16 = jArr[3];
        long j17 = jArr[4];
        long j18 = jArr[5];
        long j19 = jArr[6];
        long j23 = jArr[7];
        long j24 = j18 ^ (j23 >>> 31);
        long j25 = (j17 ^ ((j23 >>> 41) ^ (j23 << 33))) ^ (j19 >>> 31);
        long j26 = ((j16 ^ (j23 << 23)) ^ ((j19 >>> 41) ^ (j19 << 33))) ^ (j24 >>> 31);
        long j27 = j13 ^ (j25 << 23);
        long j28 = (j14 ^ (j24 << 23)) ^ ((j25 >>> 41) ^ (j25 << 33));
        long j29 = ((j15 ^ (j19 << 23)) ^ ((j24 >>> 41) ^ (j24 << 33))) ^ (j25 >>> 31);
        long j33 = j26 >>> 41;
        jArr2[0] = j27 ^ j33;
        jArr2[1] = (j33 << 10) ^ j28;
        jArr2[2] = j29;
        jArr2[3] = 2199023255551L & j26;
    }

    public static void T(long j13, long j14, long[] jArr, int i13) {
        long j15 = j14 << 1;
        long j16 = j15 ^ j14;
        long j17 = j14 << 2;
        long j18 = j16 << 1;
        long[] jArr2 = {0, j14, j15, j16, j17, j17 ^ j14, j18, j18 ^ j14};
        int i14 = (int) j13;
        long j19 = (jArr2[(i14 >>> 3) & 7] << 3) ^ jArr2[i14 & 7];
        long j23 = 0;
        int i15 = 54;
        do {
            int i16 = (int) (j13 >>> i15);
            long j24 = jArr2[i16 & 7] ^ (jArr2[(i16 >>> 3) & 7] << 3);
            j19 ^= j24 << i15;
            j23 ^= j24 >>> (-i15);
            i15 -= 6;
        } while (i15 > 0);
        jArr[i13] = jArr[i13] ^ (576460752303423487L & j19);
        int i17 = i13 + 1;
        jArr[i17] = jArr[i17] ^ ((j19 >>> 59) ^ (j23 << 5));
    }

    public static final void T0(File file, ResponseBody responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        InputStream inputStream = null;
        try {
            try {
                InputStream byteStream = responseBody.byteStream();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[4096];
                        while (true) {
                            int read = byteStream.read(bArr);
                            if (read == -1) {
                                fileOutputStream.flush();
                                Unit unit = Unit.f80348a;
                                dl2.b.J(fileOutputStream, null);
                                byteStream.close();
                                return;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                    } finally {
                    }
                } catch (Exception e13) {
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = byteStream;
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Exception e14) {
            throw e14;
        }
    }

    public static void U(long[] jArr, long[] jArr2) {
        p2.e0(0, jArr[0], jArr2);
        p2.e0(2, jArr[1], jArr2);
        p2.e0(4, jArr[2], jArr2);
        jArr2[6] = p2.d0((int) jArr[3]);
        jArr2[7] = p2.c0((int) (r0 >>> 32)) & 4294967295L;
    }

    public static final Uri U0(Context context, File videoFile) {
        Uri insert;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoFile, "videoFile");
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (Build.VERSION.SDK_INT >= 29) {
            Uri contentUri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("_display_name", videoFile.getName());
            contentValues.put("is_pending", (Integer) 1);
            insert = contentResolver.insert(contentUri, contentValues);
        } else {
            Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_display_name", videoFile.getName());
            contentValues.put("mime_type", "video/mp4");
            insert = contentResolver.insert(uri, contentValues);
        }
        if (insert != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(insert, "w", null);
                if (openFileDescriptor != null) {
                    try {
                        FileDescriptor fileDescriptor = openFileDescriptor.getFileDescriptor();
                        if (fileDescriptor != null) {
                            FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                            FileInputStream fileInputStream = new FileInputStream(videoFile);
                            try {
                                fileOutputStream.write(bs1.c.I1(fileInputStream));
                                Unit unit = Unit.f80348a;
                                dl2.b.J(fileInputStream, null);
                            } finally {
                            }
                        }
                    } finally {
                    }
                }
                dl2.b.J(openFileDescriptor, null);
            } catch (Exception e13) {
                HashSet hashSet = tb0.h.f117076w;
                tb0.g.f117075a.q(e13, "Failed to save video to gallery", tb0.p.BOARD_INVITE);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("is_pending", (Integer) 0);
                contentResolver.update(insert, contentValues2, null, null);
            }
        }
        return insert;
    }

    public static void V(z zVar, cr1.a aVar) {
        zVar.f22582k0 = aVar;
    }

    public static final Pair V0(Camera.Parameters parameters, float f13, float f14) {
        Intrinsics.checkNotNullParameter(parameters, "<this>");
        if (f14 < 1.0f) {
            f14 = 1 / f14;
        }
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Intrinsics.checkNotNullExpressionValue(supportedPictureSizes, "getSupportedPictureSizes(...)");
        int i13 = Integer.MIN_VALUE;
        float f15 = Float.MAX_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (Camera.Size size : supportedPictureSizes) {
            if (size.width >= f13 && supportedPreviewSizes.contains(size)) {
                int i15 = size.width;
                if (i15 < i14) {
                    float abs = Math.abs(f14 - (i15 / size.height));
                    i14 = size.width;
                    f15 = abs;
                    i13 = size.height;
                } else if (i15 == i14) {
                    float abs2 = Math.abs(f14 - (i15 / size.height));
                    if (abs2 < f15) {
                        i13 = size.height;
                        f15 = abs2;
                    }
                }
            }
        }
        if (i14 != Integer.MAX_VALUE) {
            parameters.setPictureSize(i14, i13);
        }
        return new Pair(Integer.valueOf(i14), Integer.valueOf(i13));
    }

    public static void W(o0 o0Var, mr1.a aVar) {
        o0Var.f103157h0 = aVar;
    }

    public static final void W0(fo1.a aVar, final fo1.i iVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        if (iVar == null) {
            GestaltToolbarImpl gestaltToolbarImpl = (GestaltToolbarImpl) aVar;
            gestaltToolbarImpl.f49712l = null;
            gestaltToolbarImpl.f49713m = null;
            aVar.setOnClickListener(null);
            aVar.setOnLongClickListener(null);
            return;
        }
        GestaltToolbarImpl gestaltToolbarImpl2 = (GestaltToolbarImpl) aVar;
        gestaltToolbarImpl2.f49712l = new a.z0(iVar, 25);
        final int i13 = 0;
        gestaltToolbarImpl2.f49713m = new View.OnClickListener() { // from class: fo1.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14 = i13;
                i toolbarListener = iVar;
                switch (i14) {
                    case 0:
                        Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                        ((nl1.d) toolbarListener).O7();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                        toolbarListener.I3();
                        break;
                }
            }
        };
        final int i14 = 1;
        aVar.setOnClickListener(new View.OnClickListener() { // from class: fo1.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i142 = i14;
                i toolbarListener = iVar;
                switch (i142) {
                    case 0:
                        Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                        ((nl1.d) toolbarListener).O7();
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(toolbarListener, "$toolbarListener");
                        toolbarListener.I3();
                        break;
                }
            }
        });
        aVar.setOnLongClickListener(new n0(iVar, 10));
    }

    public static void X(tj0.k kVar) {
        kVar.getClass();
    }

    public static final void X0() {
        Context context = kb0.a.f79058b;
        ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().c(new jn0.f((rm1.q) null, x0.pin_image_download_success, 5));
    }

    public static void Y(b1 b1Var, fr1.c cVar) {
        b1Var.f139788m0 = cVar;
    }

    public static void Y0(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        U(jArr, jArr3);
        S0(jArr3, jArr2);
    }

    public static void Z(iq0.a aVar, x6 x6Var) {
        aVar.Z0 = x6Var;
    }

    public static void Z0(int i13, long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[8];
        U(jArr, jArr3);
        S0(jArr3, jArr2);
        while (true) {
            i13--;
            if (i13 <= 0) {
                return;
            }
            U(jArr2, jArr3);
            S0(jArr3, jArr2);
        }
    }

    public static final void a(uc0.s sVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(1799122797);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar2.h(sVar)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
        } else {
            sVar2.S();
            if ((i13 & 1) != 0 && !sVar2.y()) {
                sVar2.Q();
                int i16 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar2.X(1890788296);
                u1 a13 = v6.b.a(sVar2);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = p2.V(a13, sVar2);
                sVar2.X(1729797275);
                l1 v03 = c3.v0(uc0.s.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar2);
                sVar2.r(false);
                sVar2.r(false);
                sVar = (uc0.s) v03;
            }
            sVar2.s();
            q1 z13 = bs1.c.z(sVar.f121825e, sVar2);
            sVar.i(new uc0.i(new oc0.a(q2.i.c(-2094824539, new xb0.a(sVar, 5), sVar2))));
            gh0.b.d(((uc0.r) z13.getValue()).f121855a, null, sVar2, 8, 2);
        }
        f2 t13 = sVar2.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(sVar, i13, i14, 7);
        }
    }

    public static void a0(qv0.g gVar, ag1.b bVar) {
        gVar.D0 = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final uj2.b a1(dl1.t tVar, zs interest, boolean z13) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(interest, "interest");
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        Intrinsics.checkNotNullParameter(interest, "interest");
        if (!kh2.j1.m0(interest)) {
            return uj2.b.g(new IllegalArgumentException());
        }
        zs i13 = jk.v.i(interest, z13);
        String f39332b = interest.getF39332b();
        Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
        uj2.l G = ((dl1.q0) tVar).G(new x02.u1(f39332b, interest.E(), z13), i13);
        G.getClass();
        return new hk2.u(G);
    }

    public static final void b(ia0.b state, u2.q qVar, i2.o oVar, int i13, int i14) {
        boolean z13;
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(410214243);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        boolean z14 = !kotlin.text.z.j((CharSequence) dl2.b.u2(state.f71945c, sVar));
        u2.q o13 = androidx.compose.foundation.layout.b.o(qVar2, com.bumptech.glide.d.A(eo1.c.space_200, sVar), com.bumptech.glide.d.A(eo1.c.space_100, sVar));
        p1.g gVar = p1.l.f98543a;
        e1 a13 = c1.a(p1.l.g(com.bumptech.glide.d.A(eo1.c.space_100, sVar)), u2.b.f120023k, sVar, 48);
        int i16 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X = m0.X(sVar, o13);
        s3.k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z15 = sVar.f71265a instanceof i2.f;
        if (!z15) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        s3.h hVar = s3.j.f110801e;
        tb.f.f0(sVar, a13, hVar);
        s3.h hVar2 = s3.j.f110800d;
        tb.f.f0(sVar, o14, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        u2.q qVar3 = qVar2;
        p.a(rl1.q.e(state.f71943a, null, null, false, z14 ? rl1.r.MD : rl1.r.SM, null, false, false, null, 0, null, null, 2039), null, null, sVar, 8, 6);
        y a14 = x.a(p1.l.f98547e, u2.b.f120025m, sVar, 6);
        int i17 = sVar.P;
        z1 o15 = sVar.o();
        u2.q X2 = m0.X(sVar, nVar);
        if (!z15) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a14, hVar);
        tb.f.f0(sVar, o15, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        sVar.W(-1769815553);
        if (z14) {
            dl2.b.c(ia0.a.a(state.f71945c, vn1.g.BODY_100, vn1.e.BOLD), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        i0 i0Var = state.f71944b;
        boolean z16 = !kotlin.text.z.j((CharSequence) dl2.b.u2(i0Var, sVar));
        sVar.W(-1769803292);
        if (z16) {
            vn1.g gVar2 = vn1.g.UI_100;
            rl1.q qVar4 = ia0.a.f71940a;
            dl2.b.c(ia0.a.a(i0Var, gVar2, vn1.e.REGULAR), null, null, null, sVar, 8, 14);
        }
        sVar.r(false);
        if (z14 || z16) {
            z13 = true;
            androidx.compose.foundation.layout.a.a(androidx.compose.foundation.layout.e.c(nVar, 1), sVar);
        } else {
            z13 = true;
        }
        sVar.r(z13);
        sVar.r(z13);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new ga0.c(state, qVar3, i13, i14, 2);
        }
    }

    public static void b0(tj0.k kVar, f0 f0Var) {
        kVar.f117876b1 = f0Var;
    }

    public static final void b1(int i13, int i14, qo2.y0 descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        ArrayList missingFields = new ArrayList();
        int i15 = (~i13) & i14;
        for (int i16 = 0; i16 < 32; i16++) {
            if ((i15 & 1) != 0) {
                missingFields.add(descriptor.f104660e[i16]);
            }
            i15 >>>= 1;
        }
        String serialName = descriptor.f104656a;
        Intrinsics.checkNotNullParameter(missingFields, "missingFields");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        throw new MissingFieldException(missingFields.size() == 1 ? a.a.q(new StringBuilder("Field '"), (String) missingFields.get(0), "' is required for type with serial name '", serialName, "', but it was missing") : "Fields " + missingFields + " are required for type with serial name '" + serialName + "', but they were missing", null, missingFields);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(s90.t0 r20, u2.q r21, kotlin.jvm.functions.Function0 r22, kotlin.jvm.functions.Function0 r23, kotlin.jvm.functions.Function0 r24, kotlin.jvm.functions.Function0 r25, yl1.d r26, float r27, i2.o r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.t.c(s90.t0, u2.q, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, yl1.d, float, i2.o, int, int):void");
    }

    public static void c0(jw0.d dVar, nr0.m mVar) {
        dVar.f77661c1 = mVar;
    }

    public static od2.a c1() {
        return new od2.a("transparentHighlights", "vec4 {{name}}(FragmentEffectInput data) {\n    float fade = {{settings.fade}};\n\n    float bw = length(data.color.rgb) / sqrt(3.0);\n    float alpha = smoothstep(fade, -fade, bw - {{settings.threshold}});\n\n    return data.color * alpha;\n}", new q0(z0.g(new Pair(r72.q.FADE_ALIAS, jq.b.n(0.15f, null, 0.0f, 1.0f)), new Pair("threshold", jq.b.n(0.5f, null, 0.0f, 1.0f)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(java.lang.String r25, kotlin.jvm.functions.Function0 r26, u2.q r27, boolean r28, yl1.d r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.t.d(java.lang.String, kotlin.jvm.functions.Function0, u2.q, boolean, yl1.d, i2.o, int, int):void");
    }

    public static void d0(tj0.k kVar, zf0.f fVar) {
        kVar.f117875a1 = fVar;
    }

    public static od2.a d1() {
        return new od2.a("transparentShadows", "vec4 {{name}}(FragmentEffectInput data) {\n    float fade = {{settings.fade}};\n\n    float bw = length(data.color.rgb) / sqrt(3.0);\n    float alpha = smoothstep(-fade, fade, bw - {{settings.threshold}});\n\n    return data.color * alpha;\n}", new q0(z0.g(new Pair(r72.q.FADE_ALIAS, jq.b.n(0.15f, null, 0.0f, 1.0f)), new Pair("threshold", jq.b.n(0.5f, null, 0.0f, 1.0f)))));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(rm1.q r20, kotlin.jvm.functions.Function0 r21, u2.q r22, boolean r23, boolean r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kg.t.e(rm1.q, kotlin.jvm.functions.Function0, u2.q, boolean, boolean, i2.o, int, int):void");
    }

    public static void e0(tj0.k kVar, rg0.s sVar) {
        kVar.Z0 = sVar;
    }

    public static final void e1(GestaltIcon gestaltIcon) {
        Intrinsics.checkNotNullParameter(gestaltIcon, "<this>");
        gestaltIcon.g2(rm1.a.f108690l);
    }

    public static final qa2.n f(Context context, d0 d0Var) {
        y32.f fVar = y32.f.UNKNOWN;
        return new qa2.n(new b20.c(wa2.i.a(new qa2.f(d0Var, fVar, (nr0.b) null, 12).a(new yk1.a(context.getResources(), context.getTheme())).f103320a, false, false, true, true, false, true, false, null, null, null, fVar, 2074607354, -16779265, 1015), 0));
    }

    public static void f0(b1 b1Var, il1.a aVar) {
        b1Var.f139787l0 = aVar;
    }

    public static final void f1(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i13) {
        if (i13 < 0 || byteBuffer2.remaining() < i13 || byteBuffer3.remaining() < i13 || byteBuffer.remaining() < i13) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final String g(File file, File file2, String str) {
        StringBuilder sb3 = new StringBuilder(file.toString());
        if (file2 != null) {
            sb3.append(" -> " + file2);
        }
        if (str != null) {
            sb3.append(": ".concat(str));
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static void g0(ow1.g gVar, pb0.d dVar) {
        gVar.f97941j0 = dVar;
    }

    public static final byte[] g1(int i13, int i14, byte[] bArr, byte[] bArr2) {
        if (i14 < 0 || bArr.length - i14 < i13 || bArr2.length - i14 < 0) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i14];
        for (int i15 = 0; i15 < i14; i15++) {
            bArr3[i15] = (byte) (bArr[i15 + i13] ^ bArr2[i15]);
        }
        return bArr3;
    }

    public static void h(x92.b bVar) {
        a0.b(bVar);
        bVar.e("board.type");
        bVar.e("board.pin_count");
        bVar.e("board.owner()");
        bVar.h("board.images", "236x");
        g3.r(bVar);
        c3.g(bVar);
        bVar.e("shoprecommendationcollection.type");
    }

    public static void h0(qv0.g gVar, zp.j jVar) {
        gVar.C0 = jVar;
    }

    public static final byte[] h1(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return g1(0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static void i(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr3[0] = jArr[0] ^ jArr2[0];
        jArr3[1] = jArr[1] ^ jArr2[1];
        jArr3[2] = jArr[2] ^ jArr2[2];
        jArr3[3] = jArr[3] ^ jArr2[3];
        jArr3[4] = jArr[4] ^ jArr2[4];
        jArr3[5] = jArr[5] ^ jArr2[5];
        jArr3[6] = jArr[6] ^ jArr2[6];
        jArr3[7] = jArr2[7] ^ jArr[7];
    }

    public static void i0(qv0.g gVar, ag1.h hVar) {
        gVar.B0 = hVar;
    }

    public static final void j(x92.b bVar) {
        n60.o.C(bVar, "<this>", "unifiedcommentspreview.id", "unifiedcommentspreview.type", "unifiedcommentspreview.creator_reply()");
        n60.o.w(bVar, "unifiedcommentspreview.aggregated_comment()", "unifiedcommentspreview.user_did_it_data()", "unifiedcommentspreview.display_did_its()", "userdiditdata.id");
        bVar.e("userdiditdata.user()");
        bVar.e("userdiditdata.details");
        bVar.h("userdiditdata.images", "1080x");
        n60.o.w(bVar, "userdiditdata.reaction_by_me", "userdiditdata.reaction_counts", "aggregatedcomment.id", "aggregatedcomment.user()");
        n60.o.w(bVar, "aggregatedcomment.text", "aggregatedcomment.is_translatable", "aggregatedcomment.tags", "aggregatedcomment.reaction_by_me");
        n60.o.w(bVar, "aggregatedcomment.marked_helpful_by_me", "aggregatedcomment.reaction_counts", "aggregatedcomment.media()", "commentmedia.sticker()");
        bVar.e("commentsticker.image_url");
        bVar.e("aggregatedcomment.attached_pin()");
        pp2.a.g(bVar);
    }

    public static void j0(o0 o0Var, tb tbVar) {
        o0Var.f103158i0 = tbVar;
    }

    public static final int k(int i13) {
        return Color.argb(ql2.s.g((int) (Color.alpha(i13) * 0.25f), 0, 255), Color.red(i13), Color.green(i13), Color.blue(i13));
    }

    public static void k0(jw0.d dVar, v1 v1Var) {
        dVar.f77660b1 = v1Var;
    }

    public static od2.a l() {
        PointF from = new PointF(0.0f, 0.0f);
        PointF to3 = new PointF(1.0f, 1.0f);
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to3, "to");
        hd2.f fVar = new hd2.f(from, to3);
        new pd2.q(fVar, null);
        RectF rect = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        Intrinsics.checkNotNullParameter(rect, "rect");
        return new od2.a("alphaGradient", "vec4 {{name}}(FragmentEffectInput data) {\n    vec2 p1 = {{settings.direction}}.xy;\n    vec2 p2 = {{settings.direction}}.zw;\n\n    vec2 uv = data.texturePosition;\n\n    float diff1 = dot(uv - p1, p2 - p1) - 1e-6;\n    float diff2 = dot(p2 - p1, p2 - p1) + 1e-6;\n\n    float gradientAlpha = clamp(diff1 / diff2, 0.0, 1.0);\n    gradientAlpha = pow(gradientAlpha, 2.2);\n\n    return data.color * gradientAlpha;\n}", new q0(y0.b(new Pair("direction", new pd2.q(fVar, new qd2.x(rect))))));
    }

    public static void l0(iq0.a aVar, m60.w wVar) {
        aVar.f73387a1 = wVar;
    }

    public static final void m(GestaltText gestaltText, String description, Function1 function1) {
        Intrinsics.checkNotNullParameter(gestaltText, "<this>");
        Intrinsics.checkNotNullParameter(description, "description");
        if ((!kotlin.text.z.j(description) ? description : null) == null) {
            a0.k0(gestaltText);
            return;
        }
        a0.w1(gestaltText);
        if (!StringsKt.E(description, "<a href", false)) {
            a0.q(gestaltText, bs1.c.h2(description));
            return;
        }
        CharSequence a03 = j1.a0(description);
        Intrinsics.checkNotNullExpressionValue(a03, "fromHtml(...)");
        a0.q(gestaltText, bs1.c.h2(a03));
        if (gestaltText.getLinksClickable()) {
            gestaltText.setMovementMethod(new bd1.f(function1));
        }
    }

    public static void m0(ow1.g gVar, gw1.f fVar) {
        gVar.f97942k0 = fVar;
    }

    public static void n0(tj0.k kVar, s3 s3Var) {
        kVar.f117879e1 = s3Var;
    }

    public static final wl1.c o(i0 i0Var, i0 messageText, i0 i0Var2, i0 i0Var3, rm1.q qVar, rm1.c iconColor, String str, Boolean bool, boolean z13, boolean z14, boolean z15, int i13, fm1.c visibility) {
        Intrinsics.checkNotNullParameter(messageText, "messageText");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        h0 h0Var = h0.f120562a;
        rn1.a aVar = new rn1.a(i0Var == null ? h0Var : i0Var, null, null, null, vn1.g.HEADING_600, 0, i0Var == null ? fm1.c.GONE : fm1.c.VISIBLE, null, null, null, z14, wl1.t.bannerOverlay_title, null, null, null, false, null, null, 2093998);
        int i14 = wl1.t.bannerOverlay_message;
        fm1.c cVar = fm1.c.VISIBLE;
        rn1.a aVar2 = new rn1.a(messageText, null, null, null, vn1.g.BODY_300, 0, cVar, null, null, null, z15, i14, null, null, null, false, null, null, 2093998);
        cm1.d dVar = new cm1.d(new yl1.b(i0Var2 == null ? h0Var : i0Var2, false, (i0Var2 == null || cVar == null) ? fm1.c.GONE : cVar, null, yl1.d.PRIMARY.getColorPalette(), null, null, null, wl1.t.bannerOverlay_primary_action_button, null, 746), new yl1.b(i0Var3 == null ? h0Var : i0Var3, false, (i0Var3 == null || cVar == null) ? fm1.c.GONE : cVar, null, yl1.d.SECONDARY.getColorPalette(), null, null, null, wl1.t.bannerOverlay_secondary_action_button, null, 746), null, null, null, (i0Var2 == null && i0Var3 == null) ? fm1.c.GONE : cVar, wl1.t.bannerOverlay_button_group, 28);
        rm1.n nVar = rm1.n.CANCEL;
        om1.e eVar = om1.e.MD;
        if (!z13) {
            cVar = fm1.c.GONE;
        }
        return new wl1.c(aVar, aVar2, dVar, (bool == null || !bool.booleanValue()) ? qVar != null ? new wl1.d(qVar, iconColor) : str != null ? new wl1.e(str) : wl1.g.f130190a : wl1.f.f130189a, new om1.c(nVar, eVar, om1.f.TRANSPARENT_DARK_GRAY, cVar, null, false, wl1.t.bannerOverlay_dismiss_icon_button, 752), i13, visibility);
    }

    public static void o0(jw0.d dVar, m60.g0 g0Var) {
        dVar.Y0 = g0Var;
    }

    public static wl1.c p(i0 i0Var, u50.f0 f0Var, i0 i0Var2, i0 i0Var3, rm1.q qVar, rm1.c cVar, String str, Boolean bool, boolean z13, int i13) {
        fm1.c cVar2;
        String str2 = (i13 & 64) != 0 ? null : str;
        Boolean bool2 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? Boolean.FALSE : bool;
        switch (GestaltBannerOverlay.f49304m.f15494a) {
            case 4:
                cVar2 = GestaltAvatarGroup.f49254h;
                break;
            default:
                cVar2 = GestaltBannerOverlay.f49306o;
                break;
        }
        return o(i0Var, f0Var, i0Var2, i0Var3, qVar, cVar, str2, bool2, z13, false, true, Integer.MIN_VALUE, cVar2);
    }

    public static void p0(jw0.d dVar, x12.a aVar) {
        dVar.Z0 = aVar;
    }

    public static final int q(int i13, int i14) {
        return ((i13 / 2) - (i14 / 2)) / 10;
    }

    public static void q0(iq0.a aVar, i2 i2Var) {
        aVar.Y0 = i2Var;
    }

    public static final void r(Function1 function1, Object obj, CoroutineContext coroutineContext) {
        UndeliveredElementException s13 = s(function1, obj, null);
        if (s13 != null) {
            kh2.j1.l0(coroutineContext, s13);
        }
    }

    public static void r0(jw0.d dVar, i2 i2Var) {
        dVar.X0 = i2Var;
    }

    public static final UndeliveredElementException s(Function1 function1, Object obj, UndeliveredElementException undeliveredElementException) {
        try {
            function1.invoke(obj);
        } catch (Throwable th3) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th3) {
                return new UndeliveredElementException(a.a.i("Exception in undelivered element handler for ", obj), th3);
            }
            xk2.f.a(undeliveredElementException, th3);
        }
        return undeliveredElementException;
    }

    public static void s0(tj0.k kVar, i2 i2Var) {
        kVar.f117877c1 = i2Var;
    }

    public static void t0(jw0.d dVar, nx.f0 f0Var) {
        dVar.f77659a1 = f0Var;
    }

    public static byte[] u(byte[]... bArr) {
        int i13 = 0;
        for (byte[] bArr2 : bArr) {
            if (i13 > Integer.MAX_VALUE - bArr2.length) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i13 += bArr2.length;
        }
        byte[] bArr3 = new byte[i13];
        int i14 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i14, bArr4.length);
            i14 += bArr4.length;
        }
        return bArr3;
    }

    public static void u0(n61.b bVar, so.c3 c3Var) {
        bVar.f89324j0 = c3Var;
    }

    public static final ou1.f v() {
        Context context = kb0.a.f79058b;
        ou1.g gVar = (ou1.g) ((oa) ((so1.b) ep.b.g(so1.b.class))).Cc.get();
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        ou1.i routerType = ou1.i.CREATOR;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(routerType, "routerType");
        ou1.h hVar = (ou1.h) gVar.f97718a.get(routerType);
        if (hVar != null) {
            return (ou1.f) hVar;
        }
        throw new IllegalStateException("Router not registered for " + routerType);
    }

    public static void v0(qv0.g gVar, so.k kVar) {
        gVar.f105184z0 = kVar;
    }

    public static void w(Canvas canvas, boolean z13) {
        Method method;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            b3.v.f21375a.a(canvas, z13);
            return;
        }
        if (!f79383c) {
            try {
                if (i13 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f79381a = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f79382b = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f79381a = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f79382b = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f79381a;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f79382b;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f79383c = true;
        }
        if (z13) {
            try {
                Method method4 = f79381a;
                if (method4 != null) {
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z13 || (method = f79382b) == null) {
            return;
        }
        method.invoke(canvas, new Object[0]);
    }

    public static void w0(b1 b1Var, so.i0 i0Var) {
        b1Var.f139786k0 = i0Var;
    }

    public static od2.a x() {
        return new od2.a(r72.q.FADE_ALIAS, "vec4 {{name}}(FragmentEffectInput data) {\n    vec2 animationStops = vec2(0.0, 1.0);\n\n    float stage = sin({{settings.speed}} * data.time);\n    data.color *= smoothstep(\n        0.8 * animationStops.x - 1.0,\n        0.8 * animationStops.y + 0.2,\n        stage\n    );\n\n    return data.color;\n}", new q0(y0.b(new Pair("speed", ld2.a.f82993a))));
    }

    public static void x0(b51.e eVar, uk1.e eVar2) {
        eVar.f21996j0 = eVar2;
    }

    public static JobScheduler y(JobScheduler jobScheduler) {
        JobScheduler forNamespace;
        Intrinsics.checkNotNullParameter(jobScheduler, "jobScheduler");
        forNamespace = jobScheduler.forNamespace("androidx.work.systemjobscheduler");
        Intrinsics.checkNotNullExpressionValue(forNamespace, "jobScheduler.forNamespace(WORKMANAGER_NAMESPACE)");
        return forNamespace;
    }

    public static void y0(z zVar, uk1.e eVar) {
        zVar.f22581j0 = eVar;
    }

    public static final Object z(Bundle bundle, String key, Function2 getter) {
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(getter, "getter");
        Object invoke = getter.invoke(bundle, key);
        bundle.remove(key);
        return invoke;
    }

    public static void z0(iq0.a aVar, uk1.e eVar) {
        aVar.X0 = eVar;
    }
}
