package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* loaded from: classes4.dex */
public final class u0 extends zm2.q {

    /* renamed from: o, reason: collision with root package name */
    public static final u0 f118492o;

    /* renamed from: p, reason: collision with root package name */
    public static final p f118493p = new p(2);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118494b;

    /* renamed from: c, reason: collision with root package name */
    public int f118495c;

    /* renamed from: d, reason: collision with root package name */
    public int f118496d;

    /* renamed from: e, reason: collision with root package name */
    public int f118497e;

    /* renamed from: f, reason: collision with root package name */
    public List f118498f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f118499g;

    /* renamed from: h, reason: collision with root package name */
    public int f118500h;

    /* renamed from: i, reason: collision with root package name */
    public s0 f118501i;

    /* renamed from: j, reason: collision with root package name */
    public int f118502j;

    /* renamed from: k, reason: collision with root package name */
    public List f118503k;

    /* renamed from: l, reason: collision with root package name */
    public List f118504l;

    /* renamed from: m, reason: collision with root package name */
    public byte f118505m;

    /* renamed from: n, reason: collision with root package name */
    public int f118506n;

    static {
        u0 u0Var = new u0();
        f118492o = u0Var;
        u0Var.u();
    }

    public u0(zm2.p pVar) {
        super(pVar);
        this.f118505m = (byte) -1;
        this.f118506n = -1;
        this.f118494b = pVar.f142242a;
    }

    public static u0 v(ByteArrayInputStream byteArrayInputStream, zm2.k kVar) {
        return (u0) f118493p.b(byteArrayInputStream, kVar);
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118506n;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118495c & 1) == 1 ? zm2.i.f(1, this.f118496d) : 0;
        if ((this.f118495c & 2) == 2) {
            f13 += zm2.i.f(2, this.f118497e);
        }
        for (int i14 = 0; i14 < this.f118498f.size(); i14++) {
            f13 += zm2.i.i(3, (zm2.c) this.f118498f.get(i14));
        }
        if ((this.f118495c & 4) == 4) {
            f13 += zm2.i.i(4, this.f118499g);
        }
        if ((this.f118495c & 8) == 8) {
            f13 += zm2.i.f(5, this.f118500h);
        }
        if ((this.f118495c & 16) == 16) {
            f13 += zm2.i.i(6, this.f118501i);
        }
        if ((this.f118495c & 32) == 32) {
            f13 += zm2.i.f(7, this.f118502j);
        }
        for (int i15 = 0; i15 < this.f118503k.size(); i15++) {
            f13 += zm2.i.i(8, (zm2.c) this.f118503k.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f118504l.size(); i17++) {
            i16 += zm2.i.g(((Integer) this.f118504l.get(i17)).intValue());
        }
        int size = this.f118494b.size() + i() + (this.f118504l.size() * 2) + f13 + i16;
        this.f118506n = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return t0.j();
    }

