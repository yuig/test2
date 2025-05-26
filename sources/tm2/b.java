package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class b extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118175b;

    /* renamed from: c, reason: collision with root package name */
    public int f118176c;

    /* renamed from: d, reason: collision with root package name */
    public int f118177d;

    /* renamed from: e, reason: collision with root package name */
    public Object f118178e;

    public b(int i13) {
        this.f118175b = i13;
        if (i13 != 1) {
            this.f118178e = e.f118204p;
        } else {
            this.f118178e = Collections.emptyList();
            this.f118177d = -1;
        }
    }

    public static b g() {
        return new b(0);
    }

    @Override // zm2.b
    public final zm2.c a() {
        switch (this.f118175b) {
            case 0:
                f h10 = h();
                if (h10.isInitialized()) {
                    return h10;
                }
                throw new UninitializedMessageException();
            default:
                y0 i13 = i();
                if (i13.isInitialized()) {
                    return i13;
                }
                throw new UninitializedMessageException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x003a  */
    @Override // zm2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final zm2.b b(zm2.h r3, zm2.k r4) {
        /*
            r2 = this;
            int r0 = r2.f118175b
            r1 = 0
            switch(r0) {
                case 0: goto L22;
                default: goto L6;
            }
        L6:
            tm2.a r0 = tm2.y0.f118556h     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            tm2.y0 r3 = (tm2.y0) r3     // Catch: java.lang.Throwable -> L12 kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L14
            r2.k(r3)
            return r2
        L12:
            r3 = move-exception
            goto L1c
        L14:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L12
            tm2.y0 r4 = (tm2.y0) r4     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L1a
        L1a:
            r3 = move-exception
            r1 = r4
        L1c:
            if (r1 == 0) goto L21
            r2.k(r1)
        L21:
            throw r3
        L22:
            tm2.a r0 = tm2.f.f118245h     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            zm2.t r3 = r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            tm2.f r3 = (tm2.f) r3     // Catch: java.lang.Throwable -> L2e kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L30
            r2.j(r3)
            return r2
        L2e:
            r3 = move-exception
            goto L38
        L30:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> L2e
            tm2.f r4 = (tm2.f) r4     // Catch: java.lang.Throwable -> L2e
            throw r3     // Catch: java.lang.Throwable -> L36
        L36:
            r3 = move-exception
            r1 = r4
        L38:
            if (r1 == 0) goto L3d
            r2.j(r1)
        L3d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.b.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        switch (this.f118175b) {
            case 0:
                j((f) tVar);
                break;
            default:
                k((y0) tVar);
                break;
        }
        return this;
    }

    public final Object clone() {
        switch (this.f118175b) {
            case 0:
                b bVar = new b(0);
                bVar.j(h());
                return bVar;
            default:
                b bVar2 = new b(1);
                bVar2.k(i());
                return bVar2;
        }
    }

    public final f h() {
        f fVar = new f(this);
        int i13 = this.f118176c;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        fVar.f118248c = this.f118177d;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        fVar.f118249d = (e) this.f118178e;
        fVar.f118247b = i14;
        return fVar;
    }

    public final y0 i() {
        y0 y0Var = new y0(this);
        int i13 = this.f118176c;
        if ((i13 & 1) == 1) {
            this.f118178e = Collections.unmodifiableList((List) this.f118178e);
            this.f118176c &= -2;
        }
        y0Var.f118559c = (List) this.f118178e;
        int i14 = (i13 & 2) != 2 ? 0 : 1;
        y0Var.f118560d = this.f118177d;
        y0Var.f118558b = i14;
        return y0Var;
    }

    public final void j(f fVar) {
        e eVar;
        if (fVar == f.f118244g) {
            return;
        }
        int i13 = fVar.f118247b;
        if ((i13 & 1) == 1) {
            int i14 = fVar.f118248c;
            this.f118176c = 1 | this.f118176c;
            this.f118177d = i14;
        }
        if ((i13 & 2) == 2) {
            e eVar2 = fVar.f118249d;
            if ((this.f118176c & 2) != 2 || (eVar = (e) this.f118178e) == e.f118204p) {
                this.f118178e = eVar2;
            } else {
                c h10 = c.h();
                h10.k(eVar);
                h10.k(eVar2);
                this.f118178e = h10.g();
            }
            this.f118176c |= 2;
        }
        this.f142242a = this.f142242a.c(fVar.f118246a);
    }

    public final void k(y0 y0Var) {
        if (y0Var == y0.f118555g) {
            return;
        }
        if (!y0Var.f118559c.isEmpty()) {
            if (((List) this.f118178e).isEmpty()) {
                this.f118178e = y0Var.f118559c;
                this.f118176c &= -2;
            } else {
                if ((this.f118176c & 1) != 1) {
                    this.f118178e = new ArrayList((List) this.f118178e);
                    this.f118176c |= 1;
                }
                ((List) this.f118178e).addAll(y0Var.f118559c);
            }
        }
        if ((y0Var.f118558b & 1) == 1) {
            int i13 = y0Var.f118560d;
            this.f118176c |= 2;
            this.f118177d = i13;
        }
        this.f142242a = this.f142242a.c(y0Var.f118557a);
    }
}
