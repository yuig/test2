package g6;

import android.view.View;

/* loaded from: classes3.dex */
public final class e extends g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63657a;

    public e(int i13) {
        this.f63657a = i13;
    }

    @Override // kh2.c3
    public final /* bridge */ /* synthetic */ float N(Object obj) {
        switch (this.f63657a) {
            case 2:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return y0((View) obj);
    }

    @Override // kh2.c3
    public final /* bridge */ /* synthetic */ void o0(float f13, Object obj) {
        switch (this.f63657a) {
            case 2:
                z0((View) obj, f13);
                break;
            case 8:
                z0((View) obj, f13);
                break;
            case 9:
                z0((View) obj, f13);
                break;
            case 10:
                z0((View) obj, f13);
                break;
            case 11:
                z0((View) obj, f13);
                break;
            default:
                z0((View) obj, f13);
                break;
        }
    }

    public final float y0(View view) {
        switch (this.f63657a) {
            case 2:
                return view.getAlpha();
            case 8:
                return view.getScaleX();
            case 9:
                return view.getScaleY();
            case 10:
                return view.getRotation();
            case 11:
                return view.getRotationX();
            default:
                return view.getRotationY();
        }
    }

    public final void z0(View view, float f13) {
        switch (this.f63657a) {
            case 2:
                view.setAlpha(f13);
                break;
            case 8:
                view.setScaleX(f13);
                break;
            case 9:
                view.setScaleY(f13);
                break;
            case 10:
                view.setRotation(f13);
                break;
            case 11:
                view.setRotationX(f13);
                break;
            default:
                view.setRotationY(f13);
                break;
        }
    }
}
