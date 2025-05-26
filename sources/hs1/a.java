package hs1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public interface a extends ee.i {
    void B0(Bitmap bitmap, x xVar);

    void J1();

    @Override // ae.i
    /* bridge */ /* synthetic */ default void b() {
    }

    @Override // ee.i
    default void g(ee.h cb3) {
        Intrinsics.checkNotNullParameter(cb3, "cb");
    }

    @Override // ee.i
    /* bridge */ /* synthetic */ default void j(Drawable drawable) {
    }

    @Override // ee.i
    default void k(ee.h cb3) {
        Intrinsics.checkNotNullParameter(cb3, "cb");
        ((de.k) cb3).p(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // ee.i
    /* bridge */ /* synthetic */ default void m(Drawable drawable) {
    }

    void n1(String str);

    @Override // ae.i
    /* bridge */ /* synthetic */ default void onDestroy() {
    }

    void p1(boolean z13);

    @Override // ee.i
    /* bridge */ /* synthetic */ default void s(Drawable drawable) {
    }

    default void s1(x xVar) {
    }

    @Override // ae.i
    /* bridge */ /* synthetic */ default void x() {
    }

    void y1();

    @Override // ee.i
    default void z(Object obj, fe.d dVar) {
        Bitmap resource = (Bitmap) obj;
        Intrinsics.checkNotNullParameter(resource, "resource");
    }
}
