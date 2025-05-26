package com.pinterest.activity.sendapin.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.ui.brio.reps.pinner.PinnerGridCell;
import com.pinterest.ui.imageview.WebImageView;
import cp.i;
import ea2.a;
import kh2.k3;
import pk.a0;
import vc0.b;
import vn1.c;

/* loaded from: classes3.dex */
public class PersonListCell extends LinearLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f35160g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f35161a;

    /* renamed from: b, reason: collision with root package name */
    public ViewGroup f35162b;

    /* renamed from: c, reason: collision with root package name */
    public GestaltCheckBox f35163c;

    /* renamed from: d, reason: collision with root package name */
    public PinnerGridCell f35164d;

    /* renamed from: e, reason: collision with root package name */
    public WebImageView f35165e;

    /* renamed from: f, reason: collision with root package name */
    public c f35166f;

    public PersonListCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35161a = context;
    }

    public final void a(View view) {
        int K = a0.K(4, getResources());
        int K2 = a0.K(4, getResources());
        com.bumptech.glide.c.a1((ViewGroup.MarginLayoutParams) view.getLayoutParams(), K, K2, K, K2);
    }

    public final void b(String str) {
        k3.R1(this.f35164d, true);
        PinnerGridCell pinnerGridCell = this.f35164d;
        pinnerGridCell.f52219h.i(new a(0, str));
        pinnerGridCell.j();
        pinnerGridCell.i();
        this.f35164d.f52219h.i(new i(this.f35166f, 10));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f35162b = (ViewGroup) findViewById(w42.a.person_cell);
        this.f35164d = (PinnerGridCell) findViewById(w42.a.pinner_grid_cell);
        this.f35165e = (WebImageView) findViewById(b.image_placeholder);
        this.f35166f = c.DEFAULT;
        ViewGroup viewGroup = this.f35162b;
        if (viewGroup != null) {
            viewGroup.setLayoutDirection(this.f35161a.getResources().getConfiguration().getLayoutDirection());
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i13) {
        super.setBackgroundColor(i13);
        ViewGroup viewGroup = this.f35162b;
        if (viewGroup != null) {
            viewGroup.setBackgroundColor(i13);
        }
        PinnerGridCell pinnerGridCell = this.f35164d;
        if (pinnerGridCell != null) {
            pinnerGridCell.setBackgroundColor(i13);
        }
    }
}
