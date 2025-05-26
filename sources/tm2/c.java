package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class c extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118186b;

    /* renamed from: c, reason: collision with root package name */
    public d f118187c;

    /* renamed from: d, reason: collision with root package name */
    public long f118188d;

    /* renamed from: e, reason: collision with root package name */
    public float f118189e;

    /* renamed from: f, reason: collision with root package name */
    public double f118190f;

    /* renamed from: g, reason: collision with root package name */
    public int f118191g;

    /* renamed from: h, reason: collision with root package name */
    public int f118192h;

    /* renamed from: i, reason: collision with root package name */
    public int f118193i;

    /* renamed from: j, reason: collision with root package name */
    public h f118194j;

    /* renamed from: k, reason: collision with root package name */
    public List f118195k;

    /* renamed from: l, reason: collision with root package name */
    public int f118196l;

    /* renamed from: m, reason: collision with root package name */
    public int f118197m;

    public static c h() {
        c cVar = new c();
        cVar.f118187c = d.BYTE;
        cVar.f118194j = h.f118276g;
        cVar.f118195k = Collections.emptyList();
        return cVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        e g13 = g();
        if (g13.isInitialized()) {
            return g13;
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
            tm2.a r1 = tm2.e.f118205q     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.e r3 = (tm2.e) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.e r4 = (tm2.e) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.k(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.c.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((e) tVar);
        return this;
    }

    public final Object clone() {
        c h10 = h();
        h10.k(g());
        return h10;
    }

    public final e g() {
        e eVar = new e(this);
        int i13 = this.f118186b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        eVar.f118208c = this.f118187c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        eVar.f118209d = this.f118188d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        eVar.f118210e = this.f118189e;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        eVar.f118211f = this.f118190f;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        eVar.f118212g = this.f118191g;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        eVar.f118213h = this.f118192h;
        if ((i13 & 64) == 64) {
            i14 |= 64;
        }
        eVar.f118214i = this.f118193i;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
        }
        eVar.f118215j = this.f118194j;
        if ((i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            this.f118195k = Collections.unmodifiableList(this.f118195k);
            this.f118186b &= -257;
        }
        eVar.f118216k = this.f118195k;
        if ((i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            i14 |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
        eVar.f118217l = this.f118196l;
        if ((i13 & 1024) == 1024) {
            i14 |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        }
        eVar.f118218m = this.f118197m;
        eVar.f118207b = i14;
        return eVar;
    }

    public final void i() {
        if ((this.f118186b & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
            this.f118195k = new ArrayList(this.f118195k);
            this.f118186b |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
        }
    }

    public final void j(h hVar) {
        h hVar2;
        if ((this.f118186b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 128 || (hVar2 = this.f118194j) == h.f118276g) {
            this.f118194j = hVar;
        } else {
            g gVar = new g();
            gVar.f118265d = Collections.emptyList();
            gVar.i(hVar2);
            gVar.i(hVar);
            this.f118194j = gVar.g();
        }
        this.f118186b |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
    }

    public final void k(e eVar) {
        if (eVar == e.f118204p) {
            return;
        }
        if ((eVar.f118207b & 1) == 1) {
            d dVar = eVar.f118208c;
            dVar.getClass();
            this.f118186b = 1 | this.f118186b;
            this.f118187c = dVar;
        }
        int i13 = eVar.f118207b;
        if ((i13 & 2) == 2) {
            long j13 = eVar.f118209d;
            this.f118186b |= 2;
            this.f118188d = j13;
        }
        if ((i13 & 4) == 4) {
            float f13 = eVar.f118210e;
            this.f118186b = 4 | this.f118186b;
            this.f118189e = f13;
        }
        if ((i13 & 8) == 8) {
            double d2 = eVar.f118211f;
            this.f118186b |= 8;
            this.f118190f = d2;
        }
        if ((i13 & 16) == 16) {
            p(eVar.f118212g);
        }
        if ((eVar.f118207b & 32) == 32) {
            m(eVar.f118213h);
        }
        if ((eVar.f118207b & 64) == 64) {
            n(eVar.f118214i);
        }
        if ((eVar.f118207b & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            j(eVar.f118215j);
        }
        if (!eVar.f118216k.isEmpty()) {
            if (this.f118195k.isEmpty()) {
                this.f118195k = eVar.f118216k;
                this.f118186b &= -257;
            } else {
                i();
                this.f118195k.addAll(eVar.f118216k);
            }
        }
        if ((eVar.f118207b & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            l(eVar.f118217l);
        }
        if ((eVar.f118207b & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 512) {
            o(eVar.f118218m);
        }
        this.f142242a = this.f142242a.c(eVar.f118206a);
    }

    public final void l(int i13) {
        this.f118186b |= BitmapUtils.BITMAP_TO_JPEG_SIZE;
        this.f118196l = i13;
    }

    public final void m(int i13) {
        this.f118186b |= 32;
        this.f118192h = i13;
    }

    public final void n(int i13) {
        this.f118186b |= 64;
        this.f118193i = i13;
    }

    public final void o(int i13) {
        this.f118186b |= 1024;
        this.f118197m = i13;
    }

    public final void p(int i13) {
        this.f118186b |= 16;
        this.f118191g = i13;
    }
}
