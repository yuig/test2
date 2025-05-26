package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class z extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118563d;

    /* renamed from: e, reason: collision with root package name */
    public int f118564e;

    /* renamed from: f, reason: collision with root package name */
    public int f118565f;

    /* renamed from: g, reason: collision with root package name */
    public int f118566g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f118567h;

    /* renamed from: i, reason: collision with root package name */
    public int f118568i;

    /* renamed from: j, reason: collision with root package name */
    public List f118569j;

    /* renamed from: k, reason: collision with root package name */
    public s0 f118570k;

    /* renamed from: l, reason: collision with root package name */
    public int f118571l;

    /* renamed from: m, reason: collision with root package name */
    public List f118572m;

    /* renamed from: n, reason: collision with root package name */
    public List f118573n;

    /* renamed from: o, reason: collision with root package name */
    public List f118574o;

    /* renamed from: p, reason: collision with root package name */
    public y0 f118575p;

    /* renamed from: q, reason: collision with root package name */
    public List f118576q;

    /* renamed from: r, reason: collision with root package name */
    public o f118577r;

    public static z k() {
        z zVar = new z();
        zVar.f118564e = 6;
        zVar.f118565f = 6;
        s0 s0Var = s0.f118450t;
        zVar.f118567h = s0Var;
        zVar.f118569j = Collections.emptyList();
        zVar.f118570k = s0Var;
        zVar.f118572m = Collections.emptyList();
        zVar.f118573n = Collections.emptyList();
        zVar.f118574o = Collections.emptyList();
        zVar.f118575p = y0.f118555g;
        zVar.f118576q = Collections.emptyList();
        zVar.f118577r = o.f118410e;
        return zVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        a0 j13 = j();
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
            tm2.a r1 = tm2.a0.f118143v     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.a0 r3 = (tm2.a0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.l(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.a0 r4 = (tm2.a0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.z.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        l((a0) tVar);
        return this;
    }

    public final Object clone() {
        z k13 = k();
        k13.l(j());
        return k13;
    }

    public final a0 j() {
        a0 a0Var = new a0(this);
        int i13 = this.f118563d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        a0Var.f118146d = this.f118564e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        a0Var.f118147e = this.f118565f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        a0Var.f118148f = this.f118566g;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        a0Var.f118149g = this.f118567h;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        a0Var.f118150h = this.f118568i;
        if ((i13 & 32) == 32) {
            this.f118569j = Collections.unmodifiableList(this.f118569j);
            this.f118563d &= -33;
        }
        a0Var.f118151i = this.f118569j;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        a0Var.f118152j = this.f118570k;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i14 |= 64;
        }
        a0Var.f118153k = this.f118571l;
        if ((this.f118563d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            this.f118572m = Collections.unmodifiableList(this.f118572m);
            this.f118563d &= -257;
        }
        a0Var.f118154l = this.f118572m;
        if ((this.f118563d & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            this.f118573n = Collections.unmodifiableList(this.f118573n);
            this.f118563d &= -513;
        }
        a0Var.f118155m = this.f118573n;
        if ((this.f118563d & 1024) == 1024) {
            this.f118574o = Collections.unmodifiableList(this.f118574o);
            this.f118563d &= -1025;
        }
        a0Var.f118157o = this.f118574o;
        if ((i13 & 2048) == 2048) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        a0Var.f118158p = this.f118575p;
        if ((this.f118563d & 4096) == 4096) {
            this.f118576q = Collections.unmodifiableList(this.f118576q);
            this.f118563d &= -4097;
        }
        a0Var.f118159q = this.f118576q;
        if ((i13 & 8192) == 8192) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        a0Var.f118160r = this.f118577r;
        a0Var.f118145c = i14;
        return a0Var;
    }

    public final void l(a0 a0Var) {
        o oVar;
        y0 y0Var;
        s0 s0Var;
        s0 s0Var2;
        if (a0Var == a0.f118142u) {
            return;
        }
        int i13 = a0Var.f118145c;
        if ((i13 & 1) == 1) {
            int i14 = a0Var.f118146d;
            this.f118563d = 1 | this.f118563d;
            this.f118564e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = a0Var.f118147e;
            this.f118563d = 2 | this.f118563d;
            this.f118565f = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = a0Var.f118148f;
            this.f118563d = 4 | this.f118563d;
            this.f118566g = i16;
        }
        if ((i13 & 8) == 8) {
            s0 s0Var3 = a0Var.f118149g;
            if ((this.f118563d & 8) != 8 || (s0Var2 = this.f118567h) == s0.f118450t) {
                this.f118567h = s0Var3;
            } else {
                r0 z13 = s0.z(s0Var2);
                z13.l(s0Var3);
                this.f118567h = z13.k();
            }
            this.f118563d |= 8;
        }
        if ((a0Var.f118145c & 16) == 16) {
            int i17 = a0Var.f118150h;
            this.f118563d = 16 | this.f118563d;
            this.f118568i = i17;
        }
        if (!a0Var.f118151i.isEmpty()) {
            if (this.f118569j.isEmpty()) {
                this.f118569j = a0Var.f118151i;
                this.f118563d &= -33;
            } else {
                if ((this.f118563d & 32) != 32) {
                    this.f118569j = new ArrayList(this.f118569j);
                    this.f118563d |= 32;
                }
                this.f118569j.addAll(a0Var.f118151i);
            }
        }
        if (a0Var.t()) {
            s0 s0Var4 = a0Var.f118152j;
            if ((this.f118563d & 64) != 64 || (s0Var = this.f118570k) == s0.f118450t) {
                this.f118570k = s0Var4;
            } else {
                r0 z14 = s0.z(s0Var);
                z14.l(s0Var4);
                this.f118570k = z14.k();
            }
            this.f118563d |= 64;
        }
        if ((a0Var.f118145c & 64) == 64) {
            int i18 = a0Var.f118153k;
            this.f118563d |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            this.f118571l = i18;
        }
        if (!a0Var.f118154l.isEmpty()) {
            if (this.f118572m.isEmpty()) {
                this.f118572m = a0Var.f118154l;
                this.f118563d &= -257;
            } else {
                if ((this.f118563d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
                    this.f118572m = new ArrayList(this.f118572m);
                    this.f118563d |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                }
                this.f118572m.addAll(a0Var.f118154l);
            }
        }
        if (!a0Var.f118155m.isEmpty()) {
            if (this.f118573n.isEmpty()) {
                this.f118573n = a0Var.f118155m;
                this.f118563d &= -513;
            } else {
                if ((this.f118563d & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 512) {
                    this.f118573n = new ArrayList(this.f118573n);
                    this.f118563d |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                }
                this.f118573n.addAll(a0Var.f118155m);
            }
        }
        if (!a0Var.f118157o.isEmpty()) {
            if (this.f118574o.isEmpty()) {
                this.f118574o = a0Var.f118157o;
                this.f118563d &= -1025;
            } else {
                if ((this.f118563d & 1024) != 1024) {
                    this.f118574o = new ArrayList(this.f118574o);
                    this.f118563d |= 1024;
                }
                this.f118574o.addAll(a0Var.f118157o);
            }
        }
        if ((a0Var.f118145c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            y0 y0Var2 = a0Var.f118158p;
            if ((this.f118563d & 2048) != 2048 || (y0Var = this.f118575p) == y0.f118555g) {
                this.f118575p = y0Var2;
            } else {
                b i19 = y0.i(y0Var);
                i19.k(y0Var2);
                this.f118575p = i19.i();
            }
            this.f118563d |= 2048;
        }
        if (!a0Var.f118159q.isEmpty()) {
            if (this.f118576q.isEmpty()) {
                this.f118576q = a0Var.f118159q;
                this.f118563d &= -4097;
            } else {
                if ((this.f118563d & 4096) != 4096) {
                    this.f118576q = new ArrayList(this.f118576q);
                    this.f118563d |= 4096;
                }
                this.f118576q.addAll(a0Var.f118159q);
            }
        }
        if ((a0Var.f118145c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            o oVar2 = a0Var.f118160r;
            if ((this.f118563d & 8192) != 8192 || (oVar = this.f118577r) == o.f118410e) {
                this.f118577r = oVar2;
            } else {
                n g13 = n.g();
                g13.l(oVar);
                g13.l(oVar2);
                this.f118577r = g13.h();
            }
            this.f118563d |= 8192;
        }
        h(a0Var);
        this.f142242a = this.f142242a.c(a0Var.f118144b);
    }
}
