package com.pinterest.feature.contextualtypeahead.view;

import android.content.Context;
import android.util.AttributeSet;
import bs1.c;
import com.pinterest.ui.grid.PinterestRecyclerView;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.oa;
import v92.b;
import vp0.a;
import xk2.m;
import xk2.v;
import yq0.z;
import zp0.i;
import zp0.j;
import zp0.k;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0019\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\b\u0010\f¨\u0006\r"}, d2 = {"Lcom/pinterest/feature/contextualtypeahead/view/ContextualTypeaheadListView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lxp0/d;", "Lvp0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "typeaheadLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ContextualTypeaheadListView extends BaseRecyclerContainerView implements a {

    /* renamed from: b, reason: collision with root package name */
    public boolean f45505b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f45506c;

    /* renamed from: d, reason: collision with root package name */
    public final v f45507d;

    /* renamed from: e, reason: collision with root package name */
    public j f45508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualTypeaheadListView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f45507d = m.b(i.f142622i);
    }

    public final void b(j styles) {
        Intrinsics.checkNotNullParameter(styles, "styles");
        ((PinterestRecyclerView) findViewById(v92.a.p_recycler_view)).setBackgroundColor(c.B(this, styles.f142623a));
        this.f45508e = styles;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f45507d.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return b.mentions_typeahead_view;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return v92.a.p_recycler_view;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f45505b) {
            return;
        }
        this.f45505b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((k) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        up0.b bVar = (up0.b) ((oa) ((w92.a) w92.c.f128606a.getValue())).Pc.get();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        adapter.G(1, bVar.getView(context, this.f45508e, this.f45506c));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualTypeaheadListView(Context context, int i13) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f45507d = m.b(i.f142622i);
        this.f45506c = 22;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualTypeaheadListView(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        this.f45507d = m.b(i.f142622i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextualTypeaheadListView(@NotNull Context context, @NotNull AttributeSet attrs, int i13) {
        super(context, attrs, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        inject();
        this.f45507d = m.b(i.f142622i);
    }
}
