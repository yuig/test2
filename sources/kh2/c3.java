package kh2;

import ads_mobile_sdk.g5;
import ads_mobile_sdk.gf1;
import ads_mobile_sdk.if1;
import ads_mobile_sdk.k72;
import ads_mobile_sdk.lq2;
import ads_mobile_sdk.o52;
import ads_mobile_sdk.rz0;
import ads_mobile_sdk.ss2;
import ads_mobile_sdk.v01;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import androidx.fragment.app.FragmentActivity;
import com.pinterest.activity.user.UserImageView;
import com.pinterest.api.model.bo0;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.hx;
import com.pinterest.api.model.k01;
import com.pinterest.api.model.km0;
import com.pinterest.api.model.om0;
import com.pinterest.api.model.sr;
import com.pinterest.api.model.vn0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.repository.pinnableimagefeed.PinnableImageFeed;
import h32.a4;
import h32.d4;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BiFunction;
import kl2.l;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import oi.u6;
import q5.a2;
import s80.m5;
import s80.n6;
import s80.w6;
import so.n8;
import so.o7;
import so.q8;
import so.x7;
import yf0.g;

/* loaded from: classes4.dex */
public abstract class c3 {
    public static u6 A(Class cls, String str) {
        try {
            return new u6(cls.getDeclaredField(str), 0);
        } catch (NoSuchFieldException e13) {
            throw new AssertionError(e13);
        }
    }

    public static final String B(int i13) {
        return df.j1.U("#%06X", new Object[]{Integer.valueOf(i13 & 16777215)});
    }

    public static final String C(km0 km0Var, String largeImageWidth, String fallbackLargeImageWidth) {
        sr srVar;
        Map d2;
        om0 g13;
        Map d13;
        sr srVar2;
        Map d14;
        Intrinsics.checkNotNullParameter(km0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        Intrinsics.checkNotNullParameter(km0Var, "<this>");
        Intrinsics.checkNotNullParameter(largeImageWidth, "largeImageWidth");
        Intrinsics.checkNotNullParameter(fallbackLargeImageWidth, "fallbackLargeImageWidth");
        om0 g14 = km0Var.g();
        if (g14 == null || (d14 = g14.d()) == null || (srVar = (sr) d14.get(largeImageWidth)) == null) {
            om0 g15 = km0Var.g();
            srVar = (g15 == null || (d2 = g15.d()) == null) ? null : (sr) d2.get(fallbackLargeImageWidth);
        }
        if (srVar != null) {
            Double k13 = srVar.k();
            Intrinsics.checkNotNullExpressionValue(k13, "getWidth(...)");
            double doubleValue = k13.doubleValue();
            Double h10 = srVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "getHeight(...)");
            if (doubleValue > h10.doubleValue() && (g13 = km0Var.g()) != null && (d13 = g13.d()) != null && (srVar2 = (sr) d13.get("1200x")) != null) {
                srVar = srVar2;
            }
        }
        String j13 = srVar != null ? srVar.j() : null;
        return j13 == null ? "" : j13;
    }

    public static final Bitmap D(Context context, ag1.b bVar, bo0 bo0Var, long j13) {
        if (bo0Var.u()) {
            d30 photoItem = bo0Var.getPhotoItem();
            if (photoItem != null) {
                return qb0.b.k(context, photoItem.f41101b, 10, 10);
            }
            return null;
        }
        k01 videoItem = bo0Var.getVideoItem();
        if (videoItem == null) {
            return null;
        }
        RectF o03 = ig1.b.o0(context, 0.5625f, videoItem, bo0Var.getDisplayMatrix());
        return u2.Z(bVar, videoItem.e(), j13, ml2.c.c(o03.width()), ml2.c.c(o03.height()), bo0Var.getIsFromFrontFacingCamera() ? ig1.b.X() : null);
    }

