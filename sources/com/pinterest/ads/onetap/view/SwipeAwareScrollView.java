package com.pinterest.ads.onetap.view;

import ac2.m;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.pinterest.ui.scrollview.ObservableScrollView;
import cu.q;
import iv.f;
import java.util.ArrayList;
import kh2.j1;
import so.jb;
import ue0.b;
import ye2.o;

/* loaded from: classes3.dex */
public class SwipeAwareScrollView extends ObservableScrollView implements c {
    public o O;
    public boolean P;
    public b Q;
    public m R;

    public SwipeAwareScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        G0();
        this.Q = null;
        q qVar = new q(this, 2);
        ArrayList arrayList = this.F;
        if (arrayList.contains(qVar)) {
            return;
        }
        arrayList.add(qVar);
    }

    public void G0() {
        if (this.P) {
            return;
        }
        this.P = true;
        j1.Y0(this, (m) ((jb) ((f) generatedComponent())).f113483a.C7.get());
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.O == null) {
            this.O = new o(this);
        }
        return this.O;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.O == null) {
            this.O = new o(this);
        }
        return this.O.generatedComponent();
    }

    @Override // com.pinterest.ui.scrollview.ObservableScrollView, androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (!canScrollVertically(-1) && (bVar = this.Q) != null) {
            bVar.b(motionEvent, 0.0f, false);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.pinterest.ui.scrollview.ObservableScrollView, androidx.core.widget.NestedScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (!canScrollVertically(-1) && (bVar = this.Q) != null) {
            bVar.c(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    public SwipeAwareScrollView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        G0();
        this.Q = null;
    }
}
