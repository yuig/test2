package u6;

import androidx.lifecycle.l1;
import androidx.lifecycle.p1;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.l0;

/* loaded from: classes3.dex */
public final class d implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final g[] f120756a;

    public d(g... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.f120756a = initializers;
    }

    @Override // androidx.lifecycle.p1
    public final l1 c(Class modelClass, e extras) {
        l1 l1Var;
        g gVar;
        Function1 function1;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        rl2.d modelClass2 = l0.w0(modelClass);
        g[] gVarArr = this.f120756a;
        g[] initializers = (g[]) Arrays.copyOf(gVarArr, gVarArr.length);
        Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        int length = initializers.length;
        int i13 = 0;
        while (true) {
            l1Var = null;
            if (i13 >= length) {
                gVar = null;
                break;
            }
            gVar = initializers[i13];
            if (Intrinsics.d(gVar.f120757a, modelClass2)) {
                break;
            }
            i13++;
        }
        if (gVar != null && (function1 = gVar.f120758b) != null) {
            l1Var = (l1) function1.invoke(extras);
        }
        if (l1Var != null) {
            return l1Var;
        }
        StringBuilder sb3 = new StringBuilder("No initializer set for given class ");
        Intrinsics.checkNotNullParameter(modelClass2, "<this>");
        sb3.append(modelClass2.e());
        throw new IllegalArgumentException(sb3.toString().toString());
    }
}
