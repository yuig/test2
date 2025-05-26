package com.pinterest.feature.sharesheet.view;

import a62.d;
import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import fd1.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ye2.o;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/sharesheet/view/SharesheetModalAppWithBadgeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "shareLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SharesheetModalAppWithBadgeView extends ConstraintLayout implements n, c {

    /* renamed from: a, reason: collision with root package name */
    public o f48420a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48421b;

    /* renamed from: c, reason: collision with root package name */
    public final SharesheetModalAppView f48422c;

    /* renamed from: d, reason: collision with root package name */
    public final FrameLayout f48423d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppWithBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f48420a == null) {
            this.f48420a = new o(this);
        }
        return this.f48420a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48420a == null) {
            this.f48420a = new o(this);
        }
        return this.f48420a.generatedComponent();
    }

    public /* synthetic */ SharesheetModalAppWithBadgeView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharesheetModalAppWithBadgeView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48421b) {
            this.f48421b = true;
            ((s0) generatedComponent()).getClass();
        }
        LayoutInflater.from(context).inflate(d.view_sharesheet_app_target_with_badge, (ViewGroup) this, true);
        View findViewById = findViewById(a62.c.app_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48422c = (SharesheetModalAppView) findViewById;
        View findViewById2 = findViewById(a62.c.badge_container);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f48423d = (FrameLayout) findViewById2;
    }
}
