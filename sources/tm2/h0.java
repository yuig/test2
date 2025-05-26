package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class h0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118284d;

    /* renamed from: e, reason: collision with root package name */
    public int f118285e;

    /* renamed from: f, reason: collision with root package name */
    public int f118286f;

    /* renamed from: g, reason: collision with root package name */
    public int f118287g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f118288h;

    /* renamed from: i, reason: collision with root package name */
    public int f118289i;

    /* renamed from: j, reason: collision with root package name */
    public List f118290j;

    /* renamed from: k, reason: collision with root package name */
    public s0 f118291k;

    /* renamed from: l, reason: collision with root package name */
    public int f118292l;

    /* renamed from: m, reason: collision with root package name */
    public List f118293m;

    /* renamed from: n, reason: collision with root package name */
    public List f118294n;

    /* renamed from: o, reason: collision with root package name */
    public a1 f118295o;

    /* renamed from: p, reason: collision with root package name */
    public int f118296p;

    /* renamed from: q, reason: collision with root package name */
    public int f118297q;

    /* renamed from: r, reason: collision with root package name */
    public List f118298r;

    public static h0 k() {
        h0 h0Var = new h0();
        h0Var.f118285e = 518;
        h0Var.f118286f = 2054;
        s0 s0Var = s0.f118450t;
        h0Var.f118288h = s0Var;
        h0Var.f118290j = Collections.emptyList();
        h0Var.f118291k = s0Var;
        h0Var.f118293m = Collections.emptyList();
        h0Var.f118294n = Collections.emptyList();
        h0Var.f118295o = a1.f118163l;
        h0Var.f118298r = Collections.emptyList();
        return h0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        i0 j13 = j();
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
            tm2.a r1 = tm2.i0.f118323v     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.i0 r3 = (tm2.i0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.l(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.i0 r4 = (tm2.i0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.h0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        l((i0) tVar);
        return this;
    }

    public final Object clone() {
        h0 k13 = k();
        k13.l(j());
        return k13;
    }

    public final i0 j() {
        i0 i0Var = new i0(this);
        int i13 = this.f118284d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        i0Var.f118326d = this.f118285e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        i0Var.f118327e = this.f118286f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        i0Var.f118328f = this.f118287g;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        i0Var.f118329g = this.f118288h;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        i0Var.f118330h = this.f118289i;
        if ((i13 & 32) == 32) {
            this.f118290j = Collections.unmodifiableList(this.f118290j);
            this.f118284d &= -33;
        }
        i0Var.f118331i = this.f118290j;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        i0Var.f118332j = this.f118291k;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i14 |= 64;
        }
        i0Var.f118333k = this.f118292l;
        if ((this.f118284d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            this.f118293m = Collections.unmodifiableList(this.f118293m);
            this.f118284d &= -257;
        }
        i0Var.f118334l = this.f118293m;
        if ((this.f118284d & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            this.f118294n = Collections.unmodifiableList(this.f118294n);
            this.f118284d &= -513;
        }
        i0Var.f118335m = this.f118294n;
        if ((i13 & 1024) == 1024) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        i0Var.f118337o = this.f118295o;
        if ((i13 & 2048) == 2048) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        i0Var.f118338p = this.f118296p;
        if ((i13 & 4096) == 4096) {
            i14 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        }
        i0Var.f118339q = this.f118297q;
        if ((this.f118284d & 8192) == 8192) {
            this.f118298r = Collections.unmodifiableList(this.f118298r);
            this.f118284d &= -8193;
        }
        i0Var.f118340r = this.f118298r;
        i0Var.f118325c = i14;
        return i0Var;
    }

    public final void l(i0 i0Var) {
        a1 a1Var;
        s0 s0Var;
        s0 s0Var2;
        if (i0Var == i0.f118322u) {
            return;
        }
        int i13 = i0Var.f118325c;
        if ((i13 & 1) == 1) {
            int i14 = i0Var.f118326d;
            this.f118284d = 1 | this.f118284d;
            this.f118285e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = i0Var.f118327e;
            this.f118284d = 2 | this.f118284d;
            this.f118286f = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = i0Var.f118328f;
            this.f118284d = 4 | this.f118284d;
            this.f118287g = i16;
        }
        if ((i13 & 8) == 8) {
            s0 s0Var3 = i0Var.f118329g;
            if ((this.f118284d & 8) != 8 || (s0Var2 = this.f118288h) == s0.f118450t) {
                this.f118288h = s0Var3;
            } else {
                r0 z13 = s0.z(s0Var2);
                z13.l(s0Var3);
                this.f118288h = z13.k();
            }
            this.f118284d |= 8;
        }
        if ((i0Var.f118325c & 16) == 16) {
            int i17 = i0Var.f118330h;
            this.f118284d = 16 | this.f118284d;
            this.f118289i = i17;
        }
        if (!i0Var.f118331i.isEmpty()) {
            if (this.f118290j.isEmpty()) {
                this.f118290j = i0Var.f118331i;
                this.f118284d &= -33;
            } else {
                if ((this.f118284d & 32) != 32) {
                    this.f118290j = new ArrayList(this.f118290j);
                    this.f118284d |= 32;
                }
                this.f118290j.addAll(i0Var.f118331i);
            }
        }
        if (i0Var.t()) {
            s0 s0Var4 = i0Var.f118332j;
            if ((this.f118284d & 64) != 64 || (s0Var = this.f118291k) == s0.f118450t) {
                this.f118291k = s0Var4;
            } else {
                r0 z14 = s0.z(s0Var);
                z14.l(s0Var4);
                this.f118291k = z14.k();
            }
            this.f118284d |= 64;
        }
        if ((i0Var.f118325c & 64) == 64) {
            int i18 = i0Var.f118333k;
            this.f118284d |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            this.f118292l = i18;
        }
        if (!i0Var.f118334l.isEmpty()) {
            if (this.f118293m.isEmpty()) {
                this.f118293m = i0Var.f118334l;
                this.f118284d &= -257;
            } else {
                if ((this.f118284d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
                    this.f118293m = new ArrayList(this.f118293m);
                    this.f118284d |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                }
                this.f118293m.addAll(i0Var.f118334l);
            }
        }
        if (!i0Var.f118335m.isEmpty()) {
            if (this.f118294n.isEmpty()) {
                this.f118294n = i0Var.f118335m;
                this.f118284d &= -513;
            } else {
                if ((this.f118284d & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 512) {
                    this.f118294n = new ArrayList(this.f118294n);
                    this.f118284d |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
                }
                this.f118294n.addAll(i0Var.f118335m);
            }
        }
        if ((i0Var.f118325c & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            a1 a1Var2 = i0Var.f118337o;
            if ((this.f118284d & 1024) != 1024 || (a1Var = this.f118295o) == a1.f118163l) {
                this.f118295o = a1Var2;
            } else {
                z0 i19 = z0.i();
                i19.k(a1Var);
                i19.k(a1Var2);
                this.f118295o = i19.j();
            }
            this.f118284d |= 1024;
        }
        if ((i0Var.f118325c & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            int i23 = i0Var.f118338p;
            this.f118284d |= 2048;
            this.f118296p = i23;
        }
        if (i0Var.u()) {
            int i24 = i0Var.f118339q;
            this.f118284d |= 4096;
            this.f118297q = i24;
        }
        if (!i0Var.f118340r.isEmpty()) {
            if (this.f118298r.isEmpty()) {
                this.f118298r = i0Var.f118340r;
                this.f118284d &= -8193;
            } else {
                if ((this.f118284d & 8192) != 8192) {
                    this.f118298r = new ArrayList(this.f118298r);
                    this.f118284d |= 8192;
                }
                this.f118298r.addAll(i0Var.f118340r);
            }
        }
        h(i0Var);
        this.f142242a = this.f142242a.c(i0Var.f118324b);
    }
}
