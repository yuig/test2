package pb0;

import android.content.res.Resources;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import xa0.j;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f99430a;

    /* renamed from: b, reason: collision with root package name */
    public final bh.b f99431b;

    public d(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f99430a = resources;
        this.f99431b = new bh.b(27);
    }

    public final CharSequence a(Date date, b style) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(style, "style");
        return c(j.p(date), style, false);
    }

    public final CharSequence b(Date date, b style, boolean z13) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(style, "style");
        return c(j.p(date), style, z13);
    }

    public final CharSequence c(h timeDifference, b style, boolean z13) {
        Intrinsics.checkNotNullParameter(timeDifference, "timeDifference");
        Intrinsics.checkNotNullParameter(style, "style");
        i iVar = timeDifference.f99433a;
        int i13 = iVar == null ? -1 : c.f99429a[iVar.ordinal()];
        bh.b bVar = this.f99431b;
        switch (i13) {
            case 1:
                bVar.getClass();
                Resources resources = this.f99430a;
                Intrinsics.checkNotNullParameter(resources, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources, f.just_now, 0, style, false);
            case 2:
                bVar.getClass();
                Resources resources2 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources2, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources2, z13 ? e.plural_minute_ago_normal : e.plural_minute_normal, timeDifference.f99434b, style, z13);
            case 3:
                bVar.getClass();
                Resources resources3 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources3, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources3, z13 ? e.plural_hour_ago_normal : e.plural_hour_normal, timeDifference.f99434b, style, z13);
            case 4:
                bVar.getClass();
                Resources resources4 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources4, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources4, z13 ? e.plural_day_ago_normal : e.plural_day_normal, timeDifference.f99434b, style, z13);
            case 5:
                bVar.getClass();
                Resources resources5 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources5, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources5, z13 ? e.plural_week_ago_normal : e.plural_week_normal, timeDifference.f99434b, style, z13);
            case 6:
                bVar.getClass();
                Resources resources6 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources6, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources6, z13 ? e.plural_month_ago_normal : e.plural_month_normal, timeDifference.f99434b, style, z13);
            case 7:
                bVar.getClass();
                Resources resources7 = this.f99430a;
                Intrinsics.checkNotNullParameter(resources7, "resources");
                Intrinsics.checkNotNullParameter(style, "style");
                return bVar.n(resources7, z13 ? e.plural_year_ago_normal : e.plural_year_normal, timeDifference.f99434b, style, z13);
            default:
                return "";
        }
    }
}
