package z71;

import dl1.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000e¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lz71/e;", "Ldl1/s;", "", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "id", "Lz71/i;", "b", "Lz71/i;", "c", "()Lz71/i;", "backgroundImage", "", "Ljava/util/List;", "g", "()Ljava/util/List;", "overlayItems", "<init>", "(Ljava/lang/String;Lz71/i;Ljava/util/List;)V", "visualSearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final /* data */ class e implements s {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("backgroundImage")
    private final i backgroundImage;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("overlayItems")
    @NotNull
    private final List<i> overlayItems;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@NotNull String id3, i iVar, @NotNull List<? extends i> overlayItems) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(overlayItems, "overlayItems");
        this.id = id3;
        this.backgroundImage = iVar;
        this.overlayItems = overlayItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static e a(e eVar, i iVar, ArrayList arrayList, int i13) {
        String id3 = eVar.id;
        if ((i13 & 2) != 0) {
            iVar = eVar.backgroundImage;
        }
        List overlayItems = arrayList;
        if ((i13 & 4) != 0) {
            overlayItems = eVar.overlayItems;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(overlayItems, "overlayItems");
        return new e(id3, iVar, overlayItems);
    }

    @Override // dl1.s
    /* renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: c, reason: from getter */
    public final i getBackgroundImage() {
        return this.backgroundImage;
    }

    public final String e() {
        return this.id;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(e.class, obj.getClass())) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.id, eVar.id) && Intrinsics.d(this.backgroundImage, eVar.backgroundImage);
    }

    /* renamed from: g, reason: from getter */
    public final List getOverlayItems() {
        return this.overlayItems;
    }

    public final e h(a81.d dVar) {
        i iVar = this.backgroundImage;
        return a(this, iVar != null ? iVar.b(dVar) : null, null, 5);
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        i iVar = this.backgroundImage;
        return this.overlayItems.hashCode() + ((hashCode + (iVar == null ? 0 : iVar.hashCode())) * 31);
    }

    public final e j(String overlayBlockId, a81.d dVar) {
        Intrinsics.checkNotNullParameter(overlayBlockId, "overlayBlockId");
        ArrayList H0 = CollectionsKt.H0(this.overlayItems);
        Iterator<i> it = this.overlayItems.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (Intrinsics.d(it.next().a().getId(), overlayBlockId)) {
                break;
            }
            i13++;
        }
        if (i13 != -1) {
            H0.set(i13, this.overlayItems.get(i13).b(dVar));
        }
        return a(this, null, H0, 3);
    }

    public final String toString() {
        String str = this.id;
        i iVar = this.backgroundImage;
        List<i> list = this.overlayItems;
        StringBuilder sb3 = new StringBuilder("CollageLocalPage(id=");
        sb3.append(str);
        sb3.append(", backgroundImage=");
        sb3.append(iVar);
        sb3.append(", overlayItems=");
        return a.c.j(sb3, list, ")");
    }

    public e(String str, i iVar, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, iVar, (i13 & 4) != 0 ? q0.f80391a : list);
    }
}
