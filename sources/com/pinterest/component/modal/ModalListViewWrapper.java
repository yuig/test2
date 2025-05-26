package com.pinterest.component.modal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.pinterest.design.progress.SmallLoadingView;
import com.pinterest.gestalt.text.GestaltText;
import d5.a;
import eo1.b;
import eo1.c;
import ga2.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/component/modal/ModalListViewWrapper;", "Lcom/pinterest/component/modal/BaseModalViewWrapper;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ui-components_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public class ModalListViewWrapper extends BaseModalViewWrapper {

    /* renamed from: k, reason: collision with root package name */
    public GestaltText f44767k;

    /* renamed from: l, reason: collision with root package name */
    public ListAdapter f44768l;

    /* renamed from: m, reason: collision with root package name */
    public AdapterView.OnItemClickListener f44769m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalListViewWrapper(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        s();
    }

    public final void s() {
        Context context = getContext();
        int i13 = b.color_themed_background_elevation_floating;
        Object obj = a.f53679a;
        setBackgroundColor(context.getColor(i13));
        View findViewById = findViewById(d.modal_list_container);
        ((FrameLayout) findViewById).setVisibility(0);
        this.f44754f = (ViewGroup) findViewById;
        View findViewById2 = findViewById(d.educational_content);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f44767k = (GestaltText) findViewById2;
    }

    public final void t(ListAdapter listAdapter) {
        this.f44768l = listAdapter;
        if (!(listAdapter instanceof AdapterView.OnItemClickListener)) {
            throw new IllegalArgumentException("ModalListViewWrapper.setListViewOptions: adapter must also implement OnItemClickListener.");
        }
        this.f44769m = (AdapterView.OnItemClickListener) listAdapter;
        ViewGroup viewGroup = this.f44754f;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeAllViews();
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.thumbnail_small_size);
        View smallLoadingView = new SmallLoadingView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.gravity = 17;
        com.bumptech.glide.c.a1(layoutParams, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        smallLoadingView.setLayoutParams(layoutParams);
        ListView listView = new ListView(getContext());
        listView.setEmptyView(smallLoadingView);
        listView.setAdapter(this.f44768l);
        listView.setOnItemClickListener(this.f44769m);
        viewGroup.addView(listView);
        viewGroup.addView(smallLoadingView);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalListViewWrapper(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        s();
    }
}
