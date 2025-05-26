package w01;

import com.pinterest.api.model.f30;
import kotlin.jvm.internal.Intrinsics;
import x02.x2;

/* loaded from: classes5.dex */
public final class c extends i01.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126976a;

    /* renamed from: b, reason: collision with root package name */
    public f30 f126977b;

    /* renamed from: c, reason: collision with root package name */
    public final x2 f126978c;

    /* renamed from: d, reason: collision with root package name */
    public final rf1.d f126979d;

    /* renamed from: e, reason: collision with root package name */
    public final a11.b f126980e;

    /* renamed from: f, reason: collision with root package name */
    public final lh0.a0 f126981f;

    /* renamed from: g, reason: collision with root package name */
    public final es.a f126982g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f126983h;

    /* renamed from: i, reason: collision with root package name */
    public final xk2.v f126984i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f30 f30Var, x2 userRepository, rf1.d attributionMetadataBuilder, a11.b bVar, lh0.a0 experiments, es.a adFormats, int i13) {
        super(0);
        this.f126976a = i13;
        int i14 = 1;
        if (i13 != 1) {
            Intrinsics.checkNotNullParameter(userRepository, "userRepository");
            Intrinsics.checkNotNullParameter(attributionMetadataBuilder, "attributionMetadataBuilder");
            Intrinsics.checkNotNullParameter(experiments, "experiments");
            Intrinsics.checkNotNullParameter(adFormats, "adFormats");
            this.f126977b = f30Var;
            this.f126978c = userRepository;
            this.f126979d = attributionMetadataBuilder;
            this.f126980e = bVar;
            this.f126981f = experiments;
            this.f126982g = adFormats;
            this.f126984i = xk2.m.b(new au0.a(this, 28));
            return;
        }
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(attributionMetadataBuilder, "attributionMetadataBuilder");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(adFormats, "adFormats");
        super(0);
        this.f126977b = f30Var;
        this.f126978c = userRepository;
        this.f126979d = attributionMetadataBuilder;
        this.f126980e = bVar;
        this.f126981f = experiments;
        this.f126982g = adFormats;
        this.f126984i = xk2.m.b(new e0(this, i14));
    }

    @Override // yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        switch (this.f126976a) {
            case 0:
                i01.j view = (i01.j) nVar;
                Intrinsics.checkNotNullParameter(view, "view");
                super.r3(view);
                f30 f30Var = this.f126977b;
                if (f30Var != null) {
                    p3(f30Var);
                    break;
                }
                break;
            default:
                i01.c0 view2 = (i01.c0) nVar;
                Intrinsics.checkNotNullParameter(view2, "view");
                super.r3(view2);
                f30 f30Var2 = this.f126977b;
                if (f30Var2 != null) {
                    q3(f30Var2);
                    break;
                }
                break;
        }
    }

    @Override // yk1.b
    public final void onUnbind() {
        switch (this.f126976a) {
            case 0:
                this.f126983h = false;
                super.onUnbind();
                break;
            default:
                this.f126983h = false;
                super.onUnbind();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p3(com.pinterest.api.model.f30 r5) {
        /*
            r4 = this;
            boolean r0 = r4.f126983h
            if (r0 != 0) goto L8d
            boolean r0 = r4.isBound()
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            r0 = 1
            r4.f126983h = r0
            com.pinterest.api.model.wy0 r0 = r5.L3()
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L3a
        L1c:
            java.lang.String r0 = "getIsPromoted(...)"
            boolean r0 = n60.o.B(r5, r0)
            if (r0 == 0) goto L36
            java.util.Set r0 = com.pinterest.api.model.b40.f35967a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.pinterest.api.model.wy0 r0 = com.pinterest.api.model.b40.N(r5)
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getUid()
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
            goto L8d
        L3a:
            com.pinterest.api.model.wy0 r2 = r5.y6()
            if (r2 == 0) goto L44
            java.lang.String r1 = r2.getUid()
        L44:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            x02.x2 r2 = r4.f126978c
            if (r1 == 0) goto L59
            x02.x2 r1 = r2.g0()
            uj2.q r0 = r1.L(r0)
            jk2.g0 r0 = r0.s()
            goto L61
        L59:
            uj2.q r0 = r2.L(r0)
            jk2.g0 r0 = r0.s()
        L61:
            uj2.a0 r1 = tk2.e.f118017c
            kk2.t r0 = r0.r(r1)
            uj2.a0 r1 = wj2.c.a()
            kk2.t r0 = r0.l(r1)
            ky0.b r1 = new ky0.b
            r2 = 10
            r1.<init>(r2, r4, r5)
            com.pinterest.feature.pin.i r5 = new com.pinterest.feature.pin.i
            r2 = 14
            r5.<init>(r2, r1)
            w01.b r1 = w01.b.f126958j
            com.pinterest.feature.pin.i r2 = new com.pinterest.feature.pin.i
            r3 = 15
            r2.<init>(r3, r1)
            xj2.c r5 = r0.o(r5, r2)
            r4.addDisposable(r5)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.c.p3(com.pinterest.api.model.f30):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void q3(com.pinterest.api.model.f30 r5) {
        /*
            r4 = this;
            boolean r0 = r4.f126983h
            if (r0 != 0) goto L8d
            boolean r0 = r4.isBound()
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            r0 = 1
            r4.f126983h = r0
            com.pinterest.api.model.wy0 r0 = r5.L3()
            r1 = 0
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getUid()
            if (r0 != 0) goto L3a
        L1c:
            java.lang.String r0 = "getIsPromoted(...)"
            boolean r0 = n60.o.B(r5, r0)
            if (r0 == 0) goto L36
            java.util.Set r0 = com.pinterest.api.model.b40.f35967a
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.pinterest.api.model.wy0 r0 = com.pinterest.api.model.b40.N(r5)
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.getUid()
            goto L37
        L36:
            r0 = r1
        L37:
            if (r0 != 0) goto L3a
            goto L8d
        L3a:
            com.pinterest.api.model.wy0 r2 = r5.y6()
            if (r2 == 0) goto L44
            java.lang.String r1 = r2.getUid()
        L44:
            boolean r1 = kotlin.jvm.internal.Intrinsics.d(r1, r0)
            x02.x2 r2 = r4.f126978c
            if (r1 == 0) goto L59
            x02.x2 r1 = r2.g0()
            uj2.q r0 = r1.L(r0)
            jk2.g0 r0 = r0.s()
            goto L61
        L59:
            uj2.q r0 = r2.L(r0)
            jk2.g0 r0 = r0.s()
        L61:
            uj2.a0 r1 = tk2.e.f118017c
            kk2.t r0 = r0.r(r1)
            uj2.a0 r1 = wj2.c.a()
            kk2.t r0 = r0.l(r1)
            ky0.b r1 = new ky0.b
            r2 = 15
            r1.<init>(r2, r4, r5)
            w01.h r5 = new w01.h
            r2 = 16
            r5.<init>(r2, r1)
            w01.b r1 = w01.b.M
            w01.h r2 = new w01.h
            r3 = 17
            r2.<init>(r3, r1)
            xj2.c r5 = r0.o(r5, r2)
            r4.addDisposable(r5)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w01.c.q3(com.pinterest.api.model.f30):void");
    }

    @Override // i01.c
    public final void updatePin(f30 updatedPin) {
        switch (this.f126976a) {
            case 0:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                this.f126977b = updatedPin;
                this.f126983h = false;
                p3(updatedPin);
                break;
            default:
                Intrinsics.checkNotNullParameter(updatedPin, "updatedPin");
                this.f126977b = updatedPin;
                this.f126983h = false;
                q3(updatedPin);
                break;
        }
    }
}
