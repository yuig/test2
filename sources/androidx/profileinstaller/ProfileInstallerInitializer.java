package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.lifecycle.n1;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import ra.b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // ra.b
    public final Object a(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: ha.f
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j13) {
                ProfileInstallerInitializer.this.getClass();
                (Build.VERSION.SDK_INT >= 28 ? Handler.createAsync(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new g(applicationContext, 0), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new n1();
    }

    @Override // ra.b
    public final List b() {
        return Collections.emptyList();
    }
}
