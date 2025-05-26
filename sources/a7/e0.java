package a7;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: d, reason: collision with root package name */
    public static final e0 f982d = new e0(new x92.b(5));

    /* renamed from: a, reason: collision with root package name */
    public final Uri f983a;

    /* renamed from: b, reason: collision with root package name */
    public final String f984b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f985c;

    static {
        d7.n0.Q(0);
        d7.n0.Q(1);
        d7.n0.Q(2);
    }

    public e0(x92.b bVar) {
        this.f983a = (Uri) bVar.f134365b;
        this.f984b = (String) bVar.f134366c;
        this.f985c = (Bundle) bVar.f134367d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        if (Objects.equals(this.f983a, e0Var.f983a) && Objects.equals(this.f984b, e0Var.f984b)) {
            if ((this.f985c == null) == (e0Var.f985c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Uri uri = this.f983a;
        int hashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f984b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + (this.f985c != null ? 1 : 0);
    }
}
