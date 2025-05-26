package t0;

import androidx.camera.core.impl.d;
import androidx.camera.core.impl.d1;
import androidx.camera.core.impl.f;
import java.util.List;

/* loaded from: classes2.dex */
public final class a implements d1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f115656a;

    /* renamed from: b, reason: collision with root package name */
    public final int f115657b;

    /* renamed from: c, reason: collision with root package name */
    public final List f115658c;

    /* renamed from: d, reason: collision with root package name */
    public final List f115659d;

    /* renamed from: e, reason: collision with root package name */
    public final d f115660e;

    /* renamed from: f, reason: collision with root package name */
    public final f f115661f;

    public a(int i13, int i14, List list, List list2, d dVar, f fVar) {
        this.f115656a = i13;
        this.f115657b = i14;
        if (list == null) {
            throw new NullPointerException("Null audioProfiles");
        }
        this.f115658c = list;
        if (list2 == null) {
            throw new NullPointerException("Null videoProfiles");
        }
        this.f115659d = list2;
        this.f115660e = dVar;
        if (fVar == null) {
            throw new NullPointerException("Null defaultVideoProfile");
        }
        this.f115661f = fVar;
    }

    @Override // androidx.camera.core.impl.d1
    public final int a() {
        return this.f115656a;
    }

    @Override // androidx.camera.core.impl.d1
    public final List b() {
        return this.f115659d;
    }

    @Override // androidx.camera.core.impl.d1
    public final int c() {
        return this.f115657b;
    }

    @Override // androidx.camera.core.impl.d1
    public final List d() {
        return this.f115658c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f115656a == aVar.f115656a && this.f115657b == aVar.f115657b && this.f115658c.equals(aVar.f115658c) && this.f115659d.equals(aVar.f115659d)) {
            d dVar = aVar.f115660e;
            d dVar2 = this.f115660e;
            if (dVar2 != null ? dVar2.equals(dVar) : dVar == null) {
                if (this.f115661f.equals(aVar.f115661f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f115656a ^ 1000003) * 1000003) ^ this.f115657b) * 1000003) ^ this.f115658c.hashCode()) * 1000003) ^ this.f115659d.hashCode()) * 1000003;
        d dVar = this.f115660e;
        return ((hashCode ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003) ^ this.f115661f.hashCode();
    }

    public final String toString() {
        return "VideoValidatedEncoderProfilesProxy{defaultDurationSeconds=" + this.f115656a + ", recommendedFileFormat=" + this.f115657b + ", audioProfiles=" + this.f115658c + ", videoProfiles=" + this.f115659d + ", defaultAudioProfile=" + this.f115660e + ", defaultVideoProfile=" + this.f115661f + "}";
    }
}
