package re1;

import com.pinterest.api.model.xi;
import h32.g0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import z32.d3;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final String f107614a;

    /* renamed from: b, reason: collision with root package name */
    public final xi f107615b;

    /* renamed from: c, reason: collision with root package name */
    public final ue1.l f107616c;

    /* renamed from: d, reason: collision with root package name */
    public final int f107617d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f107618e;

    /* renamed from: f, reason: collision with root package name */
    public final g0 f107619f;

    /* renamed from: g, reason: collision with root package name */
    public final d3 f107620g;

    /* renamed from: h, reason: collision with root package name */
    public final Long f107621h;

    /* renamed from: i, reason: collision with root package name */
    public final oe1.b f107622i;

    public n(String str, xi contentDisplay, ue1.l contentItemRepData, int i13, HashMap hashMap, g0 g0Var, d3 videoPlayMode, Long l13, oe1.b bVar) {
        Intrinsics.checkNotNullParameter(contentDisplay, "contentDisplay");
        Intrinsics.checkNotNullParameter(contentItemRepData, "contentItemRepData");
        Intrinsics.checkNotNullParameter(videoPlayMode, "videoPlayMode");
        this.f107614a = str;
        this.f107615b = contentDisplay;
        this.f107616c = contentItemRepData;
        this.f107617d = i13;
        this.f107618e = hashMap;
        this.f107619f = g0Var;
        this.f107620g = videoPlayMode;
        this.f107621h = l13;
        this.f107622i = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.d(this.f107614a, nVar.f107614a) && Intrinsics.d(this.f107615b, nVar.f107615b) && Intrinsics.d(this.f107616c, nVar.f107616c) && this.f107617d == nVar.f107617d && Intrinsics.d(this.f107618e, nVar.f107618e) && this.f107619f == nVar.f107619f && this.f107620g == nVar.f107620g && Intrinsics.d(this.f107621h, nVar.f107621h) && Intrinsics.d(this.f107622i, nVar.f107622i);
    }

    public final int hashCode() {
        String str = this.f107614a;
        int b13 = ep.b.b(this.f107617d, (this.f107616c.hashCode() + ((this.f107615b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31)) * 31, 31);
        HashMap hashMap = this.f107618e;
        int hashCode = (b13 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        g0 g0Var = this.f107619f;
        int hashCode2 = (this.f107620g.hashCode() + ((hashCode + (g0Var == null ? 0 : g0Var.hashCode())) * 31)) * 31;
        Long l13 = this.f107621h;
        int hashCode3 = (hashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        oe1.b bVar = this.f107622i;
        return hashCode3 + (bVar != null ? bVar.hashCode() : 0);
    }

    public final String toString() {
        return "GridSectionModel(storyId=" + this.f107614a + ", contentDisplay=" + this.f107615b + ", contentItemRepData=" + this.f107616c + ", layoutColumns=" + this.f107617d + ", auxData=" + this.f107618e + ", componentType=" + this.f107619f + ", videoPlayMode=" + this.f107620g + ", videoMaxPlaytimeMs=" + this.f107621h + ", loggingData=" + this.f107622i + ")";
    }
}
