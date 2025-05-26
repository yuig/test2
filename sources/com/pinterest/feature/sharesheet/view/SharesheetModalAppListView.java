package com.pinterest.feature.sharesheet.view;

import a62.c;
import a62.d;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.b1;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import fd1.g;
import fd1.p0;
import fd1.q0;
import jf0.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.a4;
import lh0.g1;
import lh0.v3;
import lh0.z3;
import org.jetbrains.annotations.NotNull;
import so.jb;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetModalAppListView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetModalAppListView extends BaseRecyclerContainerView {

    /* renamed from: b, reason: collision with root package name */
    public boolean f48412b;

    /* renamed from: c, reason: collision with root package name */
    public final v f48413c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppListView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final b1 createLayoutManagerContract(int i13, boolean z13) {
        return super.createLayoutManagerContract(0, z13);
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f48413c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return d.view_sharesheet_apps_list;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return c.sharesheet_apps_list_p_recycler_view;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f48412b) {
            return;
        }
        this.f48412b = true;
        this.videoViewabilityRecyclerListenerProvider = ((jb) ((q0) generatedComponent())).f113494l;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        adapter.G(RecyclerViewTypes.VIEW_TYPE_SHARESHEET_APP, new p0(this, 0));
        adapter.G(10002, new p0(this, 1));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppListView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f48413c = m.b(g.f61913l);
        v vVar = f.f75868a;
        v3 v3Var = (v3) vVar.getValue();
        v3Var.getClass();
        z3 z3Var = a4.f83297a;
        g1 g1Var = (g1) v3Var.f83493a;
        if (g1Var.o("android_preview_sharesheet", "enabled", z3Var) || g1Var.l("android_preview_sharesheet")) {
            return;
        }
        v3 v3Var2 = (v3) vVar.getValue();
        v3Var2.getClass();
        g1 g1Var2 = (g1) v3Var2.f83493a;
        if (g1Var2.o("sg_android_pin_preview_sharesheet", "enabled", z3Var) || g1Var2.l("sg_android_pin_preview_sharesheet")) {
            return;
        }
        getPinterestRecyclerView().f52531a.f19254t = true;
    }
}
