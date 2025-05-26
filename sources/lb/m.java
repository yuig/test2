package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final m f82620c = new m(8, 9);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
