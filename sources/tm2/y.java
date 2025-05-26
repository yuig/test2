package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes4.dex */
public final class y extends zm2.t {

    /* renamed from: l, reason: collision with root package name */
    public static final y f118542l;

    /* renamed from: m, reason: collision with root package name */
    public static final p f118543m = new p(1);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118544a;

    /* renamed from: b, reason: collision with root package name */
    public int f118545b;

    /* renamed from: c, reason: collision with root package name */
    public int f118546c;

    /* renamed from: d, reason: collision with root package name */
    public int f118547d;

    /* renamed from: e, reason: collision with root package name */
    public x f118548e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f118549f;

    /* renamed from: g, reason: collision with root package name */
    public int f118550g;

    /* renamed from: h, reason: collision with root package name */
    public List f118551h;

    /* renamed from: i, reason: collision with root package name */
    public List f118552i;

    /* renamed from: j, reason: collision with root package name */
    public byte f118553j;

    /* renamed from: k, reason: collision with root package name */
    public int f118554k;

    static {
        y yVar = new y();
        f118542l = yVar;
        yVar.f118546c = 0;
        yVar.f118547d = 0;
        yVar.f118548e = x.TRUE;
        yVar.f118549f = s0.f118450t;
        yVar.f118550g = 0;
        yVar.f118551h = Collections.emptyList();
        yVar.f118552i = Collections.emptyList();
    }

    public y() {
        this.f118553j = (byte) -1;
        this.f118554k = -1;
        this.f118544a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118554k;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118545b & 1) == 1 ? zm2.i.f(1, this.f118546c) : 0;
        if ((this.f118545b & 2) == 2) {
            f13 += zm2.i.f(2, this.f118547d);
        }
        if ((this.f118545b & 4) == 4) {
            f13 += zm2.i.d(3, this.f118548e.getNumber());
        }
        if ((this.f118545b & 8) == 8) {
            f13 += zm2.i.i(4, this.f118549f);
        }
        if ((this.f118545b & 16) == 16) {
            f13 += zm2.i.f(5, this.f118550g);
        }
        for (int i14 = 0; i14 < this.f118551h.size(); i14++) {
            f13 += zm2.i.i(6, (zm2.c) this.f118551h.get(i14));
        }
        for (int i15 = 0; i15 < this.f118552i.size(); i15++) {
            f13 += zm2.i.i(7, (zm2.c) this.f118552i.get(i15));
        }
        int size = this.f118544a.size() + f13;
        this.f118554k = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return w.h();
    }

    @Override // zm2.c
    public final zm2.b c() {
        w h10 = w.h();
        h10.i(this);
        return h10;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118545b & 1) == 1) {
            iVar.F(1, this.f118546c);
        }
        if ((this.f118545b & 2) == 2) {
            iVar.F(2, this.f118547d);
        }
        if ((this.f118545b & 4) == 4) {
            iVar.A(3, this.f118548e.getNumber());
        }
        if ((this.f118545b & 8) == 8) {
            iVar.I(4, this.f118549f);
        }
        if ((this.f118545b & 16) == 16) {
            iVar.F(5, this.f118550g);
        }
        for (int i13 = 0; i13 < this.f118551h.size(); i13++) {
            iVar.I(6, (zm2.c) this.f118551h.get(i13));
        }
        for (int i14 = 0; i14 < this.f118552i.size(); i14++) {
            iVar.I(7, (zm2.c) this.f118552i.get(i14));
        }
        iVar.L(this.f118544a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118553j;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118545b & 8) == 8 && !this.f118549f.isInitialized()) {
            this.f118553j = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118551h.size(); i13++) {
            if (!((y) this.f118551h.get(i13)).isInitialized()) {
                this.f118553j = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < this.f118552i.size(); i14++) {
            if (!((y) this.f118552i.get(i14)).isInitialized()) {
                this.f118553j = (byte) 0;
                return false;
            }
        }
        this.f118553j = (byte) 1;
        return true;
    }

    public y(zm2.h hVar, zm2.k kVar) {
        r0 r0Var;
        this.f118553j = (byte) -1;
        this.f118554k = -1;
        boolean z13 = false;
        this.f118546c = 0;
        this.f118547d = 0;
        this.f118548e = x.TRUE;
        this.f118549f = s0.f118450t;
        this.f118550g = 0;
        this.f118551h = Collections.emptyList();
        this.f118552i = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f118545b |= 1;
                            this.f118546c = hVar.j();
                        } else if (o13 == 16) {
                            this.f118545b |= 2;
                            this.f118547d = hVar.j();
                        } else if (o13 == 24) {
                            int j13 = hVar.j();
                            x valueOf = x.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f118545b |= 4;
                                this.f118548e = valueOf;
                            }
                        } else if (o13 == 34) {
                            if ((this.f118545b & 8) == 8) {
                                s0 s0Var = this.f118549f;
                                s0Var.getClass();
                                r0Var = s0.z(s0Var);
                            } else {
                                r0Var = null;
                            }
                            s0 s0Var2 = (s0) hVar.f(s0.f118451u, kVar);
                            this.f118549f = s0Var2;
                            if (r0Var != null) {
                                r0Var.l(s0Var2);
                                this.f118549f = r0Var.k();
                            }
                            this.f118545b |= 8;
                        } else if (o13 != 40) {
                            p pVar = f118543m;
                            if (o13 == 50) {
                                if ((i13 & 32) != 32) {
                                    this.f118551h = new ArrayList();
                                    i13 |= 32;
                                }
                                this.f118551h.add(hVar.f(pVar, kVar));
                            } else if (o13 != 58) {
                                if (!hVar.r(o13, u13)) {
                                }
                            } else {
                                if ((i13 & 64) != 64) {
                                    this.f118552i = new ArrayList();
                                    i13 |= 64;
                                }
                                this.f118552i.add(hVar.f(pVar, kVar));
                            }
                        } else {
                            this.f118545b |= 16;
                            this.f118550g = hVar.j();
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
                if ((i13 & 32) == 32) {
                    this.f118551h = Collections.unmodifiableList(this.f118551h);
                }
                if ((i13 & 64) == 64) {
                    this.f118552i = Collections.unmodifiableList(this.f118552i);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118544a = fVar.d();
                    throw th4;
                }
                this.f118544a = fVar.d();
                throw th3;
            }
        }
        if ((i13 & 32) == 32) {
            this.f118551h = Collections.unmodifiableList(this.f118551h);
        }
        if ((i13 & 64) == 64) {
            this.f118552i = Collections.unmodifiableList(this.f118552i);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118544a = fVar.d();
            throw th5;
        }
        this.f118544a = fVar.d();
    }

    public y(zm2.o oVar) {
        this.f118553j = (byte) -1;
        this.f118554k = -1;
        this.f118544a = oVar.f142242a;
    }
}
