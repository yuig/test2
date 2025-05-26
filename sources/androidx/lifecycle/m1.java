package androidx.lifecycle;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m1 implements xk2.k {

    /* renamed from: a, reason: collision with root package name */
    public final rl2.d f18662a;

    /* renamed from: b, reason: collision with root package name */
    public final Function0 f18663b;

    /* renamed from: c, reason: collision with root package name */
    public final Function0 f18664c;

    /* renamed from: d, reason: collision with root package name */
    public final Function0 f18665d;

    /* renamed from: e, reason: collision with root package name */
    public l1 f18666e;

    public m1(rl2.d viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f18662a = viewModelClass;
        this.f18663b = storeProducer;
        this.f18664c = factoryProducer;
        this.f18665d = extrasProducer;
    }

    @Override // xk2.k
    public final Object getValue() {
        l1 l1Var = this.f18666e;
        if (l1Var != null) {
            return l1Var;
        }
        t1 store = (t1) this.f18663b.invoke();
        p1 factory = (p1) this.f18664c.invoke();
        u6.c defaultCreationExtras = (u6.c) this.f18665d.invoke();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "extras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
        rl2.d modelClass = this.f18662a;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String e13 = modelClass.e();
        if (e13 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        l1 F = bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass);
        this.f18666e = F;
        return F;
    }

    @Override // xk2.k
    public final boolean isInitialized() {
        return this.f18666e != null;
    }
}