    public static final String E(Context context, List list, boolean z13) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (z13) {
            String string = context.getResources().getString(m60.x0.audio_unavailable_in_location_text);
            Intrinsics.f(string);
            return string;
        }
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return "";
        }
        if (list.size() > 1) {
            String string2 = context.getResources().getString(m60.x0.music_attribution_view_play_list);
            Intrinsics.f(string2);
            return string2;
        }
        tp0.a aVar = (tp0.a) CollectionsKt.firstOrNull(list);
        Resources resources = context.getResources();
        int i13 = m60.x0.music_attribution_info_text;
        Object[] objArr = new Object[2];
        objArr[0] = aVar != null ? aVar.f118768a : null;
        objArr[1] = aVar != null ? aVar.f118769b : null;
        String string3 = resources.getString(i13, objArr);
        Intrinsics.f(string3);
        return string3;
    }

    public static SimpleDateFormat L(int i13, int i14) {
        String str;
        String str2;
        StringBuilder sb3 = new StringBuilder();
        if (i13 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i13 == 1) {
            str = "MMMM d, yyyy";
        } else if (i13 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i13 != 3) {
                throw new IllegalArgumentException(a.a.d("Unknown DateFormat style: ", i13));
            }
            str = "M/d/yy";
        }
        sb3.append(str);
        sb3.append(" ");
        if (i14 == 0 || i14 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i14 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i14 != 3) {
                throw new IllegalArgumentException(a.a.d("Unknown DateFormat style: ", i14));
            }
            str2 = "h:mm a";
        }
        sb3.append(str2);
        return new SimpleDateFormat(sb3.toString(), Locale.US);
    }

    public static m5 M(n6 n6Var, h32.u0 u0Var, h32.g0 g0Var, a4 a4Var, String str, h32.f1 eventType, HashMap hashMap, int i13) {
        h32.u0 u0Var2 = (i13 & 1) != 0 ? null : u0Var;
        h32.g0 g0Var2 = (i13 & 2) != 0 ? null : g0Var;
        a4 a4Var2 = (i13 & 4) != 0 ? null : a4Var;
        String str2 = (i13 & 8) != 0 ? null : str;
        HashMap auxData = (i13 & 32) != 0 ? new HashMap() : hashMap;
        Intrinsics.checkNotNullParameter(n6Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new m5(g3.p0(n6Var.f111725q, a4Var2, u0Var2, g0Var2, str2, eventType, auxData, 1));
    }

    public static void O(ku.c cVar, q8 q8Var) {
        cVar.A0 = q8Var;
    }

    public static void P(ot0.i iVar, x02.x0 x0Var) {
        iVar.D0 = x0Var;
    }

    public static void Q(ot0.i iVar, ag1.b bVar) {
        iVar.A0 = bVar;
    }

    public static void R(wr0.j jVar, q11.a aVar) {
        jVar.f130896m1 = aVar;
    }

    public static void S(wr0.j jVar, o7 o7Var) {
        jVar.f130895l1 = o7Var;
    }

    public static void T(UserImageView userImageView, zp.j jVar) {
        userImageView.f35222g = jVar;
    }

    public static void U(ot0.i iVar, x7 x7Var) {
        iVar.B0 = x7Var;
    }

    public static void V(mv0.i iVar, x02.i2 i2Var) {
        iVar.S0 = i2Var;
    }

    public static void W(mv0.i iVar, n8 n8Var) {
        iVar.T0 = n8Var;
    }

    public static void X(mv0.i iVar, uk1.e eVar) {
        iVar.R0 = eVar;
    }

    public static void Y(ku.c cVar, kt.a aVar) {
        cVar.B0 = aVar;
    }

    public static void Z(mv0.i iVar, androidx.recyclerview.widget.n3 n3Var) {
        iVar.U0 = n3Var;
    }

    public static final void a(uc0.d dVar, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(635869525);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(dVar)) ? 4 : 2) | i13;
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
                xe2.g V = p2.V(a13, sVar);
                sVar.X(1729797275);
                androidx.lifecycle.l1 v03 = v0(uc0.d.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                dVar = (uc0.d) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(dVar.f121825e, sVar);
            dVar.i(new uc0.i(new oc0.a(q2.i.c(-1413721571, new androidx.compose.foundation.lazy.layout.v(i16, z13, dVar), sVar))));
            gh0.b.d(((uc0.c) z13.getValue()).f121764b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(dVar, i13, i14, 3);
        }
    }

    public static void a0(ot0.i iVar, dl1.t tVar) {
        iVar.f97527z0 = tVar;
    }

    public static final void b(uc0.j2 j2Var, i2.o oVar, int i13, int i14) {
        int i15;
        i2.s sVar = (i2.s) oVar;
        sVar.Y(1730336191);
        if ((i13 & 14) == 0) {
            i15 = (((i14 & 1) == 0 && sVar.h(j2Var)) ? 4 : 2) | i13;
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
                androidx.lifecycle.l1 v03 = v0(uc0.j2.class, a13, V, a13 instanceof androidx.lifecycle.k ? ((androidx.lifecycle.k) a13).getDefaultViewModelCreationExtras() : u6.a.f120754b, sVar);
                sVar.r(false);
                sVar.r(false);
                j2Var = (uc0.j2) v03;
            }
            sVar.s();
            i2.q1 z13 = bs1.c.z(j2Var.f121825e, sVar);
            j2Var.i(new uc0.i(new oc0.a(q2.i.c(1484890759, new xb0.a(j2Var, 16), sVar))));
            gh0.b.d(((uc0.i2) z13.getValue()).f121797b, null, sVar, 8, 2);
        }
        i2.f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new yu.c(j2Var, i13, i14, 27);
        }
    }

    public static void b0(ot0.i iVar, i92.k kVar) {
        iVar.C0 = kVar;
    }

    public static if1 c(a.p1 nativeAdMapper) {
        rz0 rz0Var;
        rz0 rz0Var2;
        Intrinsics.checkNotNullParameter(nativeAdMapper, "nativeAdMapper");
        if1 if1Var = new if1();
        if1Var.f6369b = gf1.f5554a;
        if1Var.f6368a = 6;
        ArrayList f13 = nativeAdMapper.f();
        a.k2 k2Var = f13 != null ? (a.k2) CollectionsKt.firstOrNull(f13) : null;
        if (k2Var != null) {
            Drawable e13 = k2Var.e();
            Uri d2 = k2Var.d();
            if (d2 == null) {
                d2 = Uri.EMPTY;
            }
            Uri uri = d2;
            Intrinsics.f(uri);
            rz0Var = new rz0(e13, uri, k2Var.a(), k2Var.c(), k2Var.b());
        } else {
            rz0Var = null;
        }
        if1Var.f6373f = rz0Var;
        a.k2 icon = nativeAdMapper.getIcon();
        if (icon != null) {
            Drawable e14 = icon.e();
            Uri d13 = icon.d();
            if (d13 == null) {
                d13 = Uri.EMPTY;
            }
            Uri uri2 = d13;
            Intrinsics.f(uri2);
            rz0Var2 = new rz0(e14, uri2, icon.a(), icon.c(), icon.b());
        } else {
            rz0Var2 = null;
        }
        if1Var.f6374g = rz0Var2;
        for (Map.Entry entry : kotlin.collections.z0.g(new Pair("headline", nativeAdMapper.getHeadline()), new Pair("body", nativeAdMapper.getBody()), new Pair("advertiser", nativeAdMapper.getAdvertiser()), new Pair("call_to_action", nativeAdMapper.getCallToAction()), new Pair("store", nativeAdMapper.getStore()), new Pair("price", nativeAdMapper.getPrice())).entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (str2 != null) {
                if1Var.f6371d.put(str, str2);
            }
        }
        if1Var.f6378k = nativeAdMapper.a();
        if1Var.f6380m = nativeAdMapper.getHasVideoContent() ? new lq2() : null;
        if1Var.f6385r = nativeAdMapper.getExtras();
        if1Var.f6386s = nativeAdMapper.e();
        if1Var.f6387t = nativeAdMapper.c();
        return if1Var;
    }

    public static void c0(UserImageView userImageView, b60.b bVar) {
        userImageView.f35223h = bVar;
    }

    public static ss2 d() {
        return new ss2(new o52(), new v01(), new k72(), new g5());
    }

    public static boolean d0(EditText editText) {
        return editText.getInputType() != 0;
    }

    public static void e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static long e0(int i13, byte[] bArr) {
        return (((bArr[i13 + 3] & 255) << 24) | (bArr[i13] & 255) | ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13 + 2] & 255) << 16)) & 4294967295L;
    }

    public static void f(x92.b bVar) {
        bs1.c.h(bVar);
        bVar.h("board.images", "150x150");
        bVar.e("board.image_cover_hd_url");
        bVar.e("board.collaborating_users()");
    }

    public static final void f0(nx.d0 pinalytics, h32.f1 eventType, h32.g0 componentType, HashMap hashMap, hx musicAttribution, long j13, String str, h32.v0 v0Var) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(componentType, "componentType");
        Intrinsics.checkNotNullParameter(musicAttribution, "musicAttribution");
        String i13 = musicAttribution.i();
        if (i13 != null) {
            if (hashMap != null) {
                bs1.c.G1("pin_id", str, hashMap);
                hashMap.put("duration", String.valueOf(TimeUnit.MILLISECONDS.toSeconds(j13)));
                hashMap.put("isrc", i13);
                hashMap.put("song_title", musicAttribution.l());
                hashMap.put("artist", musicAttribution.g());
            }
            pinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : eventType, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : componentType, (r18 & 8) != 0 ? null : i13, (r18 & 32) != 0 ? null : hashMap, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
        }
    }

    public static void g(x92.b bVar) {
        n60.o.w(bVar, "shoprecommendationcollection.title", "shoprecommendationcollection.link_type", "shoprecommendationcollection.link_data", "shoprecommendationcollection.layout_params");
        n60.o.v(bVar, "shoprecommendationcollection.pins()", "shoprecommendationcollection.id", "shoprecommendationcollection.recommendation_type");
    }

    public static final void g0(nx.d0 pinalytics, String pinId, boolean z13, h32.g0 g0Var, h32.v0 v0Var) {
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        pinalytics.h0((r18 & 1) != 0 ? h32.f1.TAP : z13 ? h32.f1.VIDEO_MUTE : h32.f1.VIDEO_NO_MUTE, (r18 & 2) != 0 ? null : null, (r18 & 4) != 0 ? null : g0Var, (r18 & 8) != 0 ? null : pinId, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? v0Var : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
    }

    public static final void h(Animator animator, Function0 completion) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        animator.addListener(new zh0.a(0, completion));
    }

    public static final void h0(nu1.a inAppNavigator, String pinId) {
        Intrinsics.checkNotNullParameter(inAppNavigator, "inAppNavigator");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        inAppNavigator.a(new Uri.Builder().scheme("https").authority("ads.pinterest.com").path("create").appendQueryParameter("pin_id", pinId).build(), null, null, true, false);
    }

    public static final void i(Animator animator, Function0 completion) {
        Intrinsics.checkNotNullParameter(animator, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        animator.addListener(new zh0.a(1, completion));
    }

    public static final qp.k i0(wk2.a aVar, PinnableImageFeed pinnableImageFeed, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Object obj = aVar.get();
        qp.k kVar = (qp.k) obj;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.pinterest.EXTRA_FEED", pinnableImageFeed);
        bundle.putString("com.pinterest.EXTRA_URL", str);
        bundle.putString("com.pinterest.EXTRA_META", str2);
        bundle.putString("com.pinterest.CLOSEUP_PIN_ID", str3);
        kVar.setArguments(bundle);
        Intrinsics.checkNotNullExpressionValue(obj, "apply(...)");
        return kVar;
    }

    public static void j(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        w(view, true, yf0.a.f138952k);
    }

    public static final int j0(r1.m mVar, m1.f1 f1Var) {
        return (int) (f1Var == m1.f1.Vertical ? ((r1.b0) mVar).f105866q & 4294967295L : ((r1.b0) mVar).f105866q >> 32);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0296, code lost:
    
        if (r2.f120187d == r7) goto L647;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0117, code lost:
    
        if (r4.f120187d == r13) goto L534;
     */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0452 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:260:0x06c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06d7  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06e0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x06fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0716 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:286:0x06e3  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0595  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0597  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:368:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0685  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06b0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void k(u4.i r38, s4.d r39, java.util.ArrayList r40, int r41) {
        /*
            Method dump skipped, instructions count: 1827
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh2.c3.k(u4.i, s4.d, java.util.ArrayList, int):void");
    }

    public static void k0(pk.l2 l2Var, ObjectInputStream objectInputStream, int i13) {
        for (int i14 = 0; i14 < i13; i14++) {
            Collection collection = l2Var.get(objectInputStream.readObject());
            int readInt = objectInputStream.readInt();
            for (int i15 = 0; i15 < readInt; i15++) {
                collection.add(objectInputStream.readObject());
            }
        }
    }

    public static void l(View view, yf0.h insetMode) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(insetMode, "insetMode");
        int i13 = yf0.e.f138958a[insetMode.ordinal()];
        if (i13 == 1) {
            n(view, true);
            return;
        }
        if (i13 == 2) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            w(view, true, yf0.a.f138952k);
        } else {
            if (i13 != 3) {
                return;
            }
            m(view, true);
        }
    }

    public static int l0(ObjectInputStream objectInputStream) {
        return objectInputStream.readInt();
    }

    public static final void m(View view, boolean z13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        w(view, z13, yf0.a.f138953l);
    }

    public static final void m0(AnimatorSet animatorSet) {
        Intrinsics.checkNotNullParameter(animatorSet, "<this>");
        animatorSet.removeAllListeners();
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        Intrinsics.checkNotNullExpressionValue(childAnimations, "getChildAnimations(...)");
        for (Animator animator : childAnimations) {
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
                animator.removeAllListeners();
            }
        }
        animatorSet.cancel();
    }

    public static final void n(View view, boolean z13) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        w(view, z13, yf0.a.f138954m);
    }

    public static final List n0(Throwable th3) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (th3 != null && linkedHashSet.add(th3)) {
            th3 = th3.getCause();
        }
        return CollectionsKt.F0(linkedHashSet);
    }

    public static void p0(long j13, int i13, byte[] bArr) {
        int i14 = 0;
        while (i14 < 4) {
            bArr[i13 + i14] = (byte) (255 & j13);
            i14++;
            j13 >>= 8;
        }
    }

    public static final Object q(CompletableFuture completableFuture, bl2.c frame) {
        CompletableFuture completableFuture2 = completableFuture.toCompletableFuture();
        if (completableFuture2.isDone()) {
            try {
                return completableFuture2.get();
            } catch (ExecutionException e13) {
                Throwable cause = e13.getCause();
                if (cause == null) {
                    throw e13;
                }
                throw cause;
            }
        }
        ao2.o oVar = new ao2.o(1, cl2.h.b(frame));
        oVar.v();
        fo2.a aVar = new fo2.a();
        aVar.cont = oVar;
        completableFuture.handle((BiFunction) aVar);
        oVar.e(new dm2.r(completableFuture2, aVar));
        Object u13 = oVar.u();
        if (u13 == cl2.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return u13;
    }

    public static final int q0(long j13, long j14) {
        return Intrinsics.j(j13 ^ Long.MIN_VALUE, j14 ^ Long.MIN_VALUE);
    }

    public static final double r0(long j13) {
        return ((j13 >>> 11) * 2048) + (j13 & 2047);
    }

    public static byte[] s(byte[] bArr, byte[] bArr2) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException("The key length in bytes must be 32.");
        }
        byte b13 = 0;
        long e03 = e0(0, bArr) & 67108863;
        long e04 = (e0(3, bArr) >> 2) & 67108611;
        long e05 = (e0(6, bArr) >> 4) & 67092735;
        long e06 = (e0(9, bArr) >> 6) & 66076671;
        long e07 = (e0(12, bArr) >> 8) & 1048575;
        long j13 = e04 * 5;
        long j14 = e05 * 5;
        long j15 = e06 * 5;
        long j16 = e07 * 5;
        int i13 = 17;
        byte[] bArr3 = new byte[17];
        long j17 = 0;
        int i14 = 0;
        long j18 = 0;
        long j19 = 0;
        long j23 = 0;
        long j24 = 0;
        while (i14 < bArr2.length) {
            int min = Math.min(16, bArr2.length - i14);
            System.arraycopy(bArr2, i14, bArr3, b13, min);
            bArr3[min] = 1;
            if (min != 16) {
                Arrays.fill(bArr3, min + 1, i13, b13);
            }
            long e08 = j24 + (e0(b13, bArr3) & 67108863);
            long e09 = j17 + ((e0(3, bArr3) >> 2) & 67108863);
            long e010 = j18 + ((e0(6, bArr3) >> 4) & 67108863);
            long e011 = j19 + ((e0(9, bArr3) >> 6) & 67108863);
            long e012 = j23 + (((e0(12, bArr3) >> 8) & 67108863) | (bArr3[16] << 24));
            long j25 = (e012 * j13) + (e011 * j14) + (e010 * j15) + (e09 * j16) + (e08 * e03);
            long j26 = (e012 * j14) + (e011 * j15) + (e010 * j16) + (e09 * e03) + (e08 * e04);
            long j27 = (e012 * j15) + (e011 * j16) + (e010 * e03) + (e09 * e04) + (e08 * e05);
            long j28 = (e012 * j16) + (e011 * e03) + (e010 * e04) + (e09 * e05) + (e08 * e06);
            long j29 = e011 * e04;
            long j33 = e012 * e03;
            long j34 = j26 + (j25 >> 26);
            long j35 = j27 + (j34 >> 26);
            long j36 = j28 + (j35 >> 26);
            long j37 = j33 + j29 + (e010 * e05) + (e09 * e06) + (e08 * e07) + (j36 >> 26);
            long j38 = j37 >> 26;
            j23 = j37 & 67108863;
            long j39 = (j38 * 5) + (j25 & 67108863);
            long j43 = j39 & 67108863;
            j17 = (j34 & 67108863) + (j39 >> 26);
            i14 += 16;
            j18 = j35 & 67108863;
            j19 = j36 & 67108863;
            b13 = 0;
            i13 = 17;
            j24 = j43;
        }
        long j44 = j18 + (j17 >> 26);
        long j45 = j44 & 67108863;
        long j46 = j19 + (j44 >> 26);
        long j47 = j46 & 67108863;
        long j48 = j23 + (j46 >> 26);
        long j49 = j48 & 67108863;
        long j53 = ((j48 >> 26) * 5) + j24;
        long j54 = j53 >> 26;
        long j55 = j53 & 67108863;
        long j56 = (j17 & 67108863) + j54;
        long j57 = j55 + 5;
        long j58 = j57 & 67108863;
        long j59 = j56 + (j57 >> 26);
        long j63 = j45 + (j59 >> 26);
        long j64 = j47 + (j63 >> 26);
        long j65 = (j49 + (j64 >> 26)) - 67108864;
        long j66 = j65 >> 63;
        long j67 = ~j66;
        long j68 = (j56 & j66) | (j59 & 67108863 & j67);
        long j69 = (j45 & j66) | (j63 & 67108863 & j67);
        long j73 = (j47 & j66) | (j64 & 67108863 & j67);
        long j74 = ((j55 & j66) | (j58 & j67) | (j68 << 26)) & 4294967295L;
        long j75 = ((j68 >> 6) | (j69 << 20)) & 4294967295L;
        long j76 = ((j69 >> 12) | (j73 << 14)) & 4294967295L;
        long j77 = ((((j65 & j67) | (j49 & j66)) << 8) | (j73 >> 18)) & 4294967295L;
        long e013 = e0(16, bArr) + j74;
        long e014 = e0(20, bArr) + j75 + (e013 >> 32);
        long e015 = e0(24, bArr) + j76 + (e014 >> 32);
        long e016 = (e0(28, bArr) + j77 + (e015 >> 32)) & 4294967295L;
        byte[] bArr4 = new byte[16];
        p0(e013 & 4294967295L, 0, bArr4);
        p0(e014 & 4294967295L, 4, bArr4);
        p0(e015 & 4294967295L, 8, bArr4);
        p0(e016, 12, bArr4);
        return bArr4;
    }

    public static final String s0(long j13) {
        if (j13 >= 0) {
            String l13 = Long.toString(j13, CharsKt.checkRadix(10));
            Intrinsics.checkNotNullExpressionValue(l13, "toString(...)");
            return l13;
        }
        long j14 = 10;
        long j15 = ((j13 >>> 1) / j14) << 1;
        long j16 = j13 - (j15 * j14);
        if (j16 >= j14) {
            j16 -= j14;
            j15++;
        }
        StringBuilder sb3 = new StringBuilder();
        String l14 = Long.toString(j15, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l14, "toString(...)");
        sb3.append(l14);
        String l15 = Long.toString(j16, CharsKt.checkRadix(10));
        Intrinsics.checkNotNullExpressionValue(l15, "toString(...)");
        sb3.append(l15);
        return sb3.toString();
    }

    public static final void t(FragmentActivity fragmentActivity, boolean z13) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        vo.i iVar = Build.VERSION.SDK_INT >= 35 ? new vo.i(0) : new vo.i(1);
        Window window = fragmentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        switch (iVar.f126366a) {
            case 0:
                Intrinsics.checkNotNullParameter(window, "window");
                h1.b bVar = new h1.b(window.getDecorView());
                int i13 = Build.VERSION.SDK_INT;
                e3.b f2Var = i13 >= 35 ? new q5.f2(window, bVar) : i13 >= 30 ? new q5.e2(window, bVar) : new q5.d2(window, bVar);
                f2Var.j(z13);
                f2Var.i(z13);
                break;
            default:
                Intrinsics.checkNotNullParameter(window, "window");
                break;
        }
    }

    public static s80.j t0(s80.j jVar, t80.d dVar, boolean z13, int i13) {
        t80.d state = (i13 & 1) != 0 ? jVar.f111601j.f111840a : dVar;
        boolean z14 = (i13 & 2) != 0 ? jVar.f111601j.f111842c : z13;
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        Intrinsics.checkNotNullParameter(state, "state");
        return s80.j.e(jVar, null, null, null, null, null, null, null, null, null, w6.e(jVar.f111601j, state, null, z14, 2), null, null, false, false, false, null, 130559);
    }

    public static final zy.a u0(zy.l0 l0Var, h32.g0 g0Var, h32.u0 u0Var, h32.f1 eventType, a4 a4Var, d4 d4Var, String str, HashMap auxData) {
        Intrinsics.checkNotNullParameter(l0Var, "<this>");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(auxData, "auxData");
        return new zy.a(com.bumptech.glide.d.z0(l0Var.f143086a, new j1.p0(d4Var, a4Var, u0Var, g0Var, 17)), eventType, str, auxData, null, null, false, false, RecyclerViewTypes.VIEW_TYPE_ADS_CAROUSEL_PIN_ITEM);
    }

    public static androidx.lifecycle.j0 v(ja.h0 h0Var, tb.p pVar, vb.b bVar) {
        Object obj = new Object();
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0();
        j0Var.l(h0Var, new ub.f(bVar, obj, pVar, j0Var));
        return j0Var;
    }

    public static final androidx.lifecycle.l1 v0(Class modelClass, androidx.lifecycle.u1 owner, xe2.g factory, u6.c extras, i2.o oVar) {
        androidx.lifecycle.s1 s1Var;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        i2.s sVar = (i2.s) oVar;
        sVar.X(-1566358618);
        rl2.d modelClass2 = lb.l0.w0(modelClass);
        Intrinsics.checkNotNullParameter(owner, "<this>");
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (factory != null) {
            androidx.lifecycle.t1 store = owner.getViewModelStore();
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(factory, "factory");
            Intrinsics.checkNotNullParameter(extras, "extras");
            s1Var = new androidx.lifecycle.s1(store, factory, extras);
        } else {
            boolean z13 = owner instanceof androidx.lifecycle.k;
            if (z13) {
                androidx.lifecycle.t1 store2 = owner.getViewModelStore();
                androidx.lifecycle.p1 factory2 = ((androidx.lifecycle.k) owner).getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullParameter(store2, "store");
                Intrinsics.checkNotNullParameter(factory2, "factory");
                Intrinsics.checkNotNullParameter(extras, "extras");
                s1Var = new androidx.lifecycle.s1(store2, factory2, extras);
            } else {
                Intrinsics.checkNotNullParameter(owner, "owner");
                androidx.lifecycle.p1 factory3 = z13 ? ((androidx.lifecycle.k) owner).getDefaultViewModelProviderFactory() : w6.a.f128106a;
                Intrinsics.checkNotNullParameter(owner, "owner");
                u6.c extras2 = z13 ? ((androidx.lifecycle.k) owner).getDefaultViewModelCreationExtras() : u6.a.f120754b;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory3, "factory");
                Intrinsics.checkNotNullParameter(extras2, "extras");
                s1Var = new androidx.lifecycle.s1(owner.getViewModelStore(), factory3, extras2);
            }
        }
        androidx.lifecycle.l1 a13 = s1Var.a(modelClass2);
        sVar.r(false);
        return a13;
    }

    public static final void w(View view, final boolean z13, final kl2.l applyInsets) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(applyInsets, "applyInsets");
        Intrinsics.checkNotNullParameter(view, "view");
        final yf0.g gVar = new yf0.g(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        q5.v vVar = new q5.v() { // from class: tn.a
            @Override // q5.v
            public final a2 k(View v13, a2 insets) {
                l applyInsets2 = (l) applyInsets;
                g initialPadding = (g) gVar;
                Intrinsics.checkNotNullParameter(applyInsets2, "$applyInsets");
                Intrinsics.checkNotNullParameter(initialPadding, "$initialPadding");
                Intrinsics.checkNotNullParameter(v13, "v");
                Intrinsics.checkNotNullParameter(insets, "insets");
                applyInsets2.invoke(v13, insets, initialPadding);
                return z13 ? a2.f102399b : insets;
            }
        };
        WeakHashMap weakHashMap = q5.v0.f102521a;
        q5.m0.n(view, vVar);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new t3.a4(2, view, view));
        }
    }

    public static void w0(pk.l2 l2Var, ObjectOutputStream objectOutputStream) {
        objectOutputStream.writeInt(l2Var.a().size());
        for (Map.Entry entry : l2Var.a().entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(((Collection) entry.getValue()).size());
            Iterator it = ((Collection) entry.getValue()).iterator();
            while (it.hasNext()) {
                objectOutputStream.writeObject(it.next());
            }
        }
    }

    public static c3 x(int i13, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i13 = 2;
        }
        if (i13 == 0) {
            return new t4.i(dArr, dArr2);
        }
        if (i13 == 2) {
            double d2 = dArr[0];
            double[] dArr3 = dArr2[0];
            t4.c cVar = new t4.c();
            cVar.f116345a = d2;
            cVar.f116346b = dArr3;
            return cVar;
        }
        t4.h hVar = new t4.h();
        int length = dArr2[0].length;
        hVar.f116366c = new double[length];
        hVar.f116364a = dArr;
        hVar.f116365b = dArr2;
        if (length > 2) {
            double d13 = 0.0d;
            int i14 = 0;
            while (true) {
                double d14 = d13;
                if (i14 >= dArr.length) {
                    break;
                }
                double d15 = dArr2[i14][0];
                if (i14 > 0) {
                    Math.hypot(d15 - d13, d15 - d14);
                }
                i14++;
                d13 = d15;
            }
        }
        return hVar;
    }

    public static void x0(StringBuilder sb3, HashMap hashMap) {
        sb3.append("{");
        boolean z13 = true;
        for (String str : hashMap.keySet()) {
            if (!z13) {
                sb3.append(",");
            }
            String str2 = (String) hashMap.get(str);
            sb3.append("\"");
            sb3.append(str);
            sb3.append("\":");
            if (str2 == null) {
                sb3.append("null");
            } else {
                sb3.append("\"");
                sb3.append(str2);
                sb3.append("\"");
            }
            z13 = false;
        }
        sb3.append("}");
    }

    public static final String y(Bitmap bitmap) {
        if (bitmap == null) {
            return "#1A1A1A";
        }
        try {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, 1, 1, true);
            Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
            String B = B(createScaledBitmap.getPixel(0, 0));
            createScaledBitmap.recycle();
            return B;
        } catch (Exception unused) {
            return "#1A1A1A";
        }
    }

    public static final String z(Context context, ag1.b cache, vn0 mediaList) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cache, "cache");
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        bo0 k13 = mediaList.k();
        return y(D(context, cache, k13, k13.getStartTimeMs() + mediaList.getStartTimeMs()));
    }

    public abstract double F(double d2);

    public abstract void G(double d2, double[] dArr);

    public abstract void H(double d2, float[] fArr);

    public abstract double I(double d2);

    public abstract void J(double d2, double[] dArr);

    public abstract double[] K();

    public abstract float N(Object obj);

    public abstract void o0(float f13, Object obj);

    public abstract com.google.android.gms.common.api.k p(TimeUnit timeUnit);

    public abstract void r(com.google.common.util.concurrent.i iVar, Set set);

    public abstract int u(com.google.common.util.concurrent.l lVar);
}
