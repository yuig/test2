package ads_mobile_sdk;

import a.s7;
import android.net.Uri;
import ao2.j0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes2.dex */
public final class p03 implements s7 {

    /* renamed from: a, reason: collision with root package name */
    public final fd0 f9513a;

    /* renamed from: b, reason: collision with root package name */
    public final j0 f9514b;

    /* renamed from: c, reason: collision with root package name */
    public final cm0 f9515c;

    /* renamed from: d, reason: collision with root package name */
    public final oh0 f9516d;

    /* renamed from: e, reason: collision with root package name */
    public final r0 f9517e;

    /* renamed from: f, reason: collision with root package name */
    public final yp0 f9518f;

    public p03(fd0 firebaseAnalyticsAdapter, j0 backgroundScope, cm0 gmaUtil, oh0 flags, r0 adConfiguration, yp0 httpClient) {
        Intrinsics.checkNotNullParameter(firebaseAnalyticsAdapter, "firebaseAnalyticsAdapter");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(httpClient, "httpClient");
        this.f9513a = firebaseAnalyticsAdapter;
        this.f9514b = backgroundScope;
        this.f9515c = gmaUtil;
        this.f9516d = flags;
        this.f9517e = adConfiguration;
        this.f9518f = httpClient;
    }

    public final boolean a(Uri uri, List list) {
        if (this.f9515c.a(uri) && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Regex regex = new Regex((String) it.next());
                String uri2 = uri.toString();
                Intrinsics.checkNotNullExpressionValue(uri2, "toString(...)");
                if (regex.a(uri2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.webkit.WebResourceRequest r13, bl2.c r14) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.p03.a(android.webkit.WebResourceRequest, bl2.c):java.lang.Object");
    }
}
