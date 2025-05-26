package np;

import android.content.Context;
import android.hardware.Camera;
import android.media.MediaScannerConnection;
import android.net.Uri;
import com.pinterest.activity.create.CameraActivity;
import com.pinterest.api.model.d30;
import com.pinterest.api.model.wg;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import m60.f0;
import pk.a0;

/* loaded from: classes3.dex */
public final class g implements Camera.PictureCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CameraActivity f91689a;

    public g(CameraActivity cameraActivity) {
        this.f91689a = cameraActivity;
    }

    @Override // android.hardware.Camera.PictureCallback
    public final void onPictureTaken(byte[] bArr, Camera camera) {
        m60.w wVar;
        d30 d30Var;
        File g13 = fa2.c.g("IMG_", ".jpg");
        CameraActivity cameraActivity = this.f91689a;
        cameraActivity.f34913x = g13;
        if (g13 == null) {
            return;
        }
        CameraActivity.x(cameraActivity, g13);
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(cameraActivity.f34913x);
                    if (bArr != null) {
                        fileOutputStream.write(bArr);
                    }
                    fileOutputStream.close();
                    Context context = kb0.a.f79058b;
                    MediaScannerConnection.scanFile(f0.W(), new String[]{cameraActivity.f34913x.getPath()}, null, null);
                } catch (FileNotFoundException e13) {
                    e13.getMessage();
                    Context context2 = kb0.a.f79058b;
                    MediaScannerConnection.scanFile(f0.W(), new String[]{cameraActivity.f34913x.getPath()}, null, null);
                    if (a0.s0(cameraActivity.f34913x.getPath())) {
                        return;
                    }
                    if (cameraActivity.f34911v) {
                        m60.u.f85943a.d(new wg(Uri.fromFile(cameraActivity.f34913x)));
                        cameraActivity.finish();
                    }
                    wVar = m60.u.f85943a;
                    d30Var = new d30(cameraActivity.f34913x.getPath(), "");
                }
            } catch (IOException e14) {
                e14.getMessage();
                Context context3 = kb0.a.f79058b;
                MediaScannerConnection.scanFile(f0.W(), new String[]{cameraActivity.f34913x.getPath()}, null, null);
                if (a0.s0(cameraActivity.f34913x.getPath())) {
                    return;
                }
                if (cameraActivity.f34911v) {
                    m60.u.f85943a.d(new wg(Uri.fromFile(cameraActivity.f34913x)));
                    cameraActivity.finish();
                }
                wVar = m60.u.f85943a;
                d30Var = new d30(cameraActivity.f34913x.getPath(), "");
            }
            if (a0.s0(cameraActivity.f34913x.getPath())) {
                return;
            }
            if (cameraActivity.f34911v) {
                m60.u.f85943a.d(new wg(Uri.fromFile(cameraActivity.f34913x)));
                cameraActivity.finish();
            }
            wVar = m60.u.f85943a;
            d30Var = new d30(cameraActivity.f34913x.getPath(), "");
            wVar.d(d30Var);
        } catch (Throwable th3) {
            Context context4 = kb0.a.f79058b;
            MediaScannerConnection.scanFile(f0.W(), new String[]{cameraActivity.f34913x.getPath()}, null, null);
            if (!a0.s0(cameraActivity.f34913x.getPath())) {
                if (cameraActivity.f34911v) {
                    m60.u.f85943a.d(new wg(Uri.fromFile(cameraActivity.f34913x)));
                    cameraActivity.finish();
                }
                m60.u.f85943a.d(new d30(cameraActivity.f34913x.getPath(), ""));
            }
            throw th3;
        }
    }
}
