package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class y0 extends zm2.t {

    /* renamed from: g, reason: collision with root package name */
    public static final y0 f118555g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f118556h = new a(17);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118557a;

    /* renamed from: b, reason: collision with root package name */
    public int f118558b;

    /* renamed from: c, reason: collision with root package name */
    public List f118559c;

    /* renamed from: d, reason: collision with root package name */
    public int f118560d;

    /* renamed from: e, reason: collision with root package name */
    public byte f118561e;

    /* renamed from: f, reason: collision with root package name */
    public int f118562f;

    static {
        y0 y0Var = new y0();
        f118555g = y0Var;
        y0Var.f118559c = Collections.emptyList();
        y0Var.f118560d = -1;
    }

    public y0() {
        this.f118561e = (byte) -1;
        this.f118562f = -1;
        this.f118557a = zm2.g.f142207a;
    }

    public static b i(y0 y0Var) {
        b bVar = new b(1);
        bVar.k(y0Var);
        return bVar;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118562f;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118559c.size(); i15++) {
            i14 += zm2.i.i(1, (zm2.c) this.f118559c.get(i15));
        }
        if ((this.f118558b & 1) == 1) {
            i14 += zm2.i.f(2, this.f118560d);
        }
        int size = this.f118557a.size() + i14;
        this.f118562f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return new b(1);
    }

    @Override // zm2.c
    public final zm2.b c() {
        return i(this);
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        for (int i13 = 0; i13 < this.f118559c.size(); i13++) {
            iVar.I(1, (zm2.c) this.f118559c.get(i13));
        }
        if ((this.f118558b & 1) == 1) {
            iVar.F(2, this.f118560d);
        }
        iVar.L(this.f118557a);
    }

    public final int h() {
        return this.f118560d;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118561e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118559c.size(); i13++) {
            if (!((s0) this.f118559c.get(i13)).isInitialized()) {
                this.f118561e = (byte) 0;
                return false;
            }
        }
        this.f118561e = (byte) 1;
        return true;
    }

    public y0(zm2.h hVar, zm2.k kVar) {
        this.f118561e = (byte) -1;
        this.f118562f = -1;
        this.f118559c = Collections.emptyList();
        this.f118560d = -1;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            try {
                try {
                    try {
                        int o13 = hVar.o();
                        if (o13 != 0) {
                            if (o13 == 10) {
                                if (!(z14 & true)) {
                                    this.f118559c = new ArrayList();
                                    z14 = true;
                                }
                                this.f118559c.add(hVar.f(s0.f118451u, kVar));
                            } else if (o13 != 16) {
                                if (!hVar.r(o13, u13)) {
                                }
                            } else {
                                this.f118558b |= 1;
                                this.f118560d = hVar.j();
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
                if (z14 & true) {
                    this.f118559c = Collections.unmodifiableList(this.f118559c);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118557a = fVar.d();
                    throw th4;
                }
                this.f118557a = fVar.d();
                throw th3;
            }
        }
        if (z14 & true) {
            this.f118559c = Collections.unmodifiableList(this.f118559c);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118557a = fVar.d();
            throw th5;
        }
        this.f118557a = fVar.d();
    }

    public y0(zm2.o oVar) {
        this.f118561e = (byte) -1;
        this.f118562f = -1;
        this.f118557a = oVar.f142242a;
    }
}
