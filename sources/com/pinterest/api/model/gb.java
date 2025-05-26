package com.pinterest.api.model;

/* loaded from: classes3.dex */
public final class gb implements dl1.s {

    /* renamed from: a, reason: collision with root package name */
    public String f38015a;

    /* renamed from: b, reason: collision with root package name */
    public String f38016b;

    /* renamed from: c, reason: collision with root package name */
    public String f38017c;

    /* renamed from: d, reason: collision with root package name */
    public ih f38018d;

    public final boolean a() {
        String str = this.f38017c;
        str.getClass();
        switch (str) {
            case "text_separator":
            case "action_separator":
            case "trending_content_separator":
            case "date_separator":
            case "description_separator":
                return true;
            default:
                return false;
        }
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getF39332b() {
        return this.f38016b;
    }

    public final void c(ih ihVar) {
        this.f38018d = ihVar;
    }

    public final void e(String str) {
        this.f38016b = str;
    }

    public final void g(String str) {
        this.f38017c = str;
    }

    public final void h(String str) {
        this.f38015a = str;
    }
}
