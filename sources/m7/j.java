package m7;

import a.cb;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f86212a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.media3.common.b f86213b;

    /* renamed from: c, reason: collision with root package name */
    public final androidx.media3.common.b f86214c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86215d;

    /* renamed from: e, reason: collision with root package name */
    public final int f86216e;

    public j(String str, androidx.media3.common.b bVar, androidx.media3.common.b bVar2, int i13, int i14) {
        bf.b.i(i13 == 0 || i14 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f86212a = str;
        this.f86213b = bVar;
        bVar2.getClass();
        this.f86214c = bVar2;
        this.f86215d = i13;
        this.f86216e = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f86215d == jVar.f86215d && this.f86216e == jVar.f86216e && this.f86212a.equals(jVar.f86212a) && this.f86213b.equals(jVar.f86213b) && this.f86214c.equals(jVar.f86214c);
    }

    public final int hashCode() {
        return this.f86214c.hashCode() + ((this.f86213b.hashCode() + cb.d(this.f86212a, (((527 + this.f86215d) * 31) + this.f86216e) * 31, 31)) * 31);
    }
}
