package qq0;

import android.animation.AnimatorSet;
import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final float f104871a;

    /* renamed from: b, reason: collision with root package name */
    public final float f104872b;

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f104873c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f104874d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f104875e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, float f13, oq0.a reactionModel) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(reactionModel, "reactionModel");
        this.f104871a = f13;
        this.f104873c = new AnimatorSet();
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        int i13 = reactionModel.f97213a;
        Object obj = d5.a.f53679a;
        appCompatImageView.setImageDrawable(context.getDrawable(i13));
        setClipChildren(false);
        setClipToPadding(false);
        addView(appCompatImageView, new FrameLayout.LayoutParams(-1, -1, 17));
        this.f104872b = 0.0f;
        setAlpha(0.0f);
        setTranslationY(this.f104872b);
        appCompatImageView.setTranslationY(0.0f);
    }
}
