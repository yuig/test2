package com.pinterest.feature.notificationtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.brio.widget.voice.PinterestToolTip;
import com.pinterest.gestalt.text.GestaltText;
import df.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ks1.c;
import ks1.d;
import m60.u;
import m60.w;
import org.jetbrains.annotations.NotNull;
import ve0.b;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/notificationtab/view/NotificationsTabBadgeTooltip;", "Lcom/pinterest/design/brio/widget/voice/PinterestToolTip;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "legoFloatingNavBarLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class NotificationsTabBadgeTooltip extends PinterestToolTip {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f46842t = 0;

    /* renamed from: q, reason: collision with root package name */
    public GestaltText f46843q;

    /* renamed from: r, reason: collision with root package name */
    public GestaltText f46844r;

    /* renamed from: s, reason: collision with root package name */
    public final w f46845s;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NotificationsTabBadgeTooltip(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestToolTip, com.pinterest.design.brio.widget.voice.PinterestVoiceLayout
    public final void e(Context context, b anchorPos) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(anchorPos, "anchorPos");
        super.e(context, anchorPos);
        LayoutInflater.from(context).inflate(d.notification_badge_flyout_tooltip, (ViewGroup) this, true);
        View findViewById = findViewById(c.updates_badge_txt);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f46843q = (GestaltText) findViewById;
        View findViewById2 = findViewById(c.message_badge_txt);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f46844r = (GestaltText) findViewById2;
        setOnClickListener(new com.pinterest.feature.home.view.c(this, 13));
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestToolTip
    public final int k() {
        return d.notification_badge_flyout_tooltip;
    }

    @Override // com.pinterest.design.brio.widget.voice.PinterestToolTip
    /* renamed from: l */
    public final int getF44908o() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return j1.K(context);
    }

    public /* synthetic */ NotificationsTabBadgeTooltip(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsTabBadgeTooltip(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        w wVar = u.f85943a;
        Intrinsics.checkNotNullExpressionValue(wVar, "getInstance(...)");
        this.f46845s = wVar;
    }
}
