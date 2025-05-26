package fa2;

import android.app.Activity;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageButton;
import androidx.appcompat.widget.q;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.ui.camera.CameraPreview;
import java.io.File;
import m60.u;
import n.e;
import pk.a0;
import sh.f;

/* loaded from: classes4.dex */
public final class b extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final int f61588a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f61589b;

    /* renamed from: c, reason: collision with root package name */
    public final CameraPreview f61590c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f61591d;

    /* renamed from: e, reason: collision with root package name */
    public final a f61592e;

    public b(Activity activity, int i13, CameraPreview cameraPreview, q qVar) {
        if (activity != null && activity.getWindowManager() != null && activity.getWindowManager().getDefaultDisplay() != null) {
            c.f61597e = activity.getWindowManager().getDefaultDisplay().getRotation();
        }
        this.f61588a = i13;
        this.f61590c = cameraPreview;
        this.f61592e = qVar;
        this.f61589b = false;
    }

    public final boolean a() {
        return this.f61589b;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        CameraPreview cameraPreview = this.f61590c;
        try {
            cameraPreview.f52243c = false;
            Camera camera = c.f61593a;
            if (camera != null) {
                camera.stopPreview();
                c.f61593a.release();
            }
        } catch (Exception unused) {
            Log.v("CameraManager", "Tried to stop a non-existent preview");
        }
        c.f61593a = null;
        cameraPreview.f52242b = null;
        try {
            if (!isCancelled()) {
                Camera open = Camera.open(this.f61588a);
                c.f61593a = open;
                open.setDisplayOrientation(90);
                Camera camera2 = c.f61593a;
                cameraPreview.f52242b = camera2;
                if (camera2 != null) {
                    cameraPreview.f();
                }
            }
        } catch (Exception unused2) {
            if (bs1.c.c1(cameraPreview.getContext())) {
                u.f85943a.d(new g4.u());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onCancelled() {
        super.onCancelled();
        this.f61589b = false;
        c.f61600h = false;
        c.d(this.f61590c);
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        a aVar = this.f61592e;
        CameraPreview cameraPreview = this.f61590c;
        try {
            if (c.f61593a != null) {
                c.f61601i = false;
                c.f61600h = true;
                c.n();
                c.f61593a.setPreviewDisplay(cameraPreview.getHolder());
                Camera camera = c.f61593a;
                cameraPreview.f52242b = camera;
                if (camera != null) {
                    cameraPreview.f();
                }
                c.f61594b = c.f61593a.getParameters();
                cameraPreview.setClickable(this.f61591d);
                if (aVar != null) {
                    ((q) aVar).C();
                }
                c.k(this.f61588a, c.f61593a);
                cameraPreview.e();
            }
        } catch (Exception e13) {
            e13.printStackTrace();
        }
        if (aVar != null) {
            q qVar = (q) aVar;
            switch (qVar.f16668a) {
                case 0:
                    CameraActivity cameraActivity = (CameraActivity) qVar.f16669b;
                    cameraActivity.f34897h.setVisibility(8);
                    cameraActivity.f34896g.setVisibility(0);
                    cameraActivity.f34900k.getViewTreeObserver().addOnGlobalLayoutListener(new e(qVar, 4));
                    String d2 = cameraActivity.f34915z.d("PREF_CAMERA_PHOTO_STATE_PATH", "");
                    if (!a0.s0(d2)) {
                        File file = new File(d2);
                        cameraActivity.f34913x = file;
                        CameraActivity.x(cameraActivity, file);
                        break;
                    } else {
                        cameraActivity.f34892c.setImageBitmap(null);
                        break;
                    }
            }
        }
        this.f61589b = false;
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        this.f61589b = true;
        c.f61601i = true;
        a aVar = this.f61592e;
        if (aVar != null) {
            q qVar = (q) aVar;
            switch (qVar.f16668a) {
                case 0:
                    CameraActivity cameraActivity = (CameraActivity) qVar.f16669b;
                    cameraActivity.f34901l.setClickable(false);
                    cameraActivity.f34900k.setClickable(false);
                    cameraActivity.f34903n.setClickable(false);
                    cameraActivity.f34895f.setClickable(false);
                    ImageButton imageButton = cameraActivity.f34903n;
                    imageButton.setImageDrawable(f.c(imageButton.getContext(), f80.a.ic_flash_off_nonpds, eo1.a.color_white_mochimalist_0_opacity_80));
                    ImageButton imageButton2 = cameraActivity.f34901l;
                    imageButton2.setImageDrawable(f.b(eo1.a.color_white_mochimalist_0_opacity_80, imageButton2.getContext(), cameraActivity.f34901l.getDrawable()));
                    ImageButton imageButton3 = cameraActivity.f34902m;
                    imageButton3.setImageDrawable(f.b(eo1.a.color_white_mochimalist_0_opacity_80, imageButton3.getContext(), cameraActivity.f34902m.getDrawable()));
                    break;
            }
        }
        CameraPreview cameraPreview = this.f61590c;
        this.f61591d = cameraPreview.isClickable();
        cameraPreview.setClickable(false);
    }
}
