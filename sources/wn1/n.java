package wn1;

import android.text.Editable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class n extends z {

    /* renamed from: b, reason: collision with root package name */
    public final int f130568b;

    /* renamed from: c, reason: collision with root package name */
    public final Editable f130569c;

    public n(int i13, Editable editable) {
        super(i13);
        this.f130568b = i13;
        this.f130569c = editable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f130568b == nVar.f130568b && Intrinsics.d(this.f130569c, nVar.f130569c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f130568b) * 31;
        Editable editable = this.f130569c;
        return hashCode + (editable == null ? 0 : editable.hashCode());
    }

    @Override // gm1.c
    public final int j() {
        return this.f130568b;
    }

    public final String toString() {
        return "AfterTextChanged(id=" + this.f130568b + ", updatedText=" + ((Object) this.f130569c) + ")";
    }
}
