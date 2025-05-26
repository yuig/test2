package sh2;

import com.pinterest.shuffles.scene.composer.AnimatedTarget;
import kotlin.jvm.internal.Intrinsics;
import xf2.d0;

/* loaded from: classes4.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f112952a = new d0("android.threads", false, 14);

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f112953b = new d0("android.crash_number", false, 14);

    /* renamed from: c, reason: collision with root package name */
    public static final d0 f112954c = new d0("exception_handling", false, 14);

    /* renamed from: d, reason: collision with root package name */
    public static final d0 f112955d = new d0("process_identifier", false, 14);

    /* renamed from: e, reason: collision with root package name */
    public static final d0 f112956e = new d0("sequence_id", true, 6);

    /* renamed from: f, reason: collision with root package name */
    public static final d0 f112957f = new d0(AnimatedTarget.PROPERTY_STATE, false, 14);

    /* renamed from: g, reason: collision with root package name */
    public static final d0 f112958g = new d0("cold_start", false, 14);

    /* renamed from: h, reason: collision with root package name */
    public static final d0 f112959h = new d0("session_number", false, 14);

    /* renamed from: i, reason: collision with root package name */
    public static final d0 f112960i = new d0("clean_exit", false, 14);

    /* renamed from: j, reason: collision with root package name */
    public static final d0 f112961j = new d0("terminated", false, 14);

    /* renamed from: k, reason: collision with root package name */
    public static final d0 f112962k = new d0("heartbeat_time_unix_nano", false, 14);

    /* renamed from: l, reason: collision with root package name */
    public static final d0 f112963l = new d0("crash_id", false, 14);

    /* renamed from: m, reason: collision with root package name */
    public static final d0 f112964m = new d0("session_start_type", false, 14);

    /* renamed from: n, reason: collision with root package name */
    public static final d0 f112965n = new d0("session_end_type", false, 14);

    /* renamed from: o, reason: collision with root package name */
    public static final d0 f112966o = new d0("startup_duration", false, 14);

    /* renamed from: p, reason: collision with root package name */
    public static final d0 f112967p;

    /* renamed from: q, reason: collision with root package name */
    public static final d0 f112968q;

    /* renamed from: r, reason: collision with root package name */
    public static final d0 f112969r;

    /* renamed from: s, reason: collision with root package name */
    public static final d0 f112970s;

    /* renamed from: t, reason: collision with root package name */
    public static final d0 f112971t;

    /* renamed from: u, reason: collision with root package name */
    public static final d0 f112972u;

    /* renamed from: v, reason: collision with root package name */
    public static final d0 f112973v;

    static {
        Intrinsics.checkNotNullParameter("threshold", "id");
        String h13 = ig1.b.h1("threshold", false);
        qi2.c cVar = qi2.c.STRING;
        Intrinsics.checkNotNullExpressionValue(ri2.e.a(cVar, h13), "stringKey(name)");
        Intrinsics.checkNotNullParameter("sdk_startup_duration", "id");
        Intrinsics.checkNotNullExpressionValue(ri2.e.a(cVar, ig1.b.h1("sdk_startup_duration", false)), "stringKey(name)");
        f112967p = new d0("error_log_count", false, 14);
        f112968q = new d0("disk_free_bytes", false, 14);
        f112969r = new d0("send_mode", true, 6);
        f112970s = new d0("attachment_size", false, 14);
        f112971t = new d0("attachment_url", false, 14);
        f112972u = new d0("attachment_id", false, 14);
        f112973v = new d0("attachment_error_code", false, 14);
    }
}
