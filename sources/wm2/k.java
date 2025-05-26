package wm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class k extends t {

    /* renamed from: g, reason: collision with root package name */
    public static final k f130406g;

    /* renamed from: h, reason: collision with root package name */
    public static final tm2.a f130407h = new tm2.a(24);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f130408a;

    /* renamed from: b, reason: collision with root package name */
    public List f130409b;

    /* renamed from: c, reason: collision with root package name */
    public List f130410c;

    /* renamed from: d, reason: collision with root package name */
    public int f130411d;

    /* renamed from: e, reason: collision with root package name */
    public byte f130412e;

    /* renamed from: f, reason: collision with root package name */
    public int f130413f;

    static {
        k kVar = new k();
        f130406g = kVar;
        kVar.f130409b = Collections.emptyList();
        kVar.f130410c = Collections.emptyList();
    }

    public k() {
        this.f130411d = -1;
        this.f130412e = (byte) -1;
        this.f130413f = -1;
        this.f130408a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f130413f;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f130409b.size(); i15++) {
            i14 += zm2.i.i(1, (zm2.c) this.f130409b.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f130410c.size(); i17++) {
            i16 += zm2.i.g(((Integer) this.f130410c.get(i17)).intValue());
        }
        int i18 = i14 + i16;
        if (!this.f130410c.isEmpty()) {
            i18 = i18 + 1 + zm2.i.g(i16);
        }
        this.f130411d = i16;
        int size = this.f130408a.size() + i18;
        this.f130413f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return g.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        g g13 = g.g();
        g13.i(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        for (int i13 = 0; i13 < this.f130409b.size(); i13++) {
            iVar.I(1, (zm2.c) this.f130409b.get(i13));
        }
        if (this.f130410c.size() > 0) {
            iVar.P(42);
            iVar.P(this.f130411d);
        }
        for (int i14 = 0; i14 < this.f130410c.size(); i14++) {
            iVar.G(((Integer) this.f130410c.get(i14)).intValue());
        }
        iVar.L(this.f130408a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f130412e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f130412e = (byte) 1;
        return true;
    }

    public k(zm2.h hVar, zm2.k kVar) {
        this.f130411d = -1;
        this.f130412e = (byte) -1;
        this.f130413f = -1;
        this.f130409b = Collections.emptyList();
        this.f130410c = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 10) {
                            if ((i13 & 1) != 1) {
                                this.f130409b = new ArrayList();
                                i13 |= 1;
                            }
                            this.f130409b.add(hVar.f(j.f130393n, kVar));
                        } else if (o13 == 40) {
                            if ((i13 & 2) != 2) {
                                this.f130410c = new ArrayList();
                                i13 |= 2;
                            }
                            this.f130410c.add(Integer.valueOf(hVar.j()));
                        } else if (o13 != 42) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            int c13 = hVar.c(hVar.j());
                            if ((i13 & 2) != 2 && hVar.a() > 0) {
                                this.f130410c = new ArrayList();
                                i13 |= 2;
                            }
                            while (hVar.a() > 0) {
                                this.f130410c.add(Integer.valueOf(hVar.j()));
                            }
                            hVar.b(c13);
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
                if ((i13 & 1) == 1) {
                    this.f130409b = Collections.unmodifiableList(this.f130409b);
                }
                if ((i13 & 2) == 2) {
                    this.f130410c = Collections.unmodifiableList(this.f130410c);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f130408a = fVar.d();
                    throw th4;
                }
                this.f130408a = fVar.d();
                throw th3;
            }
        }
        if ((i13 & 1) == 1) {
            this.f130409b = Collections.unmodifiableList(this.f130409b);
        }
        if ((i13 & 2) == 2) {
            this.f130410c = Collections.unmodifiableList(this.f130410c);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f130408a = fVar.d();
            throw th5;
        }
        this.f130408a = fVar.d();
    }

    public k(o oVar) {
        this.f130411d = -1;
        this.f130412e = (byte) -1;
        this.f130413f = -1;
        this.f130408a = oVar.f142242a;
    }
}
