package sw0;

import android.widget.ImageView;
import com.pinterest.api.model.pu;
import com.pinterest.api.model.yb;
import com.pinterest.feature.mediagallery.view.MediaButtonView;
import kotlin.jvm.internal.Intrinsics;
import m60.x0;

/* loaded from: classes5.dex */
public final class c extends vq0.h {

    /* renamed from: a, reason: collision with root package name */
    public final pw0.o f115419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115420b;

    public c(pw0.o listener, int i13) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f115419a = listener;
        this.f115420b = i13;
    }

    @Override // vq0.h
    public final void c(yk1.n nVar, Object obj, int i13) {
        pw0.p view = (pw0.p) nVar;
        pu model = (pu) obj;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(model, "model");
        MediaButtonView mediaButtonView = (MediaButtonView) view;
        ((ImageView) mediaButtonView.f46732d.getValue()).setImageResource(this.f115420b);
        pw0.o listener = this.f115419a;
        Intrinsics.checkNotNullParameter(listener, "listener");
        mediaButtonView.f46733e = listener;
        mediaButtonView.setOnClickListener(new androidx.media3.ui.k(mediaButtonView, i13, 3));
        mediaButtonView.setContentDescription(model instanceof yb ? mediaButtonView.getResources().getString(x0.accessibility_create_from_camera_content_description) : null);
    }

    @Override // vq0.h
    public final String g(int i13, Object obj) {
        pu model = (pu) obj;
        Intrinsics.checkNotNullParameter(model, "model");
        return null;
    }
}
