package kh2;

import a.cb;
import ads_mobile_sdk.aq;
import ads_mobile_sdk.ba0;
import ads_mobile_sdk.eq;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.RemoteException;
import android.util.Size;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.api.model.c6;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.h00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.l00;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.oq;
import com.pinterest.api.model.ul;
import com.pinterest.api.model.up;
import com.pinterest.api.model.x5;
import com.pinterest.api.model.xl;
import com.pinterest.api.model.y5;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import com.pinterest.oneBarLibrary.modals.model.BodyTypeFilterBottomSheetModel;
import com.pinterest.oneBarLibrary.modules.model.AnnotatedTextParcelable;
import com.pinterest.oneBarLibrary.modules.model.FilteroptionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleactionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduledisplayParcelable;
import i2.y3;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import so.d8;
import so.f7;
import so.ia;
import so.oa;
import so.p3;
import so.r8;
import so.w6;

/* loaded from: classes4.dex */
public abstract class s0 implements pq2.p {

    /* renamed from: a */
    public static final /* synthetic */ int f79684a = 0;

    public static final float A(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (i13 > 0) {
            return resources.getDimensionPixelSize(i13);
        }
        return 0.0f;
    }

    public static final boolean A0(int i13) {
        return i13 == i32.l.ANDROID_BOARDLESS_PREVIEW_MODAL_ACTION_PROMPT.getValue() || i13 == i32.l.ANDROID_BOARD_PREVIEW_MODAL_ACTION_PROMPT.getValue() || i13 == i32.l.ANDROID_BOARD_PREVIEW_MODAL_ACTION_PROMPT_CORE.getValue();
    }

    public static final boolean B(int i13, int i14) {
        return i13 == i14;
    }

    public static final boolean B0(int i13) {
        return i13 == i32.l.ANDROID_BOARD_PREVIEW_INVITE_UPSELL.getValue() || i13 == i32.l.ANDROID_BOARDLESS_PREVIEW_INVITE_UPSELL.getValue();
    }

    public static e7.a C(a7.n0 n0Var, String str) {
        int i13 = 0;
        while (true) {
            a7.m0[] m0VarArr = n0Var.f1152a;
            if (i13 >= m0VarArr.length) {
                return null;
            }
            a7.m0 m0Var = m0VarArr[i13];
            if (m0Var instanceof e7.a) {
                e7.a aVar = (e7.a) m0Var;
                if (aVar.f57520a.equals(str)) {
                    return aVar;
                }
            }
            i13++;
        }
    }

    public static final boolean C0(int i13) {
        return i13 == i32.l.ANDROID_PIN_SHARE_UPSELL_AFTER_REACT.getValue();
    }

    public static final ActivityManager D(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (!(systemService instanceof ActivityManager)) {
                systemService = null;
            }
            return (ActivityManager) systemService;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static final boolean D0(Date date, Date otherDate) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(otherDate, "otherDate");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(otherDate);
        return calendar.get(6) == calendar2.get(6) && calendar.get(1) == calendar2.get(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final uj2.b0 E(android.app.Application r18, android.content.Context r19, com.pinterest.api.model.tp r20, com.pinterest.api.model.so r21, com.pinterest.api.model.to r22) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.E(android.app.Application, android.content.Context, com.pinterest.api.model.tp, com.pinterest.api.model.so, com.pinterest.api.model.to):uj2.b0");
    }

    public static final boolean E0(Date date, Date otherDate) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Intrinsics.checkNotNullParameter(otherDate, "otherDate");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(otherDate);
        return calendar.get(2) == calendar2.get(2) && calendar.get(1) == calendar2.get(1);
    }

