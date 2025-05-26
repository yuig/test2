package xk2;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class s implements Serializable {

    /* renamed from: b */
    @NotNull
    public static final q f135225b = new q(null);

    /* renamed from: a */
    public final Object f135226a;

    public /* synthetic */ s(Object obj) {
        this.f135226a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof r) {
            return ((r) obj).f135224a;
        }
        return null;
    }

    public static final boolean b(Serializable serializable) {
        return serializable instanceof r;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s) {
            return Intrinsics.d(this.f135226a, ((s) obj).f135226a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f135226a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f135226a;
        if (obj instanceof r) {
            return ((r) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
