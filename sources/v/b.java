package v;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f123351a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f123352b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.camera.core.impl.o2 f123353c;

    /* renamed from: d, reason: collision with root package name */
    public final androidx.camera.core.impl.z2 f123354d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f123355e;

    /* renamed from: f, reason: collision with root package name */
    public final androidx.camera.core.impl.k f123356f;

    /* renamed from: g, reason: collision with root package name */
    public final List f123357g;

    public b(String str, Class cls, androidx.camera.core.impl.o2 o2Var, androidx.camera.core.impl.z2 z2Var, Size size, androidx.camera.core.impl.k kVar, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f123351a = str;
        this.f123352b = cls;
        if (o2Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f123353c = o2Var;
        if (z2Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f123354d = z2Var;
        this.f123355e = size;
        this.f123356f = kVar;
        this.f123357g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f123351a.equals(bVar.f123351a) && this.f123352b.equals(bVar.f123352b) && this.f123353c.equals(bVar.f123353c) && this.f123354d.equals(bVar.f123354d)) {
            Size size = bVar.f123355e;
            Size size2 = this.f123355e;
            if (size2 != null ? size2.equals(size) : size == null) {
                androidx.camera.core.impl.k kVar = bVar.f123356f;
                androidx.camera.core.impl.k kVar2 = this.f123356f;
                if (kVar2 != null ? kVar2.equals(kVar) : kVar == null) {
                    List list = bVar.f123357g;
                    List list2 = this.f123357g;
                    if (list2 == null) {
                        if (list == null) {
                            return true;
                        }
                    } else if (list2.equals(list)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.f123351a.hashCode() ^ 1000003) * 1000003) ^ this.f123352b.hashCode()) * 1000003) ^ this.f123353c.hashCode()) * 1000003) ^ this.f123354d.hashCode()) * 1000003;
        Size size = this.f123355e;
        int hashCode2 = (hashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        androidx.camera.core.impl.k kVar = this.f123356f;
        int hashCode3 = (hashCode2 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        List list = this.f123357g;
        return hashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UseCaseInfo{useCaseId=");
        sb3.append(this.f123351a);
        sb3.append(", useCaseType=");
        sb3.append(this.f123352b);
        sb3.append(", sessionConfig=");
        sb3.append(this.f123353c);
        sb3.append(", useCaseConfig=");
        sb3.append(this.f123354d);
        sb3.append(", surfaceResolution=");
        sb3.append(this.f123355e);
        sb3.append(", streamSpec=");
        sb3.append(this.f123356f);
        sb3.append(", captureTypes=");
        return a.c.j(sb3, this.f123357g, "}");
    }
}
