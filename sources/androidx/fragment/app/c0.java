package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* loaded from: classes.dex */
public final class c0 extends AnimationSet implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f18293a;

    /* renamed from: b, reason: collision with root package name */
    public final View f18294b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18295c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18296d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18297e;

    public c0(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.f18297e = true;
        this.f18293a = viewGroup;
        this.f18294b = view;
        addAnimation(animation);
        viewGroup.post(this);
    }

    @Override // android.view.animation.AnimationSet, android.view.animation.Animation
    public final boolean getTransformation(long j13, Transformation transformation) {
        this.f18297e = true;
        if (this.f18295c) {
            return !this.f18296d;
        }
        if (!super.getTransformation(j13, transformation)) {
            this.f18295c = true;
            q5.x.a(this.f18293a, this);
        }
        return true;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z13 = this.f18295c;
        ViewGroup viewGroup = this.f18293a;
        if (z13 || !this.f18297e) {
            viewGroup.endViewTransition(this.f18294b);
            this.f18296d = true;
        } else {
            this.f18297e = false;
            viewGroup.post(this);
        }
    }

    @Override // android.view.animation.Animation
    public final boolean getTransformation(long j13, Transformation transformation, float f13) {
        this.f18297e = true;
        if (this.f18295c) {
            return !this.f18296d;
        }
        if (!super.getTransformation(j13, transformation, f13)) {
            this.f18295c = true;
            q5.x.a(this.f18293a, this);
        }
        return true;
    }
}
