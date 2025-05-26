package vm2;

import zm2.u;

/* loaded from: classes2.dex */
public final class c extends d {

    /* renamed from: c, reason: collision with root package name */
    public final u[] f126215c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c(int r5, zm2.u[] r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L33
            int r0 = r6.length
            r1 = 1
            int r0 = r0 - r1
            if (r0 != 0) goto L8
            goto L12
        L8:
            r2 = 31
        La:
            if (r2 < 0) goto L1b
            int r3 = r1 << r2
            r3 = r3 & r0
            if (r3 == 0) goto L18
            int r1 = r1 + r2
        L12:
            r4.<init>(r5, r1)
            r4.f126215c = r6
            return
        L18:
            int r2 = r2 + (-1)
            goto La
        L1b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty enum: "
            r0.<init>(r1)
            java.lang.Class r6 = r6.getClass()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L33:
            c()
            r5 = 0
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vm2.c.<init>(int, zm2.u[]):void");
    }

    public static /* synthetic */ void c() {
        throw new IllegalArgumentException("Argument for @NotNull parameter 'enumEntries' of kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField.bitWidth must not be null");
    }

    public final Object d(int i13) {
        int i14 = (1 << this.f126217b) - 1;
        int i15 = this.f126216a;
        int i16 = (i13 & (i14 << i15)) >> i15;
        for (u uVar : this.f126215c) {
            if (uVar.getNumber() == i16) {
                return uVar;
            }
        }
        return null;
    }
}
