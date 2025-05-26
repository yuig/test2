package ae0;

import ja.f0;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15041a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f15042b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f15043c;

    public /* synthetic */ d(e eVar, f0 f0Var, int i13) {
        this.f15041a = i13;
        this.f15043c = eVar;
        this.f15042b = f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
    
        return r2;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() {
        /*
            r6 = this;
            int r0 = r6.f15041a
            java.lang.String r1 = "Query returned empty result set: "
            r2 = 0
            r3 = 0
            ja.f0 r4 = r6.f15042b
            ae0.e r5 = r6.f15043c
            switch(r0) {
                case 0: goto L6a;
                case 1: goto L34;
                default: goto Ld;
            }
        Ld:
            ja.d0 r0 = r5.f15044a
            android.database.Cursor r0 = d7.b.m0(r0, r4, r3)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            int r2 = r0.getCount()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
        L1c:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.String r2 = r0.getString(r3)     // Catch: java.lang.Throwable -> L2a
            r1.add(r2)     // Catch: java.lang.Throwable -> L2a
            goto L1c
        L2a:
            r1 = move-exception
            goto L30
        L2c:
            r0.close()
            return r1
        L30:
            r0.close()
            throw r1
        L34:
            ja.d0 r0 = r5.f15044a
            android.database.Cursor r0 = d7.b.m0(r0, r4, r3)
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L52
            boolean r5 = r0.isNull(r3)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L47
            goto L52
        L47:
            int r2 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L50
            goto L52
        L50:
            r1 = move-exception
            goto L66
        L52:
            if (r2 == 0) goto L58
            r0.close()
            return r2
        L58:
            androidx.room.EmptyResultSetException r2 = new androidx.room.EmptyResultSetException     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = r4.c()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L50
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L50
            throw r2     // Catch: java.lang.Throwable -> L50
        L66:
            r0.close()
            throw r1
        L6a:
            ja.d0 r0 = r5.f15044a
            android.database.Cursor r0 = d7.b.m0(r0, r4, r3)
            boolean r5 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L97
            boolean r5 = r0.isNull(r3)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L7e
            r5 = r2
            goto L86
        L7e:
            int r5 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L95
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L95
        L86:
            if (r5 != 0) goto L89
            goto L97
        L89:
            int r2 = r5.intValue()     // Catch: java.lang.Throwable -> L95
            if (r2 == 0) goto L90
            r3 = 1
        L90:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r1 = move-exception
            goto Lab
        L97:
            if (r2 == 0) goto L9d
            r0.close()
            return r2
        L9d:
            androidx.room.EmptyResultSetException r2 = new androidx.room.EmptyResultSetException     // Catch: java.lang.Throwable -> L95
            java.lang.String r3 = r4.c()     // Catch: java.lang.Throwable -> L95
            java.lang.String r1 = r1.concat(r3)     // Catch: java.lang.Throwable -> L95
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L95
            throw r2     // Catch: java.lang.Throwable -> L95
        Lab:
            r0.close()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ae0.d.call():java.lang.Object");
    }

    public final void finalize() {
        int i13 = this.f15041a;
        f0 f0Var = this.f15042b;
        switch (i13) {
            case 0:
                f0Var.e();
                break;
            case 1:
                f0Var.e();
                break;
            default:
                f0Var.e();
                break;
        }
    }
}
