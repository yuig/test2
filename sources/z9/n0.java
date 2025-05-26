package z9;

import android.os.Bundle;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class n0 extends o0 {

    /* renamed from: m, reason: collision with root package name */
    public final Class f141239m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Class type) {
        super(true);
        Intrinsics.checkNotNullParameter(type, "type");
        if (!Serializable.class.isAssignableFrom(type)) {
            throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
        }
        if (true ^ type.isEnum()) {
            this.f141239m = type;
            return;
        }
        throw new IllegalArgumentException((type + " is an Enum. You should use EnumType instead.").toString());
    }

    @Override // z9.o0
    public final Object a(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        return (Serializable) bundle.get(key);
    }

    @Override // z9.o0
    public String b() {
        String name = this.f141239m.getName();
        Intrinsics.checkNotNullExpressionValue(name, "type.name");
        return name;
    }

    @Override // z9.o0
    public final void e(Bundle bundle, String key, Object obj) {
        Serializable value = (Serializable) obj;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f141239m.cast(value);
        bundle.putSerializable(key, value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        return Intrinsics.d(this.f141239m, ((n0) obj).f141239m);
    }

    @Override // z9.o0
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Serializable c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f141239m.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(Class type, int i13) {
        super(false);
        Intrinsics.checkNotNullParameter(type, "type");
        if (Serializable.class.isAssignableFrom(type)) {
            this.f141239m = type;
            return;
        }
        throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
    }
}
