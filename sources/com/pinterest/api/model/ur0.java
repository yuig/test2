package com.pinterest.api.model;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ur0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f42627a;

    /* renamed from: b, reason: collision with root package name */
    public final h32.g0 f42628b;

    /* renamed from: c, reason: collision with root package name */
    public final String f42629c;

    /* renamed from: d, reason: collision with root package name */
    public final String f42630d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f42631e;

    /* renamed from: f, reason: collision with root package name */
    public final List f42632f;

    /* renamed from: g, reason: collision with root package name */
    public final aa0 f42633g;

    /* renamed from: h, reason: collision with root package name */
    public final aa0 f42634h;

    public ur0(String str, @NotNull h32.g0 surveyType, String str2, String str3, Boolean bool, List<es0> list, aa0 aa0Var, aa0 aa0Var2) {
        Intrinsics.checkNotNullParameter(surveyType, "surveyType");
        this.f42627a = str;
        this.f42628b = surveyType;
        this.f42629c = str2;
        this.f42630d = str3;
        this.f42631e = bool;
        this.f42632f = list;
        this.f42633g = aa0Var;
        this.f42634h = aa0Var2;
    }

    public final List a() {
        return this.f42632f;
    }

    public final h32.g0 b() {
        return this.f42628b;
    }

    public final String c() {
        return this.f42627a;
    }

    public final boolean d(String str) {
        Object obj;
        List list = this.f42632f;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((es0) obj).f37337d, str)) {
                    break;
                }
            }
            es0 es0Var = (es0) obj;
            if (es0Var != null) {
                return Intrinsics.d(es0Var.f37341h, Boolean.TRUE);
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur0)) {
            return false;
        }
        ur0 ur0Var = (ur0) obj;
        return Intrinsics.d(this.f42627a, ur0Var.f42627a) && this.f42628b == ur0Var.f42628b && Intrinsics.d(this.f42629c, ur0Var.f42629c) && Intrinsics.d(this.f42630d, ur0Var.f42630d) && Intrinsics.d(this.f42631e, ur0Var.f42631e) && Intrinsics.d(this.f42632f, ur0Var.f42632f) && Intrinsics.d(this.f42633g, ur0Var.f42633g) && Intrinsics.d(this.f42634h, ur0Var.f42634h);
    }

    public final int hashCode() {
        String str = this.f42627a;
        int hashCode = (this.f42628b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.f42629c;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f42630d;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f42631e;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f42632f;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        aa0 aa0Var = this.f42633g;
        int hashCode6 = (hashCode5 + (aa0Var == null ? 0 : aa0Var.hashCode())) * 31;
        aa0 aa0Var2 = this.f42634h;
        return hashCode6 + (aa0Var2 != null ? aa0Var2.hashCode() : 0);
    }

    public final String toString() {
        return "SurveyData(uid=" + this.f42627a + ", surveyType=" + this.f42628b + ", title=" + this.f42629c + ", subtitle=" + this.f42630d + ", is_sponsored=" + this.f42631e + ", questions=" + this.f42632f + ", startPrompt=" + this.f42633g + ", finalPrompt=" + this.f42634h + ")";
    }
}
