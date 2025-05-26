package y6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Binder;
import android.os.Process;
import android.util.Base64;
import android.view.View;
import androidx.core.os.OperationCanceledException;
import com.bugsnag.android.NativeInterface;
import com.google.android.gms.internal.measurement.t6;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import oi.k4;

/* loaded from: classes3.dex */
public final class d implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f137906a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f137907b;

    public /* synthetic */ d(Object obj, int i13) {
        this.f137906a = i13;
        this.f137907b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z13 = true;
        switch (this.f137906a) {
            case 0:
                ((a) this.f137907b).f137895d.set(true);
                try {
                    Process.setThreadPriority(10);
                    a aVar = (a) this.f137907b;
                    aVar.getClass();
                    try {
                        aVar.f137896e.d();
                    } catch (OperationCanceledException e13) {
                        if (!aVar.f137894c.get()) {
                            throw e13;
                        }
                    }
                    Binder.flushPendingCommands();
                    return null;
                } catch (Throwable th3) {
                    try {
                        ((a) this.f137907b).f137894c.set(true);
                        throw th3;
                    } finally {
                        ((a) this.f137907b).a(null);
                    }
                }
            case 1:
                File nativeReportPath = NativeInterface.getNativeReportPath();
                if (!nativeReportPath.exists() && !nativeReportPath.mkdirs()) {
                    z13 = false;
                }
                return Boolean.valueOf(z13);
            case 2:
                View view = (View) ((WeakReference) this.f137907b).get();
                if (view == null || view.getWidth() == 0 || view.getHeight() == 0) {
                    return "";
                }
                Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 10, byteArrayOutputStream);
                String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
                Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(outputStream.toByteArray(), Base64.NO_WRAP)");
                return encodeToString;
            default:
                return new t6(((k4) this.f137907b).f94902k);
        }
    }

    public d(View rootView) {
        this.f137906a = 2;
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        this.f137907b = new WeakReference(rootView);
    }
}
