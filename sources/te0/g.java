package te0;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import df.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import m5.j;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f117488a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f117489b;

    /* renamed from: c, reason: collision with root package name */
    public static final m5.c f117490c;

    /* renamed from: d, reason: collision with root package name */
    public static final m5.c f117491d;

    /* renamed from: e, reason: collision with root package name */
    public static final m5.c f117492e;

    /* renamed from: f, reason: collision with root package name */
    public static final m5.c f117493f;

    static {
        HandlerThread handlerThread = new HandlerThread("fonts");
        handlerThread.start();
        f117489b = new Handler(handlerThread.getLooper());
        f117490c = new m5.c("Roboto", lm1.d.com_google_android_gms_fonts_certs);
        f117491d = new m5.c("name=Roboto&weight=500", lm1.d.com_google_android_gms_fonts_certs);
        f117492e = new m5.c("name=Roboto&italic=1", lm1.d.com_google_android_gms_fonts_certs);
        f117493f = new m5.c("name=Roboto&weight=500&italic=1", lm1.d.com_google_android_gms_fonts_certs);
    }

    public static Typeface a(Context context, lm1.b fontType, d dVar, int i13) {
        Typeface u03;
        if ((i13 & 4) != 0) {
            dVar = null;
        }
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        if (fontType == lm1.c.f83925a) {
            u03 = Typeface.DEFAULT;
        } else {
            Resources.Theme theme = context.getTheme();
            Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
            u03 = j1.c1(j1.x0(theme)) ? fontType == lm1.b.NORMAL ? bs1.c.u0(context, lm1.g.REGULAR) : bs1.c.u0(context, lm1.g.MEDIUM) : (Typeface) f117488a.get(fontType);
        }
        if (u03 == null) {
            Intrinsics.checkNotNullParameter(fontType, "fontType");
            int i14 = e.f117485a[fontType.ordinal()];
            m5.c cVar = f117490c;
            if (i14 != 1) {
                if (i14 == 2) {
                    cVar = f117491d;
                } else if (i14 == 3) {
                    cVar = f117492e;
                } else if (i14 == 4) {
                    cVar = f117493f;
                }
            }
            f fVar = new f(fontType, dVar);
            Handler handler = f117489b;
            sp2.i iVar = new sp2.i(fVar);
            j jVar = new j(handler);
            Context applicationContext = context.getApplicationContext();
            Object[] objArr = {cVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            m5.f.c(applicationContext, Collections.unmodifiableList(arrayList), 0, jVar, iVar);
        }
        if (u03 != null) {
            return u03;
        }
        Intrinsics.checkNotNullParameter(fontType, "fontType");
        Typeface typeface = fontType == lm1.c.f83927c ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
        Intrinsics.f(typeface);
        return typeface;
    }
}
