package pl1;

import android.view.animation.PathInterpolator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final PathInterpolator f100559a;

    /* renamed from: b, reason: collision with root package name */
    public static final PathInterpolator f100560b;

    /* renamed from: c, reason: collision with root package name */
    public static final PathInterpolator f100561c;

    static {
        Intrinsics.checkNotNullExpressionValue(new PathInterpolator(0.3f, 0.0f, 0.8f, 0.15f), "create(...)");
        Intrinsics.checkNotNullExpressionValue(new PathInterpolator(0.05f, 0.7f, 0.1f, 1.0f), "create(...)");
        PathInterpolator pathInterpolator = new PathInterpolator(0.0f, 0.35f, 0.0f, 1.25f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator, "create(...)");
        f100559a = pathInterpolator;
        PathInterpolator pathInterpolator2 = new PathInterpolator(0.8f, 0.0f, 0.2f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator2, "create(...)");
        f100560b = pathInterpolator2;
        Intrinsics.checkNotNullExpressionValue(new PathInterpolator(0.55f, 0.0f, 0.0f, 1.0f), "create(...)");
        PathInterpolator pathInterpolator3 = new PathInterpolator(0.0f, 0.0f, 1.0f, 1.0f);
        Intrinsics.checkNotNullExpressionValue(pathInterpolator3, "create(...)");
        f100561c = pathInterpolator3;
    }
}
