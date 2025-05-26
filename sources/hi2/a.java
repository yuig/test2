package hi2;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kh2.e3;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a implements ViewTreeObserver.OnDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f69237a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f69238b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f69239c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f69240d;

    public a(View view, d onDrawCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onDrawCallback, "onDrawCallback");
        this.f69237a = view;
        this.f69238b = onDrawCallback;
        this.f69239c = new Handler(Looper.getMainLooper());
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f69240d) {
            return;
        }
        this.f69240d = true;
        this.f69238b.invoke();
        this.f69239c.post(new e3(this, 3));
    }
}
