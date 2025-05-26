package kh2;

import a.cb;
import a.o3;
import ads_mobile_sdk.fa2;
import ads_mobile_sdk.k41;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.SizeF;
import android.view.inputmethod.ExtractedText;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d01;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gv0;
import com.pinterest.api.model.jv0;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kv0;
import com.pinterest.api.model.mu0;
import com.pinterest.api.model.nv0;
import com.pinterest.api.model.ov0;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.pu0;
import com.pinterest.api.model.rv0;
import com.pinterest.api.model.s30;
import com.pinterest.api.model.sv0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.uq;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vv0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.d4;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import so.m8;
import so.n5;

/* loaded from: classes4.dex */
public abstract class p2 implements po2.d, po2.b {

    /* renamed from: a, reason: collision with root package name */
    public static com.bugsnag.android.h2 f79641a;

    /* renamed from: b, reason: collision with root package name */
    public static Method f79642b;

    /* renamed from: c, reason: collision with root package name */
    public static Method f79643c;

    /* renamed from: d, reason: collision with root package name */
    public static Method f79644d;

    /* renamed from: e, reason: collision with root package name */
    public static Method f79645e;

    /* renamed from: f, reason: collision with root package name */
    public static Method f79646f;

    /* renamed from: g, reason: collision with root package name */
    public static Method f79647g;

    /* renamed from: h, reason: collision with root package name */
    public static String f79648h;

    /* renamed from: i, reason: collision with root package name */
    public static String f79649i;

    /* renamed from: j, reason: collision with root package name */
    public static boolean f79650j;

    public static void A0(fv0.b bVar, ag1.h hVar) {
        bVar.A0 = hVar;
    }

    public static void B0(n70.w wVar, lh0.k2 k2Var) {
        wVar.f89696f1 = k2Var;
    }

    public static void C0(cj0.p pVar, qa2.d dVar) {
        pVar.O0 = dVar;
    }

    public static void D0(cu.m mVar, gs0.k kVar) {
        mVar.f53226f0 = kVar;
    }

    public static void E0(cj0.p pVar, ni1.t2 t2Var) {
        pVar.P0 = t2Var;
    }

    public static void F0(cj0.p pVar, ni1.d0 d0Var) {
        pVar.Q0 = d0Var;
    }

