package ads_mobile_sdk;

import a.f2;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import android.view.View;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import kotlinx.coroutines.TimeoutCancellationException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class y4 extends yr0 {

    /* renamed from: d, reason: collision with root package name */
    public final Context f14015d;

    /* renamed from: e, reason: collision with root package name */
    public final oh0 f14016e;

    /* renamed from: f, reason: collision with root package name */
    public final cm0 f14017f;

    /* renamed from: g, reason: collision with root package name */
    public final x f14018g;

    /* renamed from: h, reason: collision with root package name */
    public final kp f14019h;

    /* renamed from: i, reason: collision with root package name */
    public final String f14020i;

    /* renamed from: j, reason: collision with root package name */
    public final sb2 f14021j;

    /* renamed from: k, reason: collision with root package name */
    public b4 f14022k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(Context applicationContext, oh0 flags, cm0 gmaUtil, x activityTracker, kp concurrencyObjects, String afmaVersion, sb2 rootTraceCreator) {
        super(il0.CUI_NAME_SDKINIT_INIT_SPAM, true, 2);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(concurrencyObjects, "concurrencyObjects");
        Intrinsics.checkNotNullParameter(afmaVersion, "afmaVersion");
        Intrinsics.checkNotNullParameter(rootTraceCreator, "rootTraceCreator");
        this.f14015d = applicationContext;
        this.f14016e = flags;
        this.f14017f = gmaUtil;
        this.f14018g = activityTracker;
        this.f14019h = concurrencyObjects;
        this.f14020i = afmaVersion;
        this.f14021j = rootTraceCreator;
    }

    public final void a(InputEvent inputEvent) {
        Intrinsics.checkNotNullParameter(inputEvent, "inputEvent");
        b4 b4Var = this.f14022k;
        if (b4Var == null) {
            Intrinsics.r("adShieldClient");
            throw null;
        }
        ol2 ol2Var = b4Var.f2701b;
        f2 f2Var = (f2) ol2Var.f9364f.get();
        if (f2Var == null) {
            ol2Var.f9363e.b(xb0.EVENT_ID_EARLY_INPUT_EVENT);
        } else {
            f2Var.a(inputEvent);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b(List viewUris, View view) {
        String str;
        Intrinsics.checkNotNullParameter(viewUris, "viewUris");
        if (!(viewUris instanceof Collection) || !viewUris.isEmpty()) {
            Iterator it = viewUris.iterator();
            while (it.hasNext()) {
                if (this.f14017f.a((Uri) it.next())) {
                    sb2 sb2Var = this.f14021j;
                    il0 il0Var = il0.CUI_NAME_VIEW_SIGNALS;
                    kotlin.collections.q0 q0Var = kotlin.collections.q0.f80391a;
                    ss2 ss2Var = new ss2(new o52(), new v01(), new k72(), new g5());
                    if (qs2.b().f9801a == null) {
                        p12 a13 = sb2.a(sb2Var, il0Var, q0Var, ss2Var);
                        try {
                            b4 b4Var = this.f14022k;
                            if (b4Var == null) {
                                Intrinsics.r("adShieldClient");
                                throw null;
                            }
                            String b13 = b4Var.b(c(), a(viewUris), view, this.f14018g.c());
                            if (b13 instanceof jk0) {
                                ft2.a((jk0) b13);
                            }
                            dl2.b.J(a13, null);
                            str = b13;
                        } catch (Throwable th3) {
                            try {
                                a13.b(th3);
                                if (th3 instanceof a.jf) {
                                    throw th3;
                                }
                                a13.a(th3);
                                if (th3 instanceof TimeoutCancellationException) {
                                    throw new xl0(th3);
                                }
                                if (th3 instanceof CancellationException) {
                                    throw new yj0(th3);
                                }
                                if (th3 instanceof uk0) {
                                    throw th3;
                                }
                                throw new dk0(th3);
                            } catch (Throwable th4) {
                                try {
                                    throw th4;
                                } catch (Throwable th5) {
                                    dl2.b.J(a13, th4);
                                    throw th5;
                                }
                            }
                        }
                    } else {
                        cs2 a14 = qs2.a(il0Var, q0Var, true);
                        try {
                            b4 b4Var2 = this.f14022k;
                            if (b4Var2 == null) {
                                Intrinsics.r("adShieldClient");
                                throw null;
                            }
                            String b14 = b4Var2.b(c(), a(viewUris), view, this.f14018g.c());
                            if (b14 instanceof jk0) {
                                ft2.a((jk0) b14);
                            }
                            dl2.b.J(a14, null);
                            str = b14;
                        } catch (Throwable th6) {
                            try {
                                a14.b(th6);
                                if (th6 instanceof a.jf) {
                                    throw th6;
                                }
                                a14.a(th6);
                                if (th6 instanceof TimeoutCancellationException) {
                                    throw new xl0(th6);
                                }
                                if (th6 instanceof CancellationException) {
                                    throw new yj0(th6);
                                }
                                if (th6 instanceof uk0) {
                                    throw th6;
                                }
                                throw new dk0(th6);
                            } catch (Throwable th7) {
                                try {
                                    throw th7;
                                } catch (Throwable th8) {
                                    dl2.b.J(a14, th7);
                                    throw th8;
                                }
                            }
                        }
                    }
                    Intrinsics.f(str);
                    return str;
                }
            }
        }
        return "";
    }

    public final Context c() {
        Activity c13 = this.f14018g.c();
        return c13 != null ? c13 : this.f14015d;
    }

    @Override // ads_mobile_sdk.yr0
    public final Object e(bl2.c cVar) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        b4 b4Var;
        Context context = this.f14015d;
        jp jpVar = this.f14019h.f7427c;
        oh0 flags = this.f14016e;
        Intrinsics.checkNotNullParameter(flags, "flags");
        a.r4 builder = i4.J();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Boolean bool = Boolean.TRUE;
        wg0 wg0Var = oh0.f9281e;
        boolean booleanValue = ((Boolean) flags.a("gads:ad_spam_gass_call:enabled", bool, wg0Var)).booleanValue();
        builder.b();
        i4 i4Var = (i4) builder.f10110b;
        i13 = i4Var.bitField0_;
        i4Var.bitField0_ = i13 | 8;
        i4Var.enableGassClient_ = booleanValue;
        boolean booleanValue2 = ((Boolean) flags.a("gads:as_af:enabled", bool, wg0Var)).booleanValue();
        builder.b();
        i4 i4Var2 = (i4) builder.f10110b;
        i14 = i4Var2.bitField0_;
        i4Var2.bitField0_ = i14 | 2;
        i4Var2.allowFallback_ = booleanValue2;
        int intValue = ((Number) flags.a("gads:as_rav", 1, oh0.f9285i)).intValue();
        r4 value = intValue != 0 ? intValue != 1 ? intValue != 2 ? intValue != 3 ? null : r4.ADSHIELD_VERSION_3 : r4.ADSHIELD_VERSION_2 : r4.ADSHIELD_VERSION_1 : r4.ADSHIELD_VERSION_UNSPECIFIED;
        if (value == null) {
            value = r4.ADSHIELD_VERSION_1;
        }
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        i4 i4Var3 = (i4) builder.f10110b;
        i4Var3.getClass();
        i4Var3.requestedAdshieldVersion_ = value.f10493a;
        i15 = i4Var3.bitField0_;
        i4Var3.bitField0_ = i15 | 1;
        a.ug builder2 = a81.w();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        jh0 jh0Var = oh0.f9294r;
        String value2 = (String) flags.a("gads:as_rcs", "https://pagead2.googlesyndication.com/pagead/ping?e=2&f=1", jh0Var);
        Intrinsics.checkNotNullParameter(value2, "value");
        builder2.b();
        a81 a81Var = (a81) builder2.f10110b;
        a81Var.getClass();
        value2.getClass();
        i16 = a81Var.bitField0_;
        a81Var.bitField0_ = i16 | 1;
        a81Var.remoteCaptureServiceUrl_ = value2;
        float floatValue = ((Number) flags.a("gads:as_lsr", Float.valueOf(1.0f), oh0.f9284h)).floatValue();
        builder2.b();
        a81 a81Var2 = (a81) builder2.f10110b;
        i17 = a81Var2.bitField0_;
        a81Var2.bitField0_ = i17 | 2;
        a81Var2.logSampleRate_ = floatValue;
        eh0 eh0Var = oh0.f9283g;
        long longValue = ((Number) flags.a("gads:as_lbs", 1000L, eh0Var)).longValue();
        builder2.b();
        a81 a81Var3 = (a81) builder2.f10110b;
        i18 = a81Var3.bitField0_;
        a81Var3.bitField0_ = i18 | 4;
        a81Var3.logBufferSize_ = longValue;
        zn2.a aVar = zn2.b.f142311b;
        zn2.d dVar = zn2.d.MINUTES;
        long longValue2 = ((Number) flags.a("gads:as_li_ms", Long.valueOf(zn2.b.e(dl2.b.P2(1, dVar))), eh0Var)).longValue();
        builder2.b();
        a81 a81Var4 = (a81) builder2.f10110b;
        i19 = a81Var4.bitField0_;
        a81Var4.bitField0_ = i19 | 8;
        a81Var4.logIntervalMs_ = longValue2;
        sj0 a13 = builder2.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        a81 value3 = (a81) a13;
        Intrinsics.checkNotNullParameter(value3, "value");
        builder.b();
        i4 i4Var4 = (i4) builder.f10110b;
        i4Var4.getClass();
        i4Var4.loggingOptions_ = value3;
        i23 = i4Var4.bitField0_;
        i4Var4.bitField0_ = i23 | 16;
        Boolean bool2 = Boolean.FALSE;
        boolean booleanValue3 = ((Boolean) flags.a("gads:as_vsb:enabled", bool2, wg0Var)).booleanValue();
        builder.b();
        i4 i4Var5 = (i4) builder.f10110b;
        i24 = i4Var5.bitField0_;
        i4Var5.bitField0_ = i24 | 32;
        i4Var5.enableViewstringBinding_ = booleanValue3;
        zn2.d dVar2 = zn2.d.SECONDS;
        long longValue3 = ((Number) flags.a("gads:as_st_ms", Long.valueOf(zn2.b.e(dl2.b.P2(1, dVar2))), eh0Var)).longValue();
        builder.b();
        i4 i4Var6 = (i4) builder.f10110b;
        i25 = i4Var6.bitField0_;
        i4Var6.bitField0_ = i25 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        i4Var6.signalsTimeoutMs_ = longValue3;
        long longValue4 = ((Number) flags.a("gads:as_asqs_ms", 100L, eh0Var)).longValue();
        builder.b();
        i4 i4Var7 = (i4) builder.f10110b;
        i26 = i4Var7.bitField0_;
        i4Var7.bitField0_ = i26 | 64;
        i4Var7.appStartQuerySignalsTimeoutMs_ = longValue4;
        long longValue5 = ((Number) flags.a("gads:as_asw_ms", Long.valueOf(zn2.b.e(dl2.b.P2(5, dVar2))), eh0Var)).longValue();
        builder.b();
        i4 i4Var8 = (i4) builder.f10110b;
        i27 = i4Var8.bitField0_;
        i4Var8.bitField0_ = i27 | 32768;
        i4Var8.appStartWindowMs_ = longValue5;
        boolean booleanValue4 = ((Boolean) flags.a("gads:as_emassqs:enabled", bool2, wg0Var)).booleanValue();
        builder.b();
        i4 i4Var9 = (i4) builder.f10110b;
        i28 = i4Var9.bitField0_;
        i4Var9.bitField0_ = i28 | 65536;
        i4Var9.enableMinimalAppStartQuerySignals_ = booleanValue4;
        long longValue6 = ((Number) flags.a("gads:as_gst_ms", 200L, eh0Var)).longValue();
        builder.b();
        i4 i4Var10 = (i4) builder.f10110b;
        i29 = i4Var10.bitField0_;
        i4Var10.bitField0_ = i29 | BitmapUtils.BITMAP_TO_JPEG_SIZE;
        i4Var10.gassSignalTimeoutMs_ = longValue6;
        long longValue7 = ((Number) flags.a("gads:as_list_ms", 200L, eh0Var)).longValue();
        builder.b();
        i4 i4Var11 = (i4) builder.f10110b;
        i33 = i4Var11.bitField0_;
        i4Var11.bitField0_ = i33 | 1024;
        i4Var11.localIntSignalTimeoutMs_ = longValue7;
        long longValue8 = ((Number) flags.a("gads:as_hrt_ms", Long.valueOf(zn2.b.e(dl2.b.P2(10, dVar))), eh0Var)).longValue();
        builder.b();
        i4 i4Var12 = (i4) builder.f10110b;
        i34 = i4Var12.bitField0_;
        i4Var12.bitField0_ = i34 | 2048;
        i4Var12.httpRequestTimeoutMs_ = longValue8;
        String value4 = (String) flags.a("gads:as_pic", "", jh0Var);
        Intrinsics.checkNotNullParameter(value4, "value");
        builder.b();
        i4 i4Var13 = (i4) builder.f10110b;
        i4Var13.getClass();
        value4.getClass();
        i35 = i4Var13.bitField0_;
        i4Var13.bitField0_ = i35 | 4096;
        i4Var13.prodInstallerCert_ = value4;
        String value5 = (String) flags.a("gads:as_dic", "", jh0Var);
        Intrinsics.checkNotNullParameter(value5, "value");
        builder.b();
        i4 i4Var14 = (i4) builder.f10110b;
        i4Var14.getClass();
        value5.getClass();
        i36 = i4Var14.bitField0_;
        i4Var14.bitField0_ = i36 | 8192;
        i4Var14.debugInstallerCert_ = value5;
        long longValue9 = ((Number) flags.a("gads:as_mt_ms", Long.valueOf(zn2.b.e(dl2.b.P2(500, zn2.d.MILLISECONDS))), eh0Var)).longValue();
        builder.b();
        i4 i4Var15 = (i4) builder.f10110b;
        i37 = i4Var15.bitField0_;
        i4Var15.bitField0_ = i37 | 16384;
        i4Var15.methodTimeoutMs_ = longValue9;
        boolean booleanValue5 = ((Boolean) flags.a("gads:as_caau:enabled", bool2, wg0Var)).booleanValue();
        builder.b();
        i4 i4Var16 = (i4) builder.f10110b;
        i38 = i4Var16.bitField0_;
        i4Var16.bitField0_ = i38 | 131072;
        i4Var16.clearDgArgsAfterUse_ = booleanValue5;
        a.w1 builder3 = f22.x();
        Intrinsics.checkNotNullExpressionValue(builder3, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder3, "builder");
        boolean booleanValue6 = ((Boolean) flags.a("gads:as_uoio:enabled", bool, wg0Var)).booleanValue();
        builder3.b();
        f22 f22Var = (f22) builder3.f10110b;
        i39 = f22Var.bitField0_;
        f22Var.bitField0_ = i39 | 1;
        f22Var.updateOnInitializationOnly_ = booleanValue6;
        boolean booleanValue7 = ((Boolean) flags.a("gads:as_rau:enabled", bool2, wg0Var)).booleanValue();
        builder3.b();
        f22 f22Var2 = (f22) builder3.f10110b;
        i43 = f22Var2.bitField0_;
        f22Var2.bitField0_ = i43 | 2;
        f22Var2.reinitializeAfterUpdate_ = booleanValue7;
        boolean booleanValue8 = ((Boolean) flags.a("gads:as_ubi:enabled", bool2, wg0Var)).booleanValue();
        builder3.b();
        f22 f22Var3 = (f22) builder3.f10110b;
        i44 = f22Var3.bitField0_;
        f22Var3.bitField0_ = i44 | 4;
        f22Var3.updateBeforeInitialization_ = booleanValue8;
        long longValue10 = ((Number) flags.a("gads:as_mui_ms", Long.valueOf(zn2.b.e(dl2.b.P2(10, dVar))), eh0Var)).longValue();
        builder3.b();
        f22 f22Var4 = (f22) builder3.f10110b;
        i45 = f22Var4.bitField0_;
        f22Var4.bitField0_ = i45 | 8;
        f22Var4.minUpdateIntervalMs_ = longValue10;
        long longValue11 = ((Number) flags.a("gads:as_pae_ms", Long.valueOf(zn2.b.e(dl2.b.P2(1, zn2.d.HOURS))), eh0Var)).longValue();
        builder3.b();
        f22 f22Var5 = (f22) builder3.f10110b;
        i46 = f22Var5.bitField0_;
        f22Var5.bitField0_ = i46 | 16;
        f22Var5.programAlmostExpiredMs_ = longValue11;
        String value6 = (String) flags.a("gads:as_pru", "https://pagead2.googlesyndication.com/mads/asp", jh0Var);
        Intrinsics.checkNotNullParameter(value6, "value");
        builder3.b();
        f22 f22Var6 = (f22) builder3.f10110b;
        f22Var6.getClass();
        value6.getClass();
        i47 = f22Var6.bitField0_;
        f22Var6.bitField0_ = i47 | 32;
        f22Var6.programRequestUrl_ = value6;
        sj0 a14 = builder3.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        f22 value7 = (f22) a14;
        Intrinsics.checkNotNullParameter(value7, "value");
        builder.b();
        i4 i4Var17 = (i4) builder.f10110b;
        i4Var17.getClass();
        i4Var17.programUpdateOptions_ = value7;
        i48 = i4Var17.bitField0_;
        i4Var17.bitField0_ = i48 | RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        sj0 a15 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a15, "build(...)");
        a.r4 r4Var = (a.r4) ((i4) a15).q();
        String str = this.f14020i;
        r4Var.b();
        i4 i4Var18 = (i4) r4Var.f10110b;
        i4Var18.getClass();
        str.getClass();
        i49 = i4Var18.bitField0_;
        i4Var18.bitField0_ = i49 | 4;
        i4Var18.hostVersion_ = str;
        i4 i4Var19 = (i4) r4Var.a();
        synchronized (b4.f2698k) {
            try {
                if (b4.f2699l == null) {
                    context.getClass();
                    jpVar.getClass();
                    b4.f2699l = new b4(new l00(new a.f3(), jpVar, context, i4Var19));
                }
                b4Var = b4.f2699l;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        Intrinsics.checkNotNullExpressionValue(b4Var, "getInstance(...)");
        this.f14022k = b4Var;
        if (b4Var != null) {
            b4Var.a();
            return new pk0(Unit.f80348a);
        }
        Intrinsics.r("adShieldClient");
        throw null;
    }

    public final String a(View view, String clickString) {
        Intrinsics.checkNotNullParameter(clickString, "clickString");
        b4 b4Var = this.f14022k;
        if (b4Var != null) {
            String a13 = b4Var.a(c(), clickString, view, this.f14018g.c());
            Intrinsics.checkNotNullExpressionValue(a13, "getClickSignals(...)");
            return a13;
        }
        Intrinsics.r("adShieldClient");
        throw null;
    }

    public final String a(View view) {
        b4 b4Var = this.f14022k;
        if (b4Var == null) {
            Intrinsics.r("adShieldClient");
            throw null;
        }
        String b13 = b4Var.b(c(), null, view, this.f14018g.c());
        Intrinsics.checkNotNullExpressionValue(b13, "getViewSignals(...)");
        return b13;
    }

    public final Uri a(Uri uri, View view) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(view, "view");
        String a13 = a(kotlin.collections.e0.b(uri), view);
        if (z.j(a13)) {
            return uri;
        }
        Uri build = uri.buildUpon().appendQueryParameter("ms", a13).build();
        Intrinsics.f(build);
        return build;
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0015, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String a(java.util.List r9, android.view.View r10) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.y4.a(java.util.List, android.view.View):java.lang.String");
    }

    public final void b(List stackTrace) {
        Intrinsics.checkNotNullParameter(stackTrace, "stackTrace");
        b4 b4Var = this.f14022k;
        if (b4Var != null) {
            wm2 wm2Var = b4Var.f2702c.f3539b;
            synchronized (wm2Var) {
                wm2Var.f13122a.clear();
                wm2Var.f13122a.addAll(stackTrace);
            }
            return;
        }
        Intrinsics.r("adShieldClient");
        throw null;
    }

    public final String a(List list) {
        Object obj;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            Uri uri = (Uri) obj;
            if (this.f14017f.a(uri) && uri.getQueryParameter("ai") != null) {
                break;
            }
        }
        Uri uri2 = (Uri) obj;
        if (uri2 == null) {
            return null;
        }
        return uri2.getQueryParameter("ai");
    }
}
