package bc2;

import a.cb;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final String f22664a;

    /* renamed from: b, reason: collision with root package name */
    public final String f22665b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f22666c;

    /* renamed from: d, reason: collision with root package name */
    public final c f22667d;

    /* renamed from: e, reason: collision with root package name */
    public final String f22668e;

    /* renamed from: f, reason: collision with root package name */
    public final n f22669f;

    /* renamed from: g, reason: collision with root package name */
    public final j f22670g;

    public o(String trackKey, String url, Integer num, c cVar, String str) {
        Intrinsics.checkNotNullParameter(trackKey, "trackKey");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f22664a = trackKey;
        this.f22665b = url;
        this.f22666c = num;
        this.f22667d = cVar;
        this.f22668e = str;
        this.f22669f = StringsKt.E(trackKey, "_T1", false) ? n.T1 : StringsKt.E(trackKey, "_T2", false) ? n.T2 : StringsKt.E(trackKey, "_T3", false) ? n.T3 : StringsKt.E(trackKey, "_T4", false) ? n.T4 : StringsKt.E(trackKey, "_T5", false) ? n.T5 : null;
        this.f22670g = d7.b.V(url);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.d(this.f22664a, oVar.f22664a) && Intrinsics.d(this.f22665b, oVar.f22665b) && Intrinsics.d(this.f22666c, oVar.f22666c) && Intrinsics.d(this.f22667d, oVar.f22667d) && Intrinsics.d(this.f22668e, oVar.f22668e);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f22665b, this.f22664a.hashCode() * 31, 31);
        Integer num = this.f22666c;
        int hashCode = (d2 + (num == null ? 0 : num.hashCode())) * 31;
        c cVar = this.f22667d;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        String str = this.f22668e;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("VideoTrack(trackKey=");
        sb3.append(this.f22664a);
        sb3.append(", url=");
        sb3.append(this.f22665b);
        sb3.append(", bitrate=");
        sb3.append(this.f22666c);
        sb3.append(", dimensions=");
        sb3.append(this.f22667d);
        sb3.append(", prefetchedDashManifest=");
        return a.a.p(sb3, this.f22668e, ")");
    }
}
