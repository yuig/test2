package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final e f82587c = new e(12, 13);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("UPDATE workspec SET required_network_type = 0 WHERE required_network_type IS NULL ");
        db3.B("UPDATE workspec SET content_uri_triggers = x'' WHERE content_uri_triggers is NULL");
    }
}
