package rg0;

/* loaded from: classes5.dex */
public final class d extends p0 {

    /* renamed from: f, reason: collision with root package name */
    public final vd0.c f107974f;

    /* renamed from: g, reason: collision with root package name */
    public final Boolean f107975g;

    /* renamed from: h, reason: collision with root package name */
    public final Boolean f107976h;

    /* renamed from: i, reason: collision with root package name */
    public final vd0.c f107977i;

    /* renamed from: j, reason: collision with root package name */
    public final String f107978j;

    public d(vd0.c cVar) {
        super(null);
        this.f107974f = cVar.m("survey_data");
        cVar.n(1000L, "delay");
        Boolean bool = Boolean.FALSE;
        this.f107975g = cVar.h("is_test_request", bool);
        this.f107976h = cVar.h("display_prompt", bool);
        cVar.j(0, "survey_type");
        this.f107978j = cVar.o("response_url", "");
        this.f107977i = cVar.m("survey_invite");
    }

    @Override // rg0.p0
    public final String c() {
        return null;
    }

    @Override // rg0.p0
    public final String e() {
        return null;
    }
}
