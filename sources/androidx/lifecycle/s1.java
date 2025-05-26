package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class s1 {

    /* renamed from: a, reason: collision with root package name */
    public final x92.b f18684a;

    public s1(t1 store, p1 factory, u6.c defaultCreationExtras) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.f18684a = new x92.b(store, factory, defaultCreationExtras);
    }

    public final l1 a(rl2.d modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String e13 = modelClass.e();
        if (e13 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        return this.f18684a.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass);
    }
}
