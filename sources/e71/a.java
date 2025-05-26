package e71;

import bm1.k;
import bm1.l;
import dl1.s;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0016B=\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0017"}, d2 = {"Le71/a;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "term", "", "b", "Ljava/lang/Integer;", "e", "()Ljava/lang/Integer;", "id", "c", "display", "", "isSelected", "Lbm1/l;", "buttonType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ZLbm1/l;)V", "kg/p", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class a implements s {

    /* renamed from: f, reason: collision with root package name */
    public static final List f57616f;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("term")
    private final String term;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final Integer id;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("display")
    private final String display;

    /* renamed from: d, reason: collision with root package name */
    public boolean f57620d;

    /* renamed from: e, reason: collision with root package name */
    public l f57621e;

    static {
        String str = "skin_color_bucket_id:1";
        String str2 = null;
        boolean z13 = false;
        String str3 = "skin_color_bucket_id:2";
        int i13 = 4;
        DefaultConstructorMarker defaultConstructorMarker = null;
        String str4 = "skin_color_bucket_id:3";
        String str5 = "skin_color_bucket_id:4";
        f57616f = f0.j(new a(str, 1, null, false, k.SKIN_TONE_ONE, 4, null), new a(str3, 2, str2, z13, k.SKIN_TONE_TWO, i13, defaultConstructorMarker), new a(str4, 3, null, false, k.SKIN_TONE_THREE, 4, null), new a(str5, 4, str2, z13, k.SKIN_TONE_FOUR, i13, defaultConstructorMarker));
    }

    public a(String str, Integer num, String str2, boolean z13, @NotNull l buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.term = str;
        this.id = num;
        this.display = str2;
        this.f57620d = z13;
        this.f57621e = buttonType;
    }

    public static a a(a aVar, String str) {
        String str2 = aVar.term;
        Integer num = aVar.id;
        boolean z13 = aVar.f57620d;
        l buttonType = aVar.f57621e;
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new a(str2, num, str, z13, buttonType);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        String num;
        Integer num2 = this.id;
        return (num2 == null || (num = num2.toString()) == null) ? "0" : num;
    }

    /* renamed from: c, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Intrinsics.d(this.id, ((a) obj).id);
        }
        return false;
    }

    /* renamed from: g, reason: from getter */
    public final String getTerm() {
        return this.term;
    }

    public final int hashCode() {
        String str = this.term;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.id;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.display;
        return this.f57621e.hashCode() + ep.b.e(this.f57620d, (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "SkinToneFilter(term=" + this.term + ", id=" + this.id + ", display=" + this.display + ", isSelected=" + this.f57620d + ", buttonType=" + this.f57621e + ")";
    }

    public /* synthetic */ a(String str, Integer num, String str2, boolean z13, l lVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, num, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? false : z13, (i13 & 16) != 0 ? k.SKIN_TONE_ONE : lVar);
    }
}
