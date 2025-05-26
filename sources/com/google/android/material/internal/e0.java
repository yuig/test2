package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b4.f f32757a = new b4.f(6);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32758b = 0;

    public static ActionMenuView a(Toolbar toolbar) {
        for (int i13 = 0; i13 < toolbar.getChildCount(); i13++) {
            View childAt = toolbar.getChildAt(i13);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    public static ImageButton b(Toolbar toolbar) {
        Drawable o13 = toolbar.o();
        if (o13 == null) {
            return null;
        }
        for (int i13 = 0; i13 < toolbar.getChildCount(); i13++) {
            View childAt = toolbar.getChildAt(i13);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == o13) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static ArrayList c(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < toolbar.getChildCount(); i13++) {
            View childAt = toolbar.getChildAt(i13);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }
}
