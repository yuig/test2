package com.bumptech.glide;

import a7.o0;
import am2.g1;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import androidx.appcompat.widget.e2;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ResourceResolutionException;
import ao2.b2;
import ao2.d0;
import ao2.f0;
import ao2.k2;
import ao2.t0;
import ao2.t2;
import ao2.v0;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.q;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.deserializer.UserDeserializer;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.or;
import com.pinterest.api.model.vy0;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import com.pinterest.gestalt.iconbutton.GestaltIconButton;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.ui.grid.LegoPinGridCellImpl;
import df.j1;
import dm2.u0;
import eo2.g0;
import g1.u;
import gk1.x0;
import h3.j0;
import h32.a4;
import h32.d4;
import i2.i0;
import i2.y2;
import i2.z1;
import j9.s;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import kh2.u2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.q0;
import kotlin.collections.z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import lb.l0;
import lh0.g2;
import lh0.z3;
import ok.w;
import okhttp3.HttpUrl;
import org.xmlpull.v1.XmlPullParserException;
import pc.n0;
import pc.v;
import pk.v2;
import pk.y0;
import pn2.b0;
import pn2.h0;
import pn2.l1;
import pn2.t1;
import pn2.u1;
import pn2.x;
import qa2.a1;
import qa2.k0;
import qa2.r0;
import qa2.s0;
import rm1.r;
import rm2.y;
import s3.a2;
import s3.q1;
import s3.r1;
import s3.v1;
import so.kd;
import so.oa;
import t3.c0;
import t3.f2;
import u50.p0;
import ul2.c2;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a */
    public static q f29748a;

    /* renamed from: b */
    public static boolean f29749b;

    public static /* synthetic */ do2.i A(g0 g0Var, f0 f0Var, int i13, co2.a aVar, int i14) {
        CoroutineContext coroutineContext = f0Var;
        if ((i14 & 1) != 0) {
            coroutineContext = kotlin.coroutines.j.f80412a;
        }
        if ((i14 & 2) != 0) {
            i13 = -3;
        }
        if ((i14 & 4) != 0) {
            aVar = co2.a.SUSPEND;
        }
        return g0Var.a(coroutineContext, i13, aVar);
    }

    public static boolean A0(char c13) {
        return c13 >= 'A' && c13 <= 'Z';
    }

    public static final List B(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        int i13 = rn1.o.GestaltText_gestalt_textAlignment;
        ps0.m mVar = vn1.h.f126275a;
        vn1.b bVar = vn1.h.f126276b;
        int i14 = typedArray.getInt(i13, bVar.getGravity$text_release());
        vn1.b bVar2 = vn1.b.CENTER_HORIZONTAL;
        Pair pair = new Pair(Integer.valueOf(bVar2.getGravity$text_release()), e0.b(bVar2));
        vn1.b bVar3 = vn1.b.FORCE_LEFT;
        Pair pair2 = new Pair(Integer.valueOf(bVar3.getGravity$text_release()), e0.b(bVar3));
        vn1.b bVar4 = vn1.b.FORCE_RIGHT;
        Pair pair3 = new Pair(Integer.valueOf(bVar4.getGravity$text_release()), e0.b(bVar4));
        vn1.b bVar5 = vn1.b.CENTER_VERTICAL;
        Pair pair4 = new Pair(Integer.valueOf(bVar5.getGravity$text_release()), e0.b(bVar5));
        vn1.b bVar6 = vn1.b.CENTER;
        Pair pair5 = new Pair(Integer.valueOf(bVar6.getGravity$text_release()), e0.b(bVar6));
        vn1.b bVar7 = vn1.b.TOP;
        Pair pair6 = new Pair(Integer.valueOf(bVar7.getGravity$text_release()), e0.b(bVar7));
        vn1.b bVar8 = vn1.b.BOTTOM;
        Pair pair7 = new Pair(Integer.valueOf(bVar8.getGravity$text_release()), e0.b(bVar8));
        vn1.b bVar9 = vn1.b.END;
        Pair pair8 = new Pair(Integer.valueOf(bVar9.getGravity$text_release()), e0.b(bVar9));
        vn1.b bVar10 = vn1.b.NONE;
        Pair pair9 = new Pair(Integer.valueOf(bVar10.getGravity$text_release()), e0.b(bVar10));
        int gravity$text_release = bVar5.getGravity$text_release();
        vn1.b bVar11 = vn1.b.START;
        Collection collection = (List) z0.g(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, new Pair(Integer.valueOf(gravity$text_release | bVar11.getGravity$text_release()), kotlin.collections.f0.j(bVar5, bVar11)), new Pair(Integer.valueOf(bVar5.getGravity$text_release() | bVar9.getGravity$text_release()), kotlin.collections.f0.j(bVar5, bVar9)), new Pair(Integer.valueOf(bVar2.getGravity$text_release() | bVar7.getGravity$text_release()), kotlin.collections.f0.j(bVar2, bVar7)), new Pair(Integer.valueOf(bVar2.getGravity$text_release() | bVar8.getGravity$text_release()), kotlin.collections.f0.j(bVar2, bVar8)), new Pair(Integer.valueOf(bVar7.getGravity$text_release() | bVar11.getGravity$text_release()), kotlin.collections.f0.j(bVar7, bVar11)), new Pair(Integer.valueOf(bVar7.getGravity$text_release() | bVar9.getGravity$text_release()), kotlin.collections.f0.j(bVar7, bVar9)), new Pair(Integer.valueOf(bVar8.getGravity$text_release() | bVar11.getGravity$text_release()), kotlin.collections.f0.j(bVar8, bVar11)), new Pair(Integer.valueOf(bVar8.getGravity$text_release() | bVar9.getGravity$text_release()), kotlin.collections.f0.j(bVar8, bVar9)), new Pair(Integer.valueOf(bVar7.getGravity$text_release() | bVar6.getGravity$text_release()), kotlin.collections.f0.j(bVar7, bVar6)), new Pair(Integer.valueOf(bVar11.getGravity$text_release() | bVar6.getGravity$text_release()), kotlin.collections.f0.j(bVar11, bVar6)), new Pair(Integer.valueOf(bVar9.getGravity$text_release() | bVar6.getGravity$text_release()), kotlin.collections.f0.j(bVar9, bVar6))).get(Integer.valueOf(i14));
        if (collection == null) {
            collection = q0.f80391a;
        }
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            collection2 = e0.b(bVar);
        }
        return (List) collection2;
    }

    public static final boolean B0(l82.e eVar, f30 pin, fs.c cVar, wa2.m mVar) {
        if (!n60.o.B(pin, "getIsPromoted(...)")) {
            eVar.a(new gk1.g0(kd.f113526a));
            return ((x0) eVar.f82219b).f65299g.f90847c0;
        }
        boolean z13 = mVar.N;
        wa2.g0 g0Var = mVar.f128851b0;
        boolean z14 = g0Var != null ? g0Var.f128738t : false;
        boolean b03 = dl2.b.b0((x0) eVar.f82219b);
        boolean z15 = ((x0) eVar.f82219b).f65299g.f90849d0;
        defpackage.d activateExperiment = new defpackage.d(28, eVar);
        cVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(activateExperiment, "activateExperiment");
        if (!cVar.c(pin, z13, mVar.O, z14, b03)) {
            return false;
        }
        activateExperiment.invoke();
        return z15;
    }

    public static Application C(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static final boolean C0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        if (list.size() <= 3 || !Intrinsics.d(list.get(1), "visual_search") || StringsKt.E(url.f95639i, "item_count=", false)) {
            return false;
        }
        return (Intrinsics.d(list.get(2), "flashlight") && Intrinsics.d(list.get(3), "pin")) || (Intrinsics.d(list.get(2), "lens") && Intrinsics.d(list.get(3), "search"));
    }

    public static final String D(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String M5 = f30Var.M5();
        if (M5 != null && !z.j(M5)) {
            Uri parse = Uri.parse(f30Var.M5());
            Intrinsics.checkNotNullExpressionValue(parse, "parse(...)");
            if (j1.f1(parse) && f30Var.n6()) {
                if (f30Var.m6().intValue() != v22.c.APP_STORE_TRIGGER.getValue()) {
                    return f30Var.M5();
                }
            }
        }
        if (URLUtil.isValidUrl(f30Var.u3())) {
            return f30Var.u3();
        }
        String x53 = f30Var.x5();
        if (x53 != null && !z.j(x53)) {
            z70.f settings = ((oa) z70.i.a()).r2();
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (!settings.f140992a) {
                return f30Var.x5();
            }
        }
        String I6 = f30Var.I6();
        if (I6 != null && !z.j(I6)) {
            return f30Var.I6();
        }
        String D6 = f30Var.D6();
        if (D6 != null && !z.j(D6)) {
            return f30Var.D6();
        }
        String s53 = f30Var.s5();
        if (s53 != null && !z.j(s53)) {
            return f30Var.s5();
        }
        String y03 = bs1.c.y0(f30Var);
        return (y03 == null || z.j(y03)) ? bs1.c.B0(f30Var) : bs1.c.y0(f30Var);
    }

    public static final q5.x0 D0(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return new q5.x0(array);
    }

    public static final int E(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        if (hf0.b.q()) {
            return G();
        }
        return hf0.b.j(viewGroup.getContext()) - (viewGroup.getPaddingEnd() + viewGroup.getPaddingStart());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object E0(java.util.Collection r4, bl2.c r5) {
        /*
            boolean r0 = r5 instanceof ao2.g
            if (r0 == 0) goto L13
            r0 = r5
            ao2.g r0 = (ao2.g) r0
            int r1 = r0.f20152t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20152t = r1
            goto L18
        L13:
            ao2.g r0 = new ao2.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f20151s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f20152t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.util.Iterator r4 = r0.f20150r
            ue.c.H(r5)
            goto L3a
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            ue.c.H(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L51
            java.lang.Object r5 = r4.next()
            ao2.o1 r5 = (ao2.o1) r5
            r0.f20150r = r4
            r0.f20152t = r3
            java.lang.Object r5 = r5.join(r0)
            if (r5 != r1) goto L3a
            return r1
        L51:
            kotlin.Unit r4 = kotlin.Unit.f80348a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.E0(java.util.Collection, bl2.c):java.lang.Object");
    }

    public static String F(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        boolean z13 = false;
        String str = null;
        while (it.hasNext()) {
            String str2 = ((s) it.next()).f75089a.f75061g.f18765o;
            if (o0.q(str2)) {
                return "video/mp4";
            }
            if (o0.m(str2)) {
                z13 = true;
            } else if (o0.o(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        return z13 ? "audio/mp4" : str != null ? str : "application/mp4";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0050 -> B:10:0x0053). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F0(ao2.o1[] r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof ao2.f
            if (r0 == 0) goto L13
            r0 = r7
            ao2.f r0 = (ao2.f) r0
            int r1 = r0.f20144v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20144v = r1
            goto L18
        L13:
            ao2.f r0 = new ao2.f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f20143u
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f20144v
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r6 = r0.f20142t
            int r2 = r0.f20141s
            java.lang.Object[] r4 = r0.f20140r
            ao2.o1[] r4 = (ao2.o1[]) r4
            ue.c.H(r7)
            r7 = r4
            goto L53
        L30:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L38:
            ue.c.H(r7)
            int r7 = r6.length
            r2 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L40:
            if (r2 >= r6) goto L55
            r4 = r7[r2]
            r0.f20140r = r7
            r0.f20141s = r2
            r0.f20142t = r6
            r0.f20144v = r3
            java.lang.Object r4 = r4.join(r0)
            if (r4 != r1) goto L53
            return r1
        L53:
            int r2 = r2 + r3
            goto L40
        L55:
            kotlin.Unit r6 = kotlin.Unit.f80348a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.F0(ao2.o1[], bl2.c):java.lang.Object");
    }

    public static final int G() {
        return ml2.c.c(Math.max(hf0.b.f69002b, hf0.b.f69003c) / 2);
    }

    public static void G0(wa2.i pinFeatureConfig, qa2.o oVar, qa2.f0 f0Var, f30 f30Var, int i13) {
        qa2.a aVar;
        LegoPinGridCellImpl legoPinGridCellImpl = (LegoPinGridCellImpl) oVar;
        legoPinGridCellImpl.Q0 = i13;
        legoPinGridCellImpl.f52451q = pinFeatureConfig.f128803w;
        legoPinGridCellImpl.f52447p = pinFeatureConfig.f128795s;
        legoPinGridCellImpl.f52423j = pinFeatureConfig.f128787o;
        legoPinGridCellImpl.f52427k = pinFeatureConfig.f128789p;
        if (n60.o.B(f30Var, "getIsPromoted(...)")) {
            aVar = qa2.a.PROMOTED;
        } else {
            Boolean Y4 = f30Var.Y4();
            Intrinsics.checkNotNullExpressionValue(Y4, "getIsNative(...)");
            aVar = Y4.booleanValue() ? qa2.a.CREATED_BY : b40.b0(f30Var) ? qa2.a.PICK_FOR_YOU : b40.A0(f30Var) ? qa2.a.INTEREST_PIN : pinFeatureConfig.f128761b ? qa2.a.ONTO_BOARD : qa2.a.PINNED_BY;
        }
        legoPinGridCellImpl.x2(aVar);
        k0.a(f30Var, legoPinGridCellImpl, pinFeatureConfig);
        legoPinGridCellImpl.setTag(m60.x0.TAG_INDEX, Integer.valueOf(i13));
        legoPinGridCellImpl.I = pinFeatureConfig.K;
        f0Var.setPin(f30Var, i13);
        if (f0Var instanceof s0) {
            r0 r0Var = (r0) ((s0) f0Var);
            Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
            wa2.z zVar = pinFeatureConfig.f128780k0;
            if (zVar != null) {
                a1 a1Var = r0Var.f103346i;
                if (a1Var != null) {
                    a1Var.s(zVar);
                } else {
                    Intrinsics.r("pinSavedOverlayView");
                    throw null;
                }
            }
        }
    }

    public static final int H(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    public static final long H0(long j13, long j14, float f13) {
        float U = tb.f.U(Float.intBitsToFloat((int) (j13 >> 32)), Float.intBitsToFloat((int) (j14 >> 32)), f13);
        float U2 = tb.f.U(Float.intBitsToFloat((int) (j13 & 4294967295L)), Float.intBitsToFloat((int) (j14 & 4294967295L)), f13);
        return (Float.floatToRawIntBits(U) << 32) | (Float.floatToRawIntBits(U2) & 4294967295L);
    }

    public static Drawable I(Context context, int i13) {
        return e2.d().g(context, i13);
    }

    public static void I0(String str, Bundle bundle) {
        try {
            nl.g.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e13) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e13);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e14) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e14);
                }
            }
            String str2 = pf.b.f(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            nl.g c13 = nl.g.c();
            c13.b();
            pl.a aVar = (pl.a) c13.f91220d.a(pl.a.class);
            if (aVar != null) {
                ((pl.b) aVar).a(str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final b0 J(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        if (b0Var instanceof u1) {
            return ((u1) b0Var).X();
        }
        return null;
    }

    public static final y J0(b0 b0Var) {
        Intrinsics.checkNotNullParameter(b0Var, "<this>");
        return (y) ue.c.B(b0Var, rm2.o0.f108768k, wn2.c.f130595i);
    }

    public static final b0 K(am2.d dVar) {
        dm2.d D = dVar.D();
        dm2.d A = dVar.A();
        if (D != null) {
            return D.getType();
        }
        if (A != null) {
            if (dVar instanceof am2.l) {
                return A.getType();
            }
            am2.m g13 = dVar.g();
            am2.g gVar = g13 instanceof am2.g ? (am2.g) g13 : null;
            if (gVar != null) {
                return gVar.j();
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00eb, code lost:
    
        if (r5.l("ap_medium_search_intent_notifs_prompt") == false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x010e, code lost:
    
        if (r4.l("ap_high_search_intent_notifs_prompt") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0046, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r19.a("PREF_TIME_LAST_NOTIF_PERMISSION_REQUESTED", 0)) < java.util.concurrent.TimeUnit.HOURS.toMillis(24)) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean K0(ny1.w r15, android.app.Activity r16, sz1.i r17, kotlin.jvm.functions.Function0 r18, lb0.q r19, b60.b r20) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.K0(ny1.w, android.app.Activity, sz1.i, kotlin.jvm.functions.Function0, lb0.q, b60.b):boolean");
    }

    public static Object L(AbstractCollection abstractCollection, Object obj) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void L0(u2.p pVar, Function0 function0) {
        v1 v1Var = pVar.f120048g;
        if (v1Var == null) {
            v1Var = new v1((s3.u1) pVar);
            pVar.f120048g = v1Var;
        }
        c0 c0Var = (c0) V0(pVar);
        c0Var.A.b(v1Var, s3.s0.f110922p, function0);
    }

    public static final rm1.d M(TypedArray typedArray, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        if (r.b(typedArray, i13) == null) {
            return null;
        }
        rm1.q a13 = r.a(typedArray, i13, GestaltIcon.f49401c);
        rm1.i iVar = GestaltIcon.f49403e;
        int i16 = typedArray.getInt(i15, -1);
        if (i16 >= 0) {
            iVar = rm1.i.values()[i16];
        }
        rm1.f fVar = new rm1.f(a13, iVar);
        rm1.c cVar = GestaltIcon.f49405g;
        int i17 = typedArray.getInt(i14, -1);
        return new rm1.d(fVar, i17 >= 0 ? rm1.c.values()[i17] : cVar, null, 0, null, 28);
    }

    public static final g3.b M0(int i13, i2.o oVar) {
        TypedValue typedValue;
        i2.s sVar = (i2.s) oVar;
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        sVar.m(AndroidCompositionLocals_androidKt.f17454a);
        Resources resources = context.getResources();
        x3.e eVar = (x3.e) sVar.m(AndroidCompositionLocals_androidKt.f17457d);
        synchronized (eVar) {
            typedValue = (TypedValue) eVar.f131604a.h(i13);
            if (typedValue == null) {
                typedValue = new TypedValue();
                resources.getValue(i13, typedValue, true);
                u uVar = eVar.f131604a;
                int f13 = uVar.f(i13);
                Object[] objArr = uVar.f63327c;
                Object obj = objArr[f13];
                uVar.f63326b[f13] = i13;
                objArr[f13] = typedValue;
            }
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !StringsKt.H(charSequence, ".xml")) {
            sVar.W(-802884675);
            boolean h10 = sVar.h(context.getTheme()) | sVar.h(charSequence) | sVar.f(i13);
            Object J2 = sVar.J();
            if (h10 || J2 == i2.n.f71185a) {
                try {
                    Drawable drawable = resources.getDrawable(i13, null);
                    Intrinsics.g(drawable, "null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
                    J2 = new b3.h(((BitmapDrawable) drawable).getBitmap());
                    sVar.g0(J2);
                } catch (Exception e13) {
                    throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e13);
                }
            }
            g3.a aVar = new g3.a((b3.f0) J2);
            sVar.r(false);
            return aVar;
        }
        sVar.W(-803040357);
        Resources.Theme theme = context.getTheme();
        int i14 = typedValue.changingConfigurations;
        x3.d dVar = (x3.d) sVar.m(AndroidCompositionLocals_androidKt.f17456c);
        x3.c cVar = new x3.c(i13, theme);
        WeakReference weakReference = (WeakReference) dVar.f131603a.get(cVar);
        x3.b bVar = weakReference != null ? (x3.b) weakReference.get() : null;
        if (bVar == null) {
            XmlResourceParser xml = resources.getXml(i13);
            int next = xml.next();
            while (next != 2 && next != 1) {
                next = xml.next();
            }
            if (next != 2) {
                throw new XmlPullParserException("No start tag found");
            }
            if (!Intrinsics.d(xml.getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            bVar = bf.b.W(theme, resources, xml, i14);
            dVar.f131603a.put(cVar, new WeakReference(bVar));
        }
        j0 Q0 = Q0(bVar.f131599a, sVar);
        sVar.r(false);
        return Q0;
    }

    public static fm1.a N(TypedArray typedArray, int i13) {
        fm1.a aVar = fm1.a.AUTO;
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "default");
        int i14 = typedArray.getInt(i13, aVar.getImportantForAccessibility());
        return i14 != 0 ? i14 != 1 ? i14 != 4 ? fm1.a.NO : fm1.a.NO_HIDE_DESCENDANTS : fm1.a.YES : aVar;
    }

    public static final pc.h N0(v customScalarAdapters, pc.o0 operation, tc.f jsonReader) {
        pc.h hVar;
        Intrinsics.checkNotNullParameter(operation, "<this>");
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        ja.c0 G0 = d7.b.G0(operation, customScalarAdapters);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Throwable th3 = null;
        Intrinsics.d(null, Boolean.TRUE);
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        linkedHashMap.putAll(customScalarAdapters.f99609c);
        pc.b j13 = customScalarAdapters.f99608b.j();
        j13.f99512a = G0;
        ae.s adapterContext = j13.a();
        Intrinsics.checkNotNullParameter(adapterContext, "adapterContext");
        v customScalarAdapters2 = new v(linkedHashMap, adapterContext);
        Intrinsics.checkNotNullParameter(jsonReader, "jsonReader");
        Intrinsics.checkNotNullParameter(operation, "operation");
        Intrinsics.checkNotNullParameter(customScalarAdapters2, "customScalarAdapters");
        try {
            jsonReader.s();
            Map map = null;
            n0 n0Var = null;
            List list = null;
            while (jsonReader.hasNext()) {
                String k03 = jsonReader.k0();
                int hashCode = k03.hashCode();
                if (hashCode != -1809421292) {
                    if (hashCode != -1294635157) {
                        if (hashCode == 3076010 && k03.equals("data")) {
                            n0Var = (n0) pc.c.b(operation.b()).f(jsonReader, customScalarAdapters2);
                        }
                        jsonReader.E();
                    } else if (k03.equals("errors")) {
                        list = d.s0(jsonReader);
                    } else {
                        jsonReader.E();
                    }
                } else if (k03.equals("extensions")) {
                    Object Z = bf.b.Z(jsonReader);
                    map = Z instanceof Map ? (Map) Z : null;
                } else {
                    jsonReader.E();
                }
            }
            jsonReader.v();
            UUID requestUuid = UUID.randomUUID();
            Intrinsics.checkNotNullExpressionValue(requestUuid, "randomUUID()");
            Intrinsics.checkNotNullParameter(operation, "operation");
            Intrinsics.checkNotNullParameter(requestUuid, "requestUuid");
            hVar = new pc.h(requestUuid, operation, n0Var, list, map == null ? z0.d() : map, pc.y.f99612b, false);
        } catch (Throwable th4) {
            hVar = null;
            th3 = th4;
        }
        try {
            jsonReader.close();
        } catch (Throwable th5) {
            if (th3 == null) {
                th3 = th5;
            } else {
                xk2.f.a(th3, th5);
            }
        }
        if (th3 != null) {
            throw th3;
        }
        Intrinsics.f(hVar);
        return hVar;
    }

    public static final Method O(Class cls, am2.d descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.f(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new ul2.u1("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    public static int O0(byte[] bArr, int i13, int i14) {
        while (i13 < i14 && bArr[i13] >= 0) {
            i13++;
        }
        if (i13 >= i14) {
            return 0;
        }
        while (i13 < i14) {
            int i15 = i13 + 1;
            byte b13 = bArr[i13];
            if (b13 < 0) {
                if (b13 < -32) {
                    if (i15 >= i14) {
                        return b13;
                    }
                    if (b13 >= -62) {
                        i13 += 2;
                        if (bArr[i15] > -65) {
                        }
                    }
                    return -1;
                }
                if (b13 < -16) {
                    if (i15 >= i14 - 1) {
                        return g0(bArr, i15, i14);
                    }
                    int i16 = i13 + 2;
                    byte b14 = bArr[i15];
                    if (b14 <= -65 && ((b13 != -32 || b14 >= -96) && (b13 != -19 || b14 < -96))) {
                        i13 += 3;
                        if (bArr[i16] > -65) {
                        }
                    }
                    return -1;
                }
                if (i15 >= i14 - 2) {
                    return g0(bArr, i15, i14);
                }
                int i17 = i13 + 2;
                byte b15 = bArr[i15];
                if (b15 <= -65) {
                    if ((((b15 + 112) + (b13 << 28)) >> 30) == 0) {
                        int i18 = i13 + 3;
                        if (bArr[i17] <= -65) {
                            i13 += 4;
                            if (bArr[i18] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i13 = i15;
        }
        return 0;
    }

    public static Object P(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return ep.b.i(list, 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static final i2.q P0(i2.o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.T(RecyclerViewTypes.VIEW_TYPE_TODAY_TAB_FOOTER, i2.u.f71309e);
        if (sVar.O) {
            y2.u(sVar.H);
        }
        Object B = sVar.B();
        i2.p pVar = B instanceof i2.p ? (i2.p) B : null;
        if (pVar == null) {
            int i13 = sVar.P;
            boolean z13 = sVar.f71280p;
            boolean z14 = sVar.B;
            i0 i0Var = sVar.f71271g;
            i2.z zVar = i0Var instanceof i2.z ? (i2.z) i0Var : null;
            i2.p pVar2 = new i2.p(new i2.q(sVar, i13, z13, z14, zVar != null ? zVar.f71418r : null));
            sVar.h0(pVar2);
            pVar = pVar2;
        }
        z1 o13 = sVar.o();
        i2.q qVar = pVar.f71232a;
        qVar.f71244f.setValue(o13);
        sVar.r(false);
        return qVar;
    }

    public static final float Q(or orVar) {
        Intrinsics.checkNotNullParameter(orVar, "<this>");
        boolean[] zArr = orVar.f40784c;
        if (zArr.length <= 0 || !zArr[0]) {
            return 1.0f;
        }
        return (float) orVar.c().doubleValue();
    }

    public static final j0 Q0(h3.f fVar, i2.o oVar) {
        b3.p pVar;
        i2.s sVar = (i2.s) oVar;
        n4.b bVar = (n4.b) sVar.m(f2.f115983f);
        float f13 = fVar.f66661j;
        boolean g13 = sVar.g((Float.floatToRawIntBits(bVar.b()) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32));
        Object J2 = sVar.J();
        if (g13 || J2 == i2.n.f71185a) {
            h3.c cVar = new h3.c();
            u(cVar, fVar.f66657f);
            Unit unit = Unit.f80348a;
            long c13 = bs1.c.c(bVar.l0(fVar.f66653b), bVar.l0(fVar.f66654c));
            float f14 = fVar.f66655d;
            if (Float.isNaN(f14)) {
                f14 = a3.f.d(c13);
            }
            float f15 = fVar.f66656e;
            if (Float.isNaN(f15)) {
                f15 = a3.f.b(c13);
            }
            long c14 = bs1.c.c(f14, f15);
            j0 j0Var = new j0(cVar);
            long j13 = fVar.f66658g;
            if (j13 != 16) {
                int i13 = Build.VERSION.SDK_INT;
                int i14 = fVar.f66659h;
                pVar = new b3.p(j13, i14, i13 >= 29 ? b3.q.f21347a.a(j13, i14) : new PorterDuffColorFilter(androidx.compose.ui.graphics.a.u(j13), androidx.compose.ui.graphics.a.w(i14)));
            } else {
                pVar = null;
            }
            j0Var.f66705e.setValue(new a3.f(c13));
            j0Var.f66706f.setValue(Boolean.valueOf(fVar.f66660i));
            h3.e0 e0Var = j0Var.f66707g;
            e0Var.f66643g.setValue(pVar);
            e0Var.f66645i.setValue(new a3.f(c14));
            e0Var.f66639c = fVar.f66652a;
            sVar.g0(j0Var);
            J2 = j0Var;
        }
        return (j0) J2;
    }

    public static final ArrayList R(h0 type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList S = S(l0.x(type));
        if (S == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(S, 10));
        Iterator it = S.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        am2.j b13 = type.w0().b();
        Intrinsics.g(b13, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class k13 = c2.k((am2.g) b13);
        Intrinsics.f(k13);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(k13.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    public static final Pair R0(f30 f30Var, wa2.m mVar, boolean z13, boolean z14, qa2.a aVar, mi1.f fVar, es.a aVar2, boolean z15) {
        u50.k0 k0Var;
        u50.f0 f0Var;
        if (b40.Q0(f30Var) && n60.o.B(f30Var, "getIsPromoted(...)")) {
            boolean z16 = fVar.f87218a;
            k0Var = mi1.e.e(f30Var, z16) ? null : new u50.k0(wy1.f.promoted_by);
            if (mi1.e.e(f30Var, z16)) {
                wy0 n13 = b40.n(f30Var);
                String Z2 = n13 != null ? n13.Z2() : null;
                f0Var = new u50.f0(Z2 != null ? Z2 : "");
            } else {
                wy0 a63 = f30Var.a6();
                String Z22 = a63 != null ? a63.Z2() : null;
                f0Var = new u50.f0(Z22 != null ? Z22 : "");
            }
        } else {
            k0Var = (!d1(f30Var, mVar, aVar2) || z13) ? null : new u50.k0(wy1.f.promoted_by);
            wy0 s13 = s1(aVar2, f30Var, aVar, mVar, z14, z15);
            String Z23 = s13 != null ? s13.Z2() : null;
            f0Var = Z23 != null ? new u50.f0(Z23) : null;
        }
        return new Pair(k0Var, f0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList S(h0 h0Var) {
        ?? b13;
        ArrayList arrayList = null;
        if (bn2.i.g(h0Var)) {
            am2.j b14 = h0Var.w0().b();
            Intrinsics.g(b14, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            int i13 = fn2.d.f62727a;
            g1 J2 = ((am2.g) b14).J();
            am2.e0 e0Var = J2 instanceof am2.e0 ? (am2.e0) J2 : null;
            Intrinsics.f(e0Var);
            List<Pair> list = e0Var.f15548a;
            arrayList = new ArrayList();
            for (Pair pair : list) {
                ym2.g gVar = (ym2.g) pair.f80346a;
                ArrayList S = S((h0) pair.f80347b);
                if (S != null) {
                    b13 = new ArrayList(kotlin.collections.g0.q(S, 10));
                    Iterator it = S.iterator();
                    while (it.hasNext()) {
                        b13.add(gVar.c() + '-' + ((String) it.next()));
                    }
                } else {
                    b13 = e0.b(gVar.c());
                }
                kotlin.collections.k0.u((Iterable) b13, arrayList);
            }
        }
        return arrayList;
    }

    public static final q1 S0(s3.m mVar, int i13) {
        q1 q1Var = ((u2.p) mVar).f120042a.f120049h;
        Intrinsics.f(q1Var);
        if (q1Var.X0() != mVar || !r1.h(i13)) {
            return q1Var;
        }
        q1 q1Var2 = q1Var.f110900n;
        Intrinsics.f(q1Var2);
        return q1Var2;
    }

    public static final float T(or orVar) {
        Intrinsics.checkNotNullParameter(orVar, "<this>");
        boolean[] zArr = orVar.f40784c;
        if (zArr.length <= 1 || !zArr[1]) {
            return 0.0f;
        }
        return (float) orVar.d().doubleValue();
    }

    public static final q1 T0(s3.m mVar) {
        if (!((u2.p) mVar).f120042a.f120054m) {
            jk.r.y("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        q1 S0 = S0(mVar, 2);
        if (S0.X0().f120054m) {
            return S0;
        }
        jk.r.y("LayoutCoordinates is not attached.");
        throw null;
    }

    public static Object U(v2 v2Var) {
        y0 listIterator = v2Var.listIterator(0);
        Object next = listIterator.next();
        if (!listIterator.hasNext()) {
            return next;
        }
        StringBuilder sb3 = new StringBuilder("expected one element but was: <");
        sb3.append(next);
        for (int i13 = 0; i13 < 4 && listIterator.hasNext(); i13++) {
            sb3.append(", ");
            sb3.append(listIterator.next());
        }
        if (listIterator.hasNext()) {
            sb3.append(", ...");
        }
        sb3.append('>');
        throw new IllegalArgumentException(sb3.toString());
    }

    public static final s3.k0 U0(s3.m mVar) {
        q1 q1Var = ((u2.p) mVar).f120042a.f120049h;
        if (q1Var != null) {
            return q1Var.f110898l;
        }
        jk.r.z("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final mr1.h V(wy0 childUser, UserDeserializer userDeserializer) {
        Object obj;
        mr1.h hVar;
        Intrinsics.checkNotNullParameter(a60.a.f905a, "<this>");
        Intrinsics.checkNotNullParameter(childUser, "childUser");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Iterator it = a0(userDeserializer).iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                return null;
            }
            hVar = (mr1.h) it.next();
            List u23 = hVar.f88089b.u2();
            if (u23 != null) {
                Iterator it2 = u23.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    if (Intrinsics.d(((wy0) next).getF39332b(), childUser.getF39332b())) {
                        obj = next;
                        break;
                    }
                }
                obj = (wy0) obj;
            }
        } while (obj == null);
        return new mr1.h(hVar.f88088a, hVar.f88089b, hVar.f88090c, null, 8);
    }

    public static final a2 V0(s3.m mVar) {
        a2 a2Var = U0(mVar).f110821i;
        if (a2Var != null) {
            return a2Var;
        }
        jk.r.z("This node does not have an owner.");
        throw null;
    }

    public static final k2 W(yk1.v resources, f30 f30Var, boolean z13, boolean z14, boolean z15, Function1 descriptionBlock) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(descriptionBlock, "descriptionBlock");
        if (z15) {
            ko2.f fVar = v0.f20219a;
            return kotlin.jvm.internal.j.z(dl2.b.b(ko2.e.f80326c), null, null, new qa2.i0(resources, f30Var, z13, z14, descriptionBlock, null), 3);
        }
        descriptionBlock.invoke(X(resources, f30Var, z13, z14));
        return null;
    }

    public static TypedValue W0(Context context, int i13) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i13, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007d, code lost:
    
        if (r4 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0080, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x009b, code lost:
    
        if (r4 == null) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String X(yk1.v r6, com.pinterest.api.model.f30 r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 437
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.X(yk1.v, com.pinterest.api.model.f30, boolean, boolean):java.lang.String");
    }

    public static boolean X0(int i13, Context context, boolean z13) {
        TypedValue W0 = W0(context, i13);
        return (W0 == null || W0.type != 18) ? z13 : W0.data != 0;
    }

    public static /* synthetic */ k2 Y(yk1.v vVar, f30 f30Var, boolean z13, boolean z14, boolean z15, Function1 function1, int i13) {
        if ((i13 & 4) != 0) {
            z13 = true;
        }
        boolean z16 = z13;
        if ((i13 & 8) != 0) {
            z14 = false;
        }
        return W(vVar, f30Var, z16, z14, z15, function1);
    }

    public static TypedValue Y0(int i13, Context context, String str) {
        TypedValue W0 = W0(context, i13);
        if (W0 != null) {
            return W0;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i13)));
    }

    public static final List Z(TypedArray typedArray) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        int integer = typedArray.getInteger(rn1.o.GestaltText_gestalt_textStyle, 0);
        ArrayList arrayList = new ArrayList();
        if ((integer | 1) == integer) {
            arrayList.add(vn1.e.ITALIC);
        }
        if ((integer | 2) == integer) {
            arrayList.add(vn1.e.UNDERLINED);
        }
        if ((integer | 4) == integer) {
            arrayList.add(vn1.e.BOLD);
        }
        return arrayList.isEmpty() ? e0.b(vn1.h.f126279e) : CollectionsKt.F0(arrayList);
    }

    public static final void Z0(t0 t0Var, bl2.c cVar, boolean z13) {
        Object g13;
        Object l13 = t0Var.l();
        Throwable d2 = t0Var.d(l13);
        if (d2 != null) {
            xk2.q qVar = xk2.s.f135225b;
            g13 = ue.c.m(d2);
        } else {
            xk2.q qVar2 = xk2.s.f135225b;
            g13 = t0Var.g(l13);
        }
        if (!z13) {
            cVar.resumeWith(g13);
            return;
        }
        Intrinsics.g(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        ho2.e eVar = (ho2.e) cVar;
        bl2.c cVar2 = eVar.f69755e;
        CoroutineContext context = cVar2.getContext();
        Object c13 = ho2.y.c(context, eVar.f69757g);
        t2 d13 = c13 != ho2.y.f69792a ? d0.d(cVar2, context, c13) : null;
        try {
            cVar2.resumeWith(g13);
            Unit unit = Unit.f80348a;
        } finally {
            if (d13 == null || d13.g0()) {
                ho2.y.a(context, c13);
            }
        }
    }

    public static /* synthetic */ void a(int i13) {
        String str = i13 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i13 != 4 ? 3 : 2];
        switch (i13) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i13 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i13 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String format = String.format(str, objArr);
        if (i13 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static final List a0(UserDeserializer userDeserializer) {
        vd0.c cVar;
        String d2;
        wy0 wy0Var;
        Intrinsics.checkNotNullParameter(a60.a.f905a, "<this>");
        Intrinsics.checkNotNullParameter(userDeserializer, "userDeserializer");
        Intrinsics.checkNotNullExpressionValue(a60.a.a(null).getAll(), "getAll(...)");
        if (!(!r2.isEmpty())) {
            return q0.f80391a;
        }
        ArrayList arrayList = new ArrayList();
        Map<String, ?> all = a60.a.a(null).getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && (d2 = (cVar = new vd0.c(value.toString())).d("PREF_ACCESSTOKEN")) != null) {
                c60.a aVar = new c60.a(d2, cVar.d("PREF_V5_ACCESS_TOKEN"), cVar.d("PREF_V5_REFRESH_TOKEN"));
                vd0.c json = cVar.m("PREF_MY_USER_OBJECT");
                if (json != null) {
                    userDeserializer.getClass();
                    Intrinsics.checkNotNullParameter(json, "json");
                    wy0Var = userDeserializer.e(json, false, false);
                } else {
                    wy0Var = null;
                }
                if (wy0Var != null) {
                    Intrinsics.f(key);
                    arrayList.add(new mr1.h(key, wy0Var, aVar, null, 8));
                    List<wy0> u23 = wy0Var.u2();
                    if (u23 != null) {
                        for (wy0 wy0Var2 : u23) {
                            String f39332b = wy0Var2.getF39332b();
                            Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
                            String f39332b2 = wy0Var.getF39332b();
                            Intrinsics.checkNotNullExpressionValue(f39332b2, "getUid(...)");
                            arrayList.add(new mr1.h(f39332b, wy0Var2, null, new mr1.h(f39332b2, wy0Var, aVar, null, 8), 4));
                        }
                    }
                }
            }
        }
        return CollectionsKt.F0(arrayList);
    }

    public static final void a1(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14, int i15, int i16) {
        Intrinsics.checkNotNullParameter(marginLayoutParams, "<this>");
        marginLayoutParams.setMarginStart(i13);
        marginLayoutParams.topMargin = i14;
        marginLayoutParams.setMarginEnd(i15);
        marginLayoutParams.bottomMargin = i16;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(g3.b r18, java.lang.String r19, u2.q r20, u2.e r21, q3.n r22, float r23, b3.p r24, i2.o r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.b(g3.b, java.lang.String, u2.q, u2.e, q3.n, float, b3.p, i2.o, int, int):void");
    }

    public static Object b0(com.google.common.util.concurrent.c0 c0Var, long j13, TimeUnit timeUnit) {
        boolean z13 = false;
        try {
            long nanos = timeUnit.toNanos(j13);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z13 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return c0Var.get(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z13) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void b1(ViewGroup.MarginLayoutParams marginLayoutParams, int i13, int i14, int i15, int i16, int i17) {
        if ((i17 & 1) != 0) {
            i13 = marginLayoutParams.getMarginStart();
        }
        if ((i17 & 2) != 0) {
            i14 = marginLayoutParams.topMargin;
        }
        if ((i17 & 4) != 0) {
            i15 = marginLayoutParams.getMarginEnd();
        }
        if ((i17 & 8) != 0) {
            i16 = marginLayoutParams.bottomMargin;
        }
        a1(marginLayoutParams, i13, i14, i15, i16);
    }

    public static final void c(h3.f fVar, String str, u2.q qVar, vb0.i iVar, i2.o oVar, int i13, int i14) {
        b(Q0(fVar, oVar), str, qVar, u2.b.f120017e, (i14 & 16) != 0 ? q3.m.f102247b : iVar, 1.0f, null, oVar, 8 | (57344 & i13), 0);
    }

    public static Object c0(Future future) {
        Object obj;
        boolean z13 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z13 = true;
            } catch (Throwable th3) {
                if (z13) {
                    Thread.currentThread().interrupt();
                }
                throw th3;
            }
        }
        if (z13) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final boolean c1(h32.i0 i0Var) {
        int i13;
        d4 d4Var = i0Var.f67081a;
        int i14 = d4Var == null ? -1 : nx.o.f92436b[d4Var.ordinal()];
        if (i14 != 1) {
            a4 a4Var = i0Var.f67082b;
            if (i14 == 2) {
                i13 = a4Var != null ? nx.o.f92435a[a4Var.ordinal()] : -1;
                if (i13 != 1 && i13 != 2 && i13 != 3) {
                    return true;
                }
            } else {
                if (i14 != 3) {
                    return true;
                }
                i13 = a4Var != null ? nx.o.f92435a[a4Var.ordinal()] : -1;
                if (i13 != 4 && i13 != 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final long d(float f13, float f14) {
        return (Float.floatToRawIntBits(f14) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    public static final void d0(GestaltIconButton gestaltIconButton) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        gestaltIconButton.t(om1.a.f96631j);
    }

    public static final boolean d1(f30 f30Var, wa2.m pinFeatureConfig, es.a adFormats) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return !pinFeatureConfig.E && ((es.c) adFormats).O(f30Var);
    }

    public static final void e(k2.e eVar, u2.p pVar) {
        k2.e y13 = U0(pVar).y();
        int i13 = y13.f78184c;
        if (i13 > 0) {
            int i14 = i13 - 1;
            Object[] objArr = y13.f78182a;
            do {
                eVar.b(((s3.k0) objArr[i14]).f110837y.f110808e);
                i14--;
            } while (i14 >= 0);
        }
    }

    public static final boolean e0(es.a adFormats, f30 f30Var, qa2.a attributionReasonType, wa2.m pinFeatureConfig, boolean z13, boolean z14) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(attributionReasonType, "attributionReasonType");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        return s1(adFormats, f30Var, attributionReasonType, pinFeatureConfig, z13, z14) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
    
        if (r0 == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0083, code lost:
    
        if (com.pinterest.api.model.b40.s0(r13) != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean e1(com.pinterest.api.model.f30 r13, wa2.m r14, mi1.f r15, boolean r16, boolean r17, qa2.a r18, ni1.x2 r19, es.a r20, boolean r21) {
        /*
            r8 = r13
            r6 = r14
            r0 = r19
            r7 = r20
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r1)
            java.lang.String r1 = "pinFeatureConfig"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r1)
            java.lang.String r1 = "unactivatedXPs"
            r9 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r1)
            java.lang.String r1 = "attributionReasonType"
            r10 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            java.lang.String r1 = "experimentConfigs"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            java.lang.String r1 = "adFormats"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            boolean r1 = r0.Q
            boolean r2 = r0.W
            boolean r1 = me.o.c(r1, r2)
            if (r1 == 0) goto L36
            boolean r0 = me.o.f(r13, r0)
            goto L86
        L36:
            boolean r0 = d1(r13, r14, r7)
            r11 = 1
            if (r0 == 0) goto L3f
        L3d:
            r0 = r11
            goto L86
        L3f:
            boolean r0 = r6.f128888u
            r12 = 0
            if (r0 == 0) goto L46
        L44:
            r0 = r12
            goto L86
        L46:
            boolean r0 = r6.A
            if (r0 == 0) goto L78
            r0 = r20
            r1 = r13
            r2 = r18
            r3 = r14
            r4 = r17
            r5 = r21
            boolean r0 = e0(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L78
            r0 = r13
            r1 = r14
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r15
            r6 = r20
            r7 = r21
            kotlin.Pair r0 = R0(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r1 = r0.f80346a
            u50.i0 r1 = (u50.i0) r1
            java.lang.Object r0 = r0.f80347b
            u50.i0 r0 = (u50.i0) r0
            if (r1 != 0) goto L3d
            if (r0 == 0) goto L78
            goto L3d
        L78:
            boolean r0 = com.pinterest.api.model.b40.b1(r13)
            if (r0 == 0) goto L7f
            goto L3d
        L7f:
            boolean r0 = com.pinterest.api.model.b40.s0(r13)
            if (r0 == 0) goto L44
            goto L3d
        L86:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.e1(com.pinterest.api.model.f30, wa2.m, mi1.f, boolean, boolean, qa2.a, ni1.x2, es.a, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(do2.a3 r4, kl2.l r5, java.lang.Throwable r6, bl2.c r7) {
        /*
            boolean r0 = r7 instanceof do2.d0
            if (r0 == 0) goto L13
            r0 = r7
            do2.d0 r0 = (do2.d0) r0
            int r1 = r0.f55753t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55753t = r1
            goto L18
        L13:
            do2.d0 r0 = new do2.d0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f55752s
            cl2.a r1 = cl2.a.COROUTINE_SUSPENDED
            int r2 = r0.f55753t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Throwable r6 = r0.f55751r
            ue.c.H(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L29:
            r4 = move-exception
            goto L44
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            ue.c.H(r7)
            r0.f55751r = r6     // Catch: java.lang.Throwable -> L29
            r0.f55753t = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L41
            goto L43
        L41:
            kotlin.Unit r1 = kotlin.Unit.f80348a
        L43:
            return r1
        L44:
            if (r6 == 0) goto L4b
            if (r6 == r4) goto L4b
            xk2.f.a(r4, r6)
        L4b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.f(do2.a3, kl2.l, java.lang.Throwable, bl2.c):java.lang.Object");
    }

    public static int f0(int i13, int i14) {
        if (i13 > -12 || i14 > -65) {
            return -1;
        }
        return i13 ^ (i14 << 8);
    }

    public static final boolean f1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        String u33 = f30Var.u3();
        return u33 == null || u33.length() == 0;
    }

    public static final u2.p g(k2.e eVar) {
        if (eVar == null || eVar.l()) {
            return null;
        }
        return (u2.p) eVar.o(eVar.f78184c - 1);
    }

    public static int g0(byte[] bArr, int i13, int i14) {
        byte b13 = bArr[i13 - 1];
        int i15 = i14 - i13;
        if (i15 == 0) {
            if (b13 > -12) {
                return -1;
            }
            return b13;
        }
        if (i15 == 1) {
            return f0(b13, bArr[i13]);
        }
        if (i15 != 2) {
            throw new AssertionError();
        }
        byte b14 = bArr[i13];
        byte b15 = bArr[i13 + 1];
        if (b13 > -12 || b14 > -65 || b15 > -65) {
            return -1;
        }
        return ((b14 << 8) ^ b13) ^ (b15 << 16);
    }

    public static boolean g1(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE.equals(extras.getString("google.c.a.e"));
    }

    public static boolean h(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z13 = false;
        while (it.hasNext()) {
            z13 |= collection.add(it.next());
        }
        return z13;
    }

    public static final pn2.v1 h0(pn2.v1 v1Var, b0 origin) {
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        Intrinsics.checkNotNullParameter(origin, "origin");
        return w1(v1Var, J(origin));
    }

    public static void h1(List list, w wVar, int i13, int i14) {
        for (int size = list.size() - 1; size > i14; size--) {
            if (wVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i15 = i14 - 1; i15 >= i13; i15--) {
            list.remove(i15);
        }
    }

    public static void i(x92.b bVar) {
        bVar.e("collaboratorinvite.board()");
        bVar.e("collaboratorinvite.invited_by_user()");
    }

    public static q i0() {
        q qVar = f29748a;
        if (qVar == null) {
            try {
                qVar = new q(Class.class.getMethod("isSealed", new Class[0]), Class.class.getMethod("getPermittedSubclasses", new Class[0]), Class.class.getMethod("isRecord", new Class[0]), Class.class.getMethod("getRecordComponents", new Class[0]));
            } catch (NoSuchMethodException unused) {
                qVar = new q((Object) null, (Object) null, (Object) null, (Object) null);
            }
            f29748a = qVar;
        }
        return qVar;
    }

    public static final Object i1(ho2.u uVar, ho2.u uVar2, Function2 function2) {
        Object zVar;
        Object R;
        try {
            dl2.b.y(2, function2);
            zVar = function2.invoke(uVar2, uVar);
        } catch (Throwable th3) {
            zVar = new ao2.z(false, th3);
        }
        cl2.a aVar = cl2.a.COROUTINE_SUSPENDED;
        if (zVar == aVar || (R = uVar.R(zVar)) == b2.f20117b) {
            return aVar;
        }
        if (R instanceof ao2.z) {
            throw ((ao2.z) R).f20242a;
        }
        return b2.b(R);
    }

    public static void j(x92.b bVar) {
        n00.d.f88768a.b(bVar);
        d.d(bVar);
        g2 d2 = g2.f83370b.d();
        z3 z3Var = lh0.a4.f83298b;
        lh0.g1 g1Var = (lh0.g1) d2.f83373a;
        if (g1Var.o("android_closeup_rabbit_hole_dedup", "enabled", z3Var) || g1Var.l("android_closeup_rabbit_hole_dedup")) {
            bVar.e("pin.near_dup_sig");
        }
    }

    public static final void j0() {
        throw new IllegalStateException("Invalid applier".toString());
    }

    public static final u50.o0 j1(Function1 init) {
        Intrinsics.checkNotNullParameter(init, "init");
        p0 p0Var = new p0();
        init.invoke(p0Var);
        String sb3 = p0Var.f120579a.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return new u50.o0(new u50.f0(sb3), p0Var.f120580b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final s3.c0 k(u2.p pVar) {
        if ((pVar.f120044c & 2) != 0) {
            if (pVar instanceof s3.c0) {
                return (s3.c0) pVar;
            }
            if (pVar instanceof s3.n) {
                u2.p pVar2 = ((s3.n) pVar).f110843o;
                while (pVar2 != 0) {
                    if (pVar2 instanceof s3.c0) {
                        return (s3.c0) pVar2;
                    }
                    pVar2 = (!(pVar2 instanceof s3.n) || (pVar2.f120044c & 2) == 0) ? pVar2.f120047f : ((s3.n) pVar2).f110843o;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k0(s3.r rVar) {
        if (((u2.p) rVar).f120042a.f120054m) {
            S0(rVar, 1).d1();
        }
    }

    public static pn2.q1 k1(List list, l1 l1Var, am2.m mVar, List list2) {
        if (l1Var == null) {
            a(1);
            throw null;
        }
        if (mVar == null) {
            a(2);
            throw null;
        }
        if (list2 == null) {
            a(3);
            throw null;
        }
        pn2.q1 l13 = l1(list, l1Var, mVar, list2, null);
        if (l13 != null) {
            return l13;
        }
        throw new AssertionError("Substitution failed");
    }

    public static final Object l(List list, dl2.d dVar) {
        return list.isEmpty() ? q0.f80391a : new ao2.e((ao2.p0[]) list.toArray(new ao2.p0[0])).a(dVar);
    }

    public static final void l0(s3.c0 c0Var) {
        U0(c0Var).D();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static pn2.q1 l1(java.util.List r17, pn2.l1 r18, am2.m r19, java.util.List r20, boolean[] r21) {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.l1(java.util.List, pn2.l1, am2.m, java.util.List, boolean[]):pn2.q1");
    }

    public static final void m(GestaltIconButton gestaltIconButton, Function1 onClick) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        gestaltIconButton.u(new yl1.j(2, onClick));
    }

    public static final void m0(s3.g2 g2Var) {
        U0(g2Var).E();
    }

    public static nm2.a m1(pn2.r1 r1Var, boolean z13, boolean z14, dm2.j jVar, int i13) {
        boolean z15 = (i13 & 1) != 0 ? false : z13;
        boolean z16 = (i13 & 2) != 0 ? false : z14;
        if ((i13 & 4) != 0) {
            jVar = null;
        }
        Intrinsics.checkNotNullParameter(r1Var, "<this>");
        return new nm2.a(r1Var, z16, z15, jVar != null ? kotlin.collections.g1.b(jVar) : null, 34);
    }

    public static void n(wa2.i pinFeatureConfig, qa2.f0 view, f30 pin, int i13) {
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(pin, "pin");
        qa2.h0 internalCell = view.getInternalCell();
        if (internalCell instanceof qa2.o) {
            G0(pinFeatureConfig, (qa2.o) internalCell, view, pin, i13);
        } else if (internalCell instanceof qa2.v1) {
            view.setPin(pin, i13);
        }
    }

    public static final void n0(GestaltIconButton gestaltIconButton) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        gestaltIconButton.t(om1.a.f96632k);
    }

    public static final Class n1(am2.m mVar) {
        if (!(mVar instanceof am2.g) || !bn2.i.b(mVar)) {
            return null;
        }
        am2.g gVar = (am2.g) mVar;
        Class k13 = c2.k(gVar);
        if (k13 != null) {
            return k13;
        }
        throw new ul2.u1("Class object for the class " + gVar.getName() + " cannot be found (classId=" + fn2.d.f((am2.j) mVar) + ')');
    }

    public static final void o(co2.b0 b0Var, Throwable th3) {
        if (th3 != null) {
            r0 = th3 instanceof CancellationException ? (CancellationException) th3 : null;
            if (r0 == null) {
                r0 = u2.c("Channel was consumed, consumer had failed", th3);
            }
        }
        b0Var.cancel(r0);
    }

    public static final boolean o0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        return list.size() >= 4 && Intrinsics.d("v3", list.get(0)) && Intrinsics.d("boards", list.get(1)) && Intrinsics.d("pins", list.get(3));
    }

    public static final Class o1(b0 b0Var) {
        Class n13 = n1(b0Var.w0().b());
        if (n13 == null) {
            return null;
        }
        if (!t1.g(b0Var)) {
            return n13;
        }
        h0 h10 = bn2.i.h(b0Var);
        if (h10 == null || t1.g(h10) || xl2.l.H(h10)) {
            return null;
        }
        return n13;
    }

    public static float p(float f13, float f14, float f15) {
        return f13 < f14 ? f14 : f13 > f15 ? f15 : f13;
    }

    public static final boolean p0(int i13) {
        return i13 == 1 || i13 == 2;
    }

    public static final String p1(HashMap hashMap) {
        if (hashMap == null) {
            return null;
        }
        return ((nm.u) vd0.c.f125622b.o(hashMap)).toString();
    }

    public static int q(int i13, int i14, int i15) {
        return i13 < i14 ? i14 : i13 > i15 ? i15 : i13;
    }

    public static final boolean q0(long j13) {
        long j14 = (j13 & 9187343241974906880L) ^ 9187343241974906880L;
        return (((~j14) & (j14 - 4294967297L)) & (-9223372034707292160L)) == 0;
    }

    public static String q1(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            if (A0(str.charAt(i13))) {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c13 = charArray[i13];
                    if (A0(c13)) {
                        charArray[i13] = (char) (c13 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    public static final Object r(Object obj, am2.d descriptor) {
        b0 K;
        Class o13;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof am2.r0) && bn2.i.d((am2.j1) descriptor)) || (K = K(descriptor)) == null || (o13 = o1(K)) == null) ? obj : O(o13, descriptor).invoke(obj, new Object[0]);
    }

    public static final boolean r0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        return list.size() > 3 && Intrinsics.d("feeds", list.get(1)) && Intrinsics.d("home", list.get(2)) && StringsKt.E(url.f95639i, "item_count=0", false);
    }

    public static String r1(String str) {
        int length = str.length();
        int i13 = 0;
        while (i13 < length) {
            if (s0(str.charAt(i13))) {
                char[] charArray = str.toCharArray();
                while (i13 < length) {
                    char c13 = charArray[i13];
                    if (s0(c13)) {
                        charArray[i13] = (char) (c13 ^ ' ');
                    }
                    i13++;
                }
                return String.valueOf(charArray);
            }
            i13++;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
    
        if ((r4 instanceof am2.s0) == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String s(am2.x r4, int r5) {
        /*
            r0 = r5 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            r5 = r5 & 2
            if (r5 == 0) goto Le
            r1 = r2
        Le:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            if (r1 == 0) goto L34
            boolean r1 = r4 instanceof am2.l
            if (r1 == 0) goto L21
            java.lang.String r1 = "<init>"
            goto L31
        L21:
            r1 = r4
            dm2.o r1 = (dm2.o) r1
            ym2.g r1 = r1.getName()
            java.lang.String r1 = r1.b()
            java.lang.String r2 = "asString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
        L31:
            r5.append(r1)
        L34:
            java.lang.String r1 = "("
            r5.append(r1)
            dm2.d r1 = r4.D()
            java.lang.String r2 = "getType(...)"
            if (r1 == 0) goto L4f
            pn2.b0 r1 = r1.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            rm2.y r1 = J0(r1)
            r5.append(r1)
        L4f:
            java.util.List r1 = r4.x()
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L74
            java.lang.Object r3 = r1.next()
            am2.i1 r3 = (am2.i1) r3
            dm2.c1 r3 = (dm2.c1) r3
            pn2.b0 r3 = r3.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r2)
            rm2.y r3 = J0(r3)
            r5.append(r3)
            goto L57
        L74:
            java.lang.String r1 = ")"
            r5.append(r1)
            if (r0 == 0) goto Lbb
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof am2.l
            if (r0 == 0) goto L85
            goto La7
        L85:
            pn2.b0 r0 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.f(r0)
            ym2.g r1 = xl2.l.f135279e
            ym2.e r1 = xl2.q.f135298d
            boolean r0 = xl2.l.F(r0, r1)
            if (r0 == 0) goto Lad
            pn2.b0 r0 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.f(r0)
            boolean r0 = pn2.t1.g(r0)
            if (r0 != 0) goto Lad
            boolean r0 = r4 instanceof am2.s0
            if (r0 != 0) goto Lad
        La7:
            java.lang.String r4 = "V"
            r5.append(r4)
            goto Lbb
        Lad:
            pn2.b0 r4 = r4.getReturnType()
            kotlin.jvm.internal.Intrinsics.f(r4)
            rm2.y r4 = J0(r4)
            r5.append(r4)
        Lbb:
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.s(am2.x, int):java.lang.String");
    }

    public static boolean s0(char c13) {
        return c13 >= 'a' && c13 <= 'z';
    }

    public static final wy0 s1(es.a adFormats, f30 f30Var, qa2.a attributionReasonType, wa2.m pinFeatureConfig, boolean z13, boolean z14) {
        wy0 d2;
        hh t53;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(pinFeatureConfig, "pinFeatureConfig");
        Intrinsics.checkNotNullParameter(attributionReasonType, "attributionReasonType");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        boolean z15 = attributionReasonType == qa2.a.CLAIMED_CONTENT;
        if (z14) {
            wy0 z53 = f30Var.z5();
            if (z53 != null) {
                return z53;
            }
            hh t54 = f30Var.t5();
            if (t54 != null) {
                return t54.d();
            }
            return null;
        }
        es.c cVar = (es.c) adFormats;
        if (cVar.T(f30Var)) {
            wy0 n13 = b40.n(f30Var);
            if (n13 == null) {
                return null;
            }
            vy0 H4 = n13.H4();
            wy0 a63 = f30Var.a6();
            if (a63 != null) {
                H4.K(a63.U2());
                H4.D0(a63.P3());
                H4.N(a63.Z2());
            }
            return H4.a();
        }
        if (b40.r0(f30Var)) {
            wy0 N = b40.N(f30Var);
            return N == null ? f30Var.I5() : N;
        }
        if (d1(f30Var, pinFeatureConfig, cVar)) {
            return b40.N(f30Var);
        }
        if (!z13) {
            if (b40.Q0(f30Var) || b40.b1(f30Var) || b40.s0(f30Var)) {
                return b40.n(f30Var);
            }
            return null;
        }
        if (attributionReasonType == qa2.a.CREATED_BY) {
            wy0 z54 = f30Var.z5();
            return z54 == null ? f30Var.I5() : z54;
        }
        if (!z15) {
            return f30Var.I5();
        }
        hh t55 = f30Var.t5();
        if (t55 == null || (d2 = t55.d()) == null || !Intrinsics.d(d2.I3(), Boolean.TRUE) || (t53 = f30Var.t5()) == null) {
            return null;
        }
        return t53.d();
    }

    public static final String t(am2.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bn2.e.q(bVar)) {
            return null;
        }
        am2.m g13 = bVar.g();
        am2.g gVar = g13 instanceof am2.g ? (am2.g) g13 : null;
        if (gVar == null || gVar.getName().f139479b) {
            return null;
        }
        am2.b o03 = bVar.o0();
        u0 u0Var = o03 instanceof u0 ? (u0) o03 : null;
        if (u0Var == null) {
            return null;
        }
        return l0.p1(gVar, s(u0Var, 3));
    }

    public static final boolean t0(s3.k0 k0Var) {
        if (k0Var.f110815c != null) {
            s3.k0 v13 = k0Var.v();
            if ((v13 != null ? v13.f110815c : null) == null || k0Var.f110838z.f110968b) {
                return true;
            }
        }
        return false;
    }

    public static final int t1(GestaltIconButton gestaltIconButton) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        return (dl2.b.G0(gestaltIconButton, gestaltIconButton.w().f96640b.getBackgroundSize()) - dl2.b.G0(gestaltIconButton, gestaltIconButton.w().f96640b.getIconSize$iconbutton_release())) / 2;
    }

    public static final void u(h3.c cVar, h3.g0 g0Var) {
        int size = g0Var.f66676j.size();
        for (int i13 = 0; i13 < size; i13++) {
            h3.i0 i0Var = (h3.i0) g0Var.f66676j.get(i13);
            if (i0Var instanceof h3.k0) {
                h3.h hVar = new h3.h();
                h3.k0 k0Var = (h3.k0) i0Var;
                hVar.f66679d = k0Var.f66719b;
                hVar.f66689n = true;
                hVar.c();
                hVar.f66694s.i(k0Var.f66720c);
                hVar.c();
                hVar.c();
                hVar.f66677b = k0Var.f66721d;
                hVar.c();
                hVar.f66678c = k0Var.f66722e;
                hVar.c();
                hVar.f66682g = k0Var.f66723f;
                hVar.c();
                hVar.f66680e = k0Var.f66724g;
                hVar.c();
                hVar.f66681f = k0Var.f66725h;
                hVar.f66690o = true;
                hVar.c();
                hVar.f66683h = k0Var.f66726i;
                hVar.f66690o = true;
                hVar.c();
                hVar.f66684i = k0Var.f66727j;
                hVar.f66690o = true;
                hVar.c();
                hVar.f66685j = k0Var.f66728k;
                hVar.f66690o = true;
                hVar.c();
                hVar.f66686k = k0Var.f66729l;
                hVar.f66691p = true;
                hVar.c();
                hVar.f66687l = k0Var.f66730m;
                hVar.f66691p = true;
                hVar.c();
                hVar.f66688m = k0Var.f66731n;
                hVar.f66691p = true;
                hVar.c();
                cVar.e(i13, hVar);
            } else if (i0Var instanceof h3.g0) {
                h3.c cVar2 = new h3.c();
                h3.g0 g0Var2 = (h3.g0) i0Var;
                cVar2.f66605k = g0Var2.f66667a;
                cVar2.c();
                cVar2.f66606l = g0Var2.f66668b;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66609o = g0Var2.f66671e;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66610p = g0Var2.f66672f;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66611q = g0Var2.f66673g;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66612r = g0Var2.f66674h;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66607m = g0Var2.f66669c;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66608n = g0Var2.f66670d;
                cVar2.f66613s = true;
                cVar2.c();
                cVar2.f66600f = g0Var2.f66675i;
                cVar2.f66601g = true;
                cVar2.c();
                u(cVar2, g0Var2);
                cVar.e(i13, cVar2);
            }
        }
    }

    public static final boolean u0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        return list.size() >= 5 && Intrinsics.d("v3", list.get(0)) && Intrinsics.d("visual_search", list.get(1)) && Intrinsics.d("flashlight", list.get(2)) && Intrinsics.d("pin", list.get(3));
    }

    public static final void u1(GestaltIconButton gestaltIconButton) {
        Intrinsics.checkNotNullParameter(gestaltIconButton, "<this>");
        gestaltIconButton.t(om1.a.f96633l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x009a, code lost:
    
        if (bn2.i.b(r0) == true) goto L84;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final vl2.g v(vl2.g r4, am2.x r5, boolean r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r1 = "descriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)
            boolean r1 = bn2.i.a(r5)
            if (r1 != 0) goto La9
            java.util.List r1 = r5.i0()
            java.lang.String r2 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            java.lang.String r3 = "getType(...)"
            if (r2 == 0) goto L2b
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L2b
            goto L49
        L2b:
            java.util.Iterator r1 = r1.iterator()
        L2f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r1.next()
            dm2.d r2 = (dm2.d) r2
            pn2.b0 r2 = r2.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r2 = bn2.i.f(r2)
            if (r2 == 0) goto L2f
            goto La9
        L49:
            java.util.List r1 = r5.x()
            java.lang.String r2 = "getValueParameters(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L62
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L62
            goto L82
        L62:
            java.util.Iterator r1 = r1.iterator()
        L66:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L82
            java.lang.Object r2 = r1.next()
            am2.i1 r2 = (am2.i1) r2
            dm2.c1 r2 = (dm2.c1) r2
            pn2.b0 r2 = r2.getType()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r2 = bn2.i.f(r2)
            if (r2 == 0) goto L66
            goto La9
        L82:
            pn2.b0 r1 = r5.getReturnType()
            r2 = 1
            if (r1 == 0) goto L9d
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            pn2.b1 r0 = r1.w0()
            am2.j r0 = r0.b()
            if (r0 == 0) goto L9d
            boolean r0 = bn2.i.b(r0)
            if (r0 != r2) goto L9d
            goto La9
        L9d:
            pn2.b0 r0 = K(r5)
            if (r0 == 0) goto Laf
            boolean r0 = bn2.i.f(r0)
            if (r0 != r2) goto Laf
        La9:
            vl2.e0 r0 = new vl2.e0
            r0.<init>(r4, r5, r6)
            r4 = r0
        Laf:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.c.v(vl2.g, am2.x, boolean):vl2.g");
    }

    public static final boolean v0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        return list.size() > 5 && Intrinsics.d("pins", list.get(1)) && !Intrinsics.d("", list.get(2)) && Intrinsics.d("related", list.get(3)) && Intrinsics.d("modules", list.get(4)) && !StringsKt.E(url.f95639i, "item_count=", false);
    }

    public static Class v1(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object w(s3.l lVar, i2.c2 c2Var) {
        if (!((u2.p) lVar).f120042a.f120054m) {
            jk.r.y("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        q2.l lVar2 = (q2.l) U0(lVar).f110833u;
        lVar2.getClass();
        return bf.b.Y(lVar2, c2Var);
    }

    public static final boolean w0(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<this>");
        return viewGroup.getContext().getResources().getConfiguration().getLayoutDirection() == 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final pn2.v1 w1(pn2.v1 v1Var, b0 b0Var) {
        Intrinsics.checkNotNullParameter(v1Var, "<this>");
        if (v1Var instanceof u1) {
            return w1(((u1) v1Var).r0(), b0Var);
        }
        if (b0Var == null || Intrinsics.d(b0Var, v1Var)) {
            return v1Var;
        }
        if (v1Var instanceof h0) {
            return new pn2.k0((h0) v1Var, b0Var);
        }
        if (v1Var instanceof pn2.v) {
            return new x((pn2.v) v1Var, b0Var);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean x(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final boolean x0(HttpUrl url) {
        Intrinsics.checkNotNullParameter(url, "url");
        List list = url.f95636f;
        if (list.size() <= 3) {
            return false;
        }
        return (Intrinsics.d(list.get(2), "pins") || Intrinsics.d(list.get(2), "users")) && Intrinsics.d("search", list.get(1)) && !StringsKt.E(url.f95639i, "item_count=", false);
    }

    public static final boolean y(int i13, int i14) {
        return i13 == i14;
    }

    public static final boolean y0(long j13) {
        return (j13 & 9223372034707292159L) != y2.h.f136670b;
    }

    public static boolean z(CharSequence charSequence, String str) {
        char c13;
        int length = charSequence.length();
        if (charSequence == str) {
            return true;
        }
        if (length != str.length()) {
            return false;
        }
        for (int i13 = 0; i13 < length; i13++) {
            if (charSequence.charAt(i13) != str.charAt(i13) && ((c13 = (char) ((r4 | ' ') - 97)) >= 26 || c13 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static final boolean z0(long j13) {
        return (j13 & 9223372034707292159L) == y2.h.f136670b;
    }
}
