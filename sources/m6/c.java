package m6;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.strictmode.FragmentReuseViolation;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;
import androidx.fragment.app.strictmode.Violation;
import androidx.fragment.app.strictmode.WrongNestedHierarchyViolation;
import androidx.fragment.app.w0;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f85884a = b.f85881c;

    public static b a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                w0 parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f85884a;
    }

    public static void b(b bVar, Violation violation) {
        Fragment fragment = violation.f18435a;
        String name = fragment.getClass().getName();
        a aVar = a.PENALTY_LOG;
        Set set = bVar.f85882a;
        if (set.contains(aVar)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(a.PENALTY_DEATH)) {
            w2.c cVar = new w2.c(4, name, violation);
            if (!fragment.isAdded()) {
                cVar.run();
                return;
            }
            Handler handler = fragment.getParentFragmentManager().f18470v.f18326c;
            Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
            if (Intrinsics.d(handler.getLooper(), Looper.myLooper())) {
                cVar.run();
            } else {
                handler.post(cVar);
            }
        }
    }

    public static void c(Violation violation) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f18435a.getClass().getName()), violation);
        }
    }

    public static final void d(Fragment fragment, String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        c(fragmentReuseViolation);
        b a13 = a(fragment);
        if (a13.f85882a.contains(a.DETECT_FRAGMENT_REUSE) && g(a13, fragment.getClass(), FragmentReuseViolation.class)) {
            b(a13, fragmentReuseViolation);
        }
    }

    public static final void e(Fragment fragment, ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, viewGroup);
        c(fragmentTagUsageViolation);
        b a13 = a(fragment);
        if (a13.f85882a.contains(a.DETECT_FRAGMENT_TAG_USAGE) && g(a13, fragment.getClass(), FragmentTagUsageViolation.class)) {
            b(a13, fragmentTagUsageViolation);
        }
    }

    public static final void f(Fragment fragment, Fragment expectedParentFragment, int i13) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(expectedParentFragment, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation = new WrongNestedHierarchyViolation(fragment, expectedParentFragment, i13);
        c(wrongNestedHierarchyViolation);
        b a13 = a(fragment);
        if (a13.f85882a.contains(a.DETECT_WRONG_NESTED_HIERARCHY) && g(a13, fragment.getClass(), WrongNestedHierarchyViolation.class)) {
            b(a13, wrongNestedHierarchyViolation);
        }
    }

    public static boolean g(b bVar, Class cls, Class cls2) {
        Set set = (Set) bVar.f85883b.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.d(cls2.getSuperclass(), Violation.class) || !CollectionsKt.L(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
