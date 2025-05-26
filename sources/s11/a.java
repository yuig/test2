package s11;

import aq.d;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final d f110575a;

    /* renamed from: b, reason: collision with root package name */
    public final q11.b f110576b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f110577c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f110578d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f110579e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f110580f;

    /* renamed from: g, reason: collision with root package name */
    public final String f110581g;

    /* renamed from: h, reason: collision with root package name */
    public final String f110582h;

    /* renamed from: i, reason: collision with root package name */
    public final Integer f110583i;

    /* renamed from: j, reason: collision with root package name */
    public final String f110584j;

    /* renamed from: k, reason: collision with root package name */
    public final String f110585k;

    /* renamed from: l, reason: collision with root package name */
    public final q11.c f110586l;

    /* renamed from: m, reason: collision with root package name */
    public final uk1.d f110587m;

    /* renamed from: n, reason: collision with root package name */
    public final String f110588n;

    /* renamed from: o, reason: collision with root package name */
    public final List f110589o;

    public a(d dVar, q11.b type, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, String str3, String str4, q11.c cVar, uk1.d dVar2, String str5, List list, int i13) {
        d field = (i13 & 1) != 0 ? d.NONE : dVar;
        Integer num6 = (i13 & 4) != 0 ? null : num;
        Integer num7 = (i13 & 8) != 0 ? null : num2;
        Integer num8 = (i13 & 16) != 0 ? null : num3;
        Integer num9 = (i13 & 32) != 0 ? null : num4;
        String str6 = (i13 & 64) != 0 ? null : str;
        String str7 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str2;
        Integer num10 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : num5;
        String str8 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? null : str3;
        String str9 = (i13 & 1024) != 0 ? null : str4;
        q11.c cVar2 = (i13 & 2048) != 0 ? null : cVar;
        uk1.d dVar3 = (i13 & 4096) != 0 ? null : dVar2;
        String str10 = (i13 & 8192) != 0 ? null : str5;
        List list2 = (i13 & 16384) != 0 ? null : list;
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f110575a = field;
        this.f110576b = type;
        this.f110577c = num6;
        this.f110578d = num7;
        this.f110579e = num8;
        this.f110580f = num9;
        this.f110581g = str6;
        this.f110582h = str7;
        this.f110583i = num10;
        this.f110584j = str8;
        this.f110585k = str9;
        this.f110586l = cVar2;
        this.f110587m = dVar3;
        this.f110588n = str10;
        this.f110589o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f110575a == aVar.f110575a && this.f110576b == aVar.f110576b && Intrinsics.d(this.f110577c, aVar.f110577c) && Intrinsics.d(this.f110578d, aVar.f110578d) && Intrinsics.d(this.f110579e, aVar.f110579e) && Intrinsics.d(this.f110580f, aVar.f110580f) && Intrinsics.d(this.f110581g, aVar.f110581g) && Intrinsics.d(this.f110582h, aVar.f110582h) && Intrinsics.d(this.f110583i, aVar.f110583i) && Intrinsics.d(this.f110584j, aVar.f110584j) && Intrinsics.d(this.f110585k, aVar.f110585k) && Intrinsics.d(this.f110586l, aVar.f110586l) && Intrinsics.d(this.f110587m, aVar.f110587m) && Intrinsics.d(this.f110588n, aVar.f110588n) && Intrinsics.d(this.f110589o, aVar.f110589o);
    }

    public final int hashCode() {
        int hashCode = (this.f110576b.hashCode() + (this.f110575a.hashCode() * 31)) * 31;
        Integer num = this.f110577c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f110578d;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f110579e;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f110580f;
        int hashCode5 = (hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f110581g;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f110582h;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num5 = this.f110583i;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.f110584j;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f110585k;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        q11.c cVar = this.f110586l;
        int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        uk1.d dVar = this.f110587m;
        int hashCode12 = (hashCode11 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str5 = this.f110588n;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.f110589o;
        return hashCode13 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EditableItem(field=");
        sb3.append(this.f110575a);
        sb3.append(", type=");
        sb3.append(this.f110576b);
        sb3.append(", label=");
        sb3.append(this.f110577c);
        sb3.append(", hintText=");
        sb3.append(this.f110578d);
        sb3.append(", errorText=");
        sb3.append(this.f110579e);
        sb3.append(", extraLabelText=");
        sb3.append(this.f110580f);
        sb3.append(", disclosureNote=");
        sb3.append(this.f110581g);
        sb3.append(", value=");
        sb3.append(this.f110582h);
        sb3.append(", textValueStyle=");
        sb3.append(this.f110583i);
        sb3.append(", editNote=");
        sb3.append(this.f110584j);
        sb3.append(", imageLink=");
        sb3.append(this.f110585k);
        sb3.append(", pinEditListener=");
        sb3.append(this.f110586l);
        sb3.append(", presenterPinalytics=");
        sb3.append(this.f110587m);
        sb3.append(", userTags=");
        sb3.append(this.f110588n);
        sb3.append(", userTagsList=");
        return a.c.j(sb3, this.f110589o, ")");
    }
}
