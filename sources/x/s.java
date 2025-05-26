package x;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import v.j1;

/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final r f131262a;

    public s(int i13, ArrayList arrayList, Executor executor, j1 j1Var) {
        if (Build.VERSION.SDK_INT < 28) {
            this.f131262a = new q(i13, arrayList, executor, j1Var);
        } else {
            this.f131262a = new p(i13, arrayList, executor, j1Var);
        }
    }

    public static ArrayList a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((OutputConfiguration) ((h) it.next()).f131248a.c());
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof s)) {
            return false;
        }
        return this.f131262a.equals(((s) obj).f131262a);
    }

    public final int hashCode() {
        return this.f131262a.hashCode();
    }
}
