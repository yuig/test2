package pe;

import android.view.View;
import java.lang.ref.WeakReference;
import kg.n;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final qe.c f99882a;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference f99883b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f99884c;

    /* renamed from: d, reason: collision with root package name */
    public final View.OnClickListener f99885d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99886e;

    public a(qe.c mapping, View rootView, View hostView) {
        Intrinsics.checkNotNullParameter(mapping, "mapping");
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(hostView, "hostView");
        this.f99882a = mapping;
        this.f99883b = new WeakReference(hostView);
        this.f99884c = new WeakReference(rootView);
        this.f99885d = qe.h.e(hostView);
        this.f99886e = true;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        n.a(view);
        if (p001if.a.b(this)) {
            return;
        }
        try {
            if (p001if.a.b(this)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(view, "view");
                View.OnClickListener onClickListener = this.f99885d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
                View view2 = (View) this.f99884c.get();
                View view3 = (View) this.f99883b.get();
                if (view2 == null || view3 == null) {
                    return;
                }
                c.a(this.f99882a, view2, view3);
            } catch (Throwable th3) {
                p001if.a.a(this, th3);
            }
        } catch (Throwable th4) {
            p001if.a.a(this, th4);
        }
    }
}
