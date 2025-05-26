package tt0;

import android.media.MediaRecorder;
import android.media.MediaScannerConnection;
import com.pinterest.feature.ideaPinCreation.camera.view.CenterCropCameraTextureView;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119078a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kl2.m f119079b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f119080c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f119081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f119082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f119083f;

    public /* synthetic */ b(kl2.m mVar, kotlin.jvm.internal.f0 f0Var, File file, long j13, boolean z13) {
        this.f119079b = mVar;
        this.f119082e = f0Var;
        this.f119083f = file;
        this.f119080c = j13;
        this.f119081d = z13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f119083f;
        int i13 = this.f119078a;
        Object obj2 = this.f119082e;
        switch (i13) {
            case 0:
                k this$0 = (k) obj2;
                String cameraId = (String) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(cameraId, "$cameraId");
                kl2.m onStopped = this.f119079b;
                Intrinsics.checkNotNullParameter(onStopped, "$onStopped");
                kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
                MediaRecorder mediaRecorder = this$0.f119160w;
                if (mediaRecorder != null) {
                    try {
                        mediaRecorder.stop();
                    } catch (RuntimeException e13) {
                        this$0.f119138a.q(e13, "Camera stop() Failed", tb0.p.IDEA_PINS_CREATION);
                        f0Var.f80424a = true;
                    }
                    mediaRecorder.release();
                }
                this$0.f119160w = null;
                this$0.i(cameraId, false);
                File file = this$0.f119157t;
                Intrinsics.f(file);
                CenterCropCameraTextureView centerCropCameraTextureView = this$0.f119139b;
                MediaScannerConnection.scanFile(centerCropCameraTextureView.getContext(), new String[]{file.getAbsolutePath()}, null, null);
                this$0.f119157t = null;
                centerCropCameraTextureView.post(new b(onStopped, f0Var, file, this.f119080c, this.f119081d));
                break;
            default:
                kotlin.jvm.internal.f0 recordingFailed = (kotlin.jvm.internal.f0) obj2;
                File outputFile = (File) obj;
                kl2.m onStopped2 = this.f119079b;
                Intrinsics.checkNotNullParameter(onStopped2, "$onStopped");
                Intrinsics.checkNotNullParameter(recordingFailed, "$recordingFailed");
                Intrinsics.checkNotNullParameter(outputFile, "$outputFile");
                onStopped2.c(Boolean.valueOf(recordingFailed.f80424a), outputFile, Long.valueOf(this.f119080c), Boolean.valueOf(this.f119081d));
                break;
        }
    }

    public /* synthetic */ b(k kVar, String str, ba.u uVar, long j13, boolean z13) {
        this.f119082e = kVar;
        this.f119083f = str;
        this.f119079b = uVar;
        this.f119080c = j13;
        this.f119081d = z13;
    }
}
