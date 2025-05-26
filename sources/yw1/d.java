package yw1;

import android.content.res.Resources;
import com.pinterest.api.model.a5;
import com.pinterest.api.model.i5;
import com.pinterest.api.model.m5;
import com.pinterest.api.model.o4;
import com.pinterest.partnerAnalytics.f;
import com.pinterest.partnerAnalytics.g;
import java.util.Date;
import java.util.List;
import kotlin.collections.f0;
import kotlin.jvm.internal.Intrinsics;
import zx.l;

/* loaded from: classes4.dex */
public final class d implements jw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.d f140319a;

    /* renamed from: b, reason: collision with root package name */
    public final o4 f140320b;

    /* renamed from: c, reason: collision with root package name */
    public final yx.a f140321c;

    /* renamed from: d, reason: collision with root package name */
    public final List f140322d;

    public d(pb0.d fuzzyDateFormatter, o4 o4Var, yx.c filterRepository) {
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(filterRepository, "filterRepository");
        this.f140319a = fuzzyDateFormatter;
        this.f140320b = o4Var;
        this.f140321c = filterRepository;
        this.f140322d = f0.j(ww1.c.IMPRESSION, ww1.c.ENGAGEMENT, ww1.c.VIDEO_MRC_VIEW, ww1.c.VIDEO_V50_WATCH_TIME, ww1.c.OUTBOUND_CLICK, ww1.c.SAVE, ww1.c.TOTAL_AUDIENCE, ww1.c.ENGAGERS);
    }

    @Override // jw1.b
    public final boolean a() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x010d, code lost:
    
        if (r3.f142975c != zx.e.VIDEO) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0119, code lost:
    
        r4 = ww1.c.VIDEO_MRC_VIEW;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011d, code lost:
    
        if (r1 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x011f, code lost:
    
        r5 = r1.W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0123, code lost:
    
        if (r5 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0125, code lost:
    
        r5 = pe.i.U0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x012b, code lost:
    
        if (r1 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        r6 = r1.W();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
    
        if (r6 == null) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0133, code lost:
    
        r6 = pe.i.T0(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0139, code lost:
    
        r2.add(new jw1.a(r4, r5, r6, true));
        r4 = ww1.c.VIDEO_V50_WATCH_TIME;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0143, code lost:
    
        if (r1 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0145, code lost:
    
        r5 = r1.X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0149, code lost:
    
        if (r5 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014b, code lost:
    
        r5 = pe.i.U0(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0151, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
    
        r1 = r1.X();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0157, code lost:
    
        if (r1 == null) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0159, code lost:
    
        r0 = pe.i.T0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015d, code lost:
    
        r2.add(new jw1.a(r4, r5, r0, true));
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0150, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0138, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x012a, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0117, code lost:
    
        if (r3.f142976d == zx.c.VIDEO) goto L82;
     */
    @Override // jw1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b() {
        /*
            Method dump skipped, instructions count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yw1.d.b():java.util.List");
    }

    @Override // jw1.b
    public final String d(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(g.analytics_overall_performance_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ca  */
    @Override // jw1.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(android.content.res.Resources r12) {
        /*
            r11 = this;
            java.lang.String r0 = "resources"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            yx.a r1 = r11.f140321c
            yx.c r1 = (yx.c) r1
            zx.l r1 = r1.c()
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            zx.g r0 = r1.f142973a
            zx.f r0 = r0.f142969a
            zx.f r2 = zx.f.CUSTOM
            if (r0 == r2) goto L29
            java.lang.String r0 = r1.g()
            r3.add(r0)
        L29:
            zx.d r0 = r1.f142974b
            int r2 = r0.ordinal()
            java.lang.String r4 = "getString(...)"
            if (r2 == 0) goto L65
            zx.e r2 = r1.f142975c
            int r5 = r2.ordinal()
            zx.c r6 = r1.f142976d
            if (r5 != 0) goto L43
            int r5 = r6.ordinal()
            if (r5 == 0) goto L65
        L43:
            zx.d r5 = zx.d.ORGANIC
            if (r0 != r5) goto L56
            int r0 = r2.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
            goto L79
        L56:
            int r0 = r6.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
            goto L79
        L65:
            int r2 = r0.ordinal()
            if (r2 == 0) goto L79
            int r0 = r0.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
        L79:
            zx.b r0 = r1.f142977e
            int r2 = r0.f142968b
            if (r2 == 0) goto L84
            java.lang.String r0 = r0.f142967a
            r3.add(r0)
        L84:
            zx.h r0 = r1.f142979g
            int r2 = r0.ordinal()
            if (r2 == 0) goto L9a
            int r0 = r0.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
        L9a:
            zx.k r0 = r1.f142980h
            int r2 = r0.ordinal()
            if (r2 == 0) goto Lb0
            int r0 = r0.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
        Lb0:
            zx.i r0 = r1.f142981i
            int r2 = r0.ordinal()
            if (r2 == 0) goto Lc6
            int r0 = r0.getDescription()
            java.lang.String r0 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            r3.add(r0)
        Lc6:
            boolean r0 = r1.f142982j
            if (r0 == 0) goto Ld6
            int r0 = com.pinterest.partnerAnalytics.g.include_saved_pins_filter_title
            java.lang.String r12 = r12.getString(r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r4)
            r3.add(r12)
        Ld6:
            r7 = 0
            r10 = 63
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            java.lang.String r12 = kotlin.collections.CollectionsKt.Z(r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: yw1.d.e(android.content.res.Resources):java.lang.String");
    }

    @Override // jw1.b
    public final String f(Resources resources) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(resources, "resources");
        o4 o4Var = this.f140320b;
        if (o4Var == null) {
            return "";
        }
        a5 q13 = o4Var.q();
        i5 j13 = q13 != null ? q13.j() : null;
        m5 F = j13 != null ? j13.F() : null;
        int intValue = (F != null ? F.i() : 0).intValue();
        if (F == null || (bool = F.g()) == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        long doubleValue = F != null ? (long) F.h().doubleValue() : 0L;
        String quantityString = resources.getQuantityString(f.topline_metrics_percent_disclaimer, intValue, Integer.valueOf(intValue));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = resources.getString(g.topline_metrics_disclaimer_real_time);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        if (intValue > 0) {
            return booleanValue ? a.a.D(quantityString, " ", string) : quantityString;
        }
        if (booleanValue) {
            return string;
        }
        if (doubleValue <= 0) {
            return "";
        }
        String string2 = resources.getString(g.metrics_disclaimer_updated, this.f140319a.b(new Date(doubleValue), pb0.b.STYLE_NORMAL, true).toString());
        Intrinsics.f(string2);
        return string2;
    }

    @Override // jw1.b
    public final String h(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        l c13 = ((yx.c) this.f140321c).c();
        c13.getClass();
        Intrinsics.checkNotNullParameter(resources, "resources");
        zx.f fVar = c13.f142973a.f142969a;
        if (fVar == zx.f.CUSTOM) {
            return c13.g();
        }
        String string = resources.getString(fVar.getDescription());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
