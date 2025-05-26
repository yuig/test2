package xj;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class i extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135107a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f135108b;

    public /* synthetic */ i(j jVar, int i13) {
        this.f135107a = i13;
        this.f135108b = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f135107a) {
            case 1:
                super.onAnimationEnd(animator);
                j jVar = this.f135108b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = jVar.f135115f;
                if (arrayList != null && !jVar.f135116g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((va.c) it.next()).a(jVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f135107a) {
            case 0:
                super.onAnimationStart(animator);
                j jVar = this.f135108b;
                ArrayList arrayList = jVar.f135115f;
                if (arrayList != null && !jVar.f135116g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((va.c) it.next()).b(jVar);
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
