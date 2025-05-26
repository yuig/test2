package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class i extends zm2.p {
    public List A;
    public f1 B;

    /* renamed from: d, reason: collision with root package name */
    public int f118299d;

    /* renamed from: e, reason: collision with root package name */
    public int f118300e;

    /* renamed from: f, reason: collision with root package name */
    public int f118301f;

    /* renamed from: g, reason: collision with root package name */
    public int f118302g;

    /* renamed from: h, reason: collision with root package name */
    public List f118303h;

    /* renamed from: i, reason: collision with root package name */
    public List f118304i;

    /* renamed from: j, reason: collision with root package name */
    public List f118305j;

    /* renamed from: k, reason: collision with root package name */
    public List f118306k;

    /* renamed from: l, reason: collision with root package name */
    public List f118307l;

    /* renamed from: m, reason: collision with root package name */
    public List f118308m;

    /* renamed from: n, reason: collision with root package name */
    public List f118309n;

    /* renamed from: o, reason: collision with root package name */
    public List f118310o;

    /* renamed from: p, reason: collision with root package name */
    public List f118311p;

    /* renamed from: q, reason: collision with root package name */
    public List f118312q;

    /* renamed from: r, reason: collision with root package name */
    public List f118313r;

    /* renamed from: s, reason: collision with root package name */
    public List f118314s;

    /* renamed from: t, reason: collision with root package name */
    public int f118315t;

    /* renamed from: u, reason: collision with root package name */
    public s0 f118316u;

    /* renamed from: v, reason: collision with root package name */
    public int f118317v;

    /* renamed from: w, reason: collision with root package name */
    public List f118318w;

    /* renamed from: x, reason: collision with root package name */
    public List f118319x;

    /* renamed from: y, reason: collision with root package name */
    public List f118320y;

    /* renamed from: z, reason: collision with root package name */
    public y0 f118321z;

    public static i k() {
        i iVar = new i();
        iVar.f118300e = 6;
        iVar.f118303h = Collections.emptyList();
        iVar.f118304i = Collections.emptyList();
        iVar.f118305j = Collections.emptyList();
        iVar.f118306k = Collections.emptyList();
        iVar.f118307l = Collections.emptyList();
        iVar.f118308m = Collections.emptyList();
        iVar.f118309n = Collections.emptyList();
        iVar.f118310o = Collections.emptyList();
        iVar.f118311p = Collections.emptyList();
        iVar.f118312q = Collections.emptyList();
        iVar.f118313r = Collections.emptyList();
        iVar.f118314s = Collections.emptyList();
        iVar.f118316u = s0.f118450t;
        iVar.f118318w = Collections.emptyList();
        iVar.f118319x = Collections.emptyList();
        iVar.f118320y = Collections.emptyList();
        iVar.f118321z = y0.f118555g;
        iVar.A = Collections.emptyList();
        iVar.B = f1.f118257e;
        return iVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        k j13 = j();
        if (j13.isInitialized()) {
            return j13;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0019  */
    @Override // zm2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zm2.b b(zm2.h r3, zm2.k r4) {
        /*
            r2 = this;
            r0 = 0
            tm2.a r1 = tm2.k.K     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.k r3 = (tm2.k) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.l(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.k r4 = (tm2.k) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.l(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.i.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        l((k) tVar);
        return this;
    }

    public final Object clone() {
        i k13 = k();
        k13.l(j());
        return k13;
    }

    public final k j() {
        k kVar = new k(this);
        int i13 = this.f118299d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        kVar.f118350d = this.f118300e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        kVar.f118351e = this.f118301f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        kVar.f118352f = this.f118302g;
        if ((i13 & 8) == 8) {
            this.f118303h = Collections.unmodifiableList(this.f118303h);
            this.f118299d &= -9;
        }
        kVar.f118353g = this.f118303h;
        if ((this.f118299d & 16) == 16) {
            this.f118304i = Collections.unmodifiableList(this.f118304i);
            this.f118299d &= -17;
        }
        kVar.f118354h = this.f118304i;
        if ((this.f118299d & 32) == 32) {
            this.f118305j = Collections.unmodifiableList(this.f118305j);
            this.f118299d &= -33;
        }
        kVar.f118355i = this.f118305j;
        if ((this.f118299d & 64) == 64) {
            this.f118306k = Collections.unmodifiableList(this.f118306k);
            this.f118299d &= -65;
        }
        kVar.f118357k = this.f118306k;
        if ((this.f118299d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            this.f118307l = Collections.unmodifiableList(this.f118307l);
            this.f118299d &= -129;
        }
        kVar.f118359m = this.f118307l;
        if ((this.f118299d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            this.f118308m = Collections.unmodifiableList(this.f118308m);
            this.f118299d &= -257;
        }
        kVar.f118360n = this.f118308m;
        if ((this.f118299d & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            this.f118309n = Collections.unmodifiableList(this.f118309n);
            this.f118299d &= -513;
        }
        kVar.f118362p = this.f118309n;
        if ((this.f118299d & 1024) == 1024) {
            this.f118310o = Collections.unmodifiableList(this.f118310o);
            this.f118299d &= -1025;
        }
        kVar.f118363q = this.f118310o;
        if ((this.f118299d & 2048) == 2048) {
            this.f118311p = Collections.unmodifiableList(this.f118311p);
            this.f118299d &= -2049;
        }
        kVar.f118364r = this.f118311p;
        if ((this.f118299d & 4096) == 4096) {
            this.f118312q = Collections.unmodifiableList(this.f118312q);
            this.f118299d &= -4097;
        }
        kVar.f118365s = this.f118312q;
        if ((this.f118299d & 8192) == 8192) {
            this.f118313r = Collections.unmodifiableList(this.f118313r);
            this.f118299d &= -8193;
        }
        kVar.f118366t = this.f118313r;
        if ((this.f118299d & 16384) == 16384) {
            this.f118314s = Collections.unmodifiableList(this.f118314s);
            this.f118299d &= -16385;
        }
        kVar.f118367u = this.f118314s;
        if ((i13 & 32768) == 32768) {
            i14 |= 8;
        }
        kVar.f118369w = this.f118315t;
        if ((i13 & 65536) == 65536) {
            i14 |= 16;
        }
        kVar.f118370x = this.f118316u;
        if ((i13 & 131072) == 131072) {
            i14 |= 32;
        }
        kVar.f118371y = this.f118317v;
        if ((this.f118299d & 262144) == 262144) {
            this.f118318w = Collections.unmodifiableList(this.f118318w);
            this.f118299d &= -262145;
        }
        kVar.f118372z = this.f118318w;
        if ((this.f118299d & 524288) == 524288) {
            this.f118319x = Collections.unmodifiableList(this.f118319x);
            this.f118299d &= -524289;
        }
        kVar.B = this.f118319x;
        if ((this.f118299d & 1048576) == 1048576) {
            this.f118320y = Collections.unmodifiableList(this.f118320y);
            this.f118299d &= -1048577;
        }
        kVar.C = this.f118320y;
        if ((i13 & 2097152) == 2097152) {
            i14 |= 64;
        }
        kVar.E = this.f118321z;
        if ((this.f118299d & 4194304) == 4194304) {
            this.A = Collections.unmodifiableList(this.A);
            this.f118299d &= -4194305;
        }
        kVar.F = this.A;
        if ((i13 & 8388608) == 8388608) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        kVar.G = this.B;
        kVar.f118349c = i14;
        return kVar;
    }

    public final void l(k kVar) {
        f1 f1Var;
        y0 y0Var;
        s0 s0Var;
        if (kVar == k.f118347J) {
            return;
        }
        int i13 = kVar.f118349c;
        if ((i13 & 1) == 1) {
            int i14 = kVar.f118350d;
            this.f118299d = 1 | this.f118299d;
            this.f118300e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = kVar.f118351e;
            this.f118299d |= 2;
            this.f118301f = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = kVar.f118352f;
            this.f118299d = 4 | this.f118299d;
            this.f118302g = i16;
        }
        if (!kVar.f118353g.isEmpty()) {
            if (this.f118303h.isEmpty()) {
                this.f118303h = kVar.f118353g;
                this.f118299d &= -9;
            } else {
                if ((this.f118299d & 8) != 8) {
                    this.f118303h = new ArrayList(this.f118303h);
                    this.f118299d |= 8;
                }
                this.f118303h.addAll(kVar.f118353g);
            }
        }
        if (!kVar.f118354h.isEmpty()) {
            if (this.f118304i.isEmpty()) {
                this.f118304i = kVar.f118354h;
                this.f118299d &= -17;
            } else {
                if ((this.f118299d & 16) != 16) {
                    this.f118304i = new ArrayList(this.f118304i);
                    this.f118299d |= 16;
                }
                this.f118304i.addAll(kVar.f118354h);
            }
        }
        if (!kVar.f118355i.isEmpty()) {
            if (this.f118305j.isEmpty()) {
                this.f118305j = kVar.f118355i;
                this.f118299d &= -33;
            } else {
                if ((this.f118299d & 32) != 32) {
                    this.f118305j = new ArrayList(this.f118305j);
                    this.f118299d |= 32;
                }
                this.f118305j.addAll(kVar.f118355i);
            }
        }
        if (!kVar.f118357k.isEmpty()) {
            if (this.f118306k.isEmpty()) {
                this.f118306k = kVar.f118357k;
                this.f118299d &= -65;
            } else {
                if ((this.f118299d & 64) != 64) {
                    this.f118306k = new ArrayList(this.f118306k);
                    this.f118299d |= 64;
                }
                this.f118306k.addAll(kVar.f118357k);
            }
        }
        if (!kVar.f118359m.isEmpty()) {
            if (this.f118307l.isEmpty()) {
                this.f118307l = kVar.f118359m;
                this.f118299d &= -129;
            } else {
                if ((this.f118299d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 128) {
                    this.f118307l = new ArrayList(this.f118307l);
                    this.f118299d |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
                this.f118307l.addAll(kVar.f118359m);
            }
        }
        if (!kVar.f118360n.isEmpty()) {
            if (this.f118308m.isEmpty()) {
                this.f118308m = kVar.f118360n;
                this.f118299d &= -257;
            } else {
                if ((this.f118299d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
                    this.f118308m = new ArrayList(this.f118308m);
                    this.f118299d |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                }
                this.f118308m.addAll(kVar.f118360n);
            }
        }
        if (!kVar.f118362p.isEmpty()) {
            if (this.f118309n.isEmpty()) {
                this.f118309n = kVar.f118362p;
                this.f118299d &= -513;
            } else {
                if ((this.f118299d & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 512) {
                    this.f118309n = new ArrayList(this.f118309n);
                    this.f118299d |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                }
                this.f118309n.addAll(kVar.f118362p);
            }
        }
        if (!kVar.f118363q.isEmpty()) {
            if (this.f118310o.isEmpty()) {
                this.f118310o = kVar.f118363q;
                this.f118299d &= -1025;
            } else {
                if ((this.f118299d & 1024) != 1024) {
                    this.f118310o = new ArrayList(this.f118310o);
                    this.f118299d |= 1024;
                }
                this.f118310o.addAll(kVar.f118363q);
            }
        }
        if (!kVar.f118364r.isEmpty()) {
            if (this.f118311p.isEmpty()) {
                this.f118311p = kVar.f118364r;
                this.f118299d &= -2049;
            } else {
                if ((this.f118299d & 2048) != 2048) {
                    this.f118311p = new ArrayList(this.f118311p);
                    this.f118299d |= 2048;
                }
                this.f118311p.addAll(kVar.f118364r);
            }
        }
        if (!kVar.f118365s.isEmpty()) {
            if (this.f118312q.isEmpty()) {
                this.f118312q = kVar.f118365s;
                this.f118299d &= -4097;
            } else {
                if ((this.f118299d & 4096) != 4096) {
                    this.f118312q = new ArrayList(this.f118312q);
                    this.f118299d |= 4096;
                }
                this.f118312q.addAll(kVar.f118365s);
            }
        }
        if (!kVar.f118366t.isEmpty()) {
            if (this.f118313r.isEmpty()) {
                this.f118313r = kVar.f118366t;
                this.f118299d &= -8193;
            } else {
                if ((this.f118299d & 8192) != 8192) {
                    this.f118313r = new ArrayList(this.f118313r);
                    this.f118299d |= 8192;
                }
                this.f118313r.addAll(kVar.f118366t);
            }
        }
        if (!kVar.f118367u.isEmpty()) {
            if (this.f118314s.isEmpty()) {
                this.f118314s = kVar.f118367u;
                this.f118299d &= -16385;
            } else {
                if ((this.f118299d & 16384) != 16384) {
                    this.f118314s = new ArrayList(this.f118314s);
                    this.f118299d |= 16384;
                }
                this.f118314s.addAll(kVar.f118367u);
            }
        }
        if (kVar.t()) {
            int i17 = kVar.f118369w;
            this.f118299d |= 32768;
            this.f118315t = i17;
        }
        if ((kVar.f118349c & 16) == 16) {
            s0 s0Var2 = kVar.f118370x;
            if ((this.f118299d & 65536) != 65536 || (s0Var = this.f118316u) == s0.f118450t) {
                this.f118316u = s0Var2;
            } else {
                r0 z13 = s0.z(s0Var);
                z13.l(s0Var2);
                this.f118316u = z13.k();
            }
            this.f118299d |= 65536;
        }
        if (kVar.u()) {
            int i18 = kVar.f118371y;
            this.f118299d |= 131072;
            this.f118317v = i18;
        }
        if (!kVar.f118372z.isEmpty()) {
            if (this.f118318w.isEmpty()) {
                this.f118318w = kVar.f118372z;
                this.f118299d &= -262145;
            } else {
                if ((this.f118299d & 262144) != 262144) {
                    this.f118318w = new ArrayList(this.f118318w);
                    this.f118299d |= 262144;
                }
                this.f118318w.addAll(kVar.f118372z);
            }
        }
        if (!kVar.B.isEmpty()) {
            if (this.f118319x.isEmpty()) {
                this.f118319x = kVar.B;
                this.f118299d &= -524289;
            } else {
                if ((this.f118299d & 524288) != 524288) {
                    this.f118319x = new ArrayList(this.f118319x);
                    this.f118299d |= 524288;
                }
                this.f118319x.addAll(kVar.B);
            }
        }
        if (!kVar.C.isEmpty()) {
            if (this.f118320y.isEmpty()) {
                this.f118320y = kVar.C;
                this.f118299d &= -1048577;
            } else {
                if ((this.f118299d & 1048576) != 1048576) {
                    this.f118320y = new ArrayList(this.f118320y);
                    this.f118299d |= 1048576;
                }
                this.f118320y.addAll(kVar.C);
            }
        }
        if ((kVar.f118349c & 64) == 64) {
            y0 y0Var2 = kVar.E;
            if ((this.f118299d & 2097152) != 2097152 || (y0Var = this.f118321z) == y0.f118555g) {
                this.f118321z = y0Var2;
            } else {
                b i19 = y0.i(y0Var);
                i19.k(y0Var2);
                this.f118321z = i19.i();
            }
            this.f118299d |= 2097152;
        }
        if (!kVar.F.isEmpty()) {
            if (this.A.isEmpty()) {
                this.A = kVar.F;
                this.f118299d &= -4194305;
            } else {
                if ((this.f118299d & 4194304) != 4194304) {
                    this.A = new ArrayList(this.A);
                    this.f118299d |= 4194304;
                }
                this.A.addAll(kVar.F);
            }
        }
        if ((kVar.f118349c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            f1 f1Var2 = kVar.G;
            if ((this.f118299d & 8388608) != 8388608 || (f1Var = this.B) == f1.f118257e) {
                this.B = f1Var2;
            } else {
                n nVar = new n(2);
                nVar.o(f1Var);
                nVar.o(f1Var2);
                this.B = nVar.k();
            }
            this.f118299d |= 8388608;
        }
        h(kVar);
        this.f142242a = this.f142242a.c(kVar.f118348b);
    }
}
