package xw0;

import a.cb;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lxw0/b;", "", "Lxw0/c;", "a", "Lxw0/c;", "()Lxw0/c;", "uploadAuxData", "", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "type", "", "c", "I", "getRotation", "()I", "setRotation", "(I)V", "rotation", "ideaPinModelsLibrary_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("upload_aux_data")
    @NotNull
    private final c uploadAuxData;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    @NotNull
    private String type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("rotation")
    private int rotation;

    public b(c uploadAuxData, String type, int i13) {
        Intrinsics.checkNotNullParameter(uploadAuxData, "uploadAuxData");
        Intrinsics.checkNotNullParameter(type, "type");
        this.uploadAuxData = uploadAuxData;
        this.type = type;
        this.rotation = i13;
    }

    /* renamed from: a, reason: from getter */
    public final c getUploadAuxData() {
        return this.uploadAuxData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.uploadAuxData, bVar.uploadAuxData) && Intrinsics.d(this.type, bVar.type) && this.rotation == bVar.rotation;
    }

    public final int hashCode() {
        return Integer.hashCode(this.rotation) + cb.d(this.type, this.uploadAuxData.hashCode() * 31, 31);
    }

    public final String toString() {
        c cVar = this.uploadAuxData;
        String str = this.type;
        int i13 = this.rotation;
        StringBuilder sb3 = new StringBuilder("IdeaPinCredentialsData(uploadAuxData=");
        sb3.append(cVar);
        sb3.append(", type=");
        sb3.append(str);
        sb3.append(", rotation=");
        return a.a.n(sb3, i13, ")");
    }
}
