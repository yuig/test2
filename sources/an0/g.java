package an0;

import a.cb;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a */
    public final String f15653a;

    /* renamed from: b */
    public final int f15654b;

    /* renamed from: c */
    public final int f15655c;

    /* renamed from: d */
    public final int f15656d;

    /* renamed from: e */
    public final int f15657e;

    /* renamed from: f */
    public final f f15658f;

    /* renamed from: g */
    public final String f15659g;

    /* renamed from: h */
    public final String f15660h;

    /* renamed from: i */
    public final int f15661i;

    /* renamed from: j */
    public final int f15662j;

    /* renamed from: k */
    public final List f15663k;

    /* renamed from: l */
    public final List f15664l;

    public g(String templateId, int i13, int i14, int i15, int i16, f fVar, String boardName, String userName, int i17, int i18, ArrayList shuffleItems, ArrayList items) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(boardName, "boardName");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(shuffleItems, "shuffleItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f15653a = templateId;
        this.f15654b = i13;
        this.f15655c = i14;
        this.f15656d = i15;
        this.f15657e = i16;
        this.f15658f = fVar;
        this.f15659g = boardName;
        this.f15660h = userName;
        this.f15661i = i17;
        this.f15662j = i18;
        this.f15663k = shuffleItems;
        this.f15664l = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f15653a, gVar.f15653a) && this.f15654b == gVar.f15654b && this.f15655c == gVar.f15655c && this.f15656d == gVar.f15656d && this.f15657e == gVar.f15657e && this.f15658f == gVar.f15658f && Intrinsics.d(this.f15659g, gVar.f15659g) && Intrinsics.d(this.f15660h, gVar.f15660h) && this.f15661i == gVar.f15661i && this.f15662j == gVar.f15662j && Intrinsics.d(this.f15663k, gVar.f15663k) && Intrinsics.d(this.f15664l, gVar.f15664l);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f15657e, ep.b.b(this.f15656d, ep.b.b(this.f15655c, ep.b.b(this.f15654b, this.f15653a.hashCode() * 31, 31), 31), 31), 31);
        f fVar = this.f15658f;
        return this.f15664l.hashCode() + ep.b.c(this.f15663k, ep.b.b(this.f15662j, ep.b.b(this.f15661i, cb.d(this.f15660h, cb.d(this.f15659g, (b13 + (fVar == null ? 0 : fVar.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardPreviewConfig(templateId=");
        sb3.append(this.f15653a);
        sb3.append(", templateWidth=");
        sb3.append(this.f15654b);
        sb3.append(", templateHeight=");
        sb3.append(this.f15655c);
        sb3.append(", sceneWidth=");
        sb3.append(this.f15656d);
        sb3.append(", sceneHeight=");
        sb3.append(this.f15657e);
        sb3.append(", watermarkType=");
        sb3.append(this.f15658f);
        sb3.append(", boardName=");
        sb3.append(this.f15659g);
        sb3.append(", userName=");
        sb3.append(this.f15660h);
        sb3.append(", fps=");
        sb3.append(this.f15661i);
        sb3.append(", framesCount=");
        sb3.append(this.f15662j);
        sb3.append(", shuffleItems=");
        sb3.append(this.f15663k);
        sb3.append(", items=");
        return a.c.j(sb3, this.f15664l, ")");
    }
}
