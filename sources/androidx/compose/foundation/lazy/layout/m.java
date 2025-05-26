package androidx.compose.foundation.lazy.layout;

import kh2.k3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class m implements r3.g, q3.h {

    /* renamed from: g, reason: collision with root package name */
    public static final j f17264g = new j();

    /* renamed from: b, reason: collision with root package name */
    public final n f17265b;

    /* renamed from: c, reason: collision with root package name */
    public final i f17266c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f17267d;

    /* renamed from: e, reason: collision with root package name */
    public final n4.k f17268e;

    /* renamed from: f, reason: collision with root package name */
    public final m1.f1 f17269f;

    public m(n nVar, i iVar, boolean z13, n4.k kVar, m1.f1 f1Var) {
        this.f17265b = nVar;
        this.f17266c = iVar;
        this.f17267d = z13;
        this.f17268e = kVar;
        this.f17269f = f1Var;
    }

    @Override // r3.g
    public final r3.i getKey() {
        return q3.j.f102222a;
    }

    @Override // r3.g
    public final Object getValue() {
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0029, code lost:
    
        if (r3 == m1.f1.Vertical) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0015, code lost:
    
        if (r3 == m1.f1.Horizontal) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean l(androidx.compose.foundation.lazy.layout.h r5, int r6) {
        /*
            r4 = this;
            r0 = 5
            boolean r0 = kh2.k3.R(r6, r0)
            r1 = 0
            r2 = 1
            m1.f1 r3 = r4.f17269f
            if (r0 == 0) goto Lc
            goto L13
        Lc:
            r0 = 6
            boolean r0 = kh2.k3.R(r6, r0)
            if (r0 == 0) goto L18
        L13:
            m1.f1 r0 = m1.f1.Horizontal
            if (r3 != r0) goto L3a
            goto L2b
        L18:
            r0 = 3
            boolean r0 = kh2.k3.R(r6, r0)
            if (r0 == 0) goto L20
            goto L27
        L20:
            r0 = 4
            boolean r0 = kh2.k3.R(r6, r0)
            if (r0 == 0) goto L2c
        L27:
            m1.f1 r0 = m1.f1.Vertical
            if (r3 != r0) goto L3a
        L2b:
            return r1
        L2c:
            boolean r0 = kh2.k3.R(r6, r2)
            if (r0 == 0) goto L33
            goto L3a
        L33:
            r0 = 2
            boolean r0 = kh2.k3.R(r6, r0)
            if (r0 == 0) goto L53
        L3a:
            boolean r6 = r4.m(r6)
            if (r6 == 0) goto L4d
            int r5 = r5.f17245b
            androidx.compose.foundation.lazy.layout.n r6 = r4.f17265b
            int r6 = r6.a()
            int r6 = r6 - r2
            if (r5 >= r6) goto L52
        L4b:
            r1 = r2
            goto L52
        L4d:
            int r5 = r5.f17244a
            if (r5 <= 0) goto L52
            goto L4b
        L52:
            return r1
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Lazy list does not support beyond bounds layout for the specified direction"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.m.l(androidx.compose.foundation.lazy.layout.h, int):boolean");
    }

    public final boolean m(int i13) {
        if (!k3.R(i13, 1)) {
            if (k3.R(i13, 2)) {
                return true;
            }
            boolean R = k3.R(i13, 5);
            boolean z13 = this.f17267d;
            if (!R) {
                if (!k3.R(i13, 6)) {
                    boolean R2 = k3.R(i13, 3);
                    n4.k kVar = this.f17268e;
                    if (R2) {
                        int i14 = k.f17256a[kVar.ordinal()];
                        if (i14 != 1) {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!z13) {
                                return true;
                            }
                        }
                    } else {
                        if (!k3.R(i13, 4)) {
                            throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
                        }
                        int i15 = k.f17256a[kVar.ordinal()];
                        if (i15 != 1) {
                            if (i15 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else if (!z13) {
                            return true;
                        }
                    }
                } else if (!z13) {
                    return true;
                }
            }
            return z13;
        }
        return false;
    }
}
