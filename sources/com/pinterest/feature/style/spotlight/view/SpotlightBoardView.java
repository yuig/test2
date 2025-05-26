package com.pinterest.feature.style.spotlight.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import bb2.j;
import bs1.c;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import eo1.a;
import i82.b;
import i82.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q0.d;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/pinterest/feature/style/spotlight/view/SpotlightBoardView;", "Lcom/pinterest/feature/style/spotlight/view/SpotlightBoardBaseView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "spotlightLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SpotlightBoardView extends SpotlightBoardBaseView {

    /* renamed from: i, reason: collision with root package name */
    public final j f48596i;

    /* renamed from: j, reason: collision with root package name */
    public final GestaltText f48597j;

    /* renamed from: k, reason: collision with root package name */
    public final GestaltText f48598k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewGroup f48599l;

    /* renamed from: m, reason: collision with root package name */
    public final GestaltText f48600m;

    /* renamed from: n, reason: collision with root package name */
    public final GestaltAvatar f48601n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: D, reason: from getter */
    public final GestaltText getF48598k() {
        return this.f48598k;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: L, reason: from getter */
    public final GestaltText getF48597j() {
        return this.f48597j;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: T, reason: from getter */
    public final GestaltAvatar getF48601n() {
        return this.f48601n;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: X, reason: from getter */
    public final ViewGroup getF48599l() {
        return this.f48599l;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: Y, reason: from getter */
    public final GestaltText getF48600m() {
        return this.f48600m;
    }

    @Override // com.pinterest.feature.style.spotlight.view.SpotlightBoardBaseView
    /* renamed from: x, reason: from getter */
    public final j getF48596i() {
        return this.f48596i;
    }

    public /* synthetic */ SpotlightBoardView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpotlightBoardView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        t(c.b0(this, b.article_spotlight_radius));
        setElevation(c.b0(this, eo1.c.space_100));
        View.inflate(context, e.view_spotlight_board_view, this);
        KeyEvent.Callback findViewById = findViewById(i82.c.spotlight_board_image);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        this.f48596i = (j) findViewById;
        View findViewById2 = findViewById(i82.c.spotlight_board_title);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        GestaltText gestaltText = (GestaltText) findViewById2;
        this.f48597j = gestaltText;
        View findViewById3 = findViewById(i82.c.spotlight_board_subtitle);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f48598k = (GestaltText) findViewById3;
        View findViewById4 = findViewById(i82.c.spotlight_board_owner_container);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f48599l = (ViewGroup) findViewById4;
        View findViewById5 = findViewById(i82.c.spotlight_board_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f48600m = (GestaltText) findViewById5;
        View findViewById6 = findViewById(i82.c.spotlight_board_avatar);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById(...)");
        this.f48601n = (GestaltAvatar) findViewById6;
        gestaltText.i(new d(context, 17));
        getF48596i().setColorFilter(dl2.b.y0(this, a.color_background_dark_opacity_300));
    }
}
