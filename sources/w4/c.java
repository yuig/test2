package w4;

import android.view.View;

/* loaded from: classes3.dex */
public final class c extends g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f127925d;

    @Override // w4.g
    public final void d(View view, float f13) {
        switch (this.f127925d) {
            case 0:
                view.setAlpha(a(f13));
                break;
            case 1:
                view.setElevation(a(f13));
                break;
            case 2:
                view.setRotation(a(f13));
                break;
            case 3:
                view.setRotationX(a(f13));
                break;
            case 4:
                view.setRotationY(a(f13));
                break;
            case 5:
                view.setScaleX(a(f13));
                break;
            case 6:
                view.setScaleY(a(f13));
                break;
            case 7:
                view.setTranslationX(a(f13));
                break;
            case 8:
                view.setTranslationY(a(f13));
                break;
            default:
                view.setTranslationZ(a(f13));
                break;
        }
    }
}
