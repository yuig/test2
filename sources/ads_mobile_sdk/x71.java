package ads_mobile_sdk;

import a.f8;
import a.f9;
import a.gh;
import a.h4;
import a.k7;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.common.util.concurrent.j0;
import com.google.common.util.concurrent.m0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.RequestBody$Companion$toRequestBody$2;

/* loaded from: classes2.dex */
public final class x71 implements a.ee, gh, a.l6 {

    /* renamed from: s */
    public static final nn f13517s;

    /* renamed from: a */
    public final Context f13518a;

    /* renamed from: b */
    public final com.google.common.util.concurrent.e0 f13519b;

    /* renamed from: c */
    public final ExecutorService f13520c;

    /* renamed from: d */
    public final xp0 f13521d;

    /* renamed from: e */
    public final boolean f13522e;

    /* renamed from: f */
    public final String f13523f;

    /* renamed from: g */
    public final long f13524g;

    /* renamed from: h */
    public final long f13525h;

    /* renamed from: i */
    public final double f13526i;

    /* renamed from: j */
    public final String f13527j;

    /* renamed from: k */
    public final AtomicBoolean f13528k = new AtomicBoolean(false);

    /* renamed from: l */
    public final Object f13529l = new Object();

    /* renamed from: m */
    public final Object f13530m = new Object();

    /* renamed from: n */
    public final Object f13531n = new Object();

    /* renamed from: o */
    public final a.u6 f13532o = l4.r();

    /* renamed from: p */
    public final ArrayList f13533p = new ArrayList();

    /* renamed from: q */
    public boolean f13534q = false;

    /* renamed from: r */
    public final HashMap f13535r = new HashMap();

    static {
        f8 r13 = nn.r();
        r13.getClass();
        ln lnVar = ln.ADSHIELD;
        r13.b();
        nn nnVar = (nn) r13.f10110b;
        nnVar.getClass();
        nnVar.binaryName_ = lnVar.a();
        f13517s = (nn) r13.a();
    }

    public x71(Context context, com.google.common.util.concurrent.e0 e0Var, ExecutorService executorService, xp0 xp0Var, Random random, String str, long j13, long j14, double d2, String str2) {
        this.f13518a = context;
        this.f13519b = e0Var;
        this.f13520c = executorService;
        this.f13521d = xp0Var;
        this.f13523f = str;
        this.f13524g = j13;
        this.f13525h = j14;
        this.f13526i = d2;
        this.f13527j = str2;
        this.f13522e = random.nextDouble() < d2;
    }

    public final long a(int i13) {
        long longValue;
        synchronized (this.f13531n) {
            try {
                Long l13 = (Long) this.f13535r.get(Integer.valueOf(i13));
                if (l13 == null) {
                    l13 = 0L;
                }
                longValue = l13.longValue() + 1;
                this.f13535r.put(Integer.valueOf(i13), Long.valueOf(longValue));
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return longValue;
    }

    public final void b() {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        b90 b90Var;
        int i19;
        int i23;
        int i24;
        if (!this.f13522e || this.f13528k.getAndSet(true)) {
            return;
        }
        Context context = this.f13518a;
        String str = this.f13527j;
        double d2 = this.f13526i;
        Locale locale = Locale.getDefault();
        a.u6 r13 = l4.r();
        long j13 = Build.VERSION.SDK_INT;
        r13.b();
        l4 l4Var = (l4) r13.f10110b;
        i13 = l4Var.bitField0_;
        l4Var.bitField0_ = 1 | i13;
        l4Var.apiLevel_ = j13;
        String str2 = Build.MODEL;
        r13.b();
        l4 l4Var2 = (l4) r13.f10110b;
        l4Var2.getClass();
        str2.getClass();
        i14 = l4Var2.bitField0_;
        l4Var2.bitField0_ = i14 | 2;
        l4Var2.model_ = str2;
        String language = locale.getLanguage();
        r13.b();
        l4 l4Var3 = (l4) r13.f10110b;
        l4Var3.getClass();
        language.getClass();
        i15 = l4Var3.bitField0_;
        l4Var3.bitField0_ = i15 | 4;
        l4Var3.locale_ = language;
        String country = locale.getCountry();
        r13.b();
        l4 l4Var4 = (l4) r13.f10110b;
        l4Var4.getClass();
        country.getClass();
        i16 = l4Var4.bitField0_;
        l4Var4.bitField0_ = i16 | 8;
        l4Var4.country_ = country;
        r13.b();
        l4 l4Var5 = (l4) r13.f10110b;
        l4Var5.getClass();
        str.getClass();
        i17 = l4Var5.bitField0_;
        l4Var5.bitField0_ = i17 | RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        l4Var5.hostVersion_ = str;
        String packageName = context.getPackageName();
        r13.b();
        l4 l4Var6 = (l4) r13.f10110b;
        l4Var6.getClass();
        packageName.getClass();
        i18 = l4Var6.bitField0_;
        l4Var6.bitField0_ = i18 | 32;
        l4Var6.appId_ = packageName;
        if (d2 > 0.0d) {
            long j14 = (int) (1.0d / d2);
            r13.b();
            l4 l4Var7 = (l4) r13.f10110b;
            i24 = l4Var7.bitField0_;
            l4Var7.bitField0_ = i24 | BitmapUtils.BITMAP_TO_JPEG_SIZE;
            l4Var7.samplingDenominator_ = j14;
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            long j15 = packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            r13.b();
            l4 l4Var8 = (l4) r13.f10110b;
            i23 = l4Var8.bitField0_;
            l4Var8.bitField0_ = i23 | 64;
            l4Var8.appVersionCode_ = j15;
        } catch (Exception unused) {
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                b90Var = b90.DEVICE_TYPE_AUTO;
            } else if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                b90Var = b90.DEVICE_TYPE_WATCH;
            } else if (packageManager.hasSystemFeature("android.hardware.type.pc")) {
                b90Var = b90.DEVICE_TYPE_PC;
            } else {
                UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                b90Var = (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) ? b90.DEVICE_TYPE_PHONE : b90.DEVICE_TYPE_TV;
            }
            r13.b();
            l4 l4Var9 = (l4) r13.f10110b;
            l4Var9.getClass();
            l4Var9.deviceType_ = b90Var.f2782a;
            i19 = l4Var9.bitField0_;
            l4Var9.bitField0_ = i19 | 16;
        } catch (RuntimeException unused2) {
        }
        l4 l4Var10 = (l4) r13.a();
        synchronized (this.f13529l) {
            a.u6 u6Var = this.f13532o;
            if (!u6Var.f10109a.equals(l4Var10)) {
                u6Var.b();
                qj0.a(u6Var.f10110b, l4Var10);
            }
        }
    }

