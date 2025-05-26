package ig1;

import a.bb;
import a.c1;
import a.cb;
import a.cg;
import a.hf;
import a7.n0;
import ads_mobile_sdk.ad;
import ads_mobile_sdk.bk0;
import ads_mobile_sdk.c40;
import ads_mobile_sdk.d10;
import ads_mobile_sdk.gz0;
import ads_mobile_sdk.h61;
import ads_mobile_sdk.ib1;
import ads_mobile_sdk.jk0;
import ads_mobile_sdk.mz0;
import ads_mobile_sdk.n20;
import ads_mobile_sdk.p82;
import ads_mobile_sdk.pk0;
import ads_mobile_sdk.we2;
import ads_mobile_sdk.xc;
import ads_mobile_sdk.zc;
import ads_mobile_sdk.zj0;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.Layout;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.activity.i0;
import androidx.activity.k0;
import androidx.activity.m0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.u;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.b2;
import androidx.viewpager2.widget.ViewPager2;
import ao2.v0;
import bj.p;
import c4.a0;
import c4.y;
import com.pinterest.activity.sendapin.model.SendableObject;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.kg0;
import com.pinterest.api.model.o00;
import com.pinterest.api.model.to;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.vn0;
import com.pinterest.api.model.vq;
import com.pinterest.api.model.xl;
import com.pinterest.api.model.y5;
import com.pinterest.error.NetworkResponseError;
import com.pinterest.error.ServerError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.feature.pin.closeup.view.PinCloseupFragment;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.navigation.NavigationImpl;
import com.pinterest.oneBarLibrary.modules.model.AnnotatedTextParcelable;
import com.pinterest.oneBarLibrary.modules.model.FilteroptionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduleactionParcelable;
import com.pinterest.oneBarLibrary.modules.model.OnebarmoduledisplayParcelable;
import com.pinterest.screens.w2;
import com.pinterest.ui.menu.ContextMenuItemView;
import df.j1;
import dr.i;
import e0.t;
import gf2.l;
import gf2.r;
import h32.f1;
import h32.g0;
import h32.u0;
import h42.m;
import i2.f2;
import i2.n;
import i2.q1;
import i91.b0;
import i92.k;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import jq1.c;
import kh2.k3;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.y0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import lh0.a4;
import lh0.z3;
import m60.f0;
import m60.r0;
import m60.s0;
import m60.w;
import m60.x0;
import mq.h0;
import mq.x;
import mq.z;
import nx.d0;
import om1.f;
import os.g;
import pd2.l0;
import pd2.o0;
import pd2.p0;
import pd2.q0;
import ql2.s;
import rm1.q;
import so.ka;
import so.la;
import so.m3;
import so.o;
import so.oa;
import so.r8;
import tb0.h;
import uk1.e;
import wc0.d;
import yb1.j;
import yk1.v;
import yn2.c0;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a */
    public static MediaPlayer f72241a;

    public static final g A(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = s0.ic_image_search_with_background;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.contextmenu_visual_search), "image_search", q.FLASHLIGHT, f.DEFAULT_LIGHT_GRAY);
    }

    public static void A0(c cVar, o oVar) {
        cVar.f77465j0 = oVar;
    }

    public static final g B(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = dl2.b.T1(context) ? s0.vr_instagram_story_share_icon : s0.instagram_stories_share_icon;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.instagram_stories), "instagram_stories");
    }

    public static void B0(c cVar, e eVar) {
        cVar.f77466k0 = eVar;
    }

    public static final ContextMenuItemView C(Context context, cb2.g icon) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(icon, "icon");
        View inflate = LayoutInflater.from(context).inflate(d.contextmenu_item, (ViewGroup) null);
        Intrinsics.g(inflate, "null cannot be cast to non-null type com.pinterest.ui.menu.ContextMenuItemView");
        ContextMenuItemView contextMenuItemView = (ContextMenuItemView) inflate;
        contextMenuItemView.j(icon.f27318a.drawableRes(context));
        contextMenuItemView.l(icon.f27319b);
        contextMenuItemView.setContentDescription(context.getString(icon.f27320c));
        contextMenuItemView.setVisibility(4);
        contextMenuItemView.setOnClickListener(new wq1.a(icon, 27));
        return contextMenuItemView;
    }

    public static void C0(j jVar, e eVar) {
        jVar.f138565z0 = eVar;
    }

    public static final String D(long j13, String path, int i13, int i14) {
        Intrinsics.checkNotNullParameter(path, "path");
        return path + "_" + j13 + "_" + i13 + "_" + i14;
    }

    public static void D0(j jVar, x10.d dVar) {
        jVar.A0 = dVar;
    }

    public static final g E(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = s0.send_message_icon;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.send), "internal_send", q.SEND, f.DEFAULT_RED);
    }

    public static void E0(a02.d dVar, k kVar) {
        dVar.f225i0 = kVar;
    }

    public static final g F(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(x0.more);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return new g(context.getDrawable(s0.more_icon), string, "more_apps", q.ELLIPSIS, f.DEFAULT_LIGHT_GRAY);
    }

    public static void F0(j jVar) {
        jVar.getClass();
    }

    public static final g G(Context context, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(x0.pin_msg);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i13 = s0.pin_messaging;
        Object obj = d5.a.f53679a;
        Drawable drawable = context.getDrawable(i13);
        return z13 ? new g(drawable, string, "pin_msging", q.PINTEREST, f.DEFAULT_LIGHT_GRAY) : new g(drawable, string, "pin_msging", q.PINTEREST, f.DEFAULT_RED);
    }

    public static void G0(c cVar, v vVar) {
        cVar.f77467l0 = vVar;
    }

    public static final g H(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = s0.ic_share_angled_pin;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.save_pin), "save_link", q.ANGLED_PIN, f.DEFAULT_RED);
    }

    public static final void H0(d0 pinalytics, Matrix matrix, u0 elementType) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        Intrinsics.checkNotNullParameter(elementType, "elementType");
        float b03 = b0(matrix);
        float c03 = c0(matrix);
        float d03 = d0(matrix);
        if (a0(matrix) != 0.0f) {
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_ELEMENT_ROTATE, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        if (b03 != 1.0f) {
            pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_ELEMENT_SCALE, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
        if (c03 == 0.0f && d03 == 0.0f) {
            return;
        }
        pinalytics.h0((r18 & 1) != 0 ? f1.TAP : f1.STORY_PIN_ELEMENT_MOVE, (r18 & 2) != 0 ? null : elementType, (r18 & 4) != 0 ? null : null, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void I(p request, gw.d callback) {
        c40 c40Var;
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(callback, "callback");
        c1.f28a.getClass();
        xk2.k kVar = bk0.f3513c;
        ((mz0) ((n20) ((c1) kVar.getValue())).f8532g1.get()).getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        List list = request.f22924m;
        Object pk0Var = list.isEmpty() ? new pk0(Unit.f80348a) : hf.a(list, request.f22925n, request.f22932u, null);
        if (pk0Var instanceof jk0) {
            callback.a(new dj.c(dj.b.INVALID_REQUEST, bb.d((jk0) pk0Var)));
            return;
        }
        c1 c1Var = (c1) kVar.getValue();
        if (request instanceof vi.e) {
            d10 d10Var = new d10(((n20) ((c1) kVar.getValue())).f8515c);
            d10Var.f4094e = request;
            c40Var = d10Var;
        } else {
            c40 c40Var2 = new c40(((n20) ((c1) kVar.getValue())).f8515c);
            c40Var2.f3734e = request;
            c40Var = c40Var2;
        }
        ((mz0) ((n20) c1Var).f8532g1.get()).a((Function1) new ib1(c40Var.a((wi.k) request).a((dj.e) request).b().a().a(), callback, null));
    }

    public static final void I0(ViewPager2 viewPager2, wb.c states, z eventIntake, Fragment fragment, il1.a fragmentFactory, h42.a initialDisplayState) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(states, "states");
        Intrinsics.checkNotNullParameter(eventIntake, "eventIntake");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(fragmentFactory, "fragmentFactory");
        Intrinsics.checkNotNullParameter(initialDisplayState, "initialDisplayState");
        b2 b2Var = viewPager2.f19930j.f19240m;
        boolean z13 = b2Var instanceof h42.j;
        f0 f0Var = vb0.j.f125466a;
        if (z13) {
            f0Var.G("This ViewPager2 is already state based", new Object[0]);
            return;
        }
        if (b2Var != null) {
            f0Var.G("This ViewPager2 already has an Adapter", new Object[0]);
            return;
        }
        viewPager2.f(new za.d(eventIntake, 3));
        h42.j jVar = new h42.j(fragment, fragmentFactory, initialDisplayState);
        viewPager2.h(jVar);
        androidx.lifecycle.z viewLifecycleOwner = fragment.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        u S = bf.b.S(viewLifecycleOwner);
        ko2.f fVar = v0.f20219a;
        kotlin.jvm.internal.j.z(S, ho2.q.f69782a, null, new m(fragment, viewPager2, jVar, null, states), 2);
    }

    public static final vq J0(Matrix matrix, RectF rect) {
        Intrinsics.checkNotNullParameter(matrix, "<this>");
        Intrinsics.checkNotNullParameter(rect, "rect");
        float f13 = rect.left;
        float f14 = rect.top;
        float f15 = rect.right;
        float f16 = rect.bottom;
        float[] fArr = {f13, f14, f15, f14, f13, f16, f15, f16};
        matrix.mapPoints(fArr);
        return new vq(new PointF(fArr[0], fArr[1]), new PointF(fArr[2], fArr[3]), new PointF(fArr[4], fArr[5]), new PointF(fArr[6], fArr[7]));
    }

    public static final nl1.d K(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        nl1.d J2 = g1(viewPager2).J(viewPager2.f19924d);
        if (J2 instanceof nl1.d) {
            return J2;
        }
        return null;
    }

    public static final void K0(boolean z13, View view, boolean z14, Context context) {
        if (view == null || !z13 || context == null) {
            return;
        }
        if (t0(context)) {
            T0(view);
        }
        if (z14 && t(context)) {
            a1(context, true, false);
            MediaPlayer mediaPlayer = f72241a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        }
    }

    public static final void L(ViewPager2 viewPager2, x onFragmentAvailable) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        Intrinsics.checkNotNullParameter(onFragmentAvailable, "onFragmentAvailable");
        h42.j g13 = g1(viewPager2);
        Intrinsics.checkNotNullParameter(onFragmentAvailable, "onFragmentAvailable");
        nl1.d it = g13.J(g13.f67654o.f67641b);
        if (it == null) {
            g13.f67657r.add(onFragmentAvailable);
            return;
        }
        int i13 = h0.f87984k0;
        Intrinsics.checkNotNullParameter(it, "it");
        PinCloseupFragment pinCloseupFragment = it instanceof PinCloseupFragment ? (PinCloseupFragment) it : null;
        if (pinCloseupFragment != null) {
            pinCloseupFragment.e3();
        }
    }

    public static final void L0(Context context, View view, boolean z13, boolean z14) {
        M0(z13, view, z14, context, false, false, false);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r11.equals("com.facebook.orca") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0169, code lost:
    
        r0 = m60.s0.ic_social_fb_messenger_single_tone_nonpds;
        r1 = java.lang.Integer.valueOf(m60.s0.ic_social_fb_messenger_full_color_nonpds);
        r2 = m60.s0.brio_contextual_white_oval_menu_item_selected_bg;
        r3 = a62.a.facebook_messenger_share_icon_selected;
        r4 = java.lang.Integer.valueOf(m60.s0.ic_social_white_oval_gray_border_nonpds);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0062, code lost:
    
        if (r11.equals("com.facebook.lite") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r0 = m60.s0.ic_context_menu_facebook_full_bleed_nonpds;
        r2 = m60.s0.brio_contextual_facebook_menu_item_selected_bg;
        r3 = a62.a.facebook_share_icon_selected;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
    
        if (r11.equals("com.facebook.katana") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008e, code lost:
    
        if (r11.equals("com.google.android.babel") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0109, code lost:
    
        r0 = sm1.b.ic_dialog_gestalt;
        r2 = m60.s0.brio_contextual_sms_selected_bg;
        r3 = a62.a.android_sms_share_icon_selected;
        r4 = java.lang.Integer.valueOf(m60.s0.ic_social_android_sms_bg_nonpds);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d2, code lost:
    
        if (r11.equals("com.android.mms") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
    
        if (r11.equals("com.android.messaging") == false) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        if (r11.equals("com.facebook.mlite") == false) goto L166;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final sw0.r0 M(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.b.M(java.lang.String):sw0.r0");
    }

    public static final void M0(boolean z13, View view, boolean z14, Context context, boolean z15, boolean z16, boolean z17) {
        if (view != null) {
            if ((z13 || z17) && context != null) {
                if (t0(context)) {
                    T0(view);
                }
                if (z14 && t(context)) {
                    a1(context, z15, !z15 && z16);
                    MediaPlayer mediaPlayer = f72241a;
                    if (mediaPlayer != null) {
                        mediaPlayer.start();
                    }
                }
            }
        }
    }

    public static final long N(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return size.getWidth() * size.getHeight();
    }

    public static final void N0(View view) {
        if (view != null) {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (t0(context)) {
                view.performHapticFeedback(6);
            }
        }
    }

    public static final List O(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        px1.q[] qVarArr = new px1.q[3];
        String string = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_all);
        String string2 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_all);
        Intrinsics.f(string2);
        qVarArr[0] = new px1.q(0, string2, string, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER);
        String string3 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_organic);
        String string4 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_organic);
        String string5 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_pin_format_disclaimer);
        String string6 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_pin_format_title);
        String string7 = resources.getString(zx.e.ALL.getDescription());
        Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
        px1.q qVar = new px1.q(0, string7, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        String string8 = resources.getString(zx.e.IMAGE.getDescription());
        Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
        px1.q qVar2 = new px1.q(1, string8, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        String string9 = resources.getString(zx.e.VIDEO.getDescription());
        Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
        px1.q qVar3 = new px1.q(2, string9, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        String string10 = resources.getString(zx.e.PRODUCT.getDescription());
        Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
        List j13 = kotlin.collections.f0.j(qVar, qVar2, qVar3, new px1.q(3, string10, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN));
        Intrinsics.f(string4);
        qVarArr[1] = new px1.q(1, string4, string3, null, string6, string5, j13, 72);
        String string11 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_paid_and_earned);
        String string12 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_paid_and_earned);
        String string13 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_ad_format_disclaimer);
        String string14 = resources.getString(com.pinterest.partnerAnalytics.g.analytics_filter_ad_format_title);
        px1.q[] qVarArr2 = new px1.q[5];
        String string15 = resources.getString(zx.c.ALL.getDescription());
        Intrinsics.checkNotNullExpressionValue(string15, "getString(...)");
        qVarArr2[0] = new px1.q(0, string15, null, null, null, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
        zx.c cVar = zx.c.STANDARD;
        String string16 = resources.getString(cVar.getDescription());
        Intrinsics.checkNotNullExpressionValue(string16, "getString(...)");
        Integer disclaimer = cVar.getDisclaimer();
        qVarArr2[1] = new px1.q(1, string16, null, disclaimer != null ? resources.getString(disclaimer.intValue()) : null, null, null, null, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        zx.c cVar2 = zx.c.VIDEO;
        String string17 = resources.getString(cVar2.getDescription());
        Intrinsics.checkNotNullExpressionValue(string17, "getString(...)");
        Integer disclaimer2 = cVar2.getDisclaimer();
        qVarArr2[2] = new px1.q(2, string17, null, disclaimer2 != null ? resources.getString(disclaimer2.intValue()) : null, null, null, null, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        zx.c cVar3 = zx.c.PRODUCT;
        String string18 = resources.getString(cVar3.getDescription());
        Intrinsics.checkNotNullExpressionValue(string18, "getString(...)");
        Integer disclaimer3 = cVar3.getDisclaimer();
        qVarArr2[3] = new px1.q(3, string18, null, disclaimer3 != null ? resources.getString(disclaimer3.intValue()) : null, null, null, null, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        zx.c cVar4 = zx.c.IDEA;
        String string19 = resources.getString(cVar4.getDescription());
        Intrinsics.checkNotNullExpressionValue(string19, "getString(...)");
        Integer disclaimer4 = cVar4.getDisclaimer();
        qVarArr2[4] = new px1.q(4, string19, null, disclaimer4 != null ? resources.getString(disclaimer4.intValue()) : null, null, null, null, RecyclerViewTypes.VIEW_TYPE_HOME_FEED_TUNER_SETTINGS_NOTIFICATION);
        List j14 = kotlin.collections.f0.j(qVarArr2);
        Intrinsics.f(string12);
        qVarArr[2] = new px1.q(2, string12, string11, null, string14, string13, j14, 72);
        return kotlin.collections.f0.j(qVarArr);
    }

    public static final void O0(boolean z13, View view, Context context) {
        if (view == null || !z13 || context == null) {
            return;
        }
        if (t0(context)) {
            T0(view);
        }
        if (t(context)) {
            a1(context, false, true);
            MediaPlayer mediaPlayer = f72241a;
            if (mediaPlayer != null) {
                mediaPlayer.start();
            }
        }
    }

    public static final long P(tp coverPage) {
        Intrinsics.checkNotNullParameter(coverPage, "coverPage");
        to coverImageData = coverPage.getCoverImageData();
        if (coverImageData == null) {
            return 0L;
        }
        int mediaIndex = coverImageData.getMediaIndex();
        long mediaOffsetMs = coverImageData.getMediaOffsetMs();
        ArrayList e03 = e0(coverPage.getMediaList());
        long startTimeMs = mediaOffsetMs - ((bo0) coverPage.getMediaList().getItems().get(mediaIndex)).getStartTimeMs();
        if (mediaIndex == coverPage.getMediaList().getStartMediaIndex()) {
            startTimeMs -= coverPage.getMediaList().getStartTimeMs();
        }
        return R(mediaIndex, e03) + startTimeMs;
    }

    public static hr1.q P0(mr1.c cVar, uj2.q qVar, String str, ka kaVar, la laVar) {
        return new hr1.q(cVar, qVar, str, kaVar, laVar);
    }

    public static final Matrix Q(float f13, float f14, int i13, int i14, Matrix initialVideoMatrix) {
        Intrinsics.checkNotNullParameter(initialVideoMatrix, "initialVideoMatrix");
        if (i13 < i14) {
            return new Matrix();
        }
        float b03 = b0(initialVideoMatrix);
        float c03 = c0(initialVideoMatrix);
        float d03 = d0(initialVideoMatrix);
        RectF rectF = new RectF(0.0f, 0.0f, i13 * b03, i14 * b03);
        float f15 = -c03;
        float f16 = -d03;
        RectF rectF2 = new RectF(f15, f16, f13 + f15, f14 + f16);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        return matrix;
    }

    public static WindowInsets Q0(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v13, WindowInsets insets) {
        Intrinsics.checkNotNullParameter(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
        Intrinsics.checkNotNullParameter(v13, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v13, insets);
        Intrinsics.checkNotNullExpressionValue(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
        return onApplyWindowInsets;
    }

    public static final long R(int i13, List list) {
        long j13 = 0;
        if (list != null) {
            Iterator it = s.q(0, Math.min(i13, list.size())).iterator();
            while (it.hasNext()) {
                j13 += ((bo0) list.get(((kotlin.collections.u0) it).b())).f36143i;
            }
        }
        return j13;
    }

    public static final void R0(w wVar, String searchQuery, String insightId) {
        Intrinsics.checkNotNullParameter(wVar, "<this>");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(insightId, "insightId");
        NavigationImpl z03 = Navigation.z0((ScreenLocation) w2.f51515a.getValue(), searchQuery);
        z03.m0("com.pinterest.EXTRA_SEARCH_REFERRING_SOURCE", "style_summary");
        z03.m0("com.pinterest.EXTRA_INSIGHT_ID", insightId);
        wVar.d(z03);
    }

    public static final float S(Layout layout, int i13, Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i13);
        y yVar = a0.f25629a;
        if (layout.getEllipsisCount(i13) <= 0 || layout.getParagraphDirection(i13) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i13) + layout.getLineStart(i13)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if (paragraphAlignment != null && e4.d.f57139a[paragraphAlignment.ordinal()] == 1) {
            abs = Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static n0 S0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < list.size(); i13++) {
            String str = (String) list.get(i13);
            int i14 = d7.n0.f53866a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                d7.u.g("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(b9.a.d(new d7.d0(Base64.decode(split[1], 0))));
                } catch (RuntimeException e13) {
                    d7.u.h("VorbisUtil", "Failed to parse vorbis picture", e13);
                }
            } else {
                arrayList.add(new g9.a(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new n0(arrayList);
    }

    public static final float T(Layout layout, int i13, Paint paint) {
        float width;
        float width2;
        y yVar = a0.f25629a;
        if (layout.getEllipsisCount(i13) <= 0 || layout.getParagraphDirection(i13) != -1 || layout.getWidth() >= layout.getLineRight(i13)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i13) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i13) + layout.getLineStart(i13)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i13);
        if (paragraphAlignment != null && e4.d.f57139a[paragraphAlignment.ordinal()] == 1) {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i13);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final void T0(View view) {
        if (view != null) {
            view.performHapticFeedback(6);
        }
    }

    public static final Rect U(Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static final void U0(String targetUserId, nx.f0 pinalyticsFactory, w eventManager) {
        Intrinsics.checkNotNullParameter(targetUserId, "targetUserId");
        Intrinsics.checkNotNullParameter(pinalyticsFactory, "pinalyticsFactory");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.d(new jc0.v(new g91.e(targetUserId, pinalyticsFactory), false, 0L, 30));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0126, code lost:
    
        if (r1.l("android_ctx_long_press_cleanup") == false) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.pinterest.ui.menu.ContextMenuItemView V(android.view.LayoutInflater r17, android.content.Context r18, com.pinterest.activity.sendapin.model.SendableObject r19, final nx.d0 r20, java.util.List r21, so.c4 r22, int r23, final lh0.o0 r24, final androidx.appcompat.widget.c2 r25, final dl1.s r26, final h32.a4 r27) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.b.V(android.view.LayoutInflater, android.content.Context, com.pinterest.activity.sendapin.model.SendableObject, nx.d0, java.util.List, so.c4, int, lh0.o0, androidx.appcompat.widget.c2, dl1.s, h32.a4):com.pinterest.ui.menu.ContextMenuItemView");
    }

    public static bn0.a V0(d7.d0 d0Var, boolean z13, boolean z14) {
        if (z13) {
            p1(3, d0Var, false);
        }
        String w13 = d0Var.w((int) d0Var.p(), StandardCharsets.UTF_8);
        int length = w13.length();
        long p13 = d0Var.p();
        String[] strArr = new String[(int) p13];
        int i13 = length + 15;
        for (int i14 = 0; i14 < p13; i14++) {
            String w14 = d0Var.w((int) d0Var.p(), StandardCharsets.UTF_8);
            strArr[i14] = w14;
            i13 = i13 + 4 + w14.length();
        }
        if (z14 && (d0Var.y() & 1) == 0) {
            throw ParserException.a("framing bit expected to be set", null);
        }
        return new bn0.a(w13, strArr, i13 + 1, 9);
    }

    public static final nl1.d W(ViewPager2 viewPager2, int i13) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        nl1.d J2 = g1(viewPager2).J(i13);
        if (J2 instanceof nl1.d) {
            return J2;
        }
        return null;
    }

    public static final void W0() {
        MediaPlayer mediaPlayer = f72241a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        f72241a = null;
    }

    public static final Pair X() {
        return new Pair(Float.valueOf(-1.0f), Float.valueOf(1.0f));
    }

    public static final Date X0(kg0 kg0Var) {
        Intrinsics.checkNotNullParameter(kg0Var, "<this>");
        return new Date(TimeUnit.SECONDS.toMillis(kg0Var.G().intValue()));
    }

    public static final Pair Y(Context context, float f13, int i13, int i14, Matrix matrix) {
        Intrinsics.checkNotNullParameter(context, "context");
        RectF i03 = i0(f13, context);
        Matrix f03 = f0(i03.width(), i03.height(), i13, i14);
        if (matrix == null) {
            matrix = Q(i03.width(), i03.height(), i13, i14, f03);
        }
        return new Pair(f03, matrix);
    }

    public static final void Y0(i event, SendableObject sendableObject, k toastUtils, w eventManager, no1.e conversationRemoteDataSource) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(conversationRemoteDataSource, "conversationRemoteDataSource");
        TypeAheadItem contact = event.f56179a;
        Intrinsics.checkNotNullExpressionValue(contact, "contact");
        er.c cVar = contact.f35145f;
        switch (cVar == null ? -1 : b0.f71801a[cVar.ordinal()]) {
            case 1:
                if (!v(contact)) {
                    toastUtils.h(a62.e.please_enter_a_valid_email);
                    break;
                } else {
                    vb0.j.f125466a.M(sendableObject, "SendableObject should not be null", tb0.p.SHARING, new Object[0]);
                    if (sendableObject != null) {
                        Z0(event, sendableObject, t.f56747e, conversationRemoteDataSource);
                        break;
                    }
                }
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                vb0.j.f125466a.M(sendableObject, "SendableObject should not be null", tb0.p.SHARING, new Object[0]);
                if (sendableObject != null) {
                    sh.f.a().F(g0.USER_FEED, u0.USER_LIST_USER);
                    Z0(event, sendableObject, t.f56747e, conversationRemoteDataSource);
                    break;
                }
                break;
            case 6:
                eventManager.d(new pg0.p());
                break;
            default:
                HashSet hashSet = h.f117076w;
                h hVar = tb0.g.f117075a;
                Object[] objArr = {contact.f35145f};
                hVar.getClass();
                hVar.h(j1.T("Unhandled typeahead item type %d", objArr));
                break;
        }
    }

    public static xk2.w Z(Context context, float f13, int i13, int i14) {
        Intrinsics.checkNotNullParameter(context, "context");
        RectF i03 = i0(f13, context);
        Float valueOf = Float.valueOf(i03.width());
        Float valueOf2 = Float.valueOf(i03.height());
        float floatValue = valueOf.floatValue();
        float floatValue2 = valueOf2.floatValue();
        Matrix f03 = f0(floatValue, floatValue2, i13, i14);
        Matrix Q = Q(floatValue, floatValue2, i13, i14, f03);
        return new xk2.w(f03, Q, l0(context, f13, i13, i14, Q, f03, Float.valueOf(floatValue), Float.valueOf(floatValue2)));
    }

    public static final void Z0(i iVar, SendableObject sendableObject, int i13, no1.e eVar) {
        f1 f1Var;
        TypeAheadItem contact = iVar.f56179a;
        Intrinsics.checkNotNullExpressionValue(contact, "contact");
        int i14 = sendableObject.f35129c;
        if (i14 == 3) {
            String concat = "www.pinterest.com".concat(j1.U("/discover/article/%s", new Object[]{sendableObject.d()}));
            new kk2.m(oo1.j.j(new HashSet(e0.b(contact))), new t81.a(10, new rq.a0(concat, i13, eVar)), 0).l(wj2.c.a()).o(new x81.h0(13, new j41.i(sendableObject, 24)), new x81.h0(14, i91.g.f71827n));
            return;
        }
        if (i14 != 0) {
            if (i14 == 1) {
                f1Var = f1.BOARD_SEND;
            } else if (i14 == 2) {
                f1Var = f1.USER_SEND;
            } else if (i14 != 4) {
                if (i14 != 5) {
                    if (i14 != 6) {
                        if (i14 != 7) {
                            f1Var = f1.PIN_SEND;
                        }
                    }
                }
                f1Var = f1.ARTICLE_SEND;
            } else {
                f1Var = f1.DID_IT_SHARE;
            }
            new kk2.m(oo1.j.i(contact), new t81.a(11, new rq.a0(sendableObject, i13, eVar, 9)), 0).l(wj2.c.a()).o(new x81.h0(15, new rx0.f(iVar, f1Var, sendableObject, 20)), new x81.h0(16, new j41.i(iVar, 25)));
        }
        f1Var = f1.PIN_SEND;
        new kk2.m(oo1.j.i(contact), new t81.a(11, new rq.a0(sendableObject, i13, eVar, 9)), 0).l(wj2.c.a()).o(new x81.h0(15, new rx0.f(iVar, f1Var, sendableObject, 20)), new x81.h0(16, new j41.i(iVar, 25)));
    }

    public static final void a(int i13, int i14, i2.o oVar, Function0 function0, boolean z13) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-361453782);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 14) == 0) {
            i15 = (sVar.i(z13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) == 0) {
            i15 |= sVar.h(function0) ? 32 : 16;
        }
        if ((i15 & 91) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                z13 = true;
            }
            q1 K1 = bs1.c.K1(function0, sVar);
            sVar.X(-3687241);
            Object J2 = sVar.J();
            am.d dVar = n.f71185a;
            if (J2 == dVar) {
                J2 = new e.h(z13, K1);
                sVar.g0(J2);
            }
            int i17 = 0;
            sVar.r(false);
            e.h hVar = (e.h) J2;
            Boolean valueOf = Boolean.valueOf(z13);
            sVar.X(-3686552);
            boolean h10 = sVar.h(valueOf) | sVar.h(hVar);
            Object J3 = sVar.J();
            if (h10 || J3 == dVar) {
                J3 = new e.e(hVar, z13, i17);
                sVar.g0(J3);
            }
            sVar.r(false);
            i2.u.f((Function0) J3, sVar);
            i2.u0 u0Var = e.k.f56689a;
            sVar.X(-2068013981);
            k0 k0Var = (k0) sVar.m(e.k.f56689a);
            sVar.X(1680121597);
            if (k0Var == null) {
                View view = (View) sVar.m(AndroidCompositionLocals_androidKt.f17459f);
                Intrinsics.checkNotNullParameter(view, "<this>");
                k0Var = (k0) c0.l(c0.q(yn2.x.e(view, m0.f15915k), m0.f15916l));
            }
            sVar.r(false);
            if (k0Var == null) {
                Object obj = (Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b);
                while (true) {
                    if (!(obj instanceof ContextWrapper)) {
                        obj = null;
                        break;
                    } else if (obj instanceof k0) {
                        break;
                    } else {
                        obj = ((ContextWrapper) obj).getBaseContext();
                    }
                }
                k0Var = (k0) obj;
            }
            sVar.r(false);
            if (k0Var == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            i0 onBackPressedDispatcher = k0Var.getOnBackPressedDispatcher();
            androidx.lifecycle.z zVar = (androidx.lifecycle.z) sVar.m(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            i2.u.a(zVar, onBackPressedDispatcher, new e.f(onBackPressedDispatcher, zVar, hVar, i17), sVar);
        }
        f2 t13 = sVar.t();
        if (t13 == null) {
            return;
        }
        t13.f71113d = new e.g(z13, function0, i13, i14);
    }

    public static final float a0(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.getValues(new float[9]);
        return (-1) * ((float) Math.atan2(r0[1], r0[0])) * 57.29578f;
    }

    public static final void a1(Context context, boolean z13, boolean z14) {
        final Handler handler = new Handler(Looper.getMainLooper());
        if (f72241a == null) {
            MediaPlayer create = z14 ? MediaPlayer.create(context, xb2.c.success_2) : z13 ? MediaPlayer.create(context, xb2.c.button_click_5) : MediaPlayer.create(context, xb2.c.complete_2);
            f72241a = create;
            if (create != null) {
                create.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: if0.a
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        Handler releaseMediaPlayerHandler = handler;
                        Intrinsics.checkNotNullParameter(releaseMediaPlayerHandler, "$releaseMediaPlayerHandler");
                        releaseMediaPlayerHandler.postDelayed(new v.h(15), 1000L);
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(om1.c r12, u2.q r13, kotlin.jvm.functions.Function1 r14, i2.o r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.b.b(om1.c, u2.q, kotlin.jvm.functions.Function1, i2.o, int, int):void");
    }

    public static final float b0(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float f13 = fArr[0];
        float f14 = fArr[1];
        return (float) Math.sqrt((f14 * f14) + (f13 * f13));
    }

    public static q0 b1(ef2.b flatSettings) {
        byte b13;
        byte b14;
        p0 l0Var;
        byte b15;
        ql2.k kVar;
        byte b16;
        qd2.x xVar;
        Object qVar;
        qd2.a0 a0Var;
        qd2.u uVar;
        byte b17;
        l lVar;
        qd2.l lVar2;
        byte b18;
        byte b19;
        gf2.g gVar;
        Intrinsics.checkNotNullParameter(flatSettings, "flatSettings");
        gf2.x flatSpec = new gf2.x();
        Intrinsics.checkNotNullParameter(flatSpec, "obj");
        int i13 = 4;
        int b23 = flatSettings.b(4);
        if (b23 == 0) {
            throw new AssertionError("No value for (required) field spec");
        }
        int a13 = flatSettings.a(b23 + flatSettings.f87566a);
        ByteBuffer _bb = flatSettings.f87567b;
        Intrinsics.checkNotNullExpressionValue(_bb, "bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        Intrinsics.checkNotNullParameter(_bb, "_bb");
        flatSpec.c(a13, _bb);
        String str = "flatSpec";
        Intrinsics.checkNotNullParameter(flatSpec, "flatSpec");
        int b24 = flatSpec.b(4);
        IntRange q13 = s.q(0, b24 != 0 ? flatSpec.f(b24) : 0);
        int a14 = y0.a(kotlin.collections.g0.q(q13, 10));
        if (a14 < 16) {
            a14 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a14);
        ql2.k it = q13.iterator();
        while (true) {
            if (!it.f104109c) {
                gf2.z flatValues = new gf2.z();
                Intrinsics.checkNotNullParameter(flatValues, "obj");
                int b25 = flatSettings.b(6);
                if (b25 == 0) {
                    throw new AssertionError("No value for (required) field values");
                }
                int a15 = flatSettings.a(b25 + flatSettings.f87566a);
                ByteBuffer _bb2 = flatSettings.f87567b;
                Intrinsics.checkNotNullExpressionValue(_bb2, "bb");
                Intrinsics.checkNotNullParameter(_bb2, "_bb");
                Intrinsics.checkNotNullParameter(_bb2, "_bb");
                flatValues.c(a15, _bb2);
                Intrinsics.checkNotNullParameter(flatValues, "flatValues");
                int b26 = flatValues.b(4);
                IntRange q14 = s.q(0, b26 != 0 ? flatValues.f(b26) : 0);
                int a16 = y0.a(kotlin.collections.g0.q(q14, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(a16 < 16 ? 16 : a16);
                ql2.k it2 = q14.iterator();
                while (it2.f104109c) {
                    int b27 = it2.b();
                    gf2.a0 obj = new gf2.a0();
                    Intrinsics.checkNotNullParameter(obj, "obj");
                    int b28 = flatValues.b(4);
                    if (b28 == 0) {
                        throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b27, ", vector entries is empty"));
                    }
                    int a17 = flatValues.a((b27 * 4) + flatValues.e(b28));
                    ByteBuffer _bb3 = flatValues.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb3, "bb");
                    Intrinsics.checkNotNullParameter(_bb3, "_bb");
                    Intrinsics.checkNotNullParameter(_bb3, "_bb");
                    obj.c(a17, _bb3);
                    int b29 = obj.b(4);
                    if (b29 == 0) {
                        throw new AssertionError("No value for (required) field name");
                    }
                    String d2 = obj.d(b29 + obj.f87566a);
                    gf2.s obj2 = new gf2.s();
                    Intrinsics.checkNotNullParameter(obj2, "obj");
                    int b33 = obj.b(6);
                    if (b33 == 0) {
                        throw new AssertionError("No value for (required) field value");
                    }
                    int a18 = obj.a(b33 + obj.f87566a);
                    ByteBuffer _bb4 = obj.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb4, "bb");
                    Intrinsics.checkNotNullParameter(_bb4, "_bb");
                    Intrinsics.checkNotNullParameter(_bb4, "_bb");
                    obj2.c(a18, _bb4);
                    int b34 = obj2.b(4);
                    if (b34 != 0) {
                        b13 = obj2.f87567b.get(b34 + obj2.f87566a);
                        xk2.x xVar2 = xk2.y.f135237b;
                    } else {
                        b13 = 0;
                    }
                    if (b13 == 3) {
                        mm.c g13 = obj2.g(new gf2.b());
                        Intrinsics.f(g13);
                        gf2.b value = (gf2.b) g13;
                        Intrinsics.checkNotNullParameter(value, "value");
                        int b35 = value.b(4);
                        l0Var = new pd2.x((b35 == 0 || value.f87567b.get(b35 + value.f87566a) == 0) ? false : true);
                    } else if (b13 == 2) {
                        mm.c g14 = obj2.g(new gf2.n());
                        Intrinsics.f(g14);
                        gf2.n value2 = (gf2.n) g14;
                        Intrinsics.checkNotNullParameter(value2, "value");
                        int b36 = value2.b(4);
                        l0Var = new pd2.i0(b36 != 0 ? value2.f87567b.getInt(b36 + value2.f87566a) : 0);
                    } else if (b13 == 1) {
                        mm.c g15 = obj2.g(new gf2.i());
                        Intrinsics.f(g15);
                        gf2.i value3 = (gf2.i) g15;
                        Intrinsics.checkNotNullParameter(value3, "value");
                        int b37 = value3.b(4);
                        l0Var = new pd2.f0(b37 != 0 ? value3.f87567b.getFloat(b37 + value3.f87566a) : 0.0f);
                    } else if (b13 == 5) {
                        mm.c g16 = obj2.g(new gf2.c());
                        Intrinsics.f(g16);
                        l0Var = new pd2.a0(f0.h.t((gf2.c) g16));
                    } else if (b13 == 4) {
                        mm.c g17 = obj2.g(new gf2.t());
                        Intrinsics.f(g17);
                        gf2.t value4 = (gf2.t) g17;
                        Intrinsics.checkNotNullParameter(value4, "value");
                        int b38 = value4.b(4);
                        float f13 = b38 != 0 ? value4.f87567b.getFloat(b38 + value4.f87566a) : 0.0f;
                        int b39 = value4.b(6);
                        l0Var = new o0(new PointF(f13, b39 != 0 ? value4.f87567b.getFloat(b39 + value4.f87566a) : 0.0f));
                    } else {
                        if (b13 != 7) {
                            StringBuilder sb3 = new StringBuilder("Unknown param value type in flat table `");
                            int b43 = obj2.b(4);
                            if (b43 != 0) {
                                b14 = obj2.f87567b.get(b43 + obj2.f87566a);
                                xk2.x xVar3 = xk2.y.f135237b;
                            } else {
                                b14 = 0;
                            }
                            sb3.append((Object) xk2.y.a(b14));
                            sb3.append('`');
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        mm.c g18 = obj2.g(new gf2.o());
                        Intrinsics.f(g18);
                        l0Var = new l0(f0.h.g0((gf2.o) g18));
                    }
                    linkedHashMap2.put(d2, l0Var);
                }
                q0 q0Var = new q0(linkedHashMap);
                q0Var.c(linkedHashMap2);
                return q0Var;
            }
            int b44 = it.b();
            gf2.y obj3 = new gf2.y();
            Intrinsics.checkNotNullParameter(obj3, "obj");
            int b45 = flatSpec.b(i13);
            if (b45 == 0) {
                throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b44, ", vector entries is empty"));
            }
            int a19 = flatSpec.a((b44 * 4) + flatSpec.e(b45));
            ByteBuffer _bb5 = flatSpec.f87567b;
            Intrinsics.checkNotNullExpressionValue(_bb5, "bb");
            Intrinsics.checkNotNullParameter(_bb5, "_bb");
            Intrinsics.checkNotNullParameter(_bb5, "_bb");
            obj3.c(a19, _bb5);
            int b46 = obj3.b(i13);
            if (b46 == 0) {
                throw new AssertionError("No value for (required) field name");
            }
            String d13 = obj3.d(b46 + obj3.f87566a);
            r obj4 = new r();
            Intrinsics.checkNotNullParameter(obj4, "obj");
            int b47 = obj3.b(6);
            if (b47 == 0) {
                throw new AssertionError("No value for (required) field param");
            }
            int a23 = obj3.a(b47 + obj3.f87566a);
            ByteBuffer _bb6 = obj3.f87567b;
            Intrinsics.checkNotNullExpressionValue(_bb6, "bb");
            Intrinsics.checkNotNullParameter(_bb6, "_bb");
            Intrinsics.checkNotNullParameter(_bb6, "_bb");
            obj4.c(a23, _bb6);
            Intrinsics.checkNotNullParameter(obj4, str);
            int b48 = obj4.b(i13);
            if (b48 != 0) {
                b15 = obj4.f87567b.get(b48 + obj4.f87566a);
                xk2.x xVar4 = xk2.y.f135237b;
            } else {
                b15 = 0;
            }
            gf2.x xVar5 = flatSpec;
            String str2 = str;
            if (b15 == 1) {
                mm.c g19 = obj4.g(new gf2.h());
                Intrinsics.f(g19);
                gf2.h hVar = (gf2.h) g19;
                gf2.i value5 = new gf2.i();
                Intrinsics.checkNotNullParameter(value5, "obj");
                int b49 = hVar.b(4);
                if (b49 == 0) {
                    throw new AssertionError("No value for (required) field defaultValue");
                }
                int a24 = hVar.a(b49 + hVar.f87566a);
                ByteBuffer _bb7 = hVar.f87567b;
                Intrinsics.checkNotNullExpressionValue(_bb7, "bb");
                Intrinsics.checkNotNullParameter(_bb7, "_bb");
                Intrinsics.checkNotNullParameter(_bb7, "_bb");
                value5.c(a24, _bb7);
                Intrinsics.checkNotNullParameter(value5, "value");
                int b53 = value5.b(4);
                float f14 = b53 != 0 ? value5.f87567b.getFloat(b53 + value5.f87566a) : 0.0f;
                gf2.f obj5 = new gf2.f();
                Intrinsics.checkNotNullParameter(obj5, "obj");
                int b54 = hVar.b(6);
                if (b54 != 0) {
                    int a25 = hVar.a(b54 + hVar.f87566a);
                    ByteBuffer _bb8 = hVar.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb8, "bb");
                    Intrinsics.checkNotNullParameter(_bb8, "_bb");
                    Intrinsics.checkNotNullParameter(_bb8, "_bb");
                    obj5.c(a25, _bb8);
                } else {
                    obj5 = null;
                }
                if (obj5 != null) {
                    int b55 = obj5.b(4);
                    if (b55 != 0) {
                        kVar = it;
                        b18 = obj5.f87567b.get(b55 + obj5.f87566a);
                        xk2.x xVar6 = xk2.y.f135237b;
                    } else {
                        kVar = it;
                        b18 = 0;
                    }
                    if (b18 == 1) {
                        gf2.e obj6 = new gf2.e();
                        Intrinsics.checkNotNullParameter(obj6, "obj");
                        int b56 = obj5.b(6);
                        if (b56 != 0) {
                            int i14 = b56 + obj5.f87566a;
                            ByteBuffer byteBuffer = obj5.f87567b;
                            obj6.c(byteBuffer.getInt(i14) + i14, byteBuffer);
                        } else {
                            obj6 = null;
                        }
                        Intrinsics.f(obj6);
                        ef2.b value6 = new ef2.b();
                        Intrinsics.checkNotNullParameter(value6, "obj");
                        int b57 = obj6.b(4);
                        if (b57 == 0) {
                            throw new AssertionError("No value for (required) field range");
                        }
                        int a26 = obj6.a(b57 + obj6.f87566a);
                        ByteBuffer _bb9 = obj6.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb9, "bb");
                        Intrinsics.checkNotNullParameter(_bb9, "_bb");
                        Intrinsics.checkNotNullParameter(_bb9, "_bb");
                        value6.c(a26, _bb9);
                        Intrinsics.checkNotNullParameter(value6, "value");
                        int b58 = value6.b(4);
                        float f15 = b58 != 0 ? value6.f87567b.getFloat(b58 + value6.f87566a) : 0.0f;
                        int b59 = value6.b(6);
                        float f16 = b59 != 0 ? value6.f87567b.getFloat(b59 + value6.f87566a) : 0.0f;
                        Intrinsics.checkNotNullParameter(new ql2.g(f15, f16), "range");
                        lVar2 = new qd2.f(Float.valueOf(f15).floatValue(), Float.valueOf(f16).floatValue());
                    } else {
                        if (b18 != 2) {
                            StringBuilder sb4 = new StringBuilder("Unknown float limits type in flat table `");
                            int b63 = obj5.b(4);
                            if (b63 != 0) {
                                b19 = obj5.f87567b.get(b63 + obj5.f87566a);
                                xk2.x xVar7 = xk2.y.f135237b;
                            } else {
                                b19 = 0;
                            }
                            sb4.append((Object) xk2.y.a(b19));
                            sb4.append('`');
                            throw new IllegalArgumentException(sb4.toString());
                        }
                        gf2.g obj7 = new gf2.g();
                        Intrinsics.checkNotNullParameter(obj7, "obj");
                        int b64 = obj5.b(6);
                        if (b64 != 0) {
                            int i15 = b64 + obj5.f87566a;
                            ByteBuffer byteBuffer2 = obj5.f87567b;
                            obj7.c(byteBuffer2.getInt(i15) + i15, byteBuffer2);
                            gVar = obj7;
                        } else {
                            gVar = null;
                        }
                        Intrinsics.f(gVar);
                        int b65 = gVar.b(4);
                        IntRange q15 = s.q(0, b65 != 0 ? gVar.f(b65) : 0);
                        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(q15, 10));
                        ql2.k it3 = q15.iterator();
                        while (it3.f104109c) {
                            int b66 = it3.b();
                            int b67 = gVar.b(4);
                            if (b67 == 0) {
                                throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b66, ", vector options is empty"));
                            }
                            arrayList.add(Float.valueOf(gVar.f87567b.getFloat((b66 * 4) + gVar.e(b67))));
                        }
                        lVar2 = new qd2.k(arrayList);
                    }
                } else {
                    kVar = it;
                    lVar2 = null;
                }
                qVar = new pd2.k(f14, lVar2);
            } else {
                kVar = it;
                if (b15 == 2) {
                    mm.c g23 = obj4.g(new gf2.m());
                    Intrinsics.f(g23);
                    gf2.m mVar = (gf2.m) g23;
                    gf2.n value7 = new gf2.n();
                    Intrinsics.checkNotNullParameter(value7, "obj");
                    int b68 = mVar.b(4);
                    if (b68 == 0) {
                        throw new AssertionError("No value for (required) field defaultValue");
                    }
                    int a27 = mVar.a(b68 + mVar.f87566a);
                    ByteBuffer _bb10 = mVar.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb10, "bb");
                    Intrinsics.checkNotNullParameter(_bb10, "_bb");
                    Intrinsics.checkNotNullParameter(_bb10, "_bb");
                    value7.c(a27, _bb10);
                    Intrinsics.checkNotNullParameter(value7, "value");
                    int b69 = value7.b(4);
                    int i16 = b69 != 0 ? value7.f87567b.getInt(b69 + value7.f87566a) : 0;
                    gf2.k obj8 = new gf2.k();
                    Intrinsics.checkNotNullParameter(obj8, "obj");
                    int b73 = mVar.b(6);
                    if (b73 != 0) {
                        int a28 = mVar.a(b73 + mVar.f87566a);
                        ByteBuffer _bb11 = mVar.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb11, "bb");
                        Intrinsics.checkNotNullParameter(_bb11, "_bb");
                        Intrinsics.checkNotNullParameter(_bb11, "_bb");
                        obj8.c(a28, _bb11);
                    } else {
                        obj8 = null;
                    }
                    if (obj8 != null) {
                        int b74 = obj8.b(4);
                        if (b74 != 0) {
                            b17 = obj8.f87567b.get(b74 + obj8.f87566a);
                            xk2.x xVar8 = xk2.y.f135237b;
                        } else {
                            b17 = 0;
                        }
                        if (b17 == 1) {
                            gf2.j obj9 = new gf2.j();
                            Intrinsics.checkNotNullParameter(obj9, "obj");
                            int b75 = obj8.b(6);
                            if (b75 != 0) {
                                int i17 = b75 + obj8.f87566a;
                                ByteBuffer byteBuffer3 = obj8.f87567b;
                                obj9.c(byteBuffer3.getInt(i17) + i17, byteBuffer3);
                            } else {
                                obj9 = null;
                            }
                            Intrinsics.f(obj9);
                            ef2.b value8 = new ef2.b();
                            Intrinsics.checkNotNullParameter(value8, "obj");
                            int b76 = obj9.b(4);
                            if (b76 == 0) {
                                throw new AssertionError("No value for (required) field range");
                            }
                            int a29 = obj9.a(b76 + obj9.f87566a);
                            ByteBuffer _bb12 = obj9.f87567b;
                            Intrinsics.checkNotNullExpressionValue(_bb12, "bb");
                            Intrinsics.checkNotNullParameter(_bb12, "_bb");
                            Intrinsics.checkNotNullParameter(_bb12, "_bb");
                            value8.c(a29, _bb12);
                            Intrinsics.checkNotNullParameter(value8, "value");
                            int b77 = value8.b(4);
                            int i18 = b77 != 0 ? value8.f87567b.getInt(b77 + value8.f87566a) : 0;
                            int b78 = value8.b(6);
                            IntRange range = new IntRange(i18, b78 != 0 ? value8.f87567b.getInt(b78 + value8.f87566a) : 0, 1);
                            Intrinsics.checkNotNullParameter(range, "range");
                            uVar = new qd2.o(i18, range.f80454b);
                        } else {
                            if (b17 != 2) {
                                throw new IllegalArgumentException("Unknown int limits type in flat table `" + obj8 + '`');
                            }
                            l obj10 = new l();
                            Intrinsics.checkNotNullParameter(obj10, "obj");
                            int b79 = obj8.b(6);
                            if (b79 != 0) {
                                int i19 = b79 + obj8.f87566a;
                                ByteBuffer byteBuffer4 = obj8.f87567b;
                                obj10.c(byteBuffer4.getInt(i19) + i19, byteBuffer4);
                                lVar = obj10;
                            } else {
                                lVar = null;
                            }
                            Intrinsics.f(lVar);
                            int b83 = lVar.b(4);
                            IntRange q16 = s.q(0, b83 != 0 ? lVar.f(b83) : 0);
                            ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(q16, 10));
                            ql2.k it4 = q16.iterator();
                            while (it4.f104109c) {
                                int b84 = it4.b();
                                int b85 = lVar.b(4);
                                if (b85 == 0) {
                                    throw new IndexOutOfBoundsException(a.a.e("Index out of range: ", b84, ", vector options is empty"));
                                }
                                arrayList2.add(Integer.valueOf(lVar.f87567b.getInt((b84 * 4) + lVar.e(b85))));
                            }
                            uVar = new qd2.t(arrayList2);
                        }
                    } else {
                        uVar = null;
                    }
                    qVar = new pd2.n(i16, uVar);
                } else if (b15 == 4) {
                    mm.c g24 = obj4.g(new gf2.a());
                    Intrinsics.f(g24);
                    gf2.a aVar = (gf2.a) g24;
                    gf2.b value9 = new gf2.b();
                    Intrinsics.checkNotNullParameter(value9, "obj");
                    int b86 = aVar.b(4);
                    if (b86 == 0) {
                        throw new AssertionError("No value for (required) field defaultValue");
                    }
                    int a33 = aVar.a(b86 + aVar.f87566a);
                    ByteBuffer _bb13 = aVar.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb13, "bb");
                    Intrinsics.checkNotNullParameter(_bb13, "_bb");
                    Intrinsics.checkNotNullParameter(_bb13, "_bb");
                    value9.c(a33, _bb13);
                    Intrinsics.checkNotNullParameter(value9, "value");
                    int b87 = value9.b(4);
                    qVar = new pd2.c((b87 == 0 || value9.f87567b.get(b87 + value9.f87566a) == 0) ? false : true);
                } else if (b15 == 6) {
                    mm.c g25 = obj4.g(new gf2.d());
                    Intrinsics.f(g25);
                    gf2.d dVar = (gf2.d) g25;
                    gf2.c obj11 = new gf2.c();
                    Intrinsics.checkNotNullParameter(obj11, "obj");
                    int b88 = dVar.b(4);
                    if (b88 == 0) {
                        throw new AssertionError("No value for (required) field defaultValue");
                    }
                    int a34 = dVar.a(b88 + dVar.f87566a);
                    ByteBuffer _bb14 = dVar.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb14, "bb");
                    Intrinsics.checkNotNullParameter(_bb14, "_bb");
                    Intrinsics.checkNotNullParameter(_bb14, "_bb");
                    obj11.c(a34, _bb14);
                    qVar = new pd2.f(f0.h.t(obj11));
                } else if (b15 == 3) {
                    mm.c g26 = obj4.g(new gf2.v());
                    Intrinsics.f(g26);
                    gf2.v vVar = (gf2.v) g26;
                    gf2.t value10 = new gf2.t();
                    Intrinsics.checkNotNullParameter(value10, "obj");
                    int b89 = vVar.b(4);
                    if (b89 == 0) {
                        throw new AssertionError("No value for (required) field defaultValue");
                    }
                    int a35 = vVar.a(b89 + vVar.f87566a);
                    ByteBuffer _bb15 = vVar.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb15, "bb");
                    Intrinsics.checkNotNullParameter(_bb15, "_bb");
                    Intrinsics.checkNotNullParameter(_bb15, "_bb");
                    value10.c(a35, _bb15);
                    Intrinsics.checkNotNullParameter(value10, "value");
                    int b93 = value10.b(4);
                    float f17 = b93 != 0 ? value10.f87567b.getFloat(b93 + value10.f87566a) : 0.0f;
                    int b94 = value10.b(6);
                    PointF pointF = new PointF(f17, b94 != 0 ? value10.f87567b.getFloat(b94 + value10.f87566a) : 0.0f);
                    gf2.u obj12 = new gf2.u();
                    Intrinsics.checkNotNullParameter(obj12, "obj");
                    int b95 = vVar.b(6);
                    if (b95 != 0) {
                        int a36 = vVar.a(b95 + vVar.f87566a);
                        ByteBuffer _bb16 = vVar.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb16, "bb");
                        Intrinsics.checkNotNullParameter(_bb16, "_bb");
                        Intrinsics.checkNotNullParameter(_bb16, "_bb");
                        obj12.c(a36, _bb16);
                    } else {
                        obj12 = null;
                    }
                    if (obj12 != null) {
                        ef2.b value11 = new ef2.b();
                        Intrinsics.checkNotNullParameter(value11, "obj");
                        int b96 = obj12.b(4);
                        if (b96 == 0) {
                            throw new AssertionError("No value for (required) field rect");
                        }
                        int a37 = obj12.a(b96 + obj12.f87566a);
                        ByteBuffer _bb17 = obj12.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb17, "bb");
                        Intrinsics.checkNotNullParameter(_bb17, "_bb");
                        Intrinsics.checkNotNullParameter(_bb17, "_bb");
                        value11.c(a37, _bb17);
                        Intrinsics.checkNotNullParameter(value11, "value");
                        float g27 = value11.g();
                        float h10 = value11.h();
                        float g28 = value11.g();
                        int b97 = value11.b(8);
                        float f18 = g28 + (b97 != 0 ? value11.f87567b.getFloat(b97 + value11.f87566a) : 0.0f);
                        float h13 = value11.h();
                        int b98 = value11.b(10);
                        a0Var = new qd2.a0(new RectF(g27, h10, f18, h13 + (b98 != 0 ? value11.f87567b.getFloat(b98 + value11.f87566a) : 0.0f)));
                    } else {
                        a0Var = null;
                    }
                    qVar = new pd2.t(pointF, a0Var);
                } else {
                    if (b15 != 5) {
                        StringBuilder sb5 = new StringBuilder("Unknown param spec type in flat table `");
                        int b99 = obj4.b(4);
                        if (b99 != 0) {
                            b16 = obj4.f87567b.get(b99 + obj4.f87566a);
                            xk2.x xVar9 = xk2.y.f135237b;
                        } else {
                            b16 = 0;
                        }
                        sb5.append((Object) xk2.y.a(b16));
                        sb5.append('`');
                        throw new IllegalArgumentException(sb5.toString());
                    }
                    mm.c g29 = obj4.g(new gf2.q());
                    Intrinsics.f(g29);
                    gf2.q qVar2 = (gf2.q) g29;
                    gf2.o obj13 = new gf2.o();
                    Intrinsics.checkNotNullParameter(obj13, "obj");
                    int b100 = qVar2.b(4);
                    if (b100 == 0) {
                        throw new AssertionError("No value for (required) field defaultValue");
                    }
                    int a38 = qVar2.a(b100 + qVar2.f87566a);
                    ByteBuffer _bb18 = qVar2.f87567b;
                    Intrinsics.checkNotNullExpressionValue(_bb18, "bb");
                    Intrinsics.checkNotNullParameter(_bb18, "_bb");
                    Intrinsics.checkNotNullParameter(_bb18, "_bb");
                    obj13.c(a38, _bb18);
                    hd2.f g03 = f0.h.g0(obj13);
                    gf2.p obj14 = new gf2.p();
                    Intrinsics.checkNotNullParameter(obj14, "obj");
                    int b101 = qVar2.b(6);
                    if (b101 != 0) {
                        int a39 = qVar2.a(b101 + qVar2.f87566a);
                        ByteBuffer _bb19 = qVar2.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb19, "bb");
                        Intrinsics.checkNotNullParameter(_bb19, "_bb");
                        Intrinsics.checkNotNullParameter(_bb19, "_bb");
                        obj14.c(a39, _bb19);
                    } else {
                        obj14 = null;
                    }
                    if (obj14 != null) {
                        ef2.b value12 = new ef2.b();
                        Intrinsics.checkNotNullParameter(value12, "obj");
                        int b102 = obj14.b(4);
                        if (b102 == 0) {
                            throw new AssertionError("No value for (required) field rect");
                        }
                        int a43 = obj14.a(b102 + obj14.f87566a);
                        ByteBuffer _bb20 = obj14.f87567b;
                        Intrinsics.checkNotNullExpressionValue(_bb20, "bb");
                        Intrinsics.checkNotNullParameter(_bb20, "_bb");
                        Intrinsics.checkNotNullParameter(_bb20, "_bb");
                        value12.c(a43, _bb20);
                        Intrinsics.checkNotNullParameter(value12, "value");
                        float g33 = value12.g();
                        float h14 = value12.h();
                        float g34 = value12.g();
                        int b103 = value12.b(8);
                        float f19 = g34 + (b103 != 0 ? value12.f87567b.getFloat(b103 + value12.f87566a) : 0.0f);
                        float h15 = value12.h();
                        int b104 = value12.b(10);
                        xVar = new qd2.x(new RectF(g33, h14, f19, h15 + (b104 != 0 ? value12.f87567b.getFloat(b104 + value12.f87566a) : 0.0f)));
                    } else {
                        xVar = null;
                    }
                    qVar = new pd2.q(g03, xVar);
                }
            }
            linkedHashMap.put(d13, qVar);
            flatSpec = xVar5;
            str = str2;
            it = kVar;
            i13 = 4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(om1.c r12, u2.q r13, gm1.a r14, i2.o r15, int r16, int r17) {
        /*
            r5 = r12
            java.lang.String r0 = "state"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            r0 = r15
            i2.s r0 = (i2.s) r0
            r1 = -1987864085(0xffffffff898399eb, float:-3.1681847E-33)
            r0.Y(r1)
            r1 = r17 & 1
            r2 = 4
            if (r1 == 0) goto L17
            r1 = r16 | 6
            goto L29
        L17:
            r1 = r16 & 14
            if (r1 != 0) goto L27
            boolean r1 = r0.h(r12)
            if (r1 == 0) goto L23
            r1 = r2
            goto L24
        L23:
            r1 = 2
        L24:
            r1 = r16 | r1
            goto L29
        L27:
            r1 = r16
        L29:
            r3 = r17 & 2
            if (r3 == 0) goto L31
            r1 = r1 | 48
        L2f:
            r4 = r13
            goto L42
        L31:
            r4 = r16 & 112(0x70, float:1.57E-43)
            if (r4 != 0) goto L2f
            r4 = r13
            boolean r6 = r0.h(r13)
            if (r6 == 0) goto L3f
            r6 = 32
            goto L41
        L3f:
            r6 = 16
        L41:
            r1 = r1 | r6
        L42:
            r6 = r17 & 4
            if (r6 == 0) goto L48
            r1 = r1 | 128(0x80, float:1.8E-43)
        L48:
            if (r6 != r2) goto L5c
            r2 = r1 & 731(0x2db, float:1.024E-42)
            r7 = 146(0x92, float:2.05E-43)
            if (r2 != r7) goto L5c
            boolean r2 = r0.z()
            if (r2 != 0) goto L57
            goto L5c
        L57:
            r0.Q()
            r6 = r14
            goto L89
        L5c:
            if (r3 == 0) goto L61
            u2.n r2 = u2.n.f120041b
            goto L62
        L61:
            r2 = r4
        L62:
            if (r6 == 0) goto L66
            r3 = 0
            goto L67
        L66:
            r3 = r14
        L67:
            i2.w3 r4 = fc0.k.f61712a
            java.lang.Object r4 = r0.m(r4)
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            rq.a0 r6 = new rq.a0
            r7 = 20
            r6.<init>(r4, r12, r3, r7)
            com.pinterest.framework.screens.q r8 = new com.pinterest.framework.screens.q
            r8.<init>(r7, r12, r3)
            r10 = r1 & 112(0x70, float:1.57E-43)
            r11 = 0
            r7 = r2
            r9 = r0
            androidx.compose.ui.viewinterop.a.a(r6, r7, r8, r9, r10, r11)
            r4 = r2
            r6 = r3
        L89:
            i2.f2 r7 = r0.t()
            if (r7 == 0) goto L9e
            k31.h r8 = new k31.h
            r3 = 14
            r0 = r8
            r1 = r16
            r2 = r17
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f71113d = r8
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.b.c(om1.c, u2.q, gm1.a, i2.o, int, int):void");
    }

    public static final float c0(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[2];
    }

    public static final boolean c1(lh0.o0 experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        z3 z3Var = a4.f83298b;
        return experiments.b("enabled_2", z3Var) || experiments.b("enabled_6", z3Var);
    }

    public static int d(int i13, int i14) {
        int r13 = r(i13);
        int r14 = r(i14);
        if (r13 != 1) {
            if (r13 != 2) {
                throw new IllegalArgumentException(kh2.n.j(r13, "Unknown digestAlgorithm1: "));
            }
            if (r14 == 1) {
                return 1;
            }
            if (r14 != 2) {
                throw new IllegalArgumentException(kh2.n.j(r14, "Unknown digestAlgorithm2: "));
            }
        } else if (r14 != 1) {
            if (r14 == 2) {
                return -1;
            }
            throw new IllegalArgumentException(kh2.n.j(r14, "Unknown digestAlgorithm2: "));
        }
        return 0;
    }

    public static final float d0(Matrix matrix) {
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return fArr[5];
    }

    public static final boolean d1(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        boolean z13 = (!b40.P0(f30Var) || b40.n0(f30Var) || b40.F0(f30Var)) ? false : true;
        if (j1.U0(f30Var.z4())) {
            return ((b40.Q0(f30Var) && !z13) || b40.D0(f30Var) || f30Var.M6() != null || f30Var.d5().booleanValue() || b40.O0(f30Var) || b40.W0(f30Var)) ? false : true;
        }
        return false;
    }

    public static we2 e(nm.u json) {
        Intrinsics.checkNotNullParameter(json, "json");
        try {
            Intrinsics.checkNotNullParameter(json, "<this>");
            Intrinsics.checkNotNullParameter("name", "key");
            String p13 = json.v("name").p();
            Intrinsics.checkNotNullExpressionValue(p13, "getAsString(...)");
            nm.s v13 = json.v("info");
            return new we2(v13 != null ? v13.i() : null, p13);
        } catch (Exception e13) {
            List list = c0.d.f(e13, e13).f6994p;
            String message = e13.getMessage();
            if (message == null) {
                message = e13.getClass().getName();
            }
            list.add(message);
            return null;
        }
    }

    public static final ArrayList e0(vn0 ideaPinMediaList) {
        Intrinsics.checkNotNullParameter(ideaPinMediaList, "ideaPinMediaList");
        List items = ideaPinMediaList.getItems();
        int startMediaIndex = ideaPinMediaList.getStartMediaIndex();
        long startTimeMs = ideaPinMediaList.getStartTimeMs();
        int endMediaIndex = ideaPinMediaList.getEndMediaIndex();
        long endTimeMs = ideaPinMediaList.getEndTimeMs();
        IntRange intRange = new IntRange(startMediaIndex, endMediaIndex, 1);
        ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(intRange, 10));
        Iterator it = intRange.iterator();
        while (((ql2.k) it).f104109c) {
            int b13 = ((kotlin.collections.u0) it).b();
            bo0 bo0Var = (bo0) items.get(b13);
            arrayList.add(bo0.a(bo0Var, null, b13 == startMediaIndex ? bo0Var.getStartTimeMs() + startTimeMs : bo0Var.getStartTimeMs(), b13 == endMediaIndex ? bo0Var.getStartTimeMs() + endTimeMs : bo0Var.getEndTimeMs(), null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_BRAND_MULTI_IMAGE_REP_ITEM));
        }
        return arrayList;
    }

    public static final boolean e1(Activity activity) {
        return activity != null && hf0.b.q() && hf0.b.m() && !activity.isInMultiWindowMode();
    }

    public static String f(int i13) {
        if (i13 == 1) {
            return "SHA-256";
        }
        if (i13 == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(kh2.n.j(i13, "Unknown content digest algorthm: "));
    }

    public static final Matrix f0(float f13, float f14, int i13, int i14) {
        float f15 = i13;
        float f16 = i14;
        float max = Math.max(f13 / f15, f14 / f16);
        Matrix matrix = new Matrix();
        matrix.postScale(max, max);
        matrix.postTranslate(cb.a(f15, max, f13, 2.0f), cb.a(f16, max, f14, 2.0f));
        return matrix;
    }

    public static final float f1(float f13, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return j1.E((375 / (i0(0.5625f, context).width() / context.getResources().getDisplayMetrics().density)) * f13, context);
    }

    public static ByteBuffer g(int i13, ByteBuffer byteBuffer) {
        if (i13 < 0) {
            throw new IllegalArgumentException(kh2.n.j(i13, "size: "));
        }
        int limit = byteBuffer.limit();
        int position = byteBuffer.position();
        int i14 = i13 + position;
        if (i14 < position || i14 > limit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i14);
        try {
            ByteBuffer slice = byteBuffer.slice();
            slice.order(byteBuffer.order());
            byteBuffer.position(i14);
            return slice;
        } finally {
            byteBuffer.limit(limit);
        }
    }

    public static final List g0(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<this>");
        return CollectionsKt.F0(g1(viewPager2).f67656q.values());
    }

    public static final h42.j g1(ViewPager2 viewPager2) {
        b2 b2Var = viewPager2.f19930j.f19240m;
        if (!(b2Var instanceof h42.j)) {
            throw new IllegalStateException("Did you forget to call makeItStateBased() on your ViewPager2?");
        }
        Intrinsics.g(b2Var, "null cannot be cast to non-null type com.pinterest.screenpager.StateBasedScreenPagerAdapter");
        return (h42.j) b2Var;
    }

    public static ByteBuffer h(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < 4) {
            throw new IOException("Remaining buffer too short to contain length of length-prefixed field. Remaining: " + byteBuffer.remaining());
        }
        int i13 = byteBuffer.getInt();
        if (i13 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (i13 <= byteBuffer.remaining()) {
            return g(i13, byteBuffer);
        }
        StringBuilder s13 = a.a.s("Length-prefixed field longer than remaining buffer. Field length: ", i13, ", remaining: ");
        s13.append(byteBuffer.remaining());
        throw new IOException(s13.toString());
    }

    public static final boolean h0() {
        return ((lb0.b) lb0.n.a()).e("PREF_SOUND_SETTING", true);
    }

    public static final String h1(String str, boolean z13) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return (z13 ? "emb.private." : "emb.").concat(str);
    }

    public static void i(byte[] bArr, int i13) {
        bArr[1] = (byte) (i13 & 255);
        bArr[2] = (byte) ((i13 >>> 8) & 255);
        bArr[3] = (byte) ((i13 >>> 16) & 255);
        bArr[4] = (byte) ((i13 >>> 24) & 255);
    }

    public static final RectF i0(float f13, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int V = bs1.c.V(context, r0.story_pin_bottom_toolbar_height);
        int V2 = bs1.c.V(context, r0.idea_pin_navigation_bar_height);
        int c13 = ml2.c.c(hf0.b.f69002b);
        float c14 = (ml2.c.c(hf0.b.f69003c - hf0.b.f()) - V) - V2;
        float f14 = c14 * f13;
        float f15 = c13;
        if (f14 <= f15) {
            float f16 = V2;
            float f17 = (f15 - f14) / 2;
            return new RectF(f17, f16, f14 + f17, c14 + f16);
        }
        float f18 = f15 / f13;
        float f19 = ((c14 - f18) / 2) + V2;
        return new RectF(0.0f, f19, f15, f18 + f19);
    }

    public static final FilteroptionParcelable i1(xl xlVar) {
        Intrinsics.checkNotNullParameter(xlVar, "<this>");
        String n13 = xlVar.n();
        Intrinsics.checkNotNullExpressionValue(n13, "getUid(...)");
        String l13 = xlVar.l();
        k00 h10 = xlVar.h();
        OnebarmoduleactionParcelable k13 = h10 != null ? k1(h10) : null;
        Boolean i13 = xlVar.i();
        o00 j13 = xlVar.j();
        return new FilteroptionParcelable(n13, l13, k13, i13, j13 != null ? l1(j13) : null, xlVar.k(), xlVar.m());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (d(r11, r7) <= 0) goto L292;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.security.cert.X509Certificate[] j(java.nio.ByteBuffer r18, java.util.HashMap r19, java.security.cert.CertificateFactory r20) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ig1.b.j(java.nio.ByteBuffer, java.util.HashMap, java.security.cert.CertificateFactory):java.security.cert.X509Certificate[]");
    }

    public static final long j0(List list) {
        long j13 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                j13 += ((bo0) it.next()).f36143i;
            }
        }
        return j13;
    }

    public static final OnebarmoduleParcelable j1(g00 g00Var) {
        Intrinsics.checkNotNullParameter(g00Var, "<this>");
        String uid = g00Var.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        String o13 = g00Var.o();
        k00 q13 = g00Var.q();
        OnebarmoduleactionParcelable k13 = q13 != null ? k1(q13) : null;
        Integer s13 = g00Var.s();
        Map u13 = g00Var.u();
        o00 v13 = g00Var.v();
        return new OnebarmoduleParcelable(uid, o13, k13, s13, u13, v13 != null ? l1(v13) : null, g00Var.w(), g00Var.x(), g00Var.y());
    }

    public static byte[][] k(int[] iArr, cg[] cgVarArr) {
        long j13;
        String str;
        int i13;
        int i14;
        cg[] cgVarArr2 = cgVarArr;
        int length = cgVarArr2.length;
        long j14 = 0;
        int i15 = 0;
        long j15 = 0;
        int i16 = 0;
        while (true) {
            j13 = 1048576;
            if (i16 >= length) {
                break;
            }
            j15 += (cgVarArr2[i16].size() + 1048575) / 1048576;
            i16++;
        }
        if (j15 >= 2097151) {
            throw new DigestException(a.a.g("Too many chunks: ", j15));
        }
        int i17 = (int) j15;
        byte[][] bArr = new byte[iArr.length][];
        for (int i18 = 0; i18 < iArr.length; i18++) {
            int i19 = iArr[i18];
            if (i19 == 1) {
                i14 = 32;
            } else {
                if (i19 != 2) {
                    throw new IllegalArgumentException(kh2.n.j(i19, "Unknown content digest algorthm: "));
                }
                i14 = 64;
            }
            byte[] bArr2 = new byte[(i14 * i17) + 5];
            bArr2[0] = 90;
            i(bArr2, i17);
            bArr[i18] = bArr2;
        }
        byte[] bArr3 = new byte[5];
        bArr3[0] = -91;
        int length2 = iArr.length;
        MessageDigest[] messageDigestArr = new MessageDigest[length2];
        while (true) {
            str = " digest not supported";
            if (i15 >= iArr.length) {
                break;
            }
            String f13 = f(iArr[i15]);
            try {
                messageDigestArr[i15] = MessageDigest.getInstance(f13);
                i15++;
            } catch (NoSuchAlgorithmException e13) {
                throw new RuntimeException(f13.concat(" digest not supported"), e13);
            }
        }
        int length3 = cgVarArr2.length;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i23 < length3) {
            cg cgVar = cgVarArr2[i23];
            long j16 = j14;
            int i26 = i24;
            String str2 = str;
            long size = cgVar.size();
            while (size > j14) {
                int min = (int) Math.min(size, j13);
                i(bArr3, min);
                for (int i27 = 0; i27 < length2; i27++) {
                    messageDigestArr[i27].update(bArr3);
                }
                long j17 = j16;
                try {
                    cgVar.a(messageDigestArr, j17, min);
                    int i28 = 0;
                    while (i28 < iArr.length) {
                        int i29 = iArr[i28];
                        byte[] bArr4 = bArr3;
                        byte[] bArr5 = bArr[i28];
                        int i33 = length3;
                        if (i29 == 1) {
                            i13 = 32;
                        } else {
                            if (i29 != 2) {
                                throw new IllegalArgumentException(kh2.n.j(i29, "Unknown content digest algorthm: "));
                            }
                            i13 = 64;
                        }
                        MessageDigest messageDigest = messageDigestArr[i28];
                        int i34 = length2;
                        int i35 = i26;
                        MessageDigest[] messageDigestArr2 = messageDigestArr;
                        int digest = messageDigest.digest(bArr5, (i35 * i13) + 5, i13);
                        if (digest != i13) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + digest);
                        }
                        i28++;
                        i26 = i35;
                        bArr3 = bArr4;
                        length3 = i33;
                        length2 = i34;
                        messageDigestArr = messageDigestArr2;
                    }
                    long j18 = min;
                    long j19 = j17 + j18;
                    size -= j18;
                    i26++;
                    bArr3 = bArr3;
                    length2 = length2;
                    j13 = 1048576;
                    j16 = j19;
                    j14 = 0;
                } catch (IOException e14) {
                    throw new DigestException(a.a.f("Failed to digest chunk #", i26, " of section #", i25), e14);
                }
            }
            i25++;
            i23++;
            cgVarArr2 = cgVarArr;
            i24 = i26;
            str = str2;
            length2 = length2;
            j14 = 0;
            j13 = 1048576;
        }
        String str3 = str;
        byte[][] bArr6 = new byte[iArr.length][];
        for (int i36 = 0; i36 < iArr.length; i36++) {
            int i37 = iArr[i36];
            byte[] bArr7 = bArr[i36];
            String f14 = f(i37);
            try {
                bArr6[i36] = MessageDigest.getInstance(f14).digest(bArr7);
            } catch (NoSuchAlgorithmException e15) {
                throw new RuntimeException(f14.concat(str3), e15);
            }
        }
        return bArr6;
    }

    public static final Pair k0(long j13, List mediaList) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        int size = mediaList.size();
        long j14 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            if (((bo0) mediaList.get(i13)).f36143i + j14 >= j13) {
                return new Pair(Integer.valueOf(i13), Long.valueOf(((bo0) mediaList.get(i13)).getStartTimeMs() + (j13 - j14)));
            }
            j14 += ((bo0) mediaList.get(i13)).f36143i;
        }
        return null;
    }

    public static final OnebarmoduleactionParcelable k1(k00 k00Var) {
        AnnotatedTextParcelable annotatedTextParcelable;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(k00Var, "<this>");
        String B = k00Var.B();
        Intrinsics.checkNotNullExpressionValue(B, "getUid(...)");
        String u13 = k00Var.u();
        y5 o13 = k00Var.o();
        ArrayList arrayList2 = null;
        if (o13 != null) {
            Intrinsics.checkNotNullParameter(o13, "<this>");
            String uid = o13.getUid();
            Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
            annotatedTextParcelable = new AnnotatedTextParcelable(uid, o13.o(), o13.j(), o13.h());
        } else {
            annotatedTextParcelable = null;
        }
        List p13 = k00Var.p();
        if (p13 != null) {
            List<g00> list = p13;
            arrayList = new ArrayList(kotlin.collections.g0.q(list, 10));
            for (g00 g00Var : list) {
                Intrinsics.f(g00Var);
                arrayList.add(j1(g00Var));
            }
        } else {
            arrayList = null;
        }
        String q13 = k00Var.q();
        List s13 = k00Var.s();
        List t13 = k00Var.t();
        if (t13 != null) {
            List<xl> list2 = t13;
            arrayList2 = new ArrayList(kotlin.collections.g0.q(list2, 10));
            for (xl xlVar : list2) {
                Intrinsics.f(xlVar);
                arrayList2.add(i1(xlVar));
            }
        }
        return new OnebarmoduleactionParcelable(B, u13, annotatedTextParcelable, arrayList, q13, s13, arrayList2, k00Var.w(), k00Var.x(), k00Var.y(), k00Var.z(), k00Var.A());
    }

    public static X509Certificate[][] l(RandomAccessFile randomAccessFile) {
        android.util.Pair b13;
        if (randomAccessFile.length() < 22) {
            b13 = null;
        } else {
            b13 = jk.r.b(randomAccessFile, 0);
            if (b13 == null) {
                b13 = jk.r.b(randomAccessFile, 65535);
            }
        }
        if (b13 == null) {
            throw new ad("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile.length() + " bytes");
        }
        ByteBuffer byteBuffer = (ByteBuffer) b13.first;
        long longValue = ((Long) b13.second).longValue();
        long j13 = longValue - 20;
        if (j13 >= 0) {
            randomAccessFile.seek(j13);
            if (randomAccessFile.readInt() == 1347094023) {
                throw new ad("ZIP64 APK not supported");
            }
        }
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (order != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        long j14 = byteBuffer.getInt(byteBuffer.position() + 16) & 4294967295L;
        if (j14 >= longValue) {
            StringBuilder u13 = a.a.u("ZIP Central Directory offset out of range: ", j14, ". ZIP End of Central Directory offset: ");
            u13.append(longValue);
            throw new ad(u13.toString());
        }
        if (byteBuffer.order() != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        if ((byteBuffer.getInt(byteBuffer.position() + 12) & 4294967295L) + j14 != longValue) {
            throw new ad("ZIP Central Directory is not immediately followed by End of Central Directory");
        }
        if (j14 < 32) {
            throw new ad(a.a.g("APK too small for APK Signing Block. ZIP Central Directory offset: ", j14));
        }
        ByteBuffer allocate = ByteBuffer.allocate(24);
        allocate.order(byteOrder);
        randomAccessFile.seek(j14 - allocate.capacity());
        randomAccessFile.readFully(allocate.array(), allocate.arrayOffset(), allocate.capacity());
        if (allocate.getLong(8) != 2334950737559900225L || allocate.getLong(16) != 3617552046287187010L) {
            throw new ad("No APK Signing Block before ZIP Central Directory");
        }
        long j15 = allocate.getLong(0);
        if (j15 < allocate.capacity() || j15 > 2147483639) {
            throw new ad(a.a.g("APK Signing Block size out of range: ", j15));
        }
        int i13 = (int) (8 + j15);
        long j16 = j14 - i13;
        if (j16 < 0) {
            throw new ad(a.a.g("APK Signing Block offset out of range: ", j16));
        }
        ByteBuffer allocate2 = ByteBuffer.allocate(i13);
        allocate2.order(byteOrder);
        randomAccessFile.seek(j16);
        randomAccessFile.readFully(allocate2.array(), allocate2.arrayOffset(), allocate2.capacity());
        long j17 = allocate2.getLong(0);
        if (j17 != j15) {
            StringBuilder u14 = a.a.u("APK Signing Block sizes in header and footer do not match: ", j17, " vs ");
            u14.append(j15);
            throw new ad(u14.toString());
        }
        android.util.Pair create = android.util.Pair.create(allocate2, Long.valueOf(j16));
        ByteBuffer byteBuffer2 = (ByteBuffer) create.first;
        long longValue2 = ((Long) create.second).longValue();
        if (byteBuffer2.order() != byteOrder) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
        int capacity = byteBuffer2.capacity() - 24;
        if (capacity < 8) {
            throw new IllegalArgumentException(a.a.e("end < start: ", capacity, " < 8"));
        }
        int capacity2 = byteBuffer2.capacity();
        if (capacity > byteBuffer2.capacity()) {
            throw new IllegalArgumentException(a.a.f("end > capacity: ", capacity, " > ", capacity2));
        }
        int limit = byteBuffer2.limit();
        int position = byteBuffer2.position();
        try {
            byteBuffer2.position(0);
            byteBuffer2.limit(capacity);
            byteBuffer2.position(8);
            ByteBuffer slice = byteBuffer2.slice();
            slice.order(byteBuffer2.order());
            byteBuffer2.position(0);
            byteBuffer2.limit(limit);
            byteBuffer2.position(position);
            int i14 = 0;
            while (slice.hasRemaining()) {
                i14++;
                if (slice.remaining() < 8) {
                    throw new ad(kh2.n.j(i14, "Insufficient data to read size of APK Signing Block entry #"));
                }
                long j18 = slice.getLong();
                if (j18 < 4 || j18 > 2147483647L) {
                    throw new ad("APK Signing Block entry #" + i14 + " size out of range: " + j18);
                }
                int i15 = (int) j18;
                int position2 = slice.position() + i15;
                if (i15 > slice.remaining()) {
                    StringBuilder t13 = a.a.t("APK Signing Block entry #", i14, " size out of range: ", i15, ", available: ");
                    t13.append(slice.remaining());
                    throw new ad(t13.toString());
                }
                if (slice.getInt() == 1896449818) {
                    ByteBuffer g13 = g(i15 - 4, slice);
                    FileChannel channel = randomAccessFile.getChannel();
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    try {
                        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                        try {
                            ByteBuffer h10 = h(g13);
                            int i16 = 0;
                            while (h10.hasRemaining()) {
                                i16++;
                                try {
                                    arrayList.add(j(h(h10), hashMap, certificateFactory));
                                } catch (IOException | SecurityException | BufferUnderflowException e13) {
                                    throw new SecurityException(a.a.e("Failed to parse/verify signer #", i16, " block"), e13);
                                }
                            }
                            if (i16 < 1) {
                                throw new SecurityException("No signers found");
                            }
                            if (hashMap.isEmpty()) {
                                throw new SecurityException("No content digests found");
                            }
                            if (hashMap.isEmpty()) {
                                throw new SecurityException("No digests provided");
                            }
                            zc zcVar = new zc(channel, 0L, longValue2);
                            zc zcVar2 = new zc(channel, j14, longValue - j14);
                            ByteBuffer duplicate = byteBuffer.duplicate();
                            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
                            duplicate.order(byteOrder2);
                            if (duplicate.order() != byteOrder2) {
                                throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                            }
                            int position3 = duplicate.position() + 16;
                            if (longValue2 < 0 || longValue2 > 4294967295L) {
                                throw new IllegalArgumentException(a.a.g("uint32 value of out range: ", longValue2));
                            }
                            duplicate.putInt(duplicate.position() + position3, (int) longValue2);
                            xc xcVar = new xc(duplicate);
                            int size = hashMap.size();
                            int[] iArr = new int[size];
                            Iterator it = hashMap.keySet().iterator();
                            int i17 = 0;
                            while (it.hasNext()) {
                                iArr[i17] = ((Integer) it.next()).intValue();
                                i17++;
                            }
                            try {
                                byte[][] k13 = k(iArr, new cg[]{zcVar, zcVar2, xcVar});
                                for (int i18 = 0; i18 < size; i18++) {
                                    int i19 = iArr[i18];
                                    if (!MessageDigest.isEqual((byte[]) hashMap.get(Integer.valueOf(i19)), k13[i18])) {
                                        throw new SecurityException(f(i19).concat(" digest of contents did not verify"));
                                    }
                                }
                                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
                            } catch (DigestException e14) {
                                throw new SecurityException("Failed to compute digest(s) of contents", e14);
                            }
                        } catch (IOException e15) {
                            throw new SecurityException("Failed to read list of signers", e15);
                        }
                    } catch (CertificateException e16) {
                        throw new RuntimeException("Failed to obtain X.509 CertificateFactory", e16);
                    }
                }
                slice.position(position2);
            }
            throw new ad("No APK Signature Scheme v2 block in APK Signing Block");
        } catch (Throwable th3) {
            byteBuffer2.position(0);
            byteBuffer2.limit(limit);
            byteBuffer2.position(position);
            throw th3;
        }
    }

    public static final Matrix l0(Context context, float f13, int i13, int i14, Matrix matrix, Matrix matrix2, Float f14, Float f15) {
        Pair pair;
        RectF rectF;
        Intrinsics.checkNotNullParameter(context, "context");
        Size k03 = gi2.b.k0(f13);
        int width = k03.getWidth();
        int height = k03.getHeight();
        if (f14 == null || f15 == null) {
            RectF i03 = i0(f13, context);
            pair = new Pair(Float.valueOf(i03.width()), Float.valueOf(i03.height()));
        } else {
            pair = new Pair(f14, f15);
        }
        float floatValue = ((Number) pair.f80346a).floatValue();
        Matrix f03 = matrix2 == null ? f0(floatValue, ((Number) pair.f80347b).floatValue(), i13, i14) : matrix2;
        float a03 = a0(matrix);
        vq p03 = p0(i13, i14, f03, matrix);
        Matrix matrix3 = new Matrix();
        matrix3.postRotate((-1) * a03, p03.a().x, p03.a().y);
        float[] fArr = {p03.getTopLeft().x, p03.getTopLeft().y, p03.getBottomRight().x, p03.getBottomRight().y};
        matrix3.mapPoints(fArr);
        float f16 = width;
        float f17 = f16 / floatValue;
        RectF rectF2 = new RectF(new RectF(new RectF(fArr[0], fArr[1], fArr[2], fArr[3])));
        rectF2.top *= f17;
        rectF2.left *= f17;
        rectF2.right *= f17;
        rectF2.bottom *= f17;
        if (((float) i14) * f13 <= ((float) i13)) {
            int b13 = ml2.c.b(((i14 * 1.0d) * width) / i13);
            rectF = new RectF(0.0f, (height - b13) / 2.0f, f16 * 1.0f, (height + b13) / 2.0f);
        } else {
            int b14 = ml2.c.b(((i13 * 1.0d) * height) / i14);
            rectF = new RectF((width - b14) / 2.0f, 0.0f, (width + b14) / 2.0f, height * 1.0f);
        }
        float width2 = rectF2.width() / rectF.width();
        float f18 = 1 - width2;
        float f19 = 2;
        float width3 = ((rectF.width() * f18) / f19) + rectF.left;
        float height2 = ((rectF.height() * f18) / f19) + rectF.top;
        float f23 = rectF2.left - width3;
        float f24 = rectF2.top - height2;
        Matrix matrix4 = new Matrix();
        matrix4.postRotate(a03);
        matrix4.postScale(width2, width2);
        matrix4.postTranslate(f23, f24);
        return matrix4;
    }

    public static final OnebarmoduledisplayParcelable l1(o00 o00Var) {
        Intrinsics.checkNotNullParameter(o00Var, "<this>");
        String A = o00Var.A();
        Intrinsics.checkNotNullExpressionValue(A, "getUid(...)");
        return new OnebarmoduledisplayParcelable(A, o00Var.w(), o00Var.o(), o00Var.p(), o00Var.r(), o00Var.s(), o00Var.t(), o00Var.u(), o00Var.v(), o00Var.x(), o00Var.y(), o00Var.z(), o00Var.n());
    }

    public static X509Certificate[][] m(String str) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            X509Certificate[][] l13 = l(randomAccessFile);
            randomAccessFile.close();
            return l13;
        } finally {
            try {
                randomAccessFile.close();
            } catch (IOException unused) {
            }
        }
    }

    public static final Matrix m0(Context context, float f13, k01 videoItem, Matrix matrix, Matrix matrix2) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        return l0(context, f13, ((Number) videoItem.f39240c.f135234a).intValue(), ((Number) videoItem.f39240c.f135235b).intValue(), matrix, matrix2, null, null);
    }

    public static final String m1(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return "emb.properties." + str;
    }

    public static final void n(Throwable th3, int i13, i iVar) {
        v.f1 f1Var;
        if (iVar != null) {
            iVar.b(th3);
        }
        if ((th3 instanceof ServerError) && ((ServerError) th3).f45045b) {
            return;
        }
        boolean z13 = th3 instanceof NetworkResponseError;
        if (!z13) {
            Context context = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().b(bs1.c.b2(i13));
            return;
        }
        qz.d dVar = null;
        NetworkResponseError networkResponseError = z13 ? (NetworkResponseError) th3 : null;
        if (networkResponseError != null && (f1Var = networkResponseError.f45043a) != null) {
            dVar = k3.M(f1Var);
        }
        if (dVar != null) {
            String str = dVar.f105384d;
            if (str == null || str.length() == 0) {
                str = bs1.c.b2(w42.c.send_pin_server_error);
            }
            Context context2 = kb0.a.f79058b;
            ((oa) ((j92.a) ep.b.g(j92.a.class))).E2().b(str);
        }
    }

    public static final RectF n0(int i13, int i14, Matrix initialMatrix, Matrix currentMatrix) {
        Intrinsics.checkNotNullParameter(initialMatrix, "initialMatrix");
        Intrinsics.checkNotNullParameter(currentMatrix, "currentMatrix");
        float b03 = b0(initialMatrix);
        float c03 = c0(initialMatrix);
        float d03 = d0(initialMatrix);
        RectF rectF = new RectF(0.0f, 0.0f, i13 * b03, i14 * b03);
        currentMatrix.mapRect(rectF);
        rectF.offset(c03, d03);
        return rectF;
    }

    public static final Size n1(SizeF sizeF) {
        Intrinsics.checkNotNullParameter(sizeF, "<this>");
        return new Size((int) sizeF.getWidth(), (int) sizeF.getHeight());
    }

    public static final void o(i iVar, z40.t tVar, f1 f1Var, SendableObject sendableObject) {
        if (iVar != null) {
            iVar.c(tVar);
        }
        m60.u.f85943a.d(new pg0.h0());
        d0 a13 = sh.f.a();
        Intrinsics.checkNotNullExpressionValue(a13, "get(...)");
        d0.v(a13, f1Var, sendableObject.d(), false, 12);
    }

    public static final RectF o0(Context context, float f13, k01 videoItem, Matrix matrix) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
        int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
        Pair Y = Y(context, f13, intValue, intValue2, matrix);
        return n0(intValue, intValue2, (Matrix) Y.f80346a, (Matrix) Y.f80347b);
    }

    public static final void o1(ContextMenuItemView contextMenuItemView) {
        Intrinsics.checkNotNullParameter(contextMenuItemView, "<this>");
        contextMenuItemView.f52596s = s0.contextual_menu_cleanup_item_unselected_bg;
        contextMenuItemView.n();
        contextMenuItemView.f52595r = s0.contextual_menu_cleanup_item_selected_bg;
        contextMenuItemView.f52598u = eo1.b.color_icon_default;
        contextMenuItemView.n();
        contextMenuItemView.f52597t = eo1.b.color_icon_inverse;
        contextMenuItemView.n();
    }

    public static ArrayList p(Object obj, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(obj)) {
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static final vq p0(int i13, int i14, Matrix initialMatrix, Matrix currentMatrix) {
        Intrinsics.checkNotNullParameter(initialMatrix, "initialMatrix");
        Intrinsics.checkNotNullParameter(currentMatrix, "currentMatrix");
        float b03 = b0(initialMatrix);
        float c03 = c0(initialMatrix);
        float d03 = d0(initialMatrix);
        vq J0 = J0(currentMatrix, new RectF(0.0f, 0.0f, i13 * b03, i14 * b03));
        J0.l(c03, d03);
        return J0;
    }

    public static boolean p1(int i13, d7.d0 d0Var, boolean z13) {
        if (d0Var.a() < 7) {
            if (z13) {
                return false;
            }
            throw ParserException.a("too short header: " + d0Var.a(), null);
        }
        if (d0Var.y() != i13) {
            if (z13) {
                return false;
            }
            throw ParserException.a("expected header type " + Integer.toHexString(i13), null);
        }
        if (d0Var.y() == 118 && d0Var.y() == 111 && d0Var.y() == 114 && d0Var.y() == 98 && d0Var.y() == 105 && d0Var.y() == 115) {
            return true;
        }
        if (z13) {
            return false;
        }
        throw ParserException.a("expected characters 'vorbis'", null);
    }

    public static final vn0 q(List oldItems, ArrayList newItems) {
        Intrinsics.checkNotNullParameter(oldItems, "oldItems");
        Intrinsics.checkNotNullParameter(newItems, "newItems");
        if (oldItems.size() == 1 && (!newItems.isEmpty())) {
            Intrinsics.checkNotNullParameter(oldItems, "<this>");
            bo0 bo0Var = (bo0) CollectionsKt.S(oldItems);
            if (bo0Var.x() && bo0Var.getEndTimeMs() == 5000) {
                return pp2.a.K0(CollectionsKt.l0(newItems, e0.b(bo0.a((bo0) oldItems.get(0), null, 0L, 3000L, null, null, 0.0f, RecyclerViewTypes.VIEW_TYPE_PEAR_INSIGHT_HEADER))));
            }
        }
        return pp2.a.K0(CollectionsKt.l0(newItems, oldItems));
    }

    public static final vq q0(Context context, float f13, k01 videoItem, Matrix matrix) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoItem, "videoItem");
        int intValue = ((Number) videoItem.f39240c.f135234a).intValue();
        int intValue2 = ((Number) videoItem.f39240c.f135235b).intValue();
        Pair Y = Y(context, f13, intValue, intValue2, matrix);
        return p0(intValue, intValue2, (Matrix) Y.f80346a, (Matrix) Y.f80347b);
    }

    public static byte q1(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue() ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    public static int r(int i13) {
        if (i13 == 513) {
            return 1;
        }
        if (i13 == 514) {
            return 2;
        }
        if (i13 == 769) {
            return 1;
        }
        switch (i13) {
            case RecyclerViewTypes.VIEW_TYPE_COMMENT_STICKER /* 257 */:
            case RecyclerViewTypes.VIEW_TYPE_SPOTLIGHT_COLLECTIONS /* 259 */:
                return 1;
            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
            case RecyclerViewTypes.VIEW_TYPE_PROTECTED_BOARD_HEADER /* 260 */:
                return 2;
            default:
                throw new IllegalArgumentException("Unknown signature algorithm: 0x" + Long.toHexString(i13));
        }
    }

    public static int[] r0(int i13) {
        if (i13 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i13 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i13 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i13 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i13 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static Boolean r1(byte b13) {
        if (b13 == 0) {
            return Boolean.FALSE;
        }
        if (b13 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public static byte[] s(ByteBuffer byteBuffer) {
        int i13 = byteBuffer.getInt();
        if (i13 < 0) {
            throw new IOException("Negative length");
        }
        if (i13 <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i13];
            byteBuffer.get(bArr);
            return bArr;
        }
        StringBuilder s13 = a.a.s("Underflow while reading length-prefixed value. Length: ", i13, ", available: ");
        s13.append(byteBuffer.remaining());
        throw new IOException(s13.toString());
    }

    public static final void s0(w eventManager, lz1.a sendShareUpsellPreferences) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(sendShareUpsellPreferences, "sendShareUpsellPreferences");
        new dr.j(eventManager, sendShareUpsellPreferences).b();
    }

    public static final boolean t(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (!h0()) {
            return false;
        }
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        Integer valueOf = audioManager != null ? Integer.valueOf(audioManager.getRingerMode()) : null;
        if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 2)) {
            return (((float) audioManager.getStreamVolume(3)) * 100.0f) / ((float) audioManager.getStreamMaxVolume(3)) > 0.0f;
        }
        if (valueOf == null) {
            return false;
        }
        valueOf.intValue();
        return false;
    }

    public static final boolean t0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Vibrator vibrator = (Vibrator) context.getSystemService("vibrator");
        return (vibrator == null || !vibrator.hasVibrator() || Settings.System.getInt(context.getContentResolver(), "haptic_feedback_enabled", 0) == 0) ? false : true;
    }

    public static int u0(int i13) {
        int i14 = 0;
        while (i13 > 0) {
            i14++;
            i13 >>>= 1;
        }
        return i14;
    }

    public static final boolean v(TypeAheadItem typeAheadItem) {
        if (typeAheadItem == null || typeAheadItem.f35145f != er.c.EMAIL_PLACEHOLDER) {
            return false;
        }
        String k13 = typeAheadItem.k();
        if (!tr1.b.c(typeAheadItem.k())) {
            return false;
        }
        typeAheadItem.f35140a = k13;
        typeAheadItem.f35143d = k13;
        typeAheadItem.f35142c = k13;
        typeAheadItem.f35145f = er.c.EMAIL_CONTACT;
        return true;
    }

    public static final void v0(Context context, xi.c initializationConfig, gw.e eVar) {
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        c1.f28a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initializationConfig, "initializationConfig");
        Intrinsics.checkNotNullParameter(wi.b.class, "adActivityClass");
        Context applicationContext = context.getApplicationContext();
        if (!(applicationContext instanceof Application)) {
            throw new IllegalArgumentException("The provided application context is not an instance of Application. The Google Mobile Ads SDK should not be used from contexts like BroadcastReceivers, only Services and Activities.");
        }
        h61 h61Var = bk0.f3512b;
        zj0 block = new zj0(context, applicationContext, initializationConfig);
        Intrinsics.checkNotNullParameter(block, "block");
        synchronized (h61Var) {
            try {
                if (h61Var.f5863a == null) {
                    h61Var.f5863a = block.invoke();
                }
                obj = h61Var.f5863a;
                if (obj == null) {
                    Intrinsics.r("backingField");
                    throw null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        n20 n20Var = (n20) ((c1) obj);
        ((p82) n20Var.f8591v0.get()).a(initializationConfig.f134995c);
        mz0 mz0Var = (mz0) n20Var.f8532g1.get();
        mz0Var.getClass();
        kotlin.jvm.internal.j.H(kotlin.coroutines.j.f80412a, new gz0(eVar, mz0Var, null));
    }

    public static final void w(Context context, SendableObject sendableObject, p32.c inviteCategory, so.v inviteCodeHandlerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sendableObject, "sendableObject");
        Intrinsics.checkNotNullParameter(inviteCategory, "inviteCategory");
        Intrinsics.checkNotNullParameter(inviteCodeHandlerFactory, "inviteCodeHandlerFactory");
        r8 r8Var = inviteCodeHandlerFactory.f114663a;
        d0 d0Var = (d0) r8Var.f114090a.f113817n2.get();
        oa oaVar = r8Var.f114090a;
        new i91.r(context, sendableObject, inviteCategory, d0Var, (k) oaVar.f113921t1.get(), (u20.d) oaVar.Y5.get(), (h) oaVar.f113797m0.get()).b(sendableObject, inviteCategory, p32.f.COPY_LINK);
    }

    public static void w0(a02.d dVar, vy.m mVar) {
        dVar.f226j0 = mVar;
    }

    public static final g x(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(x0.copy_link);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        int i13 = s0.copy_link_share_icon;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), string, "copy_link", q.LINK, f.DEFAULT_LIGHT_GRAY);
    }

    public static void x0(jd1.d dVar, jd1.e eVar) {
        dVar.M0 = eVar;
    }

    public static final g y(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = s0.download_icon;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.download), "download_idea_pin", q.DOWNLOAD, f.DEFAULT_LIGHT_GRAY);
    }

    public static void y0(q71.d dVar, m3 m3Var) {
        dVar.T0 = m3Var;
    }

    public static final g z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i13 = dl2.b.T1(context) ? s0.vr_facebook_story_share_icon : s0.ic_facebook_stories_nonpds;
        Object obj = d5.a.f53679a;
        return new g(context.getDrawable(i13), context.getString(x0.facebook_stories), "facebook_stories");
    }

    public static void z0(q71.d dVar, e eVar) {
        dVar.S0 = eVar;
    }

    public abstract Object J(r3.i iVar);

    public abstract boolean u(r3.c cVar);
}
