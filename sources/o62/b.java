package o62;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final h f92976a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f92977b;

    /* renamed from: c, reason: collision with root package name */
    public float f92978c;

    /* renamed from: d, reason: collision with root package name */
    public float f92979d;

    /* renamed from: e, reason: collision with root package name */
    public float f92980e;

    public b(Context context, h listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f92976a = listener;
    }

    public static float a(MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        PointF pointF = new PointF(motionEvent.getX(0), motionEvent.getY(0));
        Intrinsics.checkNotNullParameter(motionEvent, "<this>");
        PointF pointF2 = new PointF(motionEvent.getX(1), motionEvent.getY(1));
        new PointF(pointF.x, pointF.y).offset(-pointF2.x, -pointF2.y);
        return (float) Math.atan2(r4.y, r4.x);
    }
}
