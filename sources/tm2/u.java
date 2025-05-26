package tm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class u extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118490d;

    /* renamed from: e, reason: collision with root package name */
    public int f118491e;

    public static u i() {
        return new u();
    }

    @Override // zm2.b
    public final zm2.c a() {
        v vVar = new v(this);
        int i13 = (this.f118490d & 1) != 1 ? 0 : 1;
        vVar.f118511d = this.f118491e;
        vVar.f118510c = i13;
        if (vVar.isInitialized()) {
            return vVar;
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
            tm2.a r1 = tm2.v.f118508h     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.v r3 = (tm2.v) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.j(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.v r4 = (tm2.v) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.j(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.u.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        j((v) tVar);
        return this;
    }

    public final Object clone() {
        u uVar = new u();
        v vVar = new v(this);
        int i13 = (this.f118490d & 1) != 1 ? 0 : 1;
        vVar.f118511d = this.f118491e;
        vVar.f118510c = i13;
        uVar.j(vVar);
        return uVar;
    }

    public final void j(v vVar) {
        if (vVar == v.f118507g) {
            return;
        }
        if ((vVar.f118510c & 1) == 1) {
            int i13 = vVar.f118511d;
            this.f118490d = 1 | this.f118490d;
            this.f118491e = i13;
        }
        h(vVar);
        this.f142242a = this.f142242a.c(vVar.f118509b);
    }
}
