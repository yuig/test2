package gh0;

import a.t7;
import a.u4;
import a.v9;
import ac.p;
import ads_mobile_sdk.ad2;
import ads_mobile_sdk.bx1;
import ads_mobile_sdk.c6;
import ads_mobile_sdk.ct1;
import ads_mobile_sdk.dt1;
import ads_mobile_sdk.ep1;
import ads_mobile_sdk.fa2;
import ads_mobile_sdk.fs0;
import ads_mobile_sdk.gk0;
import ads_mobile_sdk.i5;
import ads_mobile_sdk.k0;
import ads_mobile_sdk.k41;
import ads_mobile_sdk.lu1;
import ads_mobile_sdk.o0;
import ads_mobile_sdk.pk0;
import ads_mobile_sdk.q0;
import ads_mobile_sdk.sj;
import ads_mobile_sdk.x0;
import ads_mobile_sdk.yn1;
import ads_mobile_sdk.zn1;
import android.R;
import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.location.Location;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Base64;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.camera.video.internal.compat.quirk.NegativeLatLongSavesIncorrectlyQuirk;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.w0;
import ao2.m0;
import b3.s0;
import ba.j;
import c2.d6;
import c2.j1;
import com.airbnb.lottie.b0;
import com.appsflyer.AdRevenueScheme;
import com.pinterest.api.model.deserializer.PinDeserializer;
import com.pinterest.api.model.deserializer.ReportReasonDeserializer;
import com.pinterest.deserializers.ModelDeserializerWithSaveAndMerge;
import com.pinterest.feature.board.common.newideas.view.OneTapSaveCarouselPinView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.ideaPinCreation.closeup.view.u2;
import ek2.e;
import hk2.h;
import i2.d2;
import i2.f2;
import i2.o;
import i2.q1;
import i2.r0;
import i2.u;
import i2.u0;
import i2.y3;
import i2.z1;
import i32.a0;
import j1.t0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jk2.e0;
import k1.u1;
import kh2.a1;
import kh2.g3;
import kh2.m2;
import kh2.p2;
import kh2.w;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.r;
import kotlin.text.z;
import la0.f0;
import lb0.c;
import lb0.d;
import lb0.i;
import lh0.t;
import m1.v0;
import ni1.d0;
import ni1.t2;
import p1.c1;
import p1.e1;
import p1.g;
import p1.g1;
import p1.l;
import p1.n0;
import pm.m;
import ra0.l0;
import rl2.g0;
import s3.k;
import s80.b7;
import s80.h7;
import s80.k7;
import s80.y6;
import s80.z6;
import so.c7;
import so.oa;
import so.t5;
import tc0.f;
import u2.n;
import u50.h0;
import u50.i0;
import w80.b1;
import w80.h1;
import w80.i1;
import w80.v1;
import xk2.q;
import xk2.s;
import xk2.x;
import xk2.y;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a */
    public static final /* synthetic */ int f64996a = 0;

    /* JADX WARN: Code restructure failed: missing block: B:8:0x00b6, code lost:
    
        if (r0.l("android_curated_articles_to_board_pwt") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A(x92.b r6) {
        /*
            vb0.i r0 = lh0.g2.f83370b
            lh0.g2 r0 = r0.d()
            com.bumptech.glide.d.e(r6)
            java.lang.String r1 = "user.verified_identity"
            r6.e(r1)
            java.lang.String r1 = "user.is_verified_merchant"
            r6.e(r1)
            java.lang.String r1 = "user.image_medium_url"
            r6.e(r1)
            pk.a0.b(r6)
            java.lang.String r1 = "board.image_cover_url"
            r6.e(r1)
            java.lang.String r1 = "board.image_cover_hd_url"
            r6.e(r1)
            java.lang.String r1 = "board.images"
            java.lang.String r2 = "236x"
            r6.h(r1, r2)
            java.lang.String r2 = "90x90"
            r6.h(r1, r2)
            java.lang.String r2 = "60x60"
            java.lang.String r3 = "board.description"
            java.lang.String r4 = "board.archived_by_me_at"
            n60.o.A(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.is_collaborative"
            java.lang.String r2 = "board.collaborator_count"
            java.lang.String r3 = "board.collaborating_users()"
            java.lang.String r4 = "board.followed_by_me"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.collaborated_by_me"
            java.lang.String r2 = "board.owner()"
            java.lang.String r3 = "board.pin_count"
            java.lang.String r4 = "board.event_start_date"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.event_date"
            java.lang.String r2 = "board.sectionless_pin_count"
            java.lang.String r3 = "board.viewer_contact_request()"
            java.lang.String r4 = "board.blocking_actions"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.should_show_more_ideas"
            java.lang.String r2 = "board.has_new_activity"
            java.lang.String r3 = "board.has_fresh_more_ideas_tab"
            java.lang.String r4 = "board.viewer_collaborator_join_requested"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.collaborator_requests_enabled"
            java.lang.String r2 = "board.allow_homefeed_recommendations"
            java.lang.String r3 = "board.follower_count"
            java.lang.String r4 = "board.should_show_shop_feed"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.is_eligible_for_seasonal_share_treatment"
            java.lang.String r2 = "board.eligible_pin_type_filters"
            java.lang.String r3 = "board.board_order_modified_at"
            java.lang.String r4 = "conversation.id"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "conversation.snooze_time"
            java.lang.String r2 = "board.board_note_count"
            java.lang.String r3 = "board.collaborator_permissions"
            java.lang.String r4 = "board.collaborator_permissions_setting"
            n60.o.w(r6, r1, r2, r3, r4)
            java.lang.String r1 = "board.sensitivity_screen"
            java.lang.String r2 = "board.layout"
            java.lang.String r3 = "board.has_custom_cover"
            n60.o.v(r6, r1, r2, r3)
            lh0.z3 r1 = lh0.a4.f83297a
            lh0.z0 r0 = r0.f83373a
            r2 = r0
            lh0.g1 r2 = (lh0.g1) r2
            java.lang.String r3 = "android_curated_articles_to_board_shift"
            java.lang.String r4 = "enabled"
            boolean r5 = r2.o(r3, r4, r1)
            if (r5 != 0) goto Lb8
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto La8
            goto Lb8
        La8:
            lh0.g1 r0 = (lh0.g1) r0
            java.lang.String r2 = "android_curated_articles_to_board_pwt"
            boolean r1 = r0.o(r2, r4, r1)
            if (r1 != 0) goto Lb8
            boolean r0 = r0.l(r2)
            if (r0 == 0) goto Lcc
        Lb8:
            java.lang.String r0 = "board.featured_board_metadata()"
            java.lang.String r1 = "board.featured_in"
            java.lang.String r2 = "featuredboard.board_subtitle"
            java.lang.String r3 = "featuredboard.board_tag"
            n60.o.w(r6, r0, r1, r2, r3)
            java.lang.String r0 = "featuredboard.curator()"
            java.lang.String r1 = "featuredboard.is_sponsored_content"
            java.lang.String r2 = "featuredboard.has_expanded_sections"
            n60.o.v(r6, r0, r1, r2)
        Lcc:
            java.lang.String r0 = "board.header"
            r6.e(r0)
            java.lang.String r0 = "board.is_featured_for_active_campaign"
            r6.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.A(x92.b):void");
    }

    public static Pair B(double d2, double d13) {
        if (w0.a.f126951a.b(NegativeLatLongSavesIncorrectlyQuirk.class) != null) {
            if (d2 < 0.0d) {
                d2 = ((d2 * 10000.0d) - 1.0d) / 10000.0d;
            }
            if (d13 < 0.0d) {
                d13 = ((d13 * 10000.0d) - 1.0d) / 10000.0d;
            }
        }
        return Pair.create(Double.valueOf(d2), Double.valueOf(d13));
    }

    public static final Object C(e0 e0Var) {
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        h hVar = new h(e0Var, new c(0, d.f82706i), 1);
        Object iVar = new i(null);
        e eVar = new e(1);
        hVar.f(eVar);
        if (eVar.getCount() != 0) {
            try {
                eVar.await();
            } catch (InterruptedException e13) {
                eVar.d();
                throw pk2.h.d(e13);
            }
        }
        Throwable th3 = eVar.f59420b;
        if (th3 != null) {
            throw pk2.h.d(th3);
        }
        Object obj = eVar.f59419a;
        if (obj != null) {
            iVar = obj;
        }
        return ((i) iVar).f82710a;
    }

    public static ArrayList D(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((S(bArr) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000L).array());
        return arrayList;
    }

    public static final Object E(vd0.c jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
        try {
            q qVar = s.f135225b;
            return new a(r.i0(jsonObject, "text"), jsonObject.d("url"));
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            return ue.c.m(th3);
        }
    }

    public static int F(id2.c value, mm.b builder) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(builder, "builder");
        byte b13 = (byte) (value.f72190a * 255.0f);
        x xVar = y.f135237b;
        byte b14 = (byte) (value.f72191b * 255.0f);
        byte b15 = (byte) (value.f72192c * 255.0f);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(4);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(3, (byte) (value.f72193d * 255.0f));
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(2, b15);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(1, b14);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(0, b13);
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.g();
    }

    public static final Bundle G(Activity activity, rw0.a type) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        int i13 = rw0.b.f110107a[type.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        Window window = activity.getWindow();
        Slide slide = new Slide(80);
        slide.excludeTarget(R.id.statusBarBackground, true);
        slide.excludeTarget(R.id.navigationBarBackground, true);
        slide.setDuration(300L);
        slide.setInterpolator(new AccelerateDecelerateInterpolator());
        window.setEnterTransition(slide);
        Slide slide2 = new Slide(48);
        slide2.excludeTarget(R.id.statusBarBackground, true);
        slide2.excludeTarget(R.id.navigationBarBackground, true);
        slide2.setDuration(300L);
        slide2.setInterpolator(new AccelerateDecelerateInterpolator());
        window.setExitTransition(slide2);
        Bundle bundle = ActivityOptions.makeSceneTransitionAnimation(activity, new Pair[0]).toBundle();
        Intrinsics.checkNotNullExpressionValue(bundle, "with(...)");
        return bundle;
    }

    public static final u2 H(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new u2(bs1.c.V(context, eo1.c.space_300), bs1.c.V(context, eo1.c.space_200), bs1.c.V(context, eo1.c.space_100), bs1.c.V(context, eo1.c.lego_corner_radius_large), 0, 0, null, 1, 20);
    }

    public static final Object I(vd0.c cVar) {
        try {
            q qVar = s.f135225b;
            if (cVar == null) {
                return null;
            }
            Boolean h10 = cVar.h("hide_dismiss_button", Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(h10, "optBoolean(...)");
            if (h10.booleanValue()) {
                return null;
            }
            return new a(r.i0(cVar, "text"), cVar.d("url"));
        } catch (Throwable th3) {
            q qVar2 = s.f135225b;
            return ue.c.m(th3);
        }
    }

    public static final hh0.e J(vd0.c experienceJsonObject, int i13) {
        Intrinsics.checkNotNullParameter(experienceJsonObject, "experienceJsonObject");
        if (i13 == a0.CALLOUT.getValue()) {
            Object R = g3.R(experienceJsonObject, i13);
            q qVar = s.f135225b;
            return (hh0.e) (R instanceof xk2.r ? null : R);
        }
        if (i13 != a0.UPSELL.getValue()) {
            return null;
        }
        Object R2 = g3.R(experienceJsonObject, i13);
        q qVar2 = s.f135225b;
        return (hh0.e) (R2 instanceof xk2.r ? null : R2);
    }

    public static final ModelDeserializerWithSaveAndMerge K() {
        Context context = kb0.a.f79058b;
        return (ModelDeserializerWithSaveAndMerge) ((oa) ((so1.b) ep.b.g(so1.b.class))).P2.get();
    }

    public static final ke0.a L() {
        Context context = kb0.a.f79058b;
        return (ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113818n3.get();
    }

    public static final ModelDeserializerWithSaveAndMerge N() {
        Context context = kb0.a.f79058b;
        return (ModelDeserializerWithSaveAndMerge) ((oa) ((so1.b) ep.b.g(so1.b.class))).f113589a3.get();
    }

    public static long Q(byte b13, byte b14) {
        int i13;
        int i14 = b13 & 255;
        int i15 = b13 & 3;
        if (i15 != 0) {
            i13 = 2;
            if (i15 != 1 && i15 != 2) {
                i13 = b14 & 63;
            }
        } else {
            i13 = 1;
        }
        int i16 = i14 >> 3;
        return i13 * (i16 >= 16 ? 2500 << r6 : i16 >= 12 ? 10000 << (i16 & 1) : (i16 & 3) == 3 ? 60000 : 10000 << r6);
    }

    public static final PinDeserializer R() {
        Context context = kb0.a.f79058b;
        return (PinDeserializer) ((oa) ((so1.b) ep.b.g(so1.b.class))).W2.get();
    }

    public static int S(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static final ReportReasonDeserializer T() {
        Context context = kb0.a.f79058b;
        ((oa) ((so1.b) ep.b.g(so1.b.class))).getClass();
        return new ReportReasonDeserializer();
    }

    public static final ke0.a U() {
        Context context = kb0.a.f79058b;
        return (ke0.a) ((oa) ((so1.b) ep.b.g(so1.b.class))).E4.get();
    }

    public static void V(od0.b bVar, od0.d dVar) {
        bVar.f94099r0 = dVar;
    }

    public static void W(zn0.d dVar, t5 t5Var) {
        dVar.f142279r0 = t5Var;
    }

    public static void X(od0.b bVar) {
        bVar.getClass();
    }

    public static void Y(OneTapSaveCarouselPinView oneTapSaveCarouselPinView, t tVar) {
        oneTapSaveCarouselPinView.experiment = tVar;
    }

    public static void Z(f0 f0Var, a82.b bVar) {
        f0Var.O0 = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(w80.b1 r22, w80.b1 r23, w80.b1 r24, u2.q r25, i2.o r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.a(w80.b1, w80.b1, w80.b1, u2.q, i2.o, int, int):void");
    }

    public static void a0(f0 f0Var, t2 t2Var) {
        f0Var.M0 = t2Var;
    }

    public static final void b(u2.q qVar, o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-413082585);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = (sVar2.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.q qVar3 = i16 != 0 ? n.f120041b : qVar2;
            p p03 = p0(new ac.q(k7.collage_onboarding_add_cutout_sparkles), null, sVar2, 62);
            ac.b f13 = e0.t.f((com.airbnb.lottie.h) p03.getValue(), Integer.MAX_VALUE, sVar2, 958);
            com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) p03.getValue();
            sVar2.W(-1085631007);
            boolean h10 = sVar2.h(f13);
            Object J2 = sVar2.J();
            int i17 = 0;
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new i1(f13, i17);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            sVar = sVar2;
            ph.a.a(hVar, (Function0) J2, qVar3, false, false, false, null, false, null, null, false, false, null, null, false, sVar, ((i15 << 6) & 896) | 8, 0, 65528);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar2, i13, i14, 2);
        }
    }

    public static void b0(f0 f0Var, qa2.d dVar) {
        f0Var.L0 = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0153 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x016c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(w80.b1 r17, long r18, int r20, w80.c1 r21, float r22, long r23, java.lang.String r25, u2.q r26, i2.o r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.c(w80.b1, long, int, w80.c1, float, long, java.lang.String, u2.q, i2.o, int, int):void");
    }

    public static void c0(f0 f0Var, d0 d0Var) {
        f0Var.N0 = d0Var;
    }

    public static final void d(tc0.y generalComponentDisplayState, u2.q qVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(generalComponentDisplayState, "generalComponentDisplayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1151063126);
        u2.q qVar2 = (i14 & 2) != 0 ? n.f120041b : qVar;
        g gVar = l.f98543a;
        g0.e(androidx.compose.foundation.layout.b.r(qVar2, com.bumptech.glide.d.A(oc0.o.padding_page, sVar), 0.0f, com.bumptech.glide.d.A(oc0.o.padding_page, sVar), 0.0f, 10), null, null, false, l.g(com.bumptech.glide.d.A(oc0.o.list_general_view_vertical_space, sVar)), null, null, false, new l0(generalComponentDisplayState, 13), sVar, 0, RecyclerViewTypes.VIEW_TYPE_MORE_IDEAS_BOARD_NAME_HEADER);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 12, generalComponentDisplayState, qVar2);
        }
    }

    public static void d0(lq0.e eVar, c7 c7Var) {
        eVar.f84294j0 = c7Var;
    }

    public static final void e(z6 state, h1 externalViewsState, Function0 onPrimaryAction, Function0 onSecondaryAction, u2.q qVar, boolean z13, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(externalViewsState, "externalViewsState");
        Intrinsics.checkNotNullParameter(onPrimaryAction, "onPrimaryAction");
        Intrinsics.checkNotNullParameter(onSecondaryAction, "onSecondaryAction");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1053112789);
        u2.q qVar2 = (i14 & 16) != 0 ? n.f120041b : qVar;
        boolean z14 = (i14 & 32) != 0 ? true : z13;
        w.b(state, qVar2, j1.e.r(0, 0, null, 7), "Onboarding popup cross-fade", q2.i.c(2084857282, new k1.a0(externalViewsState, z14, onPrimaryAction, onSecondaryAction), sVar), sVar, ((i13 >> 9) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 28040, 0);
        b7 b7Var = state.f111881a;
        sVar.W(86341308);
        boolean h10 = sVar.h(b7Var);
        Object J2 = sVar.J();
        if (h10 || J2 == i2.n.f71185a) {
            J2 = bs1.c.u1(Boolean.valueOf(state.f111883c), y3.f71400a);
            sVar.g0(J2);
        }
        sVar.r(false);
        if (((Boolean) ((q1) J2).getValue()).booleanValue()) {
            f(state.f111881a, androidx.compose.foundation.layout.e.f17184c, sVar, 48, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new l1.b(state, externalViewsState, onPrimaryAction, onSecondaryAction, qVar2, z14, i13, i14);
        }
    }

    public static void e0(lq0.e eVar, uk1.e eVar2) {
        eVar.f84295k0 = eVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(s80.b7 r21, u2.q r22, i2.o r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.f(s80.b7, u2.q, i2.o, int, int):void");
    }

    public static final boolean f0(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(accessibilityManager.getEnabledAccessibilityServiceList(1), "getEnabledAccessibilityServiceList(...)");
        return !r2.isEmpty();
    }

    public static final void g(List providedValues, u2.q qVar, u2.q qVar2, Function1 function1, Function1 function12, Function1 function13, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(providedValues, "providedValues");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(521783978);
        int i15 = i14 & 2;
        u2.q qVar3 = n.f120041b;
        u2.q qVar4 = i15 != 0 ? qVar3 : qVar;
        if ((i14 & 4) == 0) {
            qVar3 = qVar2;
        }
        Function1 function14 = (i14 & 8) != 0 ? f.f117247i : function1;
        Function1 function15 = (i14 & 16) != 0 ? tc0.g.f117255i : function12;
        d2[] d2VarArr = (d2[]) providedValues.toArray(new d2[0]);
        com.bumptech.glide.d.b((d2[]) Arrays.copyOf(d2VarArr, d2VarArr.length), q2.i.c(16834410, new j(qVar4, function15, function14, function13, qVar3, 2), sVar), sVar, 56);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new i1.n(providedValues, qVar4, qVar3, function14, function15, function13, i13, i14);
        }
    }

    public static int g0(hd2.f value, mm.b builder) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(builder, "builder");
        PointF pointF = value.f68922a;
        int f13 = ef2.a.f(builder, pointF.x, pointF.y);
        PointF pointF2 = value.f68923b;
        int f14 = ef2.a.f(builder, pointF2.x, pointF2.y);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.o(2);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(1, f14);
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.d(0, f13);
        Intrinsics.checkNotNullParameter(builder, "builder");
        int g13 = builder.g();
        builder.l(g13, 4);
        builder.l(g13, 6);
        return g13;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(w80.h1 r14, u2.q r15, i2.o r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.h(w80.h1, u2.q, i2.o, int, int):void");
    }

    public static final b0 h0(Context context, ac.r rVar, String str) {
        if (rVar instanceof ac.q) {
            return Intrinsics.d(str, "__LottieInternalDefaultCacheKey__") ? com.airbnb.lottie.n.f(context, ((ac.q) rVar).f1880a) : com.airbnb.lottie.n.e(((ac.q) rVar).f1880a, context, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void i(tc0.d0 item, o oVar, int i13) {
        Intrinsics.checkNotNullParameter(item, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(690604032);
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        j(new tc0.e0(context.getString(item.f117236a), null, item.f117237b, null, null, item.f117238c, 26), null, sVar, 8, 2);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(item, i13, 28);
        }
    }

    public static boolean i0(long j13, long j14) {
        return j13 - j14 <= 80000;
    }

    public static final void j(tc0.e0 displayState, u2.q qVar, o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(170909095);
        int i15 = i14 & 2;
        n nVar = n.f120041b;
        if (i15 != 0) {
            qVar = nVar;
        }
        u2.q b13 = androidx.compose.foundation.layout.e.b(qVar, 1.0f);
        p1.y a13 = p1.x.a(l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, b13);
        k.Qo.getClass();
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
        tb.f.f0(sVar, a13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        String str = displayState.f117241a;
        sVar.W(-331314189);
        if (str != null) {
            o(0, sVar, str);
        }
        sVar.r(false);
        g(displayState.f117243c, androidx.compose.foundation.layout.e.b(nVar, 1.0f), displayState.f117242b, displayState.f117244d, displayState.f117245e, displayState.f117246f, sVar, 56, 0);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 13, displayState, qVar);
        }
    }

    public static final void k(tc0.f0 item, o oVar, int i13) {
        Intrinsics.checkNotNullParameter(item, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(221417982);
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(item, "item");
        Integer num = item.f117248a;
        String string = num != null ? context.getString(num.intValue()) : null;
        Integer num2 = item.f117250c;
        String string2 = num2 != null ? context.getString(num2.intValue()) : null;
        Integer num3 = item.f117251d;
        l(new tc0.g0(string, string2, num3 != null ? context.getString(num3.intValue()) : null, item.f117252e, null, null, null, null, item.f117253f, item.f117254g, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM), null, sVar, 8, 2);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new t0(item, i13, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [boolean, int] */
    public static final void l(tc0.g0 displayState, u2.q qVar, o oVar, int i13, int i14) {
        ?? r13;
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(851295397);
        int i15 = i14 & 2;
        n nVar = n.f120041b;
        u2.q qVar2 = i15 != 0 ? nVar : qVar;
        u2.q b13 = androidx.compose.foundation.layout.e.b(qVar2, 1.0f);
        p1.y a13 = p1.x.a(l.f98545c, u2.b.f120025m, sVar, 0);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = m0.X(sVar, b13);
        k.Qo.getClass();
        s3.i iVar = s3.j.f110798b;
        boolean z13 = sVar.f71265a instanceof i2.f;
        if (!z13) {
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
        tb.f.f0(sVar, o13, hVar2);
        s3.h hVar3 = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar3);
        }
        s3.h hVar4 = s3.j.f110799c;
        tb.f.f0(sVar, X, hVar4);
        String str = displayState.f117256a;
        sVar.W(637336594);
        if (str != null) {
            o(0, sVar, str);
        }
        sVar.r(false);
        e1 a14 = c1.a(l.g(com.bumptech.glide.d.A(oc0.o.padding_page, sVar)), u2.b.f120022j, sVar, 0);
        int i17 = sVar.P;
        z1 o14 = sVar.o();
        u2.q X2 = m0.X(sVar, nVar);
        if (!z13) {
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
        tb.f.f0(sVar, o14, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i17))) {
            ep.b.y(i17, sVar, i17, hVar3);
        }
        tb.f.f0(sVar, X2, hVar4);
        g1 g1Var = g1.f98514a;
        sVar.W(-2093076247);
        String str2 = displayState.f117257b;
        if (str2 == null) {
            r13 = 0;
        } else {
            r13 = 0;
            n(str2, g1Var.b(nVar, 1.0f, true), sVar, 0, 0);
        }
        sVar.r(r13);
        String str3 = displayState.f117258c;
        if (str3 != null) {
            n(str3, g1Var.b(nVar, 1.0f, true), sVar, r13, r13);
        }
        sVar.r(true);
        u2.q c13 = androidx.compose.foundation.layout.a.c(n0.Min);
        e1 a15 = c1.a(l.g(com.bumptech.glide.d.A(oc0.o.padding_page, sVar)), u2.b.f120023k, sVar, 48);
        int i18 = sVar.P;
        z1 o15 = sVar.o();
        u2.q X3 = m0.X(sVar, c13);
        if (!z13) {
            com.bumptech.glide.c.j0();
            throw null;
        }
        sVar.a0();
        if (sVar.O) {
            sVar.n(iVar);
        } else {
            sVar.j0();
        }
        tb.f.f0(sVar, a15, hVar);
        tb.f.f0(sVar, o15, hVar2);
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
            ep.b.y(i18, sVar, i18, hVar3);
        }
        tb.f.f0(sVar, X3, hVar4);
        u2.q b14 = g1Var.b(nVar, 1.0f, true);
        FillElement fillElement = androidx.compose.foundation.layout.e.f17183b;
        g(displayState.f117259d, b14.j(fillElement), displayState.f117260e, displayState.f117262g, null, displayState.f117264i, sVar, 8, 16);
        g(displayState.f117259d, g1Var.b(nVar, 1.0f, true).j(fillElement), displayState.f117261f, displayState.f117263h, null, displayState.f117265j, sVar, 8, 16);
        sVar.r(true);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 14, displayState, qVar2);
        }
    }

    public static int l0(ByteBuffer byteBuffer) {
        int i13;
        if ((byteBuffer.get(5) & 2) == 0) {
            i13 = 0;
        } else {
            byte b13 = byteBuffer.get(26);
            int i14 = 28;
            int i15 = 28;
            for (int i16 = 0; i16 < b13; i16++) {
                i15 += byteBuffer.get(i16 + 27);
            }
            byte b14 = byteBuffer.get(i15 + 26);
            for (int i17 = 0; i17 < b14; i17++) {
                i14 += byteBuffer.get(i15 + 27 + i17);
            }
            i13 = i15 + i14;
        }
        int i18 = byteBuffer.get(i13 + 26) + 27 + i13;
        return (int) ((Q(byteBuffer.get(i18), byteBuffer.limit() - i18 > 1 ? byteBuffer.get(i18 + 1) : (byte) 0) * 48000) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m(tc0.j r32, u2.q r33, i2.o r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.m(tc0.j, u2.q, i2.o, int, int):void");
    }

    public static void m0(float[] fArr, float f13) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f13, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n(java.lang.String r27, u2.q r28, i2.o r29, int r30, int r31) {
        /*
            r0 = r27
            java.lang.String r1 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            r15 = r29
            i2.s r15 = (i2.s) r15
            r1 = -852266428(0xffffffffcd337244, float:-1.8816314E8)
            r15.Y(r1)
            r1 = r31 & 1
            if (r1 == 0) goto L18
            r1 = r30 | 6
            goto L2a
        L18:
            r1 = r30 & 14
            if (r1 != 0) goto L28
            boolean r1 = r15.h(r0)
            if (r1 == 0) goto L24
            r1 = 4
            goto L25
        L24:
            r1 = 2
        L25:
            r1 = r30 | r1
            goto L2a
        L28:
            r1 = r30
        L2a:
            r2 = r31 & 2
            if (r2 == 0) goto L34
            r1 = r1 | 48
        L30:
            r3 = r28
        L32:
            r4 = r1
            goto L47
        L34:
            r3 = r30 & 112(0x70, float:1.57E-43)
            if (r3 != 0) goto L30
            r3 = r28
            boolean r4 = r15.h(r3)
            if (r4 == 0) goto L43
            r4 = 32
            goto L45
        L43:
            r4 = 16
        L45:
            r1 = r1 | r4
            goto L32
        L47:
            r1 = r4 & 91
            r5 = 18
            if (r1 != r5) goto L5b
            boolean r1 = r15.z()
            if (r1 != 0) goto L54
            goto L5b
        L54:
            r15.Q()
            r2 = r3
            r26 = r15
            goto L9f
        L5b:
            if (r2 == 0) goto L62
            u2.n r1 = u2.n.f120041b
            r25 = r1
            goto L64
        L62:
            r25 = r3
        L64:
            int r1 = oc0.o.top_padding_text
            float r9 = com.bumptech.glide.d.A(r1, r15)
            r7 = 0
            r8 = 0
            r6 = 0
            r10 = 7
            r5 = r25
            u2.q r1 = androidx.compose.foundation.layout.b.r(r5, r6, r7, r8, r9, r10)
            r22 = r4 & 14
            r19 = 0
            r20 = 0
            r2 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r26 = r15
            r15 = r16
            r17 = 0
            r18 = 0
            r23 = 0
            r24 = 131068(0x1fffc, float:1.83665E-40)
            r0 = r27
            r21 = r26
            c2.d6.b(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r2 = r25
        L9f:
            i2.f2 r6 = r26.t()
            if (r6 == 0) goto Lb4
            tc0.h r7 = new tc0.h
            r5 = 0
            r0 = r7
            r1 = r27
            r3 = r30
            r4 = r31
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f71113d = r7
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.n(java.lang.String, u2.q, i2.o, int, int):void");
    }

    public static void n0(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static final void o(int i13, o oVar, String str) {
        int i14;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-1027259627);
        if ((i13 & 14) == 0) {
            i14 = (sVar2.h(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i14 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            sVar = sVar2;
            d6.b(str, androidx.compose.foundation.layout.b.r(n.f120041b, 0.0f, 0.0f, 0.0f, com.bumptech.glide.d.A(oc0.o.top_padding_text, sVar2), 7), 0L, w.r0(4294967296L, com.bumptech.glide.d.A(eo1.c.font_size_400, sVar2)), null, g4.l.f63472g, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar, (i14 & 14) | 196608, 0, 131028);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new tc0.i(str, i13, 0);
        }
    }

    public static final e.l o0(h.e eVar, Function1 function1, o oVar) {
        i2.s sVar = (i2.s) oVar;
        sVar.X(-1408504823);
        q1 K1 = bs1.c.K1(eVar, sVar);
        q1 K12 = bs1.c.K1(function1, sVar);
        String str = (String) so.a.i(new Object[0], null, e.d.f56670j, sVar, 3080, 6);
        u0 u0Var = e.j.f56688a;
        sVar.X(1418020823);
        g.h hVar = (g.h) sVar.m(e.j.f56688a);
        if (hVar == null) {
            Object obj = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
            while (true) {
                if (!(obj instanceof ContextWrapper)) {
                    obj = null;
                    break;
                }
                if (obj instanceof g.h) {
                    break;
                }
                obj = ((ContextWrapper) obj).getBaseContext();
            }
            hVar = (g.h) obj;
        }
        sVar.r(false);
        if (hVar == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner".toString());
        }
        g.g activityResultRegistry = hVar.getActivityResultRegistry();
        sVar.X(-3687241);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new e.a();
            sVar.g0(J2);
        }
        sVar.r(false);
        e.a aVar = (e.a) J2;
        sVar.X(-3687241);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new e.l(aVar, K1);
            sVar.g0(J3);
        }
        sVar.r(false);
        e.l lVar = (e.l) J3;
        e.c cVar = new e.c(aVar, activityResultRegistry, str, eVar, K12, 0);
        boolean h10 = sVar.h(activityResultRegistry) | sVar.h(str) | sVar.h(eVar);
        Object J4 = sVar.J();
        if (h10 || J4 == dVar) {
            J4 = new r0(cVar);
            sVar.g0(J4);
        }
        sVar.r(false);
        return lVar;
    }

    public static int p(int i13, List list) {
        return ep.b.c(list, i13, 31);
    }

    public static final p p0(ac.q spec, String str, o oVar, int i13) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        i2.s sVar = (i2.s) oVar;
        sVar.X(-1248473602);
        if ((i13 & 16) != 0) {
            str = "__LottieInternalDefaultCacheKey__";
        }
        v0 v0Var = new v0(3, null);
        Context context = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
        sVar.X(1388713885);
        boolean h10 = sVar.h(spec);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (h10 || J2 == dVar) {
            J2 = bs1.c.u1(new p(), y3.f71400a);
            sVar.g0(J2);
        }
        q1 q1Var = (q1) J2;
        sVar.r(false);
        sVar.X(1388714176);
        boolean h13 = sVar.h(spec) | sVar.h(str);
        Object J3 = sVar.J();
        if (h13 || J3 == dVar) {
            J3 = h0(context, spec, str);
            sVar.g0(J3);
        }
        sVar.r(false);
        u.d(spec, str, new ac.w(v0Var, context, spec, null, "fonts/", ".ttf", str, q1Var, null), sVar);
        p pVar = (p) q1Var.getValue();
        sVar.r(false);
        return pVar;
    }

    public static pk0 q(String keyset) {
        Intrinsics.checkNotNullParameter(keyset, "keyset");
        try {
            return new pk0(g3.j(new sj(new ByteArrayInputStream(Base64.decode(keyset, 11)))));
        } catch (IOException unused) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }

    public static final u2.q q0(b2.t0 t0Var) {
        n nVar = n.f120041b;
        if (!u1.a()) {
            return nVar;
        }
        return m0.p(nVar, t3.p.f116119m, new i1.h(t0Var, 6));
    }

    public static ads_mobile_sdk.r0 r(nm.u json, int i13) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        ArrayList arrayList4;
        String str2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        String str3;
        ArrayList arrayList7;
        String str4;
        ArrayList arrayList8;
        ArrayList arrayList9;
        ArrayList arrayList10;
        int i14;
        ArrayList arrayList11;
        ArrayList arrayList12;
        ArrayList arrayList13;
        ArrayList arrayList14;
        ArrayList arrayList15;
        ArrayList arrayList16;
        nm.q d2;
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            ArrayList arrayList17 = new ArrayList();
            i5 i5Var = i5.f6232b;
            ArrayList arrayList18 = new ArrayList();
            ArrayList arrayList19 = new ArrayList();
            ArrayList arrayList20 = new ArrayList();
            ads_mobile_sdk.n0 n0Var = ads_mobile_sdk.n0.f8467d;
            ArrayList arrayList21 = new ArrayList();
            ArrayList arrayList22 = new ArrayList();
            ArrayList arrayList23 = new ArrayList();
            ArrayList arrayList24 = new ArrayList();
            ArrayList arrayList25 = new ArrayList();
            ArrayList arrayList26 = new ArrayList();
            ArrayList arrayList27 = new ArrayList();
            ArrayList arrayList28 = new ArrayList();
            String str5 = "ping_strategy";
            ArrayList arrayList29 = new ArrayList();
            String str6 = "json";
            ArrayList arrayList30 = new ArrayList();
            nm.u uVar = new nm.u();
            nm.u uVar2 = new nm.u();
            nm.u uVar3 = new nm.u();
            zn2.b.f142311b.getClass();
            dt1 dt1Var = new dt1(ct1.f4030c, lu1.f7985d, false, "", "");
            q0 q0Var = q0.f9881d;
            nm.u uVar4 = new nm.u();
            ArrayList arrayList31 = arrayList25;
            ArrayList arrayList32 = new ArrayList();
            Bundle bundle = Bundle.EMPTY;
            ad2 ad2Var = new ad2();
            Iterator it = ((pm.l) json.f91366a.entrySet()).iterator();
            ArrayList arrayList33 = arrayList30;
            String str7 = "";
            ads_mobile_sdk.n0 n0Var2 = n0Var;
            nm.u uVar5 = uVar2;
            nm.u uVar6 = uVar3;
            dt1 dt1Var2 = dt1Var;
            q0 q0Var2 = q0Var;
            nm.u uVar7 = uVar4;
            ad2 ad2Var2 = ad2Var;
            long j13 = 0;
            long j14 = 0;
            String str8 = str7;
            String str9 = str8;
            String str10 = str9;
            String str11 = str10;
            String str12 = str11;
            String str13 = str12;
            String str14 = str13;
            String str15 = str14;
            String str16 = str15;
            String str17 = str16;
            String str18 = str17;
            String str19 = str18;
            String str20 = str19;
            String str21 = str20;
            String str22 = str21;
            String str23 = str22;
            String str24 = str23;
            double d13 = 0.0d;
            c6 c6Var = null;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            boolean z16 = false;
            String str25 = null;
            boolean z17 = false;
            fs0 fs0Var = null;
            int i15 = -1;
            boolean z18 = false;
            boolean z19 = false;
            boolean z23 = false;
            boolean z24 = false;
            boolean z25 = false;
            String str26 = null;
            boolean z26 = false;
            boolean z27 = false;
            fa2 fa2Var = null;
            boolean z28 = false;
            boolean z29 = false;
            boolean z33 = false;
            ep1 ep1Var = null;
            bx1 bx1Var = null;
            yn1 yn1Var = null;
            boolean z34 = false;
            Bundle bundle2 = bundle;
            i5 i5Var2 = i5Var;
            String str27 = str24;
            while (((m) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((pm.k) it).next();
                Intrinsics.f(entry);
                String str28 = (String) entry.getKey();
                Iterator it2 = it;
                nm.s sVar = (nm.s) entry.getValue();
                if (str28 != null) {
                    ArrayList arrayList34 = arrayList29;
                    arrayList = arrayList26;
                    ArrayList arrayList35 = arrayList24;
                    switch (str28.hashCode()) {
                        case -2138196627:
                            str = str5;
                            str3 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            if (!str28.equals("ad_source_instance_name")) {
                                break;
                            } else {
                                String p13 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
                                Unit unit = Unit.f80348a;
                                str12 = p13;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1980587809:
                            str = str5;
                            str4 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            if (!str28.equals("debug_signals")) {
                                str3 = str4;
                                break;
                            } else {
                                nm.u i16 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i16, "getAsJsonObject(...)");
                                Unit unit2 = Unit.f80348a;
                                uVar5 = i16;
                                str3 = str4;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1965512151:
                            str = str5;
                            str4 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            if (!str28.equals("omid_settings")) {
                                str3 = str4;
                                break;
                            } else {
                                nm.u i17 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i17, "getAsJsonObject(...)");
                                Intrinsics.checkNotNullParameter(i17, str4);
                                int a13 = k41.a(i17, "media_type", -1);
                                ct1 ct1Var = a13 != 0 ? a13 != 1 ? ct1.f4030c : ct1.f4028a : ct1.f4029b;
                                dt1Var2 = new dt1(ct1Var, a.q0.f149a[ct1Var.ordinal()] == 1 ? lu1.f7985d : lu1.f7984c, k41.a(i17, "javascript_session_service_enabled", true), k41.a(i17, "omid_partner_name", str2), k41.a(i17, "omid_html", str2));
                                Unit unit3 = Unit.f80348a;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList29 = arrayList5;
                                arrayList32 = arrayList6;
                                it = it2;
                                arrayList26 = arrayList;
                                arrayList33 = arrayList4;
                                str7 = str2;
                                str6 = str4;
                                arrayList24 = arrayList3;
                                arrayList28 = arrayList2;
                            }
                        case -1964744830:
                            str = str5;
                            str4 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            if (str28.equals("offline_ad_config")) {
                                nm.u i18 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i18, "getAsJsonObject(...)");
                                ep1Var = f0.h.f(i18);
                                Unit unit4 = Unit.f80348a;
                                str3 = str4;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            str3 = str4;
                            break;
                        case -1828733410:
                            str4 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            if (!str28.equals("network_ping_config")) {
                                str3 = str4;
                                str = str5;
                                break;
                            } else {
                                Intrinsics.f(sVar);
                                Intrinsics.checkNotNullParameter(sVar, str4);
                                if (sVar instanceof nm.u) {
                                    str = str5;
                                    if (sVar.i().f91366a.containsKey(str)) {
                                        nm.s v13 = sVar.i().v(str);
                                        v13.getClass();
                                        if (v13 instanceof nm.u) {
                                            nm.u i19 = v13.i();
                                            Intrinsics.checkNotNullExpressionValue(i19, "getAsJsonObject(...)");
                                            Intrinsics.checkNotNullParameter(i19, str4);
                                            yn1Var = new yn1(new zn1(k41.a(i19, "max_attempts", 1), k41.a(i19, "initial_backoff_ms", 0), k41.a(i19, "buffer_after_max_attempts", false), k41.c(i19, "backoff_multiplier")));
                                            Unit unit5 = Unit.f80348a;
                                            str3 = str4;
                                            str5 = str;
                                            arrayList27 = arrayList7;
                                            arrayList32 = arrayList6;
                                            arrayList24 = arrayList3;
                                            it = it2;
                                            arrayList26 = arrayList;
                                            str6 = str3;
                                            str7 = str2;
                                            arrayList29 = arrayList5;
                                            arrayList28 = arrayList2;
                                            arrayList33 = arrayList4;
                                        }
                                    }
                                } else {
                                    str = str5;
                                }
                                yn1Var = null;
                                Unit unit52 = Unit.f80348a;
                                str3 = str4;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1812055556:
                            arrayList3 = arrayList35;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList8 = arrayList31;
                            if (!str28.equals("play_prewarm_options")) {
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i23 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i23, "getAsJsonObject(...)");
                                str4 = str6;
                                Intrinsics.checkNotNullParameter(i23, str4);
                                arrayList31 = arrayList8;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                bx1 bx1Var2 = new bx1(k41.a(i23, "enable_prewarming", false), k41.a(i23, "prefetch_url", str2), k41.a(i23, "skip_offline_notification_flow", false));
                                Unit unit6 = Unit.f80348a;
                                bx1Var = bx1Var2;
                                arrayList27 = arrayList7;
                                arrayList29 = arrayList5;
                                arrayList32 = arrayList6;
                                it = it2;
                                arrayList26 = arrayList;
                                arrayList33 = arrayList4;
                                str7 = str2;
                                str6 = str4;
                                arrayList24 = arrayList3;
                                arrayList28 = arrayList2;
                            }
                        case -1785028569:
                            arrayList3 = arrayList35;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList8 = arrayList31;
                            if (!str28.equals("parallel_key")) {
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                str26 = sVar.p();
                                Unit unit7 = Unit.f80348a;
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1776946669:
                            arrayList3 = arrayList35;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList8 = arrayList31;
                            if (!str28.equals("ad_source_name")) {
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p14 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p14, "getAsString(...)");
                                Unit unit8 = Unit.f80348a;
                                str10 = p14;
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1620470467:
                            arrayList3 = arrayList35;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList8 = arrayList31;
                            if (str28.equals("backend_query_id")) {
                                String p15 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p15, "getAsString(...)");
                                Unit unit9 = Unit.f80348a;
                                str20 = p15;
                                arrayList31 = arrayList8;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            arrayList31 = arrayList8;
                            str = str5;
                            str3 = str6;
                            str2 = str7;
                            arrayList7 = arrayList27;
                            arrayList6 = arrayList32;
                            break;
                        case -1550155393:
                            arrayList3 = arrayList35;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            try {
                                if (!str28.equals("nofill_urls")) {
                                    str = str5;
                                    str3 = str6;
                                    str2 = str7;
                                    arrayList7 = arrayList27;
                                    arrayList6 = arrayList32;
                                    break;
                                } else {
                                    nm.q f13 = sVar.f();
                                    Intrinsics.checkNotNullExpressionValue(f13, "getAsJsonArray(...)");
                                    Iterator it3 = f13.iterator();
                                    int i24 = 0;
                                    while (it3.hasNext()) {
                                        Object next = it3.next();
                                        int i25 = i24 + 1;
                                        if (i24 < 0) {
                                            kotlin.collections.f0.p();
                                            throw null;
                                        }
                                        nm.s sVar2 = (nm.s) next;
                                        Intrinsics.f(sVar2);
                                        String p16 = sVar2.p();
                                        Intrinsics.checkNotNullExpressionValue(p16, "getAsString(...)");
                                        Uri parse = Uri.parse(p16);
                                        if (parse != null) {
                                            arrayList9 = arrayList31;
                                            arrayList9.add(parse);
                                            Unit unit10 = Unit.f80348a;
                                        } else {
                                            arrayList9 = arrayList31;
                                        }
                                        i24 = i25;
                                        arrayList31 = arrayList9;
                                    }
                                    arrayList8 = arrayList31;
                                    Unit unit11 = Unit.f80348a;
                                    arrayList31 = arrayList8;
                                    str = str5;
                                    str3 = str6;
                                    str2 = str7;
                                    arrayList7 = arrayList27;
                                    arrayList6 = arrayList32;
                                    str5 = str;
                                    arrayList27 = arrayList7;
                                    arrayList32 = arrayList6;
                                    arrayList24 = arrayList3;
                                    it = it2;
                                    arrayList26 = arrayList;
                                    str6 = str3;
                                    str7 = str2;
                                    arrayList29 = arrayList5;
                                    arrayList28 = arrayList2;
                                    arrayList33 = arrayList4;
                                }
                            } catch (Exception e13) {
                                e = e13;
                                Exception exc = e;
                                List list = c0.d.f(exc, exc).f6994p;
                                String message = exc.getMessage();
                                if (message == null) {
                                    message = exc.getClass().getName();
                                }
                                list.add(message);
                                return null;
                            }
                        case -1440104884:
                            arrayList10 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (!str28.equals("is_custom_close_blocked")) {
                                arrayList4 = arrayList10;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z23 = sVar.b();
                                Unit unit12 = Unit.f80348a;
                                arrayList4 = arrayList10;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1439500848:
                            arrayList10 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (str28.equals("orientation")) {
                                String p17 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p17, "getAsString(...)");
                                o0[] o0VarArr = o0.f9085a;
                                if (Intrinsics.d(p17, "landscape")) {
                                    i14 = 6;
                                } else if (Intrinsics.d(p17, "portrait")) {
                                    i14 = 7;
                                } else {
                                    i15 = -1;
                                    Unit unit13 = Unit.f80348a;
                                    arrayList4 = arrayList10;
                                    str = str5;
                                    str3 = str6;
                                    str2 = str7;
                                    arrayList7 = arrayList27;
                                    arrayList6 = arrayList32;
                                    str5 = str;
                                    arrayList27 = arrayList7;
                                    arrayList32 = arrayList6;
                                    arrayList24 = arrayList3;
                                    it = it2;
                                    arrayList26 = arrayList;
                                    str6 = str3;
                                    str7 = str2;
                                    arrayList29 = arrayList5;
                                    arrayList28 = arrayList2;
                                    arrayList33 = arrayList4;
                                }
                                i15 = i14;
                                Unit unit132 = Unit.f80348a;
                                arrayList4 = arrayList10;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            arrayList4 = arrayList10;
                            str = str5;
                            str3 = str6;
                            str2 = str7;
                            arrayList7 = arrayList27;
                            arrayList6 = arrayList32;
                            break;
                        case -1428969291:
                            arrayList11 = arrayList33;
                            arrayList12 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (!str28.equals("enable_omid")) {
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z24 = sVar.b();
                                Unit unit14 = Unit.f80348a;
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1406227629:
                            arrayList11 = arrayList33;
                            arrayList12 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (!str28.equals("buffer_click_url_as_ready_to_ping")) {
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z15 = sVar.b();
                                Unit unit15 = Unit.f80348a;
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1403779768:
                            arrayList11 = arrayList33;
                            arrayList12 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (str28.equals("showable_impression_type")) {
                                v9 v9Var = q0.f9879b;
                                int e14 = sVar.e();
                                v9Var.getClass();
                                q0Var2 = v9.a(e14);
                                Unit unit16 = Unit.f80348a;
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            arrayList4 = arrayList11;
                            arrayList5 = arrayList12;
                            str = str5;
                            str3 = str6;
                            str2 = str7;
                            arrayList7 = arrayList27;
                            arrayList6 = arrayList32;
                            break;
                        case -1360811658:
                            arrayList12 = arrayList34;
                            arrayList3 = arrayList35;
                            arrayList2 = arrayList28;
                            if (!str28.equals("ad_sizes")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                arrayList5 = arrayList12;
                                break;
                            } else {
                                nm.q f14 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f14, "getAsJsonArray(...)");
                                Iterator it4 = f14.iterator();
                                int i26 = 0;
                                while (it4.hasNext()) {
                                    Object next2 = it4.next();
                                    int i27 = i26 + 1;
                                    if (i26 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar3 = (nm.s) next2;
                                    Intrinsics.f(sVar3);
                                    nm.u i28 = sVar3.i();
                                    Intrinsics.checkNotNullExpressionValue(i28, "getAsJsonObject(...)");
                                    x0 f15 = kh2.j.f(i28);
                                    if (f15 != null) {
                                        arrayList13 = arrayList33;
                                        arrayList13.add(f15);
                                        Unit unit17 = Unit.f80348a;
                                    } else {
                                        arrayList13 = arrayList33;
                                    }
                                    arrayList33 = arrayList13;
                                    i26 = i27;
                                }
                                arrayList11 = arrayList33;
                                Unit unit18 = Unit.f80348a;
                                arrayList4 = arrayList11;
                                arrayList5 = arrayList12;
                                str = str5;
                                str3 = str6;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1306015996:
                            arrayList3 = arrayList35;
                            if (!str28.equals("adapters")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f16 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f16, "getAsJsonArray(...)");
                                Iterator it5 = f16.iterator();
                                int i29 = 0;
                                while (it5.hasNext()) {
                                    Object next3 = it5.next();
                                    int i33 = i29 + 1;
                                    if (i29 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar4 = (nm.s) next3;
                                    Intrinsics.f(sVar4);
                                    String p18 = sVar4.p();
                                    if (p18 != null) {
                                        arrayList14 = arrayList34;
                                        arrayList14.add(p18);
                                        Unit unit19 = Unit.f80348a;
                                    } else {
                                        arrayList14 = arrayList34;
                                    }
                                    i29 = i33;
                                    arrayList34 = arrayList14;
                                }
                                ArrayList arrayList36 = arrayList34;
                                Unit unit20 = Unit.f80348a;
                                arrayList2 = arrayList28;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                str2 = str7;
                                arrayList7 = arrayList27;
                                arrayList6 = arrayList32;
                                arrayList5 = arrayList36;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1303332046:
                            arrayList3 = arrayList35;
                            if (!str28.equals("test_mode_enabled")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z29 = sVar.b();
                                Unit unit21 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1289032093:
                            arrayList3 = arrayList35;
                            if (!str28.equals("extras")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i34 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i34, "getAsJsonObject(...)");
                                Unit unit22 = Unit.f80348a;
                                uVar6 = i34;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1240082064:
                            arrayList3 = arrayList35;
                            if (!str28.equals("ad_event_value")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i35 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i35, "getAsJsonObject(...)");
                                c6Var = c0.d.e(i35);
                                Unit unit23 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1234181075:
                            arrayList3 = arrayList35;
                            if (!str28.equals("allow_pub_rendered_attribution")) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z14 = sVar.b();
                                Unit unit24 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1168140544:
                            arrayList3 = arrayList35;
                            if (str28.equals("presentation_error_urls")) {
                                nm.q f17 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f17, "getAsJsonArray(...)");
                                Iterator it6 = f17.iterator();
                                int i36 = 0;
                                while (it6.hasNext()) {
                                    Object next4 = it6.next();
                                    int i37 = i36 + 1;
                                    if (i36 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar5 = (nm.s) next4;
                                    Intrinsics.f(sVar5);
                                    String p19 = sVar5.p();
                                    Intrinsics.checkNotNullExpressionValue(p19, "getAsString(...)");
                                    Uri parse2 = Uri.parse(p19);
                                    if (parse2 != null) {
                                        arrayList15 = arrayList;
                                        arrayList15.add(parse2);
                                        Unit unit25 = Unit.f80348a;
                                    } else {
                                        arrayList15 = arrayList;
                                    }
                                    arrayList = arrayList15;
                                    i36 = i37;
                                }
                                Unit unit26 = Unit.f80348a;
                                arrayList = arrayList;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            str = str5;
                            str3 = str6;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList7 = arrayList27;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            break;
                        case -1152230954:
                            arrayList3 = arrayList35;
                            if (!str28.equals(AdRevenueScheme.AD_TYPE)) {
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                u4 u4Var = i5.f6231a;
                                String p23 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p23, "getAsString(...)");
                                String upperCase = p23.toUpperCase(Locale.ROOT);
                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                u4Var.getClass();
                                i5Var2 = u4.a(upperCase);
                                Unit unit27 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1146534047:
                            arrayList3 = arrayList35;
                            if (str28.equals("is_scroll_aware")) {
                                z25 = sVar.b();
                                Unit unit28 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            str = str5;
                            str3 = str6;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            arrayList7 = arrayList27;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            break;
                        case -1115838944:
                            if (!str28.equals("fill_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f18 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f18, "getAsJsonArray(...)");
                                Iterator it7 = f18.iterator();
                                int i38 = 0;
                                while (it7.hasNext()) {
                                    Object next5 = it7.next();
                                    int i39 = i38 + 1;
                                    if (i38 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar6 = (nm.s) next5;
                                    Intrinsics.f(sVar6);
                                    String p24 = sVar6.p();
                                    Intrinsics.checkNotNullExpressionValue(p24, "getAsString(...)");
                                    Uri parse3 = Uri.parse(p24);
                                    if (parse3 != null) {
                                        arrayList16 = arrayList35;
                                        arrayList16.add(parse3);
                                        Unit unit29 = Unit.f80348a;
                                    } else {
                                        arrayList16 = arrayList35;
                                    }
                                    arrayList35 = arrayList16;
                                    i38 = i39;
                                }
                                Unit unit30 = Unit.f80348a;
                                arrayList3 = arrayList35;
                                str = str5;
                                str3 = str6;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                arrayList7 = arrayList27;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1081936678:
                            if (!str28.equals("allocation_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p25 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p25, "getAsString(...)");
                                Unit unit31 = Unit.f80348a;
                                str14 = p25;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1078050970:
                            if (!str28.equals("video_complete_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f19 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f19, "getAsJsonArray(...)");
                                Iterator it8 = f19.iterator();
                                int i43 = 0;
                                while (it8.hasNext()) {
                                    Object next6 = it8.next();
                                    int i44 = i43 + 1;
                                    if (i43 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar7 = (nm.s) next6;
                                    Intrinsics.f(sVar7);
                                    String p26 = sVar7.p();
                                    Intrinsics.checkNotNullExpressionValue(p26, "getAsString(...)");
                                    Uri parse4 = Uri.parse(p26);
                                    if (parse4 != null) {
                                        arrayList23.add(parse4);
                                        Unit unit32 = Unit.f80348a;
                                    }
                                    i43 = i44;
                                }
                                Unit unit33 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -1051269058:
                            if (!str28.equals("active_view")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String sVar8 = sVar.toString();
                                Intrinsics.checkNotNullExpressionValue(sVar8, "toString(...)");
                                Unit unit34 = Unit.f80348a;
                                str8 = sVar8;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -982608540:
                            if (!str28.equals("valid_from_timestamp")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p27 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p27, "getAsString(...)");
                                Unit unit35 = Unit.f80348a;
                                str22 = p27;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -972056451:
                            if (!str28.equals("ad_source_instance_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p28 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p28, "getAsString(...)");
                                Unit unit36 = Unit.f80348a;
                                str13 = p28;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -776859333:
                            if (!str28.equals("click_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f23 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f23, "getAsJsonArray(...)");
                                Iterator it9 = f23.iterator();
                                int i45 = 0;
                                while (it9.hasNext()) {
                                    Object next7 = it9.next();
                                    int i46 = i45 + 1;
                                    if (i45 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar9 = (nm.s) next7;
                                    Intrinsics.f(sVar9);
                                    String p29 = sVar9.p();
                                    Intrinsics.checkNotNullExpressionValue(p29, "getAsString(...)");
                                    Uri parse5 = Uri.parse(p29);
                                    if (parse5 != null) {
                                        arrayList18.add(parse5);
                                        Unit unit37 = Unit.f80348a;
                                    }
                                    i45 = i46;
                                }
                                Unit unit38 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -544216775:
                            if (!str28.equals("safe_browsing")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i47 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i47, "getAsJsonObject(...)");
                                ad2Var2 = a1.i(i47);
                                Unit unit39 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -437057161:
                            if (!str28.equals("imp_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f24 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f24, "getAsJsonArray(...)");
                                Iterator it10 = f24.iterator();
                                int i48 = 0;
                                while (it10.hasNext()) {
                                    Object next8 = it10.next();
                                    int i49 = i48 + 1;
                                    if (i48 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar10 = (nm.s) next8;
                                    Intrinsics.f(sVar10);
                                    String p33 = sVar10.p();
                                    Intrinsics.checkNotNullExpressionValue(p33, "getAsString(...)");
                                    Uri parse6 = Uri.parse(p33);
                                    if (parse6 != null) {
                                        arrayList19.add(parse6);
                                        Unit unit40 = Unit.f80348a;
                                    }
                                    i48 = i49;
                                }
                                Unit unit41 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -404433734:
                            if (!str28.equals("rtb_native_required_assets")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i53 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i53, "getAsJsonObject(...)");
                                Unit unit42 = Unit.f80348a;
                                uVar7 = i53;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -404326515:
                            if (!str28.equals("render_timeout_ms")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                zn2.a aVar = zn2.b.f142311b;
                                j14 = dl2.b.P2(sVar.e(), zn2.d.MILLISECONDS);
                                Unit unit43 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -388807511:
                            if (!str28.equals("content_url")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                str25 = sVar.p();
                                Unit unit44 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -213449460:
                            if (!str28.equals("force_disable_hardware_acceleration")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z17 = sVar.b();
                                Unit unit45 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -213424028:
                            if (!str28.equals("watermark")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p34 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p34, "getAsString(...)");
                                Unit unit46 = Unit.f80348a;
                                str24 = p34;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case -180214626:
                            if (!str28.equals("native_required_asset_viewability")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z16 = sVar.b();
                                Unit unit47 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 3107:
                            if (!str28.equals("ad")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i54 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i54, "getAsJsonObject(...)");
                                fs0 i55 = kh2.n.i(i54);
                                nm.u uVar8 = i55.f5266c;
                                z34 = (uVar8 == null || (d2 = k41.d(uVar8, "slots")) == null || d2.f91364a.size() <= 0) ? false : true;
                                Unit unit48 = Unit.f80348a;
                                fs0Var = i55;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                            break;
                        case 3355:
                            if (!str28.equals("id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p35 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p35, "getAsString(...)");
                                Unit unit49 = Unit.f80348a;
                                str17 = p35;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 3076010:
                            if (!str28.equals("data")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i56 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i56, "getAsJsonObject(...)");
                                Unit unit50 = Unit.f80348a;
                                uVar = i56;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 37109963:
                            if (!str28.equals("request_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p36 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p36, "getAsString(...)");
                                Unit unit51 = Unit.f80348a;
                                str18 = p36;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 63195984:
                            if (!str28.equals("render_test_label")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z27 = sVar.b();
                                Unit unit53 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 107433883:
                            if (!str28.equals("qdata")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p37 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p37, "getAsString(...)");
                                Unit unit54 = Unit.f80348a;
                                str19 = p37;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 230323073:
                            if (!str28.equals("ad_load_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f25 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f25, "getAsJsonArray(...)");
                                Iterator it11 = f25.iterator();
                                int i57 = 0;
                                while (it11.hasNext()) {
                                    Object next9 = it11.next();
                                    int i58 = i57 + 1;
                                    if (i57 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar11 = (nm.s) next9;
                                    Intrinsics.f(sVar11);
                                    String p38 = sVar11.p();
                                    Intrinsics.checkNotNullExpressionValue(p38, "getAsString(...)");
                                    Uri parse7 = Uri.parse(p38);
                                    if (parse7 != null) {
                                        arrayList20.add(parse7);
                                        Unit unit55 = Unit.f80348a;
                                    }
                                    i57 = i58;
                                }
                                Unit unit56 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 418392395:
                            if (!str28.equals("is_closable_area_disabled")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z18 = sVar.b();
                                Unit unit57 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 549176928:
                            if (!str28.equals("presentation_error_timeout_ms")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                zn2.a aVar2 = zn2.b.f142311b;
                                j13 = dl2.b.P2(sVar.e(), zn2.d.MILLISECONDS);
                                Unit unit58 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 597473788:
                            if (!str28.equals("debug_dialog_string")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p39 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p39, "getAsString(...)");
                                Unit unit59 = Unit.f80348a;
                                str16 = p39;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 754887508:
                            if (!str28.equals("container_sizes")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f26 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f26, "getAsJsonArray(...)");
                                Iterator it12 = f26.iterator();
                                int i59 = 0;
                                while (it12.hasNext()) {
                                    Object next10 = it12.next();
                                    int i63 = i59 + 1;
                                    if (i59 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar12 = (nm.s) next10;
                                    Intrinsics.f(sVar12);
                                    nm.u i64 = sVar12.i();
                                    Intrinsics.checkNotNullExpressionValue(i64, "getAsJsonObject(...)");
                                    x0 f27 = kh2.j.f(i64);
                                    if (f27 != null) {
                                        arrayList28.add(f27);
                                        Unit unit60 = Unit.f80348a;
                                    }
                                    i59 = i63;
                                }
                                Unit unit61 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 791122864:
                            if (!str28.equals("impression_type")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                t7 t7Var = ads_mobile_sdk.n0.f8465b;
                                int e15 = sVar.e();
                                t7Var.getClass();
                                n0Var2 = t7.a(e15);
                                Unit unit62 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 805095541:
                            if (!str28.equals("analytics_event_name_to_parameters_map")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.u i65 = sVar.i();
                                Intrinsics.checkNotNullExpressionValue(i65, "getAsJsonObject(...)");
                                bundle2 = k41.b(i65);
                                Unit unit63 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1010584092:
                            if (!str28.equals("transaction_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p43 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p43, "getAsString(...)");
                                Unit unit64 = Unit.f80348a;
                                str21 = p43;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1100650276:
                            if (!str28.equals("rewards")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                Intrinsics.f(sVar);
                                fa2Var = p2.I(sVar);
                                Unit unit65 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1141602460:
                            if (!str28.equals("adapter_response_info_key")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p44 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p44, "getAsString(...)");
                                Unit unit66 = Unit.f80348a;
                                str27 = p44;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1186014765:
                            if (!str28.equals("cache_hit_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f28 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f28, "getAsJsonArray(...)");
                                Iterator it13 = f28.iterator();
                                int i66 = 0;
                                while (it13.hasNext()) {
                                    Object next11 = it13.next();
                                    int i67 = i66 + 1;
                                    if (i66 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar13 = (nm.s) next11;
                                    Intrinsics.f(sVar13);
                                    String p45 = sVar13.p();
                                    Intrinsics.checkNotNullExpressionValue(p45, "getAsString(...)");
                                    Uri parse8 = Uri.parse(p45);
                                    if (parse8 != null) {
                                        arrayList32.add(parse8);
                                        Unit unit67 = Unit.f80348a;
                                    }
                                    i66 = i67;
                                }
                                Unit unit68 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1303622534:
                            if (!str28.equals("preload_sort_value")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                d13 = sVar.c();
                                Unit unit69 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1321720943:
                            if (!str28.equals("allow_pub_owned_ad_view")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z13 = sVar.b();
                                Unit unit70 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1422388341:
                            if (!str28.equals("is_collapsible")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z19 = sVar.b();
                                Unit unit71 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1437255331:
                            if (!str28.equals("ad_source_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p46 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p46, "getAsString(...)");
                                Unit unit72 = Unit.f80348a;
                                str11 = p46;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1637553475:
                            if (!str28.equals("bid_response")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p47 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p47, "getAsString(...)");
                                Unit unit73 = Unit.f80348a;
                                str15 = p47;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1638957285:
                            if (!str28.equals("video_start_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f29 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f29, "getAsJsonArray(...)");
                                Iterator it14 = f29.iterator();
                                int i68 = 0;
                                while (it14.hasNext()) {
                                    Object next12 = it14.next();
                                    int i69 = i68 + 1;
                                    if (i68 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar14 = (nm.s) next12;
                                    Intrinsics.f(sVar14);
                                    String p48 = sVar14.p();
                                    Intrinsics.checkNotNullExpressionValue(p48, "getAsString(...)");
                                    Uri parse9 = Uri.parse(p48);
                                    if (parse9 != null) {
                                        arrayList21.add(parse9);
                                        Unit unit74 = Unit.f80348a;
                                    }
                                    i68 = i69;
                                }
                                Unit unit75 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1686319423:
                            if (!str28.equals("ad_network_class_name")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p49 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p49, "getAsString(...)");
                                Unit unit76 = Unit.f80348a;
                                str9 = p49;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1688341040:
                            if (!str28.equals("video_reward_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f33 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f33, "getAsJsonArray(...)");
                                Iterator it15 = f33.iterator();
                                int i73 = 0;
                                while (it15.hasNext()) {
                                    Object next13 = it15.next();
                                    int i74 = i73 + 1;
                                    if (i73 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar15 = (nm.s) next13;
                                    Intrinsics.f(sVar15);
                                    String p53 = sVar15.p();
                                    Intrinsics.checkNotNullExpressionValue(p53, "getAsString(...)");
                                    Uri parse10 = Uri.parse(p53);
                                    if (parse10 != null) {
                                        arrayList22.add(parse10);
                                        Unit unit77 = Unit.f80348a;
                                    }
                                    i73 = i74;
                                }
                                Unit unit78 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1799285870:
                            if (!str28.equals("use_third_party_container_height")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z33 = sVar.b();
                                Unit unit79 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1839650832:
                            if (!str28.equals("renderers")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f34 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f34, "getAsJsonArray(...)");
                                Iterator it16 = f34.iterator();
                                int i75 = 0;
                                while (it16.hasNext()) {
                                    Object next14 = it16.next();
                                    int i76 = i75 + 1;
                                    if (i75 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar16 = (nm.s) next14;
                                    Intrinsics.f(sVar16);
                                    String p54 = sVar16.p();
                                    if (p54 != null) {
                                        arrayList17.add(p54);
                                        Unit unit80 = Unit.f80348a;
                                    }
                                    i75 = i76;
                                }
                                Unit unit81 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 1875425491:
                            if (!str28.equals("is_analytics_logging_enabled")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z28 = sVar.b();
                                Unit unit82 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 2068142375:
                            if (!str28.equals("rule_line_external_id")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                String p55 = sVar.p();
                                Intrinsics.checkNotNullExpressionValue(p55, "getAsString(...)");
                                Unit unit83 = Unit.f80348a;
                                str23 = p55;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 2072888499:
                            if (!str28.equals("manual_tracking_urls")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                nm.q f35 = sVar.f();
                                Intrinsics.checkNotNullExpressionValue(f35, "getAsJsonArray(...)");
                                Iterator it17 = f35.iterator();
                                int i77 = 0;
                                while (it17.hasNext()) {
                                    Object next15 = it17.next();
                                    int i78 = i77 + 1;
                                    if (i77 < 0) {
                                        kotlin.collections.f0.p();
                                        throw null;
                                    }
                                    nm.s sVar17 = (nm.s) next15;
                                    Intrinsics.f(sVar17);
                                    String p56 = sVar17.p();
                                    Intrinsics.checkNotNullExpressionValue(p56, "getAsString(...)");
                                    Uri parse11 = Uri.parse(p56);
                                    if (parse11 != null) {
                                        arrayList27.add(parse11);
                                        Unit unit84 = Unit.f80348a;
                                    }
                                    i77 = i78;
                                }
                                Unit unit85 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        case 2075506442:
                            if (!str28.equals("render_serially")) {
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                break;
                            } else {
                                z26 = sVar.b();
                                Unit unit86 = Unit.f80348a;
                                str = str5;
                                str3 = str6;
                                arrayList3 = arrayList35;
                                arrayList7 = arrayList27;
                                arrayList4 = arrayList33;
                                arrayList5 = arrayList34;
                                arrayList2 = arrayList28;
                                str2 = str7;
                                arrayList6 = arrayList32;
                                str5 = str;
                                arrayList27 = arrayList7;
                                arrayList32 = arrayList6;
                                arrayList24 = arrayList3;
                                it = it2;
                                arrayList26 = arrayList;
                                str6 = str3;
                                str7 = str2;
                                arrayList29 = arrayList5;
                                arrayList28 = arrayList2;
                                arrayList33 = arrayList4;
                            }
                        default:
                            str = str5;
                            str3 = str6;
                            arrayList3 = arrayList35;
                            arrayList7 = arrayList27;
                            arrayList4 = arrayList33;
                            arrayList5 = arrayList34;
                            arrayList2 = arrayList28;
                            str2 = str7;
                            arrayList6 = arrayList32;
                            break;
                    }
                } else {
                    arrayList = arrayList26;
                    arrayList2 = arrayList28;
                    arrayList3 = arrayList24;
                    str = str5;
                    arrayList4 = arrayList33;
                    str2 = str7;
                    arrayList5 = arrayList29;
                    arrayList6 = arrayList32;
                    str3 = str6;
                    arrayList7 = arrayList27;
                }
                ok.e0 e0Var = gk0.f5596a;
                gk0.a(new k0(str28));
                Unit unit87 = Unit.f80348a;
                str5 = str;
                arrayList27 = arrayList7;
                arrayList32 = arrayList6;
                arrayList24 = arrayList3;
                it = it2;
                arrayList26 = arrayList;
                str6 = str3;
                str7 = str2;
                arrayList29 = arrayList5;
                arrayList28 = arrayList2;
                arrayList33 = arrayList4;
            }
            ArrayList arrayList37 = arrayList28;
            ArrayList arrayList38 = arrayList27;
            ArrayList arrayList39 = arrayList32;
            ArrayList arrayList40 = arrayList24;
            ArrayList arrayList41 = arrayList33;
            ArrayList arrayList42 = arrayList29;
            Intrinsics.f(bundle2);
            return new ads_mobile_sdk.r0(str8, arrayList42, uVar, str27, arrayList20, str9, arrayList41, str10, str11, str12, str13, i5Var2, c6Var, str14, z13, z14, bundle2, str15, z15, arrayList39, z16, arrayList18, i13, str25, arrayList37, str16, uVar5, uVar6, arrayList40, z17, str17, n0Var2, arrayList19, fs0Var, str18, i15, z18, z19, z23, z24, z25, arrayList38, arrayList31, dt1Var2, str26, j13, arrayList26, str19, arrayList17, z26, z27, j14, str20, arrayList22, str21, str22, arrayList23, arrayList21, fa2Var, uVar7, str23, ad2Var2, z28, q0Var2, z29, z33, str24, ep1Var, bx1Var, yn1Var, d13, z34, 0);
        } catch (Exception e16) {
            e = e16;
        }
    }

    public static final void s(u2.q qVar, o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(2018407994);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = n.f120041b;
            }
            float f13 = 75;
            a(new b1(69, 64, h7.add_cutout_education_start_cutout), new b1(f13, RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE, h7.add_cutout_education_center_cutout), new b1(40, f13, h7.add_cutout_education_end_cutout), qVar, sVar, (i15 << 9) & 7168, 0);
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar, i13, i14, 1);
        }
    }

    public static final void t(b7 b7Var, h1 h1Var, u2.q qVar, boolean z13, o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1684887433);
        if ((i14 & 1) != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.h(b7Var) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(h1Var) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 != 0) {
            i15 |= 384;
        } else if ((i13 & 896) == 0) {
            i15 |= sVar.h(qVar) ? RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER : RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 7168) == 0) {
            i15 |= sVar.i(z13) ? 2048 : 1024;
        }
        if ((i15 & 5851) == 1170 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = n.f120041b;
            }
            if (i17 != 0) {
                z13 = true;
            }
            sVar.W(-450570378);
            b7 b7Var2 = b7.AddCutoutInstruct;
            b3.r0 r0Var = s0.f21349a;
            b3.x0 fVar = b7Var == b7Var2 ? z13 ? new v1.f(new w80.u1(((a3.d) h1Var.f128302c.getValue()).b(), ((a3.d) h1Var.f128302c.getValue()).d() / 2)) : new v1.f(new v1((a3.d) h1Var.f128302c.getValue(), dl2.b.F0((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b), om1.e.LG.getBorderRadius()))) : (b7Var == b7.Tips || b7Var == b7.TipsGoBack) ? new v1.f(new w80.u1(((a3.d) h1Var.f128303d.getValue()).b(), ((a3.d) h1Var.f128303d.getValue()).d() / 2)) : r0Var;
            sVar.r(false);
            p1.q.a(androidx.compose.foundation.a.b(androidx.compose.ui.draw.a.b(qVar.j(androidx.compose.foundation.layout.e.f17184c), fVar), kh2.g0.h(eo1.b.black900_40, sVar), r0Var), sVar, 0);
        }
        u2.q qVar2 = qVar;
        boolean z14 = z13;
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new p1.w(b7Var, h1Var, qVar2, z14, i13, i14);
        }
    }

    public static final void u(y6 y6Var, Function0 function0, Function0 function02, u2.q qVar, o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(511654516);
        u2.q qVar2 = (i14 & 8) != 0 ? n.f120041b : qVar;
        float A = com.bumptech.glide.d.A(eo1.c.rounding_600, sVar);
        j1.h(m2.s0(androidx.compose.foundation.layout.e.o(qVar2), A, 4), v1.i.a(A), kh2.g0.h(eo1.b.color_background_elevation_floating_added, sVar), 0L, null, 0.0f, q2.i.c(2110855352, new l1.s(y6Var, function0, function02, 5), sVar), sVar, 1572864, 56);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w80.q1(y6Var, function0, function02, qVar2, i13, i14, 0);
        }
    }

    public static final void v(y6 y6Var, Function0 function0, Function0 function02, u2.q qVar, o oVar, int i13, int i14) {
        i2.s sVar = (i2.s) oVar;
        sVar.Y(336665241);
        u2.q qVar2 = (i14 & 8) != 0 ? n.f120041b : qVar;
        boolean z13 = !z.j(y6Var.f111863d);
        i0 i0Var = h0.f120562a;
        String str = y6Var.f111863d;
        i0 x13 = z13 ? ep.b.x(str, "string", str) : i0Var;
        String str2 = y6Var.f111864e;
        if (!z.j(str2)) {
            i0Var = ep.b.x(str2, "string", str2);
        }
        i0 i0Var2 = i0Var;
        int i15 = i13 << 3;
        w.c(new cm1.d(new yl1.b(x13, false, z.j(str) ? fm1.c.GONE : fm1.c.VISIBLE, null, yl1.d.PRIMARY.getColorPalette(), null, null, null, zl1.a.primary_button, null, 746), new yl1.b(i0Var2, false, z.j(str2) ? fm1.c.GONE : fm1.c.VISIBLE, null, yl1.d.SECONDARY.getColorPalette(), null, null, null, zl1.a.secondary_button, null, 746), null, null, null, fm1.c.VISIBLE, 0, 92), qVar2, function0, function02, sVar, ((i13 >> 6) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | 8 | (i15 & 896) | (i15 & 7168), 0);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w80.q1(y6Var, function0, function02, qVar2, i13, i14, 1);
        }
    }

    public static final void w(u2.q qVar, o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-299328372);
        int i16 = i14 & 1;
        int i17 = 2;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = (sVar2.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.q qVar3 = i16 != 0 ? n.f120041b : qVar2;
            p p03 = p0(new ac.q(k7.collage_onboarding_reorder_hand), null, sVar2, 62);
            ac.b f13 = e0.t.f((com.airbnb.lottie.h) p03.getValue(), Integer.MAX_VALUE, sVar2, 958);
            com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) p03.getValue();
            sVar2.W(1344876812);
            boolean h10 = sVar2.h(f13);
            Object J2 = sVar2.J();
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new i1(f13, i17);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            sVar = sVar2;
            ph.a.a(hVar, (Function0) J2, qVar3, false, false, false, null, false, null, null, false, false, null, null, false, sVar, ((i15 << 6) & 896) | 8, 0, 65528);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar2, i13, i14, 3);
        }
    }

    public static final void x(u2.q qVar, o oVar, int i13, int i14) {
        u2.q qVar2;
        int i15;
        i2.s sVar;
        i2.s sVar2 = (i2.s) oVar;
        sVar2.Y(-2000077467);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            qVar2 = qVar;
        } else if ((i13 & 14) == 0) {
            qVar2 = qVar;
            i15 = (sVar2.h(qVar2) ? 4 : 2) | i13;
        } else {
            qVar2 = qVar;
            i15 = i13;
        }
        if ((i15 & 11) == 2 && sVar2.z()) {
            sVar2.Q();
            sVar = sVar2;
        } else {
            u2.q qVar3 = i16 != 0 ? n.f120041b : qVar2;
            p p03 = p0(new ac.q(k7.collage_onboarding_tips_hand), null, sVar2, 62);
            ac.b f13 = e0.t.f((com.airbnb.lottie.h) p03.getValue(), Integer.MAX_VALUE, sVar2, 958);
            com.airbnb.lottie.h hVar = (com.airbnb.lottie.h) p03.getValue();
            sVar2.W(1745579971);
            boolean h10 = sVar2.h(f13);
            Object J2 = sVar2.J();
            if (h10 || J2 == i2.n.f71185a) {
                J2 = new i1(f13, 3);
                sVar2.g0(J2);
            }
            sVar2.r(false);
            sVar = sVar2;
            ph.a.a(hVar, (Function0) J2, androidx.compose.foundation.layout.b.k(qVar3, 60, -25), false, false, false, null, false, null, null, false, false, null, null, false, sVar, 8, 0, 65528);
            qVar2 = qVar3;
        }
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new w1.c(qVar2, i13, i14, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(w80.h1 r13, java.lang.String r14, u2.q r15, i2.o r16, int r17, int r18) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.y(w80.h1, java.lang.String, u2.q, i2.o, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object z(android.content.Context r16, ac.r r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, bl2.c r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: gh0.b.z(android.content.Context, ac.r, java.lang.String, java.lang.String, java.lang.String, java.lang.String, bl2.c):java.lang.Object");
    }

    public abstract long M();

    public abstract long O();

    public abstract Location P();

    public void j0(Fragment fragment) {
    }

    public void k0(w0 w0Var, Fragment fragment, View view) {
    }
}
