package ph;

import ac.k;
import android.app.Application;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.widget.EdgeEffect;
import b2.m0;
import b3.w;
import b3.z0;
import c0.s1;
import c71.b0;
import com.airbnb.lottie.compose.LottieAnimationSizeElement;
import com.google.android.material.datepicker.i0;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.bg;
import com.pinterest.api.model.cb;
import com.pinterest.api.model.d00;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.g00;
import com.pinterest.api.model.h00;
import com.pinterest.api.model.h80;
import com.pinterest.api.model.hh;
import com.pinterest.api.model.k00;
import com.pinterest.api.model.mx0;
import com.pinterest.api.model.oe0;
import com.pinterest.api.model.px0;
import com.pinterest.api.model.pz0;
import com.pinterest.api.model.se0;
import com.pinterest.api.model.tp;
import com.pinterest.api.model.tx0;
import com.pinterest.api.model.v7;
import com.pinterest.api.model.vh;
import com.pinterest.api.model.we0;
import com.pinterest.api.model.wy0;
import com.pinterest.api.model.zq;
import com.pinterest.component.board.view.LegoBoardRep;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.banner.GestaltBanner;
import com.pinterest.gestalt.iconbuttonfloating.GestaltIconButtonFloating;
import com.pinterest.gestalt.textfield.view.GestaltTextField;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.z2;
import d7.n0;
import df.j1;
import g7.i;
import h3.d;
import h3.e;
import h3.f;
import h3.h0;
import h3.j;
import h3.k0;
import h3.l;
import h3.m;
import h3.n;
import h3.u;
import h3.z;
import h32.a4;
import h32.c1;
import h32.f1;
import h32.x2;
import i2.f2;
import i2.o;
import i2.q1;
import i2.s;
import i2.y3;
import i2.z1;
import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kg.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.q0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import lh0.m3;
import m60.w0;
import n00.a0;
import net.quikkly.android.utils.BitmapUtils;
import nx.d0;
import pc.c;
import pc.r0;
import pc.v;
import so.t3;
import so.w2;
import u2.q;
import u50.r;
import x31.p;
import x40.i6;
import yq1.y0;
import zd1.e0;
import zd1.g;
import zd1.h;

/* loaded from: classes3.dex */
public abstract class a implements pc.a {

    /* renamed from: a, reason: collision with root package name */
    public static Context f100152a;

    /* renamed from: b, reason: collision with root package name */
    public static Boolean f100153b;

    /* renamed from: c, reason: collision with root package name */
    public static f f100154c;

    public static final boolean A(int i13) {
        return (i13 & 2) != 0;
    }

    public static boolean A0(String absoluteFilePath) {
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        return StringsKt.E(R(absoluteFilePath), "video", false);
    }

    public static final f B() {
        f fVar = f100154c;
        if (fVar != null) {
            return fVar;
        }
        e eVar = new e("Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        q0 q0Var = h0.f66696a;
        z0 z0Var = new z0(w.f21378b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new n(20.0f, 11.0f));
        arrayList.add(new l(7.83f));
        arrayList.add(new u(5.59f, -5.59f));
        arrayList.add(new m(12.0f, 4.0f));
        arrayList.add(new u(-8.0f, 8.0f));
        arrayList.add(new u(8.0f, 8.0f));
        arrayList.add(new u(1.41f, -1.41f));
        arrayList.add(new m(7.83f, 13.0f));
        arrayList.add(new l(20.0f));
        arrayList.add(new z(-2.0f));
        arrayList.add(j.f66704c);
        eVar.c();
        ((d) ep.b.h(eVar.f66635i, 1)).f66624j.add(new k0("", arrayList, 0, z0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
        f a13 = eVar.a();
        f100154c = a13;
        return a13;
    }

    public static final void B0(d0 d0Var, String parentPinId, Long l13, String str, String str2, boolean z13) {
        Intrinsics.checkNotNullParameter(parentPinId, "parentPinId");
        c1 r13 = r(parentPinId, str, l13);
        if (d0Var != null) {
            d0Var.u(f1.PRODUCT_TAG_VISIT, String.valueOf(l13), r13, null, false);
        }
        if (!z13) {
            if (d0Var != null) {
                d0Var.u(f1.PIN_CLICKTHROUGH, String.valueOf(l13), r13, null, false);
            }
        } else if (d0Var != null) {
            String valueOf = String.valueOf(l13);
            HashMap hashMap = new HashMap();
            hashMap.put("closeup_navigation_type", nq.b.CLICK.getType());
            Unit unit = Unit.f80348a;
            d0Var.n(valueOf, hashMap, str2, null, r13, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084 A[LOOP:0: B:11:0x007e->B:13:0x0084, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final dc0.g C(com.pinterest.api.model.v7 r14, ka2.a r15) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.a.C(com.pinterest.api.model.v7, ka2.a):dc0.g");
    }

    public static final PointF C0(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPointerCount() < 2) {
            return new PointF();
        }
        float f13 = 2;
        return new PointF((event.getX(0) + event.getX(1)) / f13, (event.getY(0) + event.getY(1)) / f13);
    }

    public static float D0(EdgeEffect edgeEffect, float f13, float f14) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.e.c(edgeEffect, f13, f14);
        }
        androidx.core.widget.d.a(edgeEffect, f13, f14);
        return f13;
    }

    public static final String E(e0 e0Var) {
        List m13;
        Object obj;
        Intrinsics.checkNotNullParameter(e0Var, "<this>");
        px0 px0Var = (px0) e0Var.f141706a.get(String.valueOf(t32.f.PRODUCT_PRICE.value()));
        if (px0Var == null || (m13 = px0Var.m()) == null) {
            return null;
        }
        Iterator it = m13.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((tx0) obj).v() != null) {
                break;
            }
        }
        tx0 tx0Var = (tx0) obj;
        if (tx0Var != null) {
            return tx0Var.v();
        }
        return null;
    }

    public static int E0(int i13, d7.d0 d0Var) {
        switch (i13) {
            case 1:
                return RecyclerViewTypes.VIEW_TYPE_LENS_DIRECTORY;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i13 - 2);
            case 6:
                return d0Var.y() + 1;
            case 7:
                return d0Var.E() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER << (i13 - 8);
            default:
                return -1;
        }
    }

