package com.google.protobuf;

import java.util.List;

/* loaded from: classes3.dex */
public final class r implements c2 {

    /* renamed from: a, reason: collision with root package name */
    public final p f33968a;

    /* renamed from: b, reason: collision with root package name */
    public int f33969b;

    /* renamed from: c, reason: collision with root package name */
    public int f33970c;

    /* renamed from: d, reason: collision with root package name */
    public int f33971d = 0;

    public r(p pVar) {
        w0.a(pVar, "input");
        this.f33968a = pVar;
        pVar.f33956d = this;
    }

    public static void X(int i13) {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void Y(int i13) {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static r a(p pVar) {
        r rVar = pVar.f33956d;
        return rVar != null ? rVar : new r(pVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005e, code lost:
    
        r9.put(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        r1.i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0064, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(com.google.protobuf.i1 r9, com.google.firebase.messaging.q r10, com.google.protobuf.y r11) {
        /*
            r8 = this;
            r0 = 2
            r8.V(r0)
            com.google.protobuf.p r1 = r8.f33968a
            int r2 = r1.B()
            int r2 = r1.j(r2)
            java.lang.Object r3 = r10.f33804b
            java.lang.Object r4 = r10.f33806d
        L12:
            int r5 = r8.b()     // Catch: java.lang.Throwable -> L36
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r6) goto L5e
            boolean r6 = r1.e()     // Catch: java.lang.Throwable -> L36
            if (r6 == 0) goto L22
            goto L5e
        L22:
            r6 = 1
            java.lang.String r7 = "Unable to parse map entry."
            if (r5 == r6) goto L47
            if (r5 == r0) goto L38
            boolean r5 = r8.W()     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            if (r5 == 0) goto L30
            goto L12
        L30:
            com.google.protobuf.InvalidProtocolBufferException r5 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            throw r5     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
        L36:
            r9 = move-exception
            goto L65
        L38:
            java.lang.Object r5 = r10.f33805c     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            com.google.protobuf.z2 r5 = (com.google.protobuf.z2) r5     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r6 = r10.f33806d     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Class r6 = r6.getClass()     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            java.lang.Object r4 = r8.o(r5, r6, r11)     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L12
        L47:
            java.lang.Object r5 = r10.f33803a     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            com.google.protobuf.z2 r5 = (com.google.protobuf.z2) r5     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            r6 = 0
            java.lang.Object r3 = r8.o(r5, r6, r6)     // Catch: java.lang.Throwable -> L36 com.google.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L51
            goto L12
        L51:
            boolean r5 = r8.W()     // Catch: java.lang.Throwable -> L36
            if (r5 == 0) goto L58
            goto L12
        L58:
            com.google.protobuf.InvalidProtocolBufferException r9 = new com.google.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L36
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L36
            throw r9     // Catch: java.lang.Throwable -> L36
        L5e:
            r9.put(r3, r4)     // Catch: java.lang.Throwable -> L36
            r1.i(r2)
            return
        L65:
            r1.i(r2)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.r.A(com.google.protobuf.i1, com.google.firebase.messaging.q, com.google.protobuf.y):void");
    }

    public final Object B(Class cls, y yVar) {
        V(2);
        d2 a13 = z1.f34015c.a(cls);
        Object e13 = a13.e();
        g(e13, a13, yVar);
        a13.b(e13);
        return e13;
    }

    public final void C(List list, d2 d2Var, y yVar) {
        int A;
        int i13 = this.f33969b;
        if ((i13 & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object e13 = d2Var.e();
            g(e13, d2Var, yVar);
            d2Var.b(e13);
            list.add(e13);
            p pVar = this.f33968a;
            if (pVar.e() || this.f33971d != 0) {
                return;
            } else {
                A = pVar.A();
            }
        } while (A == i13);
        this.f33971d = A;
    }

    public final int D() {
        V(5);
        return this.f33968a.u();
    }

    public final void E(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 2) {
                int B = pVar.B();
                X(B);
                int d2 = pVar.d() + B;
                do {
                    list.add(Integer.valueOf(pVar.u()));
                } while (pVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(pVar.u()));
                if (pVar.e()) {
                    return;
                } else {
                    A = pVar.A();
                }
            } while (A == this.f33969b);
            this.f33971d = A;
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 2) {
            int B2 = pVar.B();
            X(B2);
            int d13 = pVar.d() + B2;
            do {
                o0Var.d(pVar.u());
            } while (pVar.d() < d13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            o0Var.d(pVar.u());
            if (pVar.e()) {
                return;
            } else {
                A2 = pVar.A();
            }
        } while (A2 == this.f33969b);
        this.f33971d = A2;
    }

    public final long F() {
        V(1);
        return this.f33968a.v();
    }

    public final void G(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof d1;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(pVar.v()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int B = pVar.B();
            Y(B);
            int d2 = pVar.d() + B;
            do {
                list.add(Long.valueOf(pVar.v()));
            } while (pVar.d() < d2);
            return;
        }
        d1 d1Var = (d1) list;
        int i14 = this.f33969b & 7;
        if (i14 == 1) {
            do {
                d1Var.d(pVar.v());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int B2 = pVar.B();
        Y(B2);
        int d13 = pVar.d() + B2;
        do {
            d1Var.d(pVar.v());
        } while (pVar.d() < d13);
    }

    public final int H() {
        V(0);
        return this.f33968a.w();
    }

    public final void I(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.w()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Integer.valueOf(pVar.w()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                o0Var.d(pVar.w());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            o0Var.d(pVar.w());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final long J() {
        V(0);
        return this.f33968a.x();
    }

    public final void K(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof d1;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(pVar.x()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Long.valueOf(pVar.x()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        d1 d1Var = (d1) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                d1Var.d(pVar.x());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            d1Var.d(pVar.x());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final String L() {
        V(2);
        return this.f33968a.y();
    }

    public final void M(List list) {
        N(list, false);
    }

    public final void N(List list, boolean z13) {
        int A;
        int A2;
        if ((this.f33969b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        boolean z14 = list instanceof z0;
        p pVar = this.f33968a;
        if (!z14 || z13) {
            do {
                list.add(z13 ? P() : L());
                if (pVar.e()) {
                    return;
                } else {
                    A = pVar.A();
                }
            } while (A == this.f33969b);
            this.f33971d = A;
            return;
        }
        z0 z0Var = (z0) list;
        do {
            z0Var.K(j());
            if (pVar.e()) {
                return;
            } else {
                A2 = pVar.A();
            }
        } while (A2 == this.f33969b);
        this.f33971d = A2;
    }

    public final void O(List list) {
        N(list, true);
    }

    public final String P() {
        V(2);
        return this.f33968a.z();
    }

    public final int Q() {
        V(0);
        return this.f33968a.B();
    }

    public final void R(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.B()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Integer.valueOf(pVar.B()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                o0Var.d(pVar.B());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            o0Var.d(pVar.B());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final long S() {
        V(0);
        return this.f33968a.C();
    }

    public final void T(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof d1;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(pVar.C()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Long.valueOf(pVar.C()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        d1 d1Var = (d1) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                d1Var.d(pVar.C());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            d1Var.d(pVar.C());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final void U(int i13) {
        if (this.f33968a.d() != i13) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void V(int i13) {
        if ((this.f33969b & 7) != i13) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public final boolean W() {
        int i13;
        p pVar = this.f33968a;
        if (pVar.e() || (i13 = this.f33969b) == this.f33970c) {
            return false;
        }
        return pVar.D(i13);
    }

    public final int b() {
        int i13 = this.f33971d;
        if (i13 != 0) {
            this.f33969b = i13;
            this.f33971d = 0;
        } else {
            this.f33969b = this.f33968a.A();
        }
        int i14 = this.f33969b;
        if (i14 == 0 || i14 == this.f33970c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    public final int c() {
        return this.f33969b;
    }

    public final void d(Object obj, d2 d2Var, y yVar) {
        V(3);
        e(obj, d2Var, yVar);
    }

    public final void e(Object obj, d2 d2Var, y yVar) {
        int i13 = this.f33970c;
        this.f33970c = ((this.f33969b >>> 3) << 3) | 4;
        try {
            d2Var.i(obj, this, yVar);
            if (this.f33969b == this.f33970c) {
            } else {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.f33970c = i13;
        }
    }

    public final void f(Object obj, d2 d2Var, y yVar) {
        V(2);
        g(obj, d2Var, yVar);
    }

    public final void g(Object obj, d2 d2Var, y yVar) {
        p pVar = this.f33968a;
        int B = pVar.B();
        if (pVar.f33953a >= pVar.f33954b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int j13 = pVar.j(B);
        pVar.f33953a++;
        d2Var.i(obj, this, yVar);
        pVar.a(0);
        pVar.f33953a--;
        pVar.i(j13);
    }

    public final boolean h() {
        V(0);
        return this.f33968a.k();
    }

    public final void i(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof e;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Boolean.valueOf(pVar.k()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Boolean.valueOf(pVar.k()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        e eVar = (e) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                eVar.d(pVar.k());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            eVar.d(pVar.k());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final l j() {
        V(2);
        return this.f33968a.l();
    }

    public final void k(List list) {
        int A;
        if ((this.f33969b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(j());
            p pVar = this.f33968a;
            if (pVar.e()) {
                return;
            } else {
                A = pVar.A();
            }
        } while (A == this.f33969b);
        this.f33971d = A;
    }

    public final double l() {
        V(1);
        return this.f33968a.m();
    }

    public final void m(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof v;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 1) {
                do {
                    list.add(Double.valueOf(pVar.m()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int B = pVar.B();
            Y(B);
            int d2 = pVar.d() + B;
            do {
                list.add(Double.valueOf(pVar.m()));
            } while (pVar.d() < d2);
            return;
        }
        v vVar = (v) list;
        int i14 = this.f33969b & 7;
        if (i14 == 1) {
            do {
                vVar.d(pVar.m());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int B2 = pVar.B();
        Y(B2);
        int d13 = pVar.d() + B2;
        do {
            vVar.d(pVar.m());
        } while (pVar.d() < d13);
    }

    public final void n(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.n()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Integer.valueOf(pVar.n()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                o0Var.d(pVar.n());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            o0Var.d(pVar.n());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final Object o(z2 z2Var, Class cls, y yVar) {
        switch (q.f33958a[z2Var.ordinal()]) {
            case 1:
                return Boolean.valueOf(h());
            case 2:
                return j();
            case 3:
                return Double.valueOf(l());
            case 4:
                V(0);
                return Integer.valueOf(this.f33968a.n());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(r());
            case 7:
                return Float.valueOf(t());
            case 8:
                return Integer.valueOf(w());
            case 9:
                return Long.valueOf(y());
            case 10:
                return B(cls, yVar);
            case 11:
                return Integer.valueOf(D());
            case 12:
                return Long.valueOf(F());
            case 13:
                return Integer.valueOf(H());
            case 14:
                return Long.valueOf(J());
            case 15:
                return P();
            case 16:
                return Integer.valueOf(Q());
            case 17:
                return Long.valueOf(S());
            default:
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final int p() {
        V(5);
        return this.f33968a.o();
    }

    public final void q(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 2) {
                int B = pVar.B();
                X(B);
                int d2 = pVar.d() + B;
                do {
                    list.add(Integer.valueOf(pVar.o()));
                } while (pVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Integer.valueOf(pVar.o()));
                if (pVar.e()) {
                    return;
                } else {
                    A = pVar.A();
                }
            } while (A == this.f33969b);
            this.f33971d = A;
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 2) {
            int B2 = pVar.B();
            X(B2);
            int d13 = pVar.d() + B2;
            do {
                o0Var.d(pVar.o());
            } while (pVar.d() < d13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            o0Var.d(pVar.o());
            if (pVar.e()) {
                return;
            } else {
                A2 = pVar.A();
            }
        } while (A2 == this.f33969b);
        this.f33971d = A2;
    }

    public final long r() {
        V(1);
        return this.f33968a.p();
    }

    public final void s(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof d1;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(pVar.p()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int B = pVar.B();
            Y(B);
            int d2 = pVar.d() + B;
            do {
                list.add(Long.valueOf(pVar.p()));
            } while (pVar.d() < d2);
            return;
        }
        d1 d1Var = (d1) list;
        int i14 = this.f33969b & 7;
        if (i14 == 1) {
            do {
                d1Var.d(pVar.p());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int B2 = pVar.B();
        Y(B2);
        int d13 = pVar.d() + B2;
        do {
            d1Var.d(pVar.p());
        } while (pVar.d() < d13);
    }

    public final float t() {
        V(5);
        return this.f33968a.q();
    }

    public final void u(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof g0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 2) {
                int B = pVar.B();
                X(B);
                int d2 = pVar.d() + B;
                do {
                    list.add(Float.valueOf(pVar.q()));
                } while (pVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            do {
                list.add(Float.valueOf(pVar.q()));
                if (pVar.e()) {
                    return;
                } else {
                    A = pVar.A();
                }
            } while (A == this.f33969b);
            this.f33971d = A;
            return;
        }
        g0 g0Var = (g0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 2) {
            int B2 = pVar.B();
            X(B2);
            int d13 = pVar.d() + B2;
            do {
                g0Var.d(pVar.q());
            } while (pVar.d() < d13);
            return;
        }
        if (i14 != 5) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            g0Var.d(pVar.q());
            if (pVar.e()) {
                return;
            } else {
                A2 = pVar.A();
            }
        } while (A2 == this.f33969b);
        this.f33971d = A2;
    }

    public final void v(List list, d2 d2Var, y yVar) {
        int A;
        int i13 = this.f33969b;
        if ((i13 & 7) != 3) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            Object e13 = d2Var.e();
            e(e13, d2Var, yVar);
            d2Var.b(e13);
            list.add(e13);
            p pVar = this.f33968a;
            if (pVar.e() || this.f33971d != 0) {
                return;
            } else {
                A = pVar.A();
            }
        } while (A == i13);
        this.f33971d = A;
    }

    public final int w() {
        V(0);
        return this.f33968a.r();
    }

    public final void x(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof o0;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(pVar.r()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Integer.valueOf(pVar.r()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        o0 o0Var = (o0) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                o0Var.d(pVar.r());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            o0Var.d(pVar.r());
        } while (pVar.d() < d13);
        U(d13);
    }

    public final long y() {
        V(0);
        return this.f33968a.s();
    }

    public final void z(List list) {
        int A;
        int A2;
        boolean z13 = list instanceof d1;
        p pVar = this.f33968a;
        if (!z13) {
            int i13 = this.f33969b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(pVar.s()));
                    if (pVar.e()) {
                        return;
                    } else {
                        A = pVar.A();
                    }
                } while (A == this.f33969b);
                this.f33971d = A;
                return;
            }
            if (i13 != 2) {
                throw InvalidProtocolBufferException.c();
            }
            int d2 = pVar.d() + pVar.B();
            do {
                list.add(Long.valueOf(pVar.s()));
            } while (pVar.d() < d2);
            U(d2);
            return;
        }
        d1 d1Var = (d1) list;
        int i14 = this.f33969b & 7;
        if (i14 == 0) {
            do {
                d1Var.d(pVar.s());
                if (pVar.e()) {
                    return;
                } else {
                    A2 = pVar.A();
                }
            } while (A2 == this.f33969b);
            this.f33971d = A2;
            return;
        }
        if (i14 != 2) {
            throw InvalidProtocolBufferException.c();
        }
        int d13 = pVar.d() + pVar.B();
        do {
            d1Var.d(pVar.s());
        } while (pVar.d() < d13);
        U(d13);
    }
}
