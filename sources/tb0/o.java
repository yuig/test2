package tb0;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: k, reason: collision with root package name */
    public static boolean f117104k = false;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f117105l = false;

    /* renamed from: m, reason: collision with root package name */
    public static boolean f117106m = false;

    /* renamed from: n, reason: collision with root package name */
    public static final AtomicReference f117107n = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public boolean f117108a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f117109b;

    /* renamed from: c, reason: collision with root package name */
    public long f117110c;

    /* renamed from: d, reason: collision with root package name */
    public long f117111d;

    /* renamed from: e, reason: collision with root package name */
    public long f117112e;

    /* renamed from: f, reason: collision with root package name */
    public long f117113f;

    /* renamed from: g, reason: collision with root package name */
    public final String f117114g;

    /* renamed from: h, reason: collision with root package name */
    public String f117115h;

    /* renamed from: i, reason: collision with root package name */
    public final String f117116i;

    /* renamed from: j, reason: collision with root package name */
    public String f117117j;

    public o() {
        this.f117108a = false;
        this.f117109b = false;
        this.f117110c = 0L;
        this.f117111d = 0L;
        this.f117112e = 0L;
        this.f117113f = 0L;
        this.f117114g = "";
        this.f117115h = "";
        this.f117116i = "";
        this.f117117j = "";
        lb0.b bVar = (lb0.b) lb0.n.f82724c.a();
        boolean e13 = bVar.e("PREF_DID_CRASH_ON_LAST_LOAD", false);
        this.f117108a = e13;
        f117104k = e13;
        bVar.k("PREF_DID_CRASH_ON_LAST_LOAD");
        f117106m = bVar.e("PREF_DID_CRASH_BY_ANR", false);
        bVar.k("PREF_DID_CRASH_BY_ANR");
        this.f117113f = bVar.g("PREF_LAST_CRASH_TIMESTAMP", 0L);
        bVar.k("PREF_LAST_CRASH_TIMESTAMP");
        boolean e14 = bVar.e("PREF_LAST_CRASH_OOM", false);
        this.f117109b = e14;
        f117105l = e14;
        bVar.k("PREF_LAST_CRASH_OOM");
        this.f117114g = bVar.j("PREF_LAST_CRASH_MESSAGE", "") != null ? bVar.j("PREF_LAST_CRASH_MESSAGE", "") : "";
        bVar.k("PREF_LAST_CRASH_MESSAGE");
        this.f117115h = bVar.j("PREF_LAST_CRASH_ERROR_CLASS", "") != null ? bVar.j("PREF_LAST_CRASH_ERROR_CLASS", "") : "";
        bVar.k("PREF_LAST_CRASH_ERROR_CLASS");
        this.f117116i = bVar.j("PREF_LAST_CRASH_TRACE_LAST_LINE", "") != null ? bVar.j("PREF_LAST_CRASH_TRACE_LAST_LINE", "") : "";
        bVar.k("PREF_LAST_CRASH_TRACE_LAST_LINE");
        this.f117117j = bVar.j("PREF_LAST_CRASH_API_STAGE", "") != null ? bVar.j("PREF_LAST_CRASH_API_STAGE", "") : "";
        bVar.k("PREF_LAST_CRASH_API_STAGE");
        if (this.f117109b) {
            this.f117110c = bVar.g("PREF_LAST_CRASH_OOM_TOTAL", 0L);
            bVar.k("PREF_LAST_CRASH_OOM_TOTAL");
            this.f117111d = bVar.g("PREF_LAST_CRASH_OOM_USED", 0L);
            bVar.k("PREF_LAST_CRASH_OOM_USED");
            this.f117112e = bVar.g("PREF_LAST_CRASH_OOM_FREE", 0L);
            bVar.k("PREF_LAST_CRASH_OOM_FREE");
        }
    }

    public static int a(boolean z13, Throwable th3) {
        lb0.o a13 = lb0.n.f82724c.a();
        String message = th3.getMessage();
        String simpleName = th3.getClass().getSimpleName();
        String str = (String) f117107n.get();
        lb0.b bVar = (lb0.b) a13;
        lb0.m c13 = bVar.c();
        c13.putBoolean("PREF_DID_CRASH_ON_LAST_LOAD", true);
        c13.putLong("PREF_LAST_CRASH_TIMESTAMP", System.currentTimeMillis());
        int i13 = 0;
        c13.putString("PREF_LAST_CRASH_MESSAGE", message != null ? message.substring(0, Math.min(message.length(), 100)) : "[null]");
        c13.putString("PREF_LAST_CRASH_ERROR_CLASS", simpleName);
        if (str == null) {
            str = "";
        }
        c13.putString("PREF_LAST_CRASH_API_STAGE", str);
        if (th3.getStackTrace() != null && th3.getStackTrace().length > 0) {
            String stackTraceElement = th3.getStackTrace()[0].toString();
            c13.putString("PREF_LAST_CRASH_TRACE_LAST_LINE", stackTraceElement.substring(Math.max(stackTraceElement.length() - 100, 0)));
        }
        if (!z13) {
            i13 = bVar.f("PREF_NUM_CRASH_PRE_EXP_INIT", 0) + 1;
            c13.putInt("PREF_NUM_CRASH_PRE_EXP_INIT", i13);
        }
        if ((th3 instanceof OutOfMemoryError) || (th3.getCause() instanceof OutOfMemoryError)) {
            Runtime runtime = Runtime.getRuntime();
            c13.putBoolean("PREF_LAST_CRASH_OOM", true);
            c13.putLong("PREF_LAST_CRASH_OOM_TOTAL", runtime.maxMemory() / 1048576);
            c13.putLong("PREF_LAST_CRASH_OOM_USED", (runtime.totalMemory() - runtime.freeMemory()) / 1048576);
            c13.putLong("PREF_LAST_CRASH_OOM_FREE", runtime.freeMemory() / 1048576);
        }
        c13.commit();
        return i13;
    }
}
