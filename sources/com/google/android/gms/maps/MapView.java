package com.google.android.gms.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import mi.a;

/* loaded from: classes3.dex */
public class MapView extends FrameLayout {
    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        GoogleMapOptions.e(context, attributeSet);
        new a();
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        GoogleMapOptions.e(context, attributeSet);
        new a();
        setClickable(true);
    }
}
