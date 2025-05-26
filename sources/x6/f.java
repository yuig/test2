package x6;

import androidx.lifecycle.t1;
import androidx.lifecycle.z;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import g1.p0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes.dex */
public final class f extends a {

    /* renamed from: a, reason: collision with root package name */
    public final z f133926a;

    /* renamed from: b, reason: collision with root package name */
    public final e f133927b;

    public f(z zVar, t1 store) {
        this.f133926a = zVar;
        Intrinsics.checkNotNullParameter(store, "store");
        d factory = e.f133923d;
        Intrinsics.checkNotNullParameter(factory, "factory");
        u6.a defaultCreationExtras = u6.a.f120754b;
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
        this.f133927b = (e) bVar.F("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(e13), modelClass);
    }

    public final void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        p0 p0Var = this.f133927b.f133924b;
        if (p0Var.k() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i13 = 0; i13 < p0Var.k(); i13++) {
                b bVar = (b) p0Var.l(i13);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(p0Var.i(i13));
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.l(str2, printWriter);
            }
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder(RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN);
        sb3.append("LoaderManager{");
        sb3.append(Integer.toHexString(System.identityHashCode(this)));
        sb3.append(" in ");
        Class<?> cls = this.f133926a.getClass();
        sb3.append(cls.getSimpleName());
        sb3.append("{");
        sb3.append(Integer.toHexString(System.identityHashCode(cls)));
        sb3.append("}}");
        return sb3.toString();
    }
}
