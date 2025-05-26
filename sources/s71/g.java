package s71;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class g extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f111357i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f111358j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ l f111359k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f111360l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(Context context, l lVar, int i13, int i14) {
        super(0);
        this.f111357i = i14;
        this.f111358j = context;
        this.f111359k = lVar;
        this.f111360l = i13;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f111357i;
        int i14 = this.f111360l;
        l lVar = this.f111359k;
        Context context = this.f111358j;
        switch (i13) {
            case 0:
                LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
                lottieAnimationView.M2(-1);
                lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(lVar.e() + (lVar.f111378g * 2), (int) (((i14 * 2) + r8 + lVar.f111388q) * 1.8d));
                layoutParams.gravity = 17;
                lottieAnimationView.setLayoutParams(layoutParams);
                lottieAnimationView.setAlpha(0.65f);
                if (lVar.f111384m) {
                    lottieAnimationView.f28364d.f28445J = com.airbnb.lottie.a.ENABLED;
                }
                return lottieAnimationView;
            case 1:
                AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
                appCompatImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(lVar.e() + (lVar.f111378g * 2), (int) (((i14 * 2) + r8 + lVar.f111388q) * 1.8d));
                layoutParams2.gravity = 17;
                appCompatImageView.setLayoutParams(layoutParams2);
                return appCompatImageView;
            default:
                View view = new View(context);
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(lVar.e(), (i14 * 2) + (lVar.f111378g * 2) + lVar.f111388q);
                layoutParams3.gravity = 17;
                view.setLayoutParams(layoutParams3);
                int i15 = vc2.b.icon_button_round;
                Object obj = d5.a.f53679a;
                view.setBackground(context.getDrawable(i15));
                return view;
        }
    }
}
