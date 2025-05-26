package gj0;

import kotlin.jvm.internal.Intrinsics;
import u50.f0;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class c implements o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65188a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f65189b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f65190c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f65191d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f65192e;

    /* renamed from: f, reason: collision with root package name */
    public final om1.f f65193f;

    /* renamed from: g, reason: collision with root package name */
    public final b f65194g;

    /* renamed from: h, reason: collision with root package name */
    public final Float f65195h;

    public /* synthetic */ c(f0 f0Var, Integer num, Integer num2, om1.f fVar, b bVar, int i13) {
        this(true, (i13 & 2) != 0 ? h0.f120562a : f0Var, null, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2, (i13 & 32) != 0 ? null : fVar, (i13 & 64) != 0 ? b.f65185c : bVar, null);
    }

    public static c e(c cVar, Integer num, Integer num2, Integer num3, om1.f fVar, Float f13, int i13) {
        boolean z13 = cVar.f65188a;
        i0 title = cVar.f65189b;
        if ((i13 & 4) != 0) {
            num = cVar.f65190c;
        }
        Integer num4 = num;
        if ((i13 & 8) != 0) {
            num2 = cVar.f65191d;
        }
        Integer num5 = num2;
        if ((i13 & 16) != 0) {
            num3 = cVar.f65192e;
        }
        Integer num6 = num3;
        if ((i13 & 32) != 0) {
            fVar = cVar.f65193f;
        }
        b overflowAction = cVar.f65194g;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(overflowAction, "overflowAction");
        return new c(z13, title, num4, num5, num6, fVar, overflowAction, f13);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f65188a == cVar.f65188a && Intrinsics.d(this.f65189b, cVar.f65189b) && Intrinsics.d(this.f65190c, cVar.f65190c) && Intrinsics.d(this.f65191d, cVar.f65191d) && Intrinsics.d(this.f65192e, cVar.f65192e) && this.f65193f == cVar.f65193f && Intrinsics.d(this.f65194g, cVar.f65194g) && Intrinsics.d(this.f65195h, cVar.f65195h);
    }

    public final int hashCode() {
        int d2 = ep.b.d(this.f65189b, Boolean.hashCode(this.f65188a) * 31, 31);
        Integer num = this.f65190c;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f65191d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f65192e;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        om1.f fVar = this.f65193f;
        int hashCode4 = (this.f65194g.hashCode() + ((hashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31)) * 31;
        Float f13 = this.f65195h;
        return hashCode4 + (f13 != null ? f13.hashCode() : 0);
    }

    public final String toString() {
        return "BoardToolbarDisplayState(visible=" + this.f65188a + ", title=" + this.f65189b + ", backgroundColorRes=" + this.f65190c + ", backgroundColorFromTheme=" + this.f65191d + ", navigationIconColor=" + this.f65192e + ", actionItemsStyle=" + this.f65193f + ", overflowAction=" + this.f65194g + ", animateTitlesAlpha=" + this.f65195h + ")";
    }

    public c(boolean z13, i0 title, Integer num, Integer num2, Integer num3, om1.f fVar, b overflowAction, Float f13) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(overflowAction, "overflowAction");
        this.f65188a = z13;
        this.f65189b = title;
        this.f65190c = num;
        this.f65191d = num2;
        this.f65192e = num3;
        this.f65193f = fVar;
        this.f65194g = overflowAction;
        this.f65195h = f13;
    }
}
