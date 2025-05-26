package zy;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.c1;
import h32.f1;
import h32.w0;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final h32.i0 f143048a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f143049b;

    /* renamed from: c, reason: collision with root package name */
    public final String f143050c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f143051d;

    /* renamed from: e, reason: collision with root package name */
    public final c1 f143052e;

    /* renamed from: f, reason: collision with root package name */
    public final w0 f143053f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f143054g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f143055h;

    public a(h32.i0 context, f1 eventType, String str, HashMap hashMap, c1 c1Var, w0 w0Var, boolean z13, boolean z14, int i13) {
        str = (i13 & 4) != 0 ? null : str;
        hashMap = (i13 & 8) != 0 ? null : hashMap;
        c1Var = (i13 & 16) != 0 ? null : c1Var;
        w0Var = (i13 & 32) != 0 ? null : w0Var;
        z13 = (i13 & 64) != 0 ? false : z13;
        z14 = (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? true : z14;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f143048a = context;
        this.f143049b = eventType;
        this.f143050c = str;
        this.f143051d = hashMap;
        this.f143052e = c1Var;
        this.f143053f = w0Var;
        this.f143054g = z13;
        this.f143055h = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f143048a, aVar.f143048a) && this.f143049b == aVar.f143049b && Intrinsics.d(this.f143050c, aVar.f143050c) && Intrinsics.d(this.f143051d, aVar.f143051d) && Intrinsics.d(this.f143052e, aVar.f143052e) && Intrinsics.d(this.f143053f, aVar.f143053f) && this.f143054g == aVar.f143054g && this.f143055h == aVar.f143055h;
    }

    public final int hashCode() {
        int hashCode = (this.f143049b.hashCode() + (this.f143048a.hashCode() * 31)) * 31;
        String str = this.f143050c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        HashMap hashMap = this.f143051d;
        int hashCode3 = (hashCode2 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        c1 c1Var = this.f143052e;
        int hashCode4 = (hashCode3 + (c1Var == null ? 0 : c1Var.hashCode())) * 31;
        w0 w0Var = this.f143053f;
        return Boolean.hashCode(this.f143055h) + ep.b.e(this.f143054g, (hashCode4 + (w0Var != null ? w0Var.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("EventParams(context=");
        sb3.append(this.f143048a);
        sb3.append(", eventType=");
        sb3.append(this.f143049b);
        sb3.append(", id=");
        sb3.append(this.f143050c);
        sb3.append(", auxData=");
        sb3.append(this.f143051d);
        sb3.append(", eventData=");
        sb3.append(this.f143052e);
        sb3.append(", dataBuilderSeed=");
        sb3.append(this.f143053f);
        sb3.append(", overrideTrackingParam=");
        sb3.append(this.f143054g);
        sb3.append(", shouldAutomaticallyUpdateTrackingParam=");
        return a.a.r(sb3, this.f143055h, ")");
    }
}
