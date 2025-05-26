package fy1;

import android.content.res.Resources;
import f0.h;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import xa0.j;

/* loaded from: classes4.dex */
public final class b extends h {

    /* renamed from: b, reason: collision with root package name */
    public final a f63107b;

    /* renamed from: c, reason: collision with root package name */
    public final pb0.d f63108c;

    public b(a format, pb0.d fuzzyDateFormatter) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(fuzzyDateFormatter, "fuzzyDateFormatter");
        this.f63107b = format;
        this.f63108c = fuzzyDateFormatter;
    }

    @Override // f0.h
    public final String E(float f13) {
        return G(f13);
    }

    @Override // f0.h
    public final String G(float f13) {
        if (this.f63107b != a.RELATIVE) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.setTimeInMillis((long) f13);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d");
            simpleDateFormat.setTimeZone(kw1.e.f81041a);
            return simpleDateFormat.format(calendar.getTime()).toString();
        }
        Date date = new Date((long) f13);
        pb0.b style = pb0.b.STYLE_COMPACT;
        pb0.d dVar = this.f63108c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(style, "style");
        CharSequence c13 = dVar.c(j.p(date), style, false);
        int i13 = pb0.f.now;
        Resources resources = dVar.f99430a;
        if (!Intrinsics.d(resources.getString(i13), c13.toString()) && !Intrinsics.d(resources.getString(pb0.f.just_now), c13.toString())) {
            c13 = "-" + ((Object) c13);
        }
        return c13.toString();
    }
}
