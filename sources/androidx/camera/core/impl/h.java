package androidx.camera.core.impl;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public final z0 f16844a;

    /* renamed from: b */
    public final List f16845b;

    /* renamed from: c */
    public final String f16846c;

    /* renamed from: d */
    public final int f16847d;

    /* renamed from: e */
    public final int f16848e;

    /* renamed from: f */
    public final c0.z f16849f;

    public h(z0 z0Var, List list, String str, int i13, int i14, c0.z zVar) {
        this.f16844a = z0Var;
        this.f16845b = list;
        this.f16846c = str;
        this.f16847d = i13;
        this.f16848e = i14;
        this.f16849f = zVar;
    }

    public static androidx.appcompat.widget.c2 a(z0 z0Var) {
        androidx.appcompat.widget.c2 c2Var = new androidx.appcompat.widget.c2(3);
        if (z0Var == null) {
            throw new NullPointerException("Null surface");
        }
        c2Var.f16531b = z0Var;
        List emptyList = Collections.emptyList();
        if (emptyList == null) {
            throw new NullPointerException("Null sharedSurfaces");
        }
        c2Var.f16532c = emptyList;
        c2Var.f16533d = null;
        c2Var.f16534e = -1;
        c2Var.f16535f = -1;
        c2Var.f16536g = c0.z.f24401d;
        return c2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f16844a.equals(hVar.f16844a) && this.f16845b.equals(hVar.f16845b)) {
            String str = hVar.f16846c;
            String str2 = this.f16846c;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.f16847d == hVar.f16847d && this.f16848e == hVar.f16848e && this.f16849f.equals(hVar.f16849f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.f16844a.hashCode() ^ 1000003) * 1000003) ^ this.f16845b.hashCode()) * 1000003;
        String str = this.f16846c;
        return ((((((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f16847d) * 1000003) ^ this.f16848e) * 1000003) ^ this.f16849f.hashCode();
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f16844a + ", sharedSurfaces=" + this.f16845b + ", physicalCameraId=" + this.f16846c + ", mirrorMode=" + this.f16847d + ", surfaceGroupId=" + this.f16848e + ", dynamicRange=" + this.f16849f + "}";
    }
}
