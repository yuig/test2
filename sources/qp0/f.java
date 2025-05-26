package qp0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f104740a;

    /* renamed from: b, reason: collision with root package name */
    public float f104741b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f104742c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f104743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f104744e;

    /* renamed from: f, reason: collision with root package name */
    public final AppCompatImageView f104745f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, float f13, pp0.a reactionModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactionModel, "reactionModel");
        this.f104740a = f13;
        this.f104742c = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setImageDrawable(bs1.c.f0(appCompatImageView, reactionModel.f100907a, null, null, 6));
        this.f104745f = appCompatImageView;
        setClipChildren(false);
        setClipToPadding(false);
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        setContentDescription(getResources().getString(reactionModel.f100908b));
        addView(appCompatImageView, layoutParams);
        this.f104741b = 0.0f;
        setAlpha(0.0f);
        setTranslationY(this.f104741b);
        appCompatImageView.setTranslationY(0.0f);
    }
}
