package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class l0 extends zm2.t {

    /* renamed from: h, reason: collision with root package name */
    public static final l0 f118377h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f118378i = new a(12);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118379a;

    /* renamed from: b, reason: collision with root package name */
    public int f118380b;

    /* renamed from: c, reason: collision with root package name */
    public int f118381c;

    /* renamed from: d, reason: collision with root package name */
    public int f118382d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f118383e;

    /* renamed from: f, reason: collision with root package name */
    public byte f118384f;

    /* renamed from: g, reason: collision with root package name */
    public int f118385g;

    static {
        l0 l0Var = new l0();
        f118377h = l0Var;
        l0Var.f118381c = -1;
        l0Var.f118382d = 0;
        l0Var.f118383e = k0.PACKAGE;
    }

    public l0() {
        this.f118384f = (byte) -1;
        this.f118385g = -1;
        this.f118379a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118385g;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118380b & 1) == 1 ? zm2.i.f(1, this.f118381c) : 0;
        if ((this.f118380b & 2) == 2) {
            f13 += zm2.i.f(2, this.f118382d);
        }
        if ((this.f118380b & 4) == 4) {
            f13 += zm2.i.d(3, this.f118383e.getNumber());
        }
        int size = this.f118379a.size() + f13;
        this.f118385g = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return j0.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        j0 g13 = j0.g();
        g13.i(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118380b & 1) == 1) {
            iVar.F(1, this.f118381c);
        }
        if ((this.f118380b & 2) == 2) {
            iVar.F(2, this.f118382d);
        }
        if ((this.f118380b & 4) == 4) {
            iVar.A(3, this.f118383e.getNumber());
        }
        iVar.L(this.f118379a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118384f;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118380b & 2) == 2) {
            this.f118384f = (byte) 1;
            return true;
        }
        this.f118384f = (byte) 0;
        return false;
    }

    public l0(zm2.h hVar, zm2.k kVar) {
        this.f118384f = (byte) -1;
        this.f118385g = -1;
        this.f118381c = -1;
        boolean z13 = false;
        this.f118382d = 0;
        this.f118383e = k0.PACKAGE;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118380b |= 1;
                            this.f118381c = hVar.j();
                        } else if (o13 == 16) {
                            this.f118380b |= 2;
                            this.f118382d = hVar.j();
                        } else if (o13 != 24) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            int j13 = hVar.j();
                            k0 valueOf = k0.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f118380b |= 4;
                                this.f118383e = valueOf;
                            }
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
                    this.f118379a = fVar.d();
                    throw th4;
                }
                this.f118379a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118379a = fVar.d();
            throw th5;
        }
        this.f118379a = fVar.d();
    }

    public l0(zm2.o oVar) {
        this.f118384f = (byte) -1;
        this.f118385g = -1;
        this.f118379a = oVar.f142242a;
    }
}
