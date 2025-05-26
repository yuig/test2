package wm2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import zm2.o;
import zm2.t;

/* loaded from: classes4.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public int f130385b;

    /* renamed from: c, reason: collision with root package name */
    public int f130386c;

    /* renamed from: d, reason: collision with root package name */
    public int f130387d;

    /* renamed from: e, reason: collision with root package name */
    public Object f130388e;

    /* renamed from: f, reason: collision with root package name */
    public i f130389f;

    /* renamed from: g, reason: collision with root package name */
    public List f130390g;

    /* renamed from: h, reason: collision with root package name */
    public List f130391h;

    public static h g() {
        h hVar = new h();
        hVar.f130386c = 1;
        hVar.f130388e = "";
        hVar.f130389f = i.NONE;
        hVar.f130390g = Collections.emptyList();
        hVar.f130391h = Collections.emptyList();
        return hVar;
    }

    @Override // zm2.b
    public final zm2.c a() {
        j h10 = h();
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
            tm2.a r1 = wm2.j.f130393n     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            zm2.t r3 = r1.a(r3, r4)     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            wm2.j r3 = (wm2.j) r3     // Catch: java.lang.Throwable -> Ld kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> Lf
            r2.i(r3)
            return r2
        Ld:
            r3 = move-exception
            goto L17
        Lf:
            r3 = move-exception
            zm2.c r4 = r3.f80460a     // Catch: java.lang.Throwable -> Ld
            wm2.j r4 = (wm2.j) r4     // Catch: java.lang.Throwable -> Ld
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
        throw new UnsupportedOperationException("Method not decompiled: wm2.h.b(zm2.h, zm2.k):zm2.b");
    }

    @Override // zm2.o
    public final /* bridge */ /* synthetic */ o c(t tVar) {
        i((j) tVar);
        return this;
    }

    public final Object clone() {
        h hVar = new h();
        hVar.f130386c = 1;
        hVar.f130388e = "";
        hVar.f130389f = i.NONE;
        hVar.f130390g = Collections.emptyList();
        hVar.f130391h = Collections.emptyList();
        hVar.i(h());
        return hVar;
    }

    public final j h() {
        j jVar = new j(this);
        int i13 = this.f130385b;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        jVar.f130396c = this.f130386c;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        jVar.f130397d = this.f130387d;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        jVar.f130398e = this.f130388e;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        jVar.f130399f = this.f130389f;
        if ((i13 & 16) == 16) {
            this.f130390g = Collections.unmodifiableList(this.f130390g);
            this.f130385b &= -17;
        }
        jVar.f130400g = this.f130390g;
        if ((this.f130385b & 32) == 32) {
            this.f130391h = Collections.unmodifiableList(this.f130391h);
            this.f130385b &= -33;
        }
        jVar.f130402i = this.f130391h;
        jVar.f130395b = i14;
        return jVar;
    }

    public final void i(j jVar) {
        if (jVar == j.f130392m) {
            return;
        }
        int i13 = jVar.f130395b;
        if ((i13 & 1) == 1) {
            int i14 = jVar.f130396c;
            this.f130385b = 1 | this.f130385b;
            this.f130386c = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = jVar.f130397d;
            this.f130385b = 2 | this.f130385b;
            this.f130387d = i15;
        }
        if ((i13 & 4) == 4) {
            this.f130385b |= 4;
            this.f130388e = jVar.f130398e;
        }
        if ((i13 & 8) == 8) {
            i iVar = jVar.f130399f;
            iVar.getClass();
            this.f130385b = 8 | this.f130385b;
            this.f130389f = iVar;
        }
        if (!jVar.f130400g.isEmpty()) {
            if (this.f130390g.isEmpty()) {
                this.f130390g = jVar.f130400g;
                this.f130385b &= -17;
            } else {
                if ((this.f130385b & 16) != 16) {
                    this.f130390g = new ArrayList(this.f130390g);
                    this.f130385b |= 16;
                }
                this.f130390g.addAll(jVar.f130400g);
            }
        }
        if (!jVar.f130402i.isEmpty()) {
            if (this.f130391h.isEmpty()) {
                this.f130391h = jVar.f130402i;
                this.f130385b &= -33;
            } else {
                if ((this.f130385b & 32) != 32) {
                    this.f130391h = new ArrayList(this.f130391h);
                    this.f130385b |= 32;
                }
                this.f130391h.addAll(jVar.f130402i);
            }
        }
        this.f142242a = this.f142242a.c(jVar.f130394a);
    }
}
