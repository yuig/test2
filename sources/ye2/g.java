package ye2;

import androidx.lifecycle.t1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes2.dex */
public final class g implements af2.b {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.activity.o f138910a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.activity.o f138911b;

    /* renamed from: c, reason: collision with root package name */
    public volatile ue2.a f138912c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f138913d = new Object();

    public g(androidx.activity.o oVar) {
        this.f138910a = oVar;
        this.f138911b = oVar;
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138912c == null) {
            synchronized (this.f138913d) {
                try {
                    if (this.f138912c == null) {
                        androidx.activity.o owner = this.f138910a;
                        c factory = new c(this.f138911b);
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        t1 store = owner.getViewModelStore();
                        Intrinsics.checkNotNullParameter(owner, "owner");
                        u6.c defaultCreationExtras = owner.getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullParameter(store, "store");
                        Intrinsics.checkNotNullParameter(factory, "factory");
                        Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
                        x92.b bVar = new x92.b(store, factory, defaultCreationExtras);
                        Intrinsics.checkNotNullParameter(e.class, "modelClass");
                        rl2.d modelClass = l0.w0(e.class);
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(modelClass, "<this>");
                        String e13 = modelClass.e();
                        if (e13 == null) {
                            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
                        }
                        this.f138912c = ((e) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass)).f138908b;
                    }
                } finally {
                }
            }
        }
        return this.f138912c;
    }
}
