package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes4.dex */
public final class r0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118435d;

    /* renamed from: e, reason: collision with root package name */
    public List f118436e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f118437f;

    /* renamed from: g, reason: collision with root package name */
    public int f118438g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f118439h;

    /* renamed from: i, reason: collision with root package name */
    public int f118440i;

    /* renamed from: j, reason: collision with root package name */
    public int f118441j;

    /* renamed from: k, reason: collision with root package name */
    public int f118442k;

    /* renamed from: l, reason: collision with root package name */
    public int f118443l;

    /* renamed from: m, reason: collision with root package name */
    public int f118444m;

    /* renamed from: n, reason: collision with root package name */
    public s0 f118445n;

    /* renamed from: o, reason: collision with root package name */
    public int f118446o;

    /* renamed from: p, reason: collision with root package name */
    public s0 f118447p;

    /* renamed from: q, reason: collision with root package name */
    public int f118448q;

    /* renamed from: r, reason: collision with root package name */
    public int f118449r;

    public static r0 i() {
        r0 r0Var = new r0();
        r0Var.f118436e = Collections.emptyList();
        s0 s0Var = s0.f118450t;
        r0Var.f118439h = s0Var;
        r0Var.f118445n = s0Var;
        r0Var.f118447p = s0Var;
        return r0Var;
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
            tm2.a r1 = tm2.s0.f118451u     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.s0 r3 = (tm2.s0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.l(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.s0 r4 = (tm2.s0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.r0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        l((s0) tVar);
        return this;
    }

    public final Object clone() {
        r0 r0Var = new r0();
        r0Var.f118436e = Collections.emptyList();
        s0 s0Var = s0.f118450t;
        r0Var.f118439h = s0Var;
        r0Var.f118445n = s0Var;
        r0Var.f118447p = s0Var;
        r0Var.l(k());
        return r0Var;
    }

    @Override // zm2.b
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final s0 a() {
        s0 k13 = k();
        if (k13.isInitialized()) {
            return k13;
        }
        throw new UninitializedMessageException();
    }

    public final s0 k() {
        s0 s0Var = new s0(this);
        int i13 = this.f118435d;
        if ((i13 & 1) == 1) {
            this.f118436e = Collections.unmodifiableList(this.f118436e);
            this.f118435d &= -2;
        }
        s0Var.f118454d = this.f118436e;
        int i14 = (i13 & 2) != 2 ? 0 : 1;
        s0Var.f118455e = this.f118437f;
        if ((i13 & 4) == 4) {
            i14 |= 2;
        }
        s0Var.f118456f = this.f118438g;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        s0Var.f118457g = this.f118439h;
        if ((i13 & 16) == 16) {
            i14 |= 8;
        }
        s0Var.f118458h = this.f118440i;
        if ((i13 & 32) == 32) {
            i14 |= 16;
        }
        s0Var.f118459i = this.f118441j;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        s0Var.f118460j = this.f118442k;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i14 |= 64;
        }
        s0Var.f118461k = this.f118443l;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        s0Var.f118462l = this.f118444m;
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        s0Var.f118463m = this.f118445n;
        if ((i13 & 1024) == 1024) {
            i14 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        }
        s0Var.f118464n = this.f118446o;
        if ((i13 & 2048) == 2048) {
            i14 |= 1024;
        }
        s0Var.f118465o = this.f118447p;
        if ((i13 & 4096) == 4096) {
            i14 |= 2048;
        }
        s0Var.f118466p = this.f118448q;
        if ((i13 & 8192) == 8192) {
            i14 |= 4096;
        }
        s0Var.f118467q = this.f118449r;
        s0Var.f118453c = i14;
        return s0Var;
    }

    public final r0 l(s0 s0Var) {
        s0 s0Var2;
        s0 s0Var3;
        s0 s0Var4;
        s0 s0Var5 = s0.f118450t;
        if (s0Var == s0Var5) {
            return this;
        }
        if (!s0Var.f118454d.isEmpty()) {
            if (this.f118436e.isEmpty()) {
                this.f118436e = s0Var.f118454d;
                this.f118435d &= -2;
            } else {
                if ((this.f118435d & 1) != 1) {
                    this.f118436e = new ArrayList(this.f118436e);
                    this.f118435d |= 1;
                }
                this.f118436e.addAll(s0Var.f118454d);
            }
        }
        if ((s0Var.f118453c & 1) == 1) {
            m(s0Var.f118455e);
        }
        int i13 = s0Var.f118453c;
        if ((i13 & 2) == 2) {
            int i14 = s0Var.f118456f;
            this.f118435d |= 4;
            this.f118438g = i14;
        }
        if ((i13 & 4) == 4) {
            s0 s0Var6 = s0Var.f118457g;
            if ((this.f118435d & 8) != 8 || (s0Var4 = this.f118439h) == s0Var5) {
                this.f118439h = s0Var6;
            } else {
                r0 z13 = s0.z(s0Var4);
                z13.l(s0Var6);
                this.f118439h = z13.k();
            }
            this.f118435d |= 8;
        }
        if (s0Var.w()) {
            int i15 = s0Var.f118458h;
            this.f118435d |= 16;
            this.f118440i = i15;
        }
        if (s0Var.v()) {
            int i16 = s0Var.f118459i;
            this.f118435d |= 32;
            this.f118441j = i16;
        }
        if ((s0Var.f118453c & 32) == 32) {
            int i17 = s0Var.f118460j;
            this.f118435d |= 64;
            this.f118442k = i17;
        }
        if (s0Var.x()) {
            int i18 = s0Var.f118461k;
            this.f118435d |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
            this.f118443l = i18;
        }
        int i19 = s0Var.f118453c;
        if ((i19 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            int i23 = s0Var.f118462l;
            this.f118435d |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
            this.f118444m = i23;
        }
        if ((i19 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            s0 s0Var7 = s0Var.f118463m;
            if ((this.f118435d & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 512 || (s0Var3 = this.f118445n) == s0Var5) {
                this.f118445n = s0Var7;
            } else {
                r0 z14 = s0.z(s0Var3);
                z14.l(s0Var7);
                this.f118445n = z14.k();
            }
            this.f118435d |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        }
        int i24 = s0Var.f118453c;
        if ((i24 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            int i25 = s0Var.f118464n;
            this.f118435d |= 1024;
            this.f118446o = i25;
        }
        if ((i24 & 1024) == 1024) {
            s0 s0Var8 = s0Var.f118465o;
            if ((this.f118435d & 2048) != 2048 || (s0Var2 = this.f118447p) == s0Var5) {
                this.f118447p = s0Var8;
            } else {
                r0 z15 = s0.z(s0Var2);
                z15.l(s0Var8);
                this.f118447p = z15.k();
            }
            this.f118435d |= 2048;
        }
        int i26 = s0Var.f118453c;
        if ((i26 & 2048) == 2048) {
            int i27 = s0Var.f118466p;
            this.f118435d |= 4096;
            this.f118448q = i27;
        }
        if ((i26 & 4096) == 4096) {
            int i28 = s0Var.f118467q;
            this.f118435d |= 8192;
            this.f118449r = i28;
        }
        h(s0Var);
        this.f142242a = this.f142242a.c(s0Var.f118452b);
        return this;
    }

    public final void m(boolean z13) {
        this.f118435d |= 2;
        this.f118437f = z13;
    }
}
