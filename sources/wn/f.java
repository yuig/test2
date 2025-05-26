package wn;

import com.linecorp.linesdk.LineIdToken;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final e f130439a;

    /* renamed from: b, reason: collision with root package name */
    public final List f130440b;

    /* renamed from: c, reason: collision with root package name */
    public final LineIdToken f130441c;

    public f(e eVar, List list, LineIdToken lineIdToken) {
        this.f130439a = eVar;
        this.f130440b = Collections.unmodifiableList(list);
        this.f130441c = lineIdToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f130439a.equals(fVar.f130439a) || !this.f130440b.equals(fVar.f130440b)) {
            return false;
        }
        LineIdToken lineIdToken = fVar.f130441c;
        LineIdToken lineIdToken2 = this.f130441c;
        return lineIdToken2 != null ? lineIdToken2.equals(lineIdToken) : lineIdToken == null;
    }

    public final int hashCode() {
        int hashCode = (this.f130440b.hashCode() + (this.f130439a.hashCode() * 31)) * 31;
        LineIdToken lineIdToken = this.f130441c;
        return hashCode + (lineIdToken != null ? lineIdToken.hashCode() : 0);
    }

    public final String toString() {
        return "IssueAccessTokenResult{accessToken=#####, scopes=" + this.f130440b + ", idToken=" + this.f130441c + '}';
    }
}
