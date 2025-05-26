package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class l extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118373d;

    /* renamed from: e, reason: collision with root package name */
    public int f118374e;

    /* renamed from: f, reason: collision with root package name */
    public List f118375f;

    /* renamed from: g, reason: collision with root package name */
    public List f118376g;

    public static l i() {
        l lVar = new l();
        lVar.f118374e = 6;
        lVar.f118375f = Collections.emptyList();
        lVar.f118376g = Collections.emptyList();
        return lVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        m j13 = j();
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
            tm2.a r1 = tm2.m.f118387j     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.m r3 = (tm2.m) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.m r4 = (tm2.m) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.l.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((m) tVar);
        return this;
    }

    public final Object clone() {
        l lVar = new l();
        lVar.f118374e = 6;
        lVar.f118375f = Collections.emptyList();
        lVar.f118376g = Collections.emptyList();
        lVar.k(j());
        return lVar;
    }

    public final m j() {
        m mVar = new m(this);
        int i13 = this.f118373d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        mVar.f118390d = this.f118374e;
        if ((i13 & 2) == 2) {
            this.f118375f = Collections.unmodifiableList(this.f118375f);
            this.f118373d &= -3;
        }
        mVar.f118391e = this.f118375f;
        if ((this.f118373d & 4) == 4) {
            this.f118376g = Collections.unmodifiableList(this.f118376g);
            this.f118373d &= -5;
        }
        mVar.f118392f = this.f118376g;
        mVar.f118389c = i14;
        return mVar;
    }

    public final void k(m mVar) {
        if (mVar == m.f118386i) {
            return;
        }
        if ((mVar.f118389c & 1) == 1) {
            int i13 = mVar.f118390d;
            this.f118373d = 1 | this.f118373d;
            this.f118374e = i13;
        }
        if (!mVar.f118391e.isEmpty()) {
            if (this.f118375f.isEmpty()) {
                this.f118375f = mVar.f118391e;
                this.f118373d &= -3;
            } else {
                if ((this.f118373d & 2) != 2) {
                    this.f118375f = new ArrayList(this.f118375f);
                    this.f118373d |= 2;
                }
                this.f118375f.addAll(mVar.f118391e);
            }
        }
        if (!mVar.f118392f.isEmpty()) {
            if (this.f118376g.isEmpty()) {
                this.f118376g = mVar.f118392f;
                this.f118373d &= -5;
            } else {
                if ((this.f118373d & 4) != 4) {
                    this.f118376g = new ArrayList(this.f118376g);
                    this.f118373d |= 4;
                }
                this.f118376g.addAll(mVar.f118392f);
            }
        }
        h(mVar);
        this.f142242a = this.f142242a.c(mVar.f118388b);
    }
}
