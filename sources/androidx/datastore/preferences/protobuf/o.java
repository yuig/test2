package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class o implements m1 {

    /* renamed from: a, reason: collision with root package name */
    public final m f18109a;

    /* renamed from: b, reason: collision with root package name */
    public int f18110b;

    /* renamed from: c, reason: collision with root package name */
    public int f18111c;

    /* renamed from: d, reason: collision with root package name */
    public int f18112d = 0;

    public o(m mVar) {
        Charset charset = j0.f18080a;
        this.f18109a = mVar;
        mVar.f18106d = this;
    }

    public static void U(int i13) {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void V(int i13) {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void A(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.m();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.m();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Integer.valueOf(mVar.m()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Integer.valueOf(mVar.m()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void B(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 2) {
                U(mVar.v());
                mVar.j();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.j();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 2) {
            int v13 = mVar.v();
            U(v13);
            int b13 = mVar.b() + v13;
            do {
                list.add(Integer.valueOf(mVar.j()));
            } while (mVar.b() < b13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(mVar.j()));
            if (mVar.c()) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == this.f18110b);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final long C() {
        S(0);
        return this.f18109a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final String D() {
        S(2);
        return this.f18109a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int E() {
        int i13 = this.f18112d;
        if (i13 != 0) {
            this.f18110b = i13;
            this.f18112d = 0;
        } else {
            this.f18110b = this.f18109a.u();
        }
        int i14 = this.f18110b;
        if (i14 == 0 || i14 == this.f18111c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void F(List list) {
        Q(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void G(List list) {
        int u13;
        boolean z13 = list instanceof b0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 2) {
                U(mVar.v());
                mVar.l();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.l();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 2) {
            int v13 = mVar.v();
            U(v13);
            int b13 = mVar.b() + v13;
            do {
                list.add(Float.valueOf(mVar.l()));
            } while (mVar.b() < b13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Float.valueOf(mVar.l()));
            if (mVar.c()) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == this.f18110b);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void H(List list, n1 n1Var, t tVar) {
        int u13;
        int i13 = this.f18110b;
        if ((i13 & 7) != 3) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(O(n1Var, tVar));
            m mVar = this.f18109a;
            if (mVar.c() || this.f18112d != 0) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == i13);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int I() {
        S(5);
        return this.f18109a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void J(List list) {
        int u13;
        if ((this.f18110b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(q());
            m mVar = this.f18109a;
            if (mVar.c()) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == this.f18110b);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void K(List list) {
        int u13;
        boolean z13 = list instanceof r;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 1) {
                mVar.h();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            V(mVar.v());
            mVar.h();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 1) {
            do {
                list.add(Double.valueOf(mVar.h()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int v13 = mVar.v();
        V(v13);
        int b13 = mVar.b() + v13;
        do {
            list.add(Double.valueOf(mVar.h()));
        } while (mVar.b() < b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final long L() {
        S(0);
        return this.f18109a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final String M() {
        S(2);
        return this.f18109a.t();
    }

    public final Object N(q2 q2Var, Class cls, t tVar) {
        switch (n.f18108a[q2Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(f());
            case 2:
                return q();
            case 3:
                return Double.valueOf(readDouble());
            case 4:
                return Integer.valueOf(m());
            case 5:
                return Integer.valueOf(y());
            case 6:
                return Long.valueOf(c());
            case 7:
                return Float.valueOf(readFloat());
            case 8:
                return Integer.valueOf(r());
            case 9:
                return Long.valueOf(L());
            case 10:
                S(2);
                return P(j1.f18082c.a(cls), tVar);
            case 11:
                return Integer.valueOf(I());
            case 12:
                return Long.valueOf(g());
            case 13:
                return Integer.valueOf(n());
            case 14:
                return Long.valueOf(C());
            case 15:
                return M();
            case 16:
                return Integer.valueOf(i());
            case 17:
                return Long.valueOf(w());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    public final Object O(n1 n1Var, t tVar) {
        int i13 = this.f18111c;
        this.f18111c = ((this.f18110b >>> 3) << 3) | 4;
        try {
            Object e13 = n1Var.e();
            n1Var.h(e13, this, tVar);
            n1Var.b(e13);
            if (this.f18110b == this.f18111c) {
                return e13;
            }
            throw InvalidProtocolBufferException.g();
        } finally {
            this.f18111c = i13;
        }
    }

    public final Object P(n1 n1Var, t tVar) {
        m mVar = this.f18109a;
        int v13 = mVar.v();
        if (mVar.f18103a >= mVar.f18104b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int e13 = mVar.e(v13);
        Object e14 = n1Var.e();
        mVar.f18103a++;
        n1Var.h(e14, this, tVar);
        n1Var.b(e14);
        mVar.a(0);
        mVar.f18103a--;
        mVar.d(e13);
        return e14;
    }

    public final void Q(List list, boolean z13) {
        int u13;
        int u14;
        if ((this.f18110b & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        boolean z14 = list instanceof n0;
        m mVar = this.f18109a;
        if (!z14 || z13) {
            do {
                list.add(z13 ? M() : D());
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        n0 n0Var = (n0) list;
        do {
            n0Var.b0(q());
            if (mVar.c()) {
                return;
            } else {
                u14 = mVar.u();
            }
        } while (u14 == this.f18110b);
        this.f18112d = u14;
    }

    public final void R(int i13) {
        if (this.f18109a.b() != i13) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final void S(int i13) {
        if ((this.f18110b & 7) != i13) {
            throw InvalidProtocolBufferException.d();
        }
    }

    public final boolean T() {
        int i13;
        m mVar = this.f18109a;
        if (mVar.c() || (i13 = this.f18110b) == this.f18111c) {
            return false;
        }
        return mVar.x(i13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int a() {
        return this.f18110b;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final Object b(n1 n1Var, t tVar) {
        S(2);
        return P(n1Var, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final long c() {
        S(1);
        return this.f18109a.k();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void d(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 2) {
                U(mVar.v());
                mVar.o();
                throw null;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.o();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 2) {
            int v13 = mVar.v();
            U(v13);
            int b13 = mVar.b() + v13;
            do {
                list.add(Integer.valueOf(mVar.o()));
            } while (mVar.b() < b13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(Integer.valueOf(mVar.o()));
            if (mVar.c()) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == this.f18110b);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void e(List list) {
        int u13;
        boolean z13 = list instanceof r0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.r();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.r();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Long.valueOf(mVar.r()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Long.valueOf(mVar.r()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final boolean f() {
        S(0);
        return this.f18109a.f();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final long g() {
        S(1);
        return this.f18109a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void h(List list) {
        int u13;
        boolean z13 = list instanceof r0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.w();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.w();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Long.valueOf(mVar.w()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Long.valueOf(mVar.w()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int i() {
        S(0);
        return this.f18109a.v();
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r9.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r1.d(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    @Override // androidx.datastore.preferences.protobuf.m1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.datastore.preferences.protobuf.w0 r9, com.google.firebase.messaging.q r10, androidx.datastore.preferences.protobuf.t r11) {
        /*
            r8 = this;
            r0 = 2
            r8.S(r0)
            androidx.datastore.preferences.protobuf.m r1 = r8.f18109a
            int r2 = r1.v()
            int r2 = r1.e(r2)
            java.lang.Object r3 = r10.f33804b
            java.lang.Object r4 = r10.f33806d
        L12:
            int r5 = r8.E()     // Catch: java.lang.Throwable -> L36
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L5e
            boolean r6 = r1.c()     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L22
            goto L5e
        L22:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L47
            if (r5 == r0) goto L38
            boolean r5 = r8.T()     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r5 == 0) goto L30
            goto L12
        L30:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r5 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r5     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L36:
            r9 = move-exception
            goto L65
        L38:
            java.lang.Object r5 = r10.f33805c     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            androidx.datastore.preferences.protobuf.q2 r5 = (androidx.datastore.preferences.protobuf.q2) r5     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r6 = r10.f33806d     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r4 = r8.N(r5, r6, r11)     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L12
        L47:
            java.lang.Object r5 = r10.f33803a     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            androidx.datastore.preferences.protobuf.q2 r5 = (androidx.datastore.preferences.protobuf.q2) r5     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r6 = 0
            java.lang.Object r3 = r8.N(r5, r6, r6)     // Catch: java.lang.Throwable -> L36 androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L12
        L51:
            boolean r5 = r8.T()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L58
            goto L12
        L58:
            androidx.datastore.preferences.protobuf.InvalidProtocolBufferException r9 = new androidx.datastore.preferences.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        L5e:
            r9.put(r3, r4)     // Catch: java.lang.Throwable -> L36
            r1.d(r2)
            return
        L65:
            r1.d(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.o.j(androidx.datastore.preferences.protobuf.w0, com.google.firebase.messaging.q, androidx.datastore.preferences.protobuf.t):void");
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void k(List list) {
        int u13;
        boolean z13 = list instanceof r0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.n();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.n();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Long.valueOf(mVar.n()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Long.valueOf(mVar.n()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void l(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.i();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.i();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Integer.valueOf(mVar.i()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Integer.valueOf(mVar.i()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int m() {
        S(0);
        return this.f18109a.i();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int n() {
        S(0);
        return this.f18109a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void o(List list) {
        int u13;
        boolean z13 = list instanceof e;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.f();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.f();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Boolean.valueOf(mVar.f()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Boolean.valueOf(mVar.f()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void p(List list) {
        Q(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final i q() {
        S(2);
        return this.f18109a.g();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int r() {
        S(0);
        return this.f18109a.m();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final double readDouble() {
        S(1);
        return this.f18109a.h();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final float readFloat() {
        S(5);
        return this.f18109a.l();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void s(List list, n1 n1Var, t tVar) {
        int u13;
        int i13 = this.f18110b;
        if ((i13 & 7) != 2) {
            throw InvalidProtocolBufferException.d();
        }
        do {
            list.add(P(n1Var, tVar));
            m mVar = this.f18109a;
            if (mVar.c() || this.f18112d != 0) {
                return;
            } else {
                u13 = mVar.u();
            }
        } while (u13 == i13);
        this.f18112d = u13;
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void t(List list) {
        int u13;
        boolean z13 = list instanceof r0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 1) {
                mVar.k();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            V(mVar.v());
            mVar.k();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 1) {
            do {
                list.add(Long.valueOf(mVar.k()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int v13 = mVar.v();
        V(v13);
        int b13 = mVar.b() + v13;
        do {
            list.add(Long.valueOf(mVar.k()));
        } while (mVar.b() < b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final Object u(n1 n1Var, t tVar) {
        S(3);
        return O(n1Var, tVar);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void v(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.q();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.q();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Integer.valueOf(mVar.q()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Integer.valueOf(mVar.q()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final long w() {
        S(0);
        return this.f18109a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void x(List list) {
        int u13;
        boolean z13 = list instanceof h0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 0) {
                mVar.v();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            mVar.v();
            mVar.v();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 0) {
            do {
                list.add(Integer.valueOf(mVar.v()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int b13 = mVar.b() + mVar.v();
        do {
            list.add(Integer.valueOf(mVar.v()));
        } while (mVar.b() < b13);
        R(b13);
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final int y() {
        S(5);
        return this.f18109a.j();
    }

    @Override // androidx.datastore.preferences.protobuf.m1
    public final void z(List list) {
        int u13;
        boolean z13 = list instanceof r0;
        m mVar = this.f18109a;
        if (z13) {
            int i13 = this.f18110b & 7;
            if (i13 == 1) {
                mVar.p();
                throw null;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.d();
            }
            V(mVar.v());
            mVar.p();
            throw null;
        }
        int i14 = this.f18110b & 7;
        if (i14 == 1) {
            do {
                list.add(Long.valueOf(mVar.p()));
                if (mVar.c()) {
                    return;
                } else {
                    u13 = mVar.u();
                }
            } while (u13 == this.f18110b);
            this.f18112d = u13;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.d();
        }
        int v13 = mVar.v();
        V(v13);
        int b13 = mVar.b() + v13;
        do {
            list.add(Long.valueOf(mVar.p()));
        } while (mVar.b() < b13);
    }
}