    @Override // zm2.c
    public final zm2.b c() {
        t0 j13 = t0.j();
        j13.k(this);
        return j13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118495c & 1) == 1) {
            iVar.F(1, this.f118496d);
        }
        if ((this.f118495c & 2) == 2) {
            iVar.F(2, this.f118497e);
        }
        for (int i13 = 0; i13 < this.f118498f.size(); i13++) {
            iVar.I(3, (zm2.c) this.f118498f.get(i13));
        }
        if ((this.f118495c & 4) == 4) {
            iVar.I(4, this.f118499g);
        }
        if ((this.f118495c & 8) == 8) {
            iVar.F(5, this.f118500h);
        }
        if ((this.f118495c & 16) == 16) {
            iVar.I(6, this.f118501i);
        }
        if ((this.f118495c & 32) == 32) {
            iVar.F(7, this.f118502j);
        }
        for (int i14 = 0; i14 < this.f118503k.size(); i14++) {
            iVar.I(8, (zm2.c) this.f118503k.get(i14));
        }
        for (int i15 = 0; i15 < this.f118504l.size(); i15++) {
            iVar.F(31, ((Integer) this.f118504l.get(i15)).intValue());
        }
        m13.f(200, iVar);
        iVar.L(this.f118494b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118492o;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118505m;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        if ((this.f118495c & 2) != 2) {
            this.f118505m = (byte) 0;
            return false;
        }
        for (int i13 = 0; i13 < this.f118498f.size(); i13++) {
            if (!((x0) this.f118498f.get(i13)).isInitialized()) {
                this.f118505m = (byte) 0;
                return false;
            }
        }
        if (s() && !this.f118499g.isInitialized()) {
            this.f118505m = (byte) 0;
            return false;
        }
        if (q() && !this.f118501i.isInitialized()) {
            this.f118505m = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f118503k.size(); i14++) {
            if (!((h) this.f118503k.get(i14)).isInitialized()) {
                this.f118505m = (byte) 0;
                return false;
            }
        }
        if (h()) {
            this.f118505m = (byte) 1;
            return true;
        }
        this.f118505m = (byte) 0;
        return false;
    }

    public final int p() {
        return this.f118497e;
    }

    public final boolean q() {
        return (this.f118495c & 16) == 16;
    }

    public final boolean r() {
        return (this.f118495c & 32) == 32;
    }

    public final boolean s() {
        return (this.f118495c & 4) == 4;
    }

    public final boolean t() {
        return (this.f118495c & 8) == 8;
    }

    public final void u() {
        this.f118496d = 6;
        this.f118497e = 0;
        this.f118498f = Collections.emptyList();
        s0 s0Var = s0.f118450t;
        this.f118499g = s0Var;
        this.f118500h = 0;
        this.f118501i = s0Var;
        this.f118502j = 0;
        this.f118503k = Collections.emptyList();
        this.f118504l = Collections.emptyList();
    }

    public u0() {
        this.f118505m = (byte) -1;
        this.f118506n = -1;
        this.f118494b = zm2.g.f142207a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public u0(zm2.h hVar, zm2.k kVar) {
        this.f118505m = (byte) -1;
        this.f118506n = -1;
        u();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        int i13 = 0;
        while (true) {
            ?? r53 = 128;
            if (!z13) {
                try {
                    try {
                        int o13 = hVar.o();
                        r0 r0Var = null;
                        switch (o13) {
                            case 0:
                                z13 = true;
                            case 8:
                                this.f118495c |= 1;
                                this.f118496d = hVar.j();
                            case 16:
                                this.f118495c |= 2;
                                this.f118497e = hVar.j();
                            case 26:
                                if ((i13 & 4) != 4) {
                                    this.f118498f = new ArrayList();
                                    i13 |= 4;
                                }
                                this.f118498f.add(hVar.f(x0.f118530n, kVar));
                            case 34:
                                if ((this.f118495c & 4) == 4) {
                                    s0 s0Var = this.f118499g;
                                    s0Var.getClass();
                                    r0Var = s0.z(s0Var);
                                }
                                s0 s0Var2 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118499g = s0Var2;
                                if (r0Var != null) {
                                    r0Var.l(s0Var2);
                                    this.f118499g = r0Var.k();
                                }
                                this.f118495c |= 4;
                            case 40:
                                this.f118495c |= 8;
                                this.f118500h = hVar.j();
                            case 50:
                                if ((this.f118495c & 16) == 16) {
                                    s0 s0Var3 = this.f118501i;
                                    s0Var3.getClass();
                                    r0Var = s0.z(s0Var3);
                                }
                                s0 s0Var4 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118501i = s0Var4;
                                if (r0Var != null) {
                                    r0Var.l(s0Var4);
                                    this.f118501i = r0Var.k();
                                }
                                this.f118495c |= 16;
                            case 56:
                                this.f118495c |= 32;
                                this.f118502j = hVar.j();
                            case 66:
                                if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 128) {
                                    this.f118503k = new ArrayList();
                                    i13 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                }
                                this.f118503k.add(hVar.f(h.f118277h, kVar));
                            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                                if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
                                    this.f118504l = new ArrayList();
                                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                }
                                this.f118504l.add(Integer.valueOf(hVar.j()));
                            case 250:
                                int c13 = hVar.c(hVar.j());
                                if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256 && hVar.a() > 0) {
                                    this.f118504l = new ArrayList();
                                    i13 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                }
                                while (hVar.a() > 0) {
                                    this.f118504l.add(Integer.valueOf(hVar.j()));
                                }
                                hVar.b(c13);
                                break;
                            default:
                                r53 = n(hVar, u13, kVar, o13);
                                if (r53 == 0) {
                                    z13 = true;
                                }
                        }
                    } catch (InvalidProtocolBufferException e13) {
                        e13.f80460a = this;
                        throw e13;
                    } catch (IOException e14) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e14.getMessage());
                        invalidProtocolBufferException.f80460a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th3) {
                    if ((i13 & 4) == 4) {
                        this.f118498f = Collections.unmodifiableList(this.f118498f);
                    }
                    if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == r53) {
                        this.f118503k = Collections.unmodifiableList(this.f118503k);
                    }
                    if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                        this.f118504l = Collections.unmodifiableList(this.f118504l);
                    }
                    try {
                        u13.t();
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        this.f118494b = fVar.d();
                        throw th4;
                    }
                    this.f118494b = fVar.d();
                    l();
                    throw th3;
                }
            } else {
                if ((i13 & 4) == 4) {
                    this.f118498f = Collections.unmodifiableList(this.f118498f);
                }
                if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
                    this.f118503k = Collections.unmodifiableList(this.f118503k);
                }
                if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                    this.f118504l = Collections.unmodifiableList(this.f118504l);
                }
                try {
                    u13.t();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f118494b = fVar.d();
                    throw th5;
                }
                this.f118494b = fVar.d();
                l();
                return;
            }
        }
    }
}
