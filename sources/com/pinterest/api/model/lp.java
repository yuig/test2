package com.pinterest.api.model;

import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public class lp {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    @om.b("question_comment_id")
    private String f39850a;

    /* renamed from: b, reason: collision with root package name */
    @om.b("question_text")
    private String f39851b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f39852c;

    public /* synthetic */ lp(String str, String str2, boolean[] zArr, int i13) {
        this(str, str2, zArr);
    }

    public final String c() {
        return this.f39850a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        lp lpVar = (lp) obj;
        return Objects.equals(this.f39850a, lpVar.f39850a) && Objects.equals(this.f39851b, lpVar.f39851b);
    }

    public final int hashCode() {
        return Objects.hash(this.f39850a, this.f39851b);
    }

    public lp() {
        this.f39852c = new boolean[2];
    }

    private lp(@NonNull String str, String str2, boolean[] zArr) {
        this.f39850a = str;
        this.f39851b = str2;
        this.f39852c = zArr;
    }
}
