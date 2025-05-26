package tm2;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class t0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118480d;

    /* renamed from: e, reason: collision with root package name */
    public int f118481e;

    /* renamed from: f, reason: collision with root package name */
    public int f118482f;

    /* renamed from: g, reason: collision with root package name */
    public List f118483g;

    /* renamed from: h, reason: collision with root package name */
    public s0 f118484h;

    /* renamed from: i, reason: collision with root package name */
    public int f118485i;

    /* renamed from: j, reason: collision with root package name */
    public s0 f118486j;

    /* renamed from: k, reason: collision with root package name */
    public int f118487k;

    /* renamed from: l, reason: collision with root package name */
    public List f118488l;

    /* renamed from: m, reason: collision with root package name */
    public List f118489m;

    public static t0 j() {
        t0 t0Var = new t0();
        t0Var.f118481e = 6;
        t0Var.f118483g = Collections.emptyList();
        s0 s0Var = s0.f118450t;
        t0Var.f118484h = s0Var;
        t0Var.f118486j = s0Var;
        t0Var.f118488l = Collections.emptyList();
        t0Var.f118489m = Collections.emptyList();
        return t0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        u0 i13 = i();
        if (i13.isInitialized()) {
            return i13;
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
            tm2.p r1 = tm2.u0.f118493p     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.u0 r3 = (tm2.u0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.u0 r4 = (tm2.u0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.t0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((u0) tVar);
        return this;
    }

    public final Object clone() {
        t0 j13 = j();
        j13.k(i());
        return j13;
    }

    public final u0 i() {
        u0 u0Var = new u0(this);
        int i13 = this.f118480d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        u0Var.f118496d = this.f118481e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        u0Var.f118497e = this.f118482f;
        if ((i13 & 4) == 4) {
            this.f118483g = Collections.unmodifiableList(this.f118483g);
            this.f118480d &= -5;
        }
        u0Var.f118498f = this.f118483g;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        u0Var.f118499g = this.f118484h;
        if ((i13 & 16) == 16) {
            i14 |= 8;
        }
        u0Var.f118500h = this.f118485i;
        if ((i13 & 32) == 32) {
            i14 |= 16;
        }
        u0Var.f118501i = this.f118486j;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        u0Var.f118502j = this.f118487k;
        if ((this.f118480d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 128) {
            this.f118488l = Collections.unmodifiableList(this.f118488l);
            this.f118480d &= -129;
        }
        u0Var.f118503k = this.f118488l;
        if ((this.f118480d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) == 256) {
            this.f118489m = Collections.unmodifiableList(this.f118489m);
            this.f118480d &= -257;
        }
        u0Var.f118504l = this.f118489m;
        u0Var.f118495c = i14;
        return u0Var;
    }

    public final void k(u0 u0Var) {
        s0 s0Var;
        s0 s0Var2;
        if (u0Var == u0.f118492o) {
            return;
        }
        int i13 = u0Var.f118495c;
        if ((i13 & 1) == 1) {
            int i14 = u0Var.f118496d;
            this.f118480d = 1 | this.f118480d;
            this.f118481e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = u0Var.f118497e;
            this.f118480d = 2 | this.f118480d;
            this.f118482f = i15;
        }
        if (!u0Var.f118498f.isEmpty()) {
            if (this.f118483g.isEmpty()) {
                this.f118483g = u0Var.f118498f;
                this.f118480d &= -5;
            } else {
                if ((this.f118480d & 4) != 4) {
                    this.f118483g = new ArrayList(this.f118483g);
                    this.f118480d |= 4;
                }
                this.f118483g.addAll(u0Var.f118498f);
            }
        }
        if (u0Var.s()) {
            s0 s0Var3 = u0Var.f118499g;
            if ((this.f118480d & 8) != 8 || (s0Var2 = this.f118484h) == s0.f118450t) {
                this.f118484h = s0Var3;
            } else {
                r0 z13 = s0.z(s0Var2);
                z13.l(s0Var3);
                this.f118484h = z13.k();
            }
            this.f118480d |= 8;
        }
        if (u0Var.t()) {
            int i16 = u0Var.f118500h;
            this.f118480d |= 16;
            this.f118485i = i16;
        }
        if (u0Var.q()) {
            s0 s0Var4 = u0Var.f118501i;
            if ((this.f118480d & 32) != 32 || (s0Var = this.f118486j) == s0.f118450t) {
                this.f118486j = s0Var4;
            } else {
                r0 z14 = s0.z(s0Var);
                z14.l(s0Var4);
                this.f118486j = z14.k();
            }
            this.f118480d |= 32;
        }
        if (u0Var.r()) {
            int i17 = u0Var.f118502j;
            this.f118480d |= 64;
            this.f118487k = i17;
        }
        if (!u0Var.f118503k.isEmpty()) {
            if (this.f118488l.isEmpty()) {
                this.f118488l = u0Var.f118503k;
                this.f118480d &= -129;
            } else {
                if ((this.f118480d & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 128) {
                    this.f118488l = new ArrayList(this.f118488l);
                    this.f118480d |= RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN;
                }
                this.f118488l.addAll(u0Var.f118503k);
            }
        }
        if (!u0Var.f118504l.isEmpty()) {
            if (this.f118489m.isEmpty()) {
                this.f118489m = u0Var.f118504l;
                this.f118480d &= -257;
            } else {
                if ((this.f118480d & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 256) {
                    this.f118489m = new ArrayList(this.f118489m);
                    this.f118480d |= RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER;
                }
                this.f118489m.addAll(u0Var.f118504l);
            }
        }
        h(u0Var);
        this.f142242a = this.f142242a.c(u0Var.f118494b);
    }
}
