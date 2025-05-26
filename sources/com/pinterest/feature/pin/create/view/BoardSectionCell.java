package com.pinterest.feature.pin.create.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import ar0.b;
import com.pinterest.gestalt.text.GestaltText;
import f02.c;
import f02.e;
import yk1.n;

/* loaded from: classes5.dex */
public class BoardSectionCell extends LinearLayout implements n, b {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47065c = 0;

    /* renamed from: a, reason: collision with root package name */
    public GestaltText f47066a;

    /* renamed from: b, reason: collision with root package name */
    public String f47067b;

    public BoardSectionCell(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        this.f47067b = "";
        View.inflate(context, e.list_lego_cell_board_section, this);
        this.f47066a = (GestaltText) findViewById(c.board_section_name);
        setOrientation(1);
        this.f47066a.i(new oo0.b(14));
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 18));
    }

    @Override // ar0.b
    public final boolean b() {
        return false;
    }

    public BoardSectionCell(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public BoardSectionCell(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context);
    }
}
