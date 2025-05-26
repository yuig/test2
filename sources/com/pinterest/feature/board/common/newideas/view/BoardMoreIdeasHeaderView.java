package com.pinterest.feature.board.common.newideas.view;

import af2.c;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.pinterest.gestalt.iconcomponent.GestaltIcon;
import com.pinterest.gestalt.text.GestaltText;
import com.pinterest.ui.imageview.WebImageView;
import f70.a;
import jh0.d;
import kh2.n3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lh0.t;
import ll.j;
import mj0.b;
import org.jetbrains.annotations.NotNull;
import so.jb;
import so.s8;
import tj0.i;
import xk2.k;
import xk2.m;
import xk2.n;
import ye2.o;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/feature/board/common/newideas/view/BoardMoreIdeasHeaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lmj0/b;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "boardMoreIdeasLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BoardMoreIdeasHeaderView extends ConstraintLayout implements b, c {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ int f45125k = 0;

    /* renamed from: a, reason: collision with root package name */
    public o f45126a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45127b;

    /* renamed from: c, reason: collision with root package name */
    public final WebImageView f45128c;

    /* renamed from: d, reason: collision with root package name */
    public final GestaltText f45129d;

    /* renamed from: e, reason: collision with root package name */
    public final GestaltText f45130e;

    /* renamed from: f, reason: collision with root package name */
    public final GestaltIcon f45131f;

    /* renamed from: g, reason: collision with root package name */
    public final GestaltIcon f45132g;

    /* renamed from: h, reason: collision with root package name */
    public final k f45133h;

    /* renamed from: i, reason: collision with root package name */
    public t f45134i;

    /* renamed from: j, reason: collision with root package name */
    public j f45135j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasHeaderView(@NotNull Context context, AttributeSet attributeSet) {
        this(4, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final j L() {
        j jVar = this.f45135j;
        if (jVar != null) {
            return jVar;
        }
        Intrinsics.r("experimentHelper");
        throw null;
    }

    @Override // af2.c
    public final af2.b componentManager() {
        if (this.f45126a == null) {
            this.f45126a = new o(this);
        }
        return this.f45126a;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f45126a == null) {
            this.f45126a = new o(this);
        }
        return this.f45126a.generatedComponent();
    }

    public /* synthetic */ BoardMoreIdeasHeaderView(int i13, Context context, AttributeSet attributeSet) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BoardMoreIdeasHeaderView(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        if (!this.f45127b) {
            this.f45127b = true;
            s8 s8Var = ((jb) ((i) generatedComponent())).f113485c;
            n3.M(this, s8.e(s8Var));
            n3.L(this, new j(s8.e(s8Var)));
        }
        this.f45133h = m.a(n.NONE, new d(this, 8));
        View.inflate(context, f70.b.board_more_ideas_header, this);
        View findViewById = findViewById(a.board_cover_image);
        WebImageView webImageView = (WebImageView) findViewById;
        float dimensionPixelOffset = webImageView.getResources().getDimensionPixelOffset(eo1.c.lego_corner_radius_small);
        webImageView.g2(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f45128c = webImageView;
        View findViewById2 = findViewById(a.board_name);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f45129d = (GestaltText) findViewById2;
        View findViewById3 = findViewById(a.board_metadata);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f45130e = (GestaltText) findViewById3;
        View findViewById4 = findViewById(a.board_secret_icon);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById(...)");
        this.f45131f = (GestaltIcon) findViewById4;
        View findViewById5 = findViewById(a.secret_board_lock);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById(...)");
        this.f45132g = (GestaltIcon) findViewById5;
        setPaddingRelative(getResources().getDimensionPixelOffset(eo1.c.space_400), 0, getResources().getDimensionPixelOffset(eo1.c.space_400), getResources().getDimensionPixelOffset(eo1.c.space_300));
        setClickable(true);
        setBackgroundTintList(d5.a.b(context, ga2.a.secondary_button_background_colors));
    }
}
