package com.pinterest.framework.screens;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.z;

/* loaded from: classes2.dex */
public interface m extends z, x {
    void activate();

    void deactivate();

    void unbind();

    void x3(Context context, ScreenDescription screenDescription, Bundle bundle);
}
