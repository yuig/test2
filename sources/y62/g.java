package y62;

import java.util.List;
import kg.q;
import kotlin.jvm.internal.Intrinsics;
import r72.i1;
import r72.j1;
import u62.u;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final u f137934a;

    /* renamed from: b, reason: collision with root package name */
    public final q f137935b;

    /* renamed from: c, reason: collision with root package name */
    public final f f137936c;

    /* renamed from: d, reason: collision with root package name */
    public final j1 f137937d;

    /* renamed from: e, reason: collision with root package name */
    public final String f137938e;

    /* renamed from: f, reason: collision with root package name */
    public final i1 f137939f;

    /* renamed from: g, reason: collision with root package name */
    public final List f137940g;

    public g(u maskData, q message, f segmentationState, j1 cropRect) {
        Intrinsics.checkNotNullParameter(maskData, "maskData");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(segmentationState, "segmentationState");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        this.f137934a = maskData;
        this.f137935b = message;
        this.f137936c = segmentationState;
        this.f137937d = cropRect;
        String str = maskData.f120898a;
        this.f137938e = str == null ? "" : str;
        i1 i1Var = maskData.f120899b;
        this.f137939f = i1Var == null ? i1.f106497c : i1Var;
        this.f137940g = maskData.f120900c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [kg.q] */
    public static g a(g gVar, u maskData, s62.f fVar, f segmentationState, j1 cropRect, int i13) {
        if ((i13 & 1) != 0) {
            maskData = gVar.f137934a;
        }
        s62.f message = fVar;
        if ((i13 & 2) != 0) {
            message = gVar.f137935b;
        }
        if ((i13 & 4) != 0) {
            segmentationState = gVar.f137936c;
        }
        if ((i13 & 8) != 0) {
            cropRect = gVar.f137937d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(maskData, "maskData");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(segmentationState, "segmentationState");
        Intrinsics.checkNotNullParameter(cropRect, "cropRect");
        return new g(maskData, message, segmentationState, cropRect);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f137934a, gVar.f137934a) && Intrinsics.d(this.f137935b, gVar.f137935b) && this.f137936c == gVar.f137936c && Intrinsics.d(this.f137937d, gVar.f137937d);
    }

    public final int hashCode() {
        return this.f137937d.hashCode() + ((this.f137936c.hashCode() + ((this.f137935b.hashCode() + (this.f137934a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SelectMaskModel(maskData=" + this.f137934a + ", message=" + this.f137935b + ", segmentationState=" + this.f137936c + ", cropRect=" + this.f137937d + ")";
    }

    public /* synthetic */ g() {
        this(new u(null, null, null), s62.f.f111253e, f.IDLE, j1.f106504e);
    }
}
