package nt;

import a.cb;
import com.pinterest.api.model.n90;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s0 implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f92168a;

    /* renamed from: b, reason: collision with root package name */
    public final List f92169b;

    /* renamed from: c, reason: collision with root package name */
    public final n90 f92170c;

    /* renamed from: d, reason: collision with root package name */
    public final String f92171d;

    /* renamed from: e, reason: collision with root package name */
    public final List f92172e;

    public s0(LinkedHashMap questionAnswers, List countries, n90 n90Var, String uid, ArrayList answers) {
        Intrinsics.checkNotNullParameter(questionAnswers, "questionAnswers");
        Intrinsics.checkNotNullParameter(countries, "countries");
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f92168a = questionAnswers;
        this.f92169b = countries;
        this.f92170c = n90Var;
        this.f92171d = uid;
        this.f92172e = answers;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return Intrinsics.d(this.f92168a, s0Var.f92168a) && Intrinsics.d(this.f92169b, s0Var.f92169b) && Intrinsics.d(this.f92170c, s0Var.f92170c) && Intrinsics.d(this.f92171d, s0Var.f92171d) && Intrinsics.d(this.f92172e, s0Var.f92172e);
    }

    public final int hashCode() {
        int c13 = ep.b.c(this.f92169b, this.f92168a.hashCode() * 31, 31);
        n90 n90Var = this.f92170c;
        return this.f92172e.hashCode() + cb.d(this.f92171d, (c13 + (n90Var == null ? 0 : n90Var.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SubmitFormEffectRequest(questionAnswers=");
        sb3.append(this.f92168a);
        sb3.append(", countries=");
        sb3.append(this.f92169b);
        sb3.append(", promotedLeadForm=");
        sb3.append(this.f92170c);
        sb3.append(", uid=");
        sb3.append(this.f92171d);
        sb3.append(", answers=");
        return a.c.j(sb3, this.f92172e, ")");
    }
}
