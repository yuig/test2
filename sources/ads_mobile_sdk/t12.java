package ads_mobile_sdk;

import a.ff;
import a.p9;
import ads_mobile_sdk.t12;
import ads_mobile_sdk.x12;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class t12 implements a.ya {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11313a;

    /* renamed from: b, reason: collision with root package name */
    public final a.n5 f11314b;

    /* renamed from: c, reason: collision with root package name */
    public final p9 f11315c;

    /* renamed from: d, reason: collision with root package name */
    public final bt2 f11316d;

    /* renamed from: e, reason: collision with root package name */
    public final ExecutorService f11317e;

    /* renamed from: f, reason: collision with root package name */
    public final d22 f11318f;

    /* renamed from: g, reason: collision with root package name */
    public final a.se f11319g;

    public t12(Context context, a.n5 n5Var, p9 p9Var, bt2 bt2Var, ExecutorService executorService, d22 d22Var, a.se seVar) {
        this.f11313a = context;
        this.f11314b = n5Var;
        this.f11315c = p9Var;
        this.f11316d = bt2Var;
        this.f11317e = executorService;
        this.f11318f = d22Var;
        this.f11319g = seVar;
    }

    public final com.google.common.util.concurrent.c0 a() {
        bt2 bt2Var = this.f11316d;
        xb0 xb0Var = xb0.EVENT_ID_DG_FETCHER_FETCH_PROGRAM;
        a.n5 n5Var = this.f11314b;
        Objects.requireNonNull(n5Var);
        int i13 = 2;
        com.google.common.util.concurrent.t z13 = com.google.common.util.concurrent.t.z(dl2.b.M2(this.f11317e, new a.k1(n5Var, i13)));
        final int i14 = 0;
        ok.t tVar = new ok.t(this) { // from class: a.ic

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t12 f60b;

            {
                this.f60b = this;
            }

            @Override // ok.t
            public final Object apply(Object obj) {
                int i15 = i14;
                t12 t12Var = this.f60b;
                switch (i15) {
                    case 0:
                        return Integer.valueOf(t12Var.a((ads_mobile_sdk.ng) obj));
                    default:
                        return t12Var.a((x12) obj);
                }
            }
        };
        com.google.common.util.concurrent.r rVar = com.google.common.util.concurrent.r.INSTANCE;
        z13.getClass();
        final int i15 = 1;
        return bt2Var.a(xb0Var, com.google.common.util.concurrent.a.A(com.google.common.util.concurrent.g.A(com.google.common.util.concurrent.g.B(com.google.common.util.concurrent.g.A(z13, tVar, rVar), new ff(this, 2), rVar), new ok.t(this) { // from class: a.ic

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t12 f60b;

            {
                this.f60b = this;
            }

            @Override // ok.t
            public final Object apply(Object obj) {
                int i152 = i15;
                t12 t12Var = this.f60b;
                switch (i152) {
                    case 0:
                        return Integer.valueOf(t12Var.a((ads_mobile_sdk.ng) obj));
                    default:
                        return t12Var.a((x12) obj);
                }
            }
        }, this.f11317e), s12.class, new a.y3(i13), rVar));
    }

    public final uc0 a(x12 x12Var) {
        b22 b22Var;
        mn2 mn2Var;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z13;
        String u13 = x12Var.t().u();
        String r13 = x12Var.t().r();
        bt2 bt2Var = this.f11316d;
        bs2 bs2Var = new bs2(xb0.EVENT_ID_DG_FETCHER_GASS_CLIENT_INVOCATION, bt2Var.f3596b, bt2Var.f3595a);
        try {
            bs2Var.b();
            gj0 gj0Var = new gj0(this.f11313a, (ng) this.f11314b.get(), u13, r13, this.f11319g);
            try {
                b22Var = (b22) gj0Var.f5589f.poll(50000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e13) {
                gj0Var.a(2009, gj0Var.f5592i, e13);
                b22Var = null;
            }
            gj0Var.a(3004, gj0Var.f5592i, null);
            if (b22Var == null) {
                b22Var = new b22(null, 1, 1);
            }
            bs2Var.a();
            if (b22Var.f2644c == 2) {
                this.f11316d.b(xb0.EVENT_ID_DG_FETCHER_PROGRAM_NO_UPDATE);
                mn2 mn2Var2 = mn2.STATUS_NO_UPDATE;
                a.vc v13 = uc0.v();
                v13.g(mn2Var2);
                return (uc0) v13.a();
            }
            byte[] bArr = b22Var.f2643b;
            if (bArr != null && bArr.length != 0) {
                try {
                    jj0 a13 = jj0.a(bArr, jc0.b());
                    if (!a13.s().u().isEmpty() && !a13.s().r().isEmpty() && a13.r().e().length != 0) {
                        if (!x12Var.equals(x12.s()) && TextUtils.equals(x12Var.t().u(), a13.s().u()) && TextUtils.equals(x12Var.t().r(), a13.s().r())) {
                            this.f11316d.b(xb0.EVENT_ID_DG_FETCHER_PROGRAM_SAME_CHECKSUM);
                        } else {
                            if (b22Var.f2644c == 4) {
                                d22 d22Var = this.f11318f;
                                byte[] e14 = a13.t().e();
                                d22Var.getClass();
                                try {
                                    e0.t.m(d22Var.f4100a);
                                    e0.t.S0(d22Var.f4100a, e14);
                                    wy2 wy2Var = d22Var.f4101b;
                                    File file = d22Var.f4100a;
                                    wy2Var.getClass();
                                    z13 = wy2.a(file);
                                } catch (IOException | GeneralSecurityException e15) {
                                    ((x71) d22Var.f4102c.f3595a).a(2026, -1L, e15, null);
                                    z13 = false;
                                }
                                try {
                                    d22Var.f4100a.delete();
                                } catch (SecurityException unused) {
                                }
                                if (!z13) {
                                    this.f11316d.b(xb0.EVENT_ID_DG_FETCHER_PROGRAM_SIGNATURE_VERIFICATION_FAILURE);
                                    mn2 mn2Var3 = mn2.STATUS_FAILURE_INVALID_RESPONSE_SIGNATURE_VALIDATION_FAILED;
                                    a.vc v14 = uc0.v();
                                    v14.g(mn2Var3);
                                    return (uc0) v14.a();
                                }
                            }
                            a.vc v15 = uc0.v();
                            int i17 = b22Var.f2644c;
                            if (i17 == 2) {
                                mn2Var = mn2.STATUS_NO_UPDATE;
                            } else if (i17 == 3) {
                                mn2Var = mn2.STATUS_UPDATE_PROGRAM_BYTECODE;
                            } else if (i17 == 4) {
                                mn2Var = mn2.STATUS_UPDATE_VM_AND_PROGRAM_BYTECODE;
                            } else if (i17 != 6) {
                                mn2Var = mn2.STATUS_UNKNOWN;
                            } else {
                                mn2Var = mn2.STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED;
                            }
                            v15.g(mn2Var);
                            a.be u14 = x12.u();
                            y12 s13 = a13.s();
                            u14.b();
                            x12 x12Var2 = (x12) u14.f10110b;
                            x12Var2.getClass();
                            s13.getClass();
                            x12Var2.metadata_ = s13;
                            x12Var2.metadataCase_ = 1;
                            ng ngVar = (ng) this.f11314b.get();
                            u14.b();
                            x12 x12Var3 = (x12) u14.f10110b;
                            x12Var3.getClass();
                            x12Var3.architecture_ = ngVar.f8781a;
                            i13 = x12Var3.bitField0_;
                            x12Var3.bitField0_ = i13 | 1;
                            x12 x12Var4 = (x12) u14.a();
                            v15.b();
                            uc0 uc0Var = (uc0) v15.f10110b;
                            uc0Var.getClass();
                            uc0Var.metadata_ = x12Var4;
                            i14 = uc0Var.bitField0_;
                            uc0Var.bitField0_ = 1 | i14;
                            il t13 = a13.t();
                            v15.b();
                            uc0 uc0Var2 = (uc0) v15.f10110b;
                            uc0Var2.getClass();
                            t13.getClass();
                            i15 = uc0Var2.bitField0_;
                            uc0Var2.bitField0_ = 4 | i15;
                            uc0Var2.vm_ = t13;
                            il r14 = a13.r();
                            v15.b();
                            uc0 uc0Var3 = (uc0) v15.f10110b;
                            uc0Var3.getClass();
                            r14.getClass();
                            i16 = uc0Var3.bitField0_;
                            uc0Var3.bitField0_ = i16 | 2;
                            uc0Var3.bytecode_ = r14;
                            return (uc0) v15.a();
                        }
                    } else {
                        this.f11316d.b(xb0.EVENT_ID_DG_FETCHER_PROGRAM_EMPTY_BYTECODE);
                    }
                    mn2 mn2Var4 = mn2.STATUS_FAILURE_INVALID_RESPONSE_PROGRAM_VALIDATION_FAILED;
                    a.vc v16 = uc0.v();
                    v16.g(mn2Var4);
                    return (uc0) v16.a();
                } catch (e21 e16) {
                    ((x71) this.f11316d.f3595a).a(15204, -1L, e16, null);
                    mn2 mn2Var5 = mn2.STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR;
                    a.vc v17 = uc0.v();
                    v17.g(mn2Var5);
                    return (uc0) v17.a();
                } catch (NullPointerException unused2) {
                    this.f11316d.b(xb0.EVENT_ID_DG_FETCHER_NPE_PARSING_GASS_PROGRAM);
                    mn2 mn2Var6 = mn2.STATUS_FAILURE_INVALID_RESPONSE_PROTO_ERROR_NPE;
                    a.vc v18 = uc0.v();
                    v18.g(mn2Var6);
                    return (uc0) v18.a();
                }
            }
            this.f11316d.b(xb0.EVENT_ID_GET_EMPTY_PROGRAM_FROM_GASS);
            mn2 mn2Var7 = mn2.STATUS_FAILURE_INVALID_RESPONSE_EMPTY_BYTECODE;
            a.vc v19 = uc0.v();
            v19.g(mn2Var7);
            return (uc0) v19.a();
        } finally {
        }
    }

    public final /* synthetic */ com.google.common.util.concurrent.c0 a(Integer num) {
        return ((qn2) this.f11315c).a();
    }

    public final int a(ng ngVar) {
        int ordinal = ngVar.ordinal();
        if (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
            return 0;
        }
        bt2 bt2Var = this.f11316d;
        ((x71) bt2Var.f3595a).a(15203, -1L, null, ngVar.name());
        throw new s12();
    }

    public static uc0 a(s12 s12Var) {
        mn2 mn2Var = mn2.STATUS_FAILURE_ARCHITECTURE_NOT_SUPPORTED;
        a.vc v13 = uc0.v();
        v13.g(mn2Var);
        return (uc0) v13.a();
    }
}
