package z71;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\r"}, d2 = {"Lz71/a;", "", "", "a", "Ljava/lang/String;", "getUid", "()Ljava/lang/String;", "uid", "b", "getPinId", "pinId", "c", "url", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("uid")
    @NotNull
    private final String uid;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("pinId")
    @NotNull
    private final String pinId;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("url")
    @NotNull
    private final String url;

    /* renamed from: a, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.uid, aVar.uid) && Intrinsics.d(this.pinId, aVar.pinId) && Intrinsics.d(this.url, aVar.url);
    }

    public final int hashCode() {
        return this.url.hashCode() + cb.d(this.pinId, this.uid.hashCode() * 31, 31);
    }

    public final String toString() {
        String str = this.uid;
        String str2 = this.pinId;
        return a.a.p(a.a.w("BackgroundItem(uid=", str, ", pinId=", str2, ", url="), this.url, ")");
    }
}
