package uv1;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.TransitionDrawable;
import android.widget.FrameLayout;
import com.pinterest.ui.imageview.WebImageView;
import java.util.List;
import kh2.c3;

/* loaded from: classes4.dex */
public final class c extends FrameLayout implements vv1.b {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f123185g = 0;

    /* renamed from: a, reason: collision with root package name */
    public WebImageView f123186a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123187b;

    /* renamed from: c, reason: collision with root package name */
    public tv1.a f123188c;

    /* renamed from: d, reason: collision with root package name */
    public tv1.b f123189d;

    /* renamed from: e, reason: collision with root package name */
    public List f123190e;

    /* renamed from: f, reason: collision with root package name */
    public TransitionDrawable f123191f;

    public final void a() {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "scaleX", 0.95f, 1.0f);
        ofFloat.setDuration(200L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, "scaleY", 0.95f, 1.0f);
        ofFloat2.setDuration(200L);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
        c3.i(animatorSet, new yj1.d(this, 28));
    }
}
