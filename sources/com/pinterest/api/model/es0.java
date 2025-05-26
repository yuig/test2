package com.pinterest.api.model;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class es0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f37334a;

    /* renamed from: b, reason: collision with root package name */
    public final List f37335b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f37336c;

    /* renamed from: d, reason: collision with root package name */
    public final String f37337d;

    /* renamed from: e, reason: collision with root package name */
    public final String f37338e;

    /* renamed from: f, reason: collision with root package name */
    public final Double f37339f;

    /* renamed from: g, reason: collision with root package name */
    public final Double f37340g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f37341h;

    /* renamed from: i, reason: collision with root package name */
    public final String f37342i;

    /* renamed from: j, reason: collision with root package name */
    public final vh f37343j;

    /* renamed from: k, reason: collision with root package name */
    public final String f37344k;

    /* renamed from: l, reason: collision with root package name */
    public final String f37345l;

    public es0(List<gs0> list, List<tr0> list2, Boolean bool, String str, String str2, Double d2, Double d13, Boolean bool2, String str3, vh vhVar, String str4, String str5) {
        this.f37334a = list;
        this.f37335b = list2;
        this.f37336c = bool;
        this.f37337d = str;
        this.f37338e = str2;
        this.f37339f = d2;
        this.f37340g = d13;
        this.f37341h = bool2;
        this.f37342i = str3;
        this.f37343j = vhVar;
        this.f37344k = str4;
        this.f37345l = str5;
    }

    public final List a() {
        return this.f37334a;
    }

    public final List b() {
        return this.f37335b;
    }

    public final Boolean c() {
        return this.f37341h;
    }

    public final String d() {
        return this.f37337d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es0)) {
            return false;
        }
        es0 es0Var = (es0) obj;
        return Intrinsics.d(this.f37334a, es0Var.f37334a) && Intrinsics.d(this.f37335b, es0Var.f37335b) && Intrinsics.d(this.f37336c, es0Var.f37336c) && Intrinsics.d(this.f37337d, es0Var.f37337d) && Intrinsics.d(this.f37338e, es0Var.f37338e) && Intrinsics.d(this.f37339f, es0Var.f37339f) && Intrinsics.d(this.f37340g, es0Var.f37340g) && Intrinsics.d(this.f37341h, es0Var.f37341h) && Intrinsics.d(this.f37342i, es0Var.f37342i) && Intrinsics.d(this.f37343j, es0Var.f37343j) && Intrinsics.d(this.f37344k, es0Var.f37344k) && Intrinsics.d(this.f37345l, es0Var.f37345l);
    }

    public final int hashCode() {
        List list = this.f37334a;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f37335b;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.f37336c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f37337d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f37338e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d2 = this.f37339f;
        int hashCode6 = (hashCode5 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d13 = this.f37340g;
        int hashCode7 = (hashCode6 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Boolean bool2 = this.f37341h;
        int hashCode8 = (hashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f37342i;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        vh vhVar = this.f37343j;
        int hashCode10 = (hashCode9 + (vhVar == null ? 0 : vhVar.hashCode())) * 31;
        String str4 = this.f37344k;
        int hashCode11 = (hashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f37345l;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurveyQuestionData(answers=");
        sb3.append(this.f37334a);
        sb3.append(", conditionals=");
        sb3.append(this.f37335b);
        sb3.append(", endSurvey=");
        sb3.append(this.f37336c);
        sb3.append(", uid=");
        sb3.append(this.f37337d);
        sb3.append(", layout=");
        sb3.append(this.f37338e);
        sb3.append(", maxNumAnswers=");
        sb3.append(this.f37339f);
        sb3.append(", minNumAnswers=");
        sb3.append(this.f37340g);
        sb3.append(", required=");
        sb3.append(this.f37341h);
        sb3.append(", skipTo=");
        sb3.append(this.f37342i);
        sb3.append(", story=");
        sb3.append(this.f37343j);
        sb3.append(", text=");
        sb3.append(this.f37344k);
        sb3.append(", backgroundColor=");
        return a.a.p(sb3, this.f37345l, ")");
    }
}