    public static p5.b F(Long l13, Long l14) {
        p5.b bVar;
        if (l13 == null && l14 == null) {
            return new p5.b(null, null);
        }
        if (l13 == null) {
            bVar = new p5.b(null, G(l14.longValue()));
        } else {
            if (l14 != null) {
                Calendar f13 = i0.f();
                Calendar g13 = i0.g(null);
                g13.setTimeInMillis(l13.longValue());
                Calendar g14 = i0.g(null);
                g14.setTimeInMillis(l14.longValue());
                return g13.get(1) == g14.get(1) ? g13.get(1) == f13.get(1) ? new p5.b(T(l13.longValue(), Locale.getDefault()), T(l14.longValue(), Locale.getDefault())) : new p5.b(T(l13.longValue(), Locale.getDefault()), d0(l14.longValue(), Locale.getDefault())) : new p5.b(d0(l13.longValue(), Locale.getDefault()), d0(l14.longValue(), Locale.getDefault()));
            }
            bVar = new p5.b(G(l13.longValue()), null);
        }
        return bVar;
    }

    public static final Set F0(p pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<this>");
        List list = pVar.f131638d;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (pVar.f131640f.get(((x31.a) obj).a()) == bm1.n.SELECTED) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.J0(arrayList);
    }

    public static String G(long j13) {
        Calendar f13 = i0.f();
        Calendar g13 = i0.g(null);
        g13.setTimeInMillis(j13);
        return f13.get(1) == g13.get(1) ? T(j13, Locale.getDefault()) : d0(j13, Locale.getDefault());
    }

    public static final void G0(d00 d00Var, List list) {
        px0 px0Var;
        Intrinsics.checkNotNullParameter(d00Var, "<this>");
        g00 a13 = d00Var.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        Intrinsics.checkNotNullParameter(a13, "<this>");
        k00 q13 = a13.q();
        k00 k00Var = null;
        px0 r13 = q13 != null ? q13.r() : null;
        int i13 = 0;
        if (r13 != null) {
            mx0 mx0Var = new mx0(r13, 0);
            mx0Var.b(list);
            px0Var = mx0Var.a();
        } else {
            px0Var = null;
        }
        k00 q14 = a13.q();
        if (q14 != null) {
            h00 h00Var = new h00(q14, i13);
            h00Var.f38215f = px0Var;
            boolean[] zArr = h00Var.f38224o;
            if (zArr.length > 5) {
                zArr[5] = true;
            }
            k00Var = h00Var.a();
        }
        d00Var.b(k00Var);
        Intrinsics.checkNotNullExpressionValue(d00Var, "setAction(...)");
    }

    public static final boolean H(int i13) {
        return (i13 & 1) != 0;
    }

