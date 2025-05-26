package wm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import zm2.o;
import zm2.t;

/* loaded from: classes4.dex */
public final class g extends o {

    /* renamed from: b, reason: collision with root package name */
    public int f130382b;

    /* renamed from: c, reason: collision with root package name */
    public List f130383c;

    /* renamed from: d, reason: collision with root package name */
    public List f130384d;

    public static g g() {
        g gVar = new g();
        gVar.f130383c = Collections.emptyList();
        gVar.f130384d = Collections.emptyList();
        return gVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        k h10 = h();
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
            tm2.a r1 = wm2.k.f130407h     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            wm2.k r3 = (wm2.k) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            wm2.k r4 = (wm2.k) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: wm2.g.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ o c(t tVar) {
        i((k) tVar);
        return this;
    }

    public final Object clone() {
        g gVar = new g();
        gVar.f130383c = Collections.emptyList();
        gVar.f130384d = Collections.emptyList();
        gVar.i(h());
        return gVar;
    }

    public final k h() {
        k kVar = new k(this);
        if ((this.f130382b & 1) == 1) {
            this.f130383c = Collections.unmodifiableList(this.f130383c);
            this.f130382b &= -2;
        }
        kVar.f130409b = this.f130383c;
        if ((this.f130382b & 2) == 2) {
            this.f130384d = Collections.unmodifiableList(this.f130384d);
            this.f130382b &= -3;
        }
        kVar.f130410c = this.f130384d;
        return kVar;
    }

    public final void i(k kVar) {
        if (kVar == k.f130406g) {
            return;
        }
        if (!kVar.f130409b.isEmpty()) {
            if (this.f130383c.isEmpty()) {
                this.f130383c = kVar.f130409b;
                this.f130382b &= -2;
            } else {
                if ((this.f130382b & 1) != 1) {
                    this.f130383c = new ArrayList(this.f130383c);
                    this.f130382b |= 1;
                }
                this.f130383c.addAll(kVar.f130409b);
            }
        }
        if (!kVar.f130410c.isEmpty()) {
            if (this.f130384d.isEmpty()) {
                this.f130384d = kVar.f130410c;
                this.f130382b &= -3;
            } else {
                if ((this.f130382b & 2) != 2) {
                    this.f130384d = new ArrayList(this.f130384d);
                    this.f130382b |= 2;
                }
                this.f130384d.addAll(kVar.f130410c);
            }
        }
        this.f142242a = this.f142242a.c(kVar.f130408a);
    }
}
