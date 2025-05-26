package com.pinterest.shuffles.composer.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
import com.pinterest.shuffles.composer.ui.widget.SceneViewContainer;
import com.pinterest.shuffles.scene.composer.y;
import g4.u;
import h62.n;
import h62.o;
import ke2.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l62.b;
import l62.d;
import l62.e;
import l62.f;
import org.jetbrains.annotations.NotNull;
import x72.j;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0004\b\t\n\u000bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/pinterest/shuffles/composer/ui/ComposerView;", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "org/chromium/net/y", "l62/b", "l62/c", "l62/d", "shuffles-composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ComposerView extends MaterialCardView {

    /* renamed from: p, reason: collision with root package name */
    public d f51858p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f51859q;

    /* renamed from: r, reason: collision with root package name */
    public y f51860r;

    /* renamed from: s, reason: collision with root package name */
    public final SceneViewContainer f51861s;

    /* renamed from: t, reason: collision with root package name */
    public final View f51862t;

    /* renamed from: u, reason: collision with root package name */
    public final View f51863u;

    /* renamed from: v, reason: collision with root package name */
    public final b f51864v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposerView(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51858p = new u();
        f fVar = new f(this, context);
        e eVar = new e(this);
        View.inflate(getContext(), o.composer_view_composer, this);
        View findViewById = findViewById(n.composer_view_container);
        SceneViewContainer sceneViewContainer = (SceneViewContainer) findViewById;
        sceneViewContainer.getClass();
        Intrinsics.checkNotNullParameter(fVar, "<set-?>");
        sceneViewContainer.f51894a = fVar;
        Intrinsics.checkNotNullParameter(eVar, "<set-?>");
        sceneViewContainer.f51895b = eVar;
        Intrinsics.checkNotNullExpressionValue(findViewById, "apply(...)");
        this.f51861s = sceneViewContainer;
        View findViewById2 = findViewById(n.horizontal_guideline);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(...)");
        this.f51862t = findViewById2;
        View findViewById3 = findViewById(n.vertical_guideline);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(...)");
        this.f51863u = findViewById3;
        this.f51864v = new b();
    }

    public final y Y() {
        y yVar = this.f51860r;
        if (yVar != null) {
            return yVar;
        }
        Intrinsics.r("adapter");
        throw null;
    }

    public final Integer Z() {
        SceneViewContainer sceneViewContainer = this.f51861s;
        if (sceneViewContainer == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        Drawable background = sceneViewContainer.getBackground();
        ColorDrawable colorDrawable = background instanceof ColorDrawable ? (ColorDrawable) background : null;
        if (colorDrawable != null) {
            return Integer.valueOf(colorDrawable.getColor());
        }
        return null;
    }

    public final j a0() {
        SceneViewContainer sceneViewContainer = this.f51861s;
        if (sceneViewContainer != null) {
            return sceneViewContainer.e();
        }
        Intrinsics.r("sceneViewContainer");
        throw null;
    }

    public final void d0(int i13) {
        Integer Z;
        if (this.f51859q || Z() == null || (Z = Z()) == null || Z.intValue() != i13) {
            SceneViewContainer sceneViewContainer = this.f51861s;
            if (sceneViewContainer == null) {
                Intrinsics.r("sceneViewContainer");
                throw null;
            }
            c f52892h = sceneViewContainer.e().getF52892h();
            id2.c.Companion.getClass();
            id2.c a13 = id2.b.a(i13);
            f52892h.getClass();
            Intrinsics.checkNotNullParameter(a13, "<set-?>");
            f52892h.f79315g = a13;
            return;
        }
        SceneViewContainer sceneViewContainer2 = this.f51861s;
        if (sceneViewContainer2 == null) {
            Intrinsics.r("sceneViewContainer");
            throw null;
        }
        c f52892h2 = sceneViewContainer2.e().getF52892h();
        id2.c.Companion.getClass();
        id2.c a14 = id2.b.a(0);
        f52892h2.getClass();
        Intrinsics.checkNotNullParameter(a14, "<set-?>");
        f52892h2.f79315g = a14;
    }
}
