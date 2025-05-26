package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class i0 extends zm2.q {

    /* renamed from: u, reason: collision with root package name */
    public static final i0 f118322u;

    /* renamed from: v, reason: collision with root package name */
    public static final a f118323v = new a(10);

    /* renamed from: b, reason: collision with root package name */
    public final zm2.g f118324b;

    /* renamed from: c, reason: collision with root package name */
    public int f118325c;

    /* renamed from: d, reason: collision with root package name */
    public int f118326d;

    /* renamed from: e, reason: collision with root package name */
    public int f118327e;

    /* renamed from: f, reason: collision with root package name */
    public int f118328f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f118329g;

    /* renamed from: h, reason: collision with root package name */
    public int f118330h;

    /* renamed from: i, reason: collision with root package name */
    public List f118331i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f118332j;

    /* renamed from: k, reason: collision with root package name */
    public int f118333k;

    /* renamed from: l, reason: collision with root package name */
    public List f118334l;

    /* renamed from: m, reason: collision with root package name */
    public List f118335m;

    /* renamed from: n, reason: collision with root package name */
    public int f118336n;

    /* renamed from: o, reason: collision with root package name */
    public a1 f118337o;

    /* renamed from: p, reason: collision with root package name */
    public int f118338p;

    /* renamed from: q, reason: collision with root package name */
    public int f118339q;

    /* renamed from: r, reason: collision with root package name */
    public List f118340r;

    /* renamed from: s, reason: collision with root package name */
    public byte f118341s;

    /* renamed from: t, reason: collision with root package name */
    public int f118342t;

    static {
        i0 i0Var = new i0();
        f118322u = i0Var;
        i0Var.v();
    }

    public i0(zm2.p pVar) {
        super(pVar);
        this.f118336n = -1;
        this.f118341s = (byte) -1;
        this.f118342t = -1;
        this.f118324b = pVar.f142242a;
    }

    @Override // zm2.c
    public final int a() {
        int i13 = this.f118342t;
        if (i13 != -1) {
            return i13;
        }
        int f13 = (this.f118325c & 2) == 2 ? zm2.i.f(1, this.f118327e) : 0;
        if ((this.f118325c & 4) == 4) {
            f13 += zm2.i.f(2, this.f118328f);
        }
        if ((this.f118325c & 8) == 8) {
            f13 += zm2.i.i(3, this.f118329g);
        }
        for (int i14 = 0; i14 < this.f118331i.size(); i14++) {
            f13 += zm2.i.i(4, (zm2.c) this.f118331i.get(i14));
        }
        if ((this.f118325c & 32) == 32) {
            f13 += zm2.i.i(5, this.f118332j);
        }
        if ((this.f118325c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            f13 += zm2.i.i(6, this.f118337o);
        }
        if ((this.f118325c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            f13 += zm2.i.f(7, this.f118338p);
        }
        if ((this.f118325c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            f13 += zm2.i.f(8, this.f118339q);
        }
        if ((this.f118325c & 16) == 16) {
            f13 += zm2.i.f(9, this.f118330h);
        }
        if ((this.f118325c & 64) == 64) {
            f13 += zm2.i.f(10, this.f118333k);
        }
        if ((this.f118325c & 1) == 1) {
            f13 += zm2.i.f(11, this.f118326d);
        }
        for (int i15 = 0; i15 < this.f118334l.size(); i15++) {
            f13 += zm2.i.i(12, (zm2.c) this.f118334l.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f118335m.size(); i17++) {
            i16 += zm2.i.g(((Integer) this.f118335m.get(i17)).intValue());
        }
        int i18 = f13 + i16;
        if (!this.f118335m.isEmpty()) {
            i18 = i18 + 1 + zm2.i.g(i16);
        }
        this.f118336n = i16;
        int i19 = 0;
        for (int i23 = 0; i23 < this.f118340r.size(); i23++) {
            i19 += zm2.i.g(((Integer) this.f118340r.get(i23)).intValue());
        }
        int size = this.f118324b.size() + i() + (this.f118340r.size() * 2) + i18 + i19;
        this.f118342t = size;
        return size;
    }

    @Override // zm2.c
    public final zm2.b b() {
        h0 k13;
        k13 = h0.k();
        return k13;
    }

    @Override // zm2.c
    public final zm2.b c() {
        h0 k13 = h0.k();
        k13.l(this);
        return k13;
    }

    @Override // zm2.c
    public final void d(zm2.i iVar) {
        a();
        m7.c m13 = m();
        if ((this.f118325c & 2) == 2) {
            iVar.F(1, this.f118327e);
        }
        if ((this.f118325c & 4) == 4) {
            iVar.F(2, this.f118328f);
        }
        if ((this.f118325c & 8) == 8) {
            iVar.I(3, this.f118329g);
        }
        for (int i13 = 0; i13 < this.f118331i.size(); i13++) {
            iVar.I(4, (zm2.c) this.f118331i.get(i13));
        }
        if ((this.f118325c & 32) == 32) {
            iVar.I(5, this.f118332j);
        }
        if ((this.f118325c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            iVar.I(6, this.f118337o);
        }
        if ((this.f118325c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            iVar.F(7, this.f118338p);
        }
        if ((this.f118325c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            iVar.F(8, this.f118339q);
        }
        if ((this.f118325c & 16) == 16) {
            iVar.F(9, this.f118330h);
        }
        if ((this.f118325c & 64) == 64) {
            iVar.F(10, this.f118333k);
        }
        if ((this.f118325c & 1) == 1) {
            iVar.F(11, this.f118326d);
        }
        for (int i14 = 0; i14 < this.f118334l.size(); i14++) {
            iVar.I(12, (zm2.c) this.f118334l.get(i14));
        }
        if (this.f118335m.size() > 0) {
            iVar.P(RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID);
            iVar.P(this.f118336n);
        }
        for (int i15 = 0; i15 < this.f118335m.size(); i15++) {
            iVar.G(((Integer) this.f118335m.get(i15)).intValue());
        }
        for (int i16 = 0; i16 < this.f118340r.size(); i16++) {
            iVar.F(31, ((Integer) this.f118340r.get(i16)).intValue());
        }
        m13.f(19000, iVar);
        iVar.L(this.f118324b);
    }

    @Override // zm2.a0
    public final zm2.c getDefaultInstanceForType() {
        return f118322u;
    }

    @Override // zm2.a0
    public final boolean isInitialized() {
        byte b13 = this.f118341s;
        if (b13 == 1) {
            return true;
        }
        if (b13 == 0) {
            return false;
        }
        int i13 = this.f118325c;
        if ((i13 & 4) != 4) {
            this.f118341s = (byte) 0;
            return false;
        }
        if ((i13 & 8) == 8 && !this.f118329g.isInitialized()) {
            this.f118341s = (byte) 0;
            return false;
        }
        for (int i14 = 0; i14 < this.f118331i.size(); i14++) {
            if (!s(i14).isInitialized()) {
                this.f118341s = (byte) 0;
                return false;
            }
        }
        if (t() && !q().isInitialized()) {
            this.f118341s = (byte) 0;
            return false;
        }
        for (int i15 = 0; i15 < this.f118334l.size(); i15++) {
            if (!p(i15).isInitialized()) {
                this.f118341s = (byte) 0;
                return false;
            }
        }
        if ((this.f118325c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128 && !r().isInitialized()) {
            this.f118341s = (byte) 0;
            return false;
        }
        if (h()) {
            this.f118341s = (byte) 1;
            return true;
        }
        this.f118341s = (byte) 0;
        return false;
    }

    public final s0 p(int i13) {
        return (s0) this.f118334l.get(i13);
    }

    public final s0 q() {
        return this.f118332j;
    }

    public final a1 r() {
        return this.f118337o;
    }

    public final x0 s(int i13) {
        return (x0) this.f118331i.get(i13);
    }

    public final boolean t() {
        return (this.f118325c & 32) == 32;
    }

    public final boolean u() {
        return (this.f118325c & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512;
    }

    public final void v() {
        this.f118326d = 518;
        this.f118327e = 2054;
        this.f118328f = 0;
        s0 s0Var = s0.f118450t;
        this.f118329g = s0Var;
        this.f118330h = 0;
        this.f118331i = Collections.emptyList();
        this.f118332j = s0Var;
        this.f118333k = 0;
        this.f118334l = Collections.emptyList();
        this.f118335m = Collections.emptyList();
        this.f118337o = a1.f118163l;
        this.f118338p = 0;
        this.f118339q = 0;
        this.f118340r = Collections.emptyList();
    }

    public i0() {
        this.f118336n = -1;
        this.f118341s = (byte) -1;
        this.f118342t = -1;
        this.f118324b = zm2.g.f142207a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean] */
    public i0(zm2.h hVar, zm2.k kVar) {
        this.f118336n = -1;
        this.f118341s = (byte) -1;
        this.f118342t = -1;
        v();
        zm2.f fVar = new zm2.f();
        zm2.i u13 = zm2.i.u(fVar, 1);
        boolean z13 = false;
        char c13 = 0;
        while (true) {
            ?? r53 = 256;
            if (!z13) {
                try {
                    try {
                        try {
                            int o13 = hVar.o();
                            r0 r0Var = null;
                            r0 r0Var2 = null;
                            switch (o13) {
                                case 0:
                                    z13 = true;
                                case 8:
                                    this.f118325c |= 2;
                                    this.f118327e = hVar.j();
                                case 16:
                                    this.f118325c |= 4;
                                    this.f118328f = hVar.j();
                                case 26:
                                    if ((this.f118325c & 8) == 8) {
                                        s0 s0Var = this.f118329g;
                                        s0Var.getClass();
                                        r0Var = s0.z(s0Var);
                                    }
                                    s0 s0Var2 = (s0) hVar.f(s0.f118451u, kVar);
                                    this.f118329g = s0Var2;
                                    if (r0Var != null) {
                                        r0Var.l(s0Var2);
                                        this.f118329g = r0Var.k();
                                    }
                                    this.f118325c |= 8;
                                case 34:
                                    int i13 = (c13 == true ? 1 : 0) & 32;
                                    c13 = c13;
                                    if (i13 != 32) {
                                        this.f118331i = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | ' ';
                                    }
                                    this.f118331i.add(hVar.f(x0.f118530n, kVar));
                                case 42:
                                    if ((this.f118325c & 32) == 32) {
                                        s0 s0Var3 = this.f118332j;
                                        s0Var3.getClass();
                                        r0Var2 = s0.z(s0Var3);
                                    }
                                    s0 s0Var4 = (s0) hVar.f(s0.f118451u, kVar);
                                    this.f118332j = s0Var4;
                                    if (r0Var2 != null) {
                                        r0Var2.l(s0Var4);
                                        this.f118332j = r0Var2.k();
                                    }
                                    this.f118325c |= 32;
                                case 50:
                                    z0 q13 = (this.f118325c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128 ? this.f118337o.q() : null;
                                    a1 a1Var = (a1) hVar.f(a1.f118164m, kVar);
                                    this.f118337o = a1Var;
                                    if (q13 != null) {
                                        q13.k(a1Var);
                                        this.f118337o = q13.j();
                                    }
                                    this.f118325c |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                                case 56:
                                    this.f118325c |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                    this.f118338p = hVar.j();
                                case 64:
                                    this.f118325c |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                    this.f118339q = hVar.j();
                                case 72:
                                    this.f118325c |= 16;
                                    this.f118330h = hVar.j();
                                case 80:
                                    this.f118325c |= 64;
                                    this.f118333k = hVar.j();
                                case 88:
                                    this.f118325c |= 1;
                                    this.f118326d = hVar.j();
                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_VIDEO_CREATOR_ANALYTICS_MODULE /* 98 */:
                                    int i14 = (c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                                    c13 = c13;
                                    if (i14 != 256) {
                                        this.f118334l = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | 256;
                                    }
                                    this.f118334l.add(hVar.f(s0.f118451u, kVar));
                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PEAR_STYLES_MODULE /* 104 */:
                                    int i15 = (c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                    c13 = c13;
                                    if (i15 != 512) {
                                        this.f118335m = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | 512;
                                    }
                                    this.f118335m.add(Integer.valueOf(hVar.j()));
                                case RecyclerViewTypes.VIEW_TYPE_PIN_CLOSEUP_PLACEHOLDER_LOADING_GRID /* 106 */:
                                    int c14 = hVar.c(hVar.j());
                                    int i16 = (c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE;
                                    c13 = c13;
                                    if (i16 != 512) {
                                        c13 = c13;
                                        if (hVar.a() > 0) {
                                            this.f118335m = new ArrayList();
                                            c13 = (c13 == true ? 1 : 0) | 512;
                                        }
                                    }
                                    while (hVar.a() > 0) {
                                        this.f118335m.add(Integer.valueOf(hVar.j()));
                                    }
                                    hVar.b(c14);
                                case RecyclerViewTypes.VIEW_TYPE_PEAR_EXPLORER_HEADER /* 248 */:
                                    int i17 = (c13 == true ? 1 : 0) & 8192;
                                    c13 = c13;
                                    if (i17 != 8192) {
                                        this.f118340r = new ArrayList();
                                        c13 = (c13 == true ? 1 : 0) | 8192;
                                    }
                                    this.f118340r.add(Integer.valueOf(hVar.j()));
                                case 250:
                                    int c15 = hVar.c(hVar.j());
                                    int i18 = (c13 == true ? 1 : 0) & 8192;
                                    c13 = c13;
                                    if (i18 != 8192) {
                                        c13 = c13;
                                        if (hVar.a() > 0) {
                                            this.f118340r = new ArrayList();
                                            c13 = (c13 == true ? 1 : 0) | 8192;
                                        }
                                    }
                                    while (hVar.a() > 0) {
                                        this.f118340r.add(Integer.valueOf(hVar.j()));
                                    }
                                    hVar.b(c15);
                                default:
                                    r53 = n(hVar, u13, kVar, o13);
                                    if (r53 == 0) {
                                        z13 = true;
                                    }
                            }
                        } catch (InvalidProtocolBufferException e13) {
                            e13.f80460a = this;
                            throw e13;
                        }
                    } catch (IOException e14) {
                        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e14.getMessage());
                        invalidProtocolBufferException.f80460a = this;
                        throw invalidProtocolBufferException;
                    }
                } catch (Throwable th3) {
                    if (((c13 == true ? 1 : 0) & 32) == 32) {
                        this.f118331i = Collections.unmodifiableList(this.f118331i);
                    }
                    if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == r53) {
                        this.f118334l = Collections.unmodifiableList(this.f118334l);
                    }
                    if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                        this.f118335m = Collections.unmodifiableList(this.f118335m);
                    }
                    if (((c13 == true ? 1 : 0) & 8192) == 8192) {
                        this.f118340r = Collections.unmodifiableList(this.f118340r);
                    }
                    try {
                        u13.t();
                    } catch (IOException unused) {
                    } catch (Throwable th4) {
                        this.f118324b = fVar.d();
                        throw th4;
                    }
                    this.f118324b = fVar.d();
                    l();
                    throw th3;
                }
            } else {
                if (((c13 == true ? 1 : 0) & 32) == 32) {
                    this.f118331i = Collections.unmodifiableList(this.f118331i);
                }
                if (((c13 == true ? 1 : 0) & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
                    this.f118334l = Collections.unmodifiableList(this.f118334l);
                }
                if (((c13 == true ? 1 : 0) & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
                    this.f118335m = Collections.unmodifiableList(this.f118335m);
                }
                if (((c13 == true ? 1 : 0) & 8192) == 8192) {
                    this.f118340r = Collections.unmodifiableList(this.f118340r);
                }
                try {
                    u13.t();
                } catch (IOException unused2) {
                } catch (Throwable th5) {
                    this.f118324b = fVar.d();
                    throw th5;
                }
                this.f118324b = fVar.d();
                l();
                return;
            }
        }
    }
}
