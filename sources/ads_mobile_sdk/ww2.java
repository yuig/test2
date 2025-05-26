package ads_mobile_sdk;

import a.ef;
import a.ff;
import a.p9;
import a.zb;
import com.google.common.util.concurrent.n;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class ww2 {

    /* renamed from: a, reason: collision with root package name */
    public final a.p3 f13286a;

    /* renamed from: b, reason: collision with root package name */
    public final a.ya f13287b;

    /* renamed from: c, reason: collision with root package name */
    public final p9 f13288c;

    /* renamed from: d, reason: collision with root package name */
    public final bt2 f13289d;

    /* renamed from: e, reason: collision with root package name */
    public final zb f13290e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13291f;

    /* renamed from: g, reason: collision with root package name */
    public long f13292g = 0;

    public ww2(a.p3 p3Var, a.ya yaVar, p9 p9Var, bt2 bt2Var, zb zbVar, long j13) {
        this.f13286a = p3Var;
        this.f13287b = yaVar;
        this.f13288c = p9Var;
        this.f13289d = bt2Var;
        this.f13290e = zbVar;
        this.f13291f = j13;
    }

    public static /* synthetic */ x12 a(Throwable th3) {
        return null;
    }

    public final com.google.common.util.concurrent.c0 b(uc0 uc0Var) {
        ArrayList arrayList = new ArrayList();
        p9 p9Var = this.f13288c;
        x12 s13 = uc0Var.s();
        qn2 qn2Var = (qn2) p9Var;
        bt2 bt2Var = qn2Var.f10190d;
        xb0 xb0Var = xb0.EVENT_ID_DG_STORAGE_UPDATE_METADATA;
        v50 v50Var = (v50) qn2Var.f10187a;
        arrayList.add(bt2Var.a(xb0Var, kg.o.l(v50Var.f12353c, new u50(v50Var, s13, null))));
        if (uc0Var.t() == mn2.STATUS_UPDATE_PROGRAM_BYTECODE) {
            p9 p9Var2 = this.f13288c;
            byte[] e13 = uc0Var.r().e();
            qn2 qn2Var2 = (qn2) p9Var2;
            bt2 bt2Var2 = qn2Var2.f10190d;
            xb0 xb0Var2 = xb0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE;
            v50 v50Var2 = (v50) qn2Var2.f10188b;
            arrayList.add(bt2Var2.a(xb0Var2, kg.o.l(v50Var2.f12353c, new u50(v50Var2, e13, null))));
        } else if (uc0Var.t() == mn2.STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE) {
            p9 p9Var3 = this.f13288c;
            byte[] e14 = uc0Var.r().e();
            qn2 qn2Var3 = (qn2) p9Var3;
            bt2 bt2Var3 = qn2Var3.f10190d;
            xb0 xb0Var3 = xb0.EVENT_ID_DG_STORAGE_UPDATE_PROGRAM_BYTECODE;
            v50 v50Var3 = (v50) qn2Var3.f10188b;
            arrayList.add(bt2Var3.a(xb0Var3, kg.o.l(v50Var3.f12353c, new u50(v50Var3, e14, null))));
            p9 p9Var4 = this.f13288c;
            byte[] e15 = uc0Var.u().e();
            qn2 qn2Var4 = (qn2) p9Var4;
            bt2 bt2Var4 = qn2Var4.f10190d;
            xb0 xb0Var4 = xb0.EVENT_ID_DG_STORAGE_UPDATE_VM;
            v50 v50Var4 = (v50) ((xc0) qn2Var4.f10189c.get());
            arrayList.add(bt2Var4.a(xb0Var4, kg.o.l(v50Var4.f12353c, new u50(v50Var4, e15, null))));
        }
        return com.google.common.util.concurrent.g.A(new n(pk.c1.r(arrayList)), new ok.u(null), com.google.common.util.concurrent.r.INSTANCE);
    }

    public final com.google.common.util.concurrent.t c() {
        com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(((qn2) this.f13288c).a());
        a.y3 y3Var = new a.y3(3);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z13.getClass();
        return com.google.common.util.concurrent.a.A(com.google.common.util.concurrent.a.A(com.google.common.util.concurrent.a.A(com.google.common.util.concurrent.g.B(com.google.common.util.concurrent.g.A(com.google.common.util.concurrent.a.A(z13, Throwable.class, y3Var, rVar), new ef(this, 0), rVar), new ff(this, 0), rVar), tw2.class, new a.y3(4), rVar), sw2.class, new a.y3(5), rVar), uw2.class, new a.y3(6), rVar);
    }

    public final uc0 a(uc0 uc0Var) {
        switch (uc0Var.t()) {
            case STATUS_UNKNOWN:
            case STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED:
            case STATUS_FAILURE_INVALID_RESPONSE_DECODE_FAILURE:
            case STATUS_FAILURE_INVALID_RESPONSE_HTTP_ERROR:
            case STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE:
            case STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR:
            case STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE:
            case STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED:
            case STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED:
                throw new sw2(kh2.n.j(uc0Var.t().f8314a, "r: "));
            case STATUS_UPDATE_PROGRAM_BYTECODE:
            case STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE:
                return uc0Var;
            case STATUS_NO_UPDATE:
                throw new uw2(kh2.n.j(uc0Var.t().f8314a, "r: "));
            default:
                throw new AssertionError("Unreachable");
        }
    }

    public final /* synthetic */ com.google.common.util.concurrent.c0 a(Integer num) {
        return b();
    }

    public final int a(x12 x12Var) {
        j90 j90Var = (j90) this.f13286a;
        if (x12Var != null) {
            j90Var.getClass();
            if (!x12Var.equals(x12.s())) {
                if (x12Var.r() != j90Var.f6732a.get()) {
                    j90Var.f6733b.b(xb0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_ARCH_MISMATCH);
                } else {
                    long t13 = x12Var.t().t() * 1000;
                    j90Var.f6734c.getClass();
                    boolean z13 = t13 - System.currentTimeMillis() <= j90Var.f6735d;
                    if (z13) {
                        j90Var.f6733b.b(xb0.EVENT_ID_DG_VALIDATOR_UPDATE_PROGRAM_ALMOST_EXPIRED);
                    }
                    if (!z13) {
                        throw new tw2();
                    }
                }
                return 0;
            }
        }
        j90Var.f6733b.b(xb0.EVENT_ID_DG_VALIDATOR_UPDATE_METADATA_NOT_FOUND);
        return 0;
    }

    public final com.google.common.util.concurrent.c0 a() {
        com.google.common.util.concurrent.y yVar;
        synchronized (this) {
            try {
                this.f13290e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f13292g < this.f13291f) {
                    vw2 vw2Var = vw2.RESULT_NOOP_TOO_FREQUENT;
                    if (vw2Var == null) {
                        yVar = com.google.common.util.concurrent.y.f33586b;
                    } else {
                        yVar = new com.google.common.util.concurrent.y(vw2Var);
                    }
                    return yVar;
                }
                this.f13292g = currentTimeMillis;
                return c();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final com.google.common.util.concurrent.c0 b() {
        bt2 bt2Var = this.f13289d;
        xb0 xb0Var = xb0.EVENT_ID_PRIMARY_UPDATE_PROGRAM;
        com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(((t12) this.f13287b).a());
        ef efVar = new ef(this, 1);
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z13.getClass();
        return bt2Var.a(xb0Var, com.google.common.util.concurrent.g.A(com.google.common.util.concurrent.g.B(com.google.common.util.concurrent.g.A(z13, efVar, rVar), new ff(this, 1), rVar), new a.y3(7), rVar));
    }
}
