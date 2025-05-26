package gm1;

import android.content.Context;
import android.util.TypedValue;
import g92.d;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface b {
    static d R1(Context context, int i13) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i13, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence != null) {
            String upperCase = charSequence.toString().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            d valueOf = d.valueOf(upperCase);
            if (valueOf != null) {
                return valueOf;
            }
        }
        return d.CLASSIC;
    }
}
