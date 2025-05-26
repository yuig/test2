package wm2;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import zm2.o;
import zm2.t;
import zm2.z;

/* loaded from: classes2.dex */
public final class j extends t {

    /* renamed from: m, reason: collision with root package name */
    public static final j f130392m;

    /* renamed from: n, reason: collision with root package name */
    public static final tm2.a f130393n = new tm2.a(25);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f130394a;

    /* renamed from: b, reason: collision with root package name */
    public int f130395b;

    /* renamed from: c, reason: collision with root package name */
    public int f130396c;

    /* renamed from: d, reason: collision with root package name */
    public int f130397d;

    /* renamed from: e, reason: collision with root package name */
    public Object f130398e;

    /* renamed from: f, reason: collision with root package name */
    public i f130399f;

    /* renamed from: g, reason: collision with root package name */
    public List f130400g;

    /* renamed from: h, reason: collision with root package name */
    public int f130401h;

    /* renamed from: i, reason: collision with root package name */
    public List f130402i;

    /* renamed from: j, reason: collision with root package name */
    public int f130403j;

    /* renamed from: k, reason: collision with root package name */
    public byte f130404k;

    /* renamed from: l, reason: collision with root package name */
    public int f130405l;

    static {
        j jVar = new j();
        f130392m = jVar;
        jVar.f130396c = 1;
        jVar.f130397d = 0;
        jVar.f130398e = "";
        jVar.f130399f = i.NONE;
        jVar.f130400g = Collections.emptyList();
        jVar.f130402i = Collections.emptyList();
    }