    public static final void H0(boolean z13, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            g gVar = hVar instanceof g ? (g) hVar : null;
            if (gVar != null) {
                gVar.f141719j = z13;
            }
        }
    }

    public static float I(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return androidx.core.widget.e.b(edgeEffect);
        }
        return 0.0f;
    }

    public static boolean I0(f30 f30Var) {
        return !hf0.b.n();
    }

    public static Bundle J(Notification notification) {
        return notification.extras;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0377 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0238 A[LOOP:1: B:49:0x0232->B:51:0x0238, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0309  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static dc0.o J0(com.pinterest.api.model.v7 r47, com.pinterest.api.model.wy0 r48, android.content.res.Resources r49, wj0.a r50, pb0.d r51, ka2.a r52, java.lang.Integer r53, java.lang.Integer r54, int r55) {
        /*
            Method dump skipped, instructions count: 1191
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.a.J0(com.pinterest.api.model.v7, com.pinterest.api.model.wy0, android.content.res.Resources, wj0.a, pb0.d, ka2.a, java.lang.Integer, java.lang.Integer, int):dc0.o");
    }

    public static final String K(int i13, String str) {
        String str2;
        if (str != null) {
            NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
            currencyInstance.setMaximumFractionDigits(0);
            currencyInstance.setCurrency(Currency.getInstance(str));
            str2 = currencyInstance.format(Integer.valueOf(i13));
        } else {
            str2 = null;
        }
        return str2 == null ? String.valueOf(i13) : str2;
    }

    public static void K0(tc.g writer, v customScalarAdapters, i6 value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        Intrinsics.checkNotNullParameter(value, "value");
        writer.M0("conversation");
        a10.e eVar = c.f99520a;
        eVar.d(writer, customScalarAdapters, value.f132537a);
        writer.M0("anchorMessage");
        eVar.d(writer, customScalarAdapters, value.f132538b);
        r0 r0Var = value.f132539c;
        if (r0Var instanceof pc.q0) {
            writer.M0("text");
            c.d(c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var);
        }
        r0 r0Var2 = value.f132540d;
        if (r0Var2 instanceof pc.q0) {
            writer.M0("pinId");
            c.d(c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var2);
        }
        writer.M0("source");
        eVar.d(writer, customScalarAdapters, value.f132541e);
        r0 r0Var3 = value.f132542f;
        if (r0Var3 instanceof pc.q0) {
            writer.M0("clientTrackingParams");
            c.d(c.f99524e).a(writer, customScalarAdapters, (pc.q0) r0Var3);
        }
    }

    public static final ArrayList L(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (j1.B0(f30Var)) {
            arrayList2 = t.G(f30Var);
        }
        int i13 = 0;
        for (Object obj : arrayList2) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                f0.p();
                throw null;
            }
            arrayList.add(new h21.a((m21.a) obj, null, i13 == 0, 2, null));
            i13 = i14;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    public static final ArrayList L0(ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        ArrayList arrayList2 = new ArrayList(g0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            px.e eVar = (px.e) it.next();
            px.f fVar = eVar.f101551a;
            Intrinsics.checkNotNullParameter(fVar, "<this>");
            arrayList2.add(new jw1.a(ww1.c.valueOf(fVar.name()), eVar.f101552b, eVar.f101553c, true));
        }
        return arrayList2;
    }

    public static i M(int i13) {
        int i14 = n0.f53866a;
        Locale locale = Locale.US;
        return new i(Uri.parse("rtp://0.0.0.0:" + i13));
    }

    public static final x31.c M0(x31.c cVar, p vmState) {
        Integer num;
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(vmState, "vmState");
        x31.b bVar = cVar.f131617a;
        int i13 = 0;
        if (vmState.f131638d.size() == 1 && (num = vmState.f131637c) != null) {
            i13 = num.intValue();
        }
        u41.a aVar = cVar.f131617a.f131615a;
        List list = vmState.f131638d;
        ArrayList pills = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            pills.add(pp2.a.n((x31.a) it.next(), vmState));
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pills, "pills");
        u41.a filters = new u41.a(pills);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(filters, "filters");
        return x31.c.e(cVar, new x31.b(filters, i13), null, 2);
    }

    public static final ArrayList N(px0 px0Var) {
        Intrinsics.checkNotNullParameter(px0Var, "<this>");
        List m13 = px0Var.m();
        ArrayList arrayList = new ArrayList();
        t32.d dVar = t32.f.Companion;
        Integer o13 = px0Var.o();
        Intrinsics.checkNotNullExpressionValue(o13, "getProductFilterType(...)");
        int intValue = o13.intValue();
        dVar.getClass();
        t32.f a13 = t32.d.a(intValue);
        Integer l13 = px0Var.l();
        if (l13.intValue() == t32.c.RANGE.getValue()) {
            j(px0Var, arrayList);
        } else {
            if (l13.intValue() != t32.c.MULTI_SELECT.getValue()) {
                if (l13.intValue() == t32.c.SINGLE_SELECT.getValue() && m13 != null) {
                    i(m13, px0Var, arrayList, a13 == t32.f.PRODUCT_CONTENT_TYPE);
                }
            } else if (m13 != null) {
                i(m13, px0Var, arrayList, false);
            }
        }
        return arrayList;
    }

    public static final x31.c N0(x31.c cVar, r events) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        Intrinsics.checkNotNullParameter(events, "events");
        x31.b bVar = cVar.f131617a;
        List<u41.e> list = bVar.f131615a.f120474a;
        ArrayList pills = new ArrayList(g0.q(list, 10));
        for (u41.e eVar : list) {
            u41.g gVar = eVar.f120484b;
            p70.a action = new p70.a(events, 18);
            int i13 = gVar.f120486a;
            Intrinsics.checkNotNullParameter(action, "action");
            pills.add(u41.e.a(eVar, null, new u41.g(i13, action), 1));
        }
        Intrinsics.checkNotNullParameter(pills, "pills");
        u41.a filters = new u41.a(pills);
        Intrinsics.checkNotNullParameter(filters, "filters");
        return x31.c.e(cVar, new x31.b(filters, bVar.f131616b), null, 2);
    }

    public static final Integer O(Integer num) {
        if (num.intValue() != t32.f.PRODUCT_PRICE.getValue()) {
            if (num.intValue() != t32.f.PRODUCT_MERCHANT.getValue()) {
                if (num.intValue() != t32.f.PRODUCT_BRAND.getValue()) {
                    if (num.intValue() != t32.f.PRODUCT_ON_SALE.getValue()) {
                        return null;
                    }
                }
            }
        }
        return Integer.valueOf(q42.f.SHOP_FILTER.getValue());
    }

    public static int P(int i13, int i14, a7.f fVar) {
        boolean isDirectPlaybackSupported;
        for (int i15 = 10; i15 > 0; i15--) {
            int t13 = n0.t(i15);
            if (t13 != 0) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i13).setSampleRate(i14).setChannelMask(t13).build(), (AudioAttributes) fVar.a().f66449b);
                if (isDirectPlaybackSupported) {
                    return i15;
                }
            }
        }
        return 0;
    }

    public static final ag1.i Q(tp page) {
        Intrinsics.checkNotNullParameter(page, "page");
        return page.getMediaList().B() > 1 ? ag1.i.MULTI_ASSET : page.getMediaList().y() ? ag1.i.IMAGE : ag1.i.VIDEO;
    }

    public static String R(String absoluteFilePath) {
        String str;
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        Intrinsics.checkNotNullParameter(absoluteFilePath, "absoluteFilePath");
        int N = StringsKt.N(absoluteFilePath, ".", 0, 6);
        if (N >= 0) {
            String substring = absoluteFilePath.substring(N + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            str = substring.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
        } else {
            str = "";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
        if (mimeTypeFromExtension == null) {
            return "";
        }
        String lowerCase = mimeTypeFromExtension.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase == null ? "" : lowerCase;
    }

    public static final String S(int i13, yk1.v resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        if (i13 == t32.f.PRODUCT_PRICE.getValue()) {
            return ((yk1.a) resources).f139224a.getString(mz1.g.unified_inline_filter_range_header_text);
        }
        if (i13 != t32.f.PRODUCT_MERCHANT.getValue()) {
            return null;
        }
        return ((yk1.a) resources).f139224a.getString(mz1.g.unified_inline_filter_retailer_header_text);
    }

    public static String T(long j13, Locale locale) {
        return i0.b("MMMd", locale).format(new Date(j13));
    }

    public static final float U(float f13) {
        float f14 = f13 % 360;
        if (f14 < -180.0f) {
            f14 += 360.0f;
        }
        return f14 > 180.0f ? f14 - 360.0f : f14;
    }

    public static final cy1.c V(f30 f30Var) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        return b40.Q0(f30Var) ? cy1.c.IDEA : b40.X0(f30Var) ? cy1.c.VIDEO : cy1.c.OTHERS;
    }

    public static final String W(Resources resources, int i13, int i14, String str, String str2, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringBuilder sb3 = new StringBuilder();
        if (z16 && str != null && str.length() != 0) {
            sb3.append(str);
        }
        if (z17 && str2 != null && str2.length() != 0) {
            if (!kotlin.text.z.j(sb3)) {
                sb3.append(" · ");
            }
            sb3.append(str2);
        }
        if (z13) {
            int i15 = w0.plural_pins_string;
            Object[] objArr = new Object[1];
            objArr[0] = z15 ? qb0.j.b(i13) : String.valueOf(i13);
            String quantityString = resources.getQuantityString(i15, i13, objArr);
            Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
            if (!kotlin.text.z.j(sb3)) {
                sb3.append(" · ");
            }
            sb3.append(quantityString);
        }
        if (i14 > 0 && z14) {
            String quantityString2 = resources.getQuantityString(le0.g.plural_sections, i14, Integer.valueOf(i14));
            Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
            sb3.append(" · ");
            sb3.append(quantityString2);
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    public static final List X() {
        return f0.j(ww1.c.PRODUCT_TAG_IMPRESSION, ww1.c.PRODUCT_TAG_SAVE, ww1.c.PRODUCT_TAG_CLICK, ww1.c.PRODUCT_TAG_OUTBOUND_CLICK);
    }

    public static final rx.d Y(zx.n mappedFilter, String pinId, ArrayList productTagIdList, ww1.c metricType) {
        Intrinsics.checkNotNullParameter(mappedFilter, "mappedFilter");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(productTagIdList, "productTagIdList");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        Intrinsics.checkNotNullParameter(metricType, "<this>");
        return new rx.d(pinId, mappedFilter.f142983a, mappedFilter.f142984b, px.f.valueOf(metricType.name()), productTagIdList, mappedFilter.f142994l, mappedFilter.f142987e);
    }

    public static final String Z(List list, yk1.v viewResources) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        tx0 tx0Var = (tx0) CollectionsKt.U(0, list);
        if (tx0Var != null) {
            int doubleValue = (int) tx0Var.q().doubleValue();
            tx0 tx0Var2 = (tx0) CollectionsKt.U(1, list);
            if (tx0Var2 != null) {
                int doubleValue2 = (int) tx0Var2.q().doubleValue();
                tx0 tx0Var3 = (tx0) CollectionsKt.U(0, list);
                String v13 = tx0Var3 != null ? tx0Var3.v() : null;
                return ((yk1.a) viewResources).f139224a.getString(mz1.g.price_range, K(doubleValue, v13), K(doubleValue2, v13));
            }
        }
        return null;
    }

    public static final void a(com.airbnb.lottie.h hVar, Function0 progress, q qVar, boolean z13, boolean z14, boolean z15, com.airbnb.lottie.g0 g0Var, boolean z16, u2.e eVar, q3.n nVar, boolean z17, boolean z18, Map map, com.airbnb.lottie.a aVar, boolean z19, o oVar, int i13, int i14, int i15) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        s sVar = (s) oVar;
        sVar.Y(-674272918);
        q qVar2 = (i15 & 4) != 0 ? u2.n.f120041b : qVar;
        boolean z23 = (i15 & 8) != 0 ? false : z13;
        boolean z24 = (i15 & 16) != 0 ? false : z14;
        boolean z25 = (i15 & 32) != 0 ? false : z15;
        com.airbnb.lottie.g0 g0Var2 = (i15 & 64) != 0 ? com.airbnb.lottie.g0.AUTOMATIC : g0Var;
        boolean z26 = (i15 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? false : z16;
        u2.e eVar2 = (i15 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? u2.b.f120017e : eVar;
        q3.n nVar2 = (i15 & 1024) != 0 ? q3.m.f102247b : nVar;
        boolean z27 = (i15 & 2048) != 0 ? true : z17;
        boolean z28 = (i15 & 4096) != 0 ? false : z18;
        Map map2 = (i15 & 8192) != 0 ? null : map;
        com.airbnb.lottie.a aVar2 = (i15 & 16384) != 0 ? com.airbnb.lottie.a.AUTOMATIC : aVar;
        boolean z29 = (32768 & i15) != 0 ? false : z19;
        sVar.X(185152052);
        Object J2 = sVar.J();
        am.d dVar = i2.n.f71185a;
        if (J2 == dVar) {
            J2 = new com.airbnb.lottie.v();
            sVar.g0(J2);
        }
        com.airbnb.lottie.v vVar = (com.airbnb.lottie.v) J2;
        sVar.r(false);
        sVar.X(185152099);
        Object J3 = sVar.J();
        if (J3 == dVar) {
            J3 = new Matrix();
            sVar.g0(J3);
        }
        Matrix matrix = (Matrix) J3;
        sVar.r(false);
        sVar.X(185152179);
        boolean h10 = sVar.h(hVar);
        Object J4 = sVar.J();
        if (h10 || J4 == dVar) {
            J4 = bs1.c.u1(null, y3.f71400a);
            sVar.g0(J4);
        }
        q1 q1Var = (q1) J4;
        sVar.r(false);
        sVar.X(185152231);
        if (hVar == null || hVar.b() == 0.0f) {
            q qVar3 = qVar2;
            p1.q.a(qVar3, sVar, (i13 >> 6) & 14);
            sVar.r(false);
            f2 t13 = sVar.t();
            if (t13 != null) {
                t13.f71113d = new k(hVar, progress, qVar3, z23, z24, z25, g0Var2, z26, eVar2, nVar2, z27, z28, map2, aVar2, z29, i13, i14, i15, 0);
                return;
            }
            return;
        }
        sVar.r(false);
        Rect rect = hVar.f28406k;
        int width = rect.width();
        int height = rect.height();
        Intrinsics.checkNotNullParameter(qVar2, "<this>");
        q qVar4 = qVar2;
        androidx.compose.foundation.a.a(qVar2.j(new LottieAnimationSizeElement(width, height)), new ac.l(rect, nVar2, eVar2, matrix, vVar, z25, z29, g0Var2, aVar2, hVar, map2, z23, z24, z26, z27, z28, progress, q1Var), sVar, 0);
        f2 t14 = sVar.t();
        if (t14 != null) {
            t14.f71113d = new k(hVar, progress, qVar4, z23, z24, z25, g0Var2, z26, eVar2, nVar2, z27, z28, map2, aVar2, z29, i13, i14, i15, 1);
        }
    }

    public static final o21.b a0(int i13, int i14, int i15) {
        int i16 = (int) ((i13 - ((((int) r0) * i15) + i14)) / (hf0.b.n() ? 4.5f : (hf0.b.q() && hf0.b.o()) ? 3.5f : 2.5f));
        return new o21.b(i16, i16);
    }

    public static final void b(q qVar, Function2 function2, o oVar, int i13, int i14) {
        int i15;
        s sVar = (s) oVar;
        sVar.Y(-2105228848);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (sVar.h(qVar) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i14 & 2) != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= sVar.j(function2) ? 32 : 16;
        }
        if ((i15 & 19) == 18 && sVar.z()) {
            sVar.Q();
        } else {
            if (i16 != 0) {
                qVar = u2.n.f120041b;
            }
            m0 m0Var = m0.f21179a;
            int i17 = ((i15 << 3) & RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER) | ((i15 >> 3) & 14) | 384;
            int i18 = sVar.P;
            z1 o13 = sVar.o();
            q X = ao2.m0.X(sVar, qVar);
            s3.k.Qo.getClass();
            s3.i iVar = s3.j.f110798b;
            int i19 = ((i17 << 6) & 896) | 6;
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
            tb.f.f0(sVar, m0Var, s3.j.f110801e);
            tb.f.f0(sVar, o13, s3.j.f110800d);
            s3.h hVar = s3.j.f110802f;
            if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i18))) {
                ep.b.y(i18, sVar, i18, hVar);
            }
            tb.f.f0(sVar, X, s3.j.f110799c);
            function2.invoke(sVar, Integer.valueOf((i19 >> 6) & 14));
            sVar.r(true);
        }
        q qVar2 = qVar;
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new b2.n0(qVar2, function2, i13, i14, 0);
        }
    }

    public static final Size b0(gh0.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar instanceof ie2.d) {
            return ve.h.C(((ie2.d) bVar).f72216b);
        }
        if (bVar instanceof ie2.c) {
            return ((ie2.c) bVar).f72215b;
        }
        if (bVar instanceof ie2.e) {
            return ((ie2.e) bVar).f72218c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static final String c0(t32.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        return String.valueOf(fVar.value());
    }

    public static String d0(long j13, Locale locale) {
        return i0.b("yMMMd", locale).format(new Date(j13));
    }

    public static final String e(b0 b0Var) {
        int i13 = k61.i.f78415a[b0Var.f26728a.ordinal()];
        return i13 != 1 ? i13 != 2 ? i13 != 3 ? i13 != 4 ? "search/pins/" : "search/article_feed/" : "search/boards/" : "search/user_pins/me/" : "search/users/";
    }

    public static final boolean e0(v7 v7Var, ka2.a aVar) {
        List I0;
        Boolean g13 = v7Var.g1();
        Intrinsics.checkNotNullExpressionValue(g13, "getIsCollaborative(...)");
        return g13.booleanValue() && (I0 = v7Var.I0()) != null && !I0.isEmpty() && (kh2.d.e1(v7Var) || aVar.f78951p);
    }

    public static final boolean f0(f30 f30Var) {
        List r13;
        h80 h80Var;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        oe0 f63 = f30Var.f6();
        List u13 = (f63 == null || (r13 = f63.r()) == null || (h80Var = (h80) CollectionsKt.firstOrNull(r13)) == null) ? null : h80Var.u();
        return u13 != null && (u13.isEmpty() ^ true);
    }

    public static final void g(x92.b apiFieldsMap) {
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        j1.h(apiFieldsMap);
        apiFieldsMap.e("pin.link_domain()");
        apiFieldsMap.e("domain.official_user()");
        a0.f88763a.a(apiFieldsMap);
        apiFieldsMap.e("storypindata.metadata()");
        apiFieldsMap.e("storypindata.pages");
        apiFieldsMap.e("todayarticle.id");
        n60.o.w(apiFieldsMap, "todayarticle.type", "todayarticle.title", "todayarticle.subtitle", "todayarticle.article_description");
        n60.o.w(apiFieldsMap, "todayarticle.image_urls", "todayarticle.display_type", "todayarticle.video_pin()", "todayarticle.header_pin_id");
        n60.o.w(apiFieldsMap, "todayarticle.show_creator", "todayarticle.content_pin()", "todayarticle.is_feed_single_column", "todayarticle.is_story_pin_animated");
        n60.o.w(apiFieldsMap, "todayarticle.cover_pin()", "todayarticle.article_creator_user()", "todayarticle.cover_pins()", "todayarticle.creators()");
        apiFieldsMap.e("todayarticle.is_video_cover");
    }

    public static void g0(bb1.s sVar, cr1.a aVar) {
        sVar.f22554l0 = aVar;
    }

    public static final void h(Navigation navigation, String trafficSource, boolean z13, a4 a4Var) {
        Intrinsics.checkNotNullParameter(navigation, "<this>");
        Intrinsics.checkNotNullParameter(trafficSource, "trafficSource");
        ScreenLocation f49939a = navigation.getF49939a();
        if (Intrinsics.d(f49939a, z2.a()) || Intrinsics.d(f49939a, (ScreenLocation) z2.f51673c.getValue())) {
            navigation.m0("com.pinterest.EXTRA_RELATED_PINS_TRAFFIC_SOURCE", trafficSource);
            navigation.Y1("com.pinterest.EXTRA_CLOSEUP_IS_PIN_HIDE_SUPPORTED", z13);
            if (a4Var != null) {
                navigation.m0("com.pinterest.EXTRA_VIEW_PARAMETER_TYPE", a4Var.name());
            }
        }
    }

    public static void h0(wc1.e eVar, cr1.a aVar) {
        eVar.A0 = aVar;
    }

    public static final void i(List list, px0 px0Var, ArrayList arrayList, boolean z13) {
        ArrayList arrayList2;
        t32.d dVar = t32.f.Companion;
        Integer o13 = px0Var.o();
        Intrinsics.checkNotNullExpressionValue(o13, "getProductFilterType(...)");
        int intValue = o13.intValue();
        dVar.getClass();
        t32.f a13 = t32.d.a(intValue);
        LinkedHashMap linkedHashMap = new LinkedHashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tx0 tx0Var = (tx0) it.next();
            Map m13 = tx0Var.m();
            t32.i iVar = null;
            String valueOf = String.valueOf(m13 != null ? m13.get("module_id") : null);
            String p13 = tx0Var.p();
            Intrinsics.checkNotNullExpressionValue(p13, "getLabel(...)");
            Intrinsics.checkNotNullParameter(tx0Var, "<this>");
            List r13 = tx0Var.r();
            if (r13 != null) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : r13) {
                    Integer num = (Integer) obj;
                    t32.d dVar2 = t32.f.Companion;
                    Intrinsics.f(num);
                    int intValue2 = num.intValue();
                    dVar2.getClass();
                    if (t32.d.a(intValue2) != null) {
                        arrayList3.add(obj);
                    }
                }
                ArrayList arrayList4 = new ArrayList(g0.q(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    Integer num2 = (Integer) it2.next();
                    t32.d dVar3 = t32.f.Companion;
                    Intrinsics.f(num2);
                    int intValue3 = num2.intValue();
                    dVar3.getClass();
                    t32.f a14 = t32.d.a(intValue3);
                    Intrinsics.f(a14);
                    arrayList4.add(a14);
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            String q13 = px0Var.q();
            String u13 = tx0Var.u();
            String p14 = tx0Var.p();
            String t13 = tx0Var.t();
            String str = t13 == null ? "" : t13;
            String n13 = tx0Var.n();
            String str2 = n13 != null ? n13 : "";
            Boolean o14 = tx0Var.o();
            String t14 = tx0Var.t();
            if (a13 == t32.f.PRODUCT_CONTENT_TYPE) {
                t32.g gVar = t32.i.Companion;
                Integer s13 = tx0Var.s();
                Intrinsics.checkNotNullExpressionValue(s13, "getSearchType(...)");
                int intValue4 = s13.intValue();
                gVar.getClass();
                iVar = t32.g.a(intValue4);
            }
            t32.i iVar2 = iVar;
            int doubleValue = (int) tx0Var.q().doubleValue();
            String k13 = px0Var.k();
            Intrinsics.f(p14);
            Intrinsics.f(o14);
            linkedHashMap.put(p13, new g(a13, arrayList2, u13, q13, p14, str, str2, iVar2, o14.booleanValue(), false, z13, z13, t14, Integer.valueOf(doubleValue), valueOf, k13, 9218));
        }
        Collection values = linkedHashMap.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it3 = values.iterator();
        while (it3.hasNext()) {
            arrayList.add((g) it3.next());
        }
    }

    public static void i0(q91.u uVar, lb2.n nVar) {
        uVar.B0 = nVar;
    }

    public static final void j(px0 px0Var, ArrayList arrayList) {
        Map m13;
        tx0 tx0Var;
        tx0 tx0Var2;
        if (px0Var.m().size() < 2) {
            return;
        }
        t32.d dVar = t32.f.Companion;
        Integer o13 = px0Var.o();
        Intrinsics.checkNotNullExpressionValue(o13, "getProductFilterType(...)");
        int intValue = o13.intValue();
        dVar.getClass();
        t32.f a13 = t32.d.a(intValue);
        int doubleValue = (int) ((tx0) px0Var.m().get(0)).q().doubleValue();
        String u13 = ((tx0) px0Var.m().get(0)).u();
        Intrinsics.checkNotNullExpressionValue(u13, "getUid(...)");
        int doubleValue2 = (int) ((tx0) px0Var.m().get(1)).q().doubleValue();
        String u14 = ((tx0) px0Var.m().get(1)).u();
        Intrinsics.checkNotNullExpressionValue(u14, "getUid(...)");
        int doubleValue3 = px0Var.m().size() > 2 ? (int) ((tx0) px0Var.m().get(2)).q().doubleValue() : 0;
        List j13 = px0Var.j();
        int doubleValue4 = (j13 == null || (tx0Var2 = (tx0) CollectionsKt.U(0, j13)) == null) ? doubleValue : (int) tx0Var2.q().doubleValue();
        List j14 = px0Var.j();
        int doubleValue5 = (j14 == null || (tx0Var = (tx0) CollectionsKt.U(1, j14)) == null) ? doubleValue2 : (int) tx0Var.q().doubleValue();
        if (doubleValue3 == 0) {
            doubleValue3 = doubleValue2;
        }
        String v13 = ((tx0) px0Var.m().get(0)).v();
        String q13 = px0Var.q();
        String n13 = px0Var.n();
        List m14 = px0Var.m();
        Intrinsics.checkNotNullExpressionValue(m14, "getFilterOptions(...)");
        tx0 tx0Var3 = (tx0) CollectionsKt.U(0, m14);
        arrayList.add(new zd1.r(a13, doubleValue, doubleValue2, doubleValue3, doubleValue4, doubleValue5, v13, q13, u13, u14, n13, String.valueOf((tx0Var3 == null || (m13 = tx0Var3.m()) == null) ? null : m13.get("module_id")), px0Var.k(), 2));
    }

    public static void j0(t52.d dVar, g70.h hVar) {
        dVar.f116444g0 = hVar;
    }

    public static final float k(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return (float) Math.toDegrees(event.getPointerCount() >= 2 ? (float) Math.atan2(event.getY(1) - event.getY(0), event.getX(1) - event.getX(0)) : 0.0f);
    }

    public static void k0(q91.u uVar, m3 m3Var) {
        uVar.D0 = m3Var;
    }

    public static final void l(y0 y0Var, String phoneNumberEnd, qr1.m authority, HashMap pendingLoginParams) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        Intrinsics.checkNotNullParameter(phoneNumberEnd, "phoneNumberEnd");
        Intrinsics.checkNotNullParameter(authority, "authority");
        Intrinsics.checkNotNullParameter(pendingLoginParams, "pendingLoginParams");
        Bundle bundle = new Bundle();
        bundle.putString("phone_number_end", phoneNumberEnd);
        bundle.putSerializable("authority", authority);
        bundle.putSerializable("pending_login_params", pendingLoginParams);
        bundle.putBoolean("is_auto", false);
        y0Var.setArguments(bundle);
    }

    public static void l0(q91.u uVar) {
        uVar.getClass();
    }

    public static final void m(SpannableString spannableString, ArrayList arrayList, Function0 function0) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntRange intRange = (IntRange) it.next();
            spannableString.setSpan(function0.invoke(), intRange.f80453a, intRange.f80454b, 33);
        }
    }

    public static void m0(wc1.e eVar, t3 t3Var) {
        eVar.C0 = t3Var;
    }

    public static final void n(SpannableString spannableString, Context context, String title, String enteredQuery, oe.f visualTreatment) {
        List split$default;
        int i13;
        int length;
        Intrinsics.checkNotNullParameter(spannableString, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(enteredQuery, "enteredQuery");
        Intrinsics.checkNotNullParameter(visualTreatment, "visualTreatment");
        int i14 = 0;
        int i15 = 6;
        split$default = StringsKt__StringsKt.split$default(enteredQuery, new String[]{" "}, false, 0, 6, null);
        List list = split$default;
        ArrayList arrayList = new ArrayList(g0.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(StringsKt.i0((String) it.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((String) next).length() > 0) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            i13 = 1;
            if (!it3.hasNext()) {
                break;
            }
            String str = (String) it3.next();
            int J2 = StringsKt.J(0, title, str, true);
            if (J2 != -1 && (length = str.length() + J2) < title.length()) {
                arrayList3.add(ql2.s.q(J2, length));
            }
        }
        List<IntRange> x03 = CollectionsKt.x0(arrayList3, new sw0.u(i15));
        ArrayList arrayList4 = new ArrayList();
        for (IntRange intRange : x03) {
            if (!arrayList4.isEmpty()) {
                IntRange intRange2 = (IntRange) CollectionsKt.d0(arrayList4);
                if ((intRange2 != null ? intRange2.f80454b : -1) >= intRange.f80453a - 1) {
                    IntRange intRange3 = (IntRange) arrayList4.remove(f0.i(arrayList4));
                    arrayList4.add(new IntRange(intRange3.f80453a, Math.max(intRange3.f80454b, intRange.f80454b), 1));
                }
            }
            arrayList4.add(intRange);
        }
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        int i16 = 0;
        while (it4.hasNext()) {
            IntRange intRange4 = (IntRange) it4.next();
            int i17 = intRange4.f80453a;
            boolean z13 = i17 > 0 && i17 < title.length();
            int i18 = intRange4.f80454b;
            boolean z14 = i18 > 0 && i18 < title.length();
            int i19 = intRange4.f80453a;
            if (i16 < i19 && z13 && z14 && i18 > i19) {
                arrayList5.add(new IntRange(i16, i19, 1));
            }
            i16 = i18 + 1;
        }
        if (i16 < title.length()) {
            arrayList5.add(new IntRange(i16, title.length(), 1));
        }
        m(spannableString, arrayList4, new q71.f1(context, visualTreatment, i14));
        m(spannableString, arrayList5, q71.v.f102772m);
        m(spannableString, arrayList5, new q71.f1(context, visualTreatment, i13));
    }

    public static void n0(bb1.s sVar, uk1.e eVar) {
        sVar.f22552j0 = eVar;
    }

    public static final void o(GestaltBanner gestaltBanner, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltBanner, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        vl1.p pVar = new vl1.p((vl1.d) ((u50.o) gestaltBanner.f49290a.f33803a));
        init.invoke(pVar);
        gestaltBanner.L(new ql1.k(pVar, 8));
    }

    public static void o0(q91.u uVar, uk1.e eVar) {
        uVar.A0 = eVar;
    }

    public static final void p(GestaltTextField gestaltTextField, Function1 init) {
        Intrinsics.checkNotNullParameter(gestaltTextField, "<this>");
        Intrinsics.checkNotNullParameter(init, "init");
        ao1.i iVar = new ao1.i(gestaltTextField.k0());
        init.invoke(iVar);
        gestaltTextField.X(new an1.i(iVar, 19));
    }

    public static void p0(wc1.e eVar, uk1.e eVar2) {
        eVar.f129110z0 = eVar2;
    }

    public static GestaltIconButtonFloating q(GestaltIconButtonFloating gestaltIconButtonFloating) {
        qm1.h invokeAfterStateMutation = qm1.h.f104399n;
        Intrinsics.checkNotNullParameter(gestaltIconButtonFloating, "<this>");
        Intrinsics.checkNotNullParameter(invokeAfterStateMutation, "invokeAfterStateMutation");
        return gestaltIconButtonFloating.c(new la1.k(16, gestaltIconButtonFloating, invokeAfterStateMutation));
    }

    public static void q0(v02.q qVar, w2 w2Var) {
        qVar.f123817z0 = w2Var;
    }

    public static final c1 r(String parentPinId, String str, Long l13) {
        Intrinsics.checkNotNullParameter(parentPinId, "parentPinId");
        Boolean bool = Boolean.FALSE;
        return new c1(null, bool, null, Boolean.TRUE, bool, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new x2(Long.valueOf(l13 != null ? l13.longValue() : 0L), parentPinId, Long.valueOf(l13 != null ? l13.longValue() : 0L), str == null ? "" : str), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static void r0(bb1.s sVar, i92.k kVar) {
        sVar.f22553k0 = kVar;
    }

    public static HashMap s(Rect rect, boolean z13, Rational rational, int i13, int i14, int i15, HashMap hashMap) {
        RectF rectF;
        boolean z14 = false;
        com.bumptech.glide.d.g("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF2 = new RectF(rect);
        HashMap hashMap2 = new HashMap();
        RectF rectF3 = new RectF(rect);
        for (Map.Entry entry : hashMap.entrySet()) {
            Matrix matrix = new Matrix();
            RectF rectF4 = new RectF(0.0f, 0.0f, ((androidx.camera.core.impl.k) entry.getValue()).f16893a.getWidth(), ((androidx.camera.core.impl.k) entry.getValue()).f16893a.getHeight());
            matrix.setRectToRect(rectF4, rectF2, Matrix.ScaleToFit.CENTER);
            hashMap2.put((s1) entry.getKey(), matrix);
            RectF rectF5 = new RectF();
            matrix.mapRect(rectF5, rectF4);
            rectF3.intersect(rectF5);
        }
        Rational rational2 = (i13 == 90 || i13 == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
        if (i14 != 3) {
            Matrix matrix2 = new Matrix();
            RectF rectF6 = new RectF(0.0f, 0.0f, rational2.getNumerator(), rational2.getDenominator());
            if (i14 == 0) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.START);
            } else if (i14 == 1) {
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.CENTER);
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException(a.a.d("Unexpected scale type: ", i14));
                }
                matrix2.setRectToRect(rectF6, rectF3, Matrix.ScaleToFit.END);
            }
            RectF rectF7 = new RectF();
            matrix2.mapRect(rectF7, rectF6);
            boolean z15 = (i15 == 1) ^ z13;
            boolean z16 = i13 == 0 && !z15;
            boolean z17 = i13 == 90 && z15;
            if (!z16 && !z17) {
                boolean z18 = i13 == 0 && z15;
                boolean z19 = i13 == 270 && !z15;
                if (z18 || z19) {
                    float centerX = rectF3.centerX();
                    float f13 = centerX + centerX;
                    rectF = new RectF(f13 - rectF7.right, rectF7.top, f13 - rectF7.left, rectF7.bottom);
                } else {
                    boolean z23 = i13 == 90 && !z15;
                    boolean z24 = i13 == 180 && z15;
                    if (z23 || z24) {
                        float centerY = rectF3.centerY();
                        float f14 = centerY + centerY;
                        rectF = new RectF(rectF7.left, f14 - rectF7.bottom, rectF7.right, f14 - rectF7.top);
                    } else {
                        boolean z25 = i13 == 180 && !z15;
                        if (i13 == 270 && z15) {
                            z14 = true;
                        }
                        if (!z25 && !z14) {
                            throw new IllegalArgumentException("Invalid argument: mirrored " + z15 + " rotation " + i13);
                        }
                        float centerY2 = rectF3.centerY();
                        float f15 = centerY2 + centerY2;
                        RectF rectF8 = new RectF(rectF7.left, f15 - rectF7.bottom, rectF7.right, f15 - rectF7.top);
                        float centerX2 = rectF3.centerX();
                        float f16 = centerX2 + centerX2;
                        rectF7 = new RectF(f16 - rectF8.right, rectF8.top, f16 - rectF8.left, rectF8.bottom);
                    }
                }
                rectF3 = rectF;
            }
            rectF3 = rectF7;
        }
        HashMap hashMap3 = new HashMap();
        RectF rectF9 = new RectF();
        Matrix matrix3 = new Matrix();
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            ((Matrix) entry2.getValue()).invert(matrix3);
            matrix3.mapRect(rectF9, rectF3);
            Rect rect2 = new Rect();
            rectF9.round(rect2);
            hashMap3.put((s1) entry2.getKey(), rect2);
        }
        return hashMap3;
    }

    public static void s0(q91.u uVar, i92.k kVar) {
        uVar.f103174z0 = kVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0083, code lost:
    
        if (r7 == r18.f103002f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if ((r17.y() * 1000) == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a1, code lost:
    
        if (r4 == r1) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean t(d7.d0 r17, q8.x r18, int r19, a8.t0 r20) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ph.a.t(d7.d0, q8.x, int, a8.t0):boolean");
    }

    public static void t0(wc1.e eVar, i92.k kVar) {
        eVar.B0 = kVar;
    }

    public static final ArrayList u(vh story, ww1.c metricType) {
        String Z2;
        cb o13;
        wy0 d2;
        Intrinsics.checkNotNullParameter(story, "story");
        Intrinsics.checkNotNullParameter(metricType, "metricType");
        ArrayList arrayList = new ArrayList();
        List list = story.f42865w;
        Intrinsics.checkNotNullExpressionValue(list, "getObjects(...)");
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof f30) {
                arrayList2.add(obj);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f30 f30Var = (f30) it.next();
            String f39332b = f30Var.getF39332b();
            Intrinsics.checkNotNullExpressionValue(f39332b, "getUid(...)");
            Set set = b40.f35967a;
            Intrinsics.checkNotNullParameter(f30Var, "<this>");
            hh t53 = f30Var.t5();
            if (t53 == null || (d2 = t53.d()) == null || (Z2 = d2.Z2()) == null) {
                wy0 N = b40.N(f30Var);
                Z2 = N != null ? N.Z2() : null;
                if (Z2 == null) {
                    pz0 u53 = f30Var.u5();
                    Z2 = u53 != null ? t.H(u53) : null;
                    if (Z2 == null) {
                        se0 g63 = f30Var.g6();
                        Z2 = g63 != null ? g63.z() : null;
                        if (Z2 == null && (Z2 = f30Var.h4()) == null) {
                            wy0 J6 = f30Var.J6();
                            Z2 = J6 != null ? J6.Z2() : null;
                            if (Z2 == null) {
                                we0 we0Var = (we0) CollectionsKt.firstOrNull(b40.Z(f30Var));
                                Z2 = (we0Var == null || (o13 = we0Var.o()) == null) ? null : o13.g();
                            }
                        }
                    }
                }
            }
            String J2 = b40.J(f30Var);
            String s03 = j1.s0(f30Var);
            String y43 = f30Var.y4();
            Intrinsics.checkNotNullParameter(metricType, "<this>");
            arrayList.add(new px.h(f39332b, Z2, J2, s03, y43, px.f.valueOf(metricType.name()), 6));
        }
        return arrayList;
    }

    public static void u0(q91.u uVar, k22.m mVar) {
        uVar.C0 = mVar;
    }

    public static j5.f v(Handler handler) {
        return new j5.f(handler);
    }

    public static final boolean v0(f30 f30Var, px.f viewType) {
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Boolean T5 = f30Var.T5();
        Intrinsics.checkNotNullExpressionValue(T5, "getPromotedIsRemovable(...)");
        return T5.booleanValue() && viewType == px.f.SAVE;
    }

    public static final LegoBoardRep w(Context context, m60.w eventManager) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        qc2.d dVar = new qc2.d();
        LegoBoardRep legoBoardRep = new LegoBoardRep(context);
        legoBoardRep.a0(dVar, new b11.a(eventManager, 1));
        return legoBoardRep;
    }

    public static final boolean w0(b60.b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        b60.d dVar = (b60.d) bVar;
        wy0 f13 = dVar.f();
        if (!Intrinsics.d(f13 != null ? f13.G2() : null, "US")) {
            wy0 f14 = dVar.f();
            if (!Intrinsics.d(f14 != null ? f14.G2() : null, "GB")) {
                return false;
            }
        }
        return true;
    }

    public static androidx.camera.core.impl.f x(androidx.camera.core.impl.f fVar, Size size, Range range) {
        int width = size.getWidth();
        int height = size.getHeight();
        int i13 = fVar.f16832e;
        int i14 = fVar.f16833f;
        int i15 = fVar.f16830c;
        int i16 = fVar.f16835h;
        int i17 = fVar.f16831d;
        return new androidx.camera.core.impl.f(fVar.f16829b, fVar.f16828a, x0.b.d(i15, i16, i16, i17, i17, width, i13, height, i14, range), fVar.f16831d, size.getWidth(), size.getHeight(), fVar.f16834g, fVar.f16835h, fVar.f16836i, fVar.f16837j);
    }

    public static final boolean x0(f30 f30Var) {
        bg bgVar;
        Intrinsics.checkNotNullParameter(f30Var, "<this>");
        Map V3 = f30Var.V3();
        if (V3 == null || (bgVar = (bg) V3.get("all_time_realtime")) == null) {
            Map V32 = f30Var.V3();
            bgVar = V32 != null ? (bg) V32.get("30d_realtime") : null;
        }
        if (b40.Q0(f30Var) || b40.X0(f30Var)) {
            Boolean x13 = bgVar != null ? bgVar.x() : null;
            if (x13 == null || !x13.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static final float y(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getPointerCount() < 2) {
            return 0.0f;
        }
        float x13 = event.getX(1) - event.getX(0);
        float y13 = event.getY(1) - event.getY(0);
        return (float) Math.sqrt((y13 * y13) + (x13 * x13));
    }

    public static final boolean y0(q42.f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "<this>");
        int i13 = de1.q0.f54635a[fVar.ordinal()];
        return i13 == 1 || i13 == 2 || i13 == 3;
    }

    public static final String z(Application application, zq sticker) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(sticker, "sticker");
        return a.a.D(application.getDir("idea_pin_animated_sticker", 0).getPath(), File.separator, sticker.getF39332b());
    }

    public static synchronized boolean z0(Context context) {
        Boolean bool;
        synchronized (a.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = f100152a;
            if (context2 != null && (bool = f100153b) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            f100153b = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            f100153b = valueOf;
            f100152a = applicationContext;
            return valueOf.booleanValue();
        }
    }
}
