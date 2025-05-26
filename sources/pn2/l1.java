package pn2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    public static final j1 f100816a = new j1();

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final q1 c() {
        q1 e13 = q1.e(this);
        Intrinsics.checkNotNullExpressionValue(e13, "create(...)");
        return e13;
    }

    public bm2.i d(bm2.i annotations) {
        Intrinsics.checkNotNullParameter(annotations, "annotations");
        return annotations;
    }

    public abstract g1 e(b0 b0Var);

    public boolean f() {
        return this instanceof j1;
    }

    public b0 g(b0 topLevelType, w1 position) {
        Intrinsics.checkNotNullParameter(topLevelType, "topLevelType");
        Intrinsics.checkNotNullParameter(position, "position");
        return topLevelType;
    }
}
