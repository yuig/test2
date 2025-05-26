package z9;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.j1;
import androidx.lifecycle.t1;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.s implements Function0 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f141207i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ k f141208j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(k kVar, int i13) {
        super(0);
        this.f141207i = i13;
        this.f141208j = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i13 = this.f141207i;
        k owner = this.f141208j;
        switch (i13) {
            case 0:
                Context context = owner.f141210a;
                Object applicationContext = context != null ? context.getApplicationContext() : null;
                return new j1(applicationContext instanceof Application ? (Application) applicationContext : null, owner, owner.a());
            default:
                if (!owner.f141219j) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
                }
                if (owner.f141217h.f18588d == androidx.lifecycle.r.DESTROYED) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.".toString());
                }
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(owner, "owner");
                h factory = new h();
                factory.f141197a = owner.f141218i.f86760b;
                factory.f141198b = owner.f141217h;
                factory.f141199c = null;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(factory, "factory");
                t1 store = owner.getViewModelStore();
                Intrinsics.checkNotNullParameter(owner, "owner");
                u6.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullParameter(store, "store");
                Intrinsics.checkNotNullParameter(factory, "factory");
                Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
                Intrinsics.checkNotNullParameter(i.class, "modelClass");
                rl2.d modelClass = lb.l0.w0(i.class);
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                Intrinsics.checkNotNullParameter(modelClass, "<this>");
                String e13 = modelClass.e();
                if (e13 != null) {
                    return ((i) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass)).f141205b;
                }
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
        }
    }
}
