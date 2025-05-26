package uy0;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import tb.f;

/* loaded from: classes5.dex */
public final class b extends f {

    /* renamed from: h, reason: collision with root package name */
    public final String f123265h;

    /* renamed from: i, reason: collision with root package name */
    public final String f123266i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f123267j;

    /* renamed from: k, reason: collision with root package name */
    public final String f123268k;

    /* renamed from: l, reason: collision with root package name */
    public final a f123269l;

    /* renamed from: m, reason: collision with root package name */
    public final String f123270m;

    public b(p40.b interest) {
        String n13;
        String n14;
        Intrinsics.checkNotNullParameter(interest, "interest");
        this.f123265h = "#E9E9E9";
        this.f123270m = "";
        this.f123270m = interest.a();
        p40.a d2 = interest.d();
        String str = null;
        String a13 = d2 != null ? d2.a() : null;
        this.f123266i = a13 == null ? "" : a13;
        Intrinsics.checkNotNullParameter(interest, "<this>");
        String e13 = interest.e();
        if (e13 != null && (n13 = z.n(e13, "null", "")) != null && (n14 = z.n(n13, "[", "")) != null) {
            str = z.n(n14, "]", "");
        }
        this.f123265h = str != null ? str : "";
        this.f123268k = interest.getName();
        Boolean c13 = interest.c();
        this.f123267j = c13 != null ? c13.booleanValue() : false;
        this.f123269l = a.INTEREST;
    }
}
