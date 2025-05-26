package com.pinterest.feature.profile.boardsoftdeletion;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/boardsoftdeletion/SoftDeletionModule;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SoftDeletionModule extends ConstraintLayout implements n {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f47501d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47502a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltText f47503b;

    /* renamed from: c, reason: collision with root package name */
    public final GestaltButton f47504c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftDeletionModule(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.soft_deletion_module, this);
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(c.space_600), getPaddingEnd(), getPaddingBottom());
        View findViewById = findViewById(nz1.c.soft_deletion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47502a = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz1.c.soft_deletion_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47503b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_boards_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47504c = (GestaltButton) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftDeletionModule(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.soft_deletion_module, this);
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(c.space_600), getPaddingEnd(), getPaddingBottom());
        View findViewById = findViewById(nz1.c.soft_deletion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47502a = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz1.c.soft_deletion_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47503b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_boards_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47504c = (GestaltButton) findViewById3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SoftDeletionModule(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.soft_deletion_module, this);
        setPaddingRelative(getPaddingStart(), getResources().getDimensionPixelSize(c.space_600), getPaddingEnd(), getPaddingBottom());
        View findViewById = findViewById(nz1.c.soft_deletion_title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47502a = (GestaltText) findViewById;
        View findViewById2 = findViewById(nz1.c.soft_deletion_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47503b = (GestaltText) findViewById2;
        View findViewById3 = findViewById(nz1.c.soft_deletion_boards_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f47504c = (GestaltButton) findViewById3;
    }
}
