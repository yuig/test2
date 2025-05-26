package wm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class c extends o {

    /* renamed from: b, reason: collision with root package name */
    public int f130354b;

    /* renamed from: c, reason: collision with root package name */
    public int f130355c;

    /* renamed from: d, reason: collision with root package name */
    public int f130356d;

    @Override // zm2.b
    public final zm2.c a() {
        d g13 = g();
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
            tm2.a r1 = wm2.d.f130358h     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            wm2.d r3 = (wm2.d) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.h(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            wm2.d r4 = (wm2.d) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.h(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: wm2.c.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ o c(t tVar) {
        h((d) tVar);
        return this;
    }

    public final Object clone() {
        c cVar = new c();
        cVar.h(g());
        return cVar;
    }

    public final d g() {
        d dVar = new d(this);
        int i13 = this.f130354b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        dVar.f130361c = this.f130355c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        dVar.f130362d = this.f130356d;
        dVar.f130360b = i14;
        return dVar;
    }

    public final void h(d dVar) {
        if (dVar == d.f130357g) {
            return;
        }
        if ((dVar.f130360b & 1) == 1) {
            i(dVar.f130361c);
        }
        if ((dVar.f130360b & 2) == 2) {
            int i13 = dVar.f130362d;
            this.f130354b = 2 | this.f130354b;
            this.f130356d = i13;
        }
        this.f142242a = this.f142242a.c(dVar.f130359a);
    }

    public final void i(int i13) {
        this.f130354b |= 1;
        this.f130355c = i13;
    }
}
