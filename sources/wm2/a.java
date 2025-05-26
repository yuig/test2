package wm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import zm2.o;
import zm2.t;

/* loaded from: classes4.dex */
public final class a extends o {

    /* renamed from: b, reason: collision with root package name */
    public int f130343b;

    /* renamed from: c, reason: collision with root package name */
    public int f130344c;

    /* renamed from: d, reason: collision with root package name */
    public int f130345d;

    public static a g() {
        return new a();
    }

    @Override // zm2.b
    public final zm2.c a() {
        b h10 = h();
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
            tm2.a r1 = wm2.b.f130347h     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            wm2.b r3 = (wm2.b) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            wm2.b r4 = (wm2.b) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: wm2.a.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ o c(t tVar) {
        i((b) tVar);
        return this;
    }

    public final Object clone() {
        a aVar = new a();
        aVar.i(h());
        return aVar;
    }

    public final b h() {
        b bVar = new b(this);
        int i13 = this.f130343b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        bVar.f130350c = this.f130344c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        bVar.f130351d = this.f130345d;
        bVar.f130349b = i14;
        return bVar;
    }

    public final void i(b bVar) {
        if (bVar == b.f130346g) {
            return;
        }
        int i13 = bVar.f130349b;
        if ((i13 & 1) == 1) {
            int i14 = bVar.f130350c;
            this.f130343b = 1 | this.f130343b;
            this.f130344c = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = bVar.f130351d;
            this.f130343b = 2 | this.f130343b;
            this.f130345d = i15;
        }
        this.f142242a = this.f142242a.c(bVar.f130348a);
    }
}
