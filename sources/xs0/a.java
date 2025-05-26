package xs0;

import a.cb;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final String f135766a;

    /* renamed from: b, reason: collision with root package name */
    public final String f135767b;

    /* renamed from: c, reason: collision with root package name */
    public final String f135768c;

    /* renamed from: d, reason: collision with root package name */
    public final Boolean f135769d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f135770e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f135771f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f135772g;

    /* renamed from: h, reason: collision with root package name */
    public final int f135773h;

    /* renamed from: i, reason: collision with root package name */
    public final List f135774i;

    /* renamed from: j, reason: collision with root package name */
    public final int f135775j;

    /* renamed from: k, reason: collision with root package name */
    public final Date f135776k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f135777l;

    /* renamed from: m, reason: collision with root package name */
    public final int f135778m;

    public a(String boardId, String str, String boardName, Boolean bool, Boolean bool2, boolean z13, boolean z14, int i13, List list, int i14, Date date, boolean z15, int i15) {
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        this.f135766a = boardId;
        this.f135767b = str;
        this.f135768c = boardName;
        this.f135769d = bool;
        this.f135770e = bool2;
        this.f135771f = z13;
        this.f135772g = z14;
        this.f135773h = i13;
        this.f135774i = list;
        this.f135775j = i14;
        this.f135776k = date;
        this.f135777l = z15;
        this.f135778m = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f135766a, aVar.f135766a) && Intrinsics.d(this.f135767b, aVar.f135767b) && Intrinsics.d(this.f135768c, aVar.f135768c) && Intrinsics.d(this.f135769d, aVar.f135769d) && Intrinsics.d(this.f135770e, aVar.f135770e) && this.f135771f == aVar.f135771f && this.f135772g == aVar.f135772g && this.f135773h == aVar.f135773h && Intrinsics.d(this.f135774i, aVar.f135774i) && this.f135775j == aVar.f135775j && Intrinsics.d(this.f135776k, aVar.f135776k) && this.f135777l == aVar.f135777l && this.f135778m == aVar.f135778m;
    }

    public final int hashCode() {
        int hashCode = this.f135766a.hashCode() * 31;
        String str = this.f135767b;
        int d2 = cb.d(this.f135768c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f135769d;
        int hashCode2 = (d2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f135770e;
        int b13 = ep.b.b(this.f135773h, ep.b.e(this.f135772g, ep.b.e(this.f135771f, (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31), 31), 31);
        List list = this.f135774i;
        int b14 = ep.b.b(this.f135775j, (b13 + (list == null ? 0 : list.hashCode())) * 31, 31);
        Date date = this.f135776k;
        return Integer.hashCode(this.f135778m) + ep.b.e(this.f135777l, (b14 + (date != null ? date.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SbaHfBoardToggleSettingCellDisplayState(boardId=");
        sb3.append(this.f135766a);
        sb3.append(", boardImageThumbnailUrl=");
        sb3.append(this.f135767b);
        sb3.append(", boardName=");
        sb3.append(this.f135768c);
        sb3.append(", boardIsSecret=");
        sb3.append(this.f135769d);
        sb3.append(", boardIsCollaborative=");
        sb3.append(this.f135770e);
        sb3.append(", boardIsSelected=");
        sb3.append(this.f135771f);
        sb3.append(", useToggleView=");
        sb3.append(this.f135772g);
        sb3.append(", pinCount=");
        sb3.append(this.f135773h);
        sb3.append(", collaboratorUsers=");
        sb3.append(this.f135774i);
        sb3.append(", sectionsCount=");
        sb3.append(this.f135775j);
        sb3.append(", lastModified=");
        sb3.append(this.f135776k);
        sb3.append(", isToggleEnabled=");
        sb3.append(this.f135777l);
        sb3.append(", boardCollaboratorCount=");
        return a.a.n(sb3, this.f135778m, ")");
    }
}
