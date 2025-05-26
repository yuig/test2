package e92;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\f"}, d2 = {"Le92/e;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "messageCode", "b", "getMessageDetails", "messageDetails", "c", "url", "targetHandshakeLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("messageCode")
    @NotNull
    private final String messageCode;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("messageDetails")
    private final String messageDetails;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    private final String url;

    /* renamed from: a, reason: from getter */
    public final String getMessageCode() {
        return this.messageCode;
    }

    /* renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.messageCode, eVar.messageCode) && Intrinsics.d(this.messageDetails, eVar.messageDetails) && Intrinsics.d(this.url, eVar.url);
    }

    public final int hashCode() {
        int hashCode = this.messageCode.hashCode() * 31;
        String str = this.messageDetails;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.url;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.messageCode;
        String str2 = this.messageDetails;
        return a.a.p(a.a.w("TargetHandshakeMessage(messageCode=", str, ", messageDetails=", str2, ", url="), this.url, ")");
    }
}