    public j() {
        this.f130401h = -1;
        this.f130403j = -1;
        this.f130404k = (byte) -1;
        this.f130405l = -1;
        this.f130394a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        zm2.g gVar;
        int i13 = this.f130405l;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f130395b & 1) == 1 ? zm2.i.f(1, this.f130396c) : 0;
        if ((this.f130395b & 2) == 2) {
            f13 += zm2.i.f(2, this.f130397d);
        }
        if ((this.f130395b & 8) == 8) {
            f13 += zm2.i.d(3, this.f130399f.getNumber());
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f130400g.size(); i15++) {
            i14 += zm2.i.g(((Integer) this.f130400g.get(i15)).intValue());
        }
        int i16 = f13 + i14;
        if (!this.f130400g.isEmpty()) {
            i16 = i16 + 1 + zm2.i.g(i14);
        }
        this.f130401h = i14;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f130402i.size(); i18++) {
            i17 += zm2.i.g(((Integer) this.f130402i.get(i18)).intValue());
        }
        int i19 = i16 + i17;
        if (!this.f130402i.isEmpty()) {
            i19 = i19 + 1 + zm2.i.g(i17);
        }
        this.f130403j = i17;
        if ((this.f130395b & 4) == 4) {
            Object obj = this.f130398e;
            if (obj instanceof String) {
                try {
                    gVar = new z(((String) obj).getBytes("UTF-8"));
                    this.f130398e = gVar;
                } catch (UnsupportedEncodingException e13) {
                    throw new RuntimeException("UTF-8 not supported?", e13);
                }
            } else {
                gVar = (zm2.g) obj;
            }
            i19 += zm2.i.b(gVar) + zm2.i.q(6);
        }
        int size = this.f130394a.size() + i19;
        this.f130405l = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return h.g();
    }

    @Override // zm2.c
    public final zm2.b c() {
        h g13 = h.g();
        g13.i(this);
        return g13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        zm2.g gVar;
        a();
        if ((this.f130395b & 1) == 1) {
            iVar.F(1, this.f130396c);
        }
        if ((this.f130395b & 2) == 2) {
            iVar.F(2, this.f130397d);
        }
        if ((this.f130395b & 8) == 8) {
            iVar.A(3, this.f130399f.getNumber());
        }
        if (this.f130400g.size() > 0) {
            iVar.P(34);
            iVar.P(this.f130401h);
        }
        for (int i13 = 0; i13 < this.f130400g.size(); i13++) {
            iVar.G(((Integer) this.f130400g.get(i13)).intValue());
        }
        if (this.f130402i.size() > 0) {
            iVar.P(42);
            iVar.P(this.f130403j);
        }
        for (int i14 = 0; i14 < this.f130402i.size(); i14++) {
            iVar.G(((Integer) this.f130402i.get(i14)).intValue());
        }
        if ((this.f130395b & 4) == 4) {
            Object obj = this.f130398e;
            if (obj instanceof String) {
                try {
                    gVar = new z(((String) obj).getBytes("UTF-8"));
                    this.f130398e = gVar;
                } catch (UnsupportedEncodingException e13) {
                    throw new RuntimeException("UTF-8 not supported?", e13);
                }
            } else {
                gVar = (zm2.g) obj;
            }
            iVar.X(6, 2);
            iVar.x(gVar);
        }
        iVar.L(this.f130394a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f130404k;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f130404k = (byte) 1;
        return true;
    }

    public j(zm2.h hVar, zm2.k kVar) {
        this.f130401h = -1;
        this.f130403j = -1;
        this.f130404k = (byte) -1;
        this.f130405l = -1;
        this.f130396c = 1;
        boolean z13 = false;
        this.f130397d = 0;
        this.f130398e = "";
        this.f130399f = i.NONE;
        this.f130400g = Collections.emptyList();
        this.f130402i = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        int i13 = 0;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        if (o13 == 8) {
                            this.f130395b |= 1;
                            this.f130396c = hVar.j();
                        } else if (o13 == 16) {
                            this.f130395b |= 2;
                            this.f130397d = hVar.j();
                        } else if (o13 == 24) {
                            int j13 = hVar.j();
                            i valueOf = i.valueOf(j13);
                            if (valueOf == null) {
                                u13.P(o13);
                                u13.P(j13);
                            } else {
                                this.f130395b |= 8;
                                this.f130399f = valueOf;
                            }
                        } else if (o13 == 32) {
                            if ((i13 & 16) != 16) {
                                this.f130400g = new ArrayList();
                                i13 |= 16;
                            }
                            this.f130400g.add(Integer.valueOf(hVar.j()));
                        } else if (o13 == 34) {
                            int c13 = hVar.c(hVar.j());
                            if ((i13 & 16) != 16 && hVar.a() > 0) {
                                this.f130400g = new ArrayList();
                                i13 |= 16;
                            }
                            while (hVar.a() > 0) {
                                this.f130400g.add(Integer.valueOf(hVar.j()));
                            }
                            hVar.b(c13);
                        } else if (o13 == 40) {
                            if ((i13 & 32) != 32) {
                                this.f130402i = new ArrayList();
                                i13 |= 32;
                            }
                            this.f130402i.add(Integer.valueOf(hVar.j()));
                        } else if (o13 == 42) {
                            int c14 = hVar.c(hVar.j());
                            if ((i13 & 32) != 32 && hVar.a() > 0) {
                                this.f130402i = new ArrayList();
                                i13 |= 32;
                            }
                            while (hVar.a() > 0) {
                                this.f130402i.add(Integer.valueOf(hVar.j()));
                            }
                            hVar.b(c14);
                        } else if (o13 != 50) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            z d2 = hVar.d();
                            this.f130395b |= 4;
                            this.f130398e = d2;
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
                    this.f130400g = Collections.unmodifiableList(this.f130400g);
                }
                if ((i13 & 32) == 32) {
                    this.f130402i = Collections.unmodifiableList(this.f130402i);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f130394a = fVar.d();
                    throw th4;
                }
                this.f130394a = fVar.d();
                throw th3;
            }
        }
        if ((i13 & 16) == 16) {
            this.f130400g = Collections.unmodifiableList(this.f130400g);
        }
        if ((i13 & 32) == 32) {
            this.f130402i = Collections.unmodifiableList(this.f130402i);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f130394a = fVar.d();
            throw th5;
        }
        this.f130394a = fVar.d();
    }

    public j(o oVar) {
        this.f130401h = -1;
        this.f130403j = -1;
        this.f130404k = (byte) -1;
        this.f130405l = -1;
        this.f130394a = oVar.f142242a;
    }
}
