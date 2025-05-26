package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes2.dex */
public final class g extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118263b;

    /* renamed from: c, reason: collision with root package name */
    public int f118264c;

    /* renamed from: d, reason: collision with root package name */
    public List f118265d;

    @Override // zm2.b
    public final zm2.c a() {
        h g13 = g();
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
            tm2.a r1 = tm2.h.f118277h     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.h r3 = (tm2.h) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.h r4 = (tm2.h) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.g.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((h) tVar);
        return this;
    }

    public final Object clone() {
        g gVar = new g();
        gVar.f118265d = Collections.emptyList();
        gVar.i(g());
        return gVar;
    }

    public final h g() {
        h hVar = new h(this);
        int i13 = this.f118263b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        hVar.f118280c = this.f118264c;
        if ((i13 & 2) == 2) {
            this.f118265d = Collections.unmodifiableList(this.f118265d);
            this.f118263b &= -3;
        }
        hVar.f118281d = this.f118265d;
        hVar.f118279b = i14;
        return hVar;
    }

    public final void h() {
        if ((this.f118263b & 2) != 2) {
            this.f118265d = new ArrayList(this.f118265d);
            this.f118263b |= 2;
        }
    }

    public final void i(h hVar) {
        if (hVar == h.f118276g) {
            return;
        }
        if ((hVar.f118279b & 1) == 1) {
            int i13 = hVar.f118280c;
            this.f118263b = 1 | this.f118263b;
            this.f118264c = i13;
        }
        if (!hVar.f118281d.isEmpty()) {
            if (this.f118265d.isEmpty()) {
                this.f118265d = hVar.f118281d;
                this.f118263b &= -3;
            } else {
                h();
                this.f118265d.addAll(hVar.f118281d);
            }
        }
        this.f142242a = this.f142242a.c(hVar.f118278a);
    }
}
