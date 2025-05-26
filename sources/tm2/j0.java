package tm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class j0 extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118343b;

    /* renamed from: c, reason: collision with root package name */
    public int f118344c;

    /* renamed from: d, reason: collision with root package name */
    public int f118345d;

    /* renamed from: e, reason: collision with root package name */
    public k0 f118346e;

    public static j0 g() {
        j0 j0Var = new j0();
        j0Var.f118344c = -1;
        j0Var.f118346e = k0.PACKAGE;
        return j0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        l0 h10 = h();
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
            tm2.a r1 = tm2.l0.f118378i     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.l0 r3 = (tm2.l0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.l0 r4 = (tm2.l0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.j0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((l0) tVar);
        return this;
    }

    public final Object clone() {
        j0 j0Var = new j0();
        j0Var.f118344c = -1;
        j0Var.f118346e = k0.PACKAGE;
        j0Var.i(h());
        return j0Var;
    }

    public final l0 h() {
        l0 l0Var = new l0(this);
        int i13 = this.f118343b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        l0Var.f118381c = this.f118344c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        l0Var.f118382d = this.f118345d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        l0Var.f118383e = this.f118346e;
        l0Var.f118380b = i14;
        return l0Var;
    }

    public final void i(l0 l0Var) {
        if (l0Var == l0.f118377h) {
            return;
        }
        int i13 = l0Var.f118380b;
        if ((i13 & 1) == 1) {
            int i14 = l0Var.f118381c;
            this.f118343b = 1 | this.f118343b;
            this.f118344c = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = l0Var.f118382d;
            this.f118343b = 2 | this.f118343b;
            this.f118345d = i15;
        }
        if ((i13 & 4) == 4) {
            k0 k0Var = l0Var.f118383e;
            k0Var.getClass();
            this.f118343b = 4 | this.f118343b;
            this.f118346e = k0Var;
        }
        this.f142242a = this.f142242a.c(l0Var.f118379a);
    }
}
