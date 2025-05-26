package com.pinterest.xrenderer.legacy.multipass_processing;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ae2.f f52882a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.a f52883b;

    public f(ae2.f texture, androidx.appcompat.widget.a uniformHandle) {
        Intrinsics.checkNotNullParameter(texture, "texture");
        Intrinsics.checkNotNullParameter(uniformHandle, "uniformHandle");
        this.f52882a = texture;
        this.f52883b = uniformHandle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.d(this.f52882a, fVar.f52882a) && Intrinsics.d(this.f52883b, fVar.f52883b);
    }

    public final int hashCode() {
        return this.f52883b.hashCode() + (this.f52882a.hashCode() * 31);
    }

    public final String toString() {
        return "TextureBinding(texture=" + this.f52882a + ", uniformHandle=" + this.f52883b + ')';
    }
}
