package is1;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;
import m60.x0;

/* loaded from: classes4.dex */
public abstract class r {
    static {
        Context context = kb0.a.f79058b;
        m60.f0.W().getResources().getString(x0.separator);
    }

    public static String a(t10.f fVar, Resources resources) {
        String str = fVar.f115783o;
        if (str != null) {
            int length = str.length();
            int i13 = 0;
            while (i13 < length) {
                int codePointAt = str.codePointAt(i13);
                if (!Character.isWhitespace(codePointAt)) {
                    break;
                }
                i13 += Character.charCount(codePointAt);
            }
        }
        int i14 = fVar.f115784p;
        if (i14 != 0) {
            String quantityString = resources.getQuantityString(w0.recipe_serving, i14, Integer.valueOf(i14));
            Intrinsics.checkNotNullParameter(quantityString, "<set-?>");
            fVar.f115783o = quantityString;
        } else {
            Intrinsics.checkNotNullParameter("", "<set-?>");
            fVar.f115783o = "";
        }
        return fVar.f115783o;
    }
}
