package df;

import android.graphics.Bitmap;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.widget.ImageView;
import com.facebook.login.widget.ProfilePictureView;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.io.Serializable;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class l0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f54792a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f54793b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f54794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Serializable f54795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f54796e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f54797f;

    public /* synthetic */ l0(p0 p0Var, Exception exc, boolean z13, Bitmap bitmap, bb.p pVar) {
        this.f54794c = p0Var;
        this.f54795d = exc;
        this.f54793b = z13;
        this.f54796e = bitmap;
        this.f54797f = pVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i13;
        int i14 = this.f54792a;
        Object obj = this.f54797f;
        Object obj2 = this.f54796e;
        Serializable serializable = this.f54795d;
        Object obj3 = this.f54794c;
        switch (i14) {
            case 0:
                p0 request = (p0) obj3;
                Exception exc = (Exception) serializable;
                Bitmap bitmap = (Bitmap) obj2;
                Intrinsics.checkNotNullParameter(request, "$request");
                Intrinsics.checkNotNullParameter(request, "request");
                ProfilePictureView profilePictureView = (ProfilePictureView) ((bb.p) obj).f22464b;
                int i15 = ProfilePictureView.f30066h;
                profilePictureView.getClass();
                if (!p001if.a.b(profilePictureView)) {
                    try {
                        if (request == profilePictureView.f30073g) {
                            profilePictureView.f30073g = null;
                            if (exc == null) {
                                if (bitmap != null) {
                                    if (!p001if.a.b(profilePictureView)) {
                                        try {
                                            ImageView imageView = profilePictureView.f30071e;
                                            if (imageView != null) {
                                                imageView.setImageBitmap(bitmap);
                                            }
                                        } catch (Throwable th3) {
                                            p001if.a.a(profilePictureView, th3);
                                        }
                                    }
                                    if (this.f54793b) {
                                        profilePictureView.e(false);
                                        break;
                                    }
                                }
                            } else {
                                le.g0 g0Var = le.g0.REQUESTS;
                                String obj4 = exc.toString();
                                wc.b bVar = u0.f54860d;
                                wc.b.z(g0Var, "ProfilePictureView", obj4);
                                break;
                            }
                        }
                    } catch (Throwable th4) {
                        p001if.a.a(profilePictureView, th4);
                        return;
                    }
                }
                break;
            default:
                tt0.k this$0 = (tt0.k) obj3;
                String cameraId = (String) serializable;
                Function1 onStarted = (Function1) obj2;
                boolean z13 = this.f54793b;
                Function1 function1 = (Function1) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(cameraId, "$cameraId");
                Intrinsics.checkNotNullParameter(onStarted, "$onStarted");
                try {
                    if (!this$0.i(cameraId, true)) {
                        this$0.f119163z = false;
                        break;
                    } else {
                        MediaRecorder mediaRecorder = this$0.f119160w;
                        if (mediaRecorder != null) {
                            CameraCharacteristics c13 = this$0.c(cameraId);
                            Integer num = c13 != null ? (Integer) c13.get(CameraCharacteristics.LENS_FACING) : null;
                            if (num != null && num.intValue() == 0) {
                                i13 = RecyclerViewTypes.VIEW_TYPE_SHOPPING_FILTER_EMPTY_STATE_EOF;
                                mediaRecorder.setOrientationHint(i13);
                                mediaRecorder.prepare();
                                mediaRecorder.start();
                            }
                            i13 = 90;
                            mediaRecorder.setOrientationHint(i13);
                            mediaRecorder.prepare();
                            mediaRecorder.start();
                        }
                        this$0.f119162y = Long.valueOf(SystemClock.uptimeMillis());
                        this$0.f119139b.post(new g0.k(onStarted, z13, this$0, function1, 1));
                        break;
                    }
                } catch (CameraAccessException e13) {
                    this$0.f119163z = false;
                    this$0.f119138a.q(e13, "Camera Access Exception when attempting to start recording", tb0.p.IDEA_PINS_CREATION);
                }
                break;
        }
    }

    public /* synthetic */ l0(tt0.k kVar, String str, tt0.e0 e0Var, boolean z13, tt0.e0 e0Var2) {
        this.f54794c = kVar;
        this.f54795d = str;
        this.f54796e = e0Var;
        this.f54793b = z13;
        this.f54797f = e0Var2;
    }
}
