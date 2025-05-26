package tm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class o0 extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118416b;

    /* renamed from: c, reason: collision with root package name */
    public p0 f118417c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f118418d;

    /* renamed from: e, reason: collision with root package name */
    public int f118419e;

    public static o0 g() {
        o0 o0Var = new o0();
        o0Var.f118417c = p0.INV;
        o0Var.f118418d = s0.f118450t;
        return o0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        q0 h10 = h();
        if (h10.isInitialized()) {
            return h10;
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
            tm2.a r1 = tm2.q0.f118427i     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.q0 r3 = (tm2.q0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.q0 r4 = (tm2.q0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.o0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((q0) tVar);
        return this;
    }

    public final Object clone() {
        o0 o0Var = new o0();
        o0Var.f118417c = p0.INV;
        o0Var.f118418d = s0.f118450t;
        o0Var.i(h());
        return o0Var;
    }

    public final q0 h() {
        q0 q0Var = new q0(this);
        int i13 = this.f118416b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        q0Var.f118430c = this.f118417c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        q0Var.f118431d = this.f118418d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        q0Var.f118432e = this.f118419e;
        q0Var.f118429b = i14;
        return q0Var;
    }

    public final void i(q0 q0Var) {
        s0 s0Var;
        if (q0Var == q0.f118426h) {
            return;
        }
        if ((q0Var.f118429b & 1) == 1) {
            p0 p0Var = q0Var.f118430c;
            p0Var.getClass();
            this.f118416b = 1 | this.f118416b;
            this.f118417c = p0Var;
        }
        if ((q0Var.f118429b & 2) == 2) {
            s0 s0Var2 = q0Var.f118431d;
            if ((this.f118416b & 2) != 2 || (s0Var = this.f118418d) == s0.f118450t) {
                this.f118418d = s0Var2;
            } else {
                r0 z13 = s0.z(s0Var);
                z13.l(s0Var2);
                this.f118418d = z13.k();
            }
            this.f118416b |= 2;
        }
        if ((q0Var.f118429b & 4) == 4) {
            int i13 = q0Var.f118432e;
            this.f118416b = 4 | this.f118416b;
            this.f118419e = i13;
        }
        this.f142242a = this.f142242a.c(q0Var.f118428a);
    }
}
