package v;

import a.ig;
import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123358a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f123359b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f123360c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f123361d;

    public b0(androidx.lifecycle.b0 registry, androidx.lifecycle.q event) {
        this.f123358a = 1;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(event, "event");
        this.f123360c = registry;
        this.f123361d = event;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13 = this.f123358a;
        Object obj = this.f123361d;
        switch (i13) {
            case 0:
                ((Executor) this.f123360c).execute(new ig(this, 7));
                break;
            case 1:
                if (!this.f123359b) {
                    ((androidx.lifecycle.b0) this.f123360c).e((androidx.lifecycle.q) obj);
                    this.f123359b = true;
                    break;
                }
                break;
            default:
                y5.d dVar = ((SwipeDismissBehavior) obj).f32240a;
                if (dVar != null && dVar.h()) {
                    View view = (View) this.f123360c;
                    WeakHashMap weakHashMap = q5.v0.f102521a;
                    view.postOnAnimation(this);
                    break;
                }
                break;
        }
    }

    public b0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z13) {
        this.f123358a = 2;
        this.f123361d = swipeDismissBehavior;
        this.f123360c = view;
        this.f123359b = z13;
    }

    public b0(c0 c0Var, Executor executor) {
        this.f123358a = 0;
        this.f123361d = c0Var;
        this.f123359b = false;
        this.f123360c = executor;
    }
}
