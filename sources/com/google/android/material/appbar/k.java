package com.google.android.material.appbar;

import android.view.View;
import java.util.WeakHashMap;
import q5.v0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final View f32197a;

    /* renamed from: b, reason: collision with root package name */
    public int f32198b;

    /* renamed from: c, reason: collision with root package name */
    public int f32199c;

    /* renamed from: d, reason: collision with root package name */
    public int f32200d;

    public k(View view) {
        this.f32197a = view;
    }

    public final void a() {
        int i13 = this.f32200d;
        View view = this.f32197a;
        int top = i13 - (view.getTop() - this.f32198b);
        WeakHashMap weakHashMap = v0.f102521a;
        view.offsetTopAndBottom(top);
        view.offsetLeftAndRight(0 - (view.getLeft() - this.f32199c));
    }

    public final boolean b(int i13) {
        if (this.f32200d == i13) {
            return false;
        }
        this.f32200d = i13;
        a();
        return true;
    }
}
