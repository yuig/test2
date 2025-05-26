package xr;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.util.Pair;
import ao2.f0;
import ao2.j0;
import ao2.v0;
import com.pinterest.api.model.f30;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kh2.c3;
import ko2.f;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.ranges.IntRange;
import kotlin.text.g;
import kotlin.text.z;
import nx.d0;
import ql2.q;
import tb0.h;
import xk2.e0;

/* loaded from: classes.dex */
public final class d implements a {

    /* renamed from: g, reason: collision with root package name */
    public static final ExecutorService f135663g = Executors.newCachedThreadPool();

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementManager f135664a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f135665b;

    /* renamed from: c, reason: collision with root package name */
    public final h f135666c;

    /* renamed from: d, reason: collision with root package name */
    public final j0 f135667d;

    /* renamed from: e, reason: collision with root package name */
    public final f0 f135668e;

    /* renamed from: f, reason: collision with root package name */
    public final d0 f135669f;

    public d(MeasurementManager measurementManager, pb0.a clock, h crashReporting, j0 applicationScope, d0 pinalytics) {
        f fVar = v0.f20219a;
        ko2.e ioDispatcher = ko2.e.f80326c;
        Intrinsics.checkNotNullParameter(measurementManager, "measurementManager");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(applicationScope, "applicationScope");
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        this.f135664a = measurementManager;
        this.f135665b = clock;
        this.f135666c = crashReporting;
        this.f135667d = applicationScope;
        this.f135668e = ioDispatcher;
        this.f135669f = pinalytics;
    }

    public static Uri b(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Uri.Builder appendQueryParameter = Uri.parse("https://www.pinterest.com/").buildUpon().appendEncodedPath("attribution_source/").appendQueryParameter("source_event_id", pin.B3()).appendQueryParameter("destination", com.bumptech.glide.c.D(pin));
        String str = z13 ? "604800" : null;
        if (str == null) {
            str = "86400";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("expiry", str);
        String str2 = z13 ? "2" : null;
        if (str2 == null) {
            str2 = SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE;
        }
        Uri.Builder appendQueryParameter3 = appendQueryParameter2.appendQueryParameter("priority", str2).appendQueryParameter("campaign_id", pin.H3());
        String str3 = z13 ? SbaPinRep.CLOSEUP_NAVIGATION_TYPE_CLICK : null;
        if (str3 == null) {
            str3 = "view";
        }
        Uri build = appendQueryParameter3.appendQueryParameter("source_event_type", str3).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static String c(String str, String str2, f30 f30Var) {
        String[] strArr = new String[3];
        strArr[0] = str2;
        strArr[1] = str;
        String x33 = f30Var.x3();
        String str3 = "";
        if (x33 == null) {
            x33 = "";
        }
        strArr[2] = x33;
        ArrayList l13 = kotlin.collections.f0.l(strArr);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        String Z = CollectionsKt.Z(l13, ",", null, null, 0, null, null, 62);
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = Z.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] digest = messageDigest.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "digest(...)");
        int i13 = kotlin.text.d.f80484a;
        g format = g.f80487d;
        Intrinsics.checkNotNullParameter(digest, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        int length = digest.length;
        Intrinsics.checkNotNullParameter(digest, "<this>");
        Intrinsics.checkNotNullParameter(format, "format");
        kotlin.collections.e eVar = kotlin.collections.h.f80373a;
        int length2 = digest.length;
        eVar.getClass();
        kotlin.collections.e.a(0, length, length2);
        if (length != 0) {
            String str4 = format.f80488a ? "0123456789ABCDEF" : "0123456789abcdef";
            format.f80489b.getClass();
            if (length <= 0) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            int i14 = (length - 1) / Integer.MAX_VALUE;
            int i15 = length % Integer.MAX_VALUE;
            if (i15 == 0) {
                i15 = Integer.MAX_VALUE;
            }
            long j13 = 0;
            long j14 = ((j13 + 2 + j13) * length) + (((r3 - i14) - r11) * j13) + (((i15 - 1) / Integer.MAX_VALUE) * 2) + i14;
            IntRange intRange = new IntRange(0, Integer.MAX_VALUE, 1);
            Intrinsics.checkNotNullParameter(intRange, "<this>");
            Integer valueOf = new q(-2147483648L, 2147483647L).e(j14) ? Integer.valueOf((int) j14) : null;
            if (valueOf == null || !intRange.i(valueOf)) {
                StringBuilder sb3 = new StringBuilder("The resulting string length is too big: ");
                xk2.d0 d0Var = e0.f135207b;
                sb3.append((Object) c3.s0(j14));
                throw new IllegalArgumentException(sb3.toString());
            }
            int i16 = (int) j14;
            StringBuilder sb4 = new StringBuilder(i16);
            int i17 = 0;
            int i18 = 0;
            for (byte b13 : digest) {
                int i19 = b13 & 255;
                if (i17 == Integer.MAX_VALUE) {
                    sb4.append('\n');
                    i17 = 0;
                    i18 = 0;
                } else if (i18 == Integer.MAX_VALUE) {
                    sb4.append("  ");
                    i18 = 0;
                }
                if (i18 != 0) {
                    sb4.append("");
                }
                sb4.append("");
                sb4.append(str4.charAt(i19 >> 4));
                sb4.append(str4.charAt(b13 & 15));
                sb4.append("");
                i18++;
                i17++;
            }
            if (i16 != sb4.length()) {
                throw new IllegalStateException("Check failed.".toString());
            }
            str3 = sb4.toString();
            Intrinsics.checkNotNullExpressionValue(str3, "toString(...)");
        }
        String substring = str3.substring(0, 16);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return a.a.C(substring, z.l(16, "0"));
    }

    @Override // xr.a
    public final void a(f30 pin, boolean z13) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        j.z(this.f135667d, this.f135668e, null, new c(this, pin, z13, null), 2);
    }

    public final void d(String eventName, Exception exc, f30 pin) {
        String str;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Pair[] pairArr = new Pair[2];
        if (exc == null || (str = exc.getMessage()) == null) {
            str = "Unknown error";
        }
        pairArr[0] = new Pair("error", str);
        pairArr[1] = new Pair("pin_id", pin.getUid());
        ArrayList l13 = kotlin.collections.f0.l(pairArr);
        if (Intrinsics.d(eventName, "ARA_ERROR_PARSING_DESTINATION")) {
            l13.add(new Pair("url", com.bumptech.glide.c.D(pin)));
        }
        Unit unit = Unit.f80348a;
        this.f135666c.m(eventName, l13, 0.01f);
    }
}
