package ra2;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m60.u0;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final AccelerateDecelerateInterpolator f107052b = new AccelerateDecelerateInterpolator();

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f107053a;

    public final void a(List list, Resources resources) {
        this.f107053a = new ArrayList();
        int i13 = u0.anim_speed_fastest;
        if (hf0.b.q() && hf0.b.o()) {
            i13 = u0.anim_speed_fast;
        }
        int integer = resources.getInteger(i13);
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            view.setVisibility(4);
            view.setTranslationY(hf0.b.f69003c);
            view.setAlpha(0.0f);
            view.setVisibility(0);
            ViewPropertyAnimator duration = view.animate().translationY(0.0f).alpha(1.0f).setInterpolator(f107052b).setDuration(integer);
            this.f107053a.add(duration);
            duration.start();
        }
    }
}
