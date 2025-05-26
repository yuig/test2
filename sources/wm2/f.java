package wm2;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class f extends t {

    /* renamed from: j, reason: collision with root package name */
    public static final f f130371j;

    /* renamed from: k, reason: collision with root package name */
    public static final tm2.a f130372k = new tm2.a(23);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f130373a;

    /* renamed from: b, reason: collision with root package name */
    public int f130374b;

    /* renamed from: c, reason: collision with root package name */
    public b f130375c;

    /* renamed from: d, reason: collision with root package name */
    public d f130376d;

    /* renamed from: e, reason: collision with root package name */
    public d f130377e;

    /* renamed from: f, reason: collision with root package name */
    public d f130378f;

    /* renamed from: g, reason: collision with root package name */
    public d f130379g;

    /* renamed from: h, reason: collision with root package name */
    public byte f130380h;

    /* renamed from: i, reason: collision with root package name */
    public int f130381i;

    static {
        f fVar = new f();
        f130371j = fVar;
        fVar.f130375c = b.f130346g;
        d dVar = d.f130357g;
        fVar.f130376d = dVar;
        fVar.f130377e = dVar;
        fVar.f130378f = dVar;
        fVar.f130379g = dVar;
    }

    public f() {
        this.f130380h = (byte) -1;
        this.f130381i = -1;
        this.f130373a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f130381i;
        if (i13 != -1) {
            return i13;
        }
        int i14 = (this.f130374b & 1) == 1 ? zm2.i.i(1, this.f130375c) : 0;
        if ((this.f130374b & 2) == 2) {
            i14 += zm2.i.i(2, this.f130376d);
        }
        if ((this.f130374b & 4) == 4) {
            i14 += zm2.i.i(3, this.f130377e);
        }
        if ((this.f130374b & 8) == 8) {
            i14 += zm2.i.i(4, this.f130378f);
        }
        if ((this.f130374b & 16) == 16) {
            i14 += zm2.i.i(5, this.f130379g);
        }
        int size = this.f130373a.size() + i14;
        this.f130381i = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return e.h();
    }

    @Override // zm2.c
    public final zm2.b c() {
        e h10 = e.h();
        h10.j(this);
        return h10;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f130374b & 1) == 1) {
            iVar.I(1, this.f130375c);
        }
        if ((this.f130374b & 2) == 2) {
            iVar.I(2, this.f130376d);
        }
        if ((this.f130374b & 4) == 4) {
            iVar.I(3, this.f130377e);
        }
        if ((this.f130374b & 8) == 8) {
            iVar.I(4, this.f130378f);
        }
        if ((this.f130374b & 16) == 16) {
            iVar.I(5, this.f130379g);
        }
        iVar.L(this.f130373a);
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f130380h;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        this.f130380h = (byte) 1;
        return true;
    }

    public f(zm2.h hVar, zm2.k kVar) {
        this.f130380h = (byte) -1;
        this.f130381i = -1;
        this.f130375c = b.f130346g;
        d dVar = d.f130357g;
        this.f130376d = dVar;
        this.f130377e = dVar;
        this.f130378f = dVar;
        this.f130379g = dVar;
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    if (o13 != 0) {
                        c cVar = null;
                        a aVar = null;
                        c cVar2 = null;
                        c cVar3 = null;
                        c cVar4 = null;
                        if (o13 == 10) {
                            if ((this.f130374b & 1) == 1) {
                                b bVar = this.f130375c;
                                bVar.getClass();
                                aVar = b.h(bVar);
                            }
                            b bVar2 = (b) hVar.f(b.f130347h, kVar);
                            this.f130375c = bVar2;
                            if (aVar != null) {
                                aVar.i(bVar2);
                                this.f130375c = aVar.h();
                            }
                            this.f130374b |= 1;
                        } else if (o13 == 18) {
                            if ((this.f130374b & 2) == 2) {
                                d dVar2 = this.f130376d;
                                dVar2.getClass();
                                cVar2 = d.h(dVar2);
                            }
                            d dVar3 = (d) hVar.f(d.f130358h, kVar);
                            this.f130376d = dVar3;
                            if (cVar2 != null) {
                                cVar2.h(dVar3);
                                this.f130376d = cVar2.g();
                            }
                            this.f130374b |= 2;
                        } else if (o13 == 26) {
                            if ((this.f130374b & 4) == 4) {
                                d dVar4 = this.f130377e;
                                dVar4.getClass();
                                cVar3 = d.h(dVar4);
                            }
                            d dVar5 = (d) hVar.f(d.f130358h, kVar);
                            this.f130377e = dVar5;
                            if (cVar3 != null) {
                                cVar3.h(dVar5);
                                this.f130377e = cVar3.g();
                            }
                            this.f130374b |= 4;
                        } else if (o13 == 34) {
                            if ((this.f130374b & 8) == 8) {
                                d dVar6 = this.f130378f;
                                dVar6.getClass();
                                cVar4 = d.h(dVar6);
                            }
                            d dVar7 = (d) hVar.f(d.f130358h, kVar);
                            this.f130378f = dVar7;
                            if (cVar4 != null) {
                                cVar4.h(dVar7);
                                this.f130378f = cVar4.g();
                            }
                            this.f130374b |= 8;
                        } else if (o13 != 42) {
                            if (!hVar.r(o13, u13)) {
                            }
                        } else {
                            if ((this.f130374b & 16) == 16) {
                                d dVar8 = this.f130379g;
                                dVar8.getClass();
                                cVar = d.h(dVar8);
                            }
                            d dVar9 = (d) hVar.f(d.f130358h, kVar);
                            this.f130379g = dVar9;
                            if (cVar != null) {
                                cVar.h(dVar9);
                                this.f130379g = cVar.g();
                            }
                            this.f130374b |= 16;
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
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f130373a = fVar.d();
                    throw th4;
                }
                this.f130373a = fVar.d();
                throw th3;
            }
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f130373a = fVar.d();
            throw th5;
        }
        this.f130373a = fVar.d();
    }

    public f(o oVar) {
        this.f130380h = (byte) -1;
        this.f130381i = -1;
        this.f130373a = oVar.f142242a;
    }
}
