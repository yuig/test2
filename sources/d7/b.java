package d7;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.ZIndexElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.u1;
import androidx.lifecycle.w1;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.work.impl.WorkDatabase;
import b3.s0;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.g2;
import com.pinterest.api.model.b01;
import com.pinterest.api.model.h01;
import com.pinterest.api.model.wy0;
import com.pinterest.experiment.ExperimentsRefreshWorker;
import df.j1;
import ey.i2;
import h32.a4;
import h32.b4;
import h32.d4;
import h32.f1;
import h32.y3;
import i2.f2;
import i2.z1;
import i32.y0;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import lb.a1;
import org.xmlpull.v1.XmlPullParser;
import pc.o0;
import pk.c1;
import pk.p2;
import pk.v2;
import q3.p0;
import q5.v0;
import q5.w0;
import so.s8;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public static ExecutorService f53784a;

    /* renamed from: b */
    public static boolean f53785b;

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cb, code lost:
    
        if ((!r7.l(r11)) != false) goto L121;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(d3.h r10, e3.d r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.b.A(d3.h, e3.d):void");
    }

    public static final Drawable A0(Drawable drawable, int i13) {
        if (drawable == null) {
            return null;
        }
        Drawable mutate = drawable.mutate();
        mutate.setTint(i13);
        return mutate;
    }

    public static final void B(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        yk2.b bVar = new yk2.b();
        Cursor c13 = db3.c("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (c13.moveToNext()) {
            try {
                bVar.add(c13.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.f80348a;
        dl2.b.J(c13, null);
        ListIterator listIterator = kotlin.collections.e0.a(bVar).listIterator(0);
        while (true) {
            s2.y yVar = (s2.y) listIterator;
            if (!yVar.hasNext()) {
                return;
            }
            String triggerName = (String) yVar.next();
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (kotlin.text.z.p(triggerName, "room_fts_content_sync_", false)) {
                db3.B("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    public static int[] B0(Collection collection) {
        if (collection instanceof sk.b) {
            return ((sk.b) collection).b();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i13 = 0; i13 < length; i13++) {
            Object obj = array[i13];
            obj.getClass();
            iArr[i13] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void C(he0.b bVar, Uri uri) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        String queryParameter = uri.getQueryParameter("utm_campaign");
        String queryParameter2 = uri.getQueryParameter("utm_source");
        String queryParameter3 = uri.getQueryParameter("e_t_s");
        if (queryParameter3 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(rg0.o.CONTEXT_EMAIL_UTM_CAMPAIGN.getValue(), queryParameter);
            hashMap.put(rg0.o.CONTEXT_EMAIL_UTM_SOURCE.getValue(), queryParameter2);
            hashMap.put(rg0.o.CONTEXT_EMAIL_E_T_S.getValue(), queryParameter3);
            ((dh0.d) rg0.y.a()).i(y0.ANDROID_GLOBAL_NAG, hashMap);
        }
    }

    public static final List C0(String str, String str2) {
        return (str == null || kotlin.text.z.j(str)) ? q0.f80391a : yn2.c0.t(yn2.c0.k(yn2.c0.p(yn2.c0.j(yn2.c0.j(CollectionsKt.K(StringsKt.V(str, new char[]{','})), qz.u.f105436k), new qz.w(str2, 0)), qz.u.f105437l), qz.u.f105438m));
    }

    public static final void D(pc.e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        eVar.b(new vc.e());
    }

    public static final String D0(hc2.q qVar) {
        int i13 = oc2.g.f94084a[qVar.ordinal()];
        if (i13 == 1) {
            return "AdjacentPage";
        }
        if (i13 == 2) {
            return "GridToCloseup";
        }
        if (i13 == 3) {
            return "Grid";
        }
        if (i13 == 4) {
            return "PlayerReuse";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final Object E(oc.a aVar, vc.f fetchPolicy) {
        vc.m mVar;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fetchPolicy, "fetchPolicy");
        int i13 = vc.s.f125571a[fetchPolicy.ordinal()];
        if (i13 == 1) {
            mVar = vc.r.f125565a;
        } else if (i13 == 2) {
            mVar = vc.r.f125566b;
        } else if (i13 == 3) {
            mVar = vc.r.f125567c;
        } else if (i13 == 4) {
            mVar = vc.r.f125568d;
        } else {
            if (i13 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            mVar = vc.r.f125569e;
        }
        aVar.b(new vc.g(mVar));
        return aVar;
    }

    public static Integer E0(String str) {
        Long valueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i13 = str.charAt(0) == '-' ? 1 : 0;
            if (i13 != str.length()) {
                int i14 = i13 + 1;
                int a13 = sk.c.a(str.charAt(i13));
                if (a13 >= 0 && a13 < 10) {
                    long j13 = -a13;
                    long j14 = 10;
                    long j15 = Long.MIN_VALUE / j14;
                    while (true) {
                        if (i14 < str.length()) {
                            int i15 = i14 + 1;
                            int a14 = sk.c.a(str.charAt(i14));
                            if (a14 < 0 || a14 >= 10 || j13 < j15) {
                                break;
                            }
                            long j16 = j13 * j14;
                            long j17 = a14;
                            if (j16 < j17 - Long.MIN_VALUE) {
                                break;
                            }
                            j13 = j16 - j17;
                            i14 = i15;
                        } else if (i13 != 0) {
                            valueOf = Long.valueOf(j13);
                        } else if (j13 != Long.MIN_VALUE) {
                            valueOf = Long.valueOf(-j13);
                        }
                    }
                }
            }
        }
        valueOf = null;
        if (valueOf == null || valueOf.longValue() != valueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(valueOf.intValue());
    }

    public static final Object F(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.S(list);
    }

    public static final void F0(hs1.q qVar, List list) {
        Iterator it = CollectionsKt.K(list).iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i14 = i13 + 1;
            if (i13 < 0) {
                kotlin.collections.f0.p();
                throw null;
            }
            String str = (String) next;
            new i2(str, i13).i();
            ((hs1.m) qVar).q(str, null, new qz.d0(str, 0));
            i13 = i14;
        }
    }

    public static final String G(long j13) {
        if (j13 < 1000) {
            return j13 + " bps";
        }
        long j14 = 1000;
        long j15 = j13 / j14;
        if (j15 < 1000) {
            return j15 + " kbps";
        }
        return (j15 / j14) + " mbps";
    }

    public static final ja.c0 G0(o0 o0Var, pc.v customScalarAdapters) {
        Intrinsics.checkNotNullParameter(o0Var, "<this>");
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        tc.m mVar = new tc.m();
        mVar.s();
        customScalarAdapters.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.d(null, Boolean.TRUE);
        Intrinsics.checkNotNullParameter(customScalarAdapters, "customScalarAdapters");
        linkedHashMap.putAll(customScalarAdapters.f99609c);
        pc.b j13 = customScalarAdapters.f99608b.j();
        j13.f99514c = Boolean.TRUE;
        ae.s adapterContext = j13.a();
        Intrinsics.checkNotNullParameter(adapterContext, "adapterContext");
        o0Var.e(mVar, new pc.v(linkedHashMap, adapterContext));
        mVar.v();
        Object c13 = mVar.c();
        Intrinsics.g(c13, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
        return new ja.c0(2, (Map) c13);
    }

    public static final String H(String pinId) {
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        if (pinId.length() <= 5 || !kotlin.text.z.p(pinId, "A", false)) {
            return pinId;
        }
        String substring = pinId.substring(0, 5);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public static pb.k H0(oc.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        return new pb.k(new vc.y(aVar, false, false, null));
    }

    public static final View I(ViewGroup viewGroup, int i13) {
        View childAt = viewGroup.getChildAt(i13);
        if (childAt != null) {
            return childAt;
        }
        StringBuilder s13 = a.a.s("Index: ", i13, ", Size: ");
        s13.append(viewGroup.getChildCount());
        throw new IndexOutOfBoundsException(s13.toString());
    }

    public static final u2.q I0(u2.q qVar, float f13) {
        return qVar.j(new ZIndexElement(f13));
    }

    public static final u1 J(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (u1) yn2.c0.l(yn2.c0.q(yn2.x.e(view, w1.f18718j), w1.f18719k));
    }

    public static synchronized Executor K() {
        ExecutorService executorService;
        synchronized (b.class) {
            try {
                if (f53784a == null) {
                    int i13 = n0.f53866a;
                    f53784a = Executors.newSingleThreadExecutor(new h6.a("ExoPlayer:BackgroundExecutor", 1));
                }
                executorService = f53784a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return executorService;
    }

    public static String L(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i13 = 0; i13 < attributeCount; i13++) {
            if (xmlPullParser.getAttributeName(i13).equals(str)) {
                return xmlPullParser.getAttributeValue(i13);
            }
        }
        return null;
    }

    public static final vc.d M(pc.h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        return (vc.d) hVar.f99566f.a(vc.d.f125517h);
    }

    public static int[] N(int[] iArr) {
        for (int i13 = 0; i13 < iArr.length; i13++) {
            int i14 = iArr[i13];
            if (i14 == 16842912) {
                return iArr;
            }
            if (i14 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i13] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static final w0 O(ViewGroup viewGroup) {
        return new w0(viewGroup, 0);
    }

    public static ColorStateList P(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !n5.i.t(drawable)) {
            return null;
        }
        colorStateList = n5.i.d(drawable).getColorStateList();
        return colorStateList;
    }

    public static Set Q() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", new Class[0]).invoke(null, new Object[0]);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    public static final il1.a R(FragmentActivity fragmentActivity) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "<this>");
        if (fragmentActivity instanceof cp1.p) {
            return (il1.a) ((s8) ((cp1.p) fragmentActivity).getBaseActivityComponent()).f114581z.get();
        }
        throw new IllegalStateException(fragmentActivity + " is not extending [BaseActivity]");
    }

    public static final int S(wa2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar.Z ? eo1.b.color_themed_text_light : eo1.b.color_themed_text_default;
    }

    public static final vn1.c T(wa2.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar.Z ? vn1.c.LIGHT : vn1.c.DEFAULT;
    }

    public static final String U(String str) {
        String str2 = kotlin.text.z.h(str, "_t1.mp4", false) ? "MP4 T1" : kotlin.text.z.h(str, "_t2.mp4", false) ? "MP4 T2" : kotlin.text.z.h(str, "_t3.mp4", false) ? "MP4 T3" : kotlin.text.z.h(str, "_t4.mp4", false) ? "MP4 T4" : kotlin.text.z.h(str, "_t5.mp4", false) ? "MP4 T5" : kotlin.text.z.h(str, ".mpd", false) ? "DASH" : kotlin.text.z.h(str, "_240w.cmfv", false) ? "DASH T1" : kotlin.text.z.h(str, "_360w.cmfv", false) ? "DASH T2" : kotlin.text.z.h(str, "_480w.cmfv", false) ? "DASH T3" : kotlin.text.z.h(str, "_640w.cmfv", false) ? "DASH T4" : kotlin.text.z.h(str, "_720w.cmfv", false) ? "DASH T5" : kotlin.text.z.h(str, ".m3u8", false) ? "HLS" : StringsKt.E(str, "hls240w", false) ? "HLS T1" : StringsKt.E(str, "hls360w", false) ? "HLS T2" : StringsKt.E(str, "hls480w", false) ? "HLS T3" : StringsKt.E(str, "hls640w", false) ? "HLS T4" : StringsKt.E(str, "hls720w", false) ? "HLS T5" : "UNKNOWN";
        return (StringsKt.E(str, "hevcMp4V2", false) || !StringsKt.E(str2, "MP4", false)) ? str2 : "Old ".concat(str2);
    }

    public static final bc2.j V(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return kotlin.text.z.h(url, ".mpd", true) ? bc2.j.DASH : kotlin.text.z.h(url, ".mp4", true) ? bc2.j.MP4 : kotlin.text.z.h(url, ".m3u8", true) ? bc2.j.HLS : bc2.j.OTHER;
    }

    public static final h01 W(b01 b01Var) {
        Intrinsics.checkNotNullParameter(b01Var, "<this>");
        return X(b01Var.g());
    }

    public static final h01 X(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        h01 h01Var = (h01) map.get("V_DASH_HEVC");
        if (h01Var != null) {
            return h01Var;
        }
        h01 h01Var2 = (h01) map.get("V_HLSV3_MOBILE");
        if (h01Var2 != null) {
            return h01Var2;
        }
        h01 h01Var3 = (h01) map.get("V_HEVC_MP4_T1_V2");
        if (h01Var3 != null) {
            return h01Var3;
        }
        h01 h01Var4 = (h01) map.get("V_HEVC_MP4_T2_V2");
        if (h01Var4 != null) {
            return h01Var4;
        }
        h01 h01Var5 = (h01) map.get("V_HEVC_MP4_T3_V2");
        if (h01Var5 != null) {
            return h01Var5;
        }
        h01 h01Var6 = (h01) map.get("V_HEVC_MP4_T4_V2");
        return h01Var6 == null ? (h01) map.get("V_HEVC_MP4_T5_V2") : h01Var6;
    }

    public static final fm1.c Y(TypedArray typedArray, int i13, fm1.c cVar) {
        Intrinsics.checkNotNullParameter(typedArray, "<this>");
        Intrinsics.checkNotNullParameter(cVar, "default");
        int i14 = typedArray.getInt(i13, cVar.getVisibility());
        return i14 != 0 ? i14 != 1 ? fm1.c.GONE : fm1.c.INVISIBLE : fm1.c.VISIBLE;
    }

    public static final fm1.c Z(boolean z13) {
        return z13 ? fm1.c.VISIBLE : fm1.c.GONE;
    }

    public static final long a(int i13, int i14) {
        return (i14 & 4294967295L) | (i13 << 32);
    }

    public static int a0(int i13, int i14, int i15, int[] iArr) {
        while (i14 < i15) {
            if (iArr[i14] == i13) {
                return i14;
            }
            i14++;
        }
        return -1;
    }

    public static final void b(kc0.a displayState, u2.q qVar, i2.o oVar, int i13, int i14) {
        Intrinsics.checkNotNullParameter(displayState, "displayState");
        i2.s sVar = (i2.s) oVar;
        sVar.Y(-1138796504);
        int i15 = i14 & 2;
        u2.n nVar = u2.n.f120041b;
        if (i15 != 0) {
            qVar = nVar;
        }
        u2.q b13 = androidx.compose.ui.draw.a.b(qVar, v1.i.a(com.bumptech.glide.d.A(eo1.c.rounding_400, sVar)));
        p0 e13 = p1.q.e(u2.b.f120013a, false);
        int i16 = sVar.P;
        z1 o13 = sVar.o();
        u2.q X = ao2.m0.X(sVar, b13);
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
        tb.f.f0(sVar, e13, s3.j.f110801e);
        tb.f.f0(sVar, o13, s3.j.f110800d);
        s3.h hVar = s3.j.f110802f;
        if (sVar.O || !Intrinsics.d(sVar.J(), Integer.valueOf(i16))) {
            ep.b.y(i16, sVar, i16, hVar);
        }
        tb.f.f0(sVar, X, s3.j.f110799c);
        sVar.W(-413491643);
        if (displayState.f79130c) {
            p1.q.a(androidx.compose.foundation.a.b(nVar, androidx.compose.ui.graphics.a.c(((Number) displayState.f79129b.a((Context) sVar.m(AndroidCompositionLocals_androidKt.f17455b))).intValue()), s0.f21349a).j(androidx.compose.foundation.layout.e.f17184c), sVar, 0);
        }
        sVar.r(false);
        dl2.b.f(displayState.f79128a, androidx.compose.foundation.layout.e.f17184c, null, null, sVar, 48, 12);
        sVar.r(true);
        f2 t13 = sVar.t();
        if (t13 != null) {
            t13.f71113d = new q1.l(i13, i14, 11, displayState, qVar);
        }
    }

    public static final int b0(int i13, int i14) {
        return (i13 >> i14) & 31;
    }

    public static Object c(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static final d6.g c0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d6.g(name);
    }

    public static final void d(com.pinterest.framework.screens.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (((jl1.a) mVar).f76941e) {
            return;
        }
        mVar.activate();
    }

    public static final boolean d0(float[] fArr, float[] fArr2) {
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        float f16 = fArr[3];
        float f17 = fArr[4];
        float f18 = fArr[5];
        float f19 = fArr[6];
        float f23 = fArr[7];
        float f24 = fArr[8];
        float f25 = fArr[9];
        float f26 = fArr[10];
        float f27 = fArr[11];
        float f28 = fArr[12];
        float f29 = fArr[13];
        float f33 = fArr[14];
        float f34 = fArr[15];
        float f35 = (f13 * f18) - (f14 * f17);
        float f36 = (f13 * f19) - (f15 * f17);
        float f37 = (f13 * f23) - (f16 * f17);
        float f38 = (f14 * f19) - (f15 * f18);
        float f39 = (f14 * f23) - (f16 * f18);
        float f41 = (f15 * f23) - (f16 * f19);
        float f43 = (f24 * f29) - (f25 * f28);
        float f44 = (f24 * f33) - (f26 * f28);
        float f45 = (f24 * f34) - (f27 * f28);
        float f46 = (f25 * f33) - (f26 * f29);
        float f47 = (f25 * f34) - (f27 * f29);
        float f48 = (f26 * f34) - (f27 * f33);
        float f49 = (f41 * f43) + (((f38 * f45) + ((f37 * f46) + ((f35 * f48) - (f36 * f47)))) - (f39 * f44));
        if (f49 == 0.0f) {
            return false;
        }
        float f53 = 1.0f / f49;
        fArr2[0] = ((f23 * f46) + ((f18 * f48) - (f19 * f47))) * f53;
        fArr2[1] = (((f15 * f47) + ((-f14) * f48)) - (f16 * f46)) * f53;
        fArr2[2] = ((f34 * f38) + ((f29 * f41) - (f33 * f39))) * f53;
        fArr2[3] = (((f26 * f39) + ((-f25) * f41)) - (f27 * f38)) * f53;
        float f54 = -f17;
        fArr2[4] = (((f19 * f45) + (f54 * f48)) - (f23 * f44)) * f53;
        fArr2[5] = ((f16 * f44) + ((f48 * f13) - (f15 * f45))) * f53;
        float f55 = -f28;
        fArr2[6] = (((f33 * f37) + (f55 * f41)) - (f34 * f36)) * f53;
        fArr2[7] = ((f27 * f36) + ((f41 * f24) - (f26 * f37))) * f53;
        fArr2[8] = ((f23 * f43) + ((f17 * f47) - (f18 * f45))) * f53;
        fArr2[9] = (((f45 * f14) + ((-f13) * f47)) - (f16 * f43)) * f53;
        fArr2[10] = ((f34 * f35) + ((f28 * f39) - (f29 * f37))) * f53;
        fArr2[11] = (((f37 * f25) + ((-f24) * f39)) - (f27 * f35)) * f53;
        fArr2[12] = (((f18 * f44) + (f54 * f46)) - (f19 * f43)) * f53;
        fArr2[13] = ((f15 * f43) + ((f13 * f46) - (f14 * f44))) * f53;
        fArr2[14] = (((f29 * f36) + (f55 * f38)) - (f33 * f35)) * f53;
        fArr2[15] = ((f26 * f35) + ((f24 * f38) - (f25 * f36))) * f53;
        return true;
    }

    public static long e(AtomicLong atomicLong, long j13) {
        long j14;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j14, h(j14, j13)));
        return j14;
    }

    public static boolean e0(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static void f(x92.b apiFieldsMap) {
        com.bumptech.glide.d.e(apiFieldsMap);
        apiFieldsMap.e("user.image_medium_url");
        apiFieldsMap.e("user.image_large_url");
        apiFieldsMap.e("user.image_xlarge_url");
        apiFieldsMap.e("user.profile_cover()");
        n60.o.v(apiFieldsMap, "profilecoversource.source_id", "profilecoversource.source", "profilecoversource.images[1200x]");
        xk2.v vVar = n00.i0.f88779a;
        Intrinsics.checkNotNullParameter(apiFieldsMap, "apiFieldsMap");
        apiFieldsMap.e("profilecoversource.video()");
        n00.i0.b(apiFieldsMap);
        apiFieldsMap.e("video.signature");
        n60.o.w(apiFieldsMap, "user.email", "user.board_count", "user.secret_board_count", "user.pin_count");
        n60.o.w(apiFieldsMap, "user.created_at", "user.is_employee", "user.resurrection_info", "user.most_recent_board_sort_order");
        n60.o.w(apiFieldsMap, "user.following_count", "user.interest_following_count", "user.country", "user.has_catalog");
        n60.o.w(apiFieldsMap, "user.about", "user.location", "user.connected_to_facebook", "user.connected_to_instagram");
        n60.o.w(apiFieldsMap, "user.connected_to_etsy", "user.connected_to_youtube", "user.dsa_opted_out", "user.exclude_from_search");
        n60.o.w(apiFieldsMap, "user.third_party_marketing_tracking_enabled", "user.personalize_from_offsite_browsing", "user.ads_customize_from_conversion", "user.ccpa_opted_out");
        n60.o.w(apiFieldsMap, "user.businesses()", "user.owners()", "user.login_state", "user.live_creator_type");
        n60.o.w(apiFieldsMap, "user.is_private_profile", "user.is_under_16", "user.is_under_18", "user.is_candidate_for_parental_control_passcode");
        n60.o.w(apiFieldsMap, "user.is_parental_control_passcode_enabled", "user.parental_control_anonymized_email", "user.is_name_eligible_for_lead_form_autofill", "user.is_email_eligible_for_lead_form_autofill");
        n60.o.v(apiFieldsMap, "user.is_age_eligible_for_lead_form_autofill", "user.is_gender_eligible_for_lead_form_autofill", "user.is_country_eligible_for_lead_form_autofill");
    }

    public static final boolean f0(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return (V(url) != bc2.j.MP4 || kotlin.text.z.h(url, "warm.mpd", false) || kotlin.text.z.h(url, "warm.mp4", false)) ? false : true;
    }

    public static void g(AtomicLong atomicLong, long j13) {
        long j14;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MIN_VALUE || j14 == Long.MAX_VALUE) {
                return;
            }
        } while (!atomicLong.compareAndSet(j14, h(j14, j13)));
    }

    public static boolean g0(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static long h(long j13, long j14) {
        long j15 = j13 + j14;
        if (j15 < 0) {
            return Long.MAX_VALUE;
        }
        return j15;
    }

    public static boolean h0(XmlPullParser xmlPullParser, String str) {
        return g0(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static final void i(x92.b bVar) {
        n60.o.C(bVar, "<this>", "pin.carousel_data()", "pincarouseldata.id", "pincarouseldata.index");
        n60.o.w(bVar, "pincarouseldata.carousel_slots", "pin.dominant_color", "pincarouselslot.details", "pincarouselslot.images[345x,750x]");
        n60.o.w(bVar, "pincarouselslot.id", "pincarouselslot.link", "pincarouselslot.ad_destination_url", "pincarouselslot.title");
        n60.o.w(bVar, "pincarouselslot.domain", "pincarouselslot.rich_metadata", "aggregatedpindata.pin_tags_chips", "pincarouselslot.android_deep_link");
        n60.o.w(bVar, "pincarouselslot.item_id", "pincarouseldata.rich_metadata()", "pincarouseldata.rich_summary()", "pincarouselslot.rich_summary");
    }

    public static final boolean i0(wy0 wy0Var) {
        if (wy0Var != null) {
            return Intrinsics.d(c91.h.ALLOWED.getValue(), wy0Var.D4());
        }
        return false;
    }

    public static final Object j0(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return CollectionsKt.b0(list);
    }

    public static List k(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new sk.b(0, iArr.length, iArr);
    }

    public static final void k0(String linkHeader, dc2.e eVar) {
        Intrinsics.checkNotNullParameter(linkHeader, "linkHeader");
        if (kotlin.text.z.j(linkHeader)) {
            return;
        }
        hs1.q a13 = hs1.t.a();
        as1.b a14 = as1.b.a();
        String c13 = a14.c();
        Intrinsics.checkNotNullExpressionValue(c13, "getDisplayMediumImageWidth(...)");
        List C0 = C0(linkHeader, c13);
        if (!C0.isEmpty()) {
            F0(a13, C0);
        } else {
            String f13 = a14.f();
            Intrinsics.checkNotNullExpressionValue(f13, "getFallbackMediumImageResolution(...)");
            F0(a13, C0(linkHeader, f13));
        }
        if (eVar != null) {
            F0(a13, kotlin.text.z.j(linkHeader) ? q0.f80391a : yn2.c0.t(yn2.c0.k(yn2.c0.p(yn2.c0.j(CollectionsKt.K(StringsKt.V(linkHeader, new char[]{','})), qz.o.f105417k), qz.o.f105418l), qz.o.f105419m)));
            for (Pair pair : kotlin.text.z.j(linkHeader) ? q0.f80391a : yn2.c0.t(yn2.c0.k(yn2.c0.p(yn2.c0.j(CollectionsKt.K(StringsKt.V(linkHeader, new char[]{','})), qz.o.f105420n), qz.o.f105421o), qz.o.f105422p))) {
                String str = (String) pair.f80346a;
                String str2 = (String) pair.f80347b;
                z7.i iVar = (z7.i) eVar.f54404l.getValue();
                Uri parse = Uri.parse(str);
                pk.y0 y0Var = c1.f100372b;
                DownloadRequest downloadRequest = new DownloadRequest(str2, parse, null, v2.f100502e, null, null, null, null);
                iVar.f140946e++;
                iVar.f140943b.obtainMessage(7, 0, 0, downloadRequest).sendToTarget();
            }
        }
    }

    public static final void l(pc.g gVar, vc.d cacheInfo) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(cacheInfo, "cacheInfo");
        gVar.a(cacheInfo);
    }

    public static void l0(AtomicLong atomicLong, long j13) {
        long j14;
        long j15;
        do {
            j14 = atomicLong.get();
            if (j14 == Long.MAX_VALUE) {
                return;
            }
            j15 = j14 - j13;
            if (j15 < 0) {
                lb.l0.R0(new IllegalStateException(a.a.g("More produced than requested: ", j15)));
                j15 = 0;
            }
        } while (!atomicLong.compareAndSet(j14, j15));
    }

    public static final void m(lb.j0 j0Var, String str) {
        a1 b13;
        WorkDatabase workDatabase = j0Var.f82607d;
        Intrinsics.checkNotNullExpressionValue(workDatabase, "workManagerImpl.workDatabase");
        tb.y y13 = workDatabase.y();
        tb.c t13 = workDatabase.t();
        ArrayList l13 = kotlin.collections.f0.l(str);
        while (!l13.isEmpty()) {
            String str2 = (String) kotlin.collections.k0.B(l13);
            kb.s0 i13 = y13.i(str2);
            if (i13 != kb.s0.SUCCEEDED && i13 != kb.s0.FAILED) {
                ja.d0 d0Var = y13.f117050a;
                d0Var.b();
                tb.u uVar = y13.f117055f;
                oa.i a13 = uVar.a();
                a13.c1(1, str2);
                try {
                    d0Var.c();
                    try {
                        a13.G();
                        d0Var.r();
                    } finally {
                    }
                } finally {
                    uVar.j(a13);
                }
            }
            l13.addAll(t13.e(str2));
        }
        lb.o oVar = j0Var.f82610g;
        Intrinsics.checkNotNullExpressionValue(oVar, "workManagerImpl.processor");
        synchronized (oVar.f82647k) {
            kb.b0.e().a(lb.o.f82636l, "Processor cancelling " + str);
            oVar.f82645i.add(str);
            b13 = oVar.b(str);
        }
        lb.o.d(str, b13, 1);
        Iterator it = j0Var.f82609f.iterator();
        while (it.hasNext()) {
            ((lb.q) it.next()).a(str);
        }
    }

    public static final Cursor m0(ja.d0 db3, ja.f0 sqLiteQuery, boolean z13) {
        Intrinsics.checkNotNullParameter(db3, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor c13 = db3.o(sqLiteQuery, null);
        if (z13 && (c13 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c13;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                Intrinsics.checkNotNullParameter(c13, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c13.getColumnNames(), c13.getCount());
                    while (c13.moveToNext()) {
                        Object[] objArr = new Object[c13.getColumnCount()];
                        int columnCount = c13.getColumnCount();
                        for (int i13 = 0; i13 < columnCount; i13++) {
                            int type = c13.getType(i13);
                            if (type == 0) {
                                objArr[i13] = null;
                            } else if (type == 1) {
                                objArr[i13] = Long.valueOf(c13.getLong(i13));
                            } else if (type == 2) {
                                objArr[i13] = Double.valueOf(c13.getDouble(i13));
                            } else if (type == 3) {
                                objArr[i13] = c13.getString(i13);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i13] = c13.getBlob(i13);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    dl2.b.J(c13, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c13;
    }

    public static void n(String str, boolean z13) {
        if (!z13) {
            throw new IllegalArgumentException(str);
        }
    }

    public static i6.b n0(MappedByteBuffer mappedByteBuffer) {
        long j13;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i13 = duplicate.getShort() & 65535;
        if (i13 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i14 = 0;
        while (true) {
            if (i14 >= i13) {
                j13 = -1;
                break;
            }
            int i15 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j13 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i15) {
                break;
            }
            i14++;
        }
        if (j13 != -1) {
            duplicate.position(duplicate.position() + ((int) (j13 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j14 = duplicate.getInt() & 4294967295L;
            for (int i16 = 0; i16 < j14; i16++) {
                int i17 = duplicate.getInt();
                long j15 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i17 || 1701669481 == i17) {
                    duplicate.position((int) (j15 + j13));
                    i6.b bVar = new i6.b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    bVar.f71621b = duplicate;
                    bVar.f71620a = position;
                    int i18 = position - duplicate.getInt(position);
                    bVar.f71622c = i18;
                    bVar.f71623d = bVar.f71621b.getShort(i18);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static void o(Object obj) {
        p(obj, "Argument must not be null");
    }

    public static final void o0(he0.b bVar, Uri uri, String source) {
        Uri uri2;
        d4 d4Var;
        a4 a4Var;
        String replacement;
        String str;
        a4 a13;
        String queryParameter;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(source, "source");
        qb0.e eVar = qb0.d.f103396a;
        try {
            uri2 = Uri.parse(URLDecoder.decode(uri.toString(), "UTF-8"));
        } catch (Exception e13) {
            ((tb0.h) ob0.b.f93978b).o("NetworkUtils:GetDecodedUri", e13);
            uri2 = null;
        }
        String g13 = ((b60.d) bVar.getActiveUserManager()).g();
        if (g13 == null) {
            g13 = "";
        }
        boolean z13 = bVar.v5() && !Intrinsics.d(source, "SOURCE_APP_WIDGET");
        String queryParameter2 = uri.getQueryParameter("utm_pai");
        String str2 = g13;
        String str3 = "tracking_id";
        String str4 = "";
        String str5 = "cl_";
        boolean z14 = z13;
        if (queryParameter2 != null && !kotlin.text.z.j(queryParameter2)) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(uri, "uri");
            HashMap hashMap = new HashMap();
            Uri referrer = bVar.getReferrer();
            String uri3 = referrer != null ? referrer.toString() : null;
            if (uri3 == null) {
                uri3 = str4;
            }
            String C = kotlin.text.e0.C(4096, uri3);
            Uri referrer2 = bVar.getReferrer();
            String host = referrer2 != null ? referrer2.getHost() : null;
            if (host == null) {
                host = str4;
            }
            a4 a4Var2 = StringsKt.E(C, "app.appsflyer.com", false) ? a4.SERVICE_ENTRY_PAID_DEEPLINK_MMP : StringsKt.E(C, "pinterest.onelink.me", false) ? a4.SERVICE_ENTRY_PAID_DEEPLINK_MMP : StringsKt.E(C, "preload", false) ? a4.SERVICE_ENTRY_PAID_PRELOAD : j1.f1(uri) ? a4.SERVICE_ENTRY_PAID_WEB : j1.X0(uri) ? a4.SERVICE_ENTRY_PAID_DEEPLINK_DIRECT : a4.SERVICE_ENTRY_PAID_OTHER;
            String queryParameter3 = uri.getQueryParameter("af_ad_id");
            if (queryParameter3 == null || queryParameter3.length() == 0) {
                String queryParameter4 = uri.getQueryParameter("creative_id");
                queryParameter = (queryParameter4 == null || queryParameter4.length() == 0) ? str4 : uri.getQueryParameter("creative_id");
            } else {
                queryParameter = uri.getQueryParameter("af_ad_id");
            }
            hashMap.put("app_start_source", h32.j.WEB_URL.toString());
            String uri4 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri4, "toString(...)");
            hashMap.put("full_url", kotlin.text.e0.C(4096, uri4));
            String uri5 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri5, "toString(...)");
            hashMap.put("current_page_url", kotlin.text.e0.C(4096, uri5));
            hashMap.put("referrer_url", C);
            hashMap.put("referrer", host);
            Uri referrer3 = bVar.getReferrer();
            String queryParameter5 = referrer3 != null ? referrer3.getQueryParameter("pid") : null;
            hashMap.put("deep_link_source", queryParameter5 == null ? str4 : queryParameter5);
            String queryParameter6 = uri.getQueryParameter("af_dp");
            if (queryParameter6 == null) {
                queryParameter6 = str4;
            }
            hashMap.put("link_href", queryParameter6);
            String queryParameter7 = uri.getQueryParameter("af_c_id");
            if (queryParameter7 == null) {
                queryParameter7 = str4;
            }
            hashMap.put("campaign_id", queryParameter7);
            hashMap.put("creative_id", String.valueOf(queryParameter));
            String queryParameter8 = uri.getQueryParameter("utm_pai");
            if (queryParameter8 == null) {
                queryParameter8 = str4;
            }
            hashMap.put("utm_pai", queryParameter8);
            String queryParameter9 = uri.getQueryParameter("utm_source");
            if (queryParameter9 == null) {
                queryParameter9 = str4;
            }
            hashMap.put("utm_source", queryParameter9);
            String queryParameter10 = uri.getQueryParameter("utm_campaign");
            if (queryParameter10 == null) {
                queryParameter10 = str4;
            }
            hashMap.put("utm_campaign", queryParameter10);
            String queryParameter11 = uri.getQueryParameter("utm_medium");
            if (queryParameter11 == null) {
                queryParameter11 = str4;
            }
            hashMap.put("utm_medium", queryParameter11);
            String queryParameter12 = uri.getQueryParameter("preload");
            hashMap.put("preload", queryParameter12 == null ? str4 : queryParameter12);
            bVar.p3().b(new h32.i0(d4.SERVICE_ENTRY_PAID, a4Var2, null, null, null, null), f1.SERVICE_ENTRY, null, hashMap, false);
            return;
        }
        if (uri2 == null || Intrinsics.d(uri2.getHost(), "post.pinterest.com") || z14) {
            return;
        }
        String inviteCode = uri2.getQueryParameter("invite_code");
        if (inviteCode != null && !kotlin.text.z.j(inviteCode)) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            Intrinsics.checkNotNullParameter(inviteCode, "inviteCode");
            HashMap hashMap2 = new HashMap();
            hashMap2.put("app_start_source", h32.j.WEB_URL.toString());
            String uri6 = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(uri6, "toString(...)");
            hashMap2.put("full_url", uri6);
            String uri7 = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(uri7, "toString(...)");
            hashMap2.put("current_page_url", uri7);
            Uri referrer4 = bVar.getReferrer();
            String uri8 = referrer4 != null ? referrer4.toString() : null;
            hashMap2.put("referrer_url", kotlin.text.e0.C(4096, uri8 == null ? str4 : uri8));
            hashMap2.put("invite_code", inviteCode);
            bVar.p3().b(new h32.i0(d4.SERVICE_ENTRY_INVITE_CODE, a4.SERVICE_ENTRY_EXTERNAL_SHARE, null, null, null, null), f1.SERVICE_ENTRY, null, hashMap2, false);
            return;
        }
        if (uri2.getQueryParameterNames() == null || !uri2.getQueryParameterNames().contains("utm_source") || !uri2.getQueryParameterNames().contains("utm_medium")) {
            Intrinsics.checkNotNullParameter(bVar, "<this>");
            Intrinsics.checkNotNullParameter(uri2, "uri");
            HashMap hashMap3 = new HashMap();
            hashMap3.put("app_start_source", h32.j.WEB_URL.toString());
            String uri9 = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(uri9, "toString(...)");
            hashMap3.put("full_url", uri9);
            String uri10 = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(uri10, "toString(...)");
            hashMap3.put("current_page_url", uri10);
            Uri referrer5 = bVar.getReferrer();
            String uri11 = referrer5 != null ? referrer5.toString() : null;
            hashMap3.put("referrer_url", kotlin.text.e0.C(4096, uri11 == null ? str4 : uri11));
            bVar.p3().b(new h32.i0(d4.SERVICE_ENTRY_WEB, a4.SERVICE_ENTRY_WEB_UNKNOWN, null, null, null, null), f1.SERVICE_ENTRY, null, hashMap3, false);
            return;
        }
        String queryParameter13 = uri2.getQueryParameter("utm_content");
        String queryParameter14 = uri2.getQueryParameter("utm_source");
        String queryParameter15 = uri2.getQueryParameter("utm_medium");
        try {
            b4 b4Var = d4.Companion;
            int parseInt = queryParameter14 != null ? Integer.parseInt(queryParameter14) : 0;
            b4Var.getClass();
            d4Var = b4.a(parseInt);
            if (queryParameter15 != null) {
                try {
                    y3 y3Var = a4.Companion;
                    int parseInt2 = Integer.parseInt(queryParameter15);
                    y3Var.getClass();
                    a13 = y3.a(parseInt2);
                } catch (NumberFormatException unused) {
                    a4Var = null;
                    if (d4Var != null) {
                        return;
                    } else {
                        return;
                    }
                }
            } else {
                a13 = null;
            }
            a4Var = a13;
        } catch (NumberFormatException unused2) {
            d4Var = null;
        }
        if (d4Var != null || a4Var == null) {
            return;
        }
        try {
            HashMap hashMap4 = new HashMap();
            Set<String> queryParameterNames = uri2.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            for (String input : queryParameterNames) {
                Intrinsics.f(input);
                String str6 = str5;
                if (kotlin.text.z.p(input, str6, false)) {
                    Regex regex = new Regex(str6);
                    Intrinsics.checkNotNullParameter(input, "input");
                    replacement = str4;
                    Intrinsics.checkNotNullParameter(replacement, "replacement");
                    String replaceFirst = regex.f80468a.matcher(input).replaceFirst(replacement);
                    Intrinsics.checkNotNullExpressionValue(replaceFirst, "replaceFirst(...)");
                    bs1.c.G1(replaceFirst, uri2.getQueryParameter(input), hashMap4);
                } else {
                    replacement = str4;
                    if (kotlin.text.z.p(input, "utm_", false)) {
                        bs1.c.G1(input, uri2.getQueryParameter(input), hashMap4);
                    } else {
                        str = str3;
                        if (Intrinsics.d(input, str)) {
                            if (Intrinsics.d(source, "PUSH_NOTIF") || d4Var == d4.PUSH_NOTIFICATION) {
                                bs1.c.G1(str, uri2.getQueryParameter(input), hashMap4);
                            }
                        } else if (Intrinsics.d(input, "e_t") && (Intrinsics.d(source, "PUSH_NOTIF") || d4Var == d4.PUSH_NOTIFICATION)) {
                            bs1.c.G1("push_id", uri2.getQueryParameter(input), hashMap4);
                        }
                        str5 = str6;
                        str3 = str;
                        str4 = replacement;
                    }
                }
                str = str3;
                str5 = str6;
                str3 = str;
                str4 = replacement;
            }
            String str7 = str4;
            Uri referrer6 = bVar.getReferrer();
            String uri12 = referrer6 != null ? referrer6.toString() : null;
            if (uri12 == null) {
                uri12 = str7;
            }
            hashMap4.put("referrer_url", kotlin.text.e0.C(4096, uri12));
            String uri13 = uri2.toString();
            Intrinsics.checkNotNullExpressionValue(uri13, "toString(...)");
            hashMap4.put("current_page_url", uri13);
            bVar.p3().b(new h32.i0(d4Var, a4Var, null, null, null, null), f1.SERVICE_ENTRY, queryParameter13, hashMap4, false);
            if ((Intrinsics.d(source, "PUSH_NOTIF") || d4Var != d4.PUSH_NOTIFICATION) && (!Intrinsics.d(source, "PUSH_NOTIF") || d4Var == d4.PUSH_NOTIFICATION)) {
                return;
            }
            kh2.d.P0(bVar.getAnalyticsApi(), str2, f1.PUSH_NOTIFICATION_SOURCE_MISMATCH, new rz1.c(source, d4Var.name(), (String) hashMap4.get("utm_campaign")));
        } catch (NumberFormatException e14) {
            bVar.b6().p(e14);
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final BitmapDrawable p0(Drawable drawable, Resources resources, int i13, int i14) {
        Intrinsics.checkNotNullParameter(drawable, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, tb.f.j0(drawable, i13, i14, 4));
        bitmapDrawable.setAutoMirrored(drawable.isAutoMirrored());
        return bitmapDrawable;
    }

    public static void q(boolean z13, String str, Object... objArr) {
        if (!z13) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static final long q0(long j13) {
        return (Math.round(a3.c.e(j13)) & 4294967295L) | (Math.round(a3.c.d(j13)) << 32);
    }

    public static int r(long j13) {
        int i13 = (int) j13;
        bf.b.g(j13, "Out of range: %s", ((long) i13) == j13);
        return i13;
    }

    public static int r0(long j13) {
        if (j13 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j13 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j13;
    }

    public static Drawable s(Drawable drawable, Drawable drawable2, int i13, int i14) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i13 == -1 && (i13 = drawable2.getIntrinsicWidth()) == -1) {
            i13 = drawable.getIntrinsicWidth();
        }
        if (i14 == -1 && (i14 = drawable2.getIntrinsicHeight()) == -1) {
            i14 = drawable.getIntrinsicHeight();
        }
        if (i13 > drawable.getIntrinsicWidth() || i14 > drawable.getIntrinsicHeight()) {
            float f13 = i13 / i14;
            if (f13 >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i14 = (int) (intrinsicWidth / f13);
                i13 = intrinsicWidth;
            } else {
                i14 = drawable.getIntrinsicHeight();
                i13 = (int) (f13 * i14);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i13, i14);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static final void s0(kb.w0 workManager, tb0.h crashReporter) {
        Intrinsics.checkNotNullParameter(workManager, "workManager");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporting");
        boolean m13 = crashReporter.m("ExperimentsBgFetchScheduled", q0.f80391a, 0.01f);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullParameter("shouldLog", "key");
        linkedHashMap.put("shouldLog", Boolean.valueOf(m13));
        kb.l lVar = new kb.l(linkedHashMap);
        bk.f.e0(lVar);
        kb.m0 m0Var = new kb.m0(ExperimentsRefreshWorker.class, TimeUnit.DAYS);
        Random random = new Random();
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(random, "random");
        Calendar now = Calendar.getInstance();
        Intrinsics.f(now);
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(now, "now");
        Intrinsics.checkNotNullParameter(random, "random");
        Object clone = now.clone();
        Intrinsics.g(clone, "null cannot be cast to non-null type java.util.Calendar");
        Calendar calendar = (Calendar) clone;
        calendar.set(11, (random.nextInt(1) + 2) % 23);
        calendar.set(12, random.nextInt(60));
        calendar.set(13, random.nextInt(60));
        if (calendar.compareTo(now) <= 0) {
            calendar.add(5, 1);
        }
        long timeInMillis = calendar.getTimeInMillis() - now.getTimeInMillis();
        if (timeInMillis >= 0) {
            long j13 = timeInMillis / 1000;
            m0Var.g(timeInMillis, TimeUnit.MILLISECONDS);
        } else {
            ((m60.d) m60.d.a()).g();
            crashReporter.h("Invalid initial delay " + timeInMillis + " for work request. startHour=2, endHour=3, now=" + now);
        }
        kb.m0 m0Var2 = (kb.m0) m0Var.h(lVar);
        kb.c0 c0Var = kb.c0.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        kb.c0 networkType = kb.c0.CONNECTED;
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        workManager.e("REFRESH_EXPERIMENTS_WORK", kb.p.UPDATE, (kb.n0) ((kb.m0) m0Var2.f(new kb.g(new ub.g(null), networkType, false, false, false, false, -1L, -1L, CollectionsKt.J0(linkedHashSet)))).b());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static h6.a0 t(android.content.Context r8) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            h6.d r0 = new h6.d
            r0.<init>()
            goto L11
        Lc:
            h6.c r0 = new h6.c
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            com.bumptech.glide.d.s(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r1 = r5
            goto L7a
        L4b:
            java.lang.String r2 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r4 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            android.content.pm.Signature[] r0 = r0.d(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r6 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
        L59:
            if (r3 >= r6) goto L67
            r7 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            r1.add(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r0 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            m5.c r1 = new m5.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            java.lang.String r3 = "emojicompat-emoji-font"
            r1.<init>(r2, r4, r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L73
            goto L7a
        L73:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7a:
            if (r1 != 0) goto L7d
            goto L87
        L7d:
            h6.a0 r5 = new h6.a0
            h6.z r0 = new h6.z
            r0.<init>(r8, r1)
            r5.<init>(r0)
        L87:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.b.t(android.content.Context):h6.a0");
    }

    public static final void t0(View view, u1 u1Var) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(u6.f.view_tree_view_model_store_owner, u1Var);
    }

    public static bs1.c u(int i13) {
        if (i13 != 0 && i13 == 1) {
            return new bk.e();
        }
        return new bk.l();
    }

    public static final void u0(he0.b bVar, String str, String registrationId) {
        Bundle bundle;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(registrationId, "registrationId");
        if (Intrinsics.d("PULL_NOTIF", str) || Intrinsics.d("PUSH_NOTIF", str)) {
            bVar.p3().a(Intrinsics.d("PULL_NOTIF", str) ? f1.PULL_NOTIFICATION_OPENED_BY : f1.PUSH_NOTIFICATION_OPENED_BY, vb0.b.f125448a.a(), false, true);
            if (Intrinsics.d("PUSH_NOTIF", str)) {
                com.google.firebase.messaging.q R2 = bVar.R2();
                Intent intent = bVar.getIntent();
                if (intent == null || (bundle = intent.getExtras()) == null) {
                    bundle = null;
                } else {
                    bundle.putString("display_mode", bundle.getBoolean("com.pinterest.EXTRA_FROM_COLLAPSED_NOTIF", false) ? "collapsed" : "expanded");
                    Unit unit = Unit.f80348a;
                }
                R2.q("opened", registrationId, bundle);
            }
        }
    }

    public static l8.p v(k8.t tVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int length = tVar.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            if (tVar.c(i14, elapsedRealtime)) {
                i13++;
            }
        }
        return new l8.p(1, 0, length, i13);
    }

    public static void v0(View view, float f13) {
        Drawable background = view.getBackground();
        if (background instanceof bk.i) {
            ((bk.i) background).s(f13);
        }
    }

    public static void w0(Outline outline, Path path) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            qj.b.a(outline, path);
            return;
        }
        if (i13 >= 29) {
            try {
                qj.a.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            qj.a.a(outline, path);
        }
    }

    public static Drawable x(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        return drawable;
    }

    public static void x0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof bk.i) {
            y0(view, (bk.i) background);
        }
    }

    public static final void y(com.pinterest.framework.screens.m mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (((jl1.a) mVar).f76941e) {
            mVar.deactivate();
        }
    }

    public static void y0(View view, bk.i iVar) {
        rj.a aVar = iVar.f23052a.f23031b;
        if (aVar == null || !aVar.f108419a) {
            return;
        }
        float f13 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = v0.f102521a;
            f13 += q5.m0.e((View) parent);
        }
        bk.h hVar = iVar.f23052a;
        if (hVar.f23042m != f13) {
            hVar.f23042m = f13;
            iVar.B();
        }
    }

    public static String z(int i13, int i14, ByteBuffer byteBuffer) {
        if ((i13 | i14 | ((byteBuffer.limit() - i13) - i14)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i13), Integer.valueOf(i14)));
        }
        int i15 = i13 + i14;
        char[] cArr = new char[i14];
        int i16 = 0;
        while (i13 < i15) {
            byte b13 = byteBuffer.get(i13);
            if (!g2.b(b13)) {
                break;
            }
            i13++;
            cArr[i16] = (char) b13;
            i16++;
        }
        int i17 = i16;
        while (i13 < i15) {
            int i18 = i13 + 1;
            byte b14 = byteBuffer.get(i13);
            if (g2.b(b14)) {
                int i19 = i17 + 1;
                cArr[i17] = (char) b14;
                while (i18 < i15) {
                    byte b15 = byteBuffer.get(i18);
                    if (!g2.b(b15)) {
                        break;
                    }
                    i18++;
                    cArr[i19] = (char) b15;
                    i19++;
                }
                i17 = i19;
                i13 = i18;
            } else if (b14 < -32) {
                if (i18 >= i15) {
                    throw InvalidProtocolBufferException.b();
                }
                i13 += 2;
                g2.c(b14, byteBuffer.get(i18), cArr, i17);
                i17++;
            } else if (b14 < -16) {
                if (i18 >= i15 - 1) {
                    throw InvalidProtocolBufferException.b();
                }
                int i23 = i13 + 2;
                i13 += 3;
                g2.d(b14, byteBuffer.get(i18), byteBuffer.get(i23), cArr, i17);
                i17++;
            } else {
                if (i18 >= i15 - 2) {
                    throw InvalidProtocolBufferException.b();
                }
                byte b16 = byteBuffer.get(i18);
                int i24 = i13 + 3;
                byte b17 = byteBuffer.get(i13 + 2);
                i13 += 4;
                g2.a(b14, b16, b17, byteBuffer.get(i24), cArr, i17);
                i17 += 2;
            }
        }
        return new String(cArr, 0, i17);
    }

    public static final d6.g z0(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new d6.g(name);
    }

    public p2 j() {
        pk.a0.C(2, "expectedValuesPerKey");
        return new p2(this);
    }

    public abstract Map w();
}
