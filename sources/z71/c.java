package z71;

import dl1.s;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lz71/c;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "Lz71/e;", "b", "Lz71/e;", "e", "()Lz71/e;", "localPage", "<init>", "(Ljava/lang/String;Lz71/e;)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class c implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("page")
    @NotNull
    private final e localPage;

    public c(@NotNull String id3, @NotNull e localPage) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(localPage, "localPage");
        this.id = id3;
        this.localPage = localPage;
    }

    public static c a(c cVar, e localPage) {
        String id3 = cVar.id;
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(localPage, "localPage");
        return new c(id3, localPage);
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final String c() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final e getLocalPage() {
        return this.localPage;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.id, cVar.id) && Intrinsics.d(this.localPage, cVar.localPage);
    }

    public final int hashCode() {
        return this.localPage.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return "CollageLocalData(id=" + this.id + ", localPage=" + this.localPage + ")";
    }
}
