package rg0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f107952a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f107953b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f107954c;

    /* renamed from: d, reason: collision with root package name */
    public final long f107955d;

    public a(Integer num, Integer num2, Integer num3, long j13) {
        this.f107952a = num;
        this.f107953b = num2;
        this.f107954c = num3;
        this.f107955d = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f107952a, aVar.f107952a) && Intrinsics.d(this.f107953b, aVar.f107953b) && Intrinsics.d(this.f107954c, aVar.f107954c) && this.f107955d == aVar.f107955d;
    }

    public final int hashCode() {
        Integer num = this.f107952a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f107953b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f107954c;
        return Long.hashCode(this.f107955d) + ((hashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "AnketSurveyData(survey_id=" + this.f107952a + ", survey_type=" + this.f107953b + ", survey_action_trigger=" + this.f107954c + ", survey_time_delay=" + this.f107955d + ")";
    }
}
