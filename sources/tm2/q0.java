package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class q0 extends zm2.t {

    /* renamed from: h, reason: collision with root package name */
    public static final q0 f118426h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f118427i = new a(15);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118428a;

    /* renamed from: b, reason: collision with root package name */
    public int f118429b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f118430c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f118431d;

    /* renamed from: e, reason: collision with root package name */
    public int f118432e;

    /* renamed from: f, reason: collision with root package name */
    public byte f118433f;

    /* renamed from: g, reason: collision with root package name */
    public int f118434g;

    static {
        q0 q0Var = new q0();
        f118426h = q0Var;
        q0Var.f118430c = p0.INV;
        q0Var.f118431d = s0.f118450t;
        q0Var.f118432e = 0;
    }

    public q0() {
        this.f118433f = (byte) -1;
        this.f118434g = -1;
        this.f118428a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118434g;
        if (i13 != -1) {
            return i13;
        }
        int d2 = (this.f118429b & 1) == 1 ? zm2.i.d(1, this.f118430c.getNumber()) : 0;
        if ((this.f118429b & 2) == 2) {
            d2 += zm2.i.i(2, this.f118431d);
        }
        if ((this.f118429b & 4) == 4) {
            d2 += zm2.i.f(3, this.f118432e);
        }
        int size = this.f118428a.size() + d2;
        this.f118434g = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return o0.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        o0 g13 = o0.g();
        g13.i(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118429b & 1) == 1) {
            iVar.A(1, this.f118430c.getNumber());
        }
        if ((this.f118429b & 2) == 2) {
            iVar.I(2, this.f118431d);
        }
        if ((this.f118429b & 4) == 4) {
            iVar.F(3, this.f118432e);
        }
        iVar.L(this.f118428a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118433f;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118429b & 2) != 2 || this.f118431d.isInitialized()) {
            this.f118433f = (byte) 1;
            return true;
        }
        this.f118433f = (byte) 0;
        return false;
    }

    public q0(zm2.h hVar, zm2.k kVar) {
        r0 r0Var;
        this.f118433f = (byte) -1;
        this.f118434g = -1;
        this.f118430c = p0.INV;
        this.f118431d = s0.f118450t;
        boolean z13 = false;
        this.f118432e = 0;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            int j13 = hVar.j();
                            p0 valueOf = p0.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f118429b |= 1;
                                this.f118430c = valueOf;
                            }
                        } else if (o13 == 18) {
                            if ((this.f118429b & 2) == 2) {
                                s0 s0Var = this.f118431d;
                                s0Var.getClass();
                                r0Var = s0.z(s0Var);
                            } else {
                                r0Var = null;
                            }
                            s0 s0Var2 = (s0) hVar.f(s0.f118451u, kVar);
                            this.f118431d = s0Var2;
                            if (r0Var != null) {
                                r0Var.l(s0Var2);
                                this.f118431d = r0Var.k();
                            }
                            this.f118429b |= 2;
                        } else if (o13 != 24) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            this.f118429b |= 4;
                            this.f118432e = hVar.j();
                        }
                    }
                    z13 = true;
                } catch (InvalidProtocolBufferException e13) {
                    e13.f80460a = this;
                    throw e13;
                } catch (IOException e14) {
                    InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e14.getMessage());
                    invalidProtocolBufferException.f80460a = this;
                    throw invalidProtocolBufferException;
                }
            } catch (Throwable th3) {
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118428a = fVar.d();
                    throw th4;
                }
                this.f118428a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118428a = fVar.d();
            throw th5;
        }
        this.f118428a = fVar.d();
    }

    public q0(zm2.o oVar) {
        this.f118433f = (byte) -1;
        this.f118434g = -1;
        this.f118428a = oVar.f142242a;
    }
}
