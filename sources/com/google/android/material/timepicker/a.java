package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.c0;

/* loaded from: classes3.dex */
public final class a extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f33367a;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f33367a = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.f33367a;
        if (isEmpty) {
            chipTextInputComboView.f33328a.setText(ChipTextInputComboView.a(chipTextInputComboView, "00"));
            return;
        }
        String a13 = ChipTextInputComboView.a(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.f33328a;
        if (TextUtils.isEmpty(a13)) {
            a13 = ChipTextInputComboView.a(chipTextInputComboView, "00");
        }
        chip.setText(a13);
    }
}
