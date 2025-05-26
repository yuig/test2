package tm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class n0 extends zm2.t {

    /* renamed from: e, reason: collision with root package name */
    public static final n0 f118404e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f118405f = new a(13);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118406a;

    /* renamed from: b, reason: collision with root package name */
    public zm2.y f118407b;

    /* renamed from: c, reason: collision with root package name */
    public byte f118408c;

    /* renamed from: d, reason: collision with root package name */
    public int f118409d;

    static {
        n0 n0Var = new n0();
        f118404e = n0Var;
        n0Var.f118407b = zm2.x.f142257b;
    }

    public n0() {
        this.f118408c = (byte) -1;
        this.f118409d = -1;
        this.f118406a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118409d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118407b.size(); i15++) {
            i14 += zm2.i.b(this.f118407b.E0(i15));
        }
        int size = this.f118406a.size() + this.f118407b.size() + i14;
        this.f118409d = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return new n(3);
    }

    @Override // zm2.c
    public final zm2.b c() {
        n nVar = new n(3);
        nVar.n(this);
        return nVar;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        for (int i13 = 0; i13 < this.f118407b.size(); i13++) {
            zm2.g E0 = this.f118407b.E0(i13);
            iVar.X(1, 2);
            iVar.x(E0);
        }
        iVar.L(this.f118406a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118408c;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f118408c = (byte) 1;
        return true;
    }

    public n0(zm2.h hVar, zm2.k kVar) {
        this.f118408c = (byte) -1;
        this.f118409d = -1;
        this.f118407b = zm2.x.f142257b;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 != 10) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            zm2.z d2 = hVar.d();
                            if (!(z14 & true)) {
                                this.f118407b = new zm2.x();
                                z14 = true;
                            }
                            this.f118407b.A1(d2);
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
                if (z14 & true) {
                    this.f118407b = this.f118407b.k();
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118406a = fVar.d();
                    throw th4;
                }
                this.f118406a = fVar.d();
                throw th3;
            }
        }
        if (z14 & true) {
            this.f118407b = this.f118407b.k();
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118406a = fVar.d();
            throw th5;
        }
        this.f118406a = fVar.d();
    }

    public n0(zm2.o oVar) {
        this.f118408c = (byte) -1;
        this.f118409d = -1;
        this.f118406a = oVar.f142242a;
    }
}
