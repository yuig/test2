package com.pinterest.api.model;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public interface ek {
    ValueAnimator getDefaultAnimator();

    List getProperties();

    void glTransformations(hn hnVar, pw0 pw0Var, Function2 function2);

    void viewTransformations(View view, pw0 pw0Var, PointF pointF);
}
