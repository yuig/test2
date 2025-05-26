package w41;

/* loaded from: classes5.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final l f127981a = new l(nz1.b.spool_illustration, nz1.f.profile_pins_empty_state_title_filters, nz1.f.profile_pins_empty_state_message_filters, 0, null);

    /* renamed from: b, reason: collision with root package name */
    public static final l f127982b;

    /* renamed from: c, reason: collision with root package name */
    public static final l f127983c;

    /* renamed from: d, reason: collision with root package name */
    public static final l f127984d;

    /* renamed from: e, reason: collision with root package name */
    public static final l f127985e;

    /* renamed from: f, reason: collision with root package name */
    public static final l f127986f;

    static {
        tm1.d dVar = tm1.d.CATERPILLAR;
        g92.d dVar2 = g92.d.CALICO;
        tm1.b bVar = tm1.b.SPOT;
        tm1.a aVar = tm1.a.RATIO_1_1;
        Integer drawableRes = dVar.drawableRes(dVar2, bVar, aVar);
        f127982b = new l(drawableRes != null ? drawableRes.intValue() : nz1.b.spool_illustration, nz1.f.profile_pins_empty_state_title_filters_calico, nz1.f.profile_pins_empty_state_message_filters_calico, 0, null);
        f127983c = new l(nz1.b.palette_illustration, nz1.f.profile_pins_empty_state_title_filter_created_by_you, nz1.f.profile_pins_empty_state_message_filter_created_by_you, nz1.f.profile_pins_empty_state_cta_label_filter_created_by_you, new o());
        Integer drawableRes2 = tm1.d.PALETTE.drawableRes(dVar2, bVar, aVar);
        f127984d = new l(drawableRes2 != null ? drawableRes2.intValue() : nz1.b.palette_illustration, nz1.f.profile_pins_empty_state_title_filter_created_by_you_calico, nz1.f.profile_pins_empty_state_message_filter_created_by_you_calico, nz1.f.profile_pins_empty_state_cta_label_filter_created_by_you, new o());
        f127985e = new l(oz1.a.favorites_illustration, oz1.e.empty_state_title_filter_favorites, oz1.e.empty_state_message_filter_favorites, 0, null);
        Integer drawableRes3 = tm1.d.FAVORITE.drawableRes(dVar2, bVar, aVar);
        f127986f = new l(drawableRes3 != null ? drawableRes3.intValue() : oz1.a.favorites_illustration, oz1.e.empty_state_title_filter_favorites_calico, oz1.e.empty_state_message_filter_favorites_calico, 0, null);
    }
}
