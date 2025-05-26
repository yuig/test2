package ej0;

import kotlin.jvm.internal.Intrinsics;
import u50.h0;
import u50.i0;
import u50.o;

/* loaded from: classes5.dex */
public final class c implements o {

    /* renamed from: f, reason: collision with root package name */
    public static final c f59081f;

    /* renamed from: a, reason: collision with root package name */
    public final dl0.e f59082a;

    /* renamed from: b, reason: collision with root package name */
    public final i0 f59083b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f59084c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f59085d;

    /* renamed from: e, reason: collision with root package name */
    public final i0 f59086e;

    static {
        h0 h0Var = h0.f120562a;
        f59081f = new c(null, h0Var, false, false, h0Var);
    }

    public c(dl0.e eVar, i0 pinAndSectionInfo, boolean z13, boolean z14, i0 updateTime) {
        Intrinsics.checkNotNullParameter(pinAndSectionInfo, "pinAndSectionInfo");
        Intrinsics.checkNotNullParameter(updateTime, "updateTime");
        this.f59082a = eVar;
        this.f59083b = pinAndSectionInfo;
        this.f59084c = z13;
        this.f59085d = z14;
        this.f59086e = updateTime;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59082a == cVar.f59082a && Intrinsics.d(this.f59083b, cVar.f59083b) && this.f59084c == cVar.f59084c && this.f59085d == cVar.f59085d && Intrinsics.d(this.f59086e, cVar.f59086e);
    }

    public final int hashCode() {
        dl0.e eVar = this.f59082a;
        return this.f59086e.hashCode() + ep.b.e(this.f59085d, ep.b.e(this.f59084c, ep.b.d(this.f59083b, (eVar == null ? 0 : eVar.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardHeaderMetadataDisplayState(tag=");
        sb3.append(this.f59082a);
        sb3.append(", pinAndSectionInfo=");
        sb3.append(this.f59083b);
        sb3.append(", isArchived=");
        sb3.append(this.f59084c);
        sb3.append(", isSecret=");
        sb3.append(this.f59085d);
        sb3.append(", updateTime=");
        return jq.b.k(sb3, this.f59086e, ")");
    }
}
