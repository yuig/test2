package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final h f82595c = new h(1, 2);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("\n    CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id`\n    INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
        db3.B("\n    INSERT INTO SystemIdInfo(work_spec_id, system_id)\n    SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo\n    ");
        db3.B("DROP TABLE IF EXISTS alarmInfo");
        db3.B("\n                INSERT OR IGNORE INTO worktag(tag, work_spec_id)\n                SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec\n                ");
    }
}
