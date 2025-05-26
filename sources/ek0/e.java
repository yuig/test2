package ek0;

import i92.k;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import u51.z;

/* loaded from: classes5.dex */
public final class e extends rk2.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f59170b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f59171c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f59172d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f59173e;

    public e(h hVar, com.pinterest.feature.board.create.c cVar, String str) {
        this.f59173e = hVar;
        this.f59172d = cVar;
        this.f59171c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cf  */
    @Override // uj2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r9 = this;
            int r0 = r9.f59170b
            r1 = 0
            java.lang.Object r2 = r9.f59173e
            java.lang.String r3 = r9.f59171c
            java.lang.Object r4 = r9.f59172d
            switch(r0) {
                case 0: goto L95;
                case 1: goto L75;
                default: goto Lc;
            }
        Lc:
            s51.e r4 = (s51.e) r4
            nx.d0 r0 = r4.getPinalytics()
            h32.f1 r5 = h32.f1.DID_IT_ACTIVITY_REPORT
            r6 = 0
            r7 = 12
            nx.d0.v(r0, r5, r3, r6, r7)
            com.pinterest.api.model.az0 r0 = r4.f111157a
            com.pinterest.api.model.wy0 r5 = r0.U()
            m60.w r6 = r4.f111163g
            if (r5 == 0) goto L31
            pg0.i r7 = new pg0.i
            rp0.c r8 = new rp0.c
            r8.<init>(r0)
            r7.<init>(r5, r8)
            r6.d(r7)
        L31:
            yk1.n r0 = r4.getView()
            q51.b r0 = (q51.b) r0
            int r5 = w02.b.report_content_sent
            yk1.v r7 = r4.f111158b
            yk1.a r7 = (yk1.a) r7
            android.content.res.Resources r7 = r7.f139224a
            java.lang.String r5 = r7.getString(r5)
            u51.z r0 = (u51.z) r0
            r0.getClass()
            java.lang.String r7 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r7)
            i92.k r0 = r0.f120653s
            if (r0 == 0) goto L6f
            r0.m(r5)
            yk1.n r0 = r4.getView()
            q51.b r0 = (q51.b) r0
            u51.z r0 = (u51.z) r0
            r0.dismiss()
            ol1.e r0 = new ol1.e
            r0.<init>(r3)
            r6.d(r0)
            jc0.v r2 = (jc0.v) r2
            if (r2 == 0) goto L6e
            r6.d(r2)
        L6e:
            return
        L6f:
            java.lang.String r0 = "toastUtils"
            kotlin.jvm.internal.Intrinsics.r(r0)
            throw r1
        L75:
            k11.d r2 = (k11.d) r2
            java.lang.ref.WeakReference r0 = r2.f78120a
            java.lang.Object r0 = r0.get()
            k11.e r0 = (k11.e) r0
            boolean r0 = r0.isBound()
            if (r0 == 0) goto L94
            java.lang.ref.WeakReference r0 = r2.f78120a
            java.lang.Object r0 = r0.get()
            k11.e r0 = (k11.e) r0
            java.lang.String r2 = r2.f78121b
            java.lang.String r4 = (java.lang.String) r4
            r0.h4(r3, r2, r1, r4)
        L94:
            return
        L95:
            ek0.h r2 = (ek0.h) r2
            boolean r0 = r2.isBound()
            if (r0 == 0) goto Leb
            com.pinterest.feature.board.create.c r4 = (com.pinterest.feature.board.create.c) r4
            fk0.k r4 = (fk0.k) r4
            androidx.fragment.app.FragmentActivity r0 = r4.E4()
            if (r0 == 0) goto Le3
            boolean r5 = r4.f91282J
            if (r5 == 0) goto Lbc
            boolean r5 = r0 instanceof cp1.p
            if (r5 == 0) goto Lbc
            cp1.p r0 = (cp1.p) r0
            nl1.d r0 = r0.getF52740f()
            boolean r5 = r0 instanceof qp.c
            if (r5 == 0) goto Lbc
            qp.c r0 = (qp.c) r0
            goto Lbd
        Lbc:
            r0 = r1
        Lbd:
            if (r0 == 0) goto Lc9
            qp.k r0 = (qp.k) r0
            boolean r0 = r0.e8()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        Lc9:
            boolean r0 = com.bumptech.glide.d.o0(r1)
            if (r0 == 0) goto Le3
            com.pinterest.api.model.PinnableImage r0 = r2.f59186k
            int r1 = m60.x0.pinned
            yk1.v r5 = r2.f59193r
            yk1.a r5 = (yk1.a) r5
            android.content.res.Resources r5 = r5.f139224a
            java.lang.String r1 = r5.getString(r1)
            r0.f35572i = r1
            com.pinterest.api.model.PinnableImage r0 = r2.f59186k
            r0.f35573j = r3
        Le3:
            r2.p3()
            java.lang.String r0 = r2.f59189n
            r4.b8(r0)
        Leb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ek0.e.a():void");
    }

    @Override // rk2.a
    public final void c() {
        switch (this.f59170b) {
            case 2:
                s51.e eVar = (s51.e) this.f59172d;
                q51.b bVar = (q51.b) eVar.getView();
                String message = ((yk1.a) eVar.f111158b).f139224a.getString(w02.b.report_content_sending);
                z zVar = (z) bVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar = zVar.f120653s;
                if (kVar != null) {
                    kVar.o(message);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
            default:
                return;
        }
    }

    @Override // uj2.d
    public final void onError(Throwable error) {
        switch (this.f59170b) {
            case 0:
                return;
            case 1:
                k11.d dVar = (k11.d) this.f59173e;
                if (((k11.e) dVar.f78120a.get()).isBound()) {
                    ((k11.e) dVar.f78120a.get()).w3(error.getMessage());
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(error, "error");
                s51.e eVar = (s51.e) this.f59172d;
                q51.b bVar = (q51.b) eVar.getView();
                String message = ((yk1.a) eVar.f111158b).f139224a.getString(w02.b.report_content_fail);
                z zVar = (z) bVar;
                zVar.getClass();
                Intrinsics.checkNotNullParameter(message, "message");
                k kVar = zVar.f120653s;
                if (kVar != null) {
                    kVar.i(message);
                    return;
                } else {
                    Intrinsics.r("toastUtils");
                    throw null;
                }
        }
    }

    public e(k11.d dVar, String str, String str2) {
        this.f59173e = dVar;
        this.f59171c = str;
        this.f59172d = str2;
    }

    public e(s51.e eVar, String str, v vVar) {
        this.f59172d = eVar;
        this.f59171c = str;
        this.f59173e = vVar;
    }
}
