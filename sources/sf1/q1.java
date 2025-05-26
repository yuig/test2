package sf1;

import android.view.MotionEvent;
import android.view.ViewParent;
import com.pinterest.video.core.view.PinterestVideoView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q1 extends y92.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f112683a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f112684b;

    public q1(s1 s1Var, p1 p1Var) {
        this.f112683a = s1Var;
        this.f112684b = p1Var;
    }

    @Override // y92.b
    public final boolean a(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return false;
    }

    @Override // y92.b
    public final boolean b(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return true;
    }

    @Override // y92.b
    public final void c(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        s1 s1Var = this.f112683a;
        s1Var.B.l(h32.f1.LONG_PRESS);
        ViewParent parent = s1Var.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        s1Var.f112740r.C();
        this.f112684b.b(e13);
        s1Var.B.l(h32.f1.STORY_PIN_PAUSE);
    }

    @Override // y92.b
    public final void d() {
        s1 s1Var = this.f112683a;
        ViewParent parent = s1Var.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        p1 p1Var = this.f112684b;
        if (!p1Var.a()) {
            s1Var.f112740r.D();
        }
        p1Var.d();
        s1Var.B.l(h32.f1.STORY_PIN_RESUME);
    }

    @Override // y92.b
    public final void e(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        d();
    }

    @Override // y92.b
    public final void g(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
    }

    @Override // y92.b
    public final boolean h(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        s1 s1Var = this.f112683a;
        s sVar = s1Var.f112740r;
        if (sVar.O) {
            if (sVar.o() != null) {
                boolean z13 = sVar.o() != null;
                a.z0 z0Var = s1Var.B;
                if (z13) {
                    PinterestVideoView o13 = sVar.o();
                    z0Var.l((o13 == null || !o13.f52774J || o13.f18946k == null || !o13.f()) ? h32.f1.STORY_PIN_RESUME : h32.f1.STORY_PIN_PAUSE);
                    PinterestVideoView o14 = sVar.o();
                    if (o14 != null) {
                        if (o14.f()) {
                            oc2.i.a(o14);
                            oc2.i.d(o14, false);
                        } else {
                            o14.play();
                            oc2.i.d(o14, true);
                        }
                    }
                } else {
                    z0Var.l(s1Var.D ? h32.f1.STORY_PIN_RESUME : h32.f1.STORY_PIN_PAUSE);
                    s1Var.D = !s1Var.D;
                }
            }
        } else {
            s1Var.f112745w.c(e13);
        }
        return true;
    }

    @Override // y92.b
    public final boolean i(MotionEvent e13) {
        Intrinsics.checkNotNullParameter(e13, "e");
        return true;
    }
}
