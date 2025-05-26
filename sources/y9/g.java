package y9;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import com.google.firebase.messaging.a0;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import ql2.s;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final a0 f138099a;

    /* renamed from: b, reason: collision with root package name */
    public final m f138100b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138101c;

    /* renamed from: d, reason: collision with root package name */
    public final float f138102d;

    public g(Window window, a0 a0Var) {
        this.f138099a = a0Var;
        View view = window.peekDecorView();
        if (view == null) {
            throw new IllegalStateException("window.peekDecorView() is null: JankStats can only be created with a Window that has a non-null DecorView");
        }
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        View view2 = view;
        while (parent instanceof View) {
            view2 = parent;
            parent = view2.getParent();
        }
        Object tag = view2.getTag(q.metricsStateHolder);
        if (tag == null) {
            tag = new o();
            view2.setTag(q.metricsStateHolder, tag);
        }
        o oVar = (o) tag;
        if (oVar.f138118a == null) {
            oVar.f138118a = new p();
        }
        m nVar = Build.VERSION.SDK_INT >= 31 ? new n(this, view, window) : new m(this, view, window);
        this.f138100b = nVar;
        nVar.f(true);
        this.f138101c = true;
        this.f138102d = 2.0f;
    }

    public final void a(d frameData) {
        Intrinsics.checkNotNullParameter(frameData, "volatileFrameData");
        xy.j this$0 = (xy.j) this.f138099a.f33758b;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(frameData, "frameData");
        if (this$0.f136183d) {
            this$0.f136183d = false;
            this$0.f136184e = frameData.f138093b;
            this$0.f136190k = System.currentTimeMillis() * 1000;
            return;
        }
        long convert = TimeUnit.MILLISECONDS.convert(frameData.f138093b - this$0.f136184e, TimeUnit.NANOSECONDS);
        xy.h hVar = this$0.f136181b;
        int g13 = s.g(ml2.c.c(convert / hVar.f136179d) - 1, 0, hVar.f136178c);
        if (g13 >= hVar.f136177b) {
            this$0.f136186g++;
        } else if (g13 >= hVar.f136176a) {
            this$0.f136185f++;
        }
        this$0.f136187h += g13;
        this$0.f136189j++;
        this$0.f136184e = frameData.f138093b;
    }
}
