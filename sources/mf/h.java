package mf;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class h implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f87074a;

    public h(k kVar) {
        this.f87074a = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        WeakReference weakReference;
        boolean b13 = p001if.a.b(k.class);
        i iVar = null;
        k kVar = this.f87074a;
        if (!b13) {
            try {
                weakReference = kVar.f87082b;
            } catch (Throwable th3) {
                p001if.a.a(k.class, th3);
            }
            if (weakReference.get() == null && k.a(kVar) != null && k.a(kVar).isShowing()) {
                if (k.a(kVar).isAboveAnchor()) {
                    if (!p001if.a.b(k.class)) {
                        try {
                            iVar = kVar.f87084d;
                        } catch (Throwable th4) {
                            p001if.a.a(k.class, th4);
                        }
                    }
                    ((ImageView) iVar.f87076a).setVisibility(4);
                    ((ImageView) iVar.f87077b).setVisibility(0);
                    return;
                }
                if (!p001if.a.b(k.class)) {
                    try {
                        iVar = kVar.f87084d;
                    } catch (Throwable th5) {
                        p001if.a.a(k.class, th5);
                    }
                }
                ((ImageView) iVar.f87076a).setVisibility(0);
                ((ImageView) iVar.f87077b).setVisibility(4);
                return;
            }
            return;
        }
        weakReference = null;
        if (weakReference.get() == null) {
        }
    }
}
