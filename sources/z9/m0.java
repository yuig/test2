package z9;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f141232m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        try {
            this.f141232m = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // z9.o0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable[]) bundle.get(key);
    }

    @Override // z9.o0
    public final String b() {
        String name = this.f141232m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // z9.o0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
    @Override // z9.o0
    public final void e(Bundle bundle, String key, Object obj) {
        ?? r43 = (Serializable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f141232m.cast(r43);
        bundle.putSerializable(key, r43);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(m0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.f141232m, ((m0) obj).f141232m);
    }

    public final int hashCode() {
        return this.f141232m.hashCode();
    }
}
