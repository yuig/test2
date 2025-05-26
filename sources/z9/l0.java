package z9;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f141231m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Parcelable.class.isAssignableFrom(type) || Serializable.class.isAssignableFrom(type)) {
            this.f141231m = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Parcelable or Serializable.").toString());
    }

    @Override // z9.o0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return bundle.get(key);
    }

    @Override // z9.o0
    public final String b() {
        String name = this.f141231m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // z9.o0
    public final Object c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // z9.o0
    public final void e(Bundle bundle, String key, Object obj) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f141231m.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(key, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(key, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(l0.class, obj.getClass())) {
            return false;
        }
        return Intrinsics.d(this.f141231m, ((l0) obj).f141231m);
    }

    public final int hashCode() {
        return this.f141231m.hashCode();
    }
}
