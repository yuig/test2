package lb;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d extends ka.b {

    /* renamed from: c, reason: collision with root package name */
    public static final d f82585c = new d(11, 12);

    @Override // ka.b
    public final void a(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        db3.B("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
