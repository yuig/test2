package t3;

import android.app.Activity;
import android.os.IBinder;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import com.pinterest.api.model.f30;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a4 implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f115846b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f115847c;

    public /* synthetic */ a4(int i13, View view, Object obj) {
        this.f115845a = i13;
        this.f115846b = view;
        this.f115847c = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Window window;
        WindowManager.LayoutParams attributes;
        f30 f30Var;
        u50.r rVar;
        f30 f30Var2;
        int i13 = this.f115845a;
        IBinder iBinder = null;
        Object obj = this.f115847c;
        Object obj2 = this.f115846b;
        switch (i13) {
            case 0:
                AbstractComposeView abstractComposeView = (AbstractComposeView) obj2;
                androidx.lifecycle.z r13 = b7.c.r(abstractComposeView);
                if (r13 != null) {
                    ((kotlin.jvm.internal.j0) obj).f80434a = androidx.compose.ui.platform.a.a(abstractComposeView, r13.getLifecycle());
                    abstractComposeView.removeOnAttachStateChangeListener(this);
                    return;
                } else {
                    jk.r.z("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
                    throw null;
                }
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                view.removeOnAttachStateChangeListener(this);
                Activity activity = (Activity) ((WeakReference) obj).get();
                if (activity != null && (window = activity.getWindow()) != null && (attributes = window.getAttributes()) != null) {
                    iBinder = attributes.token;
                }
                if (activity == null || iBinder == null) {
                    return;
                }
                ((hb.k) obj2).g(iBinder, activity);
                return;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ((View) obj).requestApplyInsets();
                return;
            case 3:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                pg1.c cVar = (pg1.c) obj;
                if (cVar.f100114x.a(cVar.f100116z) || (f30Var = cVar.f100112v) == null) {
                    return;
                }
                lh0.j Y = cVar.Y();
                ac2.p1 p1Var = cVar.f100103m;
                if (p1Var == null) {
                    Intrinsics.r("videoManagerUtil");
                    throw null;
                }
                kv.a aVar = cVar.f100106p;
                if (aVar == null) {
                    Intrinsics.r("adsAudioOverlayPowerscoreExperimentManager");
                    throw null;
                }
                kv.c cVar2 = cVar.f100107q;
                if (cVar2 == null) {
                    Intrinsics.r("organicAudioOverlayPowerscoreExperimentManager");
                    throw null;
                }
                if (!df.j1.Q1(cVar.X(), aVar, cVar2, f30Var, Y, p1Var, ((es.c) cVar.T()).G(cVar.f100112v)) || (rVar = cVar.f100113w) == null) {
                    return;
                }
                rVar.a(new ni1.x1(new gk1.a0(false)));
                return;
            default:
                ((View) obj2).removeOnAttachStateChangeListener(this);
                ab2.n nVar = (ab2.n) obj;
                boolean a13 = nVar.f1774h.a(nVar.f1768b);
                u50.r rVar2 = nVar.f1769c;
                if (!a13 && (f30Var2 = nVar.f1779m) != null) {
                    if (df.j1.Q1(nVar.f1778l, nVar.f1776j, nVar.f1777k, f30Var2, nVar.f1771e, nVar.f1773g, ((es.c) nVar.f1775i).G(f30Var2))) {
                        kh2.s0.b1(rVar2, false);
                    }
                }
                rVar2.a(ni1.d1.f90637a);
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f115845a) {
            case 1:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(view, "view");
                break;
        }
    }

    public a4(hb.k sidecarCompat, Activity activity) {
        this.f115845a = 1;
        Intrinsics.checkNotNullParameter(sidecarCompat, "sidecarCompat");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f115846b = sidecarCompat;
        this.f115847c = new WeakReference(activity);
    }
}
