package we1;

import kotlin.jvm.internal.Intrinsics;
import z32.d3;

/* loaded from: classes5.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f129650a;

    /* renamed from: b, reason: collision with root package name */
    public final ze0.a f129651b;

    /* renamed from: c, reason: collision with root package name */
    public final int f129652c;

    /* renamed from: d, reason: collision with root package name */
    public final int f129653d;

    /* renamed from: e, reason: collision with root package name */
    public final int f129654e;

    /* renamed from: f, reason: collision with root package name */
    public final ue1.o f129655f;

    /* renamed from: g, reason: collision with root package name */
    public final d3 f129656g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f129657h;

    /* renamed from: i, reason: collision with root package name */
    public final Boolean f129658i;

    /* renamed from: j, reason: collision with root package name */
    public final Float f129659j;

    /* renamed from: k, reason: collision with root package name */
    public final oe1.b f129660k;

    public v2(int i13, ze0.a userRepStyle, int i14, int i15, int i16, ue1.o itemPaddingSpec, d3 videoPlayMode, Long l13, Boolean bool, Float f13, oe1.b bVar) {
        Intrinsics.checkNotNullParameter(userRepStyle, "userRepStyle");
        Intrinsics.checkNotNullParameter(itemPaddingSpec, "itemPaddingSpec");
        Intrinsics.checkNotNullParameter(videoPlayMode, "videoPlayMode");
        this.f129650a = i13;
        this.f129651b = userRepStyle;
        this.f129652c = i14;
        this.f129653d = i15;
        this.f129654e = i16;
        this.f129655f = itemPaddingSpec;
        this.f129656g = videoPlayMode;
        this.f129657h = l13;
        this.f129658i = bool;
        this.f129659j = f13;
        this.f129660k = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v2)) {
            return false;
        }
        v2 v2Var = (v2) obj;
        return this.f129650a == v2Var.f129650a && this.f129651b == v2Var.f129651b && this.f129652c == v2Var.f129652c && this.f129653d == v2Var.f129653d && this.f129654e == v2Var.f129654e && Intrinsics.d(this.f129655f, v2Var.f129655f) && this.f129656g == v2Var.f129656g && Intrinsics.d(this.f129657h, v2Var.f129657h) && Intrinsics.d(this.f129658i, v2Var.f129658i) && Intrinsics.d(this.f129659j, v2Var.f129659j) && Intrinsics.d(this.f129660k, v2Var.f129660k);
    }

    public final int hashCode() {
        int hashCode = (this.f129656g.hashCode() + ((this.f129655f.hashCode() + ep.b.b(this.f129654e, ep.b.b(this.f129653d, ep.b.b(this.f129652c, (this.f129651b.hashCode() + (Integer.hashCode(this.f129650a) * 31)) * 31, 31), 31), 31)) * 31)) * 31;
        Long l13 = this.f129657h;
        int hashCode2 = (hashCode + (l13 == null ? 0 : l13.hashCode())) * 31;
        Boolean bool = this.f129658i;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f13 = this.f129659j;
        int hashCode4 = (hashCode3 + (f13 == null ? 0 : f13.hashCode())) * 31;
        oe1.b bVar = this.f129660k;
        return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalGridSectionParams(itemPadding=" + this.f129650a + ", userRepStyle=" + this.f129651b + ", itemRepWidth=" + this.f129652c + ", columns=" + this.f129653d + ", containerPadding=" + this.f129654e + ", itemPaddingSpec=" + this.f129655f + ", videoPlayMode=" + this.f129656g + ", videoMaxPlaytimeMs=" + this.f129657h + ", centerContent=" + this.f129658i + ", itemWidthHeightRatio=" + this.f129659j + ", loggingData=" + this.f129660k + ")";
    }
}
