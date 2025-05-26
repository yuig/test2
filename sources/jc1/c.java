package jc1;

import com.apollographql.apollo3.exception.ApolloException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends ApolloException {

    /* renamed from: a, reason: collision with root package name */
    public final String f75452a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f75453b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String msg, Error error) {
        super(msg, error);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.f75452a = msg;
        this.f75453b = error;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f75452a, cVar.f75452a) && Intrinsics.d(this.f75453b, cVar.f75453b);
    }

    public final int hashCode() {
        int hashCode = this.f75452a.hashCode() * 31;
        Throwable th3 = this.f75453b;
        return hashCode + (th3 == null ? 0 : th3.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "EditProfileApolloException(msg=" + this.f75452a + ", t=" + this.f75453b + ")";
    }
}
