package com.pinterest.feature.conversation.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import aq0.a;
import com.pinterest.ui.components.banners.LegoBannerView;
import dq0.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/conversation/view/ContactRequestPreviewWarningView;", "Landroid/widget/FrameLayout;", "Laq0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "conversation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ContactRequestPreviewWarningView extends FrameLayout implements a {

    /* renamed from: a, reason: collision with root package name */
    public b f45522a;

    /* renamed from: b, reason: collision with root package name */
    public final AttributeSet f45523b;

    /* renamed from: c, reason: collision with root package name */
    public final int f45524c;

    /* renamed from: d, reason: collision with root package name */
    public final LegoBannerView f45525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactRequestPreviewWarningView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45525d = a(context2, this.f45523b, this.f45524c);
        this.f45523b = attributeSet;
    }

    public final LegoBannerView a(Context context, AttributeSet attributeSet, int i13) {
        LegoBannerView legoBannerView = new LegoBannerView(context, attributeSet, i13);
        legoBannerView.D();
        String string = legoBannerView.getResources().getString(x0.accept);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        legoBannerView.d0(string);
        String string2 = legoBannerView.getResources().getString(x0.decline);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        legoBannerView.g0(string2);
        addView(legoBannerView, new FrameLayout.LayoutParams(-1, -2));
        return legoBannerView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactRequestPreviewWarningView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setClipChildren(false);
        setClipToPadding(false);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f45525d = a(context2, this.f45523b, this.f45524c);
        this.f45523b = attributeSet;
        this.f45524c = i13;
    }
}
