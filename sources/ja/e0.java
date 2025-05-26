package ja;

import android.database.Cursor;
import androidx.appcompat.app.x0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends oa.c {

    /* renamed from: b, reason: collision with root package name */
    public g f75197b;

    /* renamed from: c, reason: collision with root package name */
    public final e7.e f75198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f75199d;

    /* renamed from: e, reason: collision with root package name */
    public final String f75200e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g configuration, e7.e delegate, String identityHash, String legacyHash) {
        super(delegate.f57530b);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(identityHash, "identityHash");
        Intrinsics.checkNotNullParameter(legacyHash, "legacyHash");
        this.f75197b = configuration;
        this.f75198c = delegate;
        this.f75199d = identityHash;
        this.f75200e = legacyHash;
    }

    @Override // oa.c
    public final void b(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        super.b(db3);
    }

    @Override // oa.c
    public final void c(pa.c db3) {
        Intrinsics.checkNotNullParameter(db3, "db");
        Intrinsics.checkNotNullParameter(db3, "db");
        Cursor c13 = db3.c("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z13 = false;
            if (c13.moveToFirst()) {
                if (c13.getInt(0) == 0) {
                    z13 = true;
                }
            }
            dl2.b.J(c13, null);
            e7.e eVar = this.f75198c;
            eVar.f(db3);
            if (!z13) {
                x0 m13 = eVar.m(db3);
                if (!m13.f16147a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + ((String) m13.f16148b));
                }
            }
            g(db3);
            eVar.j(db3);
        } finally {
        }
    }

    @Override // oa.c
    public final void d(pa.c db3, int i13, int i14) {
        Intrinsics.checkNotNullParameter(db3, "db");
        f(db3, i13, i14);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(pa.c r6) {
        /*
            r5 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.c(r0)
            boolean r1 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L20
            r2 = 0
            if (r1 == 0) goto L23
            int r1 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L20
            if (r1 == 0) goto L23
            r1 = 1
            goto L24
        L20:
            r6 = move-exception
            goto L96
        L23:
            r1 = r2
        L24:
            r3 = 0
            dl2.b.J(r0, r3)
            e7.e r0 = r5.f75198c
            if (r1 == 0) goto L6d
            oa.a r1 = new oa.a
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.G0(r1)
            boolean r4 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L42
            if (r4 == 0) goto L44
            java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Throwable -> L42
            goto L45
        L42:
            r6 = move-exception
            goto L67
        L44:
            r2 = r3
        L45:
            dl2.b.J(r1, r3)
            java.lang.String r1 = r5.f75199d
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r1, r2)
            if (r4 != 0) goto L78
            java.lang.String r4 = r5.f75200e
            boolean r4 = kotlin.jvm.internal.Intrinsics.d(r4, r2)
            if (r4 == 0) goto L59
            goto L78
        L59:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r3 = ", found: "
            java.lang.String r0 = t3.s1.c(r0, r1, r3, r2)
            r6.<init>(r0)
            throw r6
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r0 = move-exception
            dl2.b.J(r1, r6)
            throw r0
        L6d:
            androidx.appcompat.app.x0 r1 = r0.m(r6)
            boolean r2 = r1.f16147a
            if (r2 == 0) goto L7e
            r5.g(r6)
        L78:
            r0.k(r6)
            r5.f75197b = r3
            return
        L7e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r0.<init>(r2)
            java.lang.Object r1 = r1.f16148b
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L96:
            throw r6     // Catch: java.lang.Throwable -> L97
        L97:
            r1 = move-exception
            dl2.b.J(r0, r6)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e0.e(pa.c):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0040 A[EDGE_INSN: B:61:0x0040->B:44:0x0040 BREAK  A[LOOP:1: B:23:0x002a->B:45:?], SYNTHETIC] */
    @Override // oa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(pa.c r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 239
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ja.e0.f(pa.c, int, int):void");
    }

    public final void g(pa.c cVar) {
        cVar.B("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        cVar.B(kh2.g0.i(this.f75199d));
    }
}
