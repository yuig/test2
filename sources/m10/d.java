package m10;

import android.graphics.Rect;
import android.view.View;
import dl1.s;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f85657a;

    /* renamed from: b, reason: collision with root package name */
    public final s f85658b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f85659c;

    /* renamed from: d, reason: collision with root package name */
    public final int f85660d;

    public d(View view, s sVar, Rect rect, int i13) {
        this.f85657a = new WeakReference(view);
        this.f85658b = sVar;
        this.f85659c = rect;
        this.f85660d = i13;
    }

    public final View a() {
        return (View) this.f85657a.get();
    }
}
