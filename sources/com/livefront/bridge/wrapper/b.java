package com.livefront.bridge.wrapper;

import android.graphics.Bitmap;
import android.os.Bundle;

/* loaded from: classes.dex */
public abstract class b {
    public static void a(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (bundle.get(str) instanceof BitmapWrapper) {
                bundle.putParcelable(str, ((BitmapWrapper) bundle.get(str)).a());
            }
        }
    }

    public static void b(Bundle bundle) {
        for (String str : bundle.keySet()) {
            if (bundle.get(str) instanceof Bitmap) {
                bundle.putParcelable(str, new BitmapWrapper((Bitmap) bundle.get(str)));
            }
        }
    }
}
