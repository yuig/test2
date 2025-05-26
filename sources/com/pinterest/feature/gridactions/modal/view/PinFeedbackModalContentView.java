package com.pinterest.feature.gridactions.modal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.ui.view.BaseRecyclerContainerView;
import cs0.d;
import fs0.k;
import gs0.g;
import gs0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import so.jb;
import xk2.m;
import xk2.v;
import yq0.z;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/gridactions/modal/view/PinFeedbackModalContentView;", "Lcom/pinterest/ui/view/BaseRecyclerContainerView;", "Lyq0/a0;", "Lcs0/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "pinFeedbackModalLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class PinFeedbackModalContentView extends BaseRecyclerContainerView implements d {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f45711h = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f45712b;

    /* renamed from: c, reason: collision with root package name */
    public final v f45713c;

    /* renamed from: d, reason: collision with root package name */
    public k f45714d;

    /* renamed from: e, reason: collision with root package name */
    public gs0.c f45715e;

    /* renamed from: f, reason: collision with root package name */
    public i92.k f45716f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewGroup f45717g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PinFeedbackModalContentView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final String getDebugTag() {
        return (String) this.f45713c.getValue();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getLayoutResourceId() {
        return vy1.b.interests_layout;
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final int getPinterestRecyclerViewId() {
        return vy1.a.p_recycler_view;
    }

    @Override // hb2.h
    public final void inject() {
        if (this.f45712b) {
            return;
        }
        this.f45712b = true;
        jb jbVar = (jb) ((h) generatedComponent());
        this.videoViewabilityRecyclerListenerProvider = jbVar.f113494l;
        this.f45715e = jbVar.e();
        this.f45716f = (i92.k) jbVar.f113483a.f113921t1.get();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !isEnabled();
    }

    @Override // com.pinterest.ui.view.BaseRecyclerContainerView
    public final void registerViewHolderCreators(z adapter) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
    }

    public /* synthetic */ PinFeedbackModalContentView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinFeedbackModalContentView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        inject();
        this.f45713c = m.b(g.f66043i);
        View findViewById = findViewById(vy1.a.feedback_options);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f45717g = (ViewGroup) findViewById;
        View findViewById2 = findViewById(vy1.a.p_recycler_view);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
    }
}
