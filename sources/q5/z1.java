package q5;

import android.view.WindowInsets;

/* loaded from: classes3.dex */
public abstract class z1 {
    public static int a(int i13) {
        int statusBars;
        int i14 = 0;
        for (int i15 = 1; i15 <= 256; i15 <<= 1) {
            if ((i13 & i15) != 0) {
                if (i15 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i15 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i15 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i15 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i15 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i15 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i15 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i15 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i14 |= statusBars;
            }
        }
        return i14;
    }
}
