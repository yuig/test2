package do1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import u50.i0;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f55665a;

    /* renamed from: b, reason: collision with root package name */
    public final m f55666b;

    /* renamed from: c, reason: collision with root package name */
    public final b f55667c;

    /* renamed from: d, reason: collision with root package name */
    public final n f55668d;

    /* renamed from: e, reason: collision with root package name */
    public final int f55669e;

    /* renamed from: f, reason: collision with root package name */
    public final int f55670f;

    /* renamed from: g, reason: collision with root package name */
    public final int f55671g;

    /* renamed from: h, reason: collision with root package name */
    public final u50.n f55672h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f55673i;

    public d(i0 text, m mVar, b bVar, n variant, int i13, int i14, int i15, u50.n nVar, boolean z13) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f55665a = text;
        this.f55666b = mVar;
        this.f55667c = bVar;
        this.f55668d = variant;
        this.f55669e = i13;
        this.f55670f = i14;
        this.f55671g = i15;
        this.f55672h = nVar;
        this.f55673i = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [do1.m] */
    public static d e(d dVar, i0 i0Var, j jVar, b bVar, int i13, boolean z13, int i14) {
        i0 text = (i14 & 1) != 0 ? dVar.f55665a : i0Var;
        j jVar2 = (i14 & 2) != 0 ? dVar.f55666b : jVar;
        b bVar2 = (i14 & 4) != 0 ? dVar.f55667c : bVar;
        n variant = dVar.f55668d;
        int i15 = dVar.f55669e;
        int i16 = (i14 & 32) != 0 ? dVar.f55670f : i13;
        int i17 = dVar.f55671g;
        u50.n nVar = dVar.f55672h;
        boolean z14 = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? dVar.f55673i : z13;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(variant, "variant");
        return new d(text, jVar2, bVar2, variant, i15, i16, i17, nVar, z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f55665a, dVar.f55665a) && Intrinsics.d(this.f55666b, dVar.f55666b) && Intrinsics.d(this.f55667c, dVar.f55667c) && this.f55668d == dVar.f55668d && this.f55669e == dVar.f55669e && this.f55670f == dVar.f55670f && this.f55671g == dVar.f55671g && Intrinsics.d(this.f55672h, dVar.f55672h) && this.f55673i == dVar.f55673i;
    }

    public final int hashCode() {
        int hashCode = this.f55665a.hashCode() * 31;
        m mVar = this.f55666b;
        int hashCode2 = (hashCode + (mVar == null ? 0 : mVar.hashCode())) * 31;
        b bVar = this.f55667c;
        int b13 = ep.b.b(this.f55671g, ep.b.b(this.f55670f, ep.b.b(this.f55669e, (this.f55668d.hashCode() + ((hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31), 31), 31);
        u50.n nVar = this.f55672h;
        return Boolean.hashCode(this.f55673i) + ((b13 + (nVar != null ? nVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DisplayState(text=");
        sb3.append(this.f55665a);
        sb3.append(", thumbnail=");
        sb3.append(this.f55666b);
        sb3.append(", actionButton=");
        sb3.append(this.f55667c);
        sb3.append(", variant=");
        sb3.append(this.f55668d);
        sb3.append(", id=");
        sb3.append(this.f55669e);
        sb3.append(", durationMS=");
        sb3.append(this.f55670f);
        sb3.append(", maxLines=");
        sb3.append(this.f55671g);
        sb3.append(", verticalMargin=");
        sb3.append(this.f55672h);
        sb3.append(", isBottomPosition=");
        return a.a.r(sb3, this.f55673i, ")");
    }

    public /* synthetic */ d(i0 i0Var, m mVar, b bVar, n nVar, int i13, int i14, int i15, u50.b0 b0Var, boolean z13, int i16) {
        this(i0Var, (i16 & 2) != 0 ? null : mVar, (i16 & 4) != 0 ? null : bVar, (i16 & 8) != 0 ? n.DEFAULT : nVar, (i16 & 16) != 0 ? Integer.MIN_VALUE : i13, (i16 & 32) != 0 ? 5000 : i14, (i16 & 64) != 0 ? 2 : i15, (i16 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : b0Var, (i16 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : z13);
    }
}
