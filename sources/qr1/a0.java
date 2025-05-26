package qr1;

import a.cb;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\f\u001a\u0004\b\u0003\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\b\u0010\r¨\u0006\u0012"}, d2 = {"Lqr1/a0;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "c", "title", "", "Ljava/util/List;", "()Ljava/util/List;", "description", "Lqr1/z;", "d", "fields", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class a0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("title")
    @NotNull
    private final String title;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("description")
    private final List<String> description;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("settings_field")
    private final List<z> fields;

    /* renamed from: a, reason: from getter */
    public final List getDescription() {
        return this.description;
    }

    /* renamed from: b, reason: from getter */
    public final List getFields() {
        return this.fields;
    }

    /* renamed from: c, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.d(this.id, a0Var.id) && Intrinsics.d(this.title, a0Var.title) && Intrinsics.d(this.description, a0Var.description) && Intrinsics.d(this.fields, a0Var.fields);
    }

    public final int hashCode() {
        int d2 = cb.d(this.title, this.id.hashCode() * 31, 31);
        List<String> list = this.description;
        int hashCode = (d2 + (list == null ? 0 : list.hashCode())) * 31;
        List<z> list2 = this.fields;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        List<String> list = this.description;
        List<z> list2 = this.fields;
        StringBuilder w13 = a.a.w("PrivacyAndDataSection(id=", str, ", title=", str2, ", description=");
        w13.append(list);
        w13.append(", fields=");
        w13.append(list2);
        w13.append(")");
        return w13.toString();
    }
}
