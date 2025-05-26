package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes4.dex */
public final class t extends zm2.t {

    /* renamed from: i, reason: collision with root package name */
    public static final t f118470i;

    /* renamed from: j, reason: collision with root package name */
    public static final p f118471j = new p(0);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118472a;

    /* renamed from: b, reason: collision with root package name */
    public int f118473b;

    /* renamed from: c, reason: collision with root package name */
    public r f118474c;

    /* renamed from: d, reason: collision with root package name */
    public List f118475d;

    /* renamed from: e, reason: collision with root package name */
    public y f118476e;

    /* renamed from: f, reason: collision with root package name */
    public s f118477f;

    /* renamed from: g, reason: collision with root package name */
    public byte f118478g;

    /* renamed from: h, reason: collision with root package name */
    public int f118479h;

    static {
        t tVar = new t();
        f118470i = tVar;
        tVar.f118474c = r.RETURNS_CONSTANT;
        tVar.f118475d = Collections.emptyList();
        tVar.f118476e = y.f118542l;
        tVar.f118477f = s.AT_MOST_ONCE;
    }

    public t() {
        this.f118478g = (byte) -1;
        this.f118479h = -1;
        this.f118472a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118479h;
        if (i13 != -1) {
            return i13;
        }
        int d2 = (this.f118473b & 1) == 1 ? zm2.i.d(1, this.f118474c.getNumber()) : 0;
        for (int i14 = 0; i14 < this.f118475d.size(); i14++) {
            d2 += zm2.i.i(2, (zm2.c) this.f118475d.get(i14));
        }
        if ((this.f118473b & 2) == 2) {
            d2 += zm2.i.i(3, this.f118476e);
        }
        if ((this.f118473b & 4) == 4) {
            d2 += zm2.i.d(4, this.f118477f.getNumber());
        }
        int size = this.f118472a.size() + d2;
        this.f118479h = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return q.h();
    }

    @Override // zm2.c
    public final zm2.b c() {
        q h10 = q.h();
        h10.i(this);
        return h10;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118473b & 1) == 1) {
            iVar.A(1, this.f118474c.getNumber());
        }
        for (int i13 = 0; i13 < this.f118475d.size(); i13++) {
            iVar.I(2, (zm2.c) this.f118475d.get(i13));
        }
        if ((this.f118473b & 2) == 2) {
            iVar.I(3, this.f118476e);
        }
        if ((this.f118473b & 4) == 4) {
            iVar.A(4, this.f118477f.getNumber());
        }
        iVar.L(this.f118472a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118478g;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118475d.size(); i13++) {
            if (!((y) this.f118475d.get(i13)).isInitialized()) {
                this.f118478g = (byte) 0;
                return false;
            }
        }
        if ((this.f118473b & 2) != 2 || this.f118476e.isInitialized()) {
            this.f118478g = (byte) 1;
            return true;
        }
        this.f118478g = (byte) 0;
        return false;
    }

    public t(zm2.h hVar, zm2.k kVar) {
        w wVar;
        this.f118478g = (byte) -1;
        this.f118479h = -1;
        this.f118474c = r.RETURNS_CONSTANT;
        this.f118475d = Collections.emptyList();
        this.f118476e = y.f118542l;
        this.f118477f = s.AT_MOST_ONCE;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    try {
                        int o13 = hVar.o();
                        if (o13 != 0) {
                            if (o13 == 8) {
                                int j13 = hVar.j();
                                r valueOf = r.valueOf(j13);
                                if (valueOf == null) {
                                    u13.P(o13);
                                    u13.P(j13);
                                } else {
                                    this.f118473b |= 1;
                                    this.f118474c = valueOf;
                                }
                            } else if (o13 == 18) {
                                if ((c13 & 2) != 2) {
                                    this.f118475d = new ArrayList();
                                    c13 = 2;
                                }
                                this.f118475d.add(hVar.f(y.f118543m, kVar));
                            } else if (o13 == 26) {
                                if ((this.f118473b & 2) == 2) {
                                    y yVar = this.f118476e;
                                    yVar.getClass();
                                    wVar = w.h();
                                    wVar.i(yVar);
                                } else {
                                    wVar = null;
                                }
                                y yVar2 = (y) hVar.f(y.f118543m, kVar);
                                this.f118476e = yVar2;
                                if (wVar != null) {
                                    wVar.i(yVar2);
                                    this.f118476e = wVar.g();
                                }
                                this.f118473b |= 2;
                            } else if (o13 != 32) {
                                if (!hVar.r(o13, u13)) {
                                }
                            } else {
                                int j14 = hVar.j();
                                s valueOf2 = s.valueOf(j14);
                                if (valueOf2 == null) {
                                    u13.P(o13);
                                    u13.P(j14);
                                } else {
                                    this.f118473b |= 4;
                                    this.f118477f = valueOf2;
                                }
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
                if ((c13 & 2) == 2) {
                    this.f118475d = Collections.unmodifiableList(this.f118475d);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118472a = fVar.d();
                    throw th4;
                }
                this.f118472a = fVar.d();
                throw th3;
            }
        }
        if ((c13 & 2) == 2) {
            this.f118475d = Collections.unmodifiableList(this.f118475d);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118472a = fVar.d();
            throw th5;
        }
        this.f118472a = fVar.d();
    }

    public t(zm2.o oVar) {
        this.f118478g = (byte) -1;
        this.f118479h = -1;
        this.f118472a = oVar.f142242a;
    }
}
