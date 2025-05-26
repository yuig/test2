package w4;

import android.view.View;

/* loaded from: classes3.dex */
public final class h extends l {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f127931f;

    @Override // w4.l
    public final void c(View view, float f13) {
        switch (this.f127931f) {
            case 0:
                view.setAlpha(a(f13));
                break;
            case 1:
                view.setElevation(a(f13));
                break;
            case 2:
                view.setPivotX(a(f13));
                break;
            case 3:
                view.setPivotY(a(f13));
                break;
            case 4:
                view.setRotation(a(f13));
                break;
            case 5:
                view.setRotationX(a(f13));
                break;
            case 6:
                view.setRotationY(a(f13));
                break;
            case 7:
                view.setScaleX(a(f13));
                break;
            case 8:
                view.setScaleY(a(f13));
                break;
            case 9:
                view.setTranslationX(a(f13));
                break;
            case 10:
                view.setTranslationY(a(f13));
                break;
            default:
                view.setTranslationZ(a(f13));
                break;
        }
    }
}
