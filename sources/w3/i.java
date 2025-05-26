package w3;

import android.os.Bundle;
import android.view.ViewStructure;

/* loaded from: classes2.dex */
public abstract class i {
    public static Bundle a(ViewStructure viewStructure) {
        return viewStructure.getExtras();
    }

    public static void b(ViewStructure viewStructure, String str) {
        viewStructure.setClassName(str);
    }

    public static void c(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setContentDescription(charSequence);
    }

    public static void d(ViewStructure viewStructure, int i13, int i14, int i15, int i16, int i17, int i18) {
        viewStructure.setDimens(i13, i14, i15, i16, i17, i18);
    }

    public static void e(ViewStructure viewStructure, CharSequence charSequence) {
        viewStructure.setText(charSequence);
    }

    public static void f(ViewStructure viewStructure, float f13, int i13, int i14, int i15) {
        viewStructure.setTextStyle(f13, i13, i14, i15);
    }
}
