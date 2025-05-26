package w4;

import android.view.View;

/* loaded from: classes3.dex */
public final class m extends q {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f127940g;

    @Override // w4.q
    public final boolean c(float f13, long j13, View view, t4.f fVar) {
        switch (this.f127940g) {
            case 0:
                view.setAlpha(b(f13, j13, view, fVar));
                break;
            case 1:
                view.setElevation(b(f13, j13, view, fVar));
                break;
            case 2:
                view.setRotation(b(f13, j13, view, fVar));
                break;
            case 3:
                view.setRotationX(b(f13, j13, view, fVar));
                break;
            case 4:
                view.setRotationY(b(f13, j13, view, fVar));
                break;
            case 5:
                view.setScaleX(b(f13, j13, view, fVar));
                break;
            case 6:
                view.setScaleY(b(f13, j13, view, fVar));
                break;
            case 7:
                view.setTranslationX(b(f13, j13, view, fVar));
                break;
            case 8:
                view.setTranslationY(b(f13, j13, view, fVar));
                break;
            default:
                view.setTranslationZ(b(f13, j13, view, fVar));
                break;
        }
        return this.f116403d;
    }
}
