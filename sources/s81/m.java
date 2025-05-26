package s81;

import android.view.animation.Animation;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.navigation.Navigation;
import com.pinterest.screens.g3;
import m60.u;
import m81.q;
import pk.a0;
import u81.r;

/* loaded from: classes5.dex */
public final class m implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f111912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f111913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f111914c;

    public m(p pVar, long j13, String str) {
        this.f111912a = pVar;
        this.f111913b = j13;
        this.f111914c = str;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        long j13;
        p pVar = this.f111912a;
        if (pVar.isBound()) {
            ((r) ((q) pVar.getView())).y9();
        }
        pVar.f111939q.getClass();
        String str = this.f111914c;
        if (a0.N(str, "246783323270330683")) {
            str = "246783323270337418";
            j13 = 246783323270337418L;
        } else {
            j13 = this.f111913b;
        }
        int i13 = (int) ((j13 >> 36) & 1023);
        int ordinal = (i13 != 1 ? i13 != 2 ? yq.n.USER : yq.n.BOARD : yq.n.PIN).ordinal();
        if (ordinal == 1) {
            u.f85943a.d(Navigation.z0((ScreenLocation) g3.f50857b.getValue(), str));
        } else if (ordinal == 2) {
            u.f85943a.d(Navigation.z0((ScreenLocation) g3.f50856a.getValue(), str));
        } else {
            if (ordinal != 3) {
                return;
            }
            r41.k.f106176a.d(str, r41.b.PincodesUtil);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
