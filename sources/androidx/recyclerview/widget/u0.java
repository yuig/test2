package androidx.recyclerview.widget;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface u0 {
    default void b(Exception e13) {
        LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException layoutManagerContract$ExceptionHandling$PinterestLayoutManagerException;
        Intrinsics.checkNotNullParameter(e13, "e");
        t0 f19172p = getF19172p();
        if (f19172p instanceof s0) {
            t0 f19172p2 = getF19172p();
            Intrinsics.g(f19172p2, "null cannot be cast to non-null type androidx.recyclerview.widget.LayoutManagerContract.ExceptionHandling.RVException");
            layoutManagerContract$ExceptionHandling$PinterestLayoutManagerException = ((s0) f19172p2).a(e13);
        } else if (f19172p instanceof r0) {
            t0 f19172p3 = getF19172p();
            Intrinsics.g(f19172p3, "null cannot be cast to non-null type androidx.recyclerview.widget.LayoutManagerContract.ExceptionHandling.DebugTag");
            layoutManagerContract$ExceptionHandling$PinterestLayoutManagerException = new LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException(((r0) f19172p3).value(), e13);
        } else {
            if (f19172p != null) {
                throw new NoWhenBranchMatchedException();
            }
            layoutManagerContract$ExceptionHandling$PinterestLayoutManagerException = new LayoutManagerContract$ExceptionHandling$PinterestLayoutManagerException("unknown", e13);
        }
        vb0.j.f125466a.J(layoutManagerContract$ExceptionHandling$PinterestLayoutManagerException, tb0.p.PLATFORM);
    }

    /* renamed from: c */
    t0 getF19172p();
}
