package rf1;

import com.pinterest.api.model.wy0;
import df.j1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r f107740a;

    /* renamed from: b, reason: collision with root package name */
    public final yk1.v f107741b;

    public d(r sponsorshipBuilder, yk1.v resources) {
        Intrinsics.checkNotNullParameter(sponsorshipBuilder, "sponsorshipBuilder");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f107740a = sponsorshipBuilder;
        this.f107741b = resources;
    }

    public final b a(wy0 creator, boolean z13) {
        Intrinsics.checkNotNullParameter(creator, "creator");
        int i13 = wy1.f.story_pin_feed_affiliate_link_indicator_text;
        yk1.a aVar = (yk1.a) this.f107741b;
        String string = aVar.f139224a.getString(i13);
        if (z13) {
            string = j1.U(aVar.f139224a.getString(wy1.f.sponsored_pins_eu_prefix), new Object[]{string});
        }
        return new b(string, string, null, 28);
    }

    public final b b(wy0 sponsor, a11.b arrivalMethod) {
        Intrinsics.checkNotNullParameter(sponsor, "sponsor");
        Intrinsics.checkNotNullParameter(arrivalMethod, "arrivalMethod");
        String U = j1.U(((yk1.a) this.f107741b).f139224a.getString(arrivalMethod == a11.b.Swipe ? wy1.f.promoted_by_prefix : wy1.f.sponsored_pins_prefix), new Object[]{dl2.b.j1(sponsor)});
        return new b(U, U, c.Bold, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0059, code lost:
    
        if (r5 == null) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final rf1.b c(com.pinterest.api.model.rj0 r5) {
        /*
            r4 = this;
            java.lang.String r0 = "sponsorship"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            rf1.r r1 = r4.f107740a
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            com.pinterest.api.model.wy0 r0 = r5.e()
            com.pinterest.api.model.rj0$a r5 = r5.f()
            r2 = -1
            if (r5 != 0) goto L1a
            r5 = r2
            goto L22
        L1a:
            int[] r3 = rf1.q.f107879a
            int r5 = r5.ordinal()
            r5 = r3[r5]
        L22:
            yk1.v r3 = r1.f107890a
            if (r5 == r2) goto L6a
            r2 = 1
            if (r5 == r2) goto L3c
            r0 = 2
            if (r5 == r0) goto L39
            r0 = 3
            if (r5 == r0) goto L6a
            r0 = 4
            if (r5 != r0) goto L33
            goto L6a
        L33:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L39:
            java.lang.String r5 = ""
            goto L78
        L3c:
            if (r0 == 0) goto L5b
            int r5 = wy1.f.sponsored_pins_prefix
            r2 = r3
            yk1.a r2 = (yk1.a) r2
            android.content.res.Resources r2 = r2.f139224a
            java.lang.String r5 = r2.getString(r5)
            java.lang.String r0 = dl2.b.j1(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r5 = df.j1.U(r5, r0)
            java.lang.String r5 = r1.a(r5)
            if (r5 != 0) goto L78
        L5b:
            int r5 = wy1.f.sponsored_pins_simple_prefix
            yk1.a r3 = (yk1.a) r3
            android.content.res.Resources r0 = r3.f139224a
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r5 = r1.a(r5)
            goto L78
        L6a:
            int r5 = wy1.f.sponsored_pins_simple_prefix
            yk1.a r3 = (yk1.a) r3
            android.content.res.Resources r0 = r3.f139224a
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r5 = r1.a(r5)
        L78:
            rf1.b r0 = new rf1.b
            rf1.c r1 = rf1.c.Bold
            r2 = 8
            r0.<init>(r5, r5, r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rf1.d.c(com.pinterest.api.model.rj0):rf1.b");
    }
}
