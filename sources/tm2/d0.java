package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class d0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118198d;

    /* renamed from: e, reason: collision with root package name */
    public List f118199e;

    /* renamed from: f, reason: collision with root package name */
    public List f118200f;

    /* renamed from: g, reason: collision with root package name */
    public List f118201g;

    /* renamed from: h, reason: collision with root package name */
    public y0 f118202h;

    /* renamed from: i, reason: collision with root package name */
    public f1 f118203i;

    public static d0 k() {
        d0 d0Var = new d0();
        d0Var.f118199e = Collections.emptyList();
        d0Var.f118200f = Collections.emptyList();
        d0Var.f118201g = Collections.emptyList();
        d0Var.f118202h = y0.f118555g;
        d0Var.f118203i = f1.f118257e;
        return d0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        e0 j13 = j();
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
            tm2.a r1 = tm2.e0.f118222l     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.e0 r3 = (tm2.e0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.l(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.e0 r4 = (tm2.e0) r4     // Catch: java.lang.Throwable -> Ld
            throw r3     // Catch: java.lang.Throwable -> L15
        L15:
            r3 = move-exception
            r0 = r4
        L17:
            if (r0 == 0) goto L1c
            r2.l(r0)
        L1c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: tm2.d0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        l((e0) tVar);
        return this;
    }

    public final Object clone() {
        d0 k13 = k();
        k13.l(j());
        return k13;
    }

    public final e0 j() {
        e0 e0Var = new e0(this);
        int i13 = this.f118198d;
        if ((i13 & 1) == 1) {
            this.f118199e = Collections.unmodifiableList(this.f118199e);
            this.f118198d &= -2;
        }
        e0Var.f118225d = this.f118199e;
        if ((this.f118198d & 2) == 2) {
            this.f118200f = Collections.unmodifiableList(this.f118200f);
            this.f118198d &= -3;
        }
        e0Var.f118226e = this.f118200f;
        if ((this.f118198d & 4) == 4) {
            this.f118201g = Collections.unmodifiableList(this.f118201g);
            this.f118198d &= -5;
        }
        e0Var.f118227f = this.f118201g;
        int i14 = (i13 & 8) != 8 ? 0 : 1;
        e0Var.f118228g = this.f118202h;
        if ((i13 & 16) == 16) {
            i14 |= 2;
        }
        e0Var.f118229h = this.f118203i;
        e0Var.f118224c = i14;
        return e0Var;
    }

    public final void l(e0 e0Var) {
        f1 f1Var;
        y0 y0Var;
        if (e0Var == e0.f118221k) {
            return;
        }
        if (!e0Var.f118225d.isEmpty()) {
            if (this.f118199e.isEmpty()) {
                this.f118199e = e0Var.f118225d;
                this.f118198d &= -2;
            } else {
                if ((this.f118198d & 1) != 1) {
                    this.f118199e = new ArrayList(this.f118199e);
                    this.f118198d |= 1;
                }
                this.f118199e.addAll(e0Var.f118225d);
            }
        }
        if (!e0Var.f118226e.isEmpty()) {
            if (this.f118200f.isEmpty()) {
                this.f118200f = e0Var.f118226e;
                this.f118198d &= -3;
            } else {
                if ((this.f118198d & 2) != 2) {
                    this.f118200f = new ArrayList(this.f118200f);
                    this.f118198d |= 2;
                }
                this.f118200f.addAll(e0Var.f118226e);
            }
        }
        if (!e0Var.f118227f.isEmpty()) {
            if (this.f118201g.isEmpty()) {
                this.f118201g = e0Var.f118227f;
                this.f118198d &= -5;
            } else {
                if ((this.f118198d & 4) != 4) {
                    this.f118201g = new ArrayList(this.f118201g);
                    this.f118198d |= 4;
                }
                this.f118201g.addAll(e0Var.f118227f);
            }
        }
        if ((e0Var.f118224c & 1) == 1) {
            y0 y0Var2 = e0Var.f118228g;
            if ((this.f118198d & 8) != 8 || (y0Var = this.f118202h) == y0.f118555g) {
                this.f118202h = y0Var2;
            } else {
                b i13 = y0.i(y0Var);
                i13.k(y0Var2);
                this.f118202h = i13.i();
            }
            this.f118198d |= 8;
        }
        if ((e0Var.f118224c & 2) == 2) {
            f1 f1Var2 = e0Var.f118229h;
            if ((this.f118198d & 16) != 16 || (f1Var = this.f118203i) == f1.f118257e) {
                this.f118203i = f1Var2;
            } else {
                n nVar = new n(2);
                nVar.o(f1Var);
                nVar.o(f1Var2);
                this.f118203i = nVar.k();
            }
            this.f118198d |= 16;
        }
        h(e0Var);
        this.f142242a = this.f142242a.c(e0Var.f118223b);
    }
}
