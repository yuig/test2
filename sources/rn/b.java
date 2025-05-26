package rn;

import com.linecorp.linesdk.LineApiError;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final b f108808d = new b(c.SUCCESS, null, LineApiError.f34025d);

    /* renamed from: a, reason: collision with root package name */
    public final c f108809a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f108810b;

    /* renamed from: c, reason: collision with root package name */
    public final LineApiError f108811c;

    public b(c cVar, Object obj, LineApiError lineApiError) {
        this.f108809a = cVar;
        this.f108810b = obj;
        this.f108811c = lineApiError;
    }

    public static b a(c cVar, LineApiError lineApiError) {
        return new b(cVar, null, lineApiError);
    }

    public static b b(Object obj) {
        return obj == null ? f108808d : new b(c.SUCCESS, obj, LineApiError.f34025d);
    }

    public final Object c() {
        Object obj = this.f108810b;
        if (obj != null) {
            return obj;
        }
        throw new NoSuchElementException("response data is null. Please check result by isSuccess before.");
    }

    public final boolean d() {
        return this.f108809a == c.SUCCESS;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f108809a != bVar.f108809a) {
            return false;
        }
        Object obj2 = bVar.f108810b;
        Object obj3 = this.f108810b;
        if (obj3 == null ? obj2 == null : obj3.equals(obj2)) {
            return this.f108811c.equals(bVar.f108811c);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f108809a.hashCode() * 31;
        Object obj = this.f108810b;
        return this.f108811c.hashCode() + ((hashCode + (obj != null ? obj.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "LineApiResponse{errorData=" + this.f108811c + ", responseCode=" + this.f108809a + ", responseData=" + this.f108810b + '}';
    }
}
