package ads_mobile_sdk;

import a.l0;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.webkit.CookieManager;
import ao2.j0;
import ao2.k2;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.z;
import yn2.i;

/* loaded from: classes2.dex */
public final class cm0 {

    /* renamed from: f, reason: collision with root package name */
    public static final l0 f3958f = new l0();

    /* renamed from: g, reason: collision with root package name */
    public static final List f3959g = kotlin.collections.f0.j("/aclk", "/pcs/click", "/dbm/clk");

    /* renamed from: h, reason: collision with root package name */
    public static final AtomicReference f3960h = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f3961a;

    /* renamed from: b, reason: collision with root package name */
    public final x f3962b;

    /* renamed from: c, reason: collision with root package name */
    public final oh0 f3963c;

    /* renamed from: d, reason: collision with root package name */
    public final c0 f3964d;

    /* renamed from: e, reason: collision with root package name */
    public final Class f3965e;

    public cm0(Context applicationContext, x activityTracker, oh0 flags, c0 adActivityDelegateMap, Class adActivityClass) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(adActivityDelegateMap, "adActivityDelegateMap");
        Intrinsics.checkNotNullParameter(adActivityClass, "adActivityClass");
        this.f3961a = applicationContext;
        this.f3962b = activityTracker;
        this.f3963c = flags;
        this.f3964d = adActivityDelegateMap;
        this.f3965e = adActivityClass;
    }

    public final Intent a(Context context, a.yg delegate) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(delegate, "adActivityDelegate");
        Intent intent = new Intent(context, (Class<?>) this.f3965e);
        Bundle bundle = new Bundle();
        c0 c0Var = this.f3964d;
        c0Var.getClass();
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        int andIncrement = c0Var.f3668c.getAndIncrement();
        j0 j0Var = c0Var.f3666a;
        b0 block = new b0(c0Var, andIncrement, null);
        kotlin.coroutines.j context2 = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(j0Var, "<this>");
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        k2 z13 = kotlin.jvm.internal.j.z(j0Var, context2, null, new et2(block, null), 2);
        c0Var.f3669d.put(Integer.valueOf(andIncrement), new a0(delegate, z13));
        bundle.putInt("ad_activity_delegate", andIncrement);
        intent.putExtra("ad_activity_delegate_bundle", bundle);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        return intent;
    }

    public final Map b(Uri uri) {
        String encodedQuery;
        String decode;
        Intrinsics.checkNotNullParameter(uri, "uri");
        if (!((Boolean) this.f3963c.a("gads:uri_query_to_map:enabled", Boolean.TRUE, oh0.f9281e)).booleanValue()) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (uri.isOpaque()) {
                return kotlin.collections.z0.d();
            }
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            Intrinsics.checkNotNullExpressionValue(queryParameterNames, "getQueryParameterNames(...)");
            i j13 = yn2.c0.j(CollectionsKt.K(queryParameterNames), am0.f2437a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            yn2.h hVar = new yn2.h(j13);
            while (hVar.hasNext()) {
                Object next = hVar.next();
                linkedHashMap.put(next, uri.getQueryParameter((String) next));
            }
            return linkedHashMap;
        }
        Intrinsics.checkNotNullParameter(uri, "uri");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (uri.isOpaque() || (encodedQuery = uri.getEncodedQuery()) == null) {
            return linkedHashMap2;
        }
        int length = encodedQuery.length();
        int i13 = 0;
        while (true) {
            int K = StringsKt.K(encodedQuery, '&', i13, false, 4);
            int i14 = K != -1 ? K : length;
            int K2 = StringsKt.K(encodedQuery, '=', i13, false, 4);
            if (K2 > i14 || K2 == -1) {
                K2 = i14;
            }
            String substring = encodedQuery.substring(i13, K2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String decode2 = Uri.decode(substring);
            if (K2 == i14) {
                decode = "";
            } else {
                String substring2 = encodedQuery.substring(K2 + 1, i14);
                Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                decode = Uri.decode(substring2);
            }
            Intrinsics.f(decode2);
            Intrinsics.f(decode);
            linkedHashMap2.put(decode2, decode);
            if (K == -1) {
                return linkedHashMap2;
            }
            i13 = K + 1;
        }
    }

    public final boolean c() {
        PackageManager packageManager = this.f3961a.getPackageManager();
        if (packageManager != null) {
            return packageManager.isInstantApp();
        }
        return false;
    }

    public final boolean a(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String host = uri.getHost();
        if (host == null) {
            return false;
        }
        oh0 oh0Var = this.f3963c;
        oh0Var.getClass();
        List list = (List) oh0Var.a("gads:google_ad_domain_suffixes", kotlin.collections.f0.j(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"), oh0.f9286j);
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (z.h(host, (String) it.next(), false)) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Intent intent) {
        if (intent == null) {
            return false;
        }
        Context c13 = this.f3962b.c();
        if (c13 == null) {
            c13 = this.f3961a;
        }
        if (!(c13 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            c13.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e13) {
            ft2.b("Exception starting Activity: " + e13);
            return false;
        }
    }

    public final long a() {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        PackageInfo packageInfo2;
        long longVersionCode;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = this.f3961a.getPackageManager();
            if (packageManager != null) {
                String packageName = this.f3961a.getPackageName();
                of = PackageManager.PackageInfoFlags.of(128L);
                packageInfo2 = packageManager.getPackageInfo(packageName, of);
                if (packageInfo2 != null) {
                    longVersionCode = packageInfo2.getLongVersionCode();
                    return longVersionCode;
                }
            }
            return 0L;
        }
        PackageManager packageManager2 = this.f3961a.getPackageManager();
        return (packageManager2 == null || (packageInfo = packageManager2.getPackageInfo(this.f3961a.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)) == null) ? 0 : packageInfo.versionCode;
    }

    public static CookieManager b() {
        int myUid = Process.myUid();
        if (myUid == 0 || myUid == 1000 || myUid == 1001 || myUid == 1002 || myUid == 1027) {
            return null;
        }
        return CookieManager.getInstance();
    }
}
