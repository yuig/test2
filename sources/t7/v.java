package t7;

import a.cb;
import a7.m0;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class v implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f116609a;

    /* renamed from: b, reason: collision with root package name */
    public final String f116610b;

    /* renamed from: c, reason: collision with root package name */
    public final List f116611c;

    public v(String str, String str2, List list) {
        this.f116609a = str;
        this.f116610b = str2;
        this.f116611c = Collections.unmodifiableList(new ArrayList(list));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return TextUtils.equals(this.f116609a, vVar.f116609a) && TextUtils.equals(this.f116610b, vVar.f116610b) && this.f116611c.equals(vVar.f116611c);
    }

    public final int hashCode() {
        String str = this.f116609a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f116610b;
        return this.f116611c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("HlsTrackMetadataEntry");
        String str = this.f116609a;
        sb3.append(str != null ? a.a.p(cb.o(" [", str, ", "), this.f116610b, "]") : "");
        return sb3.toString();
    }
}
