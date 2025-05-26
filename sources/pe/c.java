package pe;

import android.os.Bundle;
import android.view.View;
import androidx.media3.ui.z;
import com.pinterest.featurelibrary.pingridcell.sba.view.SbaPinRep;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import le.v;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f99892a = new c();

    public static final void a(qe.c mapping, View rootView, View hostView) {
        if (p001if.a.b(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(mapping, "mapping");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String str = mapping.f103612a;
            me.f fVar = g.f99907f;
            Bundle k13 = me.f.k(mapping, rootView, hostView);
            f99892a.b(k13);
            v.d().execute(new z(13, str, k13));
        } catch (Throwable th3) {
            p001if.a.a(c.class, th3);
        }
    }

    public final void b(Bundle parameters) {
        Locale locale;
        if (p001if.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            String string = parameters.getString("_valueToSum");
            if (string != null) {
                double d2 = 0.0d;
                try {
                    Matcher matcher = Pattern.compile("[-+]*\\d+([.,]\\d+)*([.,]\\d+)?", 8).matcher(string);
                    if (matcher.find()) {
                        String group = matcher.group(0);
                        try {
                            locale = v.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        }
                        d2 = NumberFormat.getNumberInstance(locale).parse(group).doubleValue();
                    }
                } catch (ParseException unused2) {
                }
                parameters.putDouble("_valueToSum", d2);
            }
            parameters.putString("_is_fb_codeless", SbaPinRep.AUXDATA_IS_LEAD_AD_TRUE);
        } catch (Throwable th3) {
            p001if.a.a(this, th3);
        }
    }
}