    public final void c() {
        sj0 sj0Var;
        a.u6 u6Var;
        pk.c1 r13;
        int i13;
        int i14;
        int i15;
        int i16;
        h4 h4Var;
        h4 h4Var2;
        int i17;
        String str;
        int i18;
        int i19;
        synchronized (this.f13529l) {
            try {
                a.u6 u6Var2 = this.f13532o;
                qj0 qj0Var = (qj0) u6Var2.f10109a.a(5, (sj0) null);
                if (u6Var2.f10110b.m()) {
                    u6Var2.f10110b.n();
                    sj0Var = u6Var2.f10110b;
                } else {
                    sj0Var = u6Var2.f10110b;
                }
                qj0Var.f10110b = sj0Var;
                u6Var = (a.u6) qj0Var;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        synchronized (this.f13530m) {
            r13 = pk.c1.r(this.f13533p);
            this.f13533p.clear();
            this.f13534q = false;
        }
        pk.y0 listIterator = r13.listIterator(0);
        int i23 = 0;
        while (listIterator.hasNext()) {
            w71 w71Var = (w71) listIterator.next();
            if (i23 >= this.f13524g) {
                a((l4) u6Var.a());
                u6Var.b();
                l4 l4Var = (l4) u6Var.f10110b;
                l4Var.getClass();
                l4Var.logEvents_ = l22.f7627e;
                i23 = 0;
            }
            k7 r14 = m71.r();
            long j13 = w71Var.f12887a;
            r14.b();
            m71 m71Var = (m71) r14.f10110b;
            i13 = m71Var.bitField0_;
            m71Var.bitField0_ = i13 | 1;
            m71Var.eventId_ = j13;
            long j14 = w71Var.f12888b;
            r14.b();
            m71 m71Var2 = (m71) r14.f10110b;
            i14 = m71Var2.bitField0_;
            m71Var2.bitField0_ = i14 | 2;
            m71Var2.runtimeMs_ = j14;
            long j15 = w71Var.f12891e;
            r14.b();
            m71 m71Var3 = (m71) r14.f10110b;
            i15 = m71Var3.bitField0_;
            m71Var3.bitField0_ = i15 | 32;
            m71Var3.eventCount_ = j15;
            String str2 = w71Var.f12890d;
            if (str2 != null) {
                r14.b();
                m71 m71Var4 = (m71) r14.f10110b;
                m71Var4.getClass();
                i19 = m71Var4.bitField0_;
                m71Var4.bitField0_ = i19 | 64;
                m71Var4.debugInfo_ = str2;
            }
            Throwable th4 = w71Var.f12889c;
            nn2 nn2Var = th4 == null ? nn2.STATUS_SUCCESS : nn2.STATUS_FAIL;
            r14.b();
            m71 m71Var5 = (m71) r14.f10110b;
            m71Var5.getClass();
            m71Var5.status_ = nn2Var.f8886a;
            i16 = m71Var5.bitField0_;
            m71Var5.bitField0_ = i16 | 4;
            if (th4 != null) {
                String name = th4.getClass().getName();
                r14.b();
                m71 m71Var6 = (m71) r14.f10110b;
                m71Var6.getClass();
                i17 = m71Var6.bitField0_;
                m71Var6.bitField0_ = i17 | 8;
                m71Var6.exceptionName_ = name;
                try {
                    StringWriter stringWriter = new StringWriter();
                    try {
                        PrintWriter printWriter = new PrintWriter(stringWriter);
                        try {
                            th4.printStackTrace(printWriter);
                            str = stringWriter.toString();
                            printWriter.close();
                            stringWriter.close();
                        } catch (Throwable th5) {
                            try {
                                printWriter.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        try {
                            stringWriter.close();
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (IOException unused) {
                    str = "";
                }
                r14.b();
                m71 m71Var7 = (m71) r14.f10110b;
                m71Var7.getClass();
                str.getClass();
                i18 = m71Var7.bitField0_;
                m71Var7.bitField0_ = i18 | 16;
                m71Var7.stackTrace_ = str;
            }
            m71 m71Var8 = (m71) r14.a();
            u6Var.b();
            l4 l4Var2 = (l4) u6Var.f10110b;
            l4Var2.getClass();
            h4Var = l4Var2.logEvents_;
            if (!((j) h4Var).f6594a) {
                l4Var2.logEvents_ = e0.t.a(h4Var);
            }
            h4Var2 = l4Var2.logEvents_;
            h4Var2.add(m71Var8);
            i23++;
        }
        if (i23 > 0) {
            a((l4) u6Var.a());
            u6Var.b();
            l4 l4Var3 = (l4) u6Var.f10110b;
            l4Var3.getClass();
            l4Var3.logEvents_ = l22.f7627e;
        }
    }

    @Override // a.gh
    public final com.google.common.util.concurrent.c0 a() {
        a.lf lfVar = new a.lf(this, 1);
        ExecutorService executorService = this.f13520c;
        m0 m0Var = new m0(Executors.callable(lfVar, null));
        executorService.execute(m0Var);
        return m0Var;
    }

    public final void a(int i13, long j13, Throwable th3, String str) {
        if (this.f13522e) {
            synchronized (this.f13530m) {
                try {
                    this.f13533p.add(new w71(i13, j13, th3, str, a(i13)));
                    if (!this.f13534q) {
                        this.f13534q = true;
                        com.google.common.util.concurrent.e0 e0Var = this.f13519b;
                        a.lf lfVar = new a.lf(this, 0);
                        long j14 = this.f13525h;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        j0 j0Var = (j0) e0Var;
                        j0Var.getClass();
                        j0Var.f33572c.schedule(new m0(Executors.callable(lfVar, null)), j14, timeUnit);
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public final void a(l4 l4Var) {
        int i13;
        int i14;
        h4 h4Var;
        h4 h4Var2;
        try {
            f9 r13 = p4.r();
            nn nnVar = f13517s;
            r13.b();
            p4 p4Var = (p4) r13.f10110b;
            p4Var.getClass();
            nnVar.getClass();
            p4Var.clientPingMetadata_ = nnVar;
            i13 = p4Var.bitField0_;
            p4Var.bitField0_ = i13 | 1;
            a.x7 r14 = n4.r();
            r14.b();
            n4 n4Var = (n4) r14.f10110b;
            n4Var.getClass();
            n4Var.adshieldMonitoringMessage_ = l4Var;
            i14 = n4Var.bitField0_;
            n4Var.bitField0_ = i14 | 1;
            n4 n4Var2 = (n4) r14.a();
            r13.b();
            p4 p4Var2 = (p4) r13.f10110b;
            p4Var2.getClass();
            h4Var = p4Var2.payloads_;
            if (!((j) h4Var).f6594a) {
                p4Var2.payloads_ = e0.t.a(h4Var);
            }
            h4Var2 = p4Var2.payloads_;
            h4Var2.add(n4Var2);
            p4 p4Var3 = (p4) r13.a();
            xp0 xp0Var = this.f13521d;
            String str = this.f13523f;
            byte[] a13 = p4Var3.a();
            xp0Var.getClass();
            MediaType.f95651d.getClass();
            MediaType a14 = MediaType.Companion.a("application/x-protobuf");
            RequestBody.Companion companion = RequestBody.f95711a;
            companion.getClass();
            Intrinsics.checkNotNullParameter(a13, "<this>");
            RequestBody$Companion$toRequestBody$2 e13 = RequestBody.Companion.e(companion, a13, a14, 6);
            Request.Builder builder = new Request.Builder();
            builder.j(str);
            builder.g(e13);
            xp0Var.a(builder.b());
        } catch (RuntimeException unused) {
        }
    }
}
