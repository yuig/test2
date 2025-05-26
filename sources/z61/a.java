package z61;

import h32.f1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nx.d0;
import nx.u0;

/* loaded from: classes5.dex */
public final class a extends tq0.b {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f140889c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f140890d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(nx.d0 r5, int r6) {
        /*
            r4 = this;
            pb0.g r0 = pb0.g.f99432a
            r4.f140889c = r6
            r1 = 1
            java.lang.String r2 = "pinalytics"
            java.lang.String r3 = "clock"
            if (r6 == r1) goto L1c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r4.<init>(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f140890d = r5
            return
        L1c:
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r2)
            r4.<init>(r0, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.f140890d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z61.a.<init>(nx.d0, int):void");
    }

    @Override // tq0.b
    public final void i() {
        ArrayList arrayList = this.f140890d;
        switch (this.f140889c) {
            case 0:
                arrayList.clear();
                break;
            default:
                arrayList.clear();
                break;
        }
    }

    @Override // tq0.b
    public final void l(Object impression) {
        switch (this.f140889c) {
            case 0:
                Intrinsics.checkNotNullParameter(impression, "impression");
                break;
            default:
                Intrinsics.checkNotNullParameter(impression, "impression");
                if (impression instanceof u0) {
                    this.f140890d.add(impression);
                    break;
                }
                break;
        }
    }

    @Override // tq0.b
    public final void p() {
        ArrayList arrayList = this.f140890d;
        int i13 = this.f140889c;
        d0 d0Var = this.f118989b;
        switch (i13) {
            case 0:
                if (!arrayList.isEmpty()) {
                    d0Var.Y(f1.GUIDE_IMPRESSION_ONE_PIXEL, CollectionsKt.H0(arrayList));
                    break;
                }
                break;
            default:
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    d0Var.P(f1.SEARCH_IMPRESSION_ONE_PIXEL, (u0) it.next());
                }
                break;
        }
    }
}
