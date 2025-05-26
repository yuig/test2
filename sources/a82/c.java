package a82;

import android.graphics.PointF;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final e f1530a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f1531b;

    /* renamed from: c, reason: collision with root package name */
    public int f1532c;

    public c(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f1530a = listener;
        this.f1531b = new PointF();
        this.f1532c = -1;
    }
}
