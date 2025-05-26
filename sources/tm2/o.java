package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class o extends zm2.t {

    /* renamed from: e, reason: collision with root package name */
    public static final o f118410e;

    /* renamed from: f, reason: collision with root package name */
    public static final a f118411f = new a(5);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118412a;

    /* renamed from: b, reason: collision with root package name */
    public List f118413b;

    /* renamed from: c, reason: collision with root package name */
    public byte f118414c;

    /* renamed from: d, reason: collision with root package name */
    public int f118415d;

    static {
        o oVar = new o();
        f118410e = oVar;
        oVar.f118413b = Collections.emptyList();
    }

    public o() {
        this.f118414c = (byte) -1;
        this.f118415d = -1;
        this.f118412a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118415d;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118413b.size(); i15++) {
            i14 += zm2.i.i(1, (zm2.c) this.f118413b.get(i15));
        }
        int size = this.f118412a.size() + i14;
        this.f118415d = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return n.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        n g13 = n.g();
        g13.l(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        for (int i13 = 0; i13 < this.f118413b.size(); i13++) {
            iVar.I(1, (zm2.c) this.f118413b.get(i13));
        }
        iVar.L(this.f118412a);
    }

    public final n h() {
        n g13 = n.g();
        g13.l(this);
        return g13;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118414c;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118413b.size(); i13++) {
            if (!((t) this.f118413b.get(i13)).isInitialized()) {
                this.f118414c = (byte) 0;
                return false;
            }
        }
        this.f118414c = (byte) 1;
        return true;
    }

    public o(zm2.h hVar, zm2.k kVar) {
        this.f118414c = (byte) -1;
        this.f118415d = -1;
        this.f118413b = Collections.emptyList();
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
                                this.f118413b = new ArrayList();
                                z14 = true;
                            }
                            this.f118413b.add(hVar.f(t.f118471j, kVar));
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
                    this.f118413b = Collections.unmodifiableList(this.f118413b);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118412a = fVar.d();
                    throw th4;
                }
                this.f118412a = fVar.d();
                throw th3;
            }
        }
        if (z14 & true) {
            this.f118413b = Collections.unmodifiableList(this.f118413b);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118412a = fVar.d();
            throw th5;
        }
        this.f118412a = fVar.d();
    }

    public o(zm2.o oVar) {
        this.f118414c = (byte) -1;
        this.f118415d = -1;
        this.f118412a = oVar.f142242a;
    }
}
