package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class f0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118252d;

    /* renamed from: e, reason: collision with root package name */
    public n0 f118253e;

    /* renamed from: f, reason: collision with root package name */
    public m0 f118254f;

    /* renamed from: g, reason: collision with root package name */
    public e0 f118255g;

    /* renamed from: h, reason: collision with root package name */
    public List f118256h;

    public static f0 i() {
        f0 f0Var = new f0();
        f0Var.f118253e = n0.f118404e;
        f0Var.f118254f = m0.f118395e;
        f0Var.f118255g = e0.f118221k;
        f0Var.f118256h = Collections.emptyList();
        return f0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        g0 j13 = j();
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
            tm2.a r1 = tm2.g0.f118267k     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.g0 r3 = (tm2.g0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.g0 r4 = (tm2.g0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.f0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((g0) tVar);
        return this;
    }

    public final Object clone() {
        f0 f0Var = new f0();
        f0Var.f118253e = n0.f118404e;
        f0Var.f118254f = m0.f118395e;
        f0Var.f118255g = e0.f118221k;
        f0Var.f118256h = Collections.emptyList();
        f0Var.k(j());
        return f0Var;
    }

    public final g0 j() {
        g0 g0Var = new g0(this);
        int i13 = this.f118252d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        g0Var.f118270d = this.f118253e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        g0Var.f118271e = this.f118254f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        g0Var.f118272f = this.f118255g;
        if ((i13 & 8) == 8) {
            this.f118256h = Collections.unmodifiableList(this.f118256h);
            this.f118252d &= -9;
        }
        g0Var.f118273g = this.f118256h;
        g0Var.f118269c = i14;
        return g0Var;
    }

    public final void k(g0 g0Var) {
        e0 e0Var;
        d0 k13;
        m0 m0Var;
        n0 n0Var;
        if (g0Var == g0.f118266j) {
            return;
        }
        if ((g0Var.f118269c & 1) == 1) {
            n0 n0Var2 = g0Var.f118270d;
            if ((this.f118252d & 1) != 1 || (n0Var = this.f118253e) == n0.f118404e) {
                this.f118253e = n0Var2;
            } else {
                n nVar = new n(3);
                nVar.n(n0Var);
                nVar.n(n0Var2);
                this.f118253e = nVar.j();
            }
            this.f118252d |= 1;
        }
        if ((g0Var.f118269c & 2) == 2) {
            m0 m0Var2 = g0Var.f118271e;
            if ((this.f118252d & 2) != 2 || (m0Var = this.f118254f) == m0.f118395e) {
                this.f118254f = m0Var2;
            } else {
                n nVar2 = new n(1);
                nVar2.m(m0Var);
                nVar2.m(m0Var2);
                this.f118254f = nVar2.i();
            }
            this.f118252d |= 2;
        }
        if ((g0Var.f118269c & 4) == 4) {
            e0 e0Var2 = g0Var.f118272f;
            if ((this.f118252d & 4) != 4 || (e0Var = this.f118255g) == e0.f118221k) {
                this.f118255g = e0Var2;
            } else {
                k13 = d0.k();
                k13.l(e0Var);
                k13.l(e0Var2);
                this.f118255g = k13.j();
            }
            this.f118252d |= 4;
        }
        if (!g0Var.f118273g.isEmpty()) {
            if (this.f118256h.isEmpty()) {
                this.f118256h = g0Var.f118273g;
                this.f118252d &= -9;
            } else {
                if ((this.f118252d & 8) != 8) {
                    this.f118256h = new ArrayList(this.f118256h);
                    this.f118252d |= 8;
                }
                this.f118256h.addAll(g0Var.f118273g);
            }
        }
        h(g0Var);
        this.f142242a = this.f142242a.c(g0Var.f118268b);
    }
}
