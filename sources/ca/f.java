package ca;

import androidx.lifecycle.l1;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f extends l1 {

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f27043b;

    @Override // androidx.lifecycle.l1
    public final void g() {
        WeakReference weakReference = this.f27043b;
        if (weakReference == null) {
            Intrinsics.r("completeTransition");
            throw null;
        }
        Function0 function0 = (Function0) weakReference.get();
        if (function0 != null) {
            function0.invoke();
        }
    }
}
