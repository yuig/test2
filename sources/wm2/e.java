package wm2;

import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import zm2.o;
import zm2.t;

/* loaded from: classes2.dex */
public final class e extends o {

    /* renamed from: b, reason: collision with root package name */
    public int f130365b;

    /* renamed from: c, reason: collision with root package name */
    public b f130366c;

    /* renamed from: d, reason: collision with root package name */
    public d f130367d;

    /* renamed from: e, reason: collision with root package name */
    public d f130368e;

    /* renamed from: f, reason: collision with root package name */
    public d f130369f;

    /* renamed from: g, reason: collision with root package name */
    public d f130370g;

    public static e h() {
        e eVar = new e();
        eVar.f130366c = b.f130346g;
        d dVar = d.f130357g;
        eVar.f130367d = dVar;
        eVar.f130368e = dVar;
        eVar.f130369f = dVar;
        eVar.f130370g = dVar;
        return eVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        f g13 = g();
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
            tm2.a r1 = wm2.f.f130372k     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            wm2.f r3 = (wm2.f) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.j(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            wm2.f r4 = (wm2.f) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: wm2.e.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ o c(t tVar) {
        j((f) tVar);
        return this;
    }

    public final Object clone() {
        e h10 = h();
        h10.j(g());
        return h10;
    }

    public final f g() {
        f fVar = new f(this);
        int i13 = this.f130365b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        fVar.f130375c = this.f130366c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        fVar.f130376d = this.f130367d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        fVar.f130377e = this.f130368e;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        fVar.f130378f = this.f130369f;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        fVar.f130379g = this.f130370g;
        fVar.f130374b = i14;
        return fVar;
    }

    public final void i(d dVar) {
        d dVar2;
        if ((this.f130365b & 16) != 16 || (dVar2 = this.f130370g) == d.f130357g) {
            this.f130370g = dVar;
        } else {
            c h10 = d.h(dVar2);
            h10.h(dVar);
            this.f130370g = h10.g();
        }
        this.f130365b |= 16;
    }

    public final void j(f fVar) {
        d dVar;
        b bVar;
        if (fVar == f.f130371j) {
            return;
        }
        if ((fVar.f130374b & 1) == 1) {
            b bVar2 = fVar.f130375c;
            if ((this.f130365b & 1) != 1 || (bVar = this.f130366c) == b.f130346g) {
                this.f130366c = bVar2;
            } else {
                a h10 = b.h(bVar);
                h10.i(bVar2);
                this.f130366c = h10.h();
            }
            this.f130365b |= 1;
        }
        if ((fVar.f130374b & 2) == 2) {
            l(fVar.f130376d);
        }
        if ((fVar.f130374b & 4) == 4) {
            d dVar2 = fVar.f130377e;
            if ((this.f130365b & 4) != 4 || (dVar = this.f130368e) == d.f130357g) {
                this.f130368e = dVar2;
            } else {
                c h13 = d.h(dVar);
                h13.h(dVar2);
                this.f130368e = h13.g();
            }
            this.f130365b |= 4;
        }
        if ((fVar.f130374b & 8) == 8) {
            k(fVar.f130378f);
        }
        if ((fVar.f130374b & 16) == 16) {
            i(fVar.f130379g);
        }
        this.f142242a = this.f142242a.c(fVar.f130373a);
    }

    public final void k(d dVar) {
        d dVar2;
        if ((this.f130365b & 8) != 8 || (dVar2 = this.f130369f) == d.f130357g) {
            this.f130369f = dVar;
        } else {
            c h10 = d.h(dVar2);
            h10.h(dVar);
            this.f130369f = h10.g();
        }
        this.f130365b |= 8;
    }

    public final void l(d dVar) {
        d dVar2;
        if ((this.f130365b & 2) != 2 || (dVar2 = this.f130367d) == d.f130357g) {
            this.f130367d = dVar;
        } else {
            c h10 = d.h(dVar2);
            h10.h(dVar);
            this.f130367d = h10.g();
        }
        this.f130365b |= 2;
    }
}
