package com.airbnb.lottie;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class c0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        float floatValue = ((Float) ((p5.b) obj).f98856b).floatValue();
        float floatValue2 = ((Float) ((p5.b) obj2).f98856b).floatValue();
        if (floatValue2 > floatValue) {
            return 1;
        }
        return floatValue > floatValue2 ? -1 : 0;
    }
}
