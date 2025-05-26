package b3;

import android.os.Build;
import android.view.ViewGroup;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class g implements c0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f21314d = true;

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f21315a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f21316b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public f3.a f21317c;

    public g(ViewGroup viewGroup) {
        this.f21315a = viewGroup;
    }

    @Override // b3.c0
    public final e3.d a() {
        e3.f jVar;
        e3.d dVar;
        synchronized (this.f21316b) {
            try {
                ViewGroup viewGroup = this.f21315a;
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 29) {
                    f.a(viewGroup);
                }
                if (i13 >= 29) {
                    jVar = new e3.h();
                } else if (f21314d) {
                    try {
                        jVar = new e3.g(this.f21315a, new h1.b(2), new d3.c());
                    } catch (Throwable unused) {
                        f21314d = false;
                        jVar = new e3.j(c(this.f21315a));
                    }
                } else {
                    jVar = new e3.j(c(this.f21315a));
                }
                dVar = new e3.d(jVar);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return dVar;
    }

    @Override // b3.c0
    public final void b(e3.d dVar) {
        synchronized (this.f21316b) {
            if (!dVar.f57021r) {
                dVar.f57021r = true;
                dVar.b();
            }
            Unit unit = Unit.f80348a;
        }
    }

    public final f3.a c(ViewGroup viewGroup) {
        f3.a aVar = this.f21317c;
        if (aVar != null) {
            return aVar;
        }
        f3.a aVar2 = new f3.a(viewGroup.getContext());
        aVar2.setClipChildren(false);
        aVar2.setClipToPadding(false);
        aVar2.setTag(q0.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
        viewGroup.addView(aVar2);
        this.f21317c = aVar2;
        return aVar2;
    }
}
