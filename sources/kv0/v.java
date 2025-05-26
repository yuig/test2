package kv0;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f81020a;

    /* renamed from: b, reason: collision with root package name */
    public final String f81021b;

    public v(Uri uri, String str) {
        this.f81020a = uri;
        this.f81021b = str;
    }

    @Override // dl1.s
    public final String b() {
        String simpleName = v.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f81020a, vVar.f81020a) && Intrinsics.d(this.f81021b, vVar.f81021b);
    }

    public final int hashCode() {
        Uri uri = this.f81020a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f81021b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "IdeaPinProductTagsViewModel(previewImageUri=" + this.f81020a + ", previewLabelText=" + this.f81021b + ")";
    }
}
