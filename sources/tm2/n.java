package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class n extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118401b;

    /* renamed from: c, reason: collision with root package name */
    public int f118402c;

    /* renamed from: d, reason: collision with root package name */
    public List f118403d;

    public n(int i13) {
        this.f118401b = i13;
        if (i13 == 1) {
            this.f118403d = Collections.emptyList();
            return;
        }
        if (i13 == 2) {
            this.f118403d = Collections.emptyList();
        } else if (i13 != 3) {
            this.f118403d = Collections.emptyList();
        } else {
            this.f118403d = zm2.x.f142257b;
        }
    }

    public static n g() {
        return new n(0);
    }

    @Override // zm2.b
    public final zm2.c a() {
        switch (this.f118401b) {
            case 0:
                o h10 = h();
                if (h10.isInitialized()) {
                    return h10;
                }
                throw new UninitializedMessageException();
            case 1:
                m0 i13 = i();
                if (i13.isInitialized()) {
                    return i13;
                }
                throw new UninitializedMessageException();
            case 2:
                f1 k13 = k();
                if (k13.isInitialized()) {
                    return k13;
                }
                throw new UninitializedMessageException();
            default:
                n0 j13 = j();
                if (j13.isInitialized()) {
                    return j13;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x003a  */
    @Override // zm2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zm2.b b(zm2.h r3, zm2.k r4) {
        /*
            r2 = this;
            int r0 = r2.f118401b
            r1 = 0
            switch(r0) {
                case 0: goto L5a;
                case 1: goto L3e;
                case 2: goto L22;
                default: goto L6;
            }
        L6:
            tm2.a r0 = tm2.n0.f118405f     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            tm2.n0 r3 = (tm2.n0) r3     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            r2.n(r3)
            return r2
        L12:
            r3 = move-exception
            goto L1c
        L14:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L12
            tm2.n0 r4 = (tm2.n0) r4     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            r1 = r4
        L1c:
            if (r1 == 0) goto L21
            r2.n(r1)
        L21:
            throw r3
        L22:
            tm2.a r0 = tm2.f1.f118258f     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            tm2.f1 r3 = (tm2.f1) r3     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            r2.o(r3)
            return r2
        L2e:
            r3 = move-exception
            goto L38
        L30:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L2e
            tm2.f1 r4 = (tm2.f1) r4     // Catch: java.lang.Throwable -> L2e
            throw r3     // Catch: java.lang.Throwable -> L36
        L36:
            r3 = move-exception
            r1 = r4
        L38:
            if (r1 == 0) goto L3d
            r2.o(r1)
        L3d:
            throw r3
        L3e:
            tm2.a r0 = tm2.m0.f118396f     // Catch: java.lang.Throwable -> L4a kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L4c
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L4a kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L4c
            tm2.m0 r3 = (tm2.m0) r3     // Catch: java.lang.Throwable -> L4a kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L4c
            r2.m(r3)
            return r2
        L4a:
            r3 = move-exception
            goto L54
        L4c:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L4a
            tm2.m0 r4 = (tm2.m0) r4     // Catch: java.lang.Throwable -> L4a
            throw r3     // Catch: java.lang.Throwable -> L52
        L52:
            r3 = move-exception
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            r2.m(r1)
        L59:
            throw r3
        L5a:
            tm2.a r0 = tm2.o.f118411f     // Catch: java.lang.Throwable -> L66 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L68
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L66 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L68
            tm2.o r3 = (tm2.o) r3     // Catch: java.lang.Throwable -> L66 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L68
            r2.l(r3)
            return r2
        L66:
            r3 = move-exception
            goto L70
        L68:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L66
            tm2.o r4 = (tm2.o) r4     // Catch: java.lang.Throwable -> L66
            throw r3     // Catch: java.lang.Throwable -> L6e
        L6e:
            r3 = move-exception
            r1 = r4
        L70:
            if (r1 == 0) goto L75
            r2.l(r1)
        L75:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.n.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        switch (this.f118401b) {
            case 0:
                l((o) tVar);
                break;
            case 1:
                m((m0) tVar);
                break;
            case 2:
                o((f1) tVar);
                break;
            default:
                n((n0) tVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f118401b) {
            case 0:
                n nVar = new n(0);
                nVar.l(h());
                return nVar;
            case 1:
                n nVar2 = new n(1);
                nVar2.m(i());
                return nVar2;
            case 2:
                n nVar3 = new n(2);
                nVar3.o(k());
                return nVar3;
            default:
                n nVar4 = new n(3);
                nVar4.n(j());
                return nVar4;
        }
    }

    public final o h() {
        o oVar = new o(this);
        if ((this.f118402c & 1) == 1) {
            this.f118403d = Collections.unmodifiableList(this.f118403d);
            this.f118402c &= -2;
        }
        oVar.f118413b = this.f118403d;
        return oVar;
    }

    public final m0 i() {
        m0 m0Var = new m0(this);
        if ((this.f118402c & 1) == 1) {
            this.f118403d = Collections.unmodifiableList(this.f118403d);
            this.f118402c &= -2;
        }
        m0Var.f118398b = this.f118403d;
        return m0Var;
    }

    public final n0 j() {
        n0 n0Var = new n0(this);
        if ((this.f118402c & 1) == 1) {
            this.f118403d = ((zm2.y) this.f118403d).k();
            this.f118402c &= -2;
        }
        n0Var.f118407b = (zm2.y) this.f118403d;
        return n0Var;
    }

    public final f1 k() {
        f1 f1Var = new f1(this);
        if ((this.f118402c & 1) == 1) {
            this.f118403d = Collections.unmodifiableList(this.f118403d);
            this.f118402c &= -2;
        }
        f1Var.f118260b = this.f118403d;
        return f1Var;
    }

    public final void l(o oVar) {
        if (oVar == o.f118410e) {
            return;
        }
        if (!oVar.f118413b.isEmpty()) {
            if (this.f118403d.isEmpty()) {
                this.f118403d = oVar.f118413b;
                this.f118402c &= -2;
            } else {
                if ((this.f118402c & 1) != 1) {
                    this.f118403d = new ArrayList(this.f118403d);
                    this.f118402c |= 1;
                }
                this.f118403d.addAll(oVar.f118413b);
            }
        }
        this.f142242a = this.f142242a.c(oVar.f118412a);
    }

    public final void m(m0 m0Var) {
        if (m0Var == m0.f118395e) {
            return;
        }
        if (!m0Var.f118398b.isEmpty()) {
            if (this.f118403d.isEmpty()) {
                this.f118403d = m0Var.f118398b;
                this.f118402c &= -2;
            } else {
                if ((this.f118402c & 1) != 1) {
                    this.f118403d = new ArrayList(this.f118403d);
                    this.f118402c |= 1;
                }
                this.f118403d.addAll(m0Var.f118398b);
            }
        }
        this.f142242a = this.f142242a.c(m0Var.f118397a);
    }

    public final void n(n0 n0Var) {
        if (n0Var == n0.f118404e) {
            return;
        }
        if (!n0Var.f118407b.isEmpty()) {
            if (((zm2.y) this.f118403d).isEmpty()) {
                this.f118403d = n0Var.f118407b;
                this.f118402c &= -2;
            } else {
                if ((this.f118402c & 1) != 1) {
                    this.f118403d = new zm2.x((zm2.y) this.f118403d);
                    this.f118402c |= 1;
                }
                ((zm2.y) this.f118403d).addAll(n0Var.f118407b);
            }
        }
        this.f142242a = this.f142242a.c(n0Var.f118406a);
    }

    public final void o(f1 f1Var) {
        if (f1Var == f1.f118257e) {
            return;
        }
        if (!f1Var.f118260b.isEmpty()) {
            if (this.f118403d.isEmpty()) {
                this.f118403d = f1Var.f118260b;
                this.f118402c &= -2;
            } else {
                if ((this.f118402c & 1) != 1) {
                    this.f118403d = new ArrayList(this.f118403d);
                    this.f118402c |= 1;
                }
                this.f118403d.addAll(f1Var.f118260b);
            }
        }
        this.f142242a = this.f142242a.c(f1Var.f118259a);
    }
}
