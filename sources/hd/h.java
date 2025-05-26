package hd;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import androidx.camera.core.impl.x2;
import com.bugsnag.android.a1;
import com.bugsnag.android.b0;
import com.bugsnag.android.u1;
import com.bugsnag.android.v3;
import com.bugsnag.android.w0;
import com.bugsnag.android.x0;
import com.bugsnag.android.y0;
import com.bugsnag.android.z0;
import java.io.File;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import kh2.c3;
import kh2.j1;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.Intrinsics;
import q7.w;
import xk2.v;

/* loaded from: classes3.dex */
public final class h {
    public final boolean A;
    public final PackageInfo B;
    public final ApplicationInfo C;
    public final Collection D;

    /* renamed from: a, reason: collision with root package name */
    public final String f68809a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f68810b;

    /* renamed from: c, reason: collision with root package name */
    public final w0 f68811c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68812d;

    /* renamed from: e, reason: collision with root package name */
    public final v3 f68813e;

    /* renamed from: f, reason: collision with root package name */
    public final Collection f68814f;

    /* renamed from: g, reason: collision with root package name */
    public final Collection f68815g;

    /* renamed from: h, reason: collision with root package name */
    public final Collection f68816h;

    /* renamed from: i, reason: collision with root package name */
    public final Set f68817i;

    /* renamed from: j, reason: collision with root package name */
    public final String f68818j;

    /* renamed from: k, reason: collision with root package name */
    public final id.c f68819k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f68820l;

    /* renamed from: m, reason: collision with root package name */
    public final String f68821m;

    /* renamed from: n, reason: collision with root package name */
    public final b0 f68822n;

    /* renamed from: o, reason: collision with root package name */
    public final w f68823o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f68824p;

    /* renamed from: q, reason: collision with root package name */
    public final long f68825q;

    /* renamed from: r, reason: collision with root package name */
    public final u1 f68826r;

    /* renamed from: s, reason: collision with root package name */
    public final int f68827s;

    /* renamed from: t, reason: collision with root package name */
    public final int f68828t;

    /* renamed from: u, reason: collision with root package name */
    public final int f68829u;

    /* renamed from: v, reason: collision with root package name */
    public final int f68830v;

    /* renamed from: w, reason: collision with root package name */
    public final int f68831w;

    /* renamed from: x, reason: collision with root package name */
    public final long f68832x;

    /* renamed from: y, reason: collision with root package name */
    public final xk2.k f68833y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f68834z;

    public h(String str, boolean z13, w0 w0Var, boolean z14, v3 v3Var, Collection collection, Collection collection2, Collection collection3, Set set, String str2, id.c cVar, Integer num, String str3, b0 b0Var, w wVar, boolean z15, long j13, u1 u1Var, int i13, int i14, int i15, int i16, int i17, long j14, v vVar, boolean z16, boolean z17, PackageInfo packageInfo, ApplicationInfo applicationInfo, Collection collection4) {
        this.f68809a = str;
        this.f68810b = z13;
        this.f68811c = w0Var;
        this.f68812d = z14;
        this.f68813e = v3Var;
        this.f68814f = collection;
        this.f68815g = collection2;
        this.f68816h = collection3;
        this.f68817i = set;
        this.f68818j = str2;
        this.f68819k = cVar;
        this.f68820l = num;
        this.f68821m = str3;
        this.f68822n = b0Var;
        this.f68823o = wVar;
        this.f68824p = z15;
        this.f68825q = j13;
        this.f68826r = u1Var;
        this.f68827s = i13;
        this.f68828t = i14;
        this.f68829u = i15;
        this.f68830v = i16;
        this.f68831w = i17;
        this.f68832x = j14;
        this.f68833y = vVar;
        this.f68834z = z16;
        this.A = z17;
        this.B = packageInfo;
        this.C = applicationInfo;
        this.D = collection4;
    }

    public final x2 a(a1 a1Var) {
        z0 z0Var;
        String str = this.f68823o.f102691b;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("Bugsnag-Payload-Version", "4.0");
        String str2 = a1Var.f29141a;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[1] = new Pair("Bugsnag-Api-Key", str2);
        pairArr[2] = new Pair("Bugsnag-Sent-At", e.b(new Date()));
        pairArr[3] = new Pair("Content-Type", "application/json");
        LinkedHashMap h10 = kotlin.collections.z0.h(pairArr);
        x0 x0Var = a1Var.f29143c;
        Set a13 = (x0Var == null || (z0Var = x0Var.f29685a) == null) ? null : z0Var.a();
        if (a13 == null) {
            File file = a1Var.f29144d;
            Set set = file != null ? y0.f29694f.i(file, a1Var.f29142b).f29699e : null;
            a13 = set == null ? s0.f80394a : set;
        }
        if (!a13.isEmpty()) {
            h10.put("Bugsnag-Stacktrace-Types", j1.n1(a13));
        }
        return new x2(str, kotlin.collections.z0.n(h10));
    }

