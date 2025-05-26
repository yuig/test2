package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class l extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final l f82617c = new l(7, 8);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("\n    CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec`(`period_start_time`)\n    ");
    }
}
