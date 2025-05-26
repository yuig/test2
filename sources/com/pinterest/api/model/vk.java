package com.pinterest.api.model;

import android.animation.ValueAnimator;
import android.graphics.PointF;
import android.view.View;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public interface vk {
    ValueAnimator getDefaultAnimator();

    List getProperties();

    void glTransformations(hn hnVar, qw0 qw0Var, Function2 function2);

    void viewTransformations(View view, qw0 qw0Var, PointF pointF);
}
