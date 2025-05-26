package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class f extends zm2.t {

    /* renamed from: g, reason: collision with root package name */
    public static final f f118244g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f118245h = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118246a;

    /* renamed from: b, reason: collision with root package name */
    public int f118247b;

    /* renamed from: c, reason: collision with root package name */
    public int f118248c;

    /* renamed from: d, reason: collision with root package name */
    public e f118249d;

    /* renamed from: e, reason: collision with root package name */
    public byte f118250e;

    /* renamed from: f, reason: collision with root package name */
    public int f118251f;

    static {
        f fVar = new f();
        f118244g = fVar;
        fVar.f118248c = 0;
        fVar.f118249d = e.f118204p;
    }

    public f() {
        this.f118250e = (byte) -1;
        this.f118251f = -1;
        this.f118246a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118251f;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118247b & 1) == 1 ? zm2.i.f(1, this.f118248c) : 0;
        if ((this.f118247b & 2) == 2) {
            f13 += zm2.i.i(2, this.f118249d);
        }
        int size = this.f118246a.size() + f13;
        this.f118251f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return b.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        b g13 = b.g();
        g13.j(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118247b & 1) == 1) {
            iVar.F(1, this.f118248c);
        }
        if ((this.f118247b & 2) == 2) {
            iVar.I(2, this.f118249d);
        }
        iVar.L(this.f118246a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118250e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        int i13 = this.f118247b;
        if ((i13 & 1) != 1) {
            this.f118250e = (byte) 0;
            return false;
        }
        if ((i13 & 2) != 2) {
            this.f118250e = (byte) 0;
            return false;
        }
        if (this.f118249d.isInitialized()) {
            this.f118250e = (byte) 1;
            return true;
        }
        this.f118250e = (byte) 0;
        return false;
    }

    public f(zm2.h hVar, zm2.k kVar) {
        this.f118250e = (byte) -1;
        this.f118251f = -1;
        boolean z13 = false;
        this.f118248c = 0;
        this.f118249d = e.f118204p;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118247b |= 1;
                            this.f118248c = hVar.j();
                        } else if (o13 != 18) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            c i13 = (this.f118247b & 2) == 2 ? this.f118249d.i() : null;
                            e eVar = (e) hVar.f(e.f118205q, kVar);
                            this.f118249d = eVar;
                            if (i13 != null) {
                                i13.k(eVar);
                                this.f118249d = i13.g();
                            }
                            this.f118247b |= 2;
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
                    this.f118246a = fVar.d();
                    throw th4;
                }
                this.f118246a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118246a = fVar.d();
            throw th5;
        }
        this.f118246a = fVar.d();
    }

    public f(zm2.o oVar) {
        this.f118250e = (byte) -1;
        this.f118251f = -1;
        this.f118246a = oVar.f142242a;
    }
}
