package tm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;

/* loaded from: classes4.dex */
public final class w extends zm2.o {

    /* renamed from: b, reason: collision with root package name */
    public int f118521b;

    /* renamed from: c, reason: collision with root package name */
    public int f118522c;

    /* renamed from: d, reason: collision with root package name */
    public int f118523d;

    /* renamed from: e, reason: collision with root package name */
    public x f118524e;

    /* renamed from: f, reason: collision with root package name */
    public s0 f118525f;

    /* renamed from: g, reason: collision with root package name */
    public int f118526g;

    /* renamed from: h, reason: collision with root package name */
    public List f118527h;

    /* renamed from: i, reason: collision with root package name */
    public List f118528i;

    public static w h() {
        w wVar = new w();
        wVar.f118524e = x.TRUE;
        wVar.f118525f = s0.f118450t;
        wVar.f118527h = Collections.emptyList();
        wVar.f118528i = Collections.emptyList();
        return wVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        y g13 = g();
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
            tm2.p r1 = tm2.y.f118543m     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            tm2.y r3 = (tm2.y) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            tm2.y r4 = (tm2.y) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: tm2.w.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ zm2.o c(zm2.t tVar) {
        i((y) tVar);
        return this;
    }

    public final Object clone() {
        w h10 = h();
        h10.i(g());
        return h10;
    }

    public final y g() {
        y yVar = new y(this);
        int i13 = this.f118521b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        yVar.f118546c = this.f118522c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        yVar.f118547d = this.f118523d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        yVar.f118548e = this.f118524e;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        yVar.f118549f = this.f118525f;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        yVar.f118550g = this.f118526g;
        if ((i13 & 32) == 32) {
            this.f118527h = Collections.unmodifiableList(this.f118527h);
            this.f118521b &= -33;
        }
        yVar.f118551h = this.f118527h;
        if ((this.f118521b & 64) == 64) {
            this.f118528i = Collections.unmodifiableList(this.f118528i);
            this.f118521b &= -65;
        }
        yVar.f118552i = this.f118528i;
        yVar.f118545b = i14;
        return yVar;
    }

    public final void i(y yVar) {
        s0 s0Var;
        if (yVar == y.f118542l) {
            return;
        }
        int i13 = yVar.f118545b;
        if ((i13 & 1) == 1) {
            int i14 = yVar.f118546c;
            this.f118521b = 1 | this.f118521b;
            this.f118522c = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = yVar.f118547d;
            this.f118521b = 2 | this.f118521b;
            this.f118523d = i15;
        }
        if ((i13 & 4) == 4) {
            x xVar = yVar.f118548e;
            xVar.getClass();
            this.f118521b = 4 | this.f118521b;
            this.f118524e = xVar;
        }
        if ((yVar.f118545b & 8) == 8) {
            s0 s0Var2 = yVar.f118549f;
            if ((this.f118521b & 8) != 8 || (s0Var = this.f118525f) == s0.f118450t) {
                this.f118525f = s0Var2;
            } else {
                r0 z13 = s0.z(s0Var);
                z13.l(s0Var2);
                this.f118525f = z13.k();
            }
            this.f118521b |= 8;
        }
        if ((yVar.f118545b & 16) == 16) {
            int i16 = yVar.f118550g;
            this.f118521b = 16 | this.f118521b;
            this.f118526g = i16;
        }
        if (!yVar.f118551h.isEmpty()) {
            if (this.f118527h.isEmpty()) {
                this.f118527h = yVar.f118551h;
                this.f118521b &= -33;
            } else {
                if ((this.f118521b & 32) != 32) {
                    this.f118527h = new ArrayList(this.f118527h);
                    this.f118521b |= 32;
                }
                this.f118527h.addAll(yVar.f118551h);
            }
        }
        if (!yVar.f118552i.isEmpty()) {
            if (this.f118528i.isEmpty()) {
                this.f118528i = yVar.f118552i;
                this.f118521b &= -65;
            } else {
                if ((this.f118521b & 64) != 64) {
                    this.f118528i = new ArrayList(this.f118528i);
                    this.f118521b |= 64;
                }
                this.f118528i.addAll(yVar.f118552i);
            }
        }
        this.f142242a = this.f142242a.c(yVar.f118544a);
    }
}
