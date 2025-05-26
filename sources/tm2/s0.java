package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class s0 extends zm2.q {

    /* renamed from: t, reason: collision with root package name */
    public static final s0 f118450t;

    /* renamed from: u, reason: collision with root package name */
    public static final a f118451u = new a(14);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118452b;

    /* renamed from: c, reason: collision with root package name */
    public int f118453c;

    /* renamed from: d, reason: collision with root package name */
    public List f118454d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f118455e;

    /* renamed from: f, reason: collision with root package name */
    public int f118456f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f118457g;

    /* renamed from: h, reason: collision with root package name */
    public int f118458h;

    /* renamed from: i, reason: collision with root package name */
    public int f118459i;

    /* renamed from: j, reason: collision with root package name */
    public int f118460j;

    /* renamed from: k, reason: collision with root package name */
    public int f118461k;

    /* renamed from: l, reason: collision with root package name */
    public int f118462l;

    /* renamed from: m, reason: collision with root package name */
    public s0 f118463m;

    /* renamed from: n, reason: collision with root package name */
    public int f118464n;

    /* renamed from: o, reason: collision with root package name */
    public s0 f118465o;

    /* renamed from: p, reason: collision with root package name */
    public int f118466p;

    /* renamed from: q, reason: collision with root package name */
    public int f118467q;

    /* renamed from: r, reason: collision with root package name */
    public byte f118468r;

    /* renamed from: s, reason: collision with root package name */
    public int f118469s;

    static {
        s0 s0Var = new s0();
        f118450t = s0Var;
        s0Var.y();
    }

    public s0(zm2.p pVar) {
        super(pVar);
        this.f118468r = (byte) -1;
        this.f118469s = -1;
        this.f118452b = pVar.f142242a;
    }

    public static r0 z(s0 s0Var) {
        r0 i13 = r0.i();
        i13.l(s0Var);
        return i13;
    }

    @Override // zm2.c
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final r0 c() {
        return z(this);
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118469s;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118453c & 4096) == 4096 ? zm2.i.f(1, this.f118467q) : 0;
        for (int i14 = 0; i14 < this.f118454d.size(); i14++) {
            f13 += zm2.i.i(2, (zm2.c) this.f118454d.get(i14));
        }
        if ((this.f118453c & 1) == 1) {
            f13 += zm2.i.q(3) + 1;
        }
        if ((this.f118453c & 2) == 2) {
            f13 += zm2.i.f(4, this.f118456f);
        }
        if ((this.f118453c & 4) == 4) {
            f13 += zm2.i.i(5, this.f118457g);
        }
        if ((this.f118453c & 16) == 16) {
            f13 += zm2.i.f(6, this.f118459i);
        }
        if ((this.f118453c & 32) == 32) {
            f13 += zm2.i.f(7, this.f118460j);
        }
        if ((this.f118453c & 8) == 8) {
            f13 += zm2.i.f(8, this.f118458h);
        }
        if ((this.f118453c & 64) == 64) {
            f13 += zm2.i.f(9, this.f118461k);
        }
        if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            f13 += zm2.i.i(10, this.f118463m);
        }
        if ((this.f118453c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            f13 += zm2.i.f(11, this.f118464n);
        }
        if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            f13 += zm2.i.f(12, this.f118462l);
        }
        if ((this.f118453c & 1024) == 1024) {
            f13 += zm2.i.i(13, this.f118465o);
        }
        if ((this.f118453c & 2048) == 2048) {
            f13 += zm2.i.f(14, this.f118466p);
        }
        int size = this.f118452b.size() + i() + f13;
        this.f118469s = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        return r0.i();
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c cVar = new m7.c(this);
        if ((this.f118453c & 4096) == 4096) {
            iVar.F(1, this.f118467q);
        }
        for (int i13 = 0; i13 < this.f118454d.size(); i13++) {
            iVar.I(2, (zm2.c) this.f118454d.get(i13));
        }
        if ((this.f118453c & 1) == 1) {
            boolean z13 = this.f118455e;
            iVar.X(3, 0);
            iVar.K(z13 ? 1 : 0);
        }
        if ((this.f118453c & 2) == 2) {
            iVar.F(4, this.f118456f);
        }
        if ((this.f118453c & 4) == 4) {
            iVar.I(5, this.f118457g);
        }
        if ((this.f118453c & 16) == 16) {
            iVar.F(6, this.f118459i);
        }
        if ((this.f118453c & 32) == 32) {
            iVar.F(7, this.f118460j);
        }
        if ((this.f118453c & 8) == 8) {
            iVar.F(8, this.f118458h);
        }
        if ((this.f118453c & 64) == 64) {
            iVar.F(9, this.f118461k);
        }
        if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            iVar.I(10, this.f118463m);
        }
        if ((this.f118453c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            iVar.F(11, this.f118464n);
        }
        if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            iVar.F(12, this.f118462l);
        }
        if ((this.f118453c & 1024) == 1024) {
            iVar.I(13, this.f118465o);
        }
        if ((this.f118453c & 2048) == 2048) {
            iVar.F(14, this.f118466p);
        }
        cVar.f(200, iVar);
        iVar.L(this.f118452b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118450t;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118468r;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        for (int i13 = 0; i13 < this.f118454d.size(); i13++) {
            if (!((q0) this.f118454d.get(i13)).isInitialized()) {
                this.f118468r = (byte) 0;
                return false;
            }
        }
        if ((this.f118453c & 4) == 4 && !r().isInitialized()) {
            this.f118468r = (byte) 0;
            return false;
        }
        if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256 && !s().isInitialized()) {
            this.f118468r = (byte) 0;
            return false;
        }
        if ((this.f118453c & 1024) == 1024 && !p().isInitialized()) {
            this.f118468r = (byte) 0;
            return false;
        }
        if (h()) {
            this.f118468r = (byte) 1;
            return true;
        }
        this.f118468r = (byte) 0;
        return false;
    }

    public final s0 p() {
        return this.f118465o;
    }

    public final int q() {
        return this.f118456f;
    }

    public final s0 r() {
        return this.f118457g;
    }

    public final s0 s() {
        return this.f118463m;
    }

    public final int t() {
        return this.f118462l;
    }

    public final int u() {
        return this.f118461k;
    }

    public final boolean v() {
        return (this.f118453c & 16) == 16;
    }

    public final boolean w() {
        return (this.f118453c & 8) == 8;
    }

    public final boolean x() {
        return (this.f118453c & 64) == 64;
    }

    public final void y() {
        this.f118454d = Collections.emptyList();
        this.f118455e = false;
        this.f118456f = 0;
        s0 s0Var = f118450t;
        this.f118457g = s0Var;
        this.f118458h = 0;
        this.f118459i = 0;
        this.f118460j = 0;
        this.f118461k = 0;
        this.f118462l = 0;
        this.f118463m = s0Var;
        this.f118464n = 0;
        this.f118465o = s0Var;
        this.f118466p = 0;
        this.f118467q = 0;
    }

    public s0() {
        this.f118468r = (byte) -1;
        this.f118469s = -1;
        this.f118452b = zm2.g.f142207a;
    }

    public s0(zm2.h hVar, zm2.k kVar) {
        this.f118468r = (byte) -1;
        this.f118469s = -1;
        y();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        boolean z14 = false;
        while (!z13) {
            try {
                try {
                    int o13 = hVar.o();
                    a aVar = f118451u;
                    r0 r0Var = null;
                    switch (o13) {
                        case 0:
                            break;
                        case 8:
                            this.f118453c |= 4096;
                            this.f118467q = hVar.j();
                            continue;
                        case 18:
                            if (!(z14 & true)) {
                                this.f118454d = new ArrayList();
                                z14 = true;
                            }
                            this.f118454d.add(hVar.f(q0.f118427i, kVar));
                            continue;
                        case 24:
                            this.f118453c |= 1;
                            this.f118455e = hVar.k() != 0;
                            continue;
                        case 32:
                            this.f118453c |= 2;
                            this.f118456f = hVar.j();
                            continue;
                        case 42:
                            if ((this.f118453c & 4) == 4) {
                                s0 s0Var = this.f118457g;
                                s0Var.getClass();
                                r0Var = z(s0Var);
                            }
                            s0 s0Var2 = (s0) hVar.f(aVar, kVar);
                            this.f118457g = s0Var2;
                            if (r0Var != null) {
                                r0Var.l(s0Var2);
                                this.f118457g = r0Var.k();
                            }
                            this.f118453c |= 4;
                            continue;
                        case 48:
                            this.f118453c |= 16;
                            this.f118459i = hVar.j();
                            continue;
                        case 56:
                            this.f118453c |= 32;
                            this.f118460j = hVar.j();
                            continue;
                        case 64:
                            this.f118453c |= 8;
                            this.f118458h = hVar.j();
                            continue;
                        case 72:
                            this.f118453c |= 64;
                            this.f118461k = hVar.j();
                            continue;
                        case 82:
                            if ((this.f118453c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                                s0 s0Var3 = this.f118463m;
                                s0Var3.getClass();
                                r0Var = z(s0Var3);
                            }
                            s0 s0Var4 = (s0) hVar.f(aVar, kVar);
                            this.f118463m = s0Var4;
                            if (r0Var != null) {
                                r0Var.l(s0Var4);
                                this.f118463m = r0Var.k();
                            }
                            this.f118453c |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                            continue;
                        case 88:
                            this.f118453c |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                            this.f118464n = hVar.j();
                            continue;
                        case 96:
                            this.f118453c |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            this.f118462l = hVar.j();
                            continue;
                        case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                            if ((this.f118453c & 1024) == 1024) {
                                s0 s0Var5 = this.f118465o;
                                s0Var5.getClass();
                                r0Var = z(s0Var5);
                            }
                            s0 s0Var6 = (s0) hVar.f(aVar, kVar);
                            this.f118465o = s0Var6;
                            if (r0Var != null) {
                                r0Var.l(s0Var6);
                                this.f118465o = r0Var.k();
                            }
                            this.f118453c |= 1024;
                            continue;
                        case RecyclerViewTypes.VIEW_TYPE_TV_CATEGORY_PAGE_HEADER /* 112 */:
                            this.f118453c |= 2048;
                            this.f118466p = hVar.j();
                            continue;
                        default:
                            if (!n(hVar, u13, kVar, o13)) {
                                break;
                            } else {
                                break;
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
                if (z14 & true) {
                    this.f118454d = Collections.unmodifiableList(this.f118454d);
                }
                try {
                    u13.t();
                } catch (IOException unused) {
                } catch (Throwable th4) {
                    this.f118452b = fVar.d();
                    throw th4;
                }
                this.f118452b = fVar.d();
                l();
                throw th3;
            }
        }
        if (z14 & true) {
            this.f118454d = Collections.unmodifiableList(this.f118454d);
        }
        try {
            u13.t();
        } catch (IOException unused2) {
        } catch (Throwable th5) {
            this.f118452b = fVar.d();
            throw th5;
        }
        this.f118452b = fVar.d();
        l();
    }
}
