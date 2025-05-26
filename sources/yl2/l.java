package yl2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public final ym2.c f139376a;

    /* renamed from: b, reason: collision with root package name */
    public final String f139377b;

    public l(ym2.c packageFqName, String classNamePrefix) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f139376a = packageFqName;
        this.f139377b = classNamePrefix;
    }

    public final ym2.g a(int i13) {
        ym2.g e13 = ym2.g.e(this.f139377b + i13);
        Intrinsics.checkNotNullExpressionValue(e13, "identifier(...)");
        return e13;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f139376a);
        sb3.append('.');
        return ep.b.k(sb3, this.f139377b, 'N');
    }
}
