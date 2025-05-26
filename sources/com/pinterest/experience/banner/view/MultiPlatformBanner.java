package com.pinterest.experience.banner.view;

import android.content.Context;
import android.util.AttributeSet;
import ex1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vg0.a;
import vg0.b;
import vn1.g;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\fB\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/pinterest/experience/banner/view/MultiPlatformBanner;", "Lcom/pinterest/ui/components/banners/LegoBannerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "g4/u", "experienceLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MultiPlatformBanner extends a implements n {
    public static final /* synthetic */ int D = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPlatformBanner(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        a0(g.BODY_300);
        b action = new b(this, 0);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52263r = action;
        b action2 = new b(this, 1);
        Intrinsics.checkNotNullParameter(action2, "action");
        this.f52264s = action2;
        b action3 = new b(this, 2);
        Intrinsics.checkNotNullParameter(action3, "action");
        this.f52259n.u(new c(6, action3));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiPlatformBanner(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        a0(g.BODY_300);
        b action = new b(this, 0);
        Intrinsics.checkNotNullParameter(action, "action");
        this.f52263r = action;
        b action2 = new b(this, 1);
        Intrinsics.checkNotNullParameter(action2, "action");
        this.f52264s = action2;
        b action3 = new b(this, 2);
        Intrinsics.checkNotNullParameter(action3, "action");
        this.f52259n.u(new c(6, action3));
    }
}
