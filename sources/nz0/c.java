package nz0;

import android.view.View;
import kh2.b0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f92719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f92720b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f92721c;

    public c(dx0.d dVar, f fVar, int i13) {
        this.f92719a = dVar;
        this.f92720b = fVar;
        this.f92721c = i13;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i23) {
        view.removeOnLayoutChangeListener(this);
        this.f92719a.invoke(b0.Q1(this.f92720b, Integer.valueOf(this.f92721c), 0, 2));
    }
}
