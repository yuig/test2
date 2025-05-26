package qr1;

import android.content.Intent;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f104974a;

    /* renamed from: b, reason: collision with root package name */
    public final int f104975b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f104976c;

    public b(int i13, int i14, Intent intent) {
        this.f104974a = i13;
        this.f104975b = i14;
        this.f104976c = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f104974a == bVar.f104974a && this.f104975b == bVar.f104975b && Intrinsics.d(this.f104976c, bVar.f104976c);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f104975b, Integer.hashCode(this.f104974a) * 31, 31);
        Intent intent = this.f104976c;
        return b13 + (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ActivityResult(requestCode=" + this.f104974a + ", resultCode=" + this.f104975b + ", viewIntent=" + this.f104976c + ")";
    }
}
