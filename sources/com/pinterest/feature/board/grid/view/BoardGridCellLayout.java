package com.pinterest.feature.board.grid.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b70.a;
import b70.c;
import com.pinterest.feature.user.board.view.MultiUserAvatarLayout;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.brio.reps.board.BoardGridCellTitleView;
import com.pinterest.ui.grid.PinterestAdapterView;
import h32.t;
import kotlin.jvm.internal.Intrinsics;
import nx.v;
import rq.n0;
import sl0.b;

/* loaded from: classes5.dex */
public class BoardGridCellLayout extends LinearLayout implements b, v {

    /* renamed from: a, reason: collision with root package name */
    public final BoardGridCellTitleView f45262a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f45263b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltText f45264c;

    /* renamed from: d, reason: collision with root package name */
    public final MultiUserAvatarLayout f45265d;

    /* renamed from: e, reason: collision with root package name */
    public final BoardGridCellImageView f45266e;

    /* renamed from: f, reason: collision with root package name */
    public tl0.b f45267f;

    /* renamed from: g, reason: collision with root package name */
    public t f45268g;

    /* renamed from: h, reason: collision with root package name */
    public String f45269h;

    public BoardGridCellLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSetPressed(boolean z13) {
    }

    @Override // nx.v
    public final Object markImpressionEnd() {
        t source = this.f45268g;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        return new t(this.f45269h, source.f67245b, source.f67246c, source.f67247d, ep.b.f(1000000L), source.f67249f, source.f67250g, source.f67251h, source.f67252i, source.f67253j, source.f67254k, source.f67255l, source.f67256m);
    }

    @Override // nx.v
    public final Object markImpressionStart() {
        t tVar = new t(null, null, null, ep.b.f(1000000L), null, null, null, null, null, null, null, null, null);
        this.f45268g = tVar;
        return tVar;
    }

    public BoardGridCellLayout(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        hashCode();
        setLayoutParams(new PinterestAdapterView.LayoutParams(-1));
        setOrientation(1);
        View.inflate(getContext(), c.list_cell_board_mvp, this);
        this.f45262a = (BoardGridCellTitleView) findViewById(b70.b.title);
        this.f45263b = (GestaltText) findViewById(b70.b.pinner_name);
        this.f45264c = (GestaltText) findViewById(b70.b.pin_count);
        this.f45265d = (MultiUserAvatarLayout) findViewById(b70.b.board_users_avatar);
        this.f45266e = (BoardGridCellImageView) findViewById(b70.b.cover);
        int dimensionPixelSize = getResources().getDimensionPixelSize(a.board_grid_cell_cover_margin);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f45266e.getLayoutParams();
        layoutParams.bottomMargin = dimensionPixelSize;
        this.f45266e.setLayoutParams(layoutParams);
        setOnClickListener(new lj0.a(this, 8));
        setOnLongClickListener(new n0(this, 4));
    }
}
