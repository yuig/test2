package com.pinterest.ui.grid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.pinterest.gestalt.spinner.GestaltSpinner;
import nl1.e;
import nl1.f;
import oo0.b;

@Deprecated
/* loaded from: classes4.dex */
public class AdapterFooterView extends RelativeLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f52372e = 0;

    /* renamed from: a, reason: collision with root package name */
    public int f52373a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltSpinner f52374b;

    /* renamed from: c, reason: collision with root package name */
    public final View f52375c;

    /* renamed from: d, reason: collision with root package name */
    public final int f52376d;

    public AdapterFooterView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a() {
        int i13 = this.f52373a;
        if (i13 == 0) {
            this.f52374b.u(new b(21));
            this.f52375c.setVisibility(0);
        } else if (i13 == 1) {
            this.f52374b.u(new b(22));
            this.f52375c.setVisibility(0);
        } else {
            if (i13 != 2) {
                return;
            }
            this.f52374b.u(new b(23));
            this.f52375c.setVisibility(8);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeAllViews();
        super.onDetachedFromWindow();
    }

    public AdapterFooterView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.f52373a = 2;
        View.inflate(getContext(), f.list_footer, this);
        this.f52374b = (GestaltSpinner) findViewById(e.loading_pb);
        this.f52375c = findViewById(e.footer_layout);
        this.f52376d = ((FrameLayout.LayoutParams) this.f52374b.getLayoutParams()).topMargin;
        a();
    }
}