    public final boolean b(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        Collection collection = this.f68814f;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Pattern) it.next()).matcher(str.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        Collection collection = this.f68815g;
        return (collection == null || CollectionsKt.L(collection, this.f68818j)) ? false : true;
    }

    public final boolean d(Throwable th3) {
        if (!c()) {
            List n03 = c3.n0(th3);
            if (!(n03 instanceof Collection) || !n03.isEmpty()) {
                Iterator it = n03.iterator();
                while (it.hasNext()) {
                    if (b(((Throwable) it.next()).getClass().getName())) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f68809a, hVar.f68809a) && this.f68810b == hVar.f68810b && Intrinsics.d(this.f68811c, hVar.f68811c) && this.f68812d == hVar.f68812d && this.f68813e == hVar.f68813e && Intrinsics.d(this.f68814f, hVar.f68814f) && Intrinsics.d(this.f68815g, hVar.f68815g) && Intrinsics.d(this.f68816h, hVar.f68816h) && Intrinsics.d(null, null) && Intrinsics.d(this.f68817i, hVar.f68817i) && Intrinsics.d(this.f68818j, hVar.f68818j) && Intrinsics.d(this.f68819k, hVar.f68819k) && Intrinsics.d(null, null) && Intrinsics.d(this.f68820l, hVar.f68820l) && Intrinsics.d(this.f68821m, hVar.f68821m) && Intrinsics.d(this.f68822n, hVar.f68822n) && Intrinsics.d(this.f68823o, hVar.f68823o) && this.f68824p == hVar.f68824p && this.f68825q == hVar.f68825q && Intrinsics.d(this.f68826r, hVar.f68826r) && this.f68827s == hVar.f68827s && this.f68828t == hVar.f68828t && this.f68829u == hVar.f68829u && this.f68830v == hVar.f68830v && this.f68831w == hVar.f68831w && this.f68832x == hVar.f68832x && Intrinsics.d(this.f68833y, hVar.f68833y) && this.f68834z == hVar.f68834z && this.A == hVar.A && Intrinsics.d(this.B, hVar.B) && Intrinsics.d(this.C, hVar.C) && Intrinsics.d(this.D, hVar.D);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.f68809a.hashCode() * 31;
        boolean z13 = this.f68810b;
        int i13 = z13;
        if (z13 != 0) {
            i13 = 1;
        }
        int hashCode2 = (this.f68811c.hashCode() + ((hashCode + i13) * 31)) * 31;
        boolean z14 = this.f68812d;
        int i14 = z14;
        if (z14 != 0) {
            i14 = 1;
        }
        int hashCode3 = (this.f68814f.hashCode() + ((this.f68813e.hashCode() + ((hashCode2 + i14) * 31)) * 31)) * 31;
        Collection collection = this.f68815g;
        int hashCode4 = (this.f68817i.hashCode() + ((this.f68816h.hashCode() + ((hashCode3 + (collection == null ? 0 : collection.hashCode())) * 31)) * 961)) * 31;
        String str = this.f68818j;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        id.c cVar = this.f68819k;
        int hashCode6 = (hashCode5 + (cVar == null ? 0 : cVar.hashCode())) * 961;
        Integer num = this.f68820l;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f68821m;
        int hashCode8 = (this.f68823o.hashCode() + ((this.f68822n.hashCode() + ((hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        boolean z15 = this.f68824p;
        int i15 = z15;
        if (z15 != 0) {
            i15 = 1;
        }
        int hashCode9 = (this.f68833y.hashCode() + a.a.c(this.f68832x, ep.b.b(this.f68831w, ep.b.b(this.f68830v, ep.b.b(this.f68829u, ep.b.b(this.f68828t, ep.b.b(this.f68827s, (this.f68826r.hashCode() + a.a.c(this.f68825q, (hashCode8 + i15) * 31, 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31;
        boolean z16 = this.f68834z;
        int i16 = z16;
        if (z16 != 0) {
            i16 = 1;
        }
        int i17 = (hashCode9 + i16) * 961;
        boolean z17 = this.A;
        int i18 = (i17 + (z17 ? 1 : z17 ? 1 : 0)) * 31;
        PackageInfo packageInfo = this.B;
        int hashCode10 = (i18 + (packageInfo == null ? 0 : packageInfo.hashCode())) * 31;
        ApplicationInfo applicationInfo = this.C;
        return this.D.hashCode() + ((hashCode10 + (applicationInfo != null ? applicationInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ImmutableConfig(apiKey=" + this.f68809a + ", autoDetectErrors=" + this.f68810b + ", enabledErrorTypes=" + this.f68811c + ", autoTrackSessions=" + this.f68812d + ", sendThreads=" + this.f68813e + ", discardClasses=" + this.f68814f + ", enabledReleaseStages=" + this.f68815g + ", projectPackages=" + this.f68816h + ", enabledBreadcrumbTypes=null, telemetry=" + this.f68817i + ", releaseStage=" + ((Object) this.f68818j) + ", buildUuid=" + this.f68819k + ", appVersion=null, versionCode=" + this.f68820l + ", appType=" + ((Object) this.f68821m) + ", delivery=" + this.f68822n + ", endpoints=" + this.f68823o + ", persistUser=" + this.f68824p + ", launchDurationMillis=" + this.f68825q + ", logger=" + this.f68826r + ", maxBreadcrumbs=" + this.f68827s + ", maxPersistedEvents=" + this.f68828t + ", maxPersistedSessions=" + this.f68829u + ", maxReportedThreads=" + this.f68830v + ", maxStringValueLength=" + this.f68831w + ", threadCollectionTimeLimitMillis=" + this.f68832x + ", persistenceDirectory=" + this.f68833y + ", sendLaunchCrashesSynchronously=" + this.f68834z + ", attemptDeliveryOnCrash=false, generateAnonymousId=" + this.A + ", packageInfo=" + this.B + ", appInfo=" + this.C + ", redactedKeys=" + this.D + ')';
    }
}
