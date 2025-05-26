package xy;

import android.view.Window;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.messaging.a0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView f136180a;

    /* renamed from: b, reason: collision with root package name */
    public final h f136181b;

    /* renamed from: c, reason: collision with root package name */
    public final i f136182c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f136183d;

    /* renamed from: e, reason: collision with root package name */
    public long f136184e;

    /* renamed from: f, reason: collision with root package name */
    public int f136185f;

    /* renamed from: g, reason: collision with root package name */
    public int f136186g;

    /* renamed from: h, reason: collision with root package name */
    public int f136187h;

    /* renamed from: i, reason: collision with root package name */
    public int f136188i;

    /* renamed from: j, reason: collision with root package name */
    public int f136189j;

    /* renamed from: k, reason: collision with root package name */
    public long f136190k;

    /* renamed from: l, reason: collision with root package name */
    public final y9.g f136191l;

    public j(Window window, RecyclerView recyclerView, i listener) {
        h config = h.f136175e;
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f136180a = recyclerView;
        this.f136181b = config;
        this.f136182c = listener;
        this.f136183d = true;
        this.f136190k = -1L;
        a0 frameListener = new a0(this, 14);
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(frameListener, "frameListener");
        y9.g gVar = new y9.g(window, frameListener);
        gVar.f138100b.f(false);
        gVar.f138101c = false;
        this.f136191l = gVar;
    }
}
