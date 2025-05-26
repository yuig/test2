package za;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j0;
import androidx.fragment.app.w0;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class a extends gh0.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f141448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f141449c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f141450d;

    public a(j jVar, Fragment fragment, FrameLayout frameLayout) {
        this.f141450d = jVar;
        this.f141448b = fragment;
        this.f141449c = frameLayout;
    }

    @Override // gh0.b
    public final void k0(w0 w0Var, Fragment fragment, View view) {
        if (fragment == this.f141448b) {
            tb.l lVar = w0Var.f18462n;
            synchronized (((CopyOnWriteArrayList) lVar.f116986b)) {
                try {
                    int size = ((CopyOnWriteArrayList) lVar.f116986b).size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            break;
                        }
                        if (((j0) ((CopyOnWriteArrayList) lVar.f116986b).get(i13)).f18357a == this) {
                            ((CopyOnWriteArrayList) lVar.f116986b).remove(i13);
                            break;
                        }
                        i13++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            j jVar = this.f141450d;
            FrameLayout frameLayout = this.f141449c;
            jVar.getClass();
            j.C(view, frameLayout);
        }
    }
}
