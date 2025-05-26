package androidx.core.widget;

import android.view.View;

/* loaded from: classes3.dex */
public abstract class h {
    public static void a(View view, float f13) {
        try {
            view.setFrameContentVelocity(f13);
        } catch (LinkageError unused) {
        }
    }
}
