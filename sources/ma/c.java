package ma;

import android.os.Bundle;
import androidx.lifecycle.l;
import androidx.lifecycle.q;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c implements x {

    /* renamed from: a, reason: collision with root package name */
    public final i f86751a;

    public c(i owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f86751a = owner;
    }

    public final void a(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, c.class.getClassLoader()).asSubclass(e.class);
            Intrinsics.checkNotNullExpressionValue(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                constr…wInstance()\n            }");
                    ((l) ((e) newInstance)).a(this.f86751a);
                } catch (Exception e13) {
                    throw new RuntimeException(a.a.j("Failed to instantiate ", str), e13);
                }
            } catch (NoSuchMethodException e14) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e14);
            }
        } catch (ClassNotFoundException e15) {
            throw new RuntimeException(a.a.k("Class ", str, " wasn't found"), e15);
        }
    }

    @Override // androidx.lifecycle.x
    public final void c(z source, q event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != q.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().b(this);
        Bundle a13 = this.f86751a.getSavedStateRegistry().a("androidx.savedstate.Restarter");
        if (a13 == null) {
            return;
        }
        ArrayList<String> stringArrayList = a13.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }
}
