package wr0;

import android.view.animation.Animation;

/* loaded from: classes5.dex */
public final class h implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130892a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f130893b;

    public /* synthetic */ h(j jVar, int i13) {
        this.f130892a = i13;
        this.f130893b = jVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i13 = this.f130892a;
        j jVar = this.f130893b;
        switch (i13) {
            case 0:
                bs1.c.R1(jVar.l9(), true);
                break;
            default:
                bs1.c.R1(jVar.l9(), false);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        switch (this.f130892a) {
            case 0:
                bs1.c.R1(this.f130893b.l9(), true);
                break;
        }
    }
}
