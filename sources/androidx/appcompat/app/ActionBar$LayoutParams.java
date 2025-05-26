package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public class ActionBar$LayoutParams extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f15945a;

    public ActionBar$LayoutParams(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15945a = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.j.ActionBarLayout);
        this.f15945a = obtainStyledAttributes.getInt(i.j.ActionBarLayout_android_layout_gravity, 0);
        obtainStyledAttributes.recycle();
    }

    public ActionBar$LayoutParams(ActionBar$LayoutParams actionBar$LayoutParams) {
        super((ViewGroup.MarginLayoutParams) actionBar$LayoutParams);
        this.f15945a = 0;
        this.f15945a = actionBar$LayoutParams.f15945a;
    }

    public ActionBar$LayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f15945a = 0;
    }
}
