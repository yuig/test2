package j8;

import a.z0;
import a7.o0;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import g8.b1;
import g8.e0;
import j1.s2;
import java.io.IOException;
import java.util.Objects;
import l9.i;
import l9.l;
import m7.h;
import m7.h0;
import m7.i0;
import m7.l0;
import pk.c1;
import pk.v2;

/* loaded from: classes.dex */
public final class f extends h implements Handler.Callback {
    public i A;
    public int B;
    public final Handler C;
    public final e D;
    public final qq2.c E;
    public boolean F;
    public boolean G;
    public androidx.media3.common.b H;
    public long I;

    /* renamed from: J, reason: collision with root package name */
    public long f74919J;
    public IOException K;

    /* renamed from: r, reason: collision with root package name */
    public final bk.f f74920r;

    /* renamed from: s, reason: collision with root package name */
    public final k7.e f74921s;

    /* renamed from: t, reason: collision with root package name */
    public a f74922t;

    /* renamed from: u, reason: collision with root package name */
    public final d f74923u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f74924v;

    /* renamed from: w, reason: collision with root package name */
    public int f74925w;

    /* renamed from: x, reason: collision with root package name */
    public l9.e f74926x;

    /* renamed from: y, reason: collision with root package name */
    public l9.h f74927y;

    /* renamed from: z, reason: collision with root package name */
    public i f74928z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i0 i0Var, Looper looper) {
        super(3);
        h1.b bVar = d.Ao;
        this.D = i0Var;
        this.C = looper == null ? null : new Handler(looper, this);
        this.f74923u = bVar;
        this.f74920r = new bk.f();
        this.f74921s = new k7.e(1);
        this.E = new qq2.c(2);
        this.f74919J = -9223372036854775807L;
        this.I = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x01eb, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // m7.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A(long r19, long r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.f.A(long, long):void");
    }

    @Override // m7.h
    public final int F(androidx.media3.common.b bVar) {
        if (!Objects.equals(bVar.f18765o, "application/x-media3-cues")) {
            h1.b bVar2 = (h1.b) this.f74923u;
            bVar2.getClass();
            if (!((bk.f) bVar2.f66449b).r(bVar)) {
                String str = bVar.f18765o;
                if (!Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                    return o0.p(str) ? h.f(1, 0, 0, 0) : h.f(0, 0, 0, 0);
                }
            }
        }
        return h.f(bVar.N == 0 ? 4 : 2, 0, 0, 0);
    }

    public final void H() {
        bf.b.s("Legacy decoding is disabled, can't handle " + this.H.f18765o + " samples (expected application/x-media3-cues).", Objects.equals(this.H.f18765o, "application/cea-608") || Objects.equals(this.H.f18765o, "application/x-mp4-cea-608") || Objects.equals(this.H.f18765o, "application/cea-708"));
    }

    public final long I() {
        if (this.B == -1) {
            return Long.MAX_VALUE;
        }
        this.f74928z.getClass();
        if (this.B >= this.f74928z.d()) {
            return Long.MAX_VALUE;
        }
        return this.f74928z.c(this.B);
    }

    public final long J(long j13) {
        bf.b.t(j13 != -9223372036854775807L);
        return j13 - this.f86180k;
    }

    public final void K() {
        l9.e bVar;
        this.f74924v = true;
        androidx.media3.common.b bVar2 = this.H;
        bVar2.getClass();
        h1.b bVar3 = (h1.b) this.f74923u;
        bVar3.getClass();
        String str = bVar2.f18765o;
        if (str != null) {
            int hashCode = str.hashCode();
            char c13 = 65535;
            if (hashCode != 930165504) {
                if (hashCode != 1566015601) {
                    if (hashCode == 1566016562 && str.equals("application/cea-708")) {
                        c13 = 2;
                    }
                } else if (str.equals("application/cea-608")) {
                    c13 = 1;
                }
            } else if (str.equals("application/x-mp4-cea-608")) {
                c13 = 0;
            }
            int i13 = bVar2.f18750J;
            if (c13 == 0 || c13 == 1) {
                bVar = new m9.c(str, i13);
            } else if (c13 == 2) {
                bVar = new m9.f(i13, bVar2.f18768r);
            }
            this.f74926x = bVar;
            bVar.d(this.f86181l);
        }
        if (!((bk.f) bVar3.f66449b).r(bVar2)) {
            throw new IllegalArgumentException(a.a.j("Attempted to create decoder for unsupported MIME type: ", str));
        }
        l p13 = ((bk.f) bVar3.f66449b).p(bVar2);
        p13.getClass().getSimpleName().concat("Decoder");
        bVar = new b(p13);
        this.f74926x = bVar;
        bVar.d(this.f86181l);
    }

    public final void L(c7.c cVar) {
        c1 c1Var = cVar.f26702a;
        e eVar = this.D;
        ((i0) eVar).f86205a.f86277n.m(27, new h0(c1Var));
        l0 l0Var = ((i0) eVar).f86205a;
        l0Var.f86260e0 = cVar;
        l0Var.f86277n.m(27, new z0(cVar, 22));
    }

    public final void M() {
        this.f74927y = null;
        this.B = -1;
        i iVar = this.f74928z;
        if (iVar != null) {
            iVar.o();
            this.f74928z = null;
        }
        i iVar2 = this.A;
        if (iVar2 != null) {
            iVar2.o();
            this.A = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        L((c7.c) message.obj);
        return true;
    }

    @Override // m7.h
    public final String m() {
        return "TextRenderer";
    }

    @Override // m7.h
    public final boolean o() {
        return this.G;
    }

    @Override // m7.h
    public final boolean q() {
        if (this.H == null) {
            return true;
        }
        if (this.K == null) {
            try {
                b1 b1Var = this.f86178i;
                b1Var.getClass();
                b1Var.b();
            } catch (IOException e13) {
                this.K = e13;
            }
        }
        if (this.K != null) {
            androidx.media3.common.b bVar = this.H;
            bVar.getClass();
            if (Objects.equals(bVar.f18765o, "application/x-media3-cues")) {
                a aVar = this.f74922t;
                aVar.getClass();
                return aVar.d(this.I) != Long.MIN_VALUE;
            }
            if (!this.G) {
                if (this.F) {
                    i iVar = this.f74928z;
                    long j13 = this.I;
                    if (iVar == null || iVar.c(iVar.d() - 1) <= j13) {
                        i iVar2 = this.A;
                        long j14 = this.I;
                        if ((iVar2 == null || iVar2.c(iVar2.d() - 1) <= j14) && this.f74927y != null) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // m7.h
    public final void r() {
        this.H = null;
        this.f74919J = -9223372036854775807L;
        v2 v2Var = v2.f100502e;
        J(this.I);
        c7.c cVar = new c7.c(v2Var);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            L(cVar);
        }
        this.I = -9223372036854775807L;
        if (this.f74926x != null) {
            M();
            l9.e eVar = this.f74926x;
            eVar.getClass();
            eVar.a();
            this.f74926x = null;
            this.f74925w = 0;
        }
    }

    @Override // m7.h
    public final void t(long j13, boolean z13) {
        this.I = j13;
        a aVar = this.f74922t;
        if (aVar != null) {
            aVar.clear();
        }
        v2 v2Var = v2.f100502e;
        J(this.I);
        c7.c cVar = new c7.c(v2Var);
        Handler handler = this.C;
        if (handler != null) {
            handler.obtainMessage(1, cVar).sendToTarget();
        } else {
            L(cVar);
        }
        this.F = false;
        this.G = false;
        this.f74919J = -9223372036854775807L;
        androidx.media3.common.b bVar = this.H;
        if (bVar == null || Objects.equals(bVar.f18765o, "application/x-media3-cues")) {
            return;
        }
        if (this.f74925w == 0) {
            M();
            l9.e eVar = this.f74926x;
            eVar.getClass();
            eVar.flush();
            eVar.d(this.f86181l);
            return;
        }
        M();
        l9.e eVar2 = this.f74926x;
        eVar2.getClass();
        eVar2.a();
        this.f74926x = null;
        this.f74925w = 0;
        K();
    }

    @Override // m7.h
    public final void y(androidx.media3.common.b[] bVarArr, long j13, long j14, e0 e0Var) {
        androidx.media3.common.b bVar = bVarArr[0];
        this.H = bVar;
        if (Objects.equals(bVar.f18765o, "application/x-media3-cues")) {
            this.f74922t = this.H.K == 1 ? new c() : new s2();
            return;
        }
        H();
        if (this.f74926x != null) {
            this.f74925w = 1;
        } else {
            K();
        }
    }
}
