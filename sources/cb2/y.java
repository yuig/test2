package cb2;

import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.screens.x0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27404a = {1, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27405b = {1, 2, 0};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f27406c = {2, 1, 3, 0};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f27407d = {2, 3, 4, 1, 0};

    public static final boolean a(nl1.d dVar) {
        Class<?> cls = dVar != null ? dVar.getClass() : null;
        return Intrinsics.d(cls, ((ScreenLocation) x0.f51545g.getValue()).getF48114a()) || Intrinsics.d(cls, ((ScreenLocation) x0.f51546h.getValue()).getF48114a());
    }
}