    public static final void G(uc0.x1 x1Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-270052604);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(x1Var)) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = 11;
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            sVar.S();
            if ((i13 & 1) != 0 && !sVar.y()) {
                sVar.Q();
                int i17 = i14 & 1;
            } else if ((i14 & 1) != 0) {
                sVar.X(1890788296);
                androidx.lifecycle.u1 a13 = v6.b.a(sVar);
                if (a13 == null) {
                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                xe2.g V = V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = c3.v0(uc0.x1.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                x1Var = (uc0.x1) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(x1Var.f121825e, sVar);
            x1Var.i(new uc0.i(new oc0.a(q2.i.c(-1378129460, new xb0.a(x1Var, i16), sVar))));
            gh0.b.d(((uc0.w1) z13.getValue()).f121877b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(x1Var, i13, i14, 20);
        }
    }

    public static void G0(n70.w wVar, jq.c cVar) {
        wVar.f89691a1 = cVar;
    }

    public static int H(int i13) {
        return Math.max(((i13 * 3) / 2) + 1, 10);
    }

    public static void H0(n70.w wVar, nx.f0 f0Var) {
        wVar.f89697g1 = f0Var;
    }

    public static final fa2 I(nm.s sVar) {
        Intrinsics.checkNotNullParameter(sVar, "<this>");
        if (!(sVar instanceof nm.q)) {
            return null;
        }
        nm.q f13 = sVar.f();
        if (f13.f91364a.isEmpty()) {
            return null;
        }
        nm.s u13 = f13.u(0);
        u13.getClass();
        if (!(u13 instanceof nm.u)) {
            return null;
        }
        nm.u i13 = u13.i();
        return new fa2(k41.a(i13, "rb_type", ""), k41.a(i13, "rb_amount", 1));
    }

    public static void I0(n70.w wVar, lb0.q qVar) {
        wVar.f89695e1 = qVar;
    }

    public static int J(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j17 >>> 32);
    }

    public static void J0(ht0.g gVar, uk1.e eVar) {
        gVar.f70113z0 = eVar;
    }

    public static void K(x92.b bVar) {
        n60.o.w(bVar, "aggregatedcomment.id", "aggregatedcomment.text", "aggregatedcomment.is_translatable", "aggregatedcomment.created_at");
        n60.o.w(bVar, "aggregatedcomment.user()", "aggregatedcomment.reaction_by_me", "aggregatedcomment.reaction_counts", "aggregatedcomment.marked_helpful_by_me");
        n60.o.w(bVar, "aggregatedcomment.helpful_count", "aggregatedcomment.is_edited", "aggregatedcomment.comment_count", "aggregatedcomment.highlighted_by_pin_owner");
        n60.o.w(bVar, "aggregatedcomment.tags", "aggregatedcomment.media()", "commentmedia.sticker()", "commentsticker.image_url");
        n60.o.w(bVar, "aggregatedcomment.attached_pin()", "aggregatedcomment.pin_id", "user.first_name", "user.username");
        bVar.e("user.image_medium_url");
        bVar.e("aggregatedcomment.reply_preview_ids");
        df.j1.i(bVar);
    }

    public static void K0(n70.w wVar, uk1.e eVar) {
        wVar.Z0 = eVar;
    }

    public static void L(x92.b bVar) {
        com.bumptech.glide.d.e(bVar);
        bVar.e("user.image_medium_url");
        bVar.e("user.follower_count");
    }

    public static void L0(ht0.g gVar, b60.b bVar) {
        gVar.B0 = bVar;
    }

    public static int M(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j17 >>> 32);
    }

    public static void M0(n70.w wVar, nr0.t tVar) {
        wVar.f89692b1 = tVar;
    }

    public static final void N(x92.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        g3.p(bVar);
        bVar.e("pin.section()");
    }

    public static void N0(n70.w wVar, yk1.v vVar) {
        wVar.f89693c1 = vVar;
    }

    public static final ArrayList O(int i13, int i14, List list) {
        ArrayList H0 = CollectionsKt.H0(list);
        H0.add(Q(cb.g("toString(...)"), new SizeF(X0(350), Y0(666)), new PointF(0.0f, 0.0f), i13, i14, null, "00000033", 32));
        return H0;
    }

    public static final boolean O0(vn0 mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        List items = mediaList.getItems();
        int startMediaIndex = mediaList.getStartMediaIndex();
        int endMediaIndex = mediaList.getEndMediaIndex();
        return startMediaIndex >= 0 && startMediaIndex <= endMediaIndex && endMediaIndex < items.size() && P0(items.subList(startMediaIndex, endMediaIndex + 1));
    }

    public static r4.l P(ao2.q0 q0Var) {
        Intrinsics.checkNotNullParameter(q0Var, "<this>");
        r4.l L = com.bumptech.glide.d.L(new o3(22, q0Var, "Deferred.asListenableFuture"));
        Intrinsics.checkNotNullExpressionValue(L, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return L;
    }

    public static final boolean P0(List mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Iterator it = mediaList.iterator();
        while (it.hasNext()) {
            bo0 bo0Var = (bo0) it.next();
            pu photoItem = bo0Var.getPhotoItem();
            if (photoItem == null) {
                photoItem = bo0Var.getVideoItem();
            }
            if (photoItem == null || !photoItem.g() || !photoItem.a()) {
                return false;
            }
        }
        return !mediaList.isEmpty();
    }

    public static pu0 Q(String str, SizeF sizeF, PointF pointF, int i13, int i14, String str2, String str3, int i15) {
        String str4 = (i15 & 32) != 0 ? null : str2;
        String str5 = (i15 & 64) == 0 ? str3 : null;
        mu0 mu0Var = new mu0(0);
        mu0Var.b(str);
        mu0Var.f40221i = Double.valueOf(sizeF.getWidth());
        boolean[] zArr = mu0Var.f40225m;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
        mu0Var.f40224l = Double.valueOf(sizeF.getHeight());
        boolean[] zArr2 = mu0Var.f40225m;
        if (zArr2.length > 11) {
            zArr2[11] = true;
        }
        mu0Var.f40222j = Double.valueOf(pointF.x);
        boolean[] zArr3 = mu0Var.f40225m;
        if (zArr3.length > 9) {
            zArr3[9] = true;
        }
        mu0Var.f40223k = Double.valueOf(pointF.y);
        boolean[] zArr4 = mu0Var.f40225m;
        if (zArr4.length > 10) {
            zArr4[10] = true;
        }
        mu0Var.f40215c = kotlin.collections.q0.f80391a;
        if (zArr4.length > 2) {
            zArr4[2] = true;
        }
        mu0Var.f40216d = Integer.valueOf(i13);
        boolean[] zArr5 = mu0Var.f40225m;
        if (zArr5.length > 3) {
            zArr5[3] = true;
        }
        mu0Var.f40217e = Integer.valueOf(i14);
        boolean[] zArr6 = mu0Var.f40225m;
        if (zArr6.length > 4) {
            zArr6[4] = true;
        }
        mu0Var.f40219g = "";
        if (zArr6.length > 6) {
            zArr6[6] = true;
        }
        ov0 ov0Var = new ov0(new rv0(), 0);
        ov0Var.f40818a = String.valueOf(UUID.randomUUID());
        boolean[] zArr7 = ov0Var.f40824g;
        if (zArr7.length > 0) {
            zArr7[0] = true;
        }
        if (str4 != null) {
            kv0 kv0Var = new kv0(new nv0(), 0);
            String valueOf = String.valueOf(UUID.randomUUID());
            kv0Var.f39551a = valueOf;
            boolean[] zArr8 = kv0Var.f39556f;
            if (zArr8.length > 0) {
                zArr8[0] = true;
            }
            kv0Var.f39553c = str4;
            if (zArr8.length > 2) {
                zArr8[2] = true;
            }
            ov0Var.f40821d = new nv0(valueOf, kv0Var.f39552b, str4, kv0Var.f39554d, kv0Var.f39555e, zArr8, 0);
            boolean[] zArr9 = ov0Var.f40824g;
            if (zArr9.length > 3) {
                zArr9[3] = true;
            }
        } else if (str5 != null) {
            gv0 gv0Var = new gv0(new jv0(), 0);
            String valueOf2 = String.valueOf(UUID.randomUUID());
            gv0Var.f38158a = valueOf2;
            boolean[] zArr10 = gv0Var.f38161d;
            if (zArr10.length > 0) {
                zArr10[0] = true;
            }
            gv0Var.f38160c = str5;
            if (zArr10.length > 2) {
                zArr10[2] = true;
            }
            ov0Var.f40820c = new jv0(valueOf2, gv0Var.f38159b, str5, zArr10, 0);
            boolean[] zArr11 = ov0Var.f40824g;
            if (zArr11.length > 2) {
                zArr11[2] = true;
            }
        }
        mu0Var.f40220h = ov0Var.a();
        boolean[] zArr12 = mu0Var.f40225m;
        if (zArr12.length > 7) {
            zArr12[7] = true;
        }
        pu0 a13 = mu0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static final boolean Q0(tp tpVar, Function0 missingMediaCallback) {
        Intrinsics.checkNotNullParameter(missingMediaCallback, "missingMediaCallback");
        if (tpVar == null) {
            return false;
        }
        for (bo0 bo0Var : tpVar.getMediaList().getItems()) {
            d30 photoItem = bo0Var.getPhotoItem();
            if (photoItem != null && !photoItem.a()) {
                missingMediaCallback.invoke();
                return true;
            }
            k01 videoItem = bo0Var.getVideoItem();
            if (videoItem != null && !videoItem.a()) {
                missingMediaCallback.invoke();
                return true;
            }
        }
        return false;
    }

    public static final pu0 R(String str, SizeF sizeF, PointF pointF, int i13, int i14, String str2, String str3, int i15, String str4) {
        mu0 mu0Var = new mu0(0);
        mu0Var.b(str);
        mu0Var.f40221i = Double.valueOf(sizeF.getWidth());
        boolean[] zArr = mu0Var.f40225m;
        if (zArr.length > 8) {
            zArr[8] = true;
        }
        mu0Var.f40224l = Double.valueOf(sizeF.getHeight());
        boolean[] zArr2 = mu0Var.f40225m;
        if (zArr2.length > 11) {
            zArr2[11] = true;
        }
        mu0Var.f40222j = Double.valueOf(pointF.x);
        boolean[] zArr3 = mu0Var.f40225m;
        if (zArr3.length > 9) {
            zArr3[9] = true;
        }
        mu0Var.f40223k = Double.valueOf(pointF.y);
        boolean[] zArr4 = mu0Var.f40225m;
        if (zArr4.length > 10) {
            zArr4[10] = true;
        }
        mu0Var.f40215c = kotlin.collections.q0.f80391a;
        if (zArr4.length > 2) {
            zArr4[2] = true;
        }
        mu0Var.f40216d = Integer.valueOf(i13);
        boolean[] zArr5 = mu0Var.f40225m;
        if (zArr5.length > 3) {
            zArr5[3] = true;
        }
        mu0Var.f40217e = Integer.valueOf(i14);
        boolean[] zArr6 = mu0Var.f40225m;
        if (zArr6.length > 4) {
            zArr6[4] = true;
        }
        mu0Var.f40219g = "";
        if (zArr6.length > 6) {
            zArr6[6] = true;
        }
        ov0 ov0Var = new ov0(new rv0(), 0);
        ov0Var.f40818a = String.valueOf(UUID.randomUUID());
        boolean[] zArr7 = ov0Var.f40824g;
        if (zArr7.length > 0) {
            zArr7[0] = true;
        }
        sv0 sv0Var = new sv0(new vv0(), 0);
        sv0Var.f42003a = String.valueOf(UUID.randomUUID());
        boolean[] zArr8 = sv0Var.f42009g;
        if (zArr8.length > 0) {
            zArr8[0] = true;
        }
        sv0Var.f42008f = str2;
        if (zArr8.length > 5) {
            zArr8[5] = true;
        }
        Integer valueOf = Integer.valueOf(i15);
        sv0Var.f42007e = valueOf;
        boolean[] zArr9 = sv0Var.f42009g;
        if (zArr9.length > 4) {
            zArr9[4] = true;
        }
        sv0Var.f42006d = str3;
        if (zArr9.length > 3) {
            zArr9[3] = true;
        }
        sv0Var.f42005c = str4;
        if (zArr9.length > 2) {
            zArr9[2] = true;
        }
        ov0Var.f40822e = new vv0(sv0Var.f42003a, sv0Var.f42004b, str4, str3, valueOf, sv0Var.f42008f, zArr9, 0);
        boolean[] zArr10 = ov0Var.f40824g;
        if (zArr10.length > 4) {
            zArr10[4] = true;
        }
        mu0Var.f40220h = ov0Var.a();
        boolean[] zArr11 = mu0Var.f40225m;
        if (zArr11.length > 7) {
            zArr11[7] = true;
        }
        pu0 a13 = mu0Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        return a13;
    }

    public static boolean R0(int[] iArr) {
        if (iArr[0] != 1) {
            return false;
        }
        for (int i13 = 1; i13 < 5; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static final RectF S(Matrix viewMatrix, Path path) {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(viewMatrix, "viewMatrix");
        Path path2 = new Path(path);
        path2.transform(viewMatrix);
        RectF rectF = new RectF();
        path2.computeBounds(rectF, true);
        Rect rect = new Rect((int) rectF.left, (int) rectF.top, (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        Rect rect2 = new Rect();
        Region region = new Region();
        region.setPath(path2, new Region(rect));
        region.getBounds(rect2);
        return new RectF(rect2);
    }

    public static boolean S0(int[] iArr) {
        for (int i13 = 0; i13 < 5; i13++) {
            if (iArr[i13] != 0) {
                return false;
            }
        }
        return true;
    }

    public static void T(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }

    public static int U(int i13, int i14, int i15) {
        return i13 < i14 ? i14 : i13 > i15 ? i15 : i13;
    }

    public static final zy.f0 U0(boolean z13, String savedCollageId, h32.i0 pinalyticsContext, d32.c entryPointSource) {
        Intrinsics.checkNotNullParameter(savedCollageId, "savedCollageId");
        Intrinsics.checkNotNullParameter(pinalyticsContext, "pinalyticsContext");
        Intrinsics.checkNotNullParameter(entryPointSource, "entryPointSource");
        if (z13) {
            return new zy.f0(new zy.a(pinalyticsContext, h32.f1.COLLAGE_COMPOSER_DRAFT_FIRST_SAVE, null, bs1.c.o(new Pair("collage_draft_id", savedCollageId), new Pair("collage_first_time_save_entry_point_source", String.valueOf(entryPointSource.value()))), null, null, false, false, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION));
        }
        return null;
    }

    public static final xe2.g V(androidx.lifecycle.u1 u1Var, i2.o oVar) {
        xe2.g gVar;
        i2.s sVar = (i2.s) oVar;
        sVar.X(1770922558);
        if (u1Var instanceof androidx.lifecycle.k) {
            Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
            androidx.lifecycle.p1 delegateFactory = ((androidx.lifecycle.k) u1Var).getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(delegateFactory, "delegateFactory");
            while (context instanceof ContextWrapper) {
                if (context instanceof androidx.activity.o) {
                    gVar = xe2.g.d((androidx.activity.o) context, delegateFactory);
                    Intrinsics.checkNotNullExpressionValue(gVar, "createInternal(\n        … */ delegateFactory\n    )");
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    Intrinsics.checkNotNullExpressionValue(context, "ctx.baseContext");
                }
            }
            throw new IllegalStateException("Expected an activity context for creating a HiltViewModelFactory but instead found: " + context);
        }
        gVar = null;
        sVar.r(false);
        return gVar;
    }

    public static void V0(int[] iArr, int[] iArr2, int[] iArr3) {
        long j13 = iArr2[0] & 4294967295L;
        int i13 = 1;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = iArr[0] & 4294967295L;
        long j19 = j18 * j13;
        iArr3[0] = (int) j19;
        long j23 = (j18 * j14) + (j19 >>> 32);
        iArr3[1] = (int) j23;
        long j24 = (j18 * j15) + (j23 >>> 32);
        iArr3[2] = (int) j24;
        long j25 = (j18 * j16) + (j24 >>> 32);
        iArr3[3] = (int) j25;
        long j26 = (j18 * j17) + (j25 >>> 32);
        iArr3[4] = (int) j26;
        iArr3[5] = (int) (j26 >>> 32);
        for (int i14 = 5; i13 < i14; i14 = 5) {
            long j27 = iArr[i13] & 4294967295L;
            long j28 = j13;
            long j29 = (j27 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j29;
            int i15 = i13 + 1;
            long j33 = (j27 * j14) + (iArr3[i15] & 4294967295L) + (j29 >>> 32);
            iArr3[i15] = (int) j33;
            long j34 = j14;
            long j35 = (j27 * j15) + (iArr3[r16] & 4294967295L) + (j33 >>> 32);
            iArr3[i13 + 2] = (int) j35;
            long j36 = (j27 * j16) + (iArr3[r6] & 4294967295L) + (j35 >>> 32);
            iArr3[i13 + 3] = (int) j36;
            long j37 = j36 >>> 32;
            long j38 = (j27 * j17) + (iArr3[r3] & 4294967295L) + j37;
            iArr3[i13 + 4] = (int) j38;
            iArr3[i13 + 5] = (int) (j38 >>> 32);
            j13 = j28;
            i13 = i15;
            j14 = j34;
        }
    }

    public static final ul2.q1 W(ul2.c0 c0Var, kotlin.collections.q0 arguments, boolean z13, kotlin.collections.q0 annotations) {
        pn2.g1 m0Var;
        Intrinsics.checkNotNullParameter(c0Var, "<this>");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        am2.j a13 = c0Var.a();
        if (a13 == null) {
            throw new ul2.u1("Cannot create type for an unsupported classifier: " + c0Var + " (" + ul2.c0.class + ')');
        }
        pn2.b1 e13 = a13.e();
        Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
        List parameters = e13.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
        int size = parameters.size();
        arguments.getClass();
        if (size != 0) {
            throw new IllegalArgumentException("Class declares " + parameters.size() + " type parameters, but 0 were provided.");
        }
        annotations.getClass();
        pn2.u0.f100848b.getClass();
        pn2.u0 u0Var = pn2.u0.f100849c;
        List parameters2 = e13.getParameters();
        Intrinsics.checkNotNullExpressionValue(parameters2, "getParameters(...)");
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(arguments, 10));
        Iterator<E> it = arguments.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                return new ul2.q1(pn2.g.q(u0Var, e13, arrayList, z13), null);
            }
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            KTypeProjection kTypeProjection = (KTypeProjection) next;
            ul2.q1 q1Var = (ul2.q1) kTypeProjection.f80459b;
            pn2.b0 b0Var = q1Var != null ? q1Var.f122585a : null;
            rl2.z zVar = kTypeProjection.f80458a;
            int i15 = zVar == null ? -1 : sl2.a.f113224a[zVar.ordinal()];
            if (i15 == -1) {
                Object obj = parameters2.get(i13);
                Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
                m0Var = new pn2.m0((am2.c1) obj);
            } else if (i15 == 1) {
                pn2.w1 w1Var = pn2.w1.INVARIANT;
                Intrinsics.f(b0Var);
                m0Var = new pn2.i1(b0Var, w1Var);
            } else if (i15 == 2) {
                pn2.w1 w1Var2 = pn2.w1.IN_VARIANCE;
                Intrinsics.f(b0Var);
                m0Var = new pn2.i1(b0Var, w1Var2);
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                pn2.w1 w1Var3 = pn2.w1.OUT_VARIANCE;
                Intrinsics.f(b0Var);
                m0Var = new pn2.i1(b0Var, w1Var3);
            }
            arrayList.add(m0Var);
            i13 = i14;
        }
    }

    public static int W0(int[] iArr, int[] iArr2, int[] iArr3) {
        int i13 = 0;
        long j13 = iArr2[0] & 4294967295L;
        long j14 = iArr2[1] & 4294967295L;
        long j15 = iArr2[2] & 4294967295L;
        long j16 = iArr2[3] & 4294967295L;
        long j17 = iArr2[4] & 4294967295L;
        long j18 = 0;
        while (i13 < 5) {
            long j19 = j18;
            long j23 = iArr[i13] & 4294967295L;
            long j24 = j13;
            long j25 = (j23 * j13) + (iArr3[i13] & 4294967295L);
            iArr3[i13] = (int) j25;
            int i14 = i13 + 1;
            long j26 = (j23 * j14) + (iArr3[i14] & 4294967295L) + (j25 >>> 32);
            iArr3[i14] = (int) j26;
            long j27 = (j23 * j15) + (iArr3[r6] & 4294967295L) + (j26 >>> 32);
            iArr3[i13 + 2] = (int) j27;
            long j28 = (j23 * j16) + (iArr3[r6] & 4294967295L) + (j27 >>> 32);
            iArr3[i13 + 3] = (int) j28;
            long j29 = (j23 * j17) + (iArr3[r6] & 4294967295L) + (j28 >>> 32);
            iArr3[i13 + 4] = (int) j29;
            long j33 = j19 + (iArr3[r0] & 4294967295L) + (j29 >>> 32);
            iArr3[i13 + 5] = (int) j33;
            j18 = j33 >>> 32;
            j13 = j24;
            i13 = i14;
            j14 = j14;
        }
        return (int) j18;
    }

    public static final double X(int i13, int i14) {
        return ((i13 << 27) + i14) / 9.007199254740992E15d;
    }

    public static float X0(int i13) {
        return i13 / 350;
    }

    public static final void Y(ro2.c json, so2.r sb3, no2.h serializer, Object obj) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(sb3, "writer");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        so2.i0 mode = so2.i0.OBJ;
        ro2.t[] modeReuseCache = new ro2.t[so2.i0.getEntries().size()];
        Intrinsics.checkNotNullParameter(sb3, "output");
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(modeReuseCache, "modeReuseCache");
        Intrinsics.checkNotNullParameter(sb3, "sb");
        Intrinsics.checkNotNullParameter(json, "json");
        new so2.e0(json.f108976a.f109016e ? new so2.j(sb3, json) : new so2.g(sb3), json, mode, modeReuseCache).k(serializer, obj);
    }

    public static float Y0(int i13) {
        return i13 / 666;
    }

    public static final boolean Z0(f30 pin, wy0 wy0Var, er0.a aVar) {
        Boolean bool;
        Object n03;
        Map d2;
        Map G;
        v7 D3;
        Intrinsics.checkNotNullParameter(pin, "pin");
        if (wy0Var == null || (bool = wy0Var.G3()) == null) {
            bool = Boolean.FALSE;
        }
        boolean z13 = bool.booleanValue() || b40.Q0(pin);
        Intrinsics.checkNotNullParameter(pin, "pin");
        String o13 = b40.o(pin);
        String uid = wy0Var != null ? wy0Var.getUid() : null;
        boolean z14 = (o13 == null || uid == null || pin.e5().booleanValue() || !Intrinsics.d(o13, uid) || ((D3 = pin.D3()) != null && d.M0(D3))) ? false : true;
        Intrinsics.checkNotNullParameter(pin, "pin");
        int i13 = aVar == null ? -1 : er0.c.f59966a[aVar.ordinal()];
        if (i13 == 1) {
            n03 = n0(pin);
        } else if (i13 != 2) {
            Intrinsics.checkNotNullParameter(pin, "pin");
            Intrinsics.checkNotNullParameter(pin, "<this>");
            com.pinterest.api.model.f3 z33 = pin.z3();
            if (z33 == null || (G = z33.G()) == null || !(!G.isEmpty())) {
                Map V3 = pin.V3();
                Map y13 = V3 != null ? n.y(V3) : null;
                d2 = y13 == null ? kotlin.collections.z0.d() : y13;
            } else {
                d2 = n.y(G);
            }
            n03 = (s30) d2.get("30d_realtime");
        } else {
            n03 = o0(pin);
        }
        boolean z15 = n03 != null;
        if (z13) {
            return z14 || z15;
        }
        return false;
    }

    public static void a1(x61.j sourceView, nx.d0 pinalytics, m60.w eventManager, lb0.q prefsManagerPersisted, h61.h searchType, String query, String hairPatternTerm) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(searchType, "searchType");
        Intrinsics.checkNotNullParameter(hairPatternTerm, "hairPatternTerm");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        if (f79650j) {
            return;
        }
        String str = f79648h;
        if (str == null && f79649i == null) {
            f79648h = query;
            f79649i = hairPatternTerm;
            return;
        }
        String str2 = f79649i;
        f79649i = hairPatternTerm;
        f79648h = query;
        if (kotlin.text.z.i(query, str, true) || !Intrinsics.d(str2, hairPatternTerm)) {
            return;
        }
        String y13 = pe.i.y(prefsManagerPersisted);
        if (y13 == null || y13.length() == 0 || !hairPatternTerm.equals(pe.i.y(prefsManagerPersisted))) {
            Context context = sourceView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yb0.n nVar = new yb0.n(context);
            String string = nVar.getContext().getString(nv1.f.search_results_hair_pattern_remember);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            nVar.w(string);
            nVar.u(nVar.getContext().getString(nv1.f.search_results_hair_pattern_remember_description));
            String string2 = nVar.getContext().getString(m60.x0.okay);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            nVar.q(string2);
            String string3 = nVar.getContext().getString(m60.x0.not_now_sentence_case);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            nVar.m(string3);
            HashMap hashMap = new HashMap();
            hashMap.put("story_type", "hair_pattern_filters");
            h32.g0 g0Var = h32.g0.HAIR_PATTERN_FILTERS_REMEBER_DIALOG;
            nVar.f138513j = new sv1.d(pinalytics, g0Var, hashMap, prefsManagerPersisted, hairPatternTerm, eventManager, searchType, query, nVar, 0);
            nVar.f138514k = new sv1.c(pinalytics, g0Var, hashMap, prefsManagerPersisted, nVar, 1);
            eventManager.f(new yb0.e(nVar));
            pinalytics.U(new h32.i0(d4.SEARCH, null, null, g0Var, null, null), h32.f1.VIEW, null, null, hashMap, false);
        }
    }

    public static boolean b0(int[] iArr, int[] iArr2) {
        for (int i13 = 4; i13 >= 0; i13--) {
            if (iArr[i13] != iArr2[i13]) {
                return false;
            }
        }
        return true;
    }

    public static void b1(int[] iArr, int[] iArr2) {
        long j13 = iArr[0] & 4294967295L;
        int i13 = 10;
        int i14 = 0;
        int i15 = 4;
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
                long j23 = (iArr2[2] & 4294967295L) + (j19 >>> 32);
                long j24 = iArr[2] & 4294967295L;
                long j25 = j23 + (j24 * j13);
                int i18 = (int) j25;
                iArr2[2] = (i17 >>> 31) | (i18 << 1);
                int i19 = i18 >>> 31;
                long f13 = d7.g.f(j24, j18, j25 >>> 32, iArr2[3] & 4294967295L);
                long j26 = (iArr2[4] & 4294967295L) + (f13 >>> 32);
                long j27 = iArr[3] & 4294967295L;
                long j28 = (iArr2[5] & 4294967295L) + (j26 >>> 32);
                long j29 = j26 & 4294967295L;
                long j33 = (iArr2[6] & 4294967295L) + (j28 >>> 32);
                long j34 = j28 & 4294967295L;
                long j35 = (j27 * j13) + (f13 & 4294967295L);
                int i23 = (int) j35;
                iArr2[3] = i19 | (i23 << 1);
                int i24 = i23 >>> 31;
                long f14 = d7.g.f(j27, j18, j35 >>> 32, j29);
                long f15 = d7.g.f(j27, j24, f14 >>> 32, j34);
                long j36 = j33 + (f15 >>> 32);
                long j37 = f15 & 4294967295L;
                long j38 = iArr[4] & 4294967295L;
                long j39 = (iArr2[7] & 4294967295L) + (j36 >>> 32);
                long j43 = j36 & 4294967295L;
                long j44 = (j13 * j38) + (f14 & 4294967295L);
                int i25 = (int) j44;
                iArr2[4] = (i25 << 1) | i24;
                long f16 = d7.g.f(j38, j18, j44 >>> 32, j37);
                long f17 = d7.g.f(j38, j24, f16 >>> 32, j43);
                long f18 = d7.g.f(j38, j27, f17 >>> 32, j39 & 4294967295L);
                long j45 = (iArr2[8] & 4294967295L) + (j39 >>> 32) + (f18 >>> 32);
                int i26 = (int) f16;
                iArr2[5] = (i26 << 1) | (i25 >>> 31);
                int i27 = (int) f17;
                iArr2[6] = (i26 >>> 31) | (i27 << 1);
                int i28 = i27 >>> 31;
                int i29 = (int) f18;
                iArr2[7] = i28 | (i29 << 1);
                int i33 = i29 >>> 31;
                int i34 = (int) j45;
                iArr2[8] = i33 | (i34 << 1);
                iArr2[9] = ((iArr2[9] + ((int) (j45 >>> 32))) << 1) | (i34 >>> 31);
                return;
            }
            i15 = i16;
        }
    }

    public static int c0(int i13) {
        int i14 = i13 & 65535;
        int i15 = (i14 | (i14 << 8)) & 16711935;
        int i16 = (i15 | (i15 << 4)) & 252645135;
        int i17 = (i16 | (i16 << 2)) & 858993459;
        return (i17 | (i17 << 1)) & 1431655765;
    }

    public static final pn2.b0 c1(am2.c1 c1Var) {
        Intrinsics.checkNotNullParameter(c1Var, "<this>");
        am2.m g13 = c1Var.g();
        Intrinsics.checkNotNullExpressionValue(g13, "getContainingDeclaration(...)");
        if (g13 instanceof am2.k) {
            List parameters = ((am2.k) g13).e().getParameters();
            Intrinsics.checkNotNullExpressionValue(parameters, "getParameters(...)");
            List list = parameters;
            ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                pn2.b1 e13 = ((am2.c1) it.next()).e();
                Intrinsics.checkNotNullExpressionValue(e13, "getTypeConstructor(...)");
                arrayList.add(e13);
            }
            List upperBounds = c1Var.getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            xl2.l e14 = fn2.d.e(c1Var);
            pn2.b0 l13 = pn2.q1.e(new pn2.n0(arrayList)).l((pn2.b0) CollectionsKt.S(upperBounds), pn2.w1.OUT_VARIANCE);
            return l13 == null ? e14.m() : l13;
        }
        if (!(g13 instanceof am2.x)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
        List typeParameters = ((am2.x) g13).getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        List list2 = typeParameters;
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            pn2.b1 e15 = ((am2.c1) it2.next()).e();
            Intrinsics.checkNotNullExpressionValue(e15, "getTypeConstructor(...)");
            arrayList2.add(e15);
        }
        List upperBounds2 = c1Var.getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds2, "getUpperBounds(...)");
        xl2.l e16 = fn2.d.e(c1Var);
        pn2.b0 l14 = pn2.q1.e(new pn2.n0(arrayList2)).l((pn2.b0) CollectionsKt.S(upperBounds2), pn2.w1.OUT_VARIANCE);
        return l14 == null ? e16.m() : l14;
    }

    public static long d0(int i13) {
        int i14 = ((i13 >>> 8) ^ i13) & 65280;
        int i15 = i13 ^ (i14 ^ (i14 << 8));
        int i16 = ((i15 >>> 4) ^ i15) & 15728880;
        int i17 = i15 ^ (i16 ^ (i16 << 4));
        int i18 = ((i17 >>> 2) ^ i17) & 202116108;
        int i19 = i17 ^ (i18 ^ (i18 << 2));
        int i23 = ((i19 >>> 1) ^ i19) & 572662306;
        return (((r6 >>> 1) & 1431655765) << 32) | (1431655765 & (i19 ^ (i23 ^ (i23 << 1))));
    }

    public static int d1(int[] iArr, int[] iArr2, int[] iArr3) {
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
        return (int) (j17 >> 32);
    }

    public static void e0(int i13, long j13, long[] jArr) {
        long j14 = ((j13 >>> 16) ^ j13) & 4294901760L;
        long j15 = j13 ^ (j14 ^ (j14 << 16));
        long j16 = ((j15 >>> 8) ^ j15) & 280375465148160L;
        long j17 = j15 ^ (j16 ^ (j16 << 8));
        long j18 = ((j17 >>> 4) ^ j17) & 67555025218437360L;
        long j19 = j17 ^ (j18 ^ (j18 << 4));
        long j23 = ((j19 >>> 2) ^ j19) & 868082074056920076L;
        long j24 = j19 ^ (j23 ^ (j23 << 2));
        long j25 = ((j24 >>> 1) ^ j24) & 2459565876494606882L;
        long j26 = j24 ^ (j25 ^ (j25 << 1));
        jArr[i13] = j26 & 6148914691236517205L;
        jArr[i13 + 1] = (j26 >>> 1) & 6148914691236517205L;
    }

    public static void e1(int[] iArr, int[] iArr2) {
        long j13 = (iArr2[0] & 4294967295L) - (iArr[0] & 4294967295L);
        iArr2[0] = (int) j13;
        long j14 = ((iArr2[1] & 4294967295L) - (iArr[1] & 4294967295L)) + (j13 >> 32);
        iArr2[1] = (int) j14;
        long j15 = ((iArr2[2] & 4294967295L) - (iArr[2] & 4294967295L)) + (j14 >> 32);
        iArr2[2] = (int) j15;
        long j16 = ((iArr2[3] & 4294967295L) - (iArr[3] & 4294967295L)) + (j15 >> 32);
        iArr2[3] = (int) j16;
        iArr2[4] = (int) (((iArr2[4] & 4294967295L) - (4294967295L & iArr[4])) + (j16 >> 32));
    }

    public static int f0(int i13) {
        int i14 = i13 & 255;
        int i15 = (i14 | (i14 << 4)) & 3855;
        int i16 = (i15 | (i15 << 2)) & 13107;
        return (i16 | (i16 << 1)) & 21845;
    }

    public static BigInteger f1(int[] iArr) {
        byte[] bArr = new byte[20];
        for (int i13 = 0; i13 < 5; i13++) {
            int i14 = iArr[i13];
            if (i14 != 0) {
                e0.t.K0(bArr, i14, (4 - i13) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }

    public static final HashSet g0(Iterable iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set c13 = ((in2.n) it.next()).c();
            if (c13 == null) {
                return null;
            }
            kotlin.collections.k0.u(c13, hashSet);
        }
        return hashSet;
    }

    public static final ExtractedText g1(h4.f0 f0Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = f0Var.f67559a.f21571a;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j13 = f0Var.f67560b;
        extractedText.selectionStart = b4.p0.e(j13);
        extractedText.selectionEnd = b4.p0.d(j13);
        extractedText.flags = !StringsKt.F(f0Var.f67559a.f21571a, '\n') ? 1 : 0;
        return extractedText;
    }

    public static int[] h0(BigInteger bigInteger) {
        if (bigInteger.signum() < 0 || bigInteger.bitLength() > 160) {
            throw new IllegalArgumentException();
        }
        int[] iArr = new int[5];
        int i13 = 0;
        while (bigInteger.signum() != 0) {
            iArr[i13] = bigInteger.intValue();
            bigInteger = bigInteger.shiftRight(32);
            i13++;
        }
        return iArr;
    }

    public static final s1.l i0(androidx.compose.foundation.lazy.layout.c0 c0Var, int i13, long j13, s1.c0 c0Var2, long j14, m1.f1 f1Var, u2.c cVar, u2.d dVar, n4.k kVar, boolean z13, int i14) {
        return new s1.l(i13, i14, ((androidx.compose.foundation.lazy.layout.d0) c0Var).a(i13, j13), j14, c0Var2.c(i13), f1Var, cVar, dVar, kVar, z13);
    }

    public static long i1(long j13) {
        long j14 = ((j13 >>> 1) ^ j13) & 2459565876494606882L;
        long j15 = j13 ^ (j14 ^ (j14 << 1));
        long j16 = ((j15 >>> 2) ^ j15) & 868082074056920076L;
        long j17 = j15 ^ (j16 ^ (j16 << 2));
        long j18 = ((j17 >>> 4) ^ j17) & 67555025218437360L;
        long j19 = j17 ^ (j18 ^ (j18 << 4));
        long j23 = ((j19 >>> 8) ^ j19) & 280375465148160L;
        long j24 = j19 ^ (j23 ^ (j23 << 8));
        long j25 = ((j24 >>> 16) ^ j24) & 4294901760L;
        return j24 ^ (j25 ^ (j25 << 16));
    }

    public static int j0(int[] iArr) {
        return iArr[0] & 1;
    }

    public static int j1(Set set) {
        Iterator it = set.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i13 += next != null ? next.hashCode() : 0;
        }
        return i13;
    }

    public static final h32.u0 k0(uq overlayType) {
        Intrinsics.checkNotNullParameter(overlayType, "overlayType");
        switch (uv0.h.f123171a[overlayType.ordinal()]) {
            case 1:
                return h32.u0.STORY_PIN_MENTION_TAG;
            case 2:
                return h32.u0.STORY_PIN_PRODUCT_TAG;
            case 3:
                return h32.u0.STORY_PIN_STATIC_STICKER;
            case 4:
                return h32.u0.STORY_PIN_TEXT;
            case 5:
                return h32.u0.STORY_PIN_VTO_PRODUCT_TAG;
            case 6:
                return h32.u0.IDEA_PIN_BOARD_STICKER;
            case 7:
                return h32.u0.IDEA_PIN_IMAGE_STICKER_BUTTON;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final RectF l0(RectF creationRect) {
        Intrinsics.checkNotNullParameter(creationRect, "creationRect");
        return new RectF(0.0f, 0.0f, (float) Math.rint(creationRect.width()), (float) Math.rint(creationRect.height()));
    }

    public static Method m0(String str, Class... clsArr) {
        com.bugsnag.android.h2 h2Var = f79641a;
        if (h2Var == null) {
            return null;
        }
        return h2Var.getClass().getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
    }

    public static final s30 n0(f30 pin) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        com.pinterest.api.model.f3 z33 = pin.z3();
        Map G = z33 != null ? z33.G() : null;
        Map y13 = G != null ? n.y(G) : null;
        if (y13 == null) {
            Map V3 = pin.V3();
            y13 = V3 != null ? n.y(V3) : null;
        }
        if (y13 != null) {
            return (s30) y13.get("30d_realtime");
        }
        return null;
    }

    public static final d01 o0(f30 pin) {
        Map z13;
        Map G;
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pin, "<this>");
        com.pinterest.api.model.f3 z33 = pin.z3();
        if (z33 == null || (G = z33.G()) == null || !(!G.isEmpty())) {
            Map V3 = pin.V3();
            z13 = V3 != null ? n.z(V3) : null;
            if (z13 == null) {
                z13 = kotlin.collections.z0.d();
            }
        } else {
            z13 = n.z(G);
        }
        return (d01) z13.get("30d_realtime");
    }

    public static boolean p0(int[] iArr, int[] iArr2) {
        for (int i13 = 4; i13 >= 0; i13--) {
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

    public static void q0(n70.w wVar, vy.m mVar) {
        wVar.f89694d1 = mVar;
    }

    public static void r0(cu.m mVar, jo1.c cVar) {
        mVar.f53225e0 = cVar;
    }

    public static void s0(cj0.p pVar, cj0.f fVar) {
        pVar.N0 = fVar;
    }

    public static void t0(ht0.g gVar, xs0.l lVar) {
        gVar.C0 = lVar;
    }

    public static void u0(cj0.p pVar, zf0.f fVar) {
        pVar.L0 = fVar;
    }

    public static void v0(cj0.p pVar, lh0.r rVar) {
        pVar.M0 = rVar;
    }

    public static void w0(ht0.g gVar, lh0.r1 r1Var) {
        gVar.A0 = r1Var;
    }

    public static void x0(cj0.p pVar, il1.a aVar) {
        pVar.R0 = aVar;
    }

    public static void y0(ea0.t tVar, n5 n5Var) {
        tVar.L0 = n5Var;
    }

    public static void z0(fv0.b bVar, m8 m8Var) {
        bVar.f63017z0 = m8Var;
    }

    @Override // po2.b
    public void A(oo2.g descriptor, int i13, no2.b serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Z(descriptor, i13);
        e0.t.p(this, serializer, obj);
    }

    @Override // po2.b
    public void B(qo2.a1 descriptor, int i13, short s13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        t(s13);
    }

    @Override // po2.d
    public abstract void C(int i13);

    @Override // po2.b
    public void D(int i13, int i14, oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        C(i14);
    }

    @Override // po2.b
    public void E(oo2.g descriptor, int i13, boolean z13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        w(z13);
    }

    @Override // po2.d
    public abstract void F(String str);

    public void Z(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    @Override // po2.b
    public void a(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
    }

    public void a0(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        StringBuilder sb3 = new StringBuilder("Non-serializable ");
        Class<?> cls = value.getClass();
        kotlin.jvm.internal.l0 l0Var = kotlin.jvm.internal.k0.f80436a;
        sb3.append(l0Var.b(cls));
        sb3.append(" is not supported by ");
        sb3.append(l0Var.b(getClass()));
        sb3.append(" encoder");
        throw new SerializationException(sb3.toString());
    }

    @Override // po2.d
    public po2.b b(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // po2.d
    public void f(double d2) {
        a0(Double.valueOf(d2));
    }

    @Override // po2.d
    public abstract void g(byte b13);

    @Override // po2.d
    public po2.b h(oo2.g descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return b(descriptor);
    }

    @Override // po2.b
    public void i(qo2.a1 descriptor, int i13, char c13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        z(c13);
    }

    @Override // po2.b
    public boolean j(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    @Override // po2.d
    public void k(no2.h serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.c(this, obj);
    }

    @Override // po2.d
    public po2.d l(oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this;
    }

    @Override // po2.b
    public void m(int i13, String value, oo2.g descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(value, "value");
        Z(descriptor, i13);
        F(value);
    }

    @Override // po2.d
    public void n(oo2.g enumDescriptor, int i13) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        a0(Integer.valueOf(i13));
    }

    @Override // po2.b
    public void o(oo2.g descriptor, int i13, double d2) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        f(d2);
    }

    @Override // po2.b
    public po2.d p(qo2.a1 descriptor, int i13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        return l(descriptor.h(i13));
    }

    @Override // po2.d
    public abstract void q(long j13);

    @Override // po2.b
    public void r(qo2.a1 descriptor, int i13, byte b13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        g(b13);
    }

    @Override // po2.d
    public void s() {
        throw new SerializationException("'null' is not supported by default");
    }

    @Override // po2.d
    public abstract void t(short s13);

    @Override // po2.b
    public void u(oo2.g descriptor, int i13, no2.h serializer, Object obj) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Z(descriptor, i13);
        k(serializer, obj);
    }

    @Override // po2.b
    public void v(oo2.g descriptor, int i13, float f13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        x(f13);
    }

    @Override // po2.d
    public void w(boolean z13) {
        a0(Boolean.valueOf(z13));
    }

    @Override // po2.d
    public void x(float f13) {
        a0(Float.valueOf(f13));
    }

    @Override // po2.b
    public void y(oo2.g descriptor, int i13, long j13) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Z(descriptor, i13);
        q(j13);
    }

    @Override // po2.d
    public void z(char c13) {
        a0(Character.valueOf(c13));
    }
}
