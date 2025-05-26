package ul2;

import java.lang.reflect.Type;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w0 implements Type {

    /* renamed from: a, reason: collision with root package name */
    public final Type[] f122624a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122625b;

    public w0(Type[] types) {
        Intrinsics.checkNotNullParameter(types, "types");
        this.f122624a = types;
        this.f122625b = Arrays.hashCode(types);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w0) {
            if (Arrays.equals(this.f122624a, ((w0) obj).f122624a)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Type
    public final String getTypeName() {
        return kotlin.collections.c0.M(this.f122624a, ", ", "[", "]", 0, null, null, 56);
    }

    public final int hashCode() {
        return this.f122625b;
    }

    public final String toString() {
        return getTypeName();
    }
}
