package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class m0 extends zm2.t {

    /* renamed from: e, reason: collision with root package name */
    public static final m0 f118395e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f118396f = new a(11);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118397a;

    /* renamed from: b, reason: collision with root package name */
    public List f118398b;

    /* renamed from: c, reason: collision with root package name */
    public byte f118399c;

    /* renamed from: d, reason: collision with root package name */
    public int f118400d;

    static {
        m0 m0Var = new m0();
        f118395e = m0Var;
        m0Var.f118398b = Collections.emptyList();
    }

    public m0() {
        this.f118399c = (byte) -1;
        this.f118400d = -1;
        this.f118397a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118400d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118398b.size(); i15++) {
            i14 += zm2.i.i(1, (zm2.c) this.f118398b.get(i15));
        }
        int size = this.f118397a.size() + i14;
        this.f118400d = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return new n(1);
    }

    @Override // zm2.c
    public final zm2.b c() {
        n nVar = new n(1);
        nVar.m(this);
        return nVar;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        for (int i13 = 0; i13 < this.f118398b.size(); i13++) {
            iVar.I(1, (zm2.c) this.f118398b.get(i13));
        }
        iVar.L(this.f118397a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118399c;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118398b.size(); i13++) {
            if (!((l0) this.f118398b.get(i13)).isInitialized()) {
                this.f118399c = (byte) 0;
                return false;
            }
        }
        this.f118399c = (byte) 1;
        return true;
    }

    public m0(zm2.h hVar, zm2.k kVar) {
        this.f118399c = (byte) -1;
        this.f118400d = -1;
        this.f118398b = Collections.emptyList();
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
                            if (!(z14 & true)) {
                                this.f118398b = new ArrayList();
                                z14 = true;
                            }
                            this.f118398b.add(hVar.f(l0.f118378i, kVar));
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
                    this.f118398b = Collections.unmodifiableList(this.f118398b);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118397a = fVar.d();
                    throw th4;
                }
                this.f118397a = fVar.d();
                throw th3;
            }
        }
        if (z14 & true) {
            this.f118398b = Collections.unmodifiableList(this.f118398b);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118397a = fVar.d();
            throw th5;
        }
        this.f118397a = fVar.d();
    }

    public m0(zm2.o oVar) {
        this.f118399c = (byte) -1;
        this.f118400d = -1;
        this.f118397a = oVar.f142242a;
    }
}
