package p02;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lp02/v;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "fileContent", "b", "fileType", "reportFlow_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class v {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("file_content")
    @NotNull
    private final String fileContent;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("file_type")
    @NotNull
    private final String fileType;

    public v(String fileContent, String fileType) {
        Intrinsics.checkNotNullParameter(fileContent, "fileContent");
        Intrinsics.checkNotNullParameter(fileType, "fileType");
        this.fileContent = fileContent;
        this.fileType = fileType;
    }

    /* renamed from: a, reason: from getter */
    public final String getFileContent() {
        return this.fileContent;
    }

    /* renamed from: b, reason: from getter */
    public final String getFileType() {
        return this.fileType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.fileContent, vVar.fileContent) && Intrinsics.d(this.fileType, vVar.fileType);
    }

    public final int hashCode() {
        return this.fileType.hashCode() + (this.fileContent.hashCode() * 31);
    }

    public final String toString() {
        return a.a.m("StatementOfReasons(fileContent=", this.fileContent, ", fileType=", this.fileType, ")");
    }
}
