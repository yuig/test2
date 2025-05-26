package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final k f82615c = new k(6, 7);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("\n    CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress`\n    BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`)\n    REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )\n    ");
    }
}
