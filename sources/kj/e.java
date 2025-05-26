package kj;

import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.feature.search.visual.cropper.m;
import l81.l;

/* loaded from: classes3.dex */
public final class e implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f79827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f79828b;

    public /* synthetic */ e(KeyEvent.Callback callback, int i13) {
        this.f79827a = i13;
        this.f79828b = callback;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i13 = this.f79827a;
        KeyEvent.Callback callback = this.f79828b;
        switch (i13) {
            case 0:
                break;
            case 1:
                CameraActivity cameraActivity = (CameraActivity) callback;
                if (cameraActivity.f34896g.getVisibility() == 0) {
                    cameraActivity.z();
                    break;
                }
                break;
            default:
                if (motionEvent != null) {
                    if (motionEvent.getAction() != 0) {
                        if (motionEvent.getAction() != 2) {
                            if (motionEvent.getAction() == 1 || motionEvent.getActionMasked() == 1) {
                                m mVar = (m) callback;
                                ((l) mVar.f48041z).E9(motionEvent.getX(), motionEvent.getY(), mVar.D);
                                break;
                            }
                        } else {
                            m mVar2 = (m) callback;
                            if (!mVar2.D) {
                                float x13 = motionEvent.getX() - mVar2.E;
                                float y13 = motionEvent.getY() - mVar2.F;
                                if ((y13 * y13) + (x13 * x13) > mVar2.G) {
                                    mVar2.D = true;
                                    break;
                                }
                            }
                        }
                    } else {
                        m mVar3 = (m) callback;
                        mVar3.D = false;
                        mVar3.E = motionEvent.getX();
                        mVar3.F = motionEvent.getY();
                        break;
                    }
                }
                break;
        }
        return false;
    }
}
