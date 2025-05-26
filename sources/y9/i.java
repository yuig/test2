package y9;

import android.view.Choreographer;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: e, reason: collision with root package name */
    public static long f138103e = -1;

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f138104a;

    /* renamed from: b, reason: collision with root package name */
    public final o f138105b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f138106c;

    /* renamed from: d, reason: collision with root package name */
    public final d f138107d;

    public i(g jankStats, View view) {
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(jankStats, "jankStats");
        this.f138104a = new WeakReference(view);
        Intrinsics.checkNotNullExpressionValue(Choreographer.getInstance(), "getInstance()");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        Object tag = view.getTag(q.metricsStateHolder);
        if (tag == null) {
            tag = new o();
            view.setTag(q.metricsStateHolder, tag);
        }
        this.f138105b = (o) tag;
        ArrayList arrayList = new ArrayList();
        this.f138106c = arrayList;
        this.f138107d = new d(arrayList);
    }
}
