package tm2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes2.dex */
public final class h extends zm2.t {

    /* renamed from: g, reason: collision with root package name */
    public static final h f118276g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f118277h = new a(0);

    /* renamed from: a, reason: collision with root package name */
    public final zm2.g f118278a;

    /* renamed from: b, reason: collision with root package name */
    public int f118279b;

    /* renamed from: c, reason: collision with root package name */
    public int f118280c;

    /* renamed from: d, reason: collision with root package name */
    public List f118281d;

    /* renamed from: e, reason: collision with root package name */
    public byte f118282e;

    /* renamed from: f, reason: collision with root package name */
    public int f118283f;

    static {
        h hVar = new h();
        f118276g = hVar;
        hVar.f118280c = 0;
        hVar.f118281d = Collections.emptyList();
    }

    public h() {
        this.f118282e = (byte) -1;
        this.f118283f = -1;
        this.f118278a = zm2.g.f142207a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118283f;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118279b & 1) == 1 ? zm2.i.f(1, this.f118280c) : 0;
        for (int i14 = 0; i14 < this.f118281d.size(); i14++) {
            f13 += zm2.i.i(2, (zm2.c) this.f118281d.get(i14));
        }
        int size = this.f118278a.size() + f13;
        this.f118283f = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        g gVar = new g();
        gVar.f118265d = Collections.emptyList();
        return gVar;
    }

    @Override // zm2.c
    public final zm2.b c() {
        g gVar = new g();
        gVar.f118265d = Collections.emptyList();
        gVar.i(this);
        return gVar;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        if ((this.f118279b & 1) == 1) {
            iVar.F(1, this.f118280c);
        }
        for (int i13 = 0; i13 < this.f118281d.size(); i13++) {
            iVar.I(2, (zm2.c) this.f118281d.get(i13));
        }
        iVar.L(this.f118278a);
    }

    public final g h() {
        g gVar = new g();
        gVar.f118265d = Collections.emptyList();
        gVar.i(this);
        return gVar;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118282e;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118279b & 1) != 1) {
            this.f118282e = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118281d.size(); i13++) {
            if (!((f) this.f118281d.get(i13)).isInitialized()) {
                this.f118282e = (byte) 0;
                return false;
            }
        }
        this.f118282e = (byte) 1;
        return true;
    }

    public h(zm2.h hVar, zm2.k kVar) {
        this.f118282e = (byte) -1;
        this.f118283f = -1;
        boolean z13 = false;
        this.f118280c = 0;
        this.f118281d = Collections.emptyList();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        char c13 = 0;
        while (!z13) {
            try {
                try {
                    try {
                        int o13 = hVar.o();
                        if (o13 != 0) {
                            if (o13 == 8) {
                                this.f118279b |= 1;
                                this.f118280c = hVar.j();
                            } else if (o13 != 18) {
                                if (!hVar.r(o13, u13)) {
                                }
                            } else {
                                if ((c13 & 2) != 2) {
                                    this.f118281d = new ArrayList();
                                    c13 = 2;
                                }
                                this.f118281d.add(hVar.f(f.f118245h, kVar));
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
                    this.f118281d = Collections.unmodifiableList(this.f118281d);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118278a = fVar.d();
                    throw th4;
                }
                this.f118278a = fVar.d();
                throw th3;
            }
        }
        if ((c13 & 2) == 2) {
            this.f118281d = Collections.unmodifiableList(this.f118281d);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118278a = fVar.d();
            throw th5;
        }
        this.f118278a = fVar.d();
    }

    public h(zm2.o oVar) {
        this.f118282e = (byte) -1;
        this.f118283f = -1;
        this.f118278a = oVar.f142242a;
    }
}
