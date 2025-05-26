package jh;

import android.accounts.Account;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class h extends f implements com.google.android.gms.common.api.c {

    /* renamed from: b, reason: collision with root package name */
    public final g f76154b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f76155c;

    /* renamed from: d, reason: collision with root package name */
    public final Account f76156d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public h(android.content.Context r10, android.os.Looper r11, int r12, jh.g r13, com.google.android.gms.common.api.internal.e r14, com.google.android.gms.common.api.internal.n r15) {
        /*
            r9 = this;
            jh.k0 r3 = jh.i.a(r10)
            ih.c r4 = ih.c.f72257d
            com.bumptech.glide.d.t(r14)
            com.bumptech.glide.d.t(r15)
            rd.j r6 = new rd.j
            r0 = 8
            r6.<init>(r14, r0)
            rd.j r7 = new rd.j
            r14 = 9
            r7.<init>(r15, r14)
            java.lang.String r8 = r13.f76149f
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f76154b = r13
            android.accounts.Account r10 = r13.f76144a
            r9.f76156d = r10
            java.util.Set r10 = r13.f76146c
            java.util.Iterator r11 = r10.iterator()
        L2f:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L4a
            java.lang.Object r12 = r11.next()
            com.google.android.gms.common.api.Scope r12 = (com.google.android.gms.common.api.Scope) r12
            boolean r12 = r10.contains(r12)
            if (r12 == 0) goto L42
            goto L2f
        L42:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Expanding scopes is not permitted, use implied scopes instead"
            r10.<init>(r11)
            throw r10
        L4a:
            r9.f76155c = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.h.<init>(android.content.Context, android.os.Looper, int, jh.g, com.google.android.gms.common.api.internal.e, com.google.android.gms.common.api.internal.n):void");
    }

    @Override // com.google.android.gms.common.api.c
    public final Set b() {
        return requiresSignIn() ? this.f76155c : Collections.emptySet();
    }

    @Override // jh.f
    public final Account getAccount() {
        return this.f76156d;
    }

    @Override // jh.f
    public final Executor getBindServiceExecutor() {
        return null;
    }

    @Override // jh.f
    public final Set getScopes() {
        return this.f76155c;
    }
}
