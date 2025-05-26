package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class e1 extends zm2.t {

    /* renamed from: k, reason: collision with root package name */
    public static final e1 f118232k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f118233l = new a(19);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118234a;

    /* renamed from: b, reason: collision with root package name */
    public int f118235b;

    /* renamed from: c, reason: collision with root package name */
    public int f118236c;

    /* renamed from: d, reason: collision with root package name */
    public int f118237d;

    /* renamed from: e, reason: collision with root package name */
    public c1 f118238e;

    /* renamed from: f, reason: collision with root package name */
    public int f118239f;

    /* renamed from: g, reason: collision with root package name */
    public int f118240g;

    /* renamed from: h, reason: collision with root package name */
    public d1 f118241h;

    /* renamed from: i, reason: collision with root package name */
    public byte f118242i;

    /* renamed from: j, reason: collision with root package name */
    public int f118243j;

    static {
        e1 e1Var = new e1();
        f118232k = e1Var;
        e1Var.f118236c = 0;
        e1Var.f118237d = 0;
        e1Var.f118238e = c1.ERROR;
        e1Var.f118239f = 0;
        e1Var.f118240g = 0;
        e1Var.f118241h = d1.LANGUAGE_VERSION;
    }

    public e1() {
        this.f118242i = (byte) -1;
        this.f118243j = -1;
        this.f118234a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118243j;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118235b & 1) == 1 ? zm2.i.f(1, this.f118236c) : 0;
        if ((this.f118235b & 2) == 2) {
            f13 += zm2.i.f(2, this.f118237d);
        }
        if ((this.f118235b & 4) == 4) {
            f13 += zm2.i.d(3, this.f118238e.getNumber());
        }
        if ((this.f118235b & 8) == 8) {
            f13 += zm2.i.f(4, this.f118239f);
        }
        if ((this.f118235b & 16) == 16) {
            f13 += zm2.i.f(5, this.f118240g);
        }
        if ((this.f118235b & 32) == 32) {
            f13 += zm2.i.d(6, this.f118241h.getNumber());
        }
        int size = this.f118234a.size() + f13;
        this.f118243j = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return b1.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        b1 g13 = b1.g();
        g13.i(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118235b & 1) == 1) {
            iVar.F(1, this.f118236c);
        }
        if ((this.f118235b & 2) == 2) {
            iVar.F(2, this.f118237d);
        }
        if ((this.f118235b & 4) == 4) {
            iVar.A(3, this.f118238e.getNumber());
        }
        if ((this.f118235b & 8) == 8) {
            iVar.F(4, this.f118239f);
        }
        if ((this.f118235b & 16) == 16) {
            iVar.F(5, this.f118240g);
        }
        if ((this.f118235b & 32) == 32) {
            iVar.A(6, this.f118241h.getNumber());
        }
        iVar.L(this.f118234a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118242i;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f118242i = (byte) 1;
        return true;
    }

    public e1(zm2.h hVar, zm2.k kVar) {
        this.f118242i = (byte) -1;
        this.f118243j = -1;
        boolean z13 = false;
        this.f118236c = 0;
        this.f118237d = 0;
        this.f118238e = c1.ERROR;
        this.f118239f = 0;
        this.f118240g = 0;
        this.f118241h = d1.LANGUAGE_VERSION;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118235b |= 1;
                            this.f118236c = hVar.j();
                        } else if (o13 == 16) {
                            this.f118235b |= 2;
                            this.f118237d = hVar.j();
                        } else if (o13 == 24) {
                            int j13 = hVar.j();
                            c1 valueOf = c1.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f118235b |= 4;
                                this.f118238e = valueOf;
                            }
                        } else if (o13 == 32) {
                            this.f118235b |= 8;
                            this.f118239f = hVar.j();
                        } else if (o13 == 40) {
                            this.f118235b |= 16;
                            this.f118240g = hVar.j();
                        } else if (o13 != 48) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            int j14 = hVar.j();
                            d1 valueOf2 = d1.valueOf(j14);
                            if (valueOf2 == null) {
                                u13.P(o13);
                                u13.P(j14);
                            } else {
                                this.f118235b |= 32;
                                this.f118241h = valueOf2;
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
                    this.f118234a = fVar.d();
                    throw th4;
                }
                this.f118234a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118234a = fVar.d();
            throw th5;
        }
        this.f118234a = fVar.d();
    }

    public e1(zm2.o oVar) {
        this.f118242i = (byte) -1;
        this.f118243j = -1;
        this.f118234a = oVar.f142242a;
    }
}
