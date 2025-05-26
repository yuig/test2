package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class a1 extends zm2.q {

    /* renamed from: l, reason: collision with root package name */
    public static final a1 f118163l;

    /* renamed from: m, reason: collision with root package name */
    public static final a f118164m = new a(18);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118165b;

    /* renamed from: c, reason: collision with root package name */
    public int f118166c;

    /* renamed from: d, reason: collision with root package name */
    public int f118167d;

    /* renamed from: e, reason: collision with root package name */
    public int f118168e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f118169f;

    /* renamed from: g, reason: collision with root package name */
    public int f118170g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f118171h;

    /* renamed from: i, reason: collision with root package name */
    public int f118172i;

    /* renamed from: j, reason: collision with root package name */
    public byte f118173j;

    /* renamed from: k, reason: collision with root package name */
    public int f118174k;

    static {
        a1 a1Var = new a1();
        f118163l = a1Var;
        a1Var.f118167d = 0;
        a1Var.f118168e = 0;
        s0 s0Var = s0.f118450t;
        a1Var.f118169f = s0Var;
        a1Var.f118170g = 0;
        a1Var.f118171h = s0Var;
        a1Var.f118172i = 0;
    }

    public a1(zm2.p pVar) {
        super(pVar);
        this.f118173j = (byte) -1;
        this.f118174k = -1;
        this.f118165b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118174k;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118166c & 1) == 1 ? zm2.i.f(1, this.f118167d) : 0;
        if ((this.f118166c & 2) == 2) {
            f13 += zm2.i.f(2, this.f118168e);
        }
        if ((this.f118166c & 4) == 4) {
            f13 += zm2.i.i(3, this.f118169f);
        }
        if ((this.f118166c & 16) == 16) {
            f13 += zm2.i.i(4, this.f118171h);
        }
        if ((this.f118166c & 8) == 8) {
            f13 += zm2.i.f(5, this.f118170g);
        }
        if ((this.f118166c & 32) == 32) {
            f13 += zm2.i.f(6, this.f118172i);
        }
        int size = this.f118165b.size() + i() + f13;
        this.f118174k = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return z0.i();
    }

    @Override // zm2.c
    public final zm2.b c() {
        z0 i13 = z0.i();
        i13.k(this);
        return i13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118166c & 1) == 1) {
            iVar.F(1, this.f118167d);
        }
        if ((this.f118166c & 2) == 2) {
            iVar.F(2, this.f118168e);
        }
        if ((this.f118166c & 4) == 4) {
            iVar.I(3, this.f118169f);
        }
        if ((this.f118166c & 16) == 16) {
            iVar.I(4, this.f118171h);
        }
        if ((this.f118166c & 8) == 8) {
            iVar.F(5, this.f118170g);
        }
        if ((this.f118166c & 32) == 32) {
            iVar.F(6, this.f118172i);
        }
        m13.f(200, iVar);
        iVar.L(this.f118165b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118163l;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118173j;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        int i13 = this.f118166c;
        if ((i13 & 2) != 2) {
            this.f118173j = (byte) 0;
            return false;
        }
        if ((i13 & 4) == 4 && !this.f118169f.isInitialized()) {
            this.f118173j = (byte) 0;
            return false;
        }
        if ((this.f118166c & 16) == 16 && !p().isInitialized()) {
            this.f118173j = (byte) 0;
            return false;
        }
        if (h()) {
            this.f118173j = (byte) 1;
            return true;
        }
        this.f118173j = (byte) 0;
        return false;
    }

    public final s0 p() {
        return this.f118171h;
    }

    public final z0 q() {
        z0 i13 = z0.i();
        i13.k(this);
        return i13;
    }

    public a1() {
        this.f118173j = (byte) -1;
        this.f118174k = -1;
        this.f118165b = zm2.g.f142207a;
    }

    public a1(zm2.h hVar, zm2.k kVar) {
        this.f118173j = (byte) -1;
        this.f118174k = -1;
        boolean z13 = false;
        this.f118167d = 0;
        this.f118168e = 0;
        s0 s0Var = s0.f118450t;
        this.f118169f = s0Var;
        this.f118170g = 0;
        this.f118171h = s0Var;
        this.f118172i = 0;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118166c |= 1;
                            this.f118167d = hVar.j();
                        } else if (o13 != 16) {
                            r0 r0Var = null;
                            if (o13 == 26) {
                                if ((this.f118166c & 4) == 4) {
                                    s0 s0Var2 = this.f118169f;
                                    s0Var2.getClass();
                                    r0Var = s0.z(s0Var2);
                                }
                                s0 s0Var3 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118169f = s0Var3;
                                if (r0Var != null) {
                                    r0Var.l(s0Var3);
                                    this.f118169f = r0Var.k();
                                }
                                this.f118166c |= 4;
                            } else if (o13 == 34) {
                                if ((this.f118166c & 16) == 16) {
                                    s0 s0Var4 = this.f118171h;
                                    s0Var4.getClass();
                                    r0Var = s0.z(s0Var4);
                                }
                                s0 s0Var5 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118171h = s0Var5;
                                if (r0Var != null) {
                                    r0Var.l(s0Var5);
                                    this.f118171h = r0Var.k();
                                }
                                this.f118166c |= 16;
                            } else if (o13 == 40) {
                                this.f118166c |= 8;
                                this.f118170g = hVar.j();
                            } else if (o13 != 48) {
                                if (!n(hVar, u13, kVar, o13)) {
                                }
                            } else {
                                this.f118166c |= 32;
                                this.f118172i = hVar.j();
                            }
                        } else {
                            this.f118166c |= 2;
                            this.f118168e = hVar.j();
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
                    this.f118165b = fVar.d();
                    throw th4;
                }
                this.f118165b = fVar.d();
                l();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118165b = fVar.d();
            throw th5;
        }
        this.f118165b = fVar.d();
        l();
    }
}
