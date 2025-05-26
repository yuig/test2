package y80;

import com.pinterest.api.model.f30;
import com.pinterest.api.model.vi0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R*\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R.\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000f\u0010\rR.\u0010\u0014\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0013\u0010\rR.\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0015\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001`\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\r¨\u0006\u0019"}, d2 = {"Ly80/c;", "", "", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "id", "Ljava/util/ArrayList;", "Ly80/d;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "d", "()Ljava/util/ArrayList;", "steps", "c", "e", "title", "pinIds", "getShuffleItemImageIds", "shuffleItemImageIds", "Lcom/pinterest/api/model/vi0;", "f", "getShuffleItemImages", "shuffleItemImages", "composer_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("steps")
    @NotNull
    private final ArrayList<d> steps;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("title")
    private final String title;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("pin_ids")
    private final ArrayList<String> pinIds;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("shuffle_item_image_ids")
    private final ArrayList<String> shuffleItemImageIds;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("shuffle_item_images")
    private final ArrayList<vi0> shuffleItemImages;

    /* renamed from: g, reason: collision with root package name */
    public final f30 f138031g;

    /* renamed from: h, reason: collision with root package name */
    public final List f138032h;

    /* renamed from: i, reason: collision with root package name */
    public final List f138033i;

    /* renamed from: j, reason: collision with root package name */
    public final List f138034j;

    public c(String str, ArrayList steps, String str2, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, f30 f30Var, List list, List list2, List list3) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.id = str;
        this.steps = steps;
        this.title = str2;
        this.pinIds = arrayList;
        this.shuffleItemImageIds = arrayList2;
        this.shuffleItemImages = arrayList3;
        this.f138031g = f30Var;
        this.f138032h = list;
        this.f138033i = list2;
        this.f138034j = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    public static c a(c cVar, f30 f30Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, int i13) {
        String str = cVar.id;
        ArrayList<d> steps = cVar.steps;
        String str2 = cVar.title;
        ArrayList<String> arrayList4 = cVar.pinIds;
        ArrayList<String> arrayList5 = cVar.shuffleItemImageIds;
        ArrayList<vi0> arrayList6 = cVar.shuffleItemImages;
        f30 f30Var2 = (i13 & 64) != 0 ? cVar.f138031g : f30Var;
        List list = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? cVar.f138032h : arrayList;
        List list2 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? cVar.f138033i : arrayList2;
        ArrayList arrayList7 = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? cVar.f138034j : arrayList3;
        Intrinsics.checkNotNullParameter(steps, "steps");
        return new c(str, steps, str2, arrayList4, arrayList5, arrayList6, f30Var2, list, list2, arrayList7);
    }

    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final ArrayList getPinIds() {
        return this.pinIds;
    }

    /* renamed from: d, reason: from getter */
    public final ArrayList getSteps() {
        return this.steps;
    }

    /* renamed from: e, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.id, cVar.id) && Intrinsics.d(this.steps, cVar.steps) && Intrinsics.d(this.title, cVar.title) && Intrinsics.d(this.pinIds, cVar.pinIds) && Intrinsics.d(this.shuffleItemImageIds, cVar.shuffleItemImageIds) && Intrinsics.d(this.shuffleItemImages, cVar.shuffleItemImages) && Intrinsics.d(this.f138031g, cVar.f138031g) && Intrinsics.d(this.f138032h, cVar.f138032h) && Intrinsics.d(this.f138033i, cVar.f138033i) && Intrinsics.d(this.f138034j, cVar.f138034j);
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (this.steps.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList<String> arrayList = this.pinIds;
        int hashCode3 = (hashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList<String> arrayList2 = this.shuffleItemImageIds;
        int hashCode4 = (hashCode3 + (arrayList2 == null ? 0 : arrayList2.hashCode())) * 31;
        ArrayList<vi0> arrayList3 = this.shuffleItemImages;
        int hashCode5 = (hashCode4 + (arrayList3 == null ? 0 : arrayList3.hashCode())) * 31;
        f30 f30Var = this.f138031g;
        int hashCode6 = (hashCode5 + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
        List list = this.f138032h;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f138033i;
        int hashCode8 = (hashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f138034j;
        return hashCode8 + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        return "Section(id=" + this.id + ", steps=" + this.steps + ", title=" + this.title + ", pinIds=" + this.pinIds + ", shuffleItemImageIds=" + this.shuffleItemImageIds + ", shuffleItemImages=" + this.shuffleItemImages + ", videoPin=" + this.f138031g + ", cutoutImageUrls=" + this.f138032h + ", cutoutsWithoutMask=" + this.f138033i + ", cutoutsWithMask=" + this.f138034j + ")";
    }

    public c() {
        this(null, new ArrayList(), null, null, null, null, null, null, null, null);
    }
}
