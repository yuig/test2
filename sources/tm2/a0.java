package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class a0 extends zm2.q {

    /* renamed from: u, reason: collision with root package name */
    public static final a0 f118142u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f118143v = new a(7);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118144b;

    /* renamed from: c, reason: collision with root package name */
    public int f118145c;

    /* renamed from: d, reason: collision with root package name */
    public int f118146d;

    /* renamed from: e, reason: collision with root package name */
    public int f118147e;

    /* renamed from: f, reason: collision with root package name */
    public int f118148f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f118149g;

    /* renamed from: h, reason: collision with root package name */
    public int f118150h;

    /* renamed from: i, reason: collision with root package name */
    public List f118151i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f118152j;

    /* renamed from: k, reason: collision with root package name */
    public int f118153k;

    /* renamed from: l, reason: collision with root package name */
    public List f118154l;

    /* renamed from: m, reason: collision with root package name */
    public List f118155m;

    /* renamed from: n, reason: collision with root package name */
    public int f118156n;

    /* renamed from: o, reason: collision with root package name */
    public List f118157o;

    /* renamed from: p, reason: collision with root package name */
    public y0 f118158p;

    /* renamed from: q, reason: collision with root package name */
    public List f118159q;

    /* renamed from: r, reason: collision with root package name */
    public o f118160r;

    /* renamed from: s, reason: collision with root package name */
    public byte f118161s;

    /* renamed from: t, reason: collision with root package name */
    public int f118162t;

    static {
        a0 a0Var = new a0();
        f118142u = a0Var;
        a0Var.u();
    }

    public a0(zm2.p pVar) {
        super(pVar);
        this.f118156n = -1;
        this.f118161s = (byte) -1;
        this.f118162t = -1;
        this.f118144b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118162t;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118145c & 2) == 2 ? zm2.i.f(1, this.f118147e) : 0;
        if ((this.f118145c & 4) == 4) {
            f13 += zm2.i.f(2, this.f118148f);
        }
        if ((this.f118145c & 8) == 8) {
            f13 += zm2.i.i(3, this.f118149g);
        }
        for (int i14 = 0; i14 < this.f118151i.size(); i14++) {
            f13 += zm2.i.i(4, (zm2.c) this.f118151i.get(i14));
        }
        if ((this.f118145c & 32) == 32) {
            f13 += zm2.i.i(5, this.f118152j);
        }
        for (int i15 = 0; i15 < this.f118157o.size(); i15++) {
            f13 += zm2.i.i(6, (zm2.c) this.f118157o.get(i15));
        }
        if ((this.f118145c & 16) == 16) {
            f13 += zm2.i.f(7, this.f118150h);
        }
        if ((this.f118145c & 64) == 64) {
            f13 += zm2.i.f(8, this.f118153k);
        }
        if ((this.f118145c & 1) == 1) {
            f13 += zm2.i.f(9, this.f118146d);
        }
        for (int i16 = 0; i16 < this.f118154l.size(); i16++) {
            f13 += zm2.i.i(10, (zm2.c) this.f118154l.get(i16));
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f118155m.size(); i18++) {
            i17 += zm2.i.g(((Integer) this.f118155m.get(i18)).intValue());
        }
        int i19 = f13 + i17;
        if (!this.f118155m.isEmpty()) {
            i19 = i19 + 1 + zm2.i.g(i17);
        }
        this.f118156n = i17;
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i19 += zm2.i.i(30, this.f118158p);
        }
        int i23 = 0;
        for (int i24 = 0; i24 < this.f118159q.size(); i24++) {
            i23 += zm2.i.g(((Integer) this.f118159q.get(i24)).intValue());
        }
        int size = (this.f118159q.size() * 2) + i19 + i23;
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            size += zm2.i.i(32, this.f118160r);
        }
        int size2 = this.f118144b.size() + i() + size;
        this.f118162t = size2;
        return size2;
    }

    @Override // zm2.c
    public final zm2.b b() {
        z k13;
        k13 = z.k();
        return k13;
    }

    @Override // zm2.c
    public final zm2.b c() {
        z k13 = z.k();
        k13.l(this);
        return k13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118145c & 2) == 2) {
            iVar.F(1, this.f118147e);
        }
        if ((this.f118145c & 4) == 4) {
            iVar.F(2, this.f118148f);
        }
        if ((this.f118145c & 8) == 8) {
            iVar.I(3, this.f118149g);
        }
        for (int i13 = 0; i13 < this.f118151i.size(); i13++) {
            iVar.I(4, (zm2.c) this.f118151i.get(i13));
        }
        if ((this.f118145c & 32) == 32) {
            iVar.I(5, this.f118152j);
        }
        for (int i14 = 0; i14 < this.f118157o.size(); i14++) {
            iVar.I(6, (zm2.c) this.f118157o.get(i14));
        }
        if ((this.f118145c & 16) == 16) {
            iVar.F(7, this.f118150h);
        }
        if ((this.f118145c & 64) == 64) {
            iVar.F(8, this.f118153k);
        }
        if ((this.f118145c & 1) == 1) {
            iVar.F(9, this.f118146d);
        }
        for (int i15 = 0; i15 < this.f118154l.size(); i15++) {
            iVar.I(10, (zm2.c) this.f118154l.get(i15));
        }
        if (this.f118155m.size() > 0) {
            iVar.P(90);
            iVar.P(this.f118156n);
        }
        for (int i16 = 0; i16 < this.f118155m.size(); i16++) {
            iVar.G(((Integer) this.f118155m.get(i16)).intValue());
        }
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            iVar.I(30, this.f118158p);
        }
        for (int i17 = 0; i17 < this.f118159q.size(); i17++) {
            iVar.F(31, ((Integer) this.f118159q.get(i17)).intValue());
        }
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            iVar.I(32, this.f118160r);
        }
        m13.f(19000, iVar);
        iVar.L(this.f118144b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118142u;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118161s;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        int i13 = this.f118145c;
        if ((i13 & 4) != 4) {
            this.f118161s = (byte) 0;
            return false;
        }
        if ((i13 & 8) == 8 && !this.f118149g.isInitialized()) {
            this.f118161s = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f118151i.size(); i14++) {
            if (!((x0) this.f118151i.get(i14)).isInitialized()) {
                this.f118161s = (byte) 0;
                return false;
            }
        }
        if (t() && !r().isInitialized()) {
            this.f118161s = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f118154l.size(); i15++) {
            if (!p(i15).isInitialized()) {
                this.f118161s = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < this.f118157o.size(); i16++) {
            if (!((a1) this.f118157o.get(i16)).isInitialized()) {
                this.f118161s = (byte) 0;
                return false;
            }
        }
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128 && !s().isInitialized()) {
            this.f118161s = (byte) 0;
            return false;
        }
        if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256 && !q().isInitialized()) {
            this.f118161s = (byte) 0;
            return false;
        }
        if (h()) {
            this.f118161s = (byte) 1;
            return true;
        }
        this.f118161s = (byte) 0;
        return false;
    }

    public final s0 p(int i13) {
        return (s0) this.f118154l.get(i13);
    }

    public final o q() {
        return this.f118160r;
    }

    public final s0 r() {
        return this.f118152j;
    }

    public final y0 s() {
        return this.f118158p;
    }

    public final boolean t() {
        return (this.f118145c & 32) == 32;
    }

    public final void u() {
        this.f118146d = 6;
        this.f118147e = 6;
        this.f118148f = 0;
        s0 s0Var = s0.f118450t;
        this.f118149g = s0Var;
        this.f118150h = 0;
        this.f118151i = Collections.emptyList();
        this.f118152j = s0Var;
        this.f118153k = 0;
        this.f118154l = Collections.emptyList();
        this.f118155m = Collections.emptyList();
        this.f118157o = Collections.emptyList();
        this.f118158p = y0.f118555g;
        this.f118159q = Collections.emptyList();
        this.f118160r = o.f118410e;
    }

    public a0() {
        this.f118156n = -1;
        this.f118161s = (byte) -1;
        this.f118162t = -1;
        this.f118144b = zm2.g.f142207a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public a0(zm2.h hVar, zm2.k kVar) {
        this.f118156n = -1;
        this.f118161s = (byte) -1;
        this.f118162t = -1;
        u();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (true) {
            ?? r53 = 1024;
            if (!z13) {
                try {
                    try {
                        int o13 = hVar.o();
                        r0 r0Var = null;
                        b bVar = null;
                        r0 r0Var2 = null;
                        switch (o13) {
                            case 0:
                                z13 = true;
                            case 8:
                                this.f118145c |= 2;
                                this.f118147e = hVar.j();
                            case 16:
                                this.f118145c |= 4;
                                this.f118148f = hVar.j();
                            case 26:
                                if ((this.f118145c & 8) == 8) {
                                    s0 s0Var = this.f118149g;
                                    s0Var.getClass();
                                    r0Var = s0.z(s0Var);
                                }
                                s0 s0Var2 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118149g = s0Var2;
                                if (r0Var != null) {
                                    r0Var.l(s0Var2);
                                    this.f118149g = r0Var.k();
                                }
                                this.f118145c |= 8;
                            case 34:
                                int i13 = (c13 == true ? 1 : 0) & 32;
                                c13 = c13;
                                if (i13 != 32) {
                                    this.f118151i = new ArrayList();
                                    c13 = (c13 == true ? 1 : 0) | ' ';
                                }
                                this.f118151i.add(hVar.f(x0.f118530n, kVar));
                            case 42:
                                if ((this.f118145c & 32) == 32) {
                                    s0 s0Var3 = this.f118152j;
                                    s0Var3.getClass();
                                    r0Var2 = s0.z(s0Var3);
                                }
                                s0 s0Var4 = (s0) hVar.f(s0.f118451u, kVar);
                                this.f118152j = s0Var4;
                                if (r0Var2 != null) {
                                    r0Var2.l(s0Var4);
                                    this.f118152j = r0Var2.k();
                                }
                                this.f118145c |= 32;
                            case 50:
                                int i14 = (c13 == true ? 1 : 0) & 1024;
                                c13 = c13;
                                if (i14 != 1024) {
                                    this.f118157o = new ArrayList();
                                    c13 = (c13 == true ? 1 : 0) | 1024;
                                }
                                this.f118157o.add(hVar.f(a1.f118164m, kVar));
                            case 56:
                                this.f118145c |= 16;
                                this.f118150h = hVar.j();
                            case 64:
                                this.f118145c |= 64;
                                this.f118153k = hVar.j();
                            case 72:
                                this.f118145c |= 1;
                                this.f118146d = hVar.j();
                            case 82:
                                int i15 = (c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                c13 = c13;
                                if (i15 != 256) {
                                    this.f118154l = new ArrayList();
                                    c13 = (c13 == true ? 1 : 0) | 256;
                                }
                                this.f118154l.add(hVar.f(s0.f118451u, kVar));
                            case 88:
                                int i16 = (c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                c13 = c13;
                                if (i16 != 512) {
                                    this.f118155m = new ArrayList();
                                    c13 = (c13 == true ? 1 : 0) | 512;
                                }
                                this.f118155m.add(Integer.valueOf(hVar.j()));
                            case 90:
                                int c14 = hVar.c(hVar.j());
                                int i17 = (c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                c13 = c13;
                                if (i17 != 512) {
                                    c13 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118155m = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | 512;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118155m.add(Integer.valueOf(hVar.j()));
                                }
                                hVar.b(c14);
                            case RecyclerViewTypes.VIEW_TYPE_SHOWCASE_SUBPIN_ITEM /* 242 */:
                                if ((this.f118145c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
                                    y0 y0Var = this.f118158p;
                                    y0Var.getClass();
                                    bVar = y0.i(y0Var);
                                }
                                y0 y0Var2 = (y0) hVar.f(y0.f118556h, kVar);
                                this.f118158p = y0Var2;
                                if (bVar != null) {
                                    bVar.k(y0Var2);
                                    this.f118158p = bVar.i();
                                }
                                this.f118145c |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                            case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                                int i18 = (c13 == true ? 1 : 0) & 4096;
                                c13 = c13;
                                if (i18 != 4096) {
                                    this.f118159q = new ArrayList();
                                    c13 = (c13 == true ? 1 : 0) | 4096;
                                }
                                this.f118159q.add(Integer.valueOf(hVar.j()));
                            case 250:
                                int c15 = hVar.c(hVar.j());
                                int i19 = (c13 == true ? 1 : 0) & 4096;
                                c13 = c13;
                                if (i19 != 4096) {
                                    c13 = c13;
                                    if (hVar.a() > 0) {
                                        this.f118159q = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | 4096;
                                    }
                                }
                                while (hVar.a() > 0) {
                                    this.f118159q.add(Integer.valueOf(hVar.j()));
                                }
                                hVar.b(c15);
                            case RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW /* 258 */:
                                n h10 = (this.f118145c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256 ? this.f118160r.h() : null;
                                o oVar = (o) hVar.f(o.f118411f, kVar);
                                this.f118160r = oVar;
                                if (h10 != null) {
                                    h10.l(oVar);
                                    this.f118160r = h10.h();
                                }
                                this.f118145c |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
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
                    if (((c13 == true ? 1 : 0) & 32) == 32) {
                        this.f118151i = Collections.unmodifiableList(this.f118151i);
                    }
                    if (((c13 == true ? 1 : 0) & 1024) == r53) {
                        this.f118157o = Collections.unmodifiableList(this.f118157o);
                    }
                    if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                        this.f118154l = Collections.unmodifiableList(this.f118154l);
                    }
                    if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                        this.f118155m = Collections.unmodifiableList(this.f118155m);
                    }
                    if (((c13 == true ? 1 : 0) & 4096) == 4096) {
                        this.f118159q = Collections.unmodifiableList(this.f118159q);
                    }
                    try {
                        u13.t();
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        this.f118144b = fVar.d();
                        throw th4;
                    }
                    this.f118144b = fVar.d();
                    l();
                    throw th3;
                }
            } else {
                if (((c13 == true ? 1 : 0) & 32) == 32) {
                    this.f118151i = Collections.unmodifiableList(this.f118151i);
                }
                if (((c13 == true ? 1 : 0) & 1024) == 1024) {
                    this.f118157o = Collections.unmodifiableList(this.f118157o);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                    this.f118154l = Collections.unmodifiableList(this.f118154l);
                }
                if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                    this.f118155m = Collections.unmodifiableList(this.f118155m);
                }
                if (((c13 == true ? 1 : 0) & 4096) == 4096) {
                    this.f118159q = Collections.unmodifiableList(this.f118159q);
                }
                try {
                    u13.t();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f118144b = fVar.d();
                    throw th5;
                }
                this.f118144b = fVar.d();
                l();
                return;
            }
        }
    }
}
