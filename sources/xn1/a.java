package xn1;

import android.text.Editable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a extends j {

    /* renamed from: b, reason: collision with root package name */
    public final int f135435b;

    /* renamed from: c, reason: collision with root package name */
    public final Editable f135436c;

    public a(int i13, Editable editable) {
        super(i13);
        this.f135435b = i13;
        this.f135436c = editable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f135435b == aVar.f135435b && Intrinsics.d(this.f135436c, aVar.f135436c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f135435b) * 31;
        Editable editable = this.f135436c;
        return hashCode + (editable == null ? 0 : editable.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f135435b;
    }

    public final String toString() {
        return "AfterTextChanged(id=" + this.f135435b + ", updatedText=" + ((Object) this.f135436c) + ")";
    }
}
