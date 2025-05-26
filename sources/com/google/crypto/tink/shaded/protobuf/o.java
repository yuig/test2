package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.util.List;

/* loaded from: classes3.dex */
public final class o implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final n f33667a;

    /* renamed from: b, reason: collision with root package name */
    public int f33668b;

    /* renamed from: c, reason: collision with root package name */
    public int f33669c;

    /* renamed from: d, reason: collision with root package name */
    public int f33670d = 0;

    public o(n nVar) {
        l0.a(nVar, "input");
        this.f33667a = nVar;
        nVar.f33662d = this;
    }

    public static o a(n nVar) {
        o oVar = nVar.f33662d;
        return oVar != null ? oVar : new o(nVar);
    }

    public static void x(int i13) {
        if ((i13 & 3) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public static void y(int i13) {
        if ((i13 & 7) != 0) {
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int b() {
        int i13 = this.f33670d;
        if (i13 != 0) {
            this.f33668b = i13;
            this.f33670d = 0;
        } else {
            this.f33668b = this.f33667a.x();
        }
        int i14 = this.f33668b;
        if (i14 == 0 || i14 == this.f33669c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    public final void c(Object obj, q1 q1Var, u uVar) {
        int i13 = this.f33669c;
        this.f33669c = ((this.f33668b >>> 3) << 3) | 4;
        try {
            q1Var.h(obj, this, uVar);
            if (this.f33668b == this.f33669c) {
            } else {
                throw InvalidProtocolBufferException.f();
            }
        } finally {
            this.f33669c = i13;
        }
    }

    public final void d(Object obj, q1 q1Var, u uVar) {
        n nVar = this.f33667a;
        int y13 = nVar.y();
        if (nVar.f33659a >= nVar.f33660b) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int h10 = nVar.h(y13);
        nVar.f33659a++;
        q1Var.h(obj, this, uVar);
        nVar.a(0);
        nVar.f33659a--;
        nVar.g(h10);
    }

    public final void e(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof e;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Boolean.valueOf(nVar.i()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Boolean.valueOf(nVar.i()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        e eVar = (e) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                eVar.d(nVar.i());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            eVar.d(nVar.i());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final k f() {
        w(2);
        return this.f33667a.j();
    }

    public final void g(List list) {
        int x13;
        if ((this.f33668b & 7) != 2) {
            throw InvalidProtocolBufferException.c();
        }
        do {
            list.add(f());
            n nVar = this.f33667a;
            if (nVar.e()) {
                return;
            } else {
                x13 = nVar.x();
            }
        } while (x13 == this.f33668b);
        this.f33670d = x13;
    }

    public final void h(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 1) {
                do {
                    list.add(Double.valueOf(nVar.k()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y13 = nVar.y();
            y(y13);
            int d2 = nVar.d() + y13;
            do {
                list.add(Double.valueOf(nVar.k()));
            } while (nVar.d() < d2);
            return;
        }
        s sVar = (s) list;
        int i15 = this.f33668b & 7;
        if (i15 == 1) {
            do {
                sVar.d(nVar.k());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y14 = nVar.y();
        y(y14);
        int d13 = nVar.d() + y14;
        do {
            sVar.d(nVar.k());
        } while (nVar.d() < d13);
    }

    public final void i(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(nVar.l()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Integer.valueOf(nVar.l()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                g0Var.d(nVar.l());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            g0Var.d(nVar.l());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void j(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 2) {
                int y13 = nVar.y();
                x(y13);
                int d2 = nVar.d() + y13;
                do {
                    list.add(Integer.valueOf(nVar.m()));
                } while (nVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Integer.valueOf(nVar.m()));
                if (nVar.e()) {
                    return;
                } else {
                    x13 = nVar.x();
                }
            } while (x13 == this.f33668b);
            this.f33670d = x13;
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 2) {
            int y14 = nVar.y();
            x(y14);
            int d13 = nVar.d() + y14;
            do {
                g0Var.d(nVar.m());
            } while (nVar.d() < d13);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            g0Var.d(nVar.m());
            if (nVar.e()) {
                return;
            } else {
                x14 = nVar.x();
            }
        } while (x14 == this.f33668b);
        this.f33670d = x14;
    }

    public final void k(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(nVar.n()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y13 = nVar.y();
            y(y13);
            int d2 = nVar.d() + y13;
            do {
                list.add(Long.valueOf(nVar.n()));
            } while (nVar.d() < d2);
            return;
        }
        s0 s0Var = (s0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 1) {
            do {
                s0Var.d(nVar.n());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y14 = nVar.y();
        y(y14);
        int d13 = nVar.d() + y14;
        do {
            s0Var.d(nVar.n());
        } while (nVar.d() < d13);
    }

    public final void l(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof a0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 2) {
                int y13 = nVar.y();
                x(y13);
                int d2 = nVar.d() + y13;
                do {
                    list.add(Float.valueOf(nVar.o()));
                } while (nVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Float.valueOf(nVar.o()));
                if (nVar.e()) {
                    return;
                } else {
                    x13 = nVar.x();
                }
            } while (x13 == this.f33668b);
            this.f33670d = x13;
            return;
        }
        a0 a0Var = (a0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 2) {
            int y14 = nVar.y();
            x(y14);
            int d13 = nVar.d() + y14;
            do {
                a0Var.d(nVar.o());
            } while (nVar.d() < d13);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            a0Var.d(nVar.o());
            if (nVar.e()) {
                return;
            } else {
                x14 = nVar.x();
            }
        } while (x14 == this.f33668b);
        this.f33670d = x14;
    }

    public final void m(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(nVar.p()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Integer.valueOf(nVar.p()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                g0Var.d(nVar.p());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            g0Var.d(nVar.p());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void n(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(nVar.q()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Long.valueOf(nVar.q()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        s0 s0Var = (s0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                s0Var.d(nVar.q());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            s0Var.d(nVar.q());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void o(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 2) {
                int y13 = nVar.y();
                x(y13);
                int d2 = nVar.d() + y13;
                do {
                    list.add(Integer.valueOf(nVar.r()));
                } while (nVar.d() < d2);
                return;
            }
            if (i13 != 5) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            do {
                list.add(Integer.valueOf(nVar.r()));
                if (nVar.e()) {
                    return;
                } else {
                    x13 = nVar.x();
                }
            } while (x13 == this.f33668b);
            this.f33670d = x13;
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 2) {
            int y14 = nVar.y();
            x(y14);
            int d13 = nVar.d() + y14;
            do {
                g0Var.d(nVar.r());
            } while (nVar.d() < d13);
            return;
        }
        if (i15 != 5) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        do {
            g0Var.d(nVar.r());
            if (nVar.e()) {
                return;
            } else {
                x14 = nVar.x();
            }
        } while (x14 == this.f33668b);
        this.f33670d = x14;
    }

    public final void p(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 1) {
                do {
                    list.add(Long.valueOf(nVar.s()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int y13 = nVar.y();
            y(y13);
            int d2 = nVar.d() + y13;
            do {
                list.add(Long.valueOf(nVar.s()));
            } while (nVar.d() < d2);
            return;
        }
        s0 s0Var = (s0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 1) {
            do {
                s0Var.d(nVar.s());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int y14 = nVar.y();
        y(y14);
        int d13 = nVar.d() + y14;
        do {
            s0Var.d(nVar.s());
        } while (nVar.d() < d13);
    }

    public final void q(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(nVar.t()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Integer.valueOf(nVar.t()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                g0Var.d(nVar.t());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            g0Var.d(nVar.t());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void r(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(nVar.u()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Long.valueOf(nVar.u()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        s0 s0Var = (s0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                s0Var.d(nVar.u());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            s0Var.d(nVar.u());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void s(List list, boolean z13) {
        String v13;
        int x13;
        int x14;
        if ((this.f33668b & 7) != 2) {
            int i13 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        boolean z14 = list instanceof o0;
        n nVar = this.f33667a;
        if (z14 && !z13) {
            o0 o0Var = (o0) list;
            do {
                o0Var.S1(f());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        do {
            if (z13) {
                w(2);
                v13 = nVar.w();
            } else {
                w(2);
                v13 = nVar.v();
            }
            list.add(v13);
            if (nVar.e()) {
                return;
            } else {
                x13 = nVar.x();
            }
        } while (x13 == this.f33668b);
        this.f33670d = x13;
    }

    public final void t(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof g0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Integer.valueOf(nVar.y()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Integer.valueOf(nVar.y()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        g0 g0Var = (g0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                g0Var.d(nVar.y());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            g0Var.d(nVar.y());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void u(List list) {
        int x13;
        int x14;
        boolean z13 = list instanceof s0;
        n nVar = this.f33667a;
        if (!z13) {
            int i13 = this.f33668b & 7;
            if (i13 == 0) {
                do {
                    list.add(Long.valueOf(nVar.z()));
                    if (nVar.e()) {
                        return;
                    } else {
                        x13 = nVar.x();
                    }
                } while (x13 == this.f33668b);
                this.f33670d = x13;
                return;
            }
            if (i13 != 2) {
                int i14 = InvalidProtocolBufferException.f33590b;
                throw new InvalidProtocolBufferException.InvalidWireTypeException();
            }
            int d2 = nVar.d() + nVar.y();
            do {
                list.add(Long.valueOf(nVar.z()));
            } while (nVar.d() < d2);
            v(d2);
            return;
        }
        s0 s0Var = (s0) list;
        int i15 = this.f33668b & 7;
        if (i15 == 0) {
            do {
                s0Var.d(nVar.z());
                if (nVar.e()) {
                    return;
                } else {
                    x14 = nVar.x();
                }
            } while (x14 == this.f33668b);
            this.f33670d = x14;
            return;
        }
        if (i15 != 2) {
            int i16 = InvalidProtocolBufferException.f33590b;
            throw new InvalidProtocolBufferException.InvalidWireTypeException();
        }
        int d13 = nVar.d() + nVar.y();
        do {
            s0Var.d(nVar.z());
        } while (nVar.d() < d13);
        v(d13);
    }

    public final void v(int i13) {
        if (this.f33667a.d() != i13) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public final void w(int i13) {
        if ((this.f33668b & 7) == i13) {
            return;
        }
        int i14 = InvalidProtocolBufferException.f33590b;
        throw new InvalidProtocolBufferException.InvalidWireTypeException();
    }
}
