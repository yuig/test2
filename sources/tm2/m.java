package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class m extends zm2.q {

    /* renamed from: i, reason: collision with root package name */
    public static final m f118386i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f118387j = new a(4);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118388b;

    /* renamed from: c, reason: collision with root package name */
    public int f118389c;

    /* renamed from: d, reason: collision with root package name */
    public int f118390d;

    /* renamed from: e, reason: collision with root package name */
    public List f118391e;

    /* renamed from: f, reason: collision with root package name */
    public List f118392f;

    /* renamed from: g, reason: collision with root package name */
    public byte f118393g;

    /* renamed from: h, reason: collision with root package name */
    public int f118394h;

    static {
        m mVar = new m();
        f118386i = mVar;
        mVar.f118390d = 6;
        mVar.f118391e = Collections.emptyList();
        mVar.f118392f = Collections.emptyList();
    }

    public m(zm2.p pVar) {
        super(pVar);
        this.f118393g = (byte) -1;
        this.f118394h = -1;
        this.f118388b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118394h;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118389c & 1) == 1 ? zm2.i.f(1, this.f118390d) : 0;
        for (int i14 = 0; i14 < this.f118391e.size(); i14++) {
            f13 += zm2.i.i(2, (zm2.c) this.f118391e.get(i14));
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f118392f.size(); i16++) {
            i15 += zm2.i.g(((Integer) this.f118392f.get(i16)).intValue());
        }
        int size = this.f118388b.size() + i() + (this.f118392f.size() * 2) + f13 + i15;
        this.f118394h = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return l.i();
    }

    @Override // zm2.c
    public final zm2.b c() {
        l i13 = l.i();
        i13.k(this);
        return i13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118389c & 1) == 1) {
            iVar.F(1, this.f118390d);
        }
        for (int i13 = 0; i13 < this.f118391e.size(); i13++) {
            iVar.I(2, (zm2.c) this.f118391e.get(i13));
        }
        for (int i14 = 0; i14 < this.f118392f.size(); i14++) {
            iVar.F(31, ((Integer) this.f118392f.get(i14)).intValue());
        }
        m13.f(19000, iVar);
        iVar.L(this.f118388b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118386i;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118393g;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118391e.size(); i13++) {
            if (!((a1) this.f118391e.get(i13)).isInitialized()) {
                this.f118393g = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f118393g = (byte) 1;
            return true;
        }
        this.f118393g = (byte) 0;
        return false;
    }

    public m() {
        this.f118393g = (byte) -1;
        this.f118394h = -1;
        this.f118388b = zm2.g.f142207a;
    }

    public m(zm2.h hVar, zm2.k kVar) {
        this.f118393g = (byte) -1;
        this.f118394h = -1;
        this.f118390d = 6;
        this.f118391e = Collections.emptyList();
        this.f118392f = Collections.emptyList();
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
                            this.f118389c |= 1;
                            this.f118390d = hVar.j();
                        } else if (o13 == 18) {
                            if ((i13 & 2) != 2) {
                                this.f118391e = new ArrayList();
                                i13 |= 2;
                            }
                            this.f118391e.add(hVar.f(a1.f118164m, kVar));
                        } else if (o13 == 248) {
                            if ((i13 & 4) != 4) {
                                this.f118392f = new ArrayList();
                                i13 |= 4;
                            }
                            this.f118392f.add(Integer.valueOf(hVar.j()));
                        } else if (o13 != 250) {
                            if (!n(hVar, u13, kVar, o13)) {
                            }
                        } else {
                            int c13 = hVar.c(hVar.j());
                            if ((i13 & 4) != 4 && hVar.a() > 0) {
                                this.f118392f = new ArrayList();
                                i13 |= 4;
                            }
                            while (hVar.a() > 0) {
                                this.f118392f.add(Integer.valueOf(hVar.j()));
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
                if ((i13 & 2) == 2) {
                    this.f118391e = Collections.unmodifiableList(this.f118391e);
                }
                if ((i13 & 4) == 4) {
                    this.f118392f = Collections.unmodifiableList(this.f118392f);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118388b = fVar.d();
                    throw th4;
                }
                this.f118388b = fVar.d();
                l();
                throw th3;
            }
        }
        if ((i13 & 2) == 2) {
            this.f118391e = Collections.unmodifiableList(this.f118391e);
        }
        if ((i13 & 4) == 4) {
            this.f118392f = Collections.unmodifiableList(this.f118392f);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118388b = fVar.d();
            throw th5;
        }
        this.f118388b = fVar.d();
        l();
    }
}
