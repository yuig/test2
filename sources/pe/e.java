package pe;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f99901a;

    /* renamed from: b, reason: collision with root package name */
    public final String f99902b;

    public e(View view, String viewMapKey) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(viewMapKey, "viewMapKey");
        this.f99901a = new WeakReference(view);
        this.f99902b = viewMapKey;
    }

    public final View a() {
        WeakReference weakReference = this.f99901a;
        if (weakReference == null) {
            return null;
        }
        return (View) weakReference.get();
    }
}
