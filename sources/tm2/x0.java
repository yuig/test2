package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class x0 extends zm2.q {

    /* renamed from: m, reason: collision with root package name */
    public static final x0 f118529m;

    /* renamed from: n, reason: collision with root package name */
    public static final a f118530n = new a(16);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118531b;

    /* renamed from: c, reason: collision with root package name */
    public int f118532c;

    /* renamed from: d, reason: collision with root package name */
    public int f118533d;

    /* renamed from: e, reason: collision with root package name */
    public int f118534e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118535f;

    /* renamed from: g, reason: collision with root package name */
    public w0 f118536g;

    /* renamed from: h, reason: collision with root package name */
    public List f118537h;

    /* renamed from: i, reason: collision with root package name */
    public List f118538i;

    /* renamed from: j, reason: collision with root package name */
    public int f118539j;

    /* renamed from: k, reason: collision with root package name */
    public byte f118540k;

    /* renamed from: l, reason: collision with root package name */
    public int f118541l;

    static {
        x0 x0Var = new x0();
        f118529m = x0Var;
        x0Var.f118533d = 0;
        x0Var.f118534e = 0;
        x0Var.f118535f = false;
        x0Var.f118536g = w0.INV;
        x0Var.f118537h = Collections.emptyList();
        x0Var.f118538i = Collections.emptyList();
    }

    public x0(zm2.p pVar) {
        super(pVar);
        this.f118539j = -1;
        this.f118540k = (byte) -1;
        this.f118541l = -1;
        this.f118531b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118541l;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118532c & 1) == 1 ? zm2.i.f(1, this.f118533d) : 0;
        if ((this.f118532c & 2) == 2) {
            f13 += zm2.i.f(2, this.f118534e);
        }
        if ((this.f118532c & 4) == 4) {
            f13 += zm2.i.q(3) + 1;
        }
        if ((this.f118532c & 8) == 8) {
            f13 += zm2.i.d(4, this.f118536g.getNumber());
        }
        for (int i14 = 0; i14 < this.f118537h.size(); i14++) {
            f13 += zm2.i.i(5, (zm2.c) this.f118537h.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f118538i.size(); i16++) {
            i15 += zm2.i.g(((Integer) this.f118538i.get(i16)).intValue());
        }
        int i17 = f13 + i15;
        if (!this.f118538i.isEmpty()) {
            i17 = i17 + 1 + zm2.i.g(i15);
        }
        this.f118539j = i15;
        int size = this.f118531b.size() + i() + i17;
        this.f118541l = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return v0.i();
    }

    @Override // zm2.c
    public final zm2.b c() {
        v0 i13 = v0.i();
        i13.k(this);
        return i13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c cVar = new m7.c(this);
        if ((this.f118532c & 1) == 1) {
            iVar.F(1, this.f118533d);
        }
        if ((this.f118532c & 2) == 2) {
            iVar.F(2, this.f118534e);
        }
        if ((this.f118532c & 4) == 4) {
            boolean z13 = this.f118535f;
            iVar.X(3, 0);
            iVar.K(z13 ? 1 : 0);
        }
        if ((this.f118532c & 8) == 8) {
            iVar.A(4, this.f118536g.getNumber());
        }
        for (int i13 = 0; i13 < this.f118537h.size(); i13++) {
            iVar.I(5, (zm2.c) this.f118537h.get(i13));
        }
        if (this.f118538i.size() > 0) {
            iVar.P(50);
            iVar.P(this.f118539j);
        }
        for (int i14 = 0; i14 < this.f118538i.size(); i14++) {
            iVar.G(((Integer) this.f118538i.get(i14)).intValue());
        }
        cVar.f(1000, iVar);
        iVar.L(this.f118531b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118529m;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118540k;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        int i13 = this.f118532c;
        if ((i13 & 1) != 1) {
            this.f118540k = (byte) 0;
            return false;
        }
        if ((i13 & 2) != 2) {
            this.f118540k = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f118537h.size(); i14++) {
            if (!((s0) this.f118537h.get(i14)).isInitialized()) {
                this.f118540k = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f118540k = (byte) 1;
            return true;
        }
        this.f118540k = (byte) 0;
        return false;
    }

    public x0() {
        this.f118539j = -1;
        this.f118540k = (byte) -1;
        this.f118541l = -1;
        this.f118531b = zm2.g.f142207a;
    }

    public x0(zm2.h hVar, zm2.k kVar) {
        this.f118539j = -1;
        this.f118540k = (byte) -1;
        this.f118541l = -1;
        this.f118533d = 0;
        this.f118534e = 0;
        this.f118535f = false;
        this.f118536g = w0.INV;
        this.f118537h = Collections.emptyList();
        this.f118538i = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118532c |= 1;
                            this.f118533d = hVar.j();
                        } else if (o13 == 16) {
                            this.f118532c |= 2;
                            this.f118534e = hVar.j();
                        } else if (o13 == 24) {
                            this.f118532c |= 4;
                            this.f118535f = hVar.k() != 0;
                        } else if (o13 == 32) {
                            int j13 = hVar.j();
                            w0 valueOf = w0.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f118532c |= 8;
                                this.f118536g = valueOf;
                            }
                        } else if (o13 == 42) {
                            if ((i13 & 16) != 16) {
                                this.f118537h = new ArrayList();
                                i13 |= 16;
                            }
                            this.f118537h.add(hVar.f(s0.f118451u, kVar));
                        } else if (o13 == 48) {
                            if ((i13 & 32) != 32) {
                                this.f118538i = new ArrayList();
                                i13 |= 32;
                            }
                            this.f118538i.add(Integer.valueOf(hVar.j()));
                        } else if (o13 != 50) {
                            if (!n(hVar, u13, kVar, o13)) {
                            }
                        } else {
                            int c13 = hVar.c(hVar.j());
                            if ((i13 & 32) != 32 && hVar.a() > 0) {
                                this.f118538i = new ArrayList();
                                i13 |= 32;
                            }
                            while (hVar.a() > 0) {
                                this.f118538i.add(Integer.valueOf(hVar.j()));
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
                if ((i13 & 16) == 16) {
                    this.f118537h = Collections.unmodifiableList(this.f118537h);
                }
                if ((i13 & 32) == 32) {
                    this.f118538i = Collections.unmodifiableList(this.f118538i);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118531b = fVar.d();
                    throw th4;
                }
                this.f118531b = fVar.d();
                l();
                throw th3;
            }
        }
        if ((i13 & 16) == 16) {
            this.f118537h = Collections.unmodifiableList(this.f118537h);
        }
        if ((i13 & 32) == 32) {
            this.f118538i = Collections.unmodifiableList(this.f118538i);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118531b = fVar.d();
            throw th5;
        }
        this.f118531b = fVar.d();
        l();
    }
}
