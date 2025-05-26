package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class e implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f16821a;

    /* renamed from: b, reason: collision with root package name */
    public final int f16822b;

    /* renamed from: c, reason: collision with root package name */
    public final List f16823c;

    /* renamed from: d, reason: collision with root package name */
    public final List f16824d;

    public e(int i13, int i14, List list, List list2) {
        this.f16821a = i13;
        this.f16822b = i14;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f16823c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f16824d = list2;
    }

    public static e e(int i13, int i14, List list, List list2) {
        return new e(i13, i14, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
    }

    @Override // androidx.camera.core.impl.d1
    public final int a() {
        return this.f16821a;
    }

    @Override // androidx.camera.core.impl.d1
    public final List b() {
        return this.f16824d;
    }

    @Override // androidx.camera.core.impl.d1
    public final int c() {
        return this.f16822b;
    }

    @Override // androidx.camera.core.impl.d1
    public final List d() {
        return this.f16823c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16821a == eVar.f16821a && this.f16822b == eVar.f16822b && this.f16823c.equals(eVar.f16823c) && this.f16824d.equals(eVar.f16824d);
    }

    public final int hashCode() {
        return ((((((this.f16821a ^ 1000003) * 1000003) ^ this.f16822b) * 1000003) ^ this.f16823c.hashCode()) * 1000003) ^ this.f16824d.hashCode();
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb3.append(this.f16821a);
        sb3.append(", recommendedFileFormat=");
        sb3.append(this.f16822b);
        sb3.append(", audioProfiles=");
        sb3.append(this.f16823c);
        sb3.append(", videoProfiles=");
        return a.c.j(sb3, this.f16824d, "}");
    }
}
