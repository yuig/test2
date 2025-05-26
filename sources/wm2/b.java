package wm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class b extends t {

    /* renamed from: g, reason: collision with root package name */
    public static final b f130346g;

    /* renamed from: h, reason: collision with root package name */
    public static final tm2.a f130347h = new tm2.a(21);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f130348a;

    /* renamed from: b, reason: collision with root package name */
    public int f130349b;

    /* renamed from: c, reason: collision with root package name */
    public int f130350c;

    /* renamed from: d, reason: collision with root package name */
    public int f130351d;

    /* renamed from: e, reason: collision with root package name */
    public byte f130352e;

    /* renamed from: f, reason: collision with root package name */
    public int f130353f;

    static {
        b bVar = new b();
        f130346g = bVar;
        bVar.f130350c = 0;
        bVar.f130351d = 0;
    }

    public b() {
        this.f130352e = (byte) -1;
        this.f130353f = -1;
        this.f130348a = zm2.g.f142207a;
    }

    public static a h(b bVar) {
        a g13 = a.g();
        g13.i(bVar);
        return g13;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f130353f;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f130349b & 1) == 1 ? zm2.i.f(1, this.f130350c) : 0;
        if ((this.f130349b & 2) == 2) {
            f13 += zm2.i.f(2, this.f130351d);
        }
        int size = this.f130348a.size() + f13;
        this.f130353f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return a.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        return h(this);
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f130349b & 1) == 1) {
            iVar.F(1, this.f130350c);
        }
        if ((this.f130349b & 2) == 2) {
            iVar.F(2, this.f130351d);
        }
        iVar.L(this.f130348a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f130352e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f130352e = (byte) 1;
        return true;
    }

    public b(zm2.h hVar, zm2.k kVar) {
        this.f130352e = (byte) -1;
        this.f130353f = -1;
        boolean z13 = false;
        this.f130350c = 0;
        this.f130351d = 0;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f130349b |= 1;
                            this.f130350c = hVar.j();
                        } else if (o13 != 16) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            this.f130349b |= 2;
                            this.f130351d = hVar.j();
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
                    this.f130348a = fVar.d();
                    throw th4;
                }
                this.f130348a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f130348a = fVar.d();
            throw th5;
        }
        this.f130348a = fVar.d();
    }

    public b(o oVar) {
        this.f130352e = (byte) -1;
        this.f130353f = -1;
        this.f130348a = oVar.f142242a;
    }
}
