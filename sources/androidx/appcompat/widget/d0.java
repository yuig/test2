package androidx.appcompat.widget;

import android.content.res.Resources;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class d0 {
    public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
        if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
            return;
        }
        themedSpinnerAdapter.setDropDownViewTheme(theme);
    }
}
