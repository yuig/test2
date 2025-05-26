package tm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class b1 extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118179b;

    /* renamed from: c, reason: collision with root package name */
    public int f118180c;

    /* renamed from: d, reason: collision with root package name */
    public int f118181d;

    /* renamed from: e, reason: collision with root package name */
    public c1 f118182e;

    /* renamed from: f, reason: collision with root package name */
    public int f118183f;

    /* renamed from: g, reason: collision with root package name */
    public int f118184g;

    /* renamed from: h, reason: collision with root package name */
    public d1 f118185h;

    public static b1 g() {
        b1 b1Var = new b1();
        b1Var.f118182e = c1.ERROR;
        b1Var.f118185h = d1.LANGUAGE_VERSION;
        return b1Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        e1 h10 = h();
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
            tm2.a r1 = tm2.e1.f118233l     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.e1 r3 = (tm2.e1) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.e1 r4 = (tm2.e1) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.b1.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((e1) tVar);
        return this;
    }

    public final Object clone() {
        b1 b1Var = new b1();
        b1Var.f118182e = c1.ERROR;
        b1Var.f118185h = d1.LANGUAGE_VERSION;
        b1Var.i(h());
        return b1Var;
    }

    public final e1 h() {
        e1 e1Var = new e1(this);
        int i13 = this.f118179b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        e1Var.f118236c = this.f118180c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        e1Var.f118237d = this.f118181d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        e1Var.f118238e = this.f118182e;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        e1Var.f118239f = this.f118183f;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        e1Var.f118240g = this.f118184g;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        e1Var.f118241h = this.f118185h;
        e1Var.f118235b = i14;
        return e1Var;
    }

    public final void i(e1 e1Var) {
        if (e1Var == e1.f118232k) {
            return;
        }
        int i13 = e1Var.f118235b;
        if ((i13 & 1) == 1) {
            int i14 = e1Var.f118236c;
            this.f118179b = 1 | this.f118179b;
            this.f118180c = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = e1Var.f118237d;
            this.f118179b = 2 | this.f118179b;
            this.f118181d = i15;
        }
        if ((i13 & 4) == 4) {
            c1 c1Var = e1Var.f118238e;
            c1Var.getClass();
            this.f118179b = 4 | this.f118179b;
            this.f118182e = c1Var;
        }
        int i16 = e1Var.f118235b;
        if ((i16 & 8) == 8) {
            int i17 = e1Var.f118239f;
            this.f118179b = 8 | this.f118179b;
            this.f118183f = i17;
        }
        if ((i16 & 16) == 16) {
            int i18 = e1Var.f118240g;
            this.f118179b = 16 | this.f118179b;
            this.f118184g = i18;
        }
        if ((i16 & 32) == 32) {
            d1 d1Var = e1Var.f118241h;
            d1Var.getClass();
            this.f118179b = 32 | this.f118179b;
            this.f118185h = d1Var;
        }
        this.f142242a = this.f142242a.c(e1Var.f118234a);
    }
}
