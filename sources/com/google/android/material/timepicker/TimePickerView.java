package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

/* loaded from: classes3.dex */
class TimePickerView extends ConstraintLayout {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33365b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Chip f33366a;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i13) {
        super.onVisibilityChanged(view, i13);
        if (view == this && i13 == 0) {
            this.f33366a.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        h hVar = new h(this);
        LayoutInflater.from(context).inflate(fj.i.material_timepicker, this);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(fj.g.material_clock_period_toggle);
        materialButtonToggleGroup.f32359c.add(new g(this));
        Chip chip = (Chip) findViewById(fj.g.material_minute_tv);
        Chip chip2 = (Chip) findViewById(fj.g.material_hour_tv);
        this.f33366a = chip2;
        j jVar = new j(new GestureDetector(getContext(), new i(this)));
        chip.setOnTouchListener(jVar);
        chip2.setOnTouchListener(jVar);
        chip.setTag(fj.g.selection_type, 12);
        chip2.setTag(fj.g.selection_type, 10);
        chip.setOnClickListener(hVar);
        chip2.setOnClickListener(hVar);
        chip.f32455q = "android.view.View";
        chip2.f32455q = "android.view.View";
    }
}
