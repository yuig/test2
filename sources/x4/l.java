package x4;

import android.view.animation.Interpolator;
import com.pinterest.shuffles.scene.composer.y0;

/* loaded from: classes3.dex */
public final class l implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131774a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f131775b;

    public /* synthetic */ l(t4.e eVar, int i13) {
        this.f131774a = i13;
        this.f131775b = eVar;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f13) {
        int i13 = this.f131774a;
        Object obj = this.f131775b;
        switch (i13) {
            case 0:
                return (float) ((t4.e) obj).a(f13);
            case 1:
                return (float) ((t4.e) obj).a(f13);
            case 2:
                return (float) ((t4.e) obj).a(f13);
            default:
                float f14 = 1;
                return f14 - Math.abs(((y0) obj).getInterpolation(f13) - f14);
        }
    }

    public l() {
        this.f131774a = 3;
        this.f131775b = new y0(1.6f);
    }

    public l(t4.e eVar) {
        this.f131774a = 0;
        this.f131775b = eVar;
    }
}
