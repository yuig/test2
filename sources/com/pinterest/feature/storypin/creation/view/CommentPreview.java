package com.pinterest.feature.storypin.creation.view;

import af2.b;
import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rl1.j0;
import so.jb;
import tq1.a;
import ye2.o;
import yk1.n;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/storypin/creation/view/CommentPreview;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lyk1/n;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ideaPinGridCellLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class CommentPreview extends ConstraintLayout implements n, c {

    /* renamed from: a, reason: collision with root package name */
    public o f48577a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f48578b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CommentPreview(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // af2.c
    public final b componentManager() {
        if (this.f48577a == null) {
            this.f48577a = new o(this);
        }
        return this.f48577a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f48577a == null) {
            this.f48577a = new o(this);
        }
        return this.f48577a.generatedComponent();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentPreview(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f48578b) {
            this.f48578b = true;
            ((jb) ((ng1.b) generatedComponent())).f113483a.j2();
        }
        getResources().getDimensionPixelSize(j0.lego_avatar_size_default);
        View.inflate(context, tq1.b.view_comment_preview, this);
        View findViewById = findViewById(a.user_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        View findViewById2 = findViewById(a.user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        View findViewById3 = findViewById(a.timestamp);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        View findViewById4 = findViewById(a.comment_text);
        GestaltText gestaltText = (GestaltText) findViewById4;
        Intrinsics.f(gestaltText);
        pp2.a.k(gestaltText, ng1.a.f90521i);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "apply(...)");
    }
}
