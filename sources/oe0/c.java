package oe0;

import android.R;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.design.brio.widget.progress.FullBleedGestaltSpinner;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public l f94213a;

    /* renamed from: b, reason: collision with root package name */
    public l f94214b;

    /* renamed from: c, reason: collision with root package name */
    public dp1.c f94215c;

    /* renamed from: d, reason: collision with root package name */
    public FullBleedGestaltSpinner f94216d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94217e;

    public static ViewGroup b(View view) {
        View rootView = view.getRootView();
        if (rootView != null) {
            View findViewById = rootView.findViewById(R.id.content);
            if (findViewById instanceof ViewGroup) {
                return (ViewGroup) findViewById;
            }
            HashSet hashSet = tb0.h.f117076w;
            tb0.g.f117075a.p(new RuntimeException() { // from class: com.pinterest.design.brio.manager.PinterestUiManager$ContainerNotFoundException
            });
        }
        return null;
    }

    public final void a() {
        l lVar = this.f94213a;
        if (lVar != null && lVar.f()) {
            this.f94213a.d();
        }
        l lVar2 = this.f94214b;
        if (lVar2 == null || !lVar2.f()) {
            return;
        }
        this.f94214b.d();
    }

    public final boolean c() {
        l lVar;
        l lVar2 = this.f94213a;
        return (lVar2 != null && lVar2.f()) || ((lVar = this.f94214b) != null && lVar.f());
    }
}
