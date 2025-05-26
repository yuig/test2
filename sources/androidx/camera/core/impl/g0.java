package androidx.camera.core.impl;

import android.graphics.Rect;
import java.util.List;

/* loaded from: classes2.dex */
public interface g0 extends c0.m {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f16842a = new f0();

    default void a() {
    }

    Rect c();

    void d(int i13);

    v0 f();

    default void g() {
    }

    void h(v0 v0Var);

    void i(i2 i2Var);

    com.google.common.util.concurrent.c0 j(int i13, int i14, List list);

    default com.google.common.util.concurrent.c0 k(int i13, int i14) {
        return g0.m.e(new e0());
    }

    default void l(h0.h hVar) {
    }

    void m();
}
