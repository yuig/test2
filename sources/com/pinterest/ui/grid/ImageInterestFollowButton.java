package com.pinterest.ui.grid;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageButton;
import ck2.i;
import com.bumptech.glide.c;
import eo1.d;
import ha2.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;
import nk1.f;
import nk1.h;
import org.jetbrains.annotations.NotNull;
import qa2.l;
import xj2.b;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/ui/grid/ImageInterestFollowButton;", "Landroidx/appcompat/widget/AppCompatImageButton;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "newsHubLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class ImageInterestFollowButton extends AppCompatImageButton {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f52383h = 0;

    /* renamed from: d, reason: collision with root package name */
    public final b f52384d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f52385e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f52386f;

    /* renamed from: g, reason: collision with root package name */
    public f f52387g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageInterestFollowButton(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52384d = new b();
        Drawable I = c.I(getContext(), d.ic_one_tap_saved_success_nonpds);
        Intrinsics.f(I);
        this.f52385e = I;
        Drawable I2 = c.I(getContext(), d.ic_one_tap_save_lego_nonpds);
        Intrinsics.f(I2);
        this.f52386f = I2;
    }

    public final void a(f fVar) {
        b bVar = this.f52384d;
        bVar.d();
        bVar.a(fVar.h().A(wj2.c.a()).F(new e82.b(26, new j(this, 5)), new e82.b(27, l.f103300j), i.f27923c, i.f27924d));
    }

    public final void b(h hVar) {
        int i13 = qa2.j.f103277a[hVar.ordinal()];
        if (i13 == 1) {
            setImageDrawable(this.f52385e);
            setContentDescription(getResources().getString(x0.following_remove));
        } else {
            if (i13 != 2) {
                return;
            }
            setImageDrawable(this.f52386f);
            setContentDescription(getResources().getString(x0.following_add));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.f52387g;
        if (fVar != null) {
            a(fVar);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        this.f52384d.d();
        super.onDetachedFromWindow();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageInterestFollowButton(@NotNull Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52384d = new b();
        Drawable I = c.I(getContext(), d.ic_one_tap_saved_success_nonpds);
        Intrinsics.f(I);
        this.f52385e = I;
        Drawable I2 = c.I(getContext(), d.ic_one_tap_save_lego_nonpds);
        Intrinsics.f(I2);
        this.f52386f = I2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageInterestFollowButton(Context context) {
        super(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52384d = new b();
        Drawable I = c.I(getContext(), d.ic_one_tap_saved_success_nonpds);
        Intrinsics.f(I);
        this.f52385e = I;
        Drawable I2 = c.I(getContext(), d.ic_one_tap_save_lego_nonpds);
        Intrinsics.f(I2);
        this.f52386f = I2;
    }
}
