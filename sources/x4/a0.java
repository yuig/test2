package x4;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes3.dex */
public final class a0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f131657a;

    public a0() {
        this.f131657a = 0;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.f131657a) {
            case 0:
                break;
            case 1:
                break;
            default:
                Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
                if (valueOf != null && valueOf.intValue() == 0) {
                    break;
                }
                break;
        }
        return true;
    }
}
