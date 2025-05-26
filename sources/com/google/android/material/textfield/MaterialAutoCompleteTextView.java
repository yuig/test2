package com.google.android.material.textfield;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import com.google.android.material.internal.d0;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {

    /* renamed from: e, reason: collision with root package name */
    public final ListPopupWindow f33151e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f33152f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f33153g;

    /* renamed from: h, reason: collision with root package name */
    public final float f33154h;

    /* renamed from: i, reason: collision with root package name */
    public final ColorStateList f33155i;

    /* renamed from: j, reason: collision with root package name */
    public final int f33156j;

    /* renamed from: k, reason: collision with root package name */
    public final ColorStateList f33157k;

    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, fj.c.autoCompleteTextViewStyle);
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final ColorStateList c() {
        return this.f33155i;
    }

    public final float d() {
        return this.f33154h;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (e()) {
            this.f33151e.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public final boolean e() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f33152f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.TextView
    public final CharSequence getHint() {
        TextInputLayout b13 = b();
        return (b13 == null || !b13.E) ? super.getHint() : b13.p();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b13 = b();
        if (b13 != null && b13.E && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f33151e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i13, int i14) {
        super.onMeasure(i13, i14);
        if (View.MeasureSpec.getMode(i13) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b13 = b();
            int i15 = 0;
            if (adapter != null && b13 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f33151e;
                int min = Math.min(adapter.getCount(), Math.max(0, !listPopupWindow.f16397z.isShowing() ? -1 : listPopupWindow.f16374c.getSelectedItemPosition()) + 15);
                View view = null;
                int i16 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i15) {
                        view = null;
                        i15 = itemViewType;
                    }
                    view = adapter.getView(max, view, b13);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i16 = Math.max(i16, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.f16397z.getBackground();
                if (background != null) {
                    Rect rect = this.f33153g;
                    background.getPadding(rect);
                    i16 += rect.left + rect.right;
                }
                i15 = b13.f33165c.f33256f.getMeasuredWidth() + i16;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i15), View.MeasureSpec.getSize(i13)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z13) {
        if (e()) {
            return;
        }
        super.onWindowFocusChanged(z13);
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.f33151e.j(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f33151e;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f33151e.f16388q = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public final void setRawInputType(int i13) {
        super.setRawInputType(i13);
        TextInputLayout b13 = b();
        if (b13 != null) {
            b13.Z();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (e()) {
            this.f33151e.k();
        } else {
            super.showDropDown();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MaterialAutoCompleteTextView(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(fk.a.a(context, attributeSet, i13, 0), attributeSet, i13);
        int i14 = 0;
        this.f33153g = new Rect();
        Context context2 = getContext();
        TypedArray f13 = d0.f(context2, attributeSet, fj.m.MaterialAutoCompleteTextView, i13, fj.l.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (f13.hasValue(fj.m.MaterialAutoCompleteTextView_android_inputType) && f13.getInt(fj.m.MaterialAutoCompleteTextView_android_inputType, 0) == 0) {
            setKeyListener(null);
        }
        int resourceId = f13.getResourceId(fj.m.MaterialAutoCompleteTextView_simpleItemLayout, fj.i.mtrl_auto_complete_simple_item);
        this.f33154h = f13.getDimensionPixelOffset(fj.m.MaterialAutoCompleteTextView_android_popupElevation, fj.e.mtrl_exposed_dropdown_menu_popup_elevation);
        if (f13.hasValue(fj.m.MaterialAutoCompleteTextView_dropDownBackgroundTint)) {
            this.f33155i = ColorStateList.valueOf(f13.getColor(fj.m.MaterialAutoCompleteTextView_dropDownBackgroundTint, 0));
        }
        this.f33156j = f13.getColor(fj.m.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.f33157k = com.bumptech.glide.d.H(context2, f13, fj.m.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f33152f = (AccessibilityManager) context2.getSystemService("accessibility");
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f33151e = listPopupWindow;
        listPopupWindow.f16396y = true;
        listPopupWindow.f16397z.setFocusable(true);
        listPopupWindow.f16386o = this;
        listPopupWindow.f16397z.setInputMethodMode(2);
        listPopupWindow.j(getAdapter());
        listPopupWindow.f16387p = new r(this, i14);
        if (f13.hasValue(fj.m.MaterialAutoCompleteTextView_simpleItems)) {
            setAdapter(new s(this, getContext(), resourceId, getResources().getStringArray(f13.getResourceId(fj.m.MaterialAutoCompleteTextView_simpleItems, 0))));
        }
        f13.recycle();
    }
}
