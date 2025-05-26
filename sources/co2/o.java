package co2;

/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final u f28325a = new u(-1, null, null, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final int f28326b = ue.c.G("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12);

    /* renamed from: c, reason: collision with root package name */
    public static final int f28327c = ue.c.G("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12);

    /* renamed from: d, reason: collision with root package name */
    public static final fi.b f28328d = new fi.b("BUFFERED", 4);

    /* renamed from: e, reason: collision with root package name */
    public static final fi.b f28329e = new fi.b("SHOULD_BUFFER", 4);

    /* renamed from: f, reason: collision with root package name */
    public static final fi.b f28330f = new fi.b("S_RESUMING_BY_RCV", 4);

    /* renamed from: g, reason: collision with root package name */
    public static final fi.b f28331g = new fi.b("RESUMING_BY_EB", 4);

    /* renamed from: h, reason: collision with root package name */
    public static final fi.b f28332h = new fi.b("POISONED", 4);

    /* renamed from: i, reason: collision with root package name */
    public static final fi.b f28333i = new fi.b("DONE_RCV", 4);

    /* renamed from: j, reason: collision with root package name */
    public static final fi.b f28334j = new fi.b("INTERRUPTED_SEND", 4);

    /* renamed from: k, reason: collision with root package name */
    public static final fi.b f28335k = new fi.b("INTERRUPTED_RCV", 4);

    /* renamed from: l, reason: collision with root package name */
    public static final fi.b f28336l = new fi.b("CHANNEL_CLOSED", 4);

    /* renamed from: m, reason: collision with root package name */
    public static final fi.b f28337m = new fi.b("SUSPEND", 4);

    /* renamed from: n, reason: collision with root package name */
    public static final fi.b f28338n = new fi.b("SUSPEND_NO_WAITER", 4);

    /* renamed from: o, reason: collision with root package name */
    public static final fi.b f28339o = new fi.b("FAILED", 4);

    /* renamed from: p, reason: collision with root package name */
    public static final fi.b f28340p = new fi.b("NO_RECEIVE_RESULT", 4);

    /* renamed from: q, reason: collision with root package name */
    public static final fi.b f28341q = new fi.b("CLOSE_HANDLER_CLOSED", 4);

    /* renamed from: r, reason: collision with root package name */
    public static final fi.b f28342r = new fi.b("CLOSE_HANDLER_INVOKED", 4);

    /* renamed from: s, reason: collision with root package name */
    public static final fi.b f28343s = new fi.b("NO_CLOSE_CAUSE", 4);

    public static final long a(long j13, boolean z13) {
        return (z13 ? 4611686018427387904L : 0L) + j13;
    }

    public static final boolean b(ao2.m mVar, Object obj, kl2.l lVar) {
        fi.b j13 = mVar.j(obj, lVar);
        if (j13 == null) {
            return false;
        }
        mVar.x(j13);
        return true;
    }
}
