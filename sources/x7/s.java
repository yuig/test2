package x7;

import a.cb;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final String f134103a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f134104b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f134105c;

    public s(String str, boolean z13, boolean z14) {
        this.f134103a = str;
        this.f134104b = z13;
        this.f134105c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != s.class) {
            return false;
        }
        s sVar = (s) obj;
        return TextUtils.equals(this.f134103a, sVar.f134103a) && this.f134104b == sVar.f134104b && this.f134105c == sVar.f134105c;
    }

    public final int hashCode() {
        return ((cb.d(this.f134103a, 31, 31) + (this.f134104b ? 1231 : 1237)) * 31) + (this.f134105c ? 1231 : 1237);
    }
}
