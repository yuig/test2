package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final bk.f f82555a;

    public a(bk.f clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f82555a = clock;
    }

    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.x();
        try {
            StringBuilder sb3 = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            this.f82555a.getClass();
            sb3.append(System.currentTimeMillis() - d0.f82586a);
            sb3.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db3.B(sb3.toString());
            db3.c0();
        } finally {
            db3.p0();
        }
    }
}
