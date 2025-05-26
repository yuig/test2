package lg;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final String f83178a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f83179b;

    /* renamed from: c, reason: collision with root package name */
    public final ig.c f83180c;

    public b(String str, byte[] bArr, ig.c cVar) {
        this.f83178a = str;
        this.f83179b = bArr;
        this.f83180c = cVar;
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        byte[] bArr = this.f83179b;
        return "TransportContext(" + this.f83178a + ", " + this.f83180c + ", " + (bArr == null ? "" : Base64.encodeToString(bArr, 2)) + ")";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f83178a.equals(bVar.f83178a) && Arrays.equals(this.f83179b, bVar.f83179b) && this.f83180c.equals(bVar.f83180c);
    }

    public final int hashCode() {
        return ((((this.f83178a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f83179b)) * 1000003) ^ this.f83180c.hashCode();
    }
}
