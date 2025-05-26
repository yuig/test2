package com.pinterest.design.brio.widget.empty;

import a.z0;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.bumptech.glide.c;
import com.google.android.gms.ads.AdSize;
import com.pinterest.design.brio.widget.voice.PinterestSuggestion;
import com.pinterest.design.brio.widget.voice.PinterestVoiceLayout;
import com.pinterest.design.brio.widget.voice.PinterestVoiceMessage;
import df.j1;
import java.util.ArrayList;
import java.util.Iterator;
import le0.i;
import pk.a0;
import ps0.r;
import qe0.a;
import qe0.b;

/* loaded from: classes.dex */
public class PinterestEmptyStateLayout extends FrameLayout {

    /* renamed from: j, reason: collision with root package name */
    public static final int f44848j;

    /* renamed from: a, reason: collision with root package name */
    public b f44849a;

    /* renamed from: b, reason: collision with root package name */
    public PinterestVoiceLayout f44850b;

    /* renamed from: c, reason: collision with root package name */
    public View f44851c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44852d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f44853e;

    /* renamed from: f, reason: collision with root package name */
    public final int f44854f;

    /* renamed from: g, reason: collision with root package name */
    public a f44855g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f44856h;

    /* renamed from: i, reason: collision with root package name */
    public z0 f44857i;

    static {
        f44848j = hf0.b.q() ? AdSize.MEDIUM_RECTANGLE_WIDTH : 284;
    }

    public PinterestEmptyStateLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44854f = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f44856h = new ArrayList();
        c(context, attributeSet);
        a(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.pinterest.design.brio.widget.voice.PinterestVoiceMessage] */
    public final void a(Context context) {
        PinterestSuggestion pinterestVoiceMessage = this.f44849a == b.VOICE_MESSAGE ? new PinterestVoiceMessage(context) : new PinterestSuggestion(context);
        this.f44850b = pinterestVoiceMessage;
        pinterestVoiceMessage.c(j1.K(context));
        b();
    }

    public final void b() {
        removeView(this.f44851c);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a0.K(f44848j, getResources()), -2);
        layoutParams.gravity = 49;
        int i13 = this.f44854f;
        c.a1(layoutParams, i13, 0, i13, 0);
        this.f44851c = this.f44850b;
        e(false);
        addView(this.f44851c, layoutParams);
    }

    public final void c(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            this.f44849a = b.VOICE_MESSAGE;
            this.f44853e = true;
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.PinterestEmptyStateLayout);
        int i13 = i.PinterestEmptyStateLayout_messageType;
        b bVar = this.f44849a;
        this.f44849a = obtainStyledAttributes.getInteger(i13, bVar == null ? 0 : bVar.getValue()) == 0 ? b.VOICE_MESSAGE : b.VOICE_SUGGESTION;
        this.f44853e = obtainStyledAttributes.getBoolean(i.PinterestEmptyStateLayout_hideContents, true);
        obtainStyledAttributes.recycle();
    }

    public final void d() {
        b();
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.pinterest.design.brio.widget.voice.PinterestVoiceLayout, ve0.c] */
    public final void e(boolean z13) {
        ?? r53;
        this.f44851c.setVisibility(z13 ? 0 : 8);
        int i13 = (z13 && this.f44853e) ? 8 : 0;
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt != null && childAt == (r53 = this.f44850b) && !r53.b()) {
                childAt.setVisibility(8);
            } else if (childAt != null && childAt != this.f44851c) {
                childAt.setVisibility(i13);
            }
        }
        if (z13 != this.f44852d) {
            Iterator it = this.f44856h.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a(z13);
            }
        }
        this.f44852d = z13;
    }

    public final void f(boolean z13) {
        if (this.f44852d != z13) {
            e(z13);
        }
    }

    public final void g() {
        a aVar = this.f44855g;
        f(aVar != null && aVar.isEmpty());
    }

    public final void h(View view, int i13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = i13;
        int i14 = this.f44854f;
        c.a1(layoutParams, i14, 0, i14, 0);
        i(view, layoutParams);
    }

    public final void i(View view, FrameLayout.LayoutParams layoutParams) {
        if (view != null) {
            removeView(this.f44851c);
            this.f44851c = view;
            e(false);
            addView(this.f44851c, layoutParams);
            z0 z0Var = this.f44857i;
            if (z0Var != null) {
                z0Var.r(this.f44851c);
            }
        }
    }

    public PinterestEmptyStateLayout(@NonNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f44854f = (int) TypedValue.applyDimension(1, 16.0f, getResources().getDisplayMetrics());
        this.f44856h = new ArrayList();
        c(context, attributeSet);
        a(context);
    }
}
