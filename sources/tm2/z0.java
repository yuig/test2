package tm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class z0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118578d;

    /* renamed from: e, reason: collision with root package name */
    public int f118579e;

    /* renamed from: f, reason: collision with root package name */
    public int f118580f;

    /* renamed from: g, reason: collision with root package name */
    public s0 f118581g;

    /* renamed from: h, reason: collision with root package name */
    public int f118582h;

    /* renamed from: i, reason: collision with root package name */
    public s0 f118583i;

    /* renamed from: j, reason: collision with root package name */
    public int f118584j;

    public static z0 i() {
        z0 z0Var = new z0();
        s0 s0Var = s0.f118450t;
        z0Var.f118581g = s0Var;
        z0Var.f118583i = s0Var;
        return z0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        a1 j13 = j();
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
            tm2.a r1 = tm2.a1.f118164m     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.a1 r3 = (tm2.a1) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.a1 r4 = (tm2.a1) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.z0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((a1) tVar);
        return this;
    }

    public final Object clone() {
        z0 z0Var = new z0();
        s0 s0Var = s0.f118450t;
        z0Var.f118581g = s0Var;
        z0Var.f118583i = s0Var;
        z0Var.k(j());
        return z0Var;
    }

    public final a1 j() {
        a1 a1Var = new a1(this);
        int i13 = this.f118578d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        a1Var.f118167d = this.f118579e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        a1Var.f118168e = this.f118580f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        a1Var.f118169f = this.f118581g;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        a1Var.f118170g = this.f118582h;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        a1Var.f118171h = this.f118583i;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        a1Var.f118172i = this.f118584j;
        a1Var.f118166c = i14;
        return a1Var;
    }

    public final void k(a1 a1Var) {
        s0 s0Var;
        s0 s0Var2;
        if (a1Var == a1.f118163l) {
            return;
        }
        int i13 = a1Var.f118166c;
        if ((i13 & 1) == 1) {
            int i14 = a1Var.f118167d;
            this.f118578d = 1 | this.f118578d;
            this.f118579e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = a1Var.f118168e;
            this.f118578d = 2 | this.f118578d;
            this.f118580f = i15;
        }
        if ((i13 & 4) == 4) {
            s0 s0Var3 = a1Var.f118169f;
            if ((this.f118578d & 4) != 4 || (s0Var2 = this.f118581g) == s0.f118450t) {
                this.f118581g = s0Var3;
            } else {
                r0 z13 = s0.z(s0Var2);
                z13.l(s0Var3);
                this.f118581g = z13.k();
            }
            this.f118578d |= 4;
        }
        int i16 = a1Var.f118166c;
        if ((i16 & 8) == 8) {
            int i17 = a1Var.f118170g;
            this.f118578d = 8 | this.f118578d;
            this.f118582h = i17;
        }
        if ((i16 & 16) == 16) {
            s0 s0Var4 = a1Var.f118171h;
            if ((this.f118578d & 16) != 16 || (s0Var = this.f118583i) == s0.f118450t) {
                this.f118583i = s0Var4;
            } else {
                r0 z14 = s0.z(s0Var);
                z14.l(s0Var4);
                this.f118583i = z14.k();
            }
            this.f118578d |= 16;
        }
        if ((a1Var.f118166c & 32) == 32) {
            int i18 = a1Var.f118172i;
            this.f118578d = 32 | this.f118578d;
            this.f118584j = i18;
        }
        h(a1Var);
        this.f142242a = this.f142242a.c(a1Var.f118165b);
    }
}
