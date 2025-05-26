package com.pinterest.feature.profile.boardlesspins.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import bs1.c;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import defpackage.a;
import k31.i;
import k31.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import rg0.g0;
import y01.p1;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/profile/boardlesspins/components/UnorganizedIdeasHeader;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class UnorganizedIdeasHeader extends ConstraintLayout {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f47496c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final GestaltText f47497a;

    /* renamed from: b, reason: collision with root package name */
    public final GestaltButton f47498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnorganizedIdeasHeader(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.unorganized_ideas_header, this);
        setPaddingRelative(getPaddingStart(), c.W(this, eo1.c.space_200), getPaddingEnd(), getPaddingBottom());
        View findViewById = findViewById(nz1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47497a = (GestaltText) findViewById;
        View findViewById2 = findViewById(g0.organize_boardless_pins_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47498b = (GestaltButton) findViewById2;
    }

    public final void L(j state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f47497a.i(new p1(state, 17));
        i iVar = state.f78258b;
        p1 p1Var = new p1(iVar, 16);
        GestaltButton gestaltButton = this.f47498b;
        gestaltButton.d(p1Var);
        gestaltButton.e(new a(19, iVar.f78256b));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnorganizedIdeasHeader(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        View.inflate(getContext(), d.unorganized_ideas_header, this);
        setPaddingRelative(getPaddingStart(), c.W(this, eo1.c.space_200), getPaddingEnd(), getPaddingBottom());
        View findViewById = findViewById(nz1.c.title);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47497a = (GestaltText) findViewById;
        View findViewById2 = findViewById(g0.organize_boardless_pins_cta);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f47498b = (GestaltButton) findViewById2;
    }
}
