package o71;

import com.pinterest.feature.search.typeahead.view.SearchTypeaheadHashtagCell;
import com.pinterest.gestalt.text.GestaltText;
import kotlin.jvm.internal.Intrinsics;
import m60.w0;

/* loaded from: classes5.dex */
public final class o extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f93356a;

    /* renamed from: b, reason: collision with root package name */
    public final r41.k f93357b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f93358c;

    /* renamed from: d, reason: collision with root package name */
    public br.d f93359d;

    /* renamed from: e, reason: collision with root package name */
    public int f93360e;

    /* renamed from: f, reason: collision with root package name */
    public String f93361f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(uk1.d presenterPinalytics, uj2.q networkStateStream, l0 typeaheadLogging, r41.k profileNavigator, m60.w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f93356a = typeaheadLogging;
        this.f93357b = profileNavigator;
        this.f93358c = eventManager;
        this.f93360e = -1;
        this.f93361f = "";
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.e view = (k71.e) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }

    public final void q3() {
        if (isBound()) {
            br.d dVar = this.f93359d;
            if ((dVar != null ? dVar.f23707e : null) == br.c.PIN && dVar != null) {
                String hashtag = dVar.f23704b;
                if (hashtag == null) {
                    hashtag = "";
                }
                SearchTypeaheadHashtagCell searchTypeaheadHashtagCell = (SearchTypeaheadHashtagCell) ((k71.e) getView());
                searchTypeaheadHashtagCell.getClass();
                Intrinsics.checkNotNullParameter(hashtag, "title");
                Object value = searchTypeaheadHashtagCell.f47851a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                pk.a0.p((GestaltText) value, hashtag);
                k71.e eVar = (k71.e) getView();
                int i13 = dVar.f23715m;
                Object value2 = ((SearchTypeaheadHashtagCell) eVar).f47852b.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                pk.a0.q((GestaltText) value2, bs1.c.i2(w0.plural_pins_string, i13, qb0.j.b(i13)));
                SearchTypeaheadHashtagCell searchTypeaheadHashtagCell2 = (SearchTypeaheadHashtagCell) ((k71.e) getView());
                searchTypeaheadHashtagCell2.getClass();
                Intrinsics.checkNotNullParameter(this, "listener");
                searchTypeaheadHashtagCell2.f47853c = this;
                k71.e eVar2 = (k71.e) getView();
                int i14 = dVar.f23715m;
                SearchTypeaheadHashtagCell searchTypeaheadHashtagCell3 = (SearchTypeaheadHashtagCell) eVar2;
                searchTypeaheadHashtagCell3.getClass();
                Intrinsics.checkNotNullParameter(hashtag, "hashtag");
                searchTypeaheadHashtagCell3.setContentDescription(searchTypeaheadHashtagCell3.getResources().getString(k42.f.content_description_hashtag_typeahead, hashtag, qb0.j.a(qb0.j.b(i14))));
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.e view = (k71.e) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }
}