    public static final double F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File dir = context.getDir("story_pin_adjusted_images", 0);
        int i13 = ap2.c.f20329a;
        if (!dir.exists()) {
            throw new IllegalArgumentException(dir + " does not exist");
        }
        if (dir.isDirectory()) {
            return ap2.c.b(dir) / vb0.m.MEGABYTE.getBytes$common_release();
        }
        throw new IllegalArgumentException(dir + " is not a directory");
    }

    public static final boolean F0(c6 c6Var) {
        return (c6Var != null ? c6Var.L() : null) != null;
    }

    public static final String G(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof oq) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.Z(arrayList, " ", null, null, 0, null, up.f42621i, 30);
    }

    public static final void G0(Context context, f30 pin, String recipeCopyText, int i13, String str, so.p ingredientsInviteCodeHandlerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(recipeCopyText, "recipeCopyText");
        Intrinsics.checkNotNullParameter(ingredientsInviteCodeHandlerFactory, "ingredientsInviteCodeHandlerFactory");
        SendableObject sendableObject = new SendableObject(pin.getUid(), 0);
        p32.c cVar = p32.c.MESSAGE;
        r8 r8Var = ingredientsInviteCodeHandlerFactory.f114048a;
        nx.d0 d0Var = (nx.d0) r8Var.f114090a.f113817n2.get();
        oa oaVar = r8Var.f114090a;
        i91.p pVar = new i91.p(context, sendableObject, cVar, recipeCopyText, str, d0Var, (i92.k) oaVar.f113921t1.get(), (u20.d) oaVar.Y5.get(), (tb0.h) oaVar.f113797m0.get());
        e0.t.f56747e = i13;
        pVar.b(sendableObject, cVar, p32.f.COPY_LINK);
    }

    public static final int H(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return c0.d.b0(0.5625f, hf0.b.d(activity) - hf0.b.f());
    }

    public static final t10.f H0(t10.f fVar, t10.g translation) {
        String str;
        t10.a aVar;
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        Intrinsics.checkNotNullParameter(translation, "translation");
        ArrayList arrayList = null;
        List list = fVar.f115778j;
        List list2 = translation.f115787b;
        if (list2 != null) {
            List list3 = list2;
            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
            int i13 = 0;
            for (Object obj : list3) {
                int i14 = i13 + 1;
                if (i13 < 0) {
                    kotlin.collections.f0.p();
                    throw null;
                }
                t10.a aVar2 = (t10.a) obj;
                if (list == null || (aVar = (t10.a) list.get(i13)) == null || (str = aVar.f115765b) == null) {
                    str = aVar2.f115765b;
                }
                String str2 = aVar2.f115764a;
                List ingredients = aVar2.f115766c;
                Intrinsics.checkNotNullParameter(ingredients, "ingredients");
                arrayList2.add(new t10.a(str2, str, ingredients));
                i13 = i14;
            }
            arrayList = arrayList2;
        }
        String str3 = translation.f115786a;
        if (str3 == null) {
            str3 = fVar.f115782n;
        }
        String str4 = str3;
        List list4 = arrayList == null ? list : arrayList;
        List diets = translation.f115788c;
        if (diets == null) {
            diets = fVar.f115780l;
        }
        String recipeYield = translation.f115789d;
        if (recipeYield == null) {
            recipeYield = fVar.f115783o;
        }
        String id3 = fVar.f115781m;
        String _pinUid = fVar.f115776h;
        Intrinsics.checkNotNullParameter(_pinUid, "_pinUid");
        Intrinsics.checkNotNullParameter(diets, "diets");
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(recipeYield, "recipeYield");
        return new t10.f(fVar.f115770b, fVar.f115771c, fVar.f115772d, fVar.f115773e, fVar.f115774f, fVar.f115775g, _pinUid, fVar.f115777i, list4, fVar.f115779k, diets, id3, str4, recipeYield, fVar.f115784p, fVar.f115785q);
    }

    public static final Date I(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, 1);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static hr1.h I0(ia iaVar, mr1.c cVar, uj2.q qVar, String str) {
        return new hr1.h(iaVar, cVar, qVar, str);
    }

    public static final Date J(Date date) {
        Intrinsics.checkNotNullParameter(date, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(5, -1);
        Date time = calendar.getTime();
        Intrinsics.checkNotNullExpressionValue(time, "getTime(...)");
        return time;
    }

    public static d9.e J0(int i13, d7.d0 d0Var) {
        int k13 = d0Var.k();
        if (d0Var.k() == 1684108385) {
            d0Var.L(8);
            String u13 = d0Var.u(k13 - 16);
            return new d9.e("und", u13, u13);
        }
        d7.u.g("MetadataUtil", "Failed to parse comment attribute: " + e7.e.h(i13));
        return null;
    }

    public static final xe0.a K(float f13, boolean z13, boolean z14, boolean z15, boolean z16) {
        float f14 = z13 ? f13 : 0.0f;
        float f15 = z14 ? f13 : 0.0f;
        float f16 = z15 ? f13 : 0.0f;
        if (!z16) {
            f13 = 0.0f;
        }
        return new xe0.a(f14, f15, f16, f13);
    }

    public static d9.a K0(d7.d0 d0Var) {
        int k13 = d0Var.k();
        if (d0Var.k() != 1684108385) {
            d7.u.g("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int k14 = d0Var.k();
        byte[] bArr = j9.e.f74965a;
        int i13 = k14 & 16777215;
        String str = i13 == 13 ? "image/jpeg" : i13 == 14 ? "image/png" : null;
        if (str == null) {
            cb.t("Unrecognized cover art flags: ", i13, "MetadataUtil");
            return null;
        }
        d0Var.L(4);
        int i14 = k13 - 16;
        byte[] bArr2 = new byte[i14];
        d0Var.i(bArr2, 0, i14);
        return new d9.a(3, str, null, bArr2);
    }

    public static /* synthetic */ xe0.a L(float f13, boolean z13, boolean z14, int i13) {
        if ((i13 & 2) != 0) {
            z13 = false;
        }
        if ((i13 & 4) != 0) {
            z14 = false;
        }
        return K(f13, z13, z14, false, false);
    }

    public static d9.o L0(int i13, d7.d0 d0Var, String str) {
        int k13 = d0Var.k();
        if (d0Var.k() == 1684108385 && k13 >= 22) {
            d0Var.L(10);
            int E = d0Var.E();
            if (E > 0) {
                String d2 = a.a.d("", E);
                int E2 = d0Var.E();
                if (E2 > 0) {
                    d2 = d2 + "/" + E2;
                }
                return new d9.o(str, null, pk.c1.v(d2));
            }
        }
        d7.u.g("MetadataUtil", "Failed to parse index/count attribute: " + e7.e.h(i13));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r6 != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        r3 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0044, code lost:
    
        if (r7 != false) goto L78;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static xe0.a M(android.content.Context r2, float r3, boolean r4, boolean r5, boolean r6, boolean r7, int r8) {
        /*
            r0 = r8 & 4
            r1 = 0
            if (r0 == 0) goto L6
            r4 = r1
        L6:
            r0 = r8 & 8
            if (r0 == 0) goto Lb
            r5 = r1
        Lb:
            r0 = r8 & 16
            if (r0 == 0) goto L10
            r6 = r1
        L10:
            r8 = r8 & 32
            if (r8 == 0) goto L15
            r7 = r1
        L15:
            java.lang.String r8 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r8)
            boolean r2 = df.j1.Y0(r2)
            r8 = 0
            if (r2 == 0) goto L35
            if (r5 == 0) goto L25
            r2 = r3
            goto L26
        L25:
            r2 = r8
        L26:
            if (r4 == 0) goto L2a
            r4 = r3
            goto L2b
        L2a:
            r4 = r8
        L2b:
            if (r7 == 0) goto L2f
            r5 = r3
            goto L30
        L2f:
            r5 = r8
        L30:
            if (r6 == 0) goto L33
            goto L46
        L33:
            r3 = r8
            goto L46
        L35:
            if (r4 == 0) goto L39
            r2 = r3
            goto L3a
        L39:
            r2 = r8
        L3a:
            if (r5 == 0) goto L3e
            r4 = r3
            goto L3f
        L3e:
            r4 = r8
        L3f:
            if (r6 == 0) goto L43
            r5 = r3
            goto L44
        L43:
            r5 = r8
        L44:
            if (r7 == 0) goto L33
        L46:
            xe0.a r6 = new xe0.a
            r6.<init>(r2, r4, r5, r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.M(android.content.Context, float, boolean, boolean, boolean, boolean, int):xe0.a");
    }

    public static int M0(d7.d0 d0Var) {
        int k13 = d0Var.k();
        if (d0Var.k() == 1684108385) {
            d0Var.L(8);
            int i13 = k13 - 16;
            if (i13 == 1) {
                return d0Var.y();
            }
            if (i13 == 2) {
                return d0Var.E();
            }
            if (i13 == 3) {
                return d0Var.B();
            }
            if (i13 == 4 && (d0Var.h() & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0) {
                return d0Var.C();
            }
        }
        d7.u.g("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static final xe0.a N(int i13, Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new xe0.a(A(i13, resources), A(i13, resources), A(i13, resources), A(i13, resources));
    }

    public static d9.j N0(int i13, String str, d7.d0 d0Var, boolean z13, boolean z14) {
        int M0 = M0(d0Var);
        if (z14) {
            M0 = Math.min(1, M0);
        }
        if (M0 >= 0) {
            return z13 ? new d9.o(str, null, pk.c1.v(Integer.toString(M0))) : new d9.e("und", str, Integer.toString(M0));
        }
        d7.u.g("MetadataUtil", "Failed to parse uint8 attribute: " + e7.e.h(i13));
        return null;
    }

    public static void O(ev.h hVar, lh0.g gVar) {
        hVar.f60210l0 = gVar;
    }

    public static e7.a O0(int i13, d7.d0 d0Var, String str) {
        while (true) {
            int i14 = d0Var.f53807b;
            if (i14 >= i13) {
                return null;
            }
            int k13 = d0Var.k();
            if (d0Var.k() == 1684108385) {
                int k14 = d0Var.k();
                int k15 = d0Var.k();
                int i15 = k13 - 16;
                byte[] bArr = new byte[i15];
                d0Var.i(bArr, 0, i15);
                return new e7.a(str, bArr, k15, k14);
            }
            d0Var.K(i14 + k13);
        }
    }

    public static void P(q71.a aVar, vy.m mVar) {
        aVar.W0 = mVar;
    }

    public static d9.o P0(int i13, d7.d0 d0Var, String str) {
        int k13 = d0Var.k();
        if (d0Var.k() == 1684108385) {
            d0Var.L(8);
            return new d9.o(str, null, pk.c1.v(d0Var.u(k13 - 16)));
        }
        d7.u.g("MetadataUtil", "Failed to parse text attribute: " + e7.e.h(i13));
        return null;
    }

    public static void Q(px1.f fVar, so.e1 e1Var) {
        fVar.f101649k0 = e1Var;
    }

    public static final Intent Q0(Context context, com.bugsnag.android.n3 n3Var, IntentFilter intentFilter, com.bugsnag.android.u1 u1Var) {
        try {
            return Build.VERSION.SDK_INT >= 34 ? context.registerReceiver(n3Var, intentFilter, 2) : context.registerReceiver(n3Var, intentFilter);
        } catch (RemoteException e13) {
            if (u1Var == null) {
                return null;
            }
            u1Var.a("Failed to register receiver", e13);
            return null;
        } catch (IllegalArgumentException e14) {
            if (u1Var == null) {
                return null;
            }
            u1Var.a("Failed to register receiver", e14);
            return null;
        } catch (SecurityException e15) {
            if (u1Var == null) {
                return null;
            }
            u1Var.a("Failed to register receiver", e15);
            return null;
        }
    }

    public static void R(im0.d dVar, gi.m mVar) {
        dVar.f72608l0 = mVar;
    }

    public static final Resources R0(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.m(AndroidCompositionLocals_androidKt.f17454a);
        return ((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b)).getResources();
    }

    public static void S(im0.d dVar, x02.x0 x0Var) {
        dVar.f72607k0 = x0Var;
    }

    public static ArrayList S0(ByteBuffer byteBuffer) {
        int remaining;
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (asReadOnlyBuffer.hasRemaining()) {
            byte b13 = asReadOnlyBuffer.get();
            int i13 = (b13 >> 3) & 15;
            if (((b13 >> 2) & 1) != 0) {
                asReadOnlyBuffer.get();
            }
            if (((b13 >> 1) & 1) != 0) {
                remaining = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    byte b14 = asReadOnlyBuffer.get();
                    remaining |= (b14 & Byte.MAX_VALUE) << (i14 * 7);
                    if ((b14 & 128) == 0) {
                        break;
                    }
                }
            } else {
                remaining = asReadOnlyBuffer.remaining();
            }
            ByteBuffer duplicate = asReadOnlyBuffer.duplicate();
            duplicate.limit(asReadOnlyBuffer.position() + remaining);
            arrayList.add(new e7.s(i13, duplicate));
            asReadOnlyBuffer.position(asReadOnlyBuffer.position() + remaining);
        }
        return arrayList;
    }

    public static void T(cp.u uVar, no1.d dVar) {
        uVar.f52975b1 = dVar;
    }

    public static ei2.q T0(ei2.v vVar, xf2.q0 schemaType, long j13) {
        oi2.a autoTerminationMode = oi2.a.NONE;
        Intrinsics.checkNotNullParameter(vVar, "<this>");
        Intrinsics.checkNotNullParameter(schemaType, "schemaType");
        Intrinsics.checkNotNullParameter(autoTerminationMode, "autoTerminationMode");
        ei2.q c03 = kg.p.c0(vVar, schemaType.f134890b, autoTerminationMode, null, Long.valueOf(j13), schemaType.f134889a, 100);
        if (c03 == null) {
            return null;
        }
        for (Map.Entry entry : kotlin.collections.z0.j(schemaType.a(), schemaType.f134891c).entrySet()) {
            ((ei2.k) c03).j((String) entry.getKey(), (String) entry.getValue());
        }
        return c03;
    }

    public static void U(lq0.v0 v0Var, no1.e eVar) {
        v0Var.T0 = eVar;
    }

    public static final cz.b U0(gz.u uVar) {
        cz.b bVar;
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (Intrinsics.d(uVar, gz.q.f66354a)) {
            return new cz.b(null, null, 2);
        }
        if (uVar instanceof gz.s) {
            bVar = new cz.b(kotlin.collections.e0.b(Integer.valueOf(((gz.s) uVar).f66356a)), null, 2);
        } else if (uVar instanceof gz.r) {
            bVar = new cz.b(((gz.r) uVar).f66355a, null, 2);
        } else {
            if (!(uVar instanceof gz.t)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = new cz.b(null, kotlin.collections.e0.b(((gz.t) uVar).f66357a), 1);
        }
        return bVar;
    }

    public static void V(lq0.v0 v0Var, q12.b bVar) {
        v0Var.U0 = bVar;
    }

    public static final vv1.a V0(BodyTypeFilterBottomSheetModel bodyTypeFilterBottomSheetModel) {
        Intrinsics.checkNotNullParameter(bodyTypeFilterBottomSheetModel, "<this>");
        List list = bodyTypeFilterBottomSheetModel.f49990d;
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(W0((OnebarmoduleParcelable) it.next()));
        }
        ArrayList H0 = CollectionsKt.H0(arrayList);
        Map map = bodyTypeFilterBottomSheetModel.f49993g;
        Intrinsics.g(map, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>{ com.pinterest.analytics.AuxDataKt.AuxData }");
        yj1.d dVar = new yj1.d(bodyTypeFilterBottomSheetModel, 29);
        String str = bodyTypeFilterBottomSheetModel.f49992f;
        List list2 = bodyTypeFilterBottomSheetModel.f49995i;
        return new vv1.a(bodyTypeFilterBottomSheetModel.f49987a, bodyTypeFilterBottomSheetModel.f49988b, bodyTypeFilterBottomSheetModel.f49989c, H0, dVar, bodyTypeFilterBottomSheetModel.f49991e, str, (HashMap) map, list2);
    }

    public static void W(cp.u uVar, fp.b bVar) {
        uVar.X0 = bVar;
    }

    public static final g00 W0(OnebarmoduleParcelable onebarmoduleParcelable) {
        Intrinsics.checkNotNullParameter(onebarmoduleParcelable, "<this>");
        d00 d00Var = new d00(0);
        d00Var.f36596a = onebarmoduleParcelable.f50011a;
        boolean[] zArr = d00Var.f36605j;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
        d00Var.f36597b = onebarmoduleParcelable.f50012b;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
        OnebarmoduleactionParcelable onebarmoduleactionParcelable = onebarmoduleParcelable.f50013c;
        d00Var.b(onebarmoduleactionParcelable != null ? X0(onebarmoduleactionParcelable) : null);
        d00Var.f36599d = onebarmoduleParcelable.f50014d;
        boolean[] zArr2 = d00Var.f36605j;
        if (zArr2.length > 3) {
            zArr2[3] = true;
        }
        d00Var.f36600e = onebarmoduleParcelable.f50015e;
        if (zArr2.length > 4) {
            zArr2[4] = true;
        }
        OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = onebarmoduleParcelable.f50016f;
        d00Var.c(onebarmoduledisplayParcelable != null ? Y0(onebarmoduledisplayParcelable) : null);
        d00Var.f36602g = onebarmoduleParcelable.f50017g;
        boolean[] zArr3 = d00Var.f36605j;
        if (zArr3.length > 6) {
            zArr3[6] = true;
        }
        d00Var.f36603h = onebarmoduleParcelable.f50018h;
        if (zArr3.length > 7) {
            zArr3[7] = true;
        }
        d00Var.f36604i = onebarmoduleParcelable.f50019i;
        if (zArr3.length > 8) {
            zArr3[8] = true;
        }
        g00 a13 = d00Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static void X(com.pinterest.schoolTeenPrompt.g gVar, rg0.s sVar) {
        gVar.f50467h0 = sVar;
    }

    public static final k00 X0(OnebarmoduleactionParcelable onebarmoduleactionParcelable) {
        y5 y5Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Intrinsics.checkNotNullParameter(onebarmoduleactionParcelable, "<this>");
        int i13 = 0;
        h00 h00Var = new h00(i13);
        h00Var.f38210a = onebarmoduleactionParcelable.f50020a;
        boolean[] zArr = h00Var.f38224o;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
        h00Var.f38211b = onebarmoduleactionParcelable.f50021b;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
        AnnotatedTextParcelable annotatedTextParcelable = onebarmoduleactionParcelable.f50022c;
        if (annotatedTextParcelable != null) {
            Intrinsics.checkNotNullParameter(annotatedTextParcelable, "<this>");
            x5 x5Var = new x5(0);
            String str = annotatedTextParcelable.f50000a;
            x5Var.f43590a = str;
            boolean[] zArr2 = x5Var.f43594e;
            if (zArr2.length > 0) {
                zArr2[0] = true;
            }
            String str2 = annotatedTextParcelable.f50001b;
            x5Var.f43591b = str2;
            if (zArr2.length > 1) {
                zArr2[1] = true;
            }
            List list = annotatedTextParcelable.f50002c;
            x5Var.f43592c = list;
            if (zArr2.length > 2) {
                zArr2[2] = true;
            }
            String str3 = annotatedTextParcelable.f50003d;
            x5Var.f43593d = str3;
            if (zArr2.length > 3) {
                zArr2[3] = true;
            }
            y5Var = new y5(str, str2, list, str3, zArr2, 0);
            Intrinsics.checkNotNullExpressionValue(y5Var, "build(...)");
        } else {
            y5Var = null;
        }
        h00Var.f38212c = y5Var;
        boolean[] zArr3 = h00Var.f38224o;
        if (zArr3.length > 2) {
            zArr3[2] = true;
        }
        List list2 = onebarmoduleactionParcelable.f50023d;
        if (list2 != null) {
            List list3 = list2;
            arrayList = new ArrayList(kotlin.collections.g0.q(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                arrayList.add(W0((OnebarmoduleParcelable) it.next()));
            }
        } else {
            arrayList = null;
        }
        h00Var.f38213d = arrayList;
        boolean[] zArr4 = h00Var.f38224o;
        if (zArr4.length > 3) {
            zArr4[3] = true;
        }
        h00Var.b(onebarmoduleactionParcelable.f50024e);
        h00Var.f38216g = onebarmoduleactionParcelable.f50025f;
        boolean[] zArr5 = h00Var.f38224o;
        if (zArr5.length > 6) {
            zArr5[6] = true;
        }
        List list4 = onebarmoduleactionParcelable.f50026g;
        if (list4 != null) {
            List<FilteroptionParcelable> list5 = list4;
            ArrayList arrayList3 = new ArrayList(kotlin.collections.g0.q(list5, 10));
            for (FilteroptionParcelable filteroptionParcelable : list5) {
                Intrinsics.checkNotNullParameter(filteroptionParcelable, "<this>");
                ul ulVar = new ul(i13);
                ulVar.f42572a = filteroptionParcelable.f50004a;
                boolean[] zArr6 = ulVar.f42579h;
                if (zArr6.length > 0) {
                    zArr6[i13] = true;
                }
                ulVar.f42573b = filteroptionParcelable.f50005b;
                if (zArr6.length > 1) {
                    zArr6[1] = true;
                }
                OnebarmoduleactionParcelable onebarmoduleactionParcelable2 = filteroptionParcelable.f50006c;
                ulVar.f42574c = onebarmoduleactionParcelable2 != null ? X0(onebarmoduleactionParcelable2) : null;
                boolean[] zArr7 = ulVar.f42579h;
                if (zArr7.length > 2) {
                    zArr7[2] = true;
                }
                ulVar.f42575d = filteroptionParcelable.f50007d;
                if (zArr7.length > 3) {
                    zArr7[3] = true;
                }
                OnebarmoduledisplayParcelable onebarmoduledisplayParcelable = filteroptionParcelable.f50008e;
                ulVar.f42576e = onebarmoduledisplayParcelable != null ? Y0(onebarmoduledisplayParcelable) : null;
                boolean[] zArr8 = ulVar.f42579h;
                if (zArr8.length > 4) {
                    zArr8[4] = true;
                }
                ulVar.f42577f = filteroptionParcelable.f50009f;
                if (zArr8.length > 5) {
                    zArr8[5] = true;
                }
                ulVar.f42578g = filteroptionParcelable.f50010g;
                if (zArr8.length > 6) {
                    zArr8[6] = true;
                }
                xl a13 = ulVar.a();
                Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
                arrayList3.add(a13);
                i13 = 0;
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = null;
        }
        h00Var.f38217h = arrayList2;
        boolean[] zArr9 = h00Var.f38224o;
        if (zArr9.length > 7) {
            zArr9[7] = true;
        }
        h00Var.f38219j = onebarmoduleactionParcelable.f50027h;
        if (zArr9.length > 9) {
            zArr9[9] = true;
        }
        h00Var.f38220k = onebarmoduleactionParcelable.f50028i;
        if (zArr9.length > 10) {
            zArr9[10] = true;
        }
        h00Var.f38221l = onebarmoduleactionParcelable.f50029j;
        if (zArr9.length > 11) {
            zArr9[11] = true;
        }
        h00Var.f38222m = onebarmoduleactionParcelable.f50030k;
        if (zArr9.length > 12) {
            zArr9[12] = true;
        }
        h00Var.f38223n = onebarmoduleactionParcelable.f50031l;
        if (zArr9.length > 13) {
            zArr9[13] = true;
        }
        k00 a14 = h00Var.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        return a14;
    }

    public static void Y(cp.u uVar, rg0.s sVar) {
        uVar.U0 = sVar;
    }

    public static final o00 Y0(OnebarmoduledisplayParcelable onebarmoduledisplayParcelable) {
        Intrinsics.checkNotNullParameter(onebarmoduledisplayParcelable, "<this>");
        l00 l00Var = new l00(0);
        l00Var.f39603a = onebarmoduledisplayParcelable.f50032a;
        boolean[] zArr = l00Var.f39616n;
        if (zArr.length > 0) {
            zArr[0] = true;
        }
        l00Var.f39604b = onebarmoduledisplayParcelable.f50033b;
        if (zArr.length > 1) {
            zArr[1] = true;
        }
        l00Var.b(onebarmoduledisplayParcelable.f50034c);
        l00Var.c(onebarmoduledisplayParcelable.f50035d);
        l00Var.d(onebarmoduledisplayParcelable.f50036e);
        l00Var.e(onebarmoduledisplayParcelable.f50037f);
        l00Var.f39610h = onebarmoduledisplayParcelable.f50038g;
        boolean[] zArr2 = l00Var.f39616n;
        if (zArr2.length > 7) {
            zArr2[7] = true;
        }
        l00Var.f(onebarmoduledisplayParcelable.f50039h);
        l00Var.g(onebarmoduledisplayParcelable.f50040i);
        l00Var.f39613k = onebarmoduledisplayParcelable.f50041j;
        boolean[] zArr3 = l00Var.f39616n;
        if (zArr3.length > 10) {
            zArr3[10] = true;
        }
        l00Var.h(onebarmoduledisplayParcelable.f50042k);
        l00Var.f39615m = onebarmoduledisplayParcelable.f50043l;
        boolean[] zArr4 = l00Var.f39616n;
        if (zArr4.length > 12) {
            zArr4[12] = true;
        }
        l00Var.f39605c = onebarmoduledisplayParcelable.f50044m;
        if (zArr4.length > 2) {
            zArr4[2] = true;
        }
        o00 a13 = l00Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static void Z(px1.f fVar, xw1.b bVar) {
        fVar.f101650l0 = bVar;
    }

    public static String Z0(int i13) {
        return B(i13, 1) ? "Clip" : B(i13, 2) ? "Ellipsis" : B(i13, 3) ? "Visible" : "Invalid";
    }

    public static void a0(px1.f fVar, so.x0 x0Var) {
        fVar.f101651m0 = x0Var;
    }

    public static final String a1(float f13) {
        if (Float.isNaN(f13)) {
            return "NaN";
        }
        if (Float.isInfinite(f13)) {
            return f13 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0f, max);
        float f14 = f13 * pow;
        int i13 = (int) f14;
        if (f14 - i13 >= 0.5f) {
            i13++;
        }
        float f15 = i13 / pow;
        return max > 0 ? String.valueOf(f15) : String.valueOf((int) f15);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(wb0.j r33, u2.q r34, wb0.i r35, i2.o r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.b(wb0.j, u2.q, wb0.i, i2.o, int, int):void");
    }

    public static void b0(cp.u uVar, w6 w6Var) {
        uVar.V0 = w6Var;
    }

    public static final void b1(u50.r eventIntake, boolean z13) {
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        try {
            eventIntake.a(new ni1.c1(z13));
        } catch (Exception e13) {
            vb0.j.f125466a.K(true, a.a.j("Exception thrown while comparing PinImpressionDisplayState objects ", e13.getMessage()), tb0.p.PLATFORM, new Object[0]);
        }
    }

    public static final void c(wb0.j viewModel, u2.q qVar, wb0.i iVar, i2.o oVar, int i13, int i14) {
        int i15;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(121757043);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(viewModel) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(qVar) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i15 |= ((i14 & 4) == 0 && sVar.h(iVar)) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        if ((i15 & 731) == 146 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            int i17 = i13 & 1;
            u2.n nVar = u2.n.f120041b;
            if (i17 == 0 || sVar.y()) {
                if (i16 != 0) {
                    qVar = nVar;
                }
                if ((i14 & 4) != 0) {
                    iVar = wb0.l.a(sVar);
                }
            } else {
                sVar.Q();
            }
            sVar.s();
            wb0.f fVar = iVar.f128996a;
            u2.q b13 = androidx.compose.foundation.a.b(androidx.compose.foundation.layout.e.j(qVar, fVar.f128985a), fVar.f128986b, v1.i.a(fVar.f128987c));
            q3.p0 e13 = p1.q.e(u2.b.f120013a, false);
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, b13);
            s3.k.Qo.getClass();
            s3.i iVar2 = s3.j.f110798b;
            if (!(sVar.f71265a instanceof i2.f)) {
                com.bumptech.glide.c.j0();
                throw null;
            }
            sVar.a0();
            if (sVar.O) {
                sVar.n(iVar2);
            } else {
                sVar.j0();
            }
            tb.f.f0(sVar, e13, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.c.f17179a;
            g3.b M0 = com.bumptech.glide.c.M0(viewModel.f129000a, sVar);
            wb0.g gVar = iVar.f128997b;
            c2.u2.a(M0, null, cVar.a(androidx.compose.foundation.layout.e.j(nVar, gVar.f128988a), u2.b.f120017e), gVar.f128989b, sVar, 56, 0);
            sVar.r(true);
        }
        u2.q qVar2 = qVar;
        wb0.i iVar3 = iVar;
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new wb0.h(viewModel, qVar2, iVar3, i13, i14, 1);
        }
    }

    public static void c0(lq0.v0 v0Var, f7 f7Var) {
        v0Var.R0 = f7Var;
    }

    public static m.e c1(Context context) {
        g92.a androidTheme = g92.a.MAIN;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(androidTheme, "androidTheme");
        return new m.e(context, bo1.b.ThemeOverlay_Pinterest_Classic);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(ra0.j0 r16, u2.q r17, float r18, float r19, u50.i r20, i2.o r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.d(ra0.j0, u2.q, float, float, u50.i, i2.o, int, int):void");
    }

    public static void d0(com.pinterest.schoolTeenPrompt.g gVar, nu1.a aVar) {
        gVar.f50466g0 = aVar;
    }

    public static void d1(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 == null) {
            throw new NullPointerException(a.a.k("null value in entry: ", obj.toString(), "=null"));
        }
    }

    public static final void e(z90.d state, u2.q qVar, Function0 function0, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1788204776);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        Function0 function02 = (i14 & 4) != 0 ? z90.b.f141336i : function0;
        boolean z13 = state.f141347c;
        sVar.W(424266897);
        boolean i15 = sVar.i(z13);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (i15 || J2 == dVar) {
            J2 = bs1.c.u1(Boolean.valueOf(state.f141347c), y3.f71400a);
            sVar.g0(J2);
        }
        sVar.r(false);
        Boolean bool = (Boolean) ((i2.q1) J2).getValue();
        bool.getClass();
        j1.g2 c13 = j1.m2.c(bool, "Selected state transition animation", sVar, 48);
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = c13.f74078d;
        boolean booleanValue = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        sVar.W(-1592716717);
        long h10 = booleanValue ? g0.h(eo1.b.color_themed_background_inverse_base, sVar) : b3.w.f21389m;
        sVar.r(false);
        c3.d f13 = b3.w.f(h10);
        boolean h13 = sVar.h(f13);
        Object J3 = sVar.J();
        if (h13 || J3 == dVar) {
            J3 = (j1.p2) i1.q0.f70874k.invoke(f13);
            sVar.g0(J3);
        }
        j1.p2 p2Var = (j1.p2) J3;
        boolean booleanValue2 = ((Boolean) c13.c()).booleanValue();
        sVar.W(-1592716717);
        long h14 = booleanValue2 ? g0.h(eo1.b.color_themed_background_inverse_base, sVar) : b3.w.f21389m;
        sVar.r(false);
        b3.w wVar = new b3.w(h14);
        boolean booleanValue3 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        sVar.W(-1592716717);
        long h15 = booleanValue3 ? g0.h(eo1.b.color_themed_background_inverse_base, sVar) : b3.w.f21389m;
        sVar.r(false);
        b3.w wVar2 = new b3.w(h15);
        c13.f();
        sVar.W(-1457805428);
        j1.o1 q13 = j1.e.q(0.0f, 0.0f, null, 7);
        sVar.r(false);
        j1.b2 b13 = j1.m2.b(c13, wVar, wVar2, q13, p2Var, sVar, 196608);
        j1.p2 p2Var2 = j1.q2.f74207c;
        boolean booleanValue4 = ((Boolean) c13.c()).booleanValue();
        sVar.W(409464225);
        float A = booleanValue4 ? com.bumptech.glide.d.A(eo1.c.space_200, sVar) : 0;
        sVar.r(false);
        n4.e eVar = new n4.e(A);
        boolean booleanValue5 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        sVar.W(409464225);
        float A2 = booleanValue5 ? com.bumptech.glide.d.A(eo1.c.space_200, sVar) : 0;
        sVar.r(false);
        n4.e eVar2 = new n4.e(A2);
        c13.f();
        sVar.W(-575880366);
        Map map = j1.e3.f74054a;
        j1.o1 q14 = j1.e.q(0.0f, 0.0f, new n4.e(0.1f), 3);
        sVar.r(false);
        j1.b2 b14 = j1.m2.b(c13, eVar, eVar2, q14, p2Var2, sVar, 196608);
        j1.p2 p2Var3 = j1.q2.f74205a;
        boolean booleanValue6 = ((Boolean) c13.c()).booleanValue();
        sVar.W(-5131890);
        float f14 = booleanValue6 ? 1.0f : 0.0f;
        sVar.r(false);
        Float valueOf = Float.valueOf(f14);
        boolean booleanValue7 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        sVar.W(-5131890);
        float f15 = booleanValue7 ? 1.0f : 0.0f;
        sVar.r(false);
        Float valueOf2 = Float.valueOf(f15);
        c13.f();
        sVar.W(-522164544);
        j1.o1 q15 = j1.e.q(0.0f, 0.0f, null, 7);
        sVar.r(false);
        j1.b2 b15 = j1.m2.b(c13, valueOf, valueOf2, q15, p2Var3, sVar, 196608);
        boolean booleanValue8 = ((Boolean) c13.c()).booleanValue();
        sVar.W(-90032107);
        float f16 = booleanValue8 ? 0.0f : 1.0f;
        sVar.r(false);
        Float valueOf3 = Float.valueOf(f16);
        boolean booleanValue9 = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
        sVar.W(-90032107);
        float f17 = booleanValue9 ? 0.0f : 1.0f;
        sVar.r(false);
        Float valueOf4 = Float.valueOf(f17);
        c13.f();
        sVar.W(-522164544);
        j1.o1 q16 = j1.e.q(0.0f, 0.0f, null, 7);
        sVar.r(false);
        m(q2.i.c(-200113865, new i1.j(state, 17), sVar), q2.i.c(-411589277, new z90.c(state, c13, qVar2, function02, b13, j1.m2.b(c13, valueOf3, valueOf4, q16, p2Var3, sVar, 196608), b15, b14), sVar), sVar, 54);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.p(i13, i14, 13, state, qVar2, function02);
        }
    }

    public static void e0(cp.u uVar, androidx.appcompat.widget.x xVar) {
        uVar.f52974a1 = xVar;
    }

    public static final void f(jm1.b state, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1808155363);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        g(state, qVar, null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 4);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new v31.d(state, qVar, i13, i14, 2);
        }
    }

    public static void f0(ev.h hVar, mo1.d dVar) {
        hVar.f60208j0 = dVar;
    }

    public static final void g(jm1.b state, u2.q qVar, gm1.a aVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-653175511);
        if ((i14 & 2) != 0) {
            qVar = u2.n.f120041b;
        }
        if ((i14 & 4) != 0) {
            aVar = null;
        }
        int i15 = 19;
        androidx.compose.ui.viewinterop.a.a(new rq.a0(((Number) sVar.m(fc0.k.f61712a)).intValue(), state, aVar, i15), qVar, new com.pinterest.framework.screens.q(i15, state, aVar), sVar, i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 0);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k31.h(i13, i14, 12, qVar, state, aVar);
        }
    }

    public static void g0(yb1.g gVar, p3 p3Var) {
        gVar.f138562z0 = p3Var;
    }

    public static final void h(List icons, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1465775276);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        bp1.h.c(i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER, 508, null, null, null, null, new r1.b(3), null, sVar, qVar2, new w1.g(icons, 11), false, false);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.z(icons, qVar2, i13, i14, 0);
        }
    }

    public static void h0(cp.u uVar, yk1.j jVar) {
        uVar.Z0 = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i(uc0.g1 r28, u2.q r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.i(uc0.g1, u2.q, i2.o, int, int):void");
    }

    public static void i0(cp.u uVar, r20.a aVar) {
        uVar.Y0 = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(uc0.g1 r28, u2.q r29, i2.o r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.j(uc0.g1, u2.q, i2.o, int, int):void");
    }

    public static void j0(cp.u uVar, x02.i2 i2Var) {
        uVar.W0 = i2Var;
    }

    public static final void k(u2.q qVar, uc0.l1 l1Var, i2.o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        uc0.l1 l1Var2;
        u2.q qVar3;
        u2.q qVar4;
        uc0.l1 l1Var3;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-168467870);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = i13 | (sVar.h(qVar2) ? 4 : 2);
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        int i17 = i14 & 2;
        if (i17 != 0) {
            i15 |= 16;
        }
        if (i17 == 2 && (i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
            l1Var3 = l1Var;
            qVar4 = qVar2;
        } else {
            sVar.S();
            if ((i13 & 1) == 0 || sVar.y()) {
                u2.q qVar5 = i16 != 0 ? u2.n.f120041b : qVar2;
                if (i17 != 0) {
                    sVar.X(1890788296);
                    androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                    if (a13 == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    xe2.g V = p2.V(a13, sVar);
                    sVar.X(1729797275);
                    androidx.lifecycle.l1 v03 = c3.v0(uc0.l1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                    sVar.r(false);
                    sVar.r(false);
                    qVar3 = qVar5;
                    l1Var2 = (uc0.l1) v03;
                } else {
                    l1Var2 = l1Var;
                    qVar3 = qVar5;
                }
            } else {
                sVar.Q();
                l1Var2 = l1Var;
                qVar3 = qVar2;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(l1Var2.f121825e, sVar);
            sVar.W(612098064);
            Object J2 = sVar.J();
            if (J2 == i2.n.f71185a) {
                J2 = bs1.c.u1(Boolean.TRUE, y3.f71400a);
                sVar.g0(J2);
            }
            i2.q1 q1Var = (i2.q1) J2;
            sVar.r(false);
            l1Var2.i(new uc0.i(new oc0.a(q2.i.c(-696294102, new l1.s(z13, l1Var2, q1Var, 7), sVar))));
            p1.y a14 = p1.x.a(p1.l.f98545c, u2.b.f120025m, sVar, 0);
            int i18 = sVar.P;
            i2.z1 o13 = sVar.o();
            u2.q X = ao2.m0.X(sVar, qVar3);
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
            tb.f.f0(sVar, a14, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            g3.e(oc0.q.search_icon, new tc0.b0(l1Var2, 1), null, 0.0f, 0.0f, 0.0f, 0.0f, new tc0.c(l1Var2, 10), sVar, 0, RecyclerViewTypes.VIEW_TYPE_STORY_BOARD_IDEAS_PREVIEW_FOOTER);
            p(((uc0.h1) z13.getValue()).f121791b, ((Boolean) q1Var.getValue()).booleanValue(), sVar, 8);
            sVar.r(true);
            qVar4 = qVar3;
            l1Var3 = l1Var2;
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 18, qVar4, l1Var3);
        }
    }

    public static void k0(lq0.v0 v0Var, x02.i2 i2Var) {
        v0Var.S0 = i2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(uc0.k1 r20, kotlin.jvm.functions.Function1 r21, boolean r22, u2.q r23, kotlin.jvm.functions.Function1 r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.l(uc0.k1, kotlin.jvm.functions.Function1, boolean, u2.q, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static void l0(q71.a aVar, ip1.b bVar) {
        aVar.X0 = bVar;
    }

    public static final void m(Function2 function2, kl2.l lVar, i2.o oVar, int i13) {
        int i14;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-702983779);
        if ((i13 & 14) == 0) {
            i14 = (sVar.j(function2) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i14 |= sVar.j(lVar) ? 32 : 16;
        }
        int i15 = 9;
        if ((i14 & 91) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.W(1631454568);
            boolean z13 = ((i14 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 32) | ((i14 & 14) == 4);
            Object J2 = sVar.J();
            if (z13 || J2 == i2.n.f71185a) {
                J2 = new androidx.compose.foundation.lazy.layout.v(i15, function2, lVar);
                sVar.g0(J2);
            }
            sVar.r(false);
            q3.k1.b(null, (Function2) J2, sVar, 0, 1);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new k1.z(function2, lVar, i13, i15);
        }
    }

    public static void m0(cp.u uVar, lb0.q qVar) {
        uVar.f52976c1 = qVar;
    }

    public static final void n(List icons, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-588322220);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        rl2.g0.e(qVar2, null, null, false, null, null, null, false, new w1.g(icons, 12), sVar, (i13 >> 3) & 14, RecyclerViewTypes.VIEW_TYPE_STORY_BLOCK_PATTERN);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.z(icons, qVar2, i13, i14, 1);
        }
    }

    public static void n0(ev.h hVar, so.d1 d1Var) {
        hVar.f60209k0 = d1Var;
    }

    public static final void o(z9.k viewModelStoreOwner, r2.d dVar, Function2 function2, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1579360880);
        i2.u0 u0Var = v6.b.f124191a;
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        com.bumptech.glide.d.b(new i2.d2[]{v6.b.f124191a.c(viewModelStoreOwner), AndroidCompositionLocals_androidKt.getLocalLifecycleOwner().c(viewModelStoreOwner), AndroidCompositionLocals_androidKt.f17458e.c(viewModelStoreOwner)}, q2.i.b(sVar, -52928304, new ba.o(dVar, function2, i13, 0)), sVar, 56);
        i2.f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new androidx.compose.foundation.lazy.layout.u0(viewModelStoreOwner, dVar, function2, i13, 6);
    }

    public static void o0(su0.o oVar, d8 d8Var) {
        oVar.f115208j0 = d8Var;
    }

    public static final void p(List list, boolean z13, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1062208540);
        if (z13) {
            sVar.W(-41478460);
            h(list, null, sVar, 8, 2);
            sVar.r(false);
        } else {
            sVar.W(-41432828);
            n(list, null, sVar, 8, 2);
            sVar.r(false);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.n0(list, z13, i13, 1);
        }
    }

    public static void p0(im0.d dVar, uk1.e eVar) {
        dVar.f72606j0 = eVar;
    }

    public static ba0 q(aq value, a.n0 n0Var, aq aqVar, eq eqVar) {
        Intrinsics.checkNotNullParameter(value, "value");
        n0Var.g(aqVar);
        return eqVar.b();
    }

    public static void q0(px1.f fVar, uk1.e eVar) {
        fVar.f101648j0 = eVar;
    }

    public static void r(boolean z13) {
        if (z13) {
            throw new e7.r();
        }
    }

    public static void r0(q71.a aVar, uk1.e eVar) {
        aVar.V0 = eVar;
    }

    public static final void s(u50.i0 i0Var, u2.q qVar, i2.o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-845838190);
        u2.q qVar2 = (i14 & 2) != 0 ? u2.n.f120041b : qVar;
        dl2.b.c(new rn1.a(i0Var, vn1.c.INVERSE, kotlin.collections.e0.b(vn1.b.CENTER_VERTICAL), null, null, 0, null, null, null, null, false, 0, null, null, null, false, null, null, 2097144), qVar2, null, null, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8, 12);
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new z90.a(i0Var, qVar2, i13, i14, 0);
        }
    }

    public static void s0(q71.a aVar, j22.b bVar) {
        aVar.T0 = bVar;
    }

    public static final void t(r2.d dVar, Function2 function2, i2.o oVar, int i13) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1211832233);
        sVar.X(1729797275);
        androidx.lifecycle.u1 a13 = v6.b.a(sVar);
        if (a13 == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        androidx.lifecycle.l1 v03 = c3.v0(ba.a.class, a13, null, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
        sVar.r(false);
        ba.a aVar = (ba.a) v03;
        aVar.f22253d = new WeakReference(dVar);
        dVar.e(aVar.f22252c, function2, sVar, (i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 520);
        i2.f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new ba.o(dVar, function2, i13, 1);
    }

    public static void t0(q71.a aVar, gp1.l lVar) {
        aVar.Y0 = lVar;
    }

    public static final int u(Context context, Context context2) {
        Size size = new Size(bs1.c.V(context, z52.a.board_preview_width), bs1.c.V(context, z52.a.board_preview_height));
        com.pinterest.feature.sharesheet.view.previewcarousel.r.f48459a.getClass();
        float b13 = com.pinterest.feature.sharesheet.view.previewcarousel.q.b(context2) / (size.getWidth() / size.getHeight());
        int a13 = com.pinterest.feature.sharesheet.view.previewcarousel.q.a(context2, false);
        int i13 = (int) b13;
        return i13 > a13 ? a13 : i13;
    }

    public static void u0(q71.a aVar) {
        aVar.S0 = x92.c.f134368a;
    }

    public static void v(x92.b bVar) {
        com.bumptech.glide.d.e(bVar);
        bVar.e("user.type");
        bVar.e("user.image_medium_url");
        bVar.e("user.image_large_url");
        bVar.e("user.image_xlarge_url");
        n60.o.w(bVar, "user.website_url", "user.is_primary_website_verified", "user.location", "user.explicitly_followed_by_me");
        n60.o.w(bVar, "user.implicitly_followed_by_me", "user.blocked_by_me", "user.pin_count", "user.follower_count");
        n60.o.w(bVar, "user.pins_done_count", "user.verified_identity", "user.is_verified_merchant", "user.board_count");
    }

    public static void v0(yb1.g gVar, lh0.p3 p3Var) {
        gVar.A0 = p3Var;
    }

    public static final void w(GestaltSpinner gestaltSpinner, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltSpinner, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        ln1.l lVar = new ln1.l((ln1.d) ((u50.o) gestaltSpinner.A.f33803a));
        init.invoke(lVar);
        gestaltSpinner.u(new an1.i(lVar, 9));
    }

    public static void w0(im0.d dVar, i92.k kVar) {
        dVar.f72609m0 = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r2 == 0) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int x(android.content.Context r6, java.lang.String r7) {
        /*
            int r0 = android.os.Process.myPid()
            int r1 = android.os.Process.myUid()
            java.lang.String r2 = r6.getPackageName()
            int r0 = r6.checkPermission(r7, r0, r1)
            r3 = -1
            if (r0 != r3) goto L15
            goto L84
        L15:
            java.lang.String r7 = android.app.AppOpsManager.permissionToOp(r7)
            r0 = 0
            if (r7 != 0) goto L1f
        L1c:
            r3 = r0
            goto L84
        L1f:
            if (r2 != 0) goto L31
            android.content.pm.PackageManager r2 = r6.getPackageManager()
            java.lang.String[] r2 = r2.getPackagesForUid(r1)
            if (r2 == 0) goto L84
            int r4 = r2.length
            if (r4 > 0) goto L2f
            goto L84
        L2f:
            r2 = r2[r0]
        L31:
            int r3 = android.os.Process.myUid()
            java.lang.String r4 = r6.getPackageName()
            java.lang.Class<android.app.AppOpsManager> r5 = android.app.AppOpsManager.class
            if (r3 != r1) goto L75
            boolean r3 = java.util.Objects.equals(r4, r2)
            if (r3 == 0) goto L75
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 29
            if (r3 < r4) goto L6a
            java.lang.Object r3 = r6.getSystemService(r5)
            android.app.AppOpsManager r3 = (android.app.AppOpsManager) r3
            int r4 = android.os.Binder.getCallingUid()
            if (r3 != 0) goto L57
            r2 = 1
            goto L5b
        L57:
            int r2 = r3.checkOpNoThrow(r7, r4, r2)
        L5b:
            if (r2 == 0) goto L5e
            goto L7f
        L5e:
            java.lang.String r6 = v0.a.b(r6)
            if (r3 != 0) goto L65
            goto L82
        L65:
            int r2 = r3.checkOpNoThrow(r7, r1, r6)
            goto L7f
        L6a:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
            goto L7f
        L75:
            java.lang.Object r6 = r6.getSystemService(r5)
            android.app.AppOpsManager r6 = (android.app.AppOpsManager) r6
            int r2 = r6.noteProxyOpNoThrow(r7, r2)
        L7f:
            if (r2 != 0) goto L82
            goto L1c
        L82:
            r6 = -2
            r3 = r6
        L84:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.s0.x(android.content.Context, java.lang.String):int");
    }

    public static void x0(q71.a aVar, lh0.j3 j3Var) {
        aVar.Z0 = j3Var;
    }

    public static final boolean y(RectF rectF, PointF point) {
        Intrinsics.checkNotNullParameter(rectF, "<this>");
        Intrinsics.checkNotNullParameter(point, "point");
        float f13 = rectF.left;
        float f14 = rectF.right;
        float f15 = point.x;
        if (f13 <= f15 && f15 <= f14) {
            float f16 = rectF.top;
            float f17 = rectF.bottom;
            float f18 = point.y;
            if (f16 <= f18 && f18 <= f17) {
                return true;
            }
        }
        return false;
    }

    public static void y0(q71.a aVar, x02.l2 l2Var) {
        aVar.U0 = l2Var;
    }

    public static void z0(xo0.d dVar, ku1.l lVar) {
        dVar.f135590i = lVar;
    }

    public String z(Object obj) {
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }
}
