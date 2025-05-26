package ua;

import androidx.transition.Transition;

/* loaded from: classes3.dex */
public interface o0 {
    void a();

    default void b(Transition transition) {
        e(transition);
    }

    default void c(Transition transition) {
        f(transition);
    }

    void d();

    void e(Transition transition);

    void f(Transition transition);

    void g(Transition transition);
}
