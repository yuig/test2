package ads_mobile_sdk;

import a.h4;
import a.ud;

/* loaded from: classes2.dex */
public final class jo implements a.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final io f6898a;

    /* renamed from: b, reason: collision with root package name */
    public int f6899b;

    /* renamed from: c, reason: collision with root package name */
    public int f6900c;

    /* renamed from: d, reason: collision with root package name */
    public int f6901d = 0;

    public jo(io ioVar) {
        io ioVar2 = (io) hw0.a(ioVar, "input");
        this.f6898a = ioVar2;
        ioVar2.f6509c = this;
    }

    public final int a() {
        int i13 = this.f6901d;
        if (i13 != 0) {
            this.f6899b = i13;
            this.f6901d = 0;
        } else {
            this.f6899b = this.f6898a.r();
        }
        int i14 = this.f6899b;
        if (i14 == 0 || i14 == this.f6900c) {
            return Integer.MAX_VALUE;
        }
        return i14 >>> 3;
    }

    public final void b(Object obj, a.tb tbVar, jc0 jc0Var) {
        int s13 = this.f6898a.s();
        io ioVar = this.f6898a;
        if (ioVar.f6507a + ioVar.f6508b >= 100) {
            throw new e21("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int d2 = ioVar.d(s13);
        this.f6898a.f6507a++;
        tbVar.a(obj, this, jc0Var);
        this.f6898a.a(0);
        r5.f6507a--;
        this.f6898a.c(d2);
    }

    public final void c(h4 h4Var) {
        int r13;
        if (h4Var instanceof a.tc) {
            int i13 = this.f6899b & 7;
            if (i13 == 1) {
                this.f6898a.e();
                throw null;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            d(this.f6898a.s());
            this.f6898a.a();
            this.f6898a.e();
            throw null;
        }
        int i15 = this.f6899b & 7;
        if (i15 == 1) {
            do {
                h4Var.add(Double.valueOf(this.f6898a.e()));
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int s13 = this.f6898a.s();
        d(s13);
        int a13 = this.f6898a.a() + s13;
        do {
            h4Var.add(Double.valueOf(this.f6898a.e()));
        } while (this.f6898a.a() < a13);
    }

    public final void d(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.f()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Integer.valueOf(this.f6898a.f()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                zv0Var.b(this.f6898a.f());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            zv0Var.b(this.f6898a.f());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void e(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 2) {
                int s13 = this.f6898a.s();
                c(s13);
                int a13 = this.f6898a.a() + s13;
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.g()));
                } while (this.f6898a.a() < a13);
                return;
            }
            if (i13 != 5) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            do {
                h4Var.add(Integer.valueOf(this.f6898a.g()));
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 2) {
            int s14 = this.f6898a.s();
            c(s14);
            int a14 = this.f6898a.a() + s14;
            do {
                zv0Var.b(this.f6898a.g());
            } while (this.f6898a.a() < a14);
            return;
        }
        if (i15 != 5) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        do {
            zv0Var.b(this.f6898a.g());
            if (this.f6898a.b()) {
                return;
            } else {
                r14 = this.f6898a.r();
            }
        } while (r14 == this.f6899b);
        this.f6901d = r14;
    }

    public final void f(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof d81)) {
            int i13 = this.f6899b & 7;
            if (i13 == 1) {
                do {
                    h4Var.add(Long.valueOf(this.f6898a.h()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int s13 = this.f6898a.s();
            d(s13);
            int a13 = this.f6898a.a() + s13;
            do {
                h4Var.add(Long.valueOf(this.f6898a.h()));
            } while (this.f6898a.a() < a13);
            return;
        }
        d81 d81Var = (d81) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 1) {
            do {
                d81Var.a(this.f6898a.h());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int s14 = this.f6898a.s();
        d(s14);
        int a14 = this.f6898a.a() + s14;
        do {
            d81Var.a(this.f6898a.h());
        } while (this.f6898a.a() < a14);
    }

    public final void g(h4 h4Var) {
        int r13;
        if (h4Var instanceof ud) {
            int i13 = this.f6899b & 7;
            if (i13 == 2) {
                c(this.f6898a.s());
                this.f6898a.a();
                this.f6898a.i();
                throw null;
            }
            if (i13 == 5) {
                this.f6898a.i();
                throw null;
            }
            int i14 = e21.f4580b;
            throw new d21();
        }
        int i15 = this.f6899b & 7;
        if (i15 == 2) {
            int s13 = this.f6898a.s();
            c(s13);
            int a13 = this.f6898a.a() + s13;
            do {
                h4Var.add(Float.valueOf(this.f6898a.i()));
            } while (this.f6898a.a() < a13);
            return;
        }
        if (i15 != 5) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        do {
            h4Var.add(Float.valueOf(this.f6898a.i()));
            if (this.f6898a.b()) {
                return;
            } else {
                r13 = this.f6898a.r();
            }
        } while (r13 == this.f6899b);
        this.f6901d = r13;
    }

    public final void h(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.j()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Integer.valueOf(this.f6898a.j()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                zv0Var.b(this.f6898a.j());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            zv0Var.b(this.f6898a.j());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void i(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof d81)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Long.valueOf(this.f6898a.k()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Long.valueOf(this.f6898a.k()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        d81 d81Var = (d81) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                d81Var.a(this.f6898a.k());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            d81Var.a(this.f6898a.k());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void j(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 2) {
                int s13 = this.f6898a.s();
                c(s13);
                int a13 = this.f6898a.a() + s13;
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.l()));
                } while (this.f6898a.a() < a13);
                return;
            }
            if (i13 != 5) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            do {
                h4Var.add(Integer.valueOf(this.f6898a.l()));
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 2) {
            int s14 = this.f6898a.s();
            c(s14);
            int a14 = this.f6898a.a() + s14;
            do {
                zv0Var.b(this.f6898a.l());
            } while (this.f6898a.a() < a14);
            return;
        }
        if (i15 != 5) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        do {
            zv0Var.b(this.f6898a.l());
            if (this.f6898a.b()) {
                return;
            } else {
                r14 = this.f6898a.r();
            }
        } while (r14 == this.f6899b);
        this.f6901d = r14;
    }

    public final void k(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof d81)) {
            int i13 = this.f6899b & 7;
            if (i13 == 1) {
                do {
                    h4Var.add(Long.valueOf(this.f6898a.m()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int s13 = this.f6898a.s();
            d(s13);
            int a13 = this.f6898a.a() + s13;
            do {
                h4Var.add(Long.valueOf(this.f6898a.m()));
            } while (this.f6898a.a() < a13);
            return;
        }
        d81 d81Var = (d81) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 1) {
            do {
                d81Var.a(this.f6898a.m());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int s14 = this.f6898a.s();
        d(s14);
        int a14 = this.f6898a.a() + s14;
        do {
            d81Var.a(this.f6898a.m());
        } while (this.f6898a.a() < a14);
    }

    public final void l(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.n()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Integer.valueOf(this.f6898a.n()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                zv0Var.b(this.f6898a.n());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            zv0Var.b(this.f6898a.n());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void m(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof d81)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Long.valueOf(this.f6898a.o()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Long.valueOf(this.f6898a.o()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        d81 d81Var = (d81) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                d81Var.a(this.f6898a.o());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            d81Var.a(this.f6898a.o());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void n(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof zv0)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Integer.valueOf(this.f6898a.s()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Integer.valueOf(this.f6898a.s()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        zv0 zv0Var = (zv0) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                zv0Var.b(this.f6898a.s());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            zv0Var.b(this.f6898a.s());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void o(h4 h4Var) {
        int r13;
        int r14;
        if (!(h4Var instanceof d81)) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                do {
                    h4Var.add(Long.valueOf(this.f6898a.t()));
                    if (this.f6898a.b()) {
                        return;
                    } else {
                        r13 = this.f6898a.r();
                    }
                } while (r13 == this.f6899b);
                this.f6901d = r13;
                return;
            }
            if (i13 != 2) {
                int i14 = e21.f4580b;
                throw new d21();
            }
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Long.valueOf(this.f6898a.t()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        d81 d81Var = (d81) h4Var;
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                d81Var.a(this.f6898a.t());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r14 = this.f6898a.r();
                }
            } while (r14 == this.f6899b);
            this.f6901d = r14;
            return;
        }
        if (i15 != 2) {
            int i16 = e21.f4580b;
            throw new d21();
        }
        int a14 = this.f6898a.a() + this.f6898a.s();
        do {
            d81Var.a(this.f6898a.t());
        } while (this.f6898a.a() < a14);
        a(a14);
    }

    public final void a(Object obj, a.tb tbVar, jc0 jc0Var) {
        int i13 = this.f6900c;
        this.f6900c = ((this.f6899b >>> 3) << 3) | 4;
        try {
            tbVar.a(obj, this, jc0Var);
            if (this.f6899b == this.f6900c) {
            } else {
                throw new e21("Failed to parse the message.");
            }
        } finally {
            this.f6900c = i13;
        }
    }

    public final void b(h4 h4Var) {
        int r13;
        if ((this.f6899b & 7) == 2) {
            do {
                b(2);
                h4Var.add(this.f6898a.d());
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        int i13 = e21.f4580b;
        throw new d21();
    }

    public final void a(h4 h4Var) {
        int r13;
        if (h4Var instanceof a.p) {
            int i13 = this.f6899b & 7;
            if (i13 == 0) {
                this.f6898a.c();
                throw null;
            }
            if (i13 == 2) {
                this.f6898a.s();
                this.f6898a.a();
                this.f6898a.c();
                throw null;
            }
            int i14 = e21.f4580b;
            throw new d21();
        }
        int i15 = this.f6899b & 7;
        if (i15 == 0) {
            do {
                h4Var.add(Boolean.valueOf(this.f6898a.c()));
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        if (i15 == 2) {
            int a13 = this.f6898a.a() + this.f6898a.s();
            do {
                h4Var.add(Boolean.valueOf(this.f6898a.c()));
            } while (this.f6898a.a() < a13);
            a(a13);
            return;
        }
        int i16 = e21.f4580b;
        throw new d21();
    }

    public final void b(int i13) {
        if ((this.f6899b & 7) == i13) {
            return;
        }
        int i14 = e21.f4580b;
        throw new d21();
    }

    public static void c(int i13) {
        if ((i13 & 3) != 0) {
            throw new e21("Failed to parse the message.");
        }
    }

    public final boolean b() {
        int i13;
        if (this.f6898a.b() || (i13 = this.f6899b) == this.f6900c) {
            return false;
        }
        return this.f6898a.e(i13);
    }

    public static void d(int i13) {
        if ((i13 & 7) != 0) {
            throw new e21("Failed to parse the message.");
        }
    }

    public final Object a(v03 v03Var, Class cls, jc0 jc0Var) {
        switch (v03Var.ordinal()) {
            case 0:
                b(1);
                return Double.valueOf(this.f6898a.e());
            case 1:
                b(5);
                return Float.valueOf(this.f6898a.i());
            case 2:
                b(0);
                return Long.valueOf(this.f6898a.k());
            case 3:
                b(0);
                return Long.valueOf(this.f6898a.t());
            case 4:
                b(0);
                return Integer.valueOf(this.f6898a.j());
            case 5:
                b(1);
                return Long.valueOf(this.f6898a.h());
            case 6:
                b(5);
                return Integer.valueOf(this.f6898a.g());
            case 7:
                b(0);
                return Boolean.valueOf(this.f6898a.c());
            case 8:
                b(2);
                return this.f6898a.q();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                b(2);
                a.tb a13 = k22.f7066c.a(cls);
                sj0 a14 = a13.a();
                b(a14, a13, jc0Var);
                a13.c(a14);
                return a14;
            case 11:
                b(2);
                return this.f6898a.d();
            case 12:
                b(0);
                return Integer.valueOf(this.f6898a.s());
            case 13:
                b(0);
                return Integer.valueOf(this.f6898a.f());
            case 14:
                b(5);
                return Integer.valueOf(this.f6898a.l());
            case 15:
                b(1);
                return Long.valueOf(this.f6898a.m());
            case 16:
                b(0);
                return Integer.valueOf(this.f6898a.n());
            case 17:
                b(0);
                return Long.valueOf(this.f6898a.o());
        }
    }

    public final void a(h4 h4Var, boolean z13) {
        String p13;
        int r13;
        if ((this.f6899b & 7) == 2) {
            do {
                if (z13) {
                    b(2);
                    p13 = this.f6898a.q();
                } else {
                    b(2);
                    p13 = this.f6898a.p();
                }
                h4Var.add(p13);
                if (this.f6898a.b()) {
                    return;
                } else {
                    r13 = this.f6898a.r();
                }
            } while (r13 == this.f6899b);
            this.f6901d = r13;
            return;
        }
        int i13 = e21.f4580b;
        throw new d21();
    }

    public final void a(int i13) {
        if (this.f6898a.a() != i13) {
            throw new e21("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
