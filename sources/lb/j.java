package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final j f82601c = new j(4, 5);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        db3.B("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
