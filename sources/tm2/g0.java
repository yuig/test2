package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class g0 extends zm2.q {

    /* renamed from: j, reason: collision with root package name */
    public static final g0 f118266j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f118267k = new a(9);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118268b;

    /* renamed from: c, reason: collision with root package name */
    public int f118269c;

    /* renamed from: d, reason: collision with root package name */
    public n0 f118270d;

    /* renamed from: e, reason: collision with root package name */
    public m0 f118271e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f118272f;

    /* renamed from: g, reason: collision with root package name */
    public List f118273g;

    /* renamed from: h, reason: collision with root package name */
    public byte f118274h;

    /* renamed from: i, reason: collision with root package name */
    public int f118275i;

    static {
        g0 g0Var = new g0();
        f118266j = g0Var;
        g0Var.f118270d = n0.f118404e;
        g0Var.f118271e = m0.f118395e;
        g0Var.f118272f = e0.f118221k;
        g0Var.f118273g = Collections.emptyList();
    }

    public g0(zm2.p pVar) {
        super(pVar);
        this.f118274h = (byte) -1;
        this.f118275i = -1;
        this.f118268b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118275i;
        if (i13 != -1) {
            return i13;
        }
        int i14 = (this.f118269c & 1) == 1 ? zm2.i.i(1, this.f118270d) : 0;
        if ((this.f118269c & 2) == 2) {
            i14 += zm2.i.i(2, this.f118271e);
        }
        if ((this.f118269c & 4) == 4) {
            i14 += zm2.i.i(3, this.f118272f);
        }
        for (int i15 = 0; i15 < this.f118273g.size(); i15++) {
            i14 += zm2.i.i(4, (zm2.c) this.f118273g.get(i15));
        }
        int size = this.f118268b.size() + i() + i14;
        this.f118275i = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return f0.i();
    }

    @Override // zm2.c
    public final zm2.b c() {
        f0 i13 = f0.i();
        i13.k(this);
        return i13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118269c & 1) == 1) {
            iVar.I(1, this.f118270d);
        }
        if ((this.f118269c & 2) == 2) {
            iVar.I(2, this.f118271e);
        }
        if ((this.f118269c & 4) == 4) {
            iVar.I(3, this.f118272f);
        }
        for (int i13 = 0; i13 < this.f118273g.size(); i13++) {
            iVar.I(4, (zm2.c) this.f118273g.get(i13));
        }
        m13.f(200, iVar);
        iVar.L(this.f118268b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118266j;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118274h;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118269c & 2) == 2 && !this.f118271e.isInitialized()) {
            this.f118274h = (byte) 0;
            return false;
        }
        if ((this.f118269c & 4) == 4 && !this.f118272f.isInitialized()) {
            this.f118274h = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118273g.size(); i13++) {
            if (!((k) this.f118273g.get(i13)).isInitialized()) {
                this.f118274h = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f118274h = (byte) 1;
            return true;
        }
        this.f118274h = (byte) 0;
        return false;
    }

    public g0() {
        this.f118274h = (byte) -1;
        this.f118275i = -1;
        this.f118268b = zm2.g.f142207a;
    }

    public g0(zm2.h hVar, zm2.k kVar) {
        this.f118274h = (byte) -1;
        this.f118275i = -1;
        this.f118270d = n0.f118404e;
        this.f118271e = m0.f118395e;
        this.f118272f = e0.f118221k;
        this.f118273g = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        n nVar = null;
                        n nVar2 = null;
                        if (o13 == 10) {
                            if ((this.f118269c & 1) == 1) {
                                n0 n0Var = this.f118270d;
                                n0Var.getClass();
                                nVar = new n(3);
                                nVar.n(n0Var);
                            }
                            n0 n0Var2 = (n0) hVar.f(n0.f118405f, kVar);
                            this.f118270d = n0Var2;
                            if (nVar != null) {
                                nVar.n(n0Var2);
                                this.f118270d = nVar.j();
                            }
                            this.f118269c |= 1;
                        } else if (o13 == 18) {
                            if ((this.f118269c & 2) == 2) {
                                m0 m0Var = this.f118271e;
                                m0Var.getClass();
                                nVar2 = new n(1);
                                nVar2.m(m0Var);
                            }
                            m0 m0Var2 = (m0) hVar.f(m0.f118396f, kVar);
                            this.f118271e = m0Var2;
                            if (nVar2 != null) {
                                nVar2.m(m0Var2);
                                this.f118271e = nVar2.i();
                            }
                            this.f118269c |= 2;
                        } else if (o13 == 26) {
                            d0 r13 = (this.f118269c & 4) == 4 ? this.f118272f.r() : null;
                            e0 e0Var = (e0) hVar.f(e0.f118222l, kVar);
                            this.f118272f = e0Var;
                            if (r13 != null) {
                                r13.l(e0Var);
                                this.f118272f = r13.j();
                            }
                            this.f118269c |= 4;
                        } else if (o13 != 34) {
                            if (!n(hVar, u13, kVar, o13)) {
                            }
                        } else {
                            int i13 = (c13 == true ? 1 : 0) & '\b';
                            c13 = c13;
                            if (i13 != 8) {
                                this.f118273g = new ArrayList();
                                c13 = '\b';
                            }
                            this.f118273g.add(hVar.f(k.K, kVar));
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
                if (((c13 == true ? 1 : 0) & '\b') == 8) {
                    this.f118273g = Collections.unmodifiableList(this.f118273g);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118268b = fVar.d();
                    throw th4;
                }
                this.f118268b = fVar.d();
                l();
                throw th3;
            }
        }
        if (((c13 == true ? 1 : 0) & '\b') == 8) {
            this.f118273g = Collections.unmodifiableList(this.f118273g);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118268b = fVar.d();
            throw th5;
        }
        this.f118268b = fVar.d();
        l();
    }
}
