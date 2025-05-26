package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final i f82598c = new i(3, 4);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("\n    UPDATE workspec SET schedule_requested_at = 0\n    WHERE state NOT IN (2, 3, 5)\n        AND schedule_requested_at = -1\n        AND interval_duration <> 0\n    ");
    }
}
