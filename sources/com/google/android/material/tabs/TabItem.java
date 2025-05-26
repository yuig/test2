package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import fj.m;
import x92.b;

/* loaded from: classes3.dex */
public class TabItem extends View {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f33121a;

    /* renamed from: b, reason: collision with root package name */
    public final Drawable f33122b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33123c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b M = b.M(context, attributeSet, m.TabItem);
        this.f33121a = M.E(m.TabItem_android_text);
        this.f33122b = M.x(m.TabItem_android_icon);
        this.f33123c = M.C(m.TabItem_android_layout, 0);
        M.O();
    }
}
