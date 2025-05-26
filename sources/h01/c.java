package h01;

import java.util.Map;
import kotlin.collections.z0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f66420a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66421b;

    /* renamed from: c, reason: collision with root package name */
    public final int f66422c;

    /* renamed from: d, reason: collision with root package name */
    public final int f66423d;

    /* renamed from: e, reason: collision with root package name */
    public final String f66424e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f66425f;

    public c(int i13, int i14, int i15, String str, Map loggingData, int i16) {
        str = (i16 & 16) != 0 ? null : str;
        loggingData = (i16 & 32) != 0 ? z0.d() : loggingData;
        Intrinsics.checkNotNullParameter(loggingData, "loggingData");
        this.f66420a = false;
        this.f66421b = i13;
        this.f66422c = i14;
        this.f66423d = i15;
        this.f66424e = str;
        this.f66425f = loggingData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66420a == cVar.f66420a && this.f66421b == cVar.f66421b && this.f66422c == cVar.f66422c && this.f66423d == cVar.f66423d && Intrinsics.d(this.f66424e, cVar.f66424e) && Intrinsics.d(this.f66425f, cVar.f66425f);
    }

    public final int hashCode() {
        int b13 = ep.b.b(this.f66423d, ep.b.b(this.f66422c, ep.b.b(this.f66421b, Boolean.hashCode(this.f66420a) * 31, 31), 31), 31);
        String str = this.f66424e;
        return this.f66425f.hashCode() + ((b13 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "SurveyState(shouldShowRetakeButton=" + this.f66420a + ", happySurveyId=" + this.f66421b + ", neutralSurveyId=" + this.f66422c + ", sadSurveyId=" + this.f66423d + ", promptTitle=" + this.f66424e + ", loggingData=" + this.f66425f + ")";
    }
}
