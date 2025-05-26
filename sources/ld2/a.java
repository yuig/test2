package ld2;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.Intrinsics;
import pd2.k;
import pd2.t;
import qd2.a0;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final k f82993a = jq.b.n(1.0f, null, 0.5f, 4.0f);

    /* renamed from: b, reason: collision with root package name */
    public static final t f82994b = new t(new PointF(0.0f, 0.0f), null).c(new PointF(), 1.0f);

    /* renamed from: c, reason: collision with root package name */
    public static final t f82995c;

    static {
        PointF pointF = new PointF(0.5f, 0.5f);
        new t(pointF, null);
        RectF rect = new RectF(0.0f, 0.0f, 1.0f, 1.0f);
        Intrinsics.checkNotNullParameter(rect, "rect");
        f82995c = new t(pointF, new a0(rect));
    }
}
