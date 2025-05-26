package c02;

import android.view.animation.LinearInterpolator;
import ja.c0;

/* loaded from: classes2.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f24438a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final LinearInterpolator f24439b = new LinearInterpolator();

    /* renamed from: c, reason: collision with root package name */
    public static final LinearInterpolator f24440c = new LinearInterpolator();

    /* renamed from: d, reason: collision with root package name */
    public static final LinearInterpolator f24441d = new LinearInterpolator();

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f24442e;

    static {
        tb.c cVar = new tb.c(15);
        cVar.a(n.ANIMATION_SLOT_ONE, o.ANIMATION_TYPE_REMOVE);
        n nVar = n.ANIMATION_SLOT_TWO;
        cVar.a(nVar, o.ANIMATION_TYPE_MOVE);
        cVar.a(nVar, o.ANIMATION_TYPE_CHANGE);
        cVar.a(n.ANIMATION_SLOT_THREE, o.ANIMATION_TYPE_ADD);
        f24442e = cVar.b();
    }
}
