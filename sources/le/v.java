package le;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.c1;
import df.k1;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.h1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a */
    public static final v f83104a = new v();

    /* renamed from: b */
    public static final HashSet f83105b = h1.c(g0.DEVELOPER_ERRORS);

    /* renamed from: c */
    public static Executor f83106c;

    /* renamed from: d */
    public static volatile String f83107d;

    /* renamed from: e */
    public static volatile String f83108e;

    /* renamed from: f */
    public static volatile String f83109f;

    /* renamed from: g */
    public static volatile Boolean f83110g;

    /* renamed from: h */
    public static tb.c f83111h;

    /* renamed from: i */
    public static Context f83112i;

    /* renamed from: j */
    public static int f83113j;

    /* renamed from: k */
    public static final ReentrantLock f83114k;

    /* renamed from: l */
    public static final String f83115l;

    /* renamed from: m */
    public static boolean f83116m;

    /* renamed from: n */
    public static boolean f83117n;

    /* renamed from: o */
    public static boolean f83118o;

    /* renamed from: p */
    public static final AtomicBoolean f83119p;

    /* renamed from: q */
    public static volatile String f83120q;

    /* renamed from: r */
    public static volatile String f83121r;

    /* renamed from: s */
    public static final c3.e f83122s;

    /* renamed from: t */
    public static boolean f83123t;

    static {
        new AtomicLong(65536L);
        f83113j = 64206;
        f83114k = new ReentrantLock();
        int i13 = c1.f54739a;
        f83115l = "v15.0";
        f83119p = new AtomicBoolean(false);
        f83120q = "instagram.com";
        f83121r = "facebook.com";
        f83122s = new c3.e(15);
    }

    public static final Context a() {
        k1.f();
        Context context = f83112i;
        if (context != null) {
            return context;
        }
        Intrinsics.r("applicationContext");
        throw null;
    }

    public static final String b() {
        k1.f();
        String str = f83107d;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final String c() {
        k1.f();
        String str = f83109f;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    public static final Executor d() {
        ReentrantLock reentrantLock = f83114k;
        reentrantLock.lock();
        try {
            if (f83106c == null) {
                f83106c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            Unit unit = Unit.f80348a;
            reentrantLock.unlock();
            Executor executor = f83106c;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    public static final String e() {
        String str = f83115l;
        Intrinsics.checkNotNullExpressionValue(String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1)), "java.lang.String.format(format, *args)");
        return str;
    }

    public static final String f() {
        Date date = AccessToken.f29844l;
        AccessToken s13 = wc.j.s();
        String f29857k = s13 != null ? s13.getF29857k() : null;
        String str = f83121r;
        return f29857k == null ? str : Intrinsics.d(f29857k, "gaming") ? kotlin.text.z.n(str, "facebook.com", "fb.gg") : Intrinsics.d(f29857k, "instagram") ? kotlin.text.z.n(str, "facebook.com", "instagram.com") : str;
    }

    public static final boolean g(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        k1.f();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean h() {
        boolean z13;
        synchronized (v.class) {
            z13 = f83123t;
        }
        return z13;
    }

    public static final void i(g0 behavior) {
        Intrinsics.checkNotNullParameter(behavior, "behavior");
        synchronized (f83105b) {
        }
    }

    public static final void j(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f83107d == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    if (kotlin.text.z.p(ep.b.l(locale, "ROOT", str, locale, "(this as java.lang.String).toLowerCase(locale)"), "fb", false)) {
                        String substring = str.substring(2);
                        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
                        f83107d = substring;
                    } else {
                        f83107d = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (f83108e == null) {
                f83108e = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f83109f == null) {
                f83109f = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (f83113j == 64206) {
                f83113j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f83110g == null) {
                f83110g = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final synchronized void k(Context applicationContext) {
        synchronized (v.class) {
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            l(applicationContext, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[Catch: all -> 0x00ca, TRY_ENTER, TryCatch #1 {all -> 0x00ca, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0023, B:14:0x0032, B:16:0x0039, B:18:0x0041, B:19:0x0048, B:21:0x0058, B:22:0x005f, B:24:0x0073, B:26:0x007a, B:28:0x0080, B:30:0x0084, B:32:0x008a, B:57:0x00a7, B:34:0x00ae, B:36:0x00b2, B:38:0x00b6, B:40:0x00bc, B:42:0x00c2, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:47:0x00df, B:50:0x015e, B:51:0x0163, B:52:0x0164, B:53:0x0169, B:60:0x00ab, B:61:0x016a, B:62:0x0171, B:63:0x0172, B:64:0x0179, B:65:0x017a, B:66:0x017f, B:55:0x009a), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0058 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0023, B:14:0x0032, B:16:0x0039, B:18:0x0041, B:19:0x0048, B:21:0x0058, B:22:0x005f, B:24:0x0073, B:26:0x007a, B:28:0x0080, B:30:0x0084, B:32:0x008a, B:57:0x00a7, B:34:0x00ae, B:36:0x00b2, B:38:0x00b6, B:40:0x00bc, B:42:0x00c2, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:47:0x00df, B:50:0x015e, B:51:0x0163, B:52:0x0164, B:53:0x0169, B:60:0x00ab, B:61:0x016a, B:62:0x0171, B:63:0x0172, B:64:0x0179, B:65:0x017a, B:66:0x017f, B:55:0x009a), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073 A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0023, B:14:0x0032, B:16:0x0039, B:18:0x0041, B:19:0x0048, B:21:0x0058, B:22:0x005f, B:24:0x0073, B:26:0x007a, B:28:0x0080, B:30:0x0084, B:32:0x008a, B:57:0x00a7, B:34:0x00ae, B:36:0x00b2, B:38:0x00b6, B:40:0x00bc, B:42:0x00c2, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:47:0x00df, B:50:0x015e, B:51:0x0163, B:52:0x0164, B:53:0x0169, B:60:0x00ab, B:61:0x016a, B:62:0x0171, B:63:0x0172, B:64:0x0179, B:65:0x017a, B:66:0x017f, B:55:0x009a), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a A[Catch: all -> 0x00ca, TryCatch #1 {all -> 0x00ca, blocks: (B:4:0x0003, B:11:0x0013, B:12:0x0023, B:14:0x0032, B:16:0x0039, B:18:0x0041, B:19:0x0048, B:21:0x0058, B:22:0x005f, B:24:0x0073, B:26:0x007a, B:28:0x0080, B:30:0x0084, B:32:0x008a, B:57:0x00a7, B:34:0x00ae, B:36:0x00b2, B:38:0x00b6, B:40:0x00bc, B:42:0x00c2, B:43:0x00cd, B:44:0x00d2, B:45:0x00d3, B:47:0x00df, B:50:0x015e, B:51:0x0163, B:52:0x0164, B:53:0x0169, B:60:0x00ab, B:61:0x016a, B:62:0x0171, B:63:0x0172, B:64:0x0179, B:65:0x017a, B:66:0x017f, B:55:0x009a), top: B:3:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final synchronized void l(android.content.Context r7, yq1.d1 r8) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: le.v.l(android.content.Context, yq1.d1):void");
    }
}
