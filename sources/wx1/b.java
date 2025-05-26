package wx1;

import android.content.res.Resources;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b implements jw1.b {

    /* renamed from: a, reason: collision with root package name */
    public final pb0.d f131203a;

    /* renamed from: b, reason: collision with root package name */
    public final Date f131204b;

    /* renamed from: c, reason: collision with root package name */
    public final Date f131205c;

    /* renamed from: d, reason: collision with root package name */
    public final List f131206d;

    /* renamed from: e, reason: collision with root package name */
    public final int f131207e;

    /* renamed from: f, reason: collision with root package name */
    public final int f131208f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f131209g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f131210h;

    /* renamed from: i, reason: collision with root package name */
    public final long f131211i;

    public b(pb0.d fuzzyDateFormatter, Date startDateRequested, Date endDateRequested, ArrayList metricList, int i13, int i14, boolean z13, boolean z14, long j13) {
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        Intrinsics.checkNotNullParameter(startDateRequested, "startDateRequested");
        Intrinsics.checkNotNullParameter(endDateRequested, "endDateRequested");
        Intrinsics.checkNotNullParameter(metricList, "metricList");
        this.f131203a = fuzzyDateFormatter;
        this.f131204b = startDateRequested;
        this.f131205c = endDateRequested;
        this.f131206d = metricList;
        this.f131207e = i13;
        this.f131208f = i14;
        this.f131209g = z13;
        this.f131210h = z14;
        this.f131211i = j13;
    }

    @Override // jw1.b
    public final List b() {
        return this.f131206d;
    }

    @Override // jw1.b
    public final String e(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        DateFormat dateInstance = DateFormat.getDateInstance(3);
        boolean z13 = this.f131209g;
        Date date = this.f131205c;
        Date date2 = this.f131204b;
        if (z13) {
            String string = resources.getString(com.pinterest.partnerAnalytics.g.pin_stats_metrics_life_time_date_range, dateInstance.format(date2), dateInstance.format(date));
            Intrinsics.f(string);
            return string;
        }
        String string2 = resources.getString(com.pinterest.partnerAnalytics.g.pin_stats_metrics_last_30_days_date_range, dateInstance.format(date2), dateInstance.format(date));
        Intrinsics.f(string2);
        return string2;
    }

    @Override // jw1.b
    public final String f(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        StringBuilder sb3 = new StringBuilder();
        int i13 = this.f131208f;
        if (i13 > 0) {
            sb3.append(resources.getQuantityString(com.pinterest.partnerAnalytics.f.topline_metrics_percent_disclaimer, i13, Integer.valueOf(i13)));
        }
        if (this.f131210h) {
            sb3.append(" ");
            sb3.append(resources.getString(com.pinterest.partnerAnalytics.g.metrics_updated_in_real_time));
        } else {
            long j13 = this.f131211i;
            if (j13 > 0) {
                sb3.append(" ");
                sb3.append(resources.getString(com.pinterest.partnerAnalytics.g.metrics_disclaimer_updated, this.f131203a.b(new Date(j13), pb0.b.STYLE_NORMAL, true).toString()));
            }
        }
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
        return sb4;
    }

    @Override // jw1.b
    public final String h(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        String string = resources.getString(this.f131207e);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
