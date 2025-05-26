package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import q5.v0;
import v.s;

/* loaded from: classes3.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a, reason: collision with root package name */
    public final Chip f33328a;

    /* renamed from: b, reason: collision with root package name */
    public final EditText f33329b;

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static String a(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f33328a.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f33329b.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z13) {
        Chip chip = this.f33328a;
        chip.setChecked(z13);
        int i13 = 4;
        boolean z14 = false;
        int i14 = z13 ? 0 : 4;
        EditText editText = this.f33329b;
        editText.setVisibility(i14);
        chip.setVisibility(z13 ? 8 : 0);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new s(editText, z14, i13));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f33328a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i13, Object obj) {
        this.f33328a.setTag(i13, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f33328a.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(fj.i.material_time_chip, (ViewGroup) this, false);
        this.f33328a = chip;
        chip.f32455q = "android.view.View";
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(fj.i.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.f33167d;
        this.f33329b = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new a(this));
        editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(fj.g.material_label);
        WeakHashMap weakHashMap = v0.f102521a;
        editText.setId(View.generateViewId());
        textView.setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
