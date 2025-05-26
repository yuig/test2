package com.pinterest.feature.profile.createdtab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.button.view.GestaltButton;
import com.pinterest.gestalt.text.GestaltText;
import eo1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l11.p;
import nz1.d;
import org.jetbrains.annotations.NotNull;
import u31.b;
import uq.w;
import yk1.n;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/pinterest/feature/profile/createdtab/view/ProfileCreatedTabEmptyStateView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "profile_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class ProfileCreatedTabEmptyStateView extends w implements n {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f47511f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltButton f47512d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f47513e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCreatedTabEmptyStateView(Context context) {
        super(context, 20);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1000);
        View.inflate(getContext(), d.view_profile_created_tab_empty_state_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPadding(dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_1000), dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_600));
        this.f47513e = ((GestaltText) findViewById(nz1.c.created_tab_empty_title)).i(u31.c.f120154j);
        View findViewById = findViewById(nz1.c.created_tab_empty_state_create_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47512d = (GestaltButton) findViewById;
    }

    public final void L(b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z13 = state.f120152a;
        GestaltText gestaltText = this.f47513e;
        if (!z13) {
            gestaltText.i(u31.c.f120155k);
            return;
        }
        gestaltText.i(u31.c.f120156l);
        this.f47512d.d(u31.c.f120157m).e(new p(state, 4));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCreatedTabEmptyStateView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 20);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1000);
        View.inflate(getContext(), d.view_profile_created_tab_empty_state_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPadding(dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_1000), dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_600));
        this.f47513e = ((GestaltText) findViewById(nz1.c.created_tab_empty_title)).i(u31.c.f120154j);
        View findViewById = findViewById(nz1.c.created_tab_empty_state_create_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47512d = (GestaltButton) findViewById;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileCreatedTabEmptyStateView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13, 20, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        int dimensionPixelSize = getResources().getDimensionPixelSize(c.space_1000);
        View.inflate(getContext(), d.view_profile_created_tab_empty_state_view, this);
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
        setPadding(dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_1000), dimensionPixelSize, getResources().getDimensionPixelOffset(c.space_600));
        this.f47513e = ((GestaltText) findViewById(nz1.c.created_tab_empty_title)).i(u31.c.f120154j);
        View findViewById = findViewById(nz1.c.created_tab_empty_state_create_button);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f47512d = (GestaltButton) findViewById;
    }
}
