package ml1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.framework.screens.ScreenDescription;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final com.pinterest.framework.screens.l f87546a;

    /* renamed from: b, reason: collision with root package name */
    public final d f87547b;

    /* renamed from: c, reason: collision with root package name */
    public final p f87548c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f87549d;

    /* renamed from: e, reason: collision with root package name */
    public Animator f87550e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f87551f;

    public u(il1.b screenFactory, d screenInfo, p transitionCache, boolean z13) {
        Intrinsics.checkNotNullParameter(screenFactory, "screenFactory");
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        Intrinsics.checkNotNullParameter(transitionCache, "transitionCache");
        this.f87546a = screenFactory;
        this.f87547b = screenInfo;
        this.f87548c = transitionCache;
        this.f87549d = z13;
    }

    public static final void a(u uVar, ViewGroup viewGroup, m mVar, com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2) {
        uVar.getClass();
        m d2 = uVar.d(mVar, (ScreenDescription) qVar.f33804b, (ScreenDescription) qVar2.f33804b, (r) qVar.f33803a, (r) qVar2.f33803a);
        Animator animator = uVar.f87550e;
        uVar.f87551f = animator != null ? animator.isStarted() : false;
        Animator animator2 = uVar.f87550e;
        if (animator2 != null) {
            animator2.end();
        }
        uVar.f87551f = false;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(d2.b(uVar.f87546a, viewGroup, (r) qVar.f33803a, uVar.f87547b, (ScreenDescription) qVar.f33804b, (ScreenDescription) qVar2.f33804b), d2.b(uVar.f87546a, viewGroup, (r) qVar2.f33803a, uVar.f87547b, (ScreenDescription) qVar2.f33804b, (ScreenDescription) qVar.f33804b));
        animatorSet.addListener(new s(uVar, qVar, qVar2));
        animatorSet.start();
        uVar.f87550e = animatorSet;
    }

    public static void b(com.google.firebase.messaging.q qVar, com.google.firebase.messaging.q qVar2, boolean z13) {
        Function2 function2;
        Function2 function22 = (Function2) qVar.f33806d;
        if (function22 != null) {
            function22.invoke((ScreenDescription) qVar.f33804b, Boolean.valueOf(z13));
        }
        if (qVar2 == null || (function2 = (Function2) qVar2.f33806d) == null) {
            return;
        }
        function2.invoke((ScreenDescription) qVar2.f33804b, Boolean.valueOf(z13));
    }

    public final void c(ViewGroup transitionContainer, com.google.firebase.messaging.q choreography, boolean z13) {
        Intrinsics.checkNotNullParameter(transitionContainer, "transitionContainer");
        Intrinsics.checkNotNullParameter(choreography, "choreography");
        ScreenDescription screenDescription = (ScreenDescription) choreography.f33804b;
        Unit unit = null;
        s sVar = new s(this, choreography, null);
        m d2 = d(this.f87548c.a(screenDescription.getF49206b()), screenDescription, null, (r) choreography.f33803a);
        if (!(z13 | (d2 instanceof h)) || !this.f87549d) {
            sVar.a();
            return;
        }
        View j13 = ((il1.b) this.f87546a).j(screenDescription);
        if (j13 != null) {
            d2.getClass();
            new r60.d(this, d2, transitionContainer, choreography, screenDescription, sVar, 6).invoke(j13);
            unit = Unit.f80348a;
        }
        if (unit == null) {
            sVar.a();
        }
    }

    public final m d(m mVar, ScreenDescription screenDescription, ScreenDescription screenDescription2, r... rVarArr) {
        for (r rVar : rVarArr) {
            mVar.getClass();
            com.pinterest.framework.screens.l lVar = this.f87546a;
            if (!m.a(lVar, rVar, screenDescription, screenDescription2)) {
                p pVar = this.f87548c;
                pVar.f87535a.getClass();
                b bVar = b.DEFAULT_TRANSITION;
                pVar.a(bVar.getValue());
                if (!m.a(lVar, rVar, screenDescription, screenDescription2)) {
                    return new i();
                }
                pVar.f87535a.getClass();
                return pVar.a(bVar.getValue());
            }
        }
        return mVar;
    }
}
