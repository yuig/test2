package com.airbnb.lottie;

/* loaded from: classes.dex */
public enum g0 {
    AUTOMATIC,
    HARDWARE,
    SOFTWARE;

    public boolean useSoftwareRendering(int i13, boolean z13, int i14) {
        int i15 = f0.f28393a[ordinal()];
        if (i15 == 1) {
            return false;
        }
        if (i15 != 2) {
            return (z13 && i13 < 28) || i14 > 4 || i13 <= 25;
        }
        return true;
    }
}
