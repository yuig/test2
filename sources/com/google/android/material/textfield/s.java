package com.google.android.material.textfield;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes3.dex */
public final class s extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f33309a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f33310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialAutoCompleteTextView f33311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MaterialAutoCompleteTextView materialAutoCompleteTextView, Context context, int i13, String[] strArr) {
        super(context, i13, strArr);
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        this.f33311c = materialAutoCompleteTextView;
        ColorStateList colorStateList3 = materialAutoCompleteTextView.f33157k;
        ColorStateList colorStateList4 = null;
        if (colorStateList3 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList3.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f33310b = colorStateList;
        if (materialAutoCompleteTextView.f33156j != 0 && (colorStateList2 = materialAutoCompleteTextView.f33157k) != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            int colorForState = colorStateList2.getColorForState(iArr3, 0);
            int colorForState2 = materialAutoCompleteTextView.f33157k.getColorForState(iArr2, 0);
            int i14 = materialAutoCompleteTextView.f33156j;
            colorStateList4 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{f5.c.g(colorForState, i14), f5.c.g(colorForState2, i14), i14});
        }
        this.f33309a = colorStateList4;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i13, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i13, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = this.f33311c;
            Drawable drawable = null;
            if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.f33156j != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.f33156j);
                if (this.f33310b != null) {
                    colorDrawable.setTintList(this.f33309a);
                    drawable = new RippleDrawable(this.f33310b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = v0.f102521a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
