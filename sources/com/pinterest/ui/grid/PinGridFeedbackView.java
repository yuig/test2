package com.pinterest.ui.grid;

import a.h5;
import a.z0;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bk2.c;
import com.pinterest.api.model.f30;
import com.pinterest.gestalt.text.GestaltText;
import ek2.j;
import gb2.f;
import gb2.i;
import i91.h0;
import jk2.j1;
import jk2.x;
import m60.s0;
import xy1.b;

/* loaded from: classes4.dex */
public class PinGridFeedbackView extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f52492e = 0;

    /* renamed from: a, reason: collision with root package name */
    public f30 f52493a;

    /* renamed from: b, reason: collision with root package name */
    public i f52494b;

    /* renamed from: c, reason: collision with root package name */
    public j f52495c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f52496d;

    public PinGridFeedbackView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = f.f64747a;
        this.f52495c = (j) new x(new j1(f.a(), new h5(2), 0), new z0(this, 1), 2).F(new xo.a(this, 21), new h0(8), ck2.i.f27923c, ck2.i.f27924d);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f52495c;
        if (jVar == null || jVar.isDisposed()) {
            return;
        }
        j jVar2 = this.f52495c;
        jVar2.getClass();
        c.dispose(jVar2);
    }

    public PinGridFeedbackView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        LayoutInflater.from(getContext()).inflate(b.grid_cell_feedback, (ViewGroup) this, true);
        this.f52496d = (GestaltText) findViewById(xy1.a.title);
        setOrientation(1);
        setBackgroundResource(s0.bg_feedback);
    }
}
