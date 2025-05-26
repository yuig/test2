package u12;

import dl1.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lu12/a;", "Ldl1/s;", "", "a", "J", "getId", "()J", "id", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "", "c", "Ljava/util/List;", "getSubInterests", "()Ljava/util/List;", "subInterests", "<init>", "(JLjava/lang/String;Ljava/util/List;)V", "gi2/b", "repository_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class a implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final long id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("name")
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("sub_interests")
    private final List<a> subInterests;

    public /* synthetic */ a(long j13, String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j13, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : list);
    }

    @Override // dl1.s
    public final String b() {
        return String.valueOf(this.id);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.id == aVar.id && Intrinsics.d(this.name, aVar.name) && Intrinsics.d(this.subInterests, aVar.subInterests);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<a> list = this.subInterests;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "HierarchicalInterest(id=" + this.id + ", name=" + this.name + ", subInterests=" + this.subInterests + ")";
    }

    public a(long j13, String str, List<a> list) {
        this.id = j13;
        this.name = str;
        this.subInterests = list;
    }
}
