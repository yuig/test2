package tb0;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.util.Pair;
import androidx.appcompat.app.u;
import com.bugsnag.android.g2;
import com.google.firebase.messaging.a0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.lang.reflect.Field;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.Intrinsics;
import rl2.g0;

/* loaded from: classes.dex */
public final class h implements ob0.a {

    /* renamed from: w, reason: collision with root package name */
    public static final HashSet f117076w;

    /* renamed from: a, reason: collision with root package name */
    public e f117077a = e.NONE;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f117078b = new AtomicBoolean(false);

    /* renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f117079c = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f117080d = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f117081e = new AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f117082f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReference f117083g;

    /* renamed from: h, reason: collision with root package name */
    public String f117084h;

    /* renamed from: i, reason: collision with root package name */
    public String f117085i;

    /* renamed from: j, reason: collision with root package name */
    public Random f117086j;

    /* renamed from: k, reason: collision with root package name */
    public d f117087k;

    /* renamed from: l, reason: collision with root package name */
    public final ConcurrentLinkedQueue f117088l;

    /* renamed from: m, reason: collision with root package name */
    public final ConcurrentLinkedQueue f117089m;

    /* renamed from: n, reason: collision with root package name */
    public final ConcurrentLinkedQueue f117090n;

    /* renamed from: o, reason: collision with root package name */
    public final ConcurrentLinkedQueue f117091o;

    /* renamed from: p, reason: collision with root package name */
    public ThreadPoolExecutor f117092p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f117093q;

    /* renamed from: r, reason: collision with root package name */
    public a0 f117094r;

    /* renamed from: s, reason: collision with root package name */
    public n f117095s;

    /* renamed from: t, reason: collision with root package name */
    public final Random f117096t;

    /* renamed from: u, reason: collision with root package name */
    public bg.d f117097u;

    /* renamed from: v, reason: collision with root package name */
    public o f117098v;

    static {
        HashSet hashSet = new HashSet();
        f117076w = hashSet;
        hashSet.add("token");
        hashSet.add("password");
        hashSet.add("apikey");
        hashSet.add("api-key");
        hashSet.add("username");
        hashSet.add("email");
        hashSet.add("e-mail");
    }

    public h() {
        new HashMap();
        this.f117082f = new ArrayList();
        this.f117083g = new AtomicReference();
        this.f117086j = null;
        this.f117088l = new ConcurrentLinkedQueue();
        this.f117089m = new ConcurrentLinkedQueue();
        this.f117090n = new ConcurrentLinkedQueue();
        this.f117091o = new ConcurrentLinkedQueue();
        this.f117093q = false;
        this.f117094r = null;
        this.f117096t = new Random();
        this.f117097u = null;
    }

