package nl2;

import kotlin.jvm.internal.Intrinsics;
import rl2.u;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public Object f91309a;

    public a(Object obj) {
        this.f91309a = obj;
    }

    public void a(Object obj, u property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public void b(u property) {
        Intrinsics.checkNotNullParameter(property, "property");
    }

    public final Object c(Object obj, u property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.f91309a;
    }

    public final void d(Object obj, u property, Object obj2) {
        Intrinsics.checkNotNullParameter(property, "property");
        Object obj3 = this.f91309a;
        b(property);
        this.f91309a = obj2;
        a(obj3, property, obj2);
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.f91309a + ')';
    }
}
