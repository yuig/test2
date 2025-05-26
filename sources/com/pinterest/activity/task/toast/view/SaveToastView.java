package com.pinterest.activity.task.toast.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import m80.b;

/* loaded from: classes3.dex */
public class SaveToastView extends FrameLayout {
    public SaveToastView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SaveToastView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater.from(getContext()).inflate(b.view_save_toast, (ViewGroup) this, true);
    }
}
