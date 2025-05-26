package x02;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lx02/d;", "", "", "a", "Ljava/lang/String;", "getStickerId", "()Ljava/lang/String;", "stickerId", "", "b", "I", "getMediaType", "()I", "mediaType", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("sticker_id")
    @NotNull
    private final String stickerId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("media_type")
    private final int mediaType;

    public d(String stickerId, int i13) {
        Intrinsics.checkNotNullParameter(stickerId, "stickerId");
        this.stickerId = stickerId;
        this.mediaType = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.stickerId, dVar.stickerId) && this.mediaType == dVar.mediaType;
    }

    public final int hashCode() {
        return Integer.hashCode(this.mediaType) + (this.stickerId.hashCode() * 31);
    }

    public final String toString() {
        return "CommentMedia(stickerId=" + this.stickerId + ", mediaType=" + this.mediaType + ")";
    }
}
