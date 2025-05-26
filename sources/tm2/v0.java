package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class v0 extends zm2.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118514d;

    /* renamed from: e, reason: collision with root package name */
    public int f118515e;

    /* renamed from: f, reason: collision with root package name */
    public int f118516f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f118517g;

    /* renamed from: h, reason: collision with root package name */
    public w0 f118518h;

    /* renamed from: i, reason: collision with root package name */
    public List f118519i;

    /* renamed from: j, reason: collision with root package name */
    public List f118520j;

    public static v0 i() {
        v0 v0Var = new v0();
        v0Var.f118518h = w0.INV;
        v0Var.f118519i = Collections.emptyList();
        v0Var.f118520j = Collections.emptyList();
        return v0Var;
    }

    @Override // zm2.b
    public final zm2.c a() {
        x0 j13 = j();
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
            tm2.a r1 = tm2.x0.f118530n     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.x0 r3 = (tm2.x0) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.k(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.x0 r4 = (tm2.x0) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.v0.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        k((x0) tVar);
        return this;
    }

    public final Object clone() {
        v0 v0Var = new v0();
        v0Var.f118518h = w0.INV;
        v0Var.f118519i = Collections.emptyList();
        v0Var.f118520j = Collections.emptyList();
        v0Var.k(j());
        return v0Var;
    }

    public final x0 j() {
        x0 x0Var = new x0(this);
        int i13 = this.f118514d;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        x0Var.f118533d = this.f118515e;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        x0Var.f118534e = this.f118516f;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        x0Var.f118535f = this.f118517g;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        x0Var.f118536g = this.f118518h;
        if ((i13 & 16) == 16) {
            this.f118519i = Collections.unmodifiableList(this.f118519i);
            this.f118514d &= -17;
        }
        x0Var.f118537h = this.f118519i;
        if ((this.f118514d & 32) == 32) {
            this.f118520j = Collections.unmodifiableList(this.f118520j);
            this.f118514d &= -33;
        }
        x0Var.f118538i = this.f118520j;
        x0Var.f118532c = i14;
        return x0Var;
    }

    public final void k(x0 x0Var) {
        if (x0Var == x0.f118529m) {
            return;
        }
        int i13 = x0Var.f118532c;
        if ((i13 & 1) == 1) {
            int i14 = x0Var.f118533d;
            this.f118514d = 1 | this.f118514d;
            this.f118515e = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = x0Var.f118534e;
            this.f118514d = 2 | this.f118514d;
            this.f118516f = i15;
        }
        if ((i13 & 4) == 4) {
            boolean z13 = x0Var.f118535f;
            this.f118514d = 4 | this.f118514d;
            this.f118517g = z13;
        }
        if ((i13 & 8) == 8) {
            w0 w0Var = x0Var.f118536g;
            w0Var.getClass();
            this.f118514d = 8 | this.f118514d;
            this.f118518h = w0Var;
        }
        if (!x0Var.f118537h.isEmpty()) {
            if (this.f118519i.isEmpty()) {
                this.f118519i = x0Var.f118537h;
                this.f118514d &= -17;
            } else {
                if ((this.f118514d & 16) != 16) {
                    this.f118519i = new ArrayList(this.f118519i);
                    this.f118514d |= 16;
                }
                this.f118519i.addAll(x0Var.f118537h);
            }
        }
        if (!x0Var.f118538i.isEmpty()) {
            if (this.f118520j.isEmpty()) {
                this.f118520j = x0Var.f118538i;
                this.f118514d &= -33;
            } else {
                if ((this.f118514d & 32) != 32) {
                    this.f118520j = new ArrayList(this.f118520j);
                    this.f118514d |= 32;
                }
                this.f118520j.addAll(x0Var.f118538i);
            }
        }
        h(x0Var);
        this.f142242a = this.f142242a.c(x0Var.f118531b);
    }
}
