package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.airbnb.lottie.k;
import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.searchField.GestaltSearchField;
import fv0.g;
import kotlin.jvm.internal.Intrinsics;
import lp.o;
import m60.r0;
import pk.a0;
import xc0.c;
import xc0.e;
import xo.j;

/* loaded from: classes3.dex */
public class PeopleFacetSearchBar extends HorizontalScrollView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f34884d = 0;

    /* renamed from: a, reason: collision with root package name */
    public LinearLayout f34885a;

    /* renamed from: b, reason: collision with root package name */
    public GestaltSearchField f34886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f34887c;

    public PeopleFacetSearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void a(TypeAheadItem typeAheadItem) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(this.f34887c);
        layoutParams.gravity = 16;
        Context context = getContext();
        Intrinsics.checkNotNullParameter(context, "context");
        GestaltAvatar gestaltAvatar = new GestaltAvatar(6, context, (AttributeSet) null);
        gestaltAvatar.setLayoutParams(layoutParams);
        gestaltAvatar.setTag(typeAheadItem);
        gestaltAvatar.H2(new o(0, typeAheadItem));
        this.f34885a.addView(gestaltAvatar, Math.max(0, this.f34885a.getChildCount() - 1));
        this.f34886b.a0(new j(10));
        String n13 = typeAheadItem.n();
        String k13 = typeAheadItem.k();
        if (a0.x0(n13)) {
            n13 = k13;
        }
        String l13 = typeAheadItem.l();
        int i13 = typeAheadItem.f35147h;
        Intrinsics.checkNotNullParameter(gestaltAvatar, "<this>");
        gestaltAvatar.H2(new g(n13, i13, 3, l13));
        postDelayed(new k(this, 23), 100L);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        getChildCount();
        this.f34885a = (LinearLayout) findViewById(e.search_container);
        this.f34886b = (GestaltSearchField) findViewById(e.searchEt);
    }

    public PeopleFacetSearchBar(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Resources resources = getResources();
        resources.getDimensionPixelSize(r0.thumbnail_size);
        this.f34887c = resources.getDimensionPixelSize(c.list_cell_guided_text_image_gap);
    }
}
