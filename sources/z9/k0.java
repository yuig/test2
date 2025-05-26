package z9;

import android.os.Bundle;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f141222m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Parcelable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
        }
        try {
            this.f141222m = Class.forName("[L" + type.getName() + ';');
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(e13);
        }
    }

    @Override // z9.o0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Parcelable[]) bundle.get(key);
    }

    @Override // z9.o0
    public final String b() {
        String name = this.f141222m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
        return name;
    }

    @Override // z9.o0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Arrays don't support default values.");
    }

    @Override // z9.o0
    public final void e(Bundle bundle, String key, Object obj) {
        Parcelable[] parcelableArr = (Parcelable[]) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f141222m.cast(parcelableArr);
        bundle.putParcelableArray(key, parcelableArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(k0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.f141222m, ((k0) obj).f141222m);
    }

    public final int hashCode() {
        return this.f141222m.hashCode();
    }
}
