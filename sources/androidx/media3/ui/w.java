package androidx.media3.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes3.dex */
public final class w extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerControlView f19114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f19115c;

    public /* synthetic */ w(x xVar, PlayerControlView playerControlView, int i13) {
        this.f19113a = i13;
        this.f19115c = xVar;
        this.f19114b = playerControlView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i13 = this.f19113a;
        PlayerControlView playerControlView = this.f19114b;
        x xVar = this.f19115c;
        switch (i13) {
            case 0:
                xVar.i(1);
                if (xVar.B) {
                    playerControlView.post(xVar.f19134s);
                    xVar.B = false;
                    break;
                }
                break;
            case 1:
                xVar.i(2);
                if (xVar.B) {
                    playerControlView.post(xVar.f19134s);
                    xVar.B = false;
                    break;
                }
                break;
            default:
                xVar.i(2);
                if (xVar.B) {
                    playerControlView.post(xVar.f19134s);
                    xVar.B = false;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i13 = this.f19113a;
        x xVar = this.f19115c;
        switch (i13) {
            case 0:
                xVar.i(3);
                break;
            case 1:
                xVar.i(3);
                break;
            default:
                xVar.i(3);
                break;
        }
    }
}
