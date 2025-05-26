package w62;

import android.content.Context;
import android.graphics.PointF;
import android.view.ViewConfiguration;
import kotlin.jvm.internal.Intrinsics;
import x62.i;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final i f128129a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f128130b;

    /* renamed from: c, reason: collision with root package name */
    public PointF f128131c;

    /* renamed from: d, reason: collision with root package name */
    public PointF f128132d;

    /* renamed from: e, reason: collision with root package name */
    public int f128133e;

    /* renamed from: f, reason: collision with root package name */
    public final int f128134f;

    public a(Context context, i listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f128129a = listener;
        new PointF();
        this.f128131c = new PointF();
        this.f128132d = new PointF();
        this.f128133e = -1;
        int scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f128134f = scaledTouchSlop * scaledTouchSlop;
    }
}
