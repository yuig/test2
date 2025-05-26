package ads_mobile_sdk;

import a.yd;
import a.zb;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import ao2.g2;
import ao2.j0;
import com.google.android.gms.ads.AdError;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import ol2.f;

/* loaded from: classes2.dex */
public final class ks2 implements a.j3 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7477a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f7478b;

    /* renamed from: c, reason: collision with root package name */
    public final zb f7479c;

    /* renamed from: d, reason: collision with root package name */
    public final yd f7480d;

    /* renamed from: e, reason: collision with root package name */
    public final cc0 f7481e;

    /* renamed from: f, reason: collision with root package name */
    public final String f7482f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7483g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7484h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7485i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7486j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7487k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7488l;

    public ks2(Context applicationContext, oh0 flags, zb clock, yd traceReporter, cc0 exceptionReporter, String applicationId, String afmaVersionString, String gmaVersion) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(flags, "flags");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(traceReporter, "traceReporter");
        Intrinsics.checkNotNullParameter(exceptionReporter, "exceptionReporter");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(afmaVersionString, "afmaVersionString");
        Intrinsics.checkNotNullParameter(gmaVersion, "gmaVersion");
        this.f7477a = applicationContext;
        this.f7478b = flags;
        this.f7479c = clock;
        this.f7480d = traceReporter;
        this.f7481e = exceptionReporter;
        this.f7482f = applicationId;
        this.f7483g = afmaVersionString;
        this.f7484h = gmaVersion;
    }

    public final void a(j0 backgroundScope) {
        String value;
        String str;
        String str2;
        long j13;
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        ds2.f4430a = this;
        String value2 = this.f7477a.getPackageName();
        PackageManager packageManager = this.f7477a.getPackageManager();
        if (packageManager == null || (packageInfo = packageManager.getPackageInfo(this.f7477a.getPackageName(), RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN)) == null || (value = packageInfo.versionName) == null) {
            value = "";
        }
        a.b4 builder = ql0.r();
        Intrinsics.checkNotNullExpressionValue(builder, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder, "builder");
        ll0 value3 = ll0.OS_ANDROID;
        Intrinsics.checkNotNullParameter(value3, "value");
        builder.getClass();
        builder.b();
        ql0 ql0Var = (ql0) builder.f10110b;
        ql0Var.getClass();
        ql0Var.os_ = value3.a();
        String value4 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(value4, "RELEASE");
        Intrinsics.checkNotNullParameter(value4, "value");
        builder.b();
        ql0 ql0Var2 = (ql0) builder.f10110b;
        ql0Var2.getClass();
        value4.getClass();
        ql0Var2.osVersion_ = value4;
        String value5 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(value5, "MODEL");
        Intrinsics.checkNotNullParameter(value5, "value");
        builder.b();
        ql0 ql0Var3 = (ql0) builder.f10110b;
        ql0Var3.getClass();
        value5.getClass();
        ql0Var3.deviceModel_ = value5;
        int i13 = Build.VERSION.SDK_INT;
        builder.b();
        ((ql0) builder.f10110b).targetVersion_ = i13;
        String value6 = this.f7483g;
        Intrinsics.checkNotNullParameter(value6, "value");
        builder.b();
        ql0 ql0Var4 = (ql0) builder.f10110b;
        ql0Var4.getClass();
        value6.getClass();
        ql0Var4.sdkVersion_ = value6;
        String value7 = this.f7484h;
        Intrinsics.checkNotNullParameter(value7, "value");
        builder.b();
        ql0 ql0Var5 = (ql0) builder.f10110b;
        ql0Var5.getClass();
        value7.getClass();
        ql0Var5.canonicalSdkVersion_ = value7;
        Intrinsics.f(value2);
        Intrinsics.checkNotNullParameter(value2, "value");
        builder.b();
        ql0 ql0Var6 = (ql0) builder.f10110b;
        ql0Var6.getClass();
        ql0Var6.appName_ = value2;
        Intrinsics.checkNotNullParameter(value, "value");
        builder.b();
        ql0 ql0Var7 = (ql0) builder.f10110b;
        ql0Var7.getClass();
        ql0Var7.appVersionName_ = value;
        String value8 = this.f7482f;
        Intrinsics.checkNotNullParameter(value8, "value");
        builder.b();
        ql0 ql0Var8 = (ql0) builder.f10110b;
        ql0Var8.getClass();
        value8.getClass();
        ql0Var8.appId_ = value8;
        String value9 = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(value9, "getCountry(...)");
        Intrinsics.checkNotNullParameter(value9, "value");
        builder.b();
        ql0 ql0Var9 = (ql0) builder.f10110b;
        ql0Var9.getClass();
        value9.getClass();
        ql0Var9.country_ = value9;
        oh0 oh0Var = this.f7478b;
        Double valueOf = Double.valueOf(1.0d);
        yg0 yg0Var = oh0.f9282f;
        if (((Number) oh0Var.a("gads:cui_monitoring_session_sample_rate", valueOf, yg0Var)).doubleValue() > 0.0d) {
            str = value2;
            str2 = value;
            j13 = (long) (1 / ((Number) this.f7478b.a("gads:cui_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue());
        } else {
            str = value2;
            str2 = value;
            j13 = 0;
        }
        builder.b();
        ((ql0) builder.f10110b).samplingDenominator_ = j13;
        sj0 a13 = builder.a();
        Intrinsics.checkNotNullExpressionValue(a13, "build(...)");
        ql0 ql0Var10 = (ql0) a13;
        a.je builder2 = yk0.r();
        Intrinsics.checkNotNullExpressionValue(builder2, "newBuilder(...)");
        Intrinsics.checkNotNullParameter(builder2, "builder");
        t71 value10 = t71.OS_ANDROID;
        Intrinsics.checkNotNullParameter(value10, "value");
        builder2.getClass();
        builder2.b();
        yk0 yk0Var = (yk0) builder2.f10110b;
        yk0Var.getClass();
        yk0Var.os_ = value10.a();
        Intrinsics.checkNotNullExpressionValue(value4, "RELEASE");
        Intrinsics.checkNotNullParameter(value4, "value");
        builder2.b();
        yk0 yk0Var2 = (yk0) builder2.f10110b;
        yk0Var2.getClass();
        yk0Var2.osVersion_ = value4;
        Intrinsics.checkNotNullExpressionValue(value5, "MODEL");
        Intrinsics.checkNotNullParameter(value5, "value");
        builder2.b();
        yk0 yk0Var3 = (yk0) builder2.f10110b;
        yk0Var3.getClass();
        yk0Var3.deviceModel_ = value5;
        builder2.b();
        ((yk0) builder2.f10110b).targetVersion_ = i13;
        String value11 = this.f7484h;
        Intrinsics.checkNotNullParameter(value11, "value");
        builder2.b();
        yk0 yk0Var4 = (yk0) builder2.f10110b;
        yk0Var4.getClass();
        value11.getClass();
        yk0Var4.sdkVersion_ = value11;
        String value12 = this.f7483g;
        Intrinsics.checkNotNullParameter(value12, "value");
        builder2.b();
        yk0 yk0Var5 = (yk0) builder2.f10110b;
        yk0Var5.getClass();
        value12.getClass();
        yk0Var5.afmaVersion_ = value12;
        String value13 = str;
        Intrinsics.checkNotNullParameter(value13, "value");
        builder2.b();
        yk0 yk0Var6 = (yk0) builder2.f10110b;
        yk0Var6.getClass();
        yk0Var6.appName_ = value13;
        String value14 = str2;
        Intrinsics.checkNotNullParameter(value14, "value");
        builder2.b();
        yk0 yk0Var7 = (yk0) builder2.f10110b;
        yk0Var7.getClass();
        yk0Var7.appVersionName_ = value14;
        String value15 = this.f7482f;
        Intrinsics.checkNotNullParameter(value15, "value");
        builder2.b();
        yk0 yk0Var8 = (yk0) builder2.f10110b;
        yk0Var8.getClass();
        value15.getClass();
        yk0Var8.appId_ = value15;
        String value16 = Locale.getDefault().getCountry();
        Intrinsics.checkNotNullExpressionValue(value16, "getCountry(...)");
        Intrinsics.checkNotNullParameter(value16, "value");
        builder2.b();
        yk0 yk0Var9 = (yk0) builder2.f10110b;
        yk0Var9.getClass();
        value16.getClass();
        yk0Var9.country_ = value16;
        sj0 a14 = builder2.a();
        Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
        yk0 baseMessage = (yk0) a14;
        f.f96454a.getClass();
        ol2.a aVar = f.f96455b;
        this.f7485i = aVar.c() < ((Number) this.f7478b.a("gads:cui_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue();
        this.f7486j = aVar.c() < ((Number) this.f7478b.a("gads:trapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue();
        this.f7487k = aVar.c() < ((Number) this.f7478b.a("gads:untrapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue();
        this.f7488l = aVar.c() < ((Number) this.f7478b.a("gads:cui_monitoring_trace_failure_stacktrace_rate", Double.valueOf(0.01d), yg0Var)).doubleValue();
        AtomicReference variationsData = new AtomicReference(null);
        AtomicReference rawVariationsData = new AtomicReference(null);
        this.f7480d.a(backgroundScope, ql0Var10, variationsData, rawVariationsData);
        cc0 cc0Var = this.f7481e;
        cc0Var.getClass();
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(baseMessage, "baseMessage");
        Intrinsics.checkNotNullParameter(variationsData, "variationsData");
        Intrinsics.checkNotNullParameter(rawVariationsData, "rawVariationsData");
        if (((Number) cc0Var.f14127c.a("gads:trapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue() > 0.0d) {
            cc0Var.f3861k = (long) (1 / ((Number) cc0Var.f14127c.a("gads:trapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue());
        }
        if (((Number) cc0Var.f14127c.a("gads:untrapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue() > 0.0d) {
            cc0Var.f3862l = (long) (1 / ((Number) cc0Var.f14127c.a("gads:untrapped_exception_monitoring_session_sample_rate", Double.valueOf(1.0d), yg0Var)).doubleValue());
        }
        cc0Var.a(backgroundScope, baseMessage, variationsData, rawVariationsData);
        gs2 block = new gs2(variationsData, rawVariationsData, this, null);
        kotlin.coroutines.j context = kotlin.coroutines.j.f80412a;
        Intrinsics.checkNotNullParameter(backgroundScope, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(block, "block");
        kotlin.jvm.internal.j.z(backgroundScope, context, null, new et2(block, null), 2);
    }

    public final void a(String label, Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Intrinsics.checkNotNullParameter(label, "label");
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new hs2(label, exception));
        if (this.f7486j) {
            cc0 cc0Var = this.f7481e;
            cs2 cs2Var = qs2.b().f9801a;
            ss2 ss2Var = cs2Var != null ? cs2Var.f4018a : null;
            this.f7479c.getClass();
            cc0Var.a(new ec0(exception, label, ss2Var, true, System.currentTimeMillis()));
        }
    }

    public final void a(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        ok.e0 e0Var = gk0.f5596a;
        gk0.a(new is2(exception));
        if (this.f7487k) {
            boolean z13 = false;
            boolean z14 = false;
            for (Throwable th3 = exception; th3 != null; th3 = th3.getCause()) {
                StackTraceElement[] stackTrace = th3.getStackTrace();
                Intrinsics.f(stackTrace);
                for (StackTraceElement stackTraceElement : stackTrace) {
                    String className = stackTraceElement.getClassName();
                    Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
                    if (z.p(className, AdError.GOOGLE_MOBILE_ADS_DOMAIN, false)) {
                        z13 = true;
                    }
                    if (Intrinsics.d(stackTraceElement.getClassName(), ks2.class.getName()) || Intrinsics.d(stackTraceElement.getClassName(), cc0.class.getName())) {
                        z14 = true;
                        break;
                    }
                }
            }
            if (z13 && !z14) {
                cc0 cc0Var = this.f7481e;
                this.f7479c.getClass();
                cc0Var.a(new ec0(exception, "UNTRAPPED_EXCEPTION", null, false, System.currentTimeMillis()));
            }
        }
        kotlin.jvm.internal.j.H(g2.f20157b, new js2(this, null));
    }
}
