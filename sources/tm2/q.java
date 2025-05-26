package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class q extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118421b;

    /* renamed from: c, reason: collision with root package name */
    public r f118422c;

    /* renamed from: d, reason: collision with root package name */
    public List f118423d;

    /* renamed from: e, reason: collision with root package name */
    public y f118424e;

    /* renamed from: f, reason: collision with root package name */
    public s f118425f;

    public static q h() {
        q qVar = new q();
        qVar.f118422c = r.RETURNS_CONSTANT;
        qVar.f118423d = Collections.emptyList();
        qVar.f118424e = y.f118542l;
        qVar.f118425f = s.AT_MOST_ONCE;
        return qVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        t g13 = g();
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
            tm2.p r1 = tm2.t.f118471j     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.t r3 = (tm2.t) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.t r4 = (tm2.t) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.i(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.q.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((t) tVar);
        return this;
    }

    public final Object clone() {
        q h10 = h();
        h10.i(g());
        return h10;
    }

    public final t g() {
        t tVar = new t(this);
        int i13 = this.f118421b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        tVar.f118474c = this.f118422c;
        if ((i13 & 2) == 2) {
            this.f118423d = Collections.unmodifiableList(this.f118423d);
            this.f118421b &= -3;
        }
        tVar.f118475d = this.f118423d;
        if ((i13 & 4) == 4) {
            i14 |= 2;
        }
        tVar.f118476e = this.f118424e;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        tVar.f118477f = this.f118425f;
        tVar.f118473b = i14;
        return tVar;
    }

    public final void i(t tVar) {
        y yVar;
        if (tVar == t.f118470i) {
            return;
        }
        if ((tVar.f118473b & 1) == 1) {
            r rVar = tVar.f118474c;
            rVar.getClass();
            this.f118421b |= 1;
            this.f118422c = rVar;
        }
        if (!tVar.f118475d.isEmpty()) {
            if (this.f118423d.isEmpty()) {
                this.f118423d = tVar.f118475d;
                this.f118421b &= -3;
            } else {
                if ((this.f118421b & 2) != 2) {
                    this.f118423d = new ArrayList(this.f118423d);
                    this.f118421b |= 2;
                }
                this.f118423d.addAll(tVar.f118475d);
            }
        }
        if ((tVar.f118473b & 2) == 2) {
            y yVar2 = tVar.f118476e;
            if ((this.f118421b & 4) != 4 || (yVar = this.f118424e) == y.f118542l) {
                this.f118424e = yVar2;
            } else {
                w h10 = w.h();
                h10.i(yVar);
                h10.i(yVar2);
                this.f118424e = h10.g();
            }
            this.f118421b |= 4;
        }
        if ((tVar.f118473b & 4) == 4) {
            s sVar = tVar.f118477f;
            sVar.getClass();
            this.f118421b |= 8;
            this.f118425f = sVar;
        }
        this.f142242a = this.f142242a.c(tVar.f118472a);
    }
}
