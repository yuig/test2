package qr1;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u0003\u0010\u000b¨\u0006\u000e"}, d2 = {"Lqr1/a;", "", "", "a", "Z", "c", "()Z", "forceRecommended", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "conflictingUsername", "conflictingEmail", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("force_recommended")
    private final boolean forceRecommended;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("conflicting_username")
    @NotNull
    private final String conflictingUsername;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("conflicting_email")
    private final String conflictingEmail;

    /* renamed from: a, reason: from getter */
    public final String getConflictingEmail() {
        return this.conflictingEmail;
    }

    /* renamed from: b, reason: from getter */
    public final String getConflictingUsername() {
        return this.conflictingUsername;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getForceRecommended() {
        return this.forceRecommended;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.forceRecommended == aVar.forceRecommended && Intrinsics.d(this.conflictingUsername, aVar.conflictingUsername) && Intrinsics.d(this.conflictingEmail, aVar.conflictingEmail);
    }

    public final int hashCode() {
        int d2 = cb.d(this.conflictingUsername, Boolean.hashCode(this.forceRecommended) * 31, 31);
        String str = this.conflictingEmail;
        return d2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z13 = this.forceRecommended;
        String str = this.conflictingUsername;
        String str2 = this.conflictingEmail;
        StringBuilder sb3 = new StringBuilder("AccountAlreadyLinkedData(forceRecommended=");
        sb3.append(z13);
        sb3.append(", conflictingUsername=");
        sb3.append(str);
        sb3.append(", conflictingEmail=");
        return a.a.p(sb3, str2, ")");
    }
}
