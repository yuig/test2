package jw1;

import android.content.res.Resources;
import com.pinterest.api.model.f30;
import com.pinterest.partnerAnalytics.g;
import h32.f1;
import h32.g0;
import java.text.DateFormat;
import java.util.Date;
import jc0.v;
import kotlin.jvm.internal.Intrinsics;
import lh0.m2;
import m60.w;
import nx.d0;
import xx1.f;

/* loaded from: classes4.dex */
public final class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final f30 f77670a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f77671b;

    /* renamed from: c, reason: collision with root package name */
    public final d0 f77672c;

    /* renamed from: d, reason: collision with root package name */
    public final m2 f77673d;

    /* renamed from: e, reason: collision with root package name */
    public final w f77674e;

    public e(f30 pin, Date date, d0 pinalytics, m2 experiments, w eventManager) {
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f77670a = pin;
        this.f77671b = date;
        this.f77672c = pinalytics;
        this.f77673d = experiments;
        this.f77674e = eventManager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a4, code lost:
    
        if (r3.l("ios_android_promoted_story_outbound_click_metric") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r0.booleanValue() != false) goto L40;
     */
    @Override // jw1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b() {
        /*
            r8 = this;
            com.pinterest.api.model.f30 r0 = r8.f77670a
            com.pinterest.api.model.bg r1 = kh2.g3.b0(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            jw1.a r3 = new jw1.a
            ww1.c r4 = ww1.c.IMPRESSION
            r5 = 0
            if (r1 == 0) goto L17
            java.lang.Integer r6 = r1.v()
            goto L18
        L17:
            r6 = r5
        L18:
            r3.<init>(r4, r6)
            r2.add(r3)
            jw1.a r3 = new jw1.a
            ww1.c r4 = ww1.c.PIN_CLICK
            if (r1 == 0) goto L29
            java.lang.Integer r6 = r1.z()
            goto L2a
        L29:
            r6 = r5
        L2a:
            r3.<init>(r4, r6)
            r2.add(r3)
            jw1.a r3 = new jw1.a
            ww1.c r4 = ww1.c.SAVE
            if (r1 == 0) goto L3b
            java.lang.Integer r6 = r1.B()
            goto L3c
        L3b:
            r6 = r5
        L3c:
            r3.<init>(r4, r6)
            r2.add(r3)
            java.util.Date r3 = r8.f77671b
            if (r3 == 0) goto L60
            java.util.Date r4 = nx.b.f92375a
            int r4 = r3.compareTo(r4)
            if (r4 < 0) goto L60
            jw1.a r4 = new jw1.a
            ww1.c r6 = ww1.c.PROFILE_VISIT
            if (r1 == 0) goto L59
            java.lang.Integer r7 = r1.A()
            goto L5a
        L59:
            r7 = r5
        L5a:
            r4.<init>(r6, r7)
            r2.add(r4)
        L60:
            if (r3 == 0) goto L7c
            java.util.Date r4 = nx.b.f92376b
            int r3 = r3.compareTo(r4)
            if (r3 < 0) goto L7c
            jw1.a r3 = new jw1.a
            ww1.c r4 = ww1.c.USER_FOLLOW
            if (r1 == 0) goto L75
            java.lang.Integer r6 = r1.D()
            goto L76
        L75:
            r6 = r5
        L76:
            r3.<init>(r4, r6)
            r2.add(r3)
        L7c:
            java.lang.Boolean r3 = r0.s4()
            java.lang.String r4 = "getHasBeenPromoted(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto La7
            lh0.m2 r3 = r8.f77673d
            r3.getClass()
            lh0.z3 r4 = lh0.a4.f83298b
            lh0.z0 r3 = r3.f83423a
            lh0.g1 r3 = (lh0.g1) r3
            java.lang.String r6 = "ios_android_promoted_story_outbound_click_metric"
            java.lang.String r7 = "enabled"
            boolean r4 = r3.o(r6, r7, r4)
            if (r4 != 0) goto Lb6
            boolean r3 = r3.l(r6)
            if (r3 == 0) goto La7
            goto Lb6
        La7:
            java.lang.Boolean r0 = r0.t4()
            java.lang.String r3 = "getHasLink(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r3)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc6
        Lb6:
            jw1.a r0 = new jw1.a
            ww1.c r3 = ww1.c.OUTBOUND_CLICK
            if (r1 == 0) goto Lc0
            java.lang.Integer r5 = r1.y()
        Lc0:
            r0.<init>(r3, r5)
            r2.add(r0)
        Lc6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: jw1.e.b():java.util.List");
    }

    @Override // jw1.b
    public final boolean c() {
        return true;
    }

    @Override // jw1.b
    public final String e(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Date date = this.f77671b;
        if (date == null) {
            return "";
        }
        DateFormat dateInstance = DateFormat.getDateInstance(3);
        return a.a.D(dateInstance.format(date), " - ", dateInstance.format(new Date()));
    }

    @Override // jw1.b
    public final String f(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(g.updated_in_real_time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // jw1.b
    public final void g() {
        d0.B(this.f77672c, f1.TAP, g0.EDUCATION, null, null, 28);
        this.f77674e.d(new v(new f(), false, 0L, 30));
    }

    @Override // jw1.b
    public final String h(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(g.pin_stats_metrics_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
