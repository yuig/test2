package ye2;

import android.app.Activity;
import android.app.Application;
import androidx.lifecycle.t1;
import df.j1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import ps0.y;
import so.s8;
import so.u8;

/* loaded from: classes2.dex */
public final class b implements af2.b {

    /* renamed from: a, reason: collision with root package name */
    public volatile s8 f138903a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f138904b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Activity f138905c;

    /* renamed from: d, reason: collision with root package name */
    public final g f138906d;

    public b(Activity activity) {
        this.f138905c = activity;
        this.f138906d = new g((androidx.activity.o) activity);
    }

    public final s8 a() {
        String str;
        Activity activity = this.f138905c;
        if (activity.getApplication() instanceof af2.b) {
            u8 u8Var = (u8) ((a) j1.b0(a.class, this.f138906d));
            return new s8(u8Var.f114651a, u8Var.f114652b, new ps0.m(2), new y(18), activity);
        }
        StringBuilder sb3 = new StringBuilder("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(activity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + activity.getApplication().getClass();
        }
        sb3.append(str);
        throw new IllegalStateException(sb3.toString());
    }

    public final j b() {
        g gVar = this.f138906d;
        androidx.activity.o owner = gVar.f138910a;
        c factory = new c(gVar.f138911b);
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
        if (e13 != null) {
            return ((e) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass)).f138909c;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels".toString());
    }

    @Override // af2.b
    public final Object generatedComponent() {
        if (this.f138903a == null) {
            synchronized (this.f138904b) {
                try {
                    if (this.f138903a == null) {
                        this.f138903a = a();
                    }
                } finally {
                }
            }
        }
        return this.f138903a;
    }
}