    public static void B(Class cls, Throwable th3, String str) {
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if (field.getName().equals("detailMessage")) {
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                try {
                    try {
                        field.set(th3, str);
                        return;
                    } catch (Exception unused) {
                        throw new NoSuchFieldError("FailedSet");
                    }
                } finally {
                    field.setAccessible(isAccessible);
                }
            }
        }
        throw new NoSuchFieldError("NotFound");
    }

    public static boolean a(Throwable th3) {
        if (!(th3 instanceof IllegalStateException)) {
            return false;
        }
        StackTraceElement[] stackTrace = th3.getStackTrace();
        if (stackTrace.length > 0) {
            return "getView".equals(stackTrace[0].getMethodName()) && "com.pinterest.framework.mvp.BasePresenter".equals(stackTrace[0].getClassName()) && "BasePresenter.kt".equals(stackTrace[0].getFileName());
        }
        return false;
    }

    public static List c(at1.d dVar) {
        List historicalProcessExitReasons;
        Object obj = d5.a.f53679a;
        ActivityManager activityManager = (ActivityManager) dVar.getSystemService(ActivityManager.class);
        if (activityManager == null) {
            return null;
        }
        historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 1);
        return historicalProcessExitReasons;
    }

    public static void e() {
        Thread.setDefaultUncaughtExceptionHandler(new u(Thread.getDefaultUncaughtExceptionHandler(), 1));
    }

    public static Throwable u(String str, Throwable th3) {
        Class<?> cls = th3.getClass();
        try {
            try {
                Throwable th4 = (Throwable) cls.getConstructor(String.class).newInstance(str);
                th4.setStackTrace(th3.getStackTrace());
                th4.initCause(th3.getCause());
                return th4;
            } catch (NoSuchMethodException unused) {
                B(cls, th3, str);
                return th3;
            } catch (Throwable th5) {
                return new IllegalStateException("Throwable " + th5.getMessage() + " " + str, th3);
            }
        } catch (NoSuchFieldError e13) {
            th3 = new IllegalStateException("NoSuchFieldError " + e13.getMessage() + " " + str, th3);
            return th3;
        }
    }

    public static boolean z(String str) {
        if (pk.a0.x0(str)) {
            return false;
        }
        Iterator it = f117076w.iterator();
        while (it.hasNext()) {
            if (pk.a0.F(str, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void A(String str, Throwable th3) {
        k kVar = new k();
        kVar.c("AAA - Placement", str);
        kVar.b(str, th3);
        k("TrackedException", kVar.f117102a);
    }

    public final void C(String uid) {
        this.f117084h = uid;
        if (this.f117078b.get()) {
            if (!this.f117079c.get()) {
                this.f117085i = uid;
                return;
            }
            bg.d dVar = this.f117097u;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(uid, "uid");
            g2 d2 = dVar.d();
            if (d2 != null) {
                d2.g(uid, null, null);
            }
        }
    }

    public final void b(String keyName, String value) {
        bg.d dVar;
        if (this.f117078b.get() && this.f117079c.get() && (dVar = this.f117097u) != null) {
            Intrinsics.checkNotNullParameter(keyName, "keyName");
            Intrinsics.checkNotNullParameter(value, "value");
            dVar.b(dVar.f22763g, keyName, value);
        }
    }

    public final o d() {
        o oVar = this.f117098v;
        return oVar != null ? oVar : new o();
    }

    public final void f() {
        if (this.f117078b.get() && this.f117079c.get()) {
            this.f117097u.b("installation_info", "installation_info", this.f117082f);
        }
    }

    public final void g(Application application) {
        bg.d dVar;
        d dVar2 = this.f117087k;
        if (dVar2 != null) {
            this.f117095s = dVar2.f117073c;
        }
        synchronized (this.f117079c) {
            try {
                if (this.f117078b.get() && !this.f117079c.get() && (dVar = this.f117097u) != null) {
                    dVar.e(application, this.f117087k, this.f117083g);
                    this.f117092p = new ThreadPoolExecutor(1, 3, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new a());
                    v();
                    f();
                    j(application);
                    e();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void h(String str) {
        ThreadPoolExecutor threadPoolExecutor;
        vb0.j.f125466a.N(str, "trying to log null String to leaveBreadcrumb", new Object[0]);
        if (str == null || (threadPoolExecutor = this.f117092p) == null) {
            return;
        }
        threadPoolExecutor.execute(new e5.k(28, this, str));
    }

    public final void i(String str, StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb3 = new StringBuilder(str);
        int length = stackTraceElementArr.length;
        for (int i13 = 2; i13 < length; i13++) {
            sb3.append("|");
            sb3.append(stackTraceElementArr[i13].getClassName());
            sb3.append("->");
            sb3.append(stackTraceElementArr[i13].getMethodName());
            sb3.append(":");
            sb3.append(stackTraceElementArr[i13].getLineNumber());
        }
        int length2 = sb3.length();
        int i14 = 0;
        while (i14 < length2) {
            int i15 = i14 + RecyclerViewTypes.VIEW_TYPE_VIDEO_CAROUSEL_ACTION_ITEM;
            h(sb3.substring(i14, Math.min(length2, i15)));
            i14 = i15;
        }
    }

    public final void j(Context context) {
        h hVar = g.f117075a;
        hVar.s("is_tablet", String.valueOf(hf0.b.q()));
        hVar.s("startup_network_type", qb0.d.f103396a.e());
        t(qb0.b.e(context));
    }

    public final void k(String str, List list) {
        m(str, list, 1.0f);
    }

    public final void l(Pair pair) {
        long currentTimeMillis = System.currentTimeMillis();
        k kVar = new k();
        kVar.c("TIMESTAMP", Long.toString(currentTimeMillis));
        kVar.c("ReportingTool", this.f117077a.toString());
        kVar.c((String) pair.first, (String) pair.second);
        k("InAppBrowser", kVar.f117102a);
    }

    public final boolean m(String str, List list, float f13) {
        Iterator it;
        if (f13 < 1.0f && this.f117096t.nextFloat() > f13) {
            return false;
        }
        if (list != null && (it = list.iterator()) != null && it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                if (next != null) {
                    next.toString();
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        next2.toString();
                    }
                }
            } else if (next != null) {
                next.toString();
            }
        }
        if (!this.f117078b.get()) {
            return false;
        }
        if (!this.f117079c.get()) {
            this.f117091o.add(new Pair(str, list));
            return true;
        }
        n nVar = this.f117095s;
        if (nVar != null) {
            String str2 = this.f117084h;
            if (str2 == null) {
                str2 = "unknown";
            }
            nVar.a(str2, str, list);
        }
        return true;
    }

    public final synchronized void n(String str, String str2) {
        bg.d dVar;
        if (this.f117078b.get() && (dVar = this.f117097u) != null) {
            dVar.a(str, str2);
        }
    }

    public final void o(String str, Throwable th3) {
        if (th3 == null) {
            return;
        }
        try {
            r(u("org_msg: [" + th3.getMessage() + "] detailed msg [" + str + "]", th3), p.UNSPECIFIED);
        } catch (Exception e13) {
            A("CrashReporting:AddMessageToException", e13);
            r(th3, p.UNSPECIFIED);
        }
    }

    public final void p(Throwable th3) {
        r(th3, p.UNSPECIFIED);
    }

    public final void q(Throwable th3, String str, p pVar) {
        if (th3 == null) {
            return;
        }
        try {
            r(u("org_msg: [" + th3.getMessage() + "] detailed msg [" + str + "]", th3), pVar);
        } catch (Exception e13) {
            A("CrashReporting:AddMessageToException", e13);
            r(th3, pVar);
        }
    }

    public final void r(Throwable throwable, p pVar) {
        boolean X;
        if (throwable == null) {
            return;
        }
        ArrayList arrayList = j.f117099a;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Iterator it = j.f117099a.iterator();
        while (it.hasNext()) {
            switch (((m60.i) ((i) it.next())).f85910a) {
                case 0:
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    X = g0.X(throwable);
                    break;
                case 1:
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    X = g0.p(throwable);
                    break;
                default:
                    Intrinsics.checkNotNullParameter(throwable, "throwable");
                    if ((throwable instanceof UnknownHostException) || (throwable instanceof ConnectException) || (throwable instanceof SocketException) || (throwable instanceof SocketTimeoutException) || (throwable instanceof SSLHandshakeException) || (throwable instanceof SSLPeerUnverifiedException)) {
                        return;
                    } else {
                        continue;
                    }
                    break;
            }
            if (X) {
                return;
            }
        }
        d dVar = this.f117087k;
        if (dVar != null) {
            float f13 = dVar.f117072b;
            if (this.f117086j == null) {
                this.f117086j = new Random();
            }
            if (f13 < 1.0f && this.f117086j.nextFloat() > f13) {
                return;
            }
        }
        if (z(throwable.getMessage())) {
            throwable = u("<filtered>", throwable);
        }
        if (this.f117078b.get()) {
            if (this.f117079c.get()) {
                this.f117097u.g(throwable, pVar);
            } else {
                this.f117090n.add(throwable);
            }
        }
    }

    public final void s(String str, String str2) {
        if (this.f117078b.get()) {
            if (!this.f117079c.get() || str2 == null) {
                this.f117088l.add(new Pair(str, str2));
            } else {
                this.f117097u.b("account", str, str2);
            }
        }
    }

    public final void t(String str) {
        AtomicReference atomicReference = this.f117083g;
        if (!pk.a0.s0((String) atomicReference.get()) || pk.a0.s0(str)) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        atomicReference.set(lowerCase);
        s("user_set_country_code", lowerCase);
    }

    public final void v() {
        AtomicBoolean atomicBoolean = this.f117079c;
        atomicBoolean.set(true);
        this.f117080d.set(false);
        if (!pk.a0.x0(this.f117085i)) {
            C(this.f117085i);
            this.f117085i = null;
        }
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f117088l;
            if (concurrentLinkedQueue.isEmpty()) {
                break;
            }
            Pair pair = (Pair) concurrentLinkedQueue.poll();
            Object obj = pair.second;
            if (obj instanceof String) {
                s((String) pair.first, (String) obj);
            } else if (obj instanceof Float) {
                w((String) pair.first, ((Float) obj).floatValue());
            } else if (obj instanceof Integer) {
                String str = (String) pair.first;
                Integer num = (Integer) obj;
                num.getClass();
                if (this.f117078b.get()) {
                    if (atomicBoolean.get()) {
                        this.f117097u.b("account", str, num);
                    } else {
                        concurrentLinkedQueue.add(new Pair(str, num));
                    }
                }
            } else if (obj instanceof Boolean) {
                y((String) pair.first, ((Boolean) obj).booleanValue());
            }
        }
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue2 = this.f117089m;
            if (concurrentLinkedQueue2.isEmpty()) {
                break;
            } else {
                h((String) concurrentLinkedQueue2.poll());
            }
        }
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue3 = this.f117090n;
            if (concurrentLinkedQueue3.isEmpty()) {
                break;
            } else {
                o("CrashReporting:SubmitPreInitLogs", (Throwable) concurrentLinkedQueue3.poll());
            }
        }
        while (true) {
            ConcurrentLinkedQueue concurrentLinkedQueue4 = this.f117091o;
            if (concurrentLinkedQueue4.isEmpty()) {
                return;
            }
            Pair pair2 = (Pair) concurrentLinkedQueue4.poll();
            k((String) pair2.first, (List) pair2.second);
        }
    }

    public final void w(String str, float f13) {
        if (this.f117078b.get()) {
            if (this.f117079c.get()) {
                this.f117097u.b("account", str, Float.valueOf(f13));
            } else {
                this.f117088l.add(new Pair(str, Float.valueOf(f13)));
            }
        }
    }

    public final void x(String str, String str2) {
        if (this.f117078b.get()) {
            if (this.f117079c.get()) {
                this.f117097u.b("account", str, str2);
            } else {
                this.f117088l.add(new Pair(str, str2));
            }
        }
    }

    public final void y(String str, boolean z13) {
        if (this.f117078b.get()) {
            if (this.f117079c.get()) {
                this.f117097u.b("account", str, Boolean.valueOf(z13));
            } else {
                this.f117088l.add(new Pair(str, Boolean.valueOf(z13)));
            }
        }
    }
}
