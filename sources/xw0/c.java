package xw0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Lxw0/c;", "", "", "Lxw0/a;", "a", "Ljava/util/List;", "()Ljava/util/List;", "clips", "ideaPinModelsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("clips")
    @NotNull
    private final List<a> clips;

    public c(ArrayList clips) {
        Intrinsics.checkNotNullParameter(clips, "clips");
        this.clips = clips;
    }

    /* renamed from: a, reason: from getter */
    public final List getClips() {
        return this.clips;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && Intrinsics.d(this.clips, ((c) obj).clips);
    }

    public final int hashCode() {
        return this.clips.hashCode();
    }

    public final String toString() {
        return "IdeaPinVideoAuxData(clips=" + this.clips + ")";
    }
}
