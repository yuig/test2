package z9;

import android.content.Context;
import androidx.lifecycle.t1;
import kotlin.jvm.internal.Intrinsics;
import t3.d4;

/* loaded from: classes3.dex */
public final class e0 extends p {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void D(androidx.lifecycle.z owner) {
        androidx.lifecycle.s lifecycle;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(owner, "owner");
        if (Intrinsics.d(owner, this.f141268o)) {
            return;
        }
        androidx.lifecycle.z zVar = this.f141268o;
        d4 d4Var = this.f141272s;
        if (zVar != null && (lifecycle = zVar.getLifecycle()) != null) {
            lifecycle.b(d4Var);
        }
        this.f141268o = owner;
        owner.getLifecycle().a(d4Var);
    }

    public final void E(t1 store) {
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        r rVar = this.f141269p;
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        q factory = r.f141280c;
        u6.a defaultCreationExtras = u6.a.f120754b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
        Intrinsics.checkNotNullParameter(r.class, "modelClass");
        rl2.d modelClass = lb.l0.w0(r.class);
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "<this>");
        String e13 = modelClass.e();
        if (e13 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        if (Intrinsics.d(rVar, (r) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass))) {
            return;
        }
        if (!this.f141260g.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        Intrinsics.checkNotNullParameter(store, "viewModelStore");
        u6.a defaultCreationExtras2 = u6.a.f120754b;
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultCreationExtras2, "defaultCreationExtras");
        x92.b bVar2 = new x92.b(store, factory, defaultCreationExtras2);
        Intrinsics.checkNotNullParameter(r.class, "modelClass");
        rl2.d modelClass2 = lb.l0.w0(r.class);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass2, "<this>");
        String e14 = modelClass2.e();
        if (e14 == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
        this.f141269p = (r) bVar2.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e14), modelClass2);
    }
}
