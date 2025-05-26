package gq;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.pinterest.activity.newshub.view.header.NewsHubSectionHeader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65966a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f65967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f65968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f65969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f65970e;

    public d(View view, float f13, int i13, NewsHubSectionHeader newsHubSectionHeader) {
        this.f65967b = view;
        this.f65968c = f13;
        this.f65969d = i13;
        this.f65970e = newsHubSectionHeader;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f65966a) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                View view = this.f65967b;
                view.setAlpha(0.0f);
                view.setTranslationY(this.f65968c);
                float f13 = ((NewsHubSectionHeader) this.f65970e).f34977c;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f65966a;
        View view = this.f65967b;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(animator, "animator");
                view.setVisibility(4);
                animator.removeAllListeners();
                break;
            default:
                Intrinsics.checkNotNullParameter(animator, "animation");
                view.setAlpha(this.f65968c);
                ((Function1) this.f65970e).invoke(Integer.valueOf(this.f65969d));
                break;
        }
    }

    public d(View view, float f13, Function1 function1, int i13) {
        this.f65967b = view;
        this.f65968c = f13;
        this.f65970e = function1;
        this.f65969d = i13;
    }
}
