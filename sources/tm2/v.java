package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class v extends zm2.q {

    /* renamed from: g, reason: collision with root package name */
    public static final v f118507g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f118508h = new a(6);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118509b;

    /* renamed from: c, reason: collision with root package name */
    public int f118510c;

    /* renamed from: d, reason: collision with root package name */
    public int f118511d;

    /* renamed from: e, reason: collision with root package name */
    public byte f118512e;

    /* renamed from: f, reason: collision with root package name */
    public int f118513f;

    static {
        v vVar = new v();
        f118507g = vVar;
        vVar.f118511d = 0;
    }

    public v(zm2.p pVar) {
        super(pVar);
        this.f118512e = (byte) -1;
        this.f118513f = -1;
        this.f118509b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118513f;
        if (i13 != -1) {
            return i13;
        }
        int size = this.f118509b.size() + i() + ((this.f118510c & 1) == 1 ? zm2.i.f(1, this.f118511d) : 0);
        this.f118513f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return u.i();
    }

    @Override // zm2.c
    public final zm2.b c() {
        u uVar = new u();
        uVar.j(this);
        return uVar;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118510c & 1) == 1) {
            iVar.F(1, this.f118511d);
        }
        m13.f(200, iVar);
        iVar.L(this.f118509b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118507g;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118512e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if (h()) {
            this.f118512e = (byte) 1;
            return true;
        }
        this.f118512e = (byte) 0;
        return false;
    }

    public v() {
        this.f118512e = (byte) -1;
        this.f118513f = -1;
        this.f118509b = zm2.g.f142207a;
    }

    public v(zm2.h hVar, zm2.k kVar) {
        this.f118512e = (byte) -1;
        this.f118513f = -1;
        boolean z13 = false;
        this.f118511d = 0;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        while (!z13) {
            try {
                try {
                    try {
                        int o13 = hVar.o();
                        if (o13 != 0) {
                            if (o13 != 8) {
                                if (!n(hVar, u13, kVar, o13)) {
                                }
                            } else {
                                this.f118510c |= 1;
                                this.f118511d = hVar.j();
                            }
                        }
                        z13 = true;
                    } catch (IOException e13) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e13.getMessage());
                        invalidProtocolBufferException.f80460a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (InvalidProtocolBufferException e14) {
                    e14.f80460a = this;
                    throw e14;
                }
            } catch (Throwable th3) {
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118509b = fVar.d();
                    throw th4;
                }
                this.f118509b = fVar.d();
                l();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118509b = fVar.d();
            throw th5;
        }
        this.f118509b = fVar.d();
        l();
    }
}
