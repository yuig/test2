package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class e0 extends zm2.q {

    /* renamed from: k, reason: collision with root package name */
    public static final e0 f118221k;

    /* renamed from: l, reason: collision with root package name */
    public static final a f118222l = new a(8);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118223b;

    /* renamed from: c, reason: collision with root package name */
    public int f118224c;

    /* renamed from: d, reason: collision with root package name */
    public List f118225d;

    /* renamed from: e, reason: collision with root package name */
    public List f118226e;

    /* renamed from: f, reason: collision with root package name */
    public List f118227f;

    /* renamed from: g, reason: collision with root package name */
    public y0 f118228g;

    /* renamed from: h, reason: collision with root package name */
    public f1 f118229h;

    /* renamed from: i, reason: collision with root package name */
    public byte f118230i;

    /* renamed from: j, reason: collision with root package name */
    public int f118231j;

    static {
        e0 e0Var = new e0();
        f118221k = e0Var;
        e0Var.f118225d = Collections.emptyList();
        e0Var.f118226e = Collections.emptyList();
        e0Var.f118227f = Collections.emptyList();
        e0Var.f118228g = y0.f118555g;
        e0Var.f118229h = f1.f118257e;
    }

    public e0(zm2.p pVar) {
        super(pVar);
        this.f118230i = (byte) -1;
        this.f118231j = -1;
        this.f118223b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118231j;
        if (i13 != -1) {
            return i13;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f118225d.size(); i15++) {
            i14 += zm2.i.i(3, (zm2.c) this.f118225d.get(i15));
        }
        for (int i16 = 0; i16 < this.f118226e.size(); i16++) {
            i14 += zm2.i.i(4, (zm2.c) this.f118226e.get(i16));
        }
        for (int i17 = 0; i17 < this.f118227f.size(); i17++) {
            i14 += zm2.i.i(5, (zm2.c) this.f118227f.get(i17));
        }
        if ((this.f118224c & 1) == 1) {
            i14 += zm2.i.i(30, this.f118228g);
        }
        if ((this.f118224c & 2) == 2) {
            i14 += zm2.i.i(32, this.f118229h);
        }
        int size = this.f118223b.size() + i() + i14;
        this.f118231j = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        d0 k13;
        k13 = d0.k();
        return k13;
    }

    @Override // zm2.c
    public final zm2.b c() {
        d0 k13;
        k13 = d0.k();
        k13.l(this);
        return k13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        for (int i13 = 0; i13 < this.f118225d.size(); i13++) {
            iVar.I(3, (zm2.c) this.f118225d.get(i13));
        }
        for (int i14 = 0; i14 < this.f118226e.size(); i14++) {
            iVar.I(4, (zm2.c) this.f118226e.get(i14));
        }
        for (int i15 = 0; i15 < this.f118227f.size(); i15++) {
            iVar.I(5, (zm2.c) this.f118227f.get(i15));
        }
        if ((this.f118224c & 1) == 1) {
            iVar.I(30, this.f118228g);
        }
        if ((this.f118224c & 2) == 2) {
            iVar.I(32, this.f118229h);
        }
        m13.f(200, iVar);
        iVar.L(this.f118223b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118221k;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118230i;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118225d.size(); i13++) {
            if (!((a0) this.f118225d.get(i13)).isInitialized()) {
                this.f118230i = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f118226e.size(); i14++) {
            if (!p(i14).isInitialized()) {
                this.f118230i = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < this.f118227f.size(); i15++) {
            if (!q(i15).isInitialized()) {
                this.f118230i = (byte) 0;
                return false;
            }
        }
        if ((this.f118224c & 1) == 1 && !this.f118228g.isInitialized()) {
            this.f118230i = (byte) 0;
            return false;
        }
        if (h()) {
            this.f118230i = (byte) 1;
            return true;
        }
        this.f118230i = (byte) 0;
        return false;
    }

    public final i0 p(int i13) {
        return (i0) this.f118226e.get(i13);
    }

    public final u0 q(int i13) {
        return (u0) this.f118227f.get(i13);
    }

    public final d0 r() {
        d0 k13;
        k13 = d0.k();
        k13.l(this);
        return k13;
    }

    public e0() {
        this.f118230i = (byte) -1;
        this.f118231j = -1;
        this.f118223b = zm2.g.f142207a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public e0(zm2.h hVar, zm2.k kVar) {
        this.f118230i = (byte) -1;
        this.f118231j = -1;
        this.f118225d = Collections.emptyList();
        this.f118226e = Collections.emptyList();
        this.f118227f = Collections.emptyList();
        this.f118228g = y0.f118555g;
        this.f118229h = f1.f118257e;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 26) {
                            int i13 = (c13 == true ? 1 : 0) & 1;
                            c13 = c13;
                            if (i13 != 1) {
                                this.f118225d = new ArrayList();
                                c13 = (c13 == true ? 1 : 0) | 1;
                            }
                            this.f118225d.add(hVar.f(a0.f118143v, kVar));
                        } else if (o13 == 34) {
                            int i14 = (c13 == true ? 1 : 0) & 2;
                            c13 = c13;
                            if (i14 != 2) {
                                this.f118226e = new ArrayList();
                                c13 = (c13 == true ? 1 : 0) | 2;
                            }
                            this.f118226e.add(hVar.f(i0.f118323v, kVar));
                        } else if (o13 != 42) {
                            n nVar = null;
                            b bVar = null;
                            if (o13 == 242) {
                                if ((this.f118224c & 1) == 1) {
                                    y0 y0Var = this.f118228g;
                                    y0Var.getClass();
                                    bVar = y0.i(y0Var);
                                }
                                y0 y0Var2 = (y0) hVar.f(y0.f118556h, kVar);
                                this.f118228g = y0Var2;
                                if (bVar != null) {
                                    bVar.k(y0Var2);
                                    this.f118228g = bVar.i();
                                }
                                this.f118224c |= 1;
                            } else if (o13 != 258) {
                                if (!n(hVar, u13, kVar, o13)) {
                                }
                            } else {
                                if ((this.f118224c & 2) == 2) {
                                    f1 f1Var = this.f118229h;
                                    f1Var.getClass();
                                    nVar = new n(2);
                                    nVar.o(f1Var);
                                }
                                f1 f1Var2 = (f1) hVar.f(f1.f118258f, kVar);
                                this.f118229h = f1Var2;
                                if (nVar != null) {
                                    nVar.o(f1Var2);
                                    this.f118229h = nVar.k();
                                }
                                this.f118224c |= 2;
                            }
                        } else {
                            int i15 = (c13 == true ? 1 : 0) & 4;
                            c13 = c13;
                            if (i15 != 4) {
                                this.f118227f = new ArrayList();
                                c13 = (c13 == true ? 1 : 0) | 4;
                            }
                            this.f118227f.add(hVar.f(u0.f118493p, kVar));
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
                if (((c13 == true ? 1 : 0) & 1) == 1) {
                    this.f118225d = Collections.unmodifiableList(this.f118225d);
                }
                if (((c13 == true ? 1 : 0) & 2) == 2) {
                    this.f118226e = Collections.unmodifiableList(this.f118226e);
                }
                if (((c13 == true ? 1 : 0) & 4) == 4) {
                    this.f118227f = Collections.unmodifiableList(this.f118227f);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118223b = fVar.d();
                    throw th4;
                }
                this.f118223b = fVar.d();
                l();
                throw th3;
            }
        }
        if (((c13 == true ? 1 : 0) & 1) == 1) {
            this.f118225d = Collections.unmodifiableList(this.f118225d);
        }
        if (((c13 == true ? 1 : 0) & 2) == 2) {
            this.f118226e = Collections.unmodifiableList(this.f118226e);
        }
        if (((c13 == true ? 1 : 0) & 4) == 4) {
            this.f118227f = Collections.unmodifiableList(this.f118227f);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118223b = fVar.d();
            throw th5;
        }
        this.f118223b = fVar.d();
        l();
    }
}
