package wm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class d extends t {

    /* renamed from: g, reason: collision with root package name */
    public static final d f130357g;

    /* renamed from: h, reason: collision with root package name */
    public static final tm2.a f130358h = new tm2.a(22);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f130359a;

    /* renamed from: b, reason: collision with root package name */
    public int f130360b;

    /* renamed from: c, reason: collision with root package name */
    public int f130361c;

    /* renamed from: d, reason: collision with root package name */
    public int f130362d;

    /* renamed from: e, reason: collision with root package name */
    public byte f130363e;

    /* renamed from: f, reason: collision with root package name */
    public int f130364f;

    static {
        d dVar = new d();
        f130357g = dVar;
        dVar.f130361c = 0;
        dVar.f130362d = 0;
    }

    public d() {
        this.f130363e = (byte) -1;
        this.f130364f = -1;
        this.f130359a = zm2.g.f142207a;
    }

    public static c h(d dVar) {
        c cVar = new c();
        cVar.h(dVar);
        return cVar;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f130364f;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f130360b & 1) == 1 ? zm2.i.f(1, this.f130361c) : 0;
        if ((this.f130360b & 2) == 2) {
            f13 += zm2.i.f(2, this.f130362d);
        }
        int size = this.f130359a.size() + f13;
        this.f130364f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return new c();
    }

    @Override // zm2.c
    public final zm2.b c() {
        return h(this);
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f130360b & 1) == 1) {
            iVar.F(1, this.f130361c);
        }
        if ((this.f130360b & 2) == 2) {
            iVar.F(2, this.f130362d);
        }
        iVar.L(this.f130359a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f130363e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f130363e = (byte) 1;
        return true;
    }

    public d(zm2.h hVar, zm2.k kVar) {
        this.f130363e = (byte) -1;
        this.f130364f = -1;
        boolean z13 = false;
        this.f130361c = 0;
        this.f130362d = 0;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f130360b |= 1;
                            this.f130361c = hVar.j();
                        } else if (o13 != 16) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            this.f130360b |= 2;
                            this.f130362d = hVar.j();
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
                    this.f130359a = fVar.d();
                    throw th4;
                }
                this.f130359a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f130359a = fVar.d();
            throw th5;
        }
        this.f130359a = fVar.d();
    }

    public d(o oVar) {
        this.f130363e = (byte) -1;
        this.f130364f = -1;
        this.f130359a = oVar.f142242a;
    }
}
