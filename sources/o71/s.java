package o71;

import android.net.Uri;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.gestalt.avatar.GestaltAvatar;
import com.pinterest.gestalt.text.GestaltText;
import h32.n2;
import kotlin.jvm.internal.Intrinsics;
import rq.t4;

/* loaded from: classes5.dex */
public final class s extends yk1.c {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f93367a;

    /* renamed from: b, reason: collision with root package name */
    public final r41.k f93368b;

    /* renamed from: c, reason: collision with root package name */
    public final m60.w f93369c;

    /* renamed from: d, reason: collision with root package name */
    public br.d f93370d;

    /* renamed from: e, reason: collision with root package name */
    public n2 f93371e;

    /* renamed from: f, reason: collision with root package name */
    public int f93372f;

    /* renamed from: g, reason: collision with root package name */
    public String f93373g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f93374h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(uk1.d presenterPinalytics, uj2.q networkStateStream, l0 typeaheadLogging, r41.k profileNavigator, m60.w eventManager) {
        super(presenterPinalytics, networkStateStream);
        Intrinsics.checkNotNullParameter(presenterPinalytics, "presenterPinalytics");
        Intrinsics.checkNotNullParameter(networkStateStream, "networkStateStream");
        Intrinsics.checkNotNullParameter(typeaheadLogging, "typeaheadLogging");
        Intrinsics.checkNotNullParameter(profileNavigator, "profileNavigator");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        this.f93367a = typeaheadLogging;
        this.f93368b = profileNavigator;
        this.f93369c = eventManager;
        this.f93372f = -1;
        this.f93373g = "";
    }

    @Override // yk1.p, yk1.b
    /* renamed from: onBind */
    public final void r3(yk1.n nVar) {
        k71.h view = (k71.h) nVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }

    public final void q3() {
        if (isBound()) {
            br.d dVar = this.f93370d;
            if ((dVar != null ? dVar.f23707e : null) == br.c.PINNER && dVar != null) {
                String name = dVar.f23704b;
                if (name == null) {
                    name = "";
                }
                String str = dVar.f23706d;
                String username = str != null ? str : "";
                String str2 = dVar.f23708f;
                int i13 = dVar.f23725w;
                Uri.parse(str2);
                if (str2 != null) {
                    Uri parse = Uri.parse(str2);
                    k71.h hVar = (k71.h) getView();
                    String url = parse.toString();
                    Intrinsics.checkNotNullExpressionValue(url, "toString(...)");
                    SearchTypeaheadPeopleCell searchTypeaheadPeopleCell = (SearchTypeaheadPeopleCell) hVar;
                    searchTypeaheadPeopleCell.getClass();
                    Intrinsics.checkNotNullParameter(url, "url");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Object value = searchTypeaheadPeopleCell.f47865a.getValue();
                    Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                    ((GestaltAvatar) value).H2(new fv0.g(url, i13, 1, name));
                }
                SearchTypeaheadPeopleCell searchTypeaheadPeopleCell2 = (SearchTypeaheadPeopleCell) ((k71.h) getView());
                searchTypeaheadPeopleCell2.getClass();
                Intrinsics.checkNotNullParameter(name, "title");
                Object value2 = searchTypeaheadPeopleCell2.f47866b.getValue();
                Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                pk.a0.p((GestaltText) value2, name);
                boolean z13 = dVar.f23714l;
                Object value3 = ((SearchTypeaheadPeopleCell) ((k71.h) getView())).f47866b.getValue();
                Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                ((GestaltText) value3).i(new i31.a(z13, 23));
                if (!z13) {
                    k71.h hVar2 = (k71.h) getView();
                    boolean z14 = dVar.f23713k;
                    Object value4 = ((SearchTypeaheadPeopleCell) hVar2).f47866b.getValue();
                    Intrinsics.checkNotNullExpressionValue(value4, "getValue(...)");
                    ((GestaltText) value4).i(new i31.a(z14, 22));
                }
                k71.h hVar3 = (k71.h) getView();
                boolean z15 = dVar.f23728z;
                SearchTypeaheadPeopleCell searchTypeaheadPeopleCell3 = (SearchTypeaheadPeopleCell) hVar3;
                searchTypeaheadPeopleCell3.getClass();
                Intrinsics.checkNotNullParameter(username, "text");
                Object value5 = searchTypeaheadPeopleCell3.f47867c.getValue();
                Intrinsics.checkNotNullExpressionValue(value5, "getValue(...)");
                ((GestaltText) value5).i(new t4(z15, username, 25));
                SearchTypeaheadPeopleCell searchTypeaheadPeopleCell4 = (SearchTypeaheadPeopleCell) ((k71.h) getView());
                searchTypeaheadPeopleCell4.getClass();
                Intrinsics.checkNotNullParameter(this, "listener");
                searchTypeaheadPeopleCell4.f47869e = this;
                SearchTypeaheadPeopleCell searchTypeaheadPeopleCell5 = (SearchTypeaheadPeopleCell) ((k71.h) getView());
                searchTypeaheadPeopleCell5.getClass();
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(username, "username");
                searchTypeaheadPeopleCell5.setContentDescription(searchTypeaheadPeopleCell5.getResources().getString(k42.f.content_description_user_typeahead, name, username));
                ((SearchTypeaheadPeopleCell) ((k71.h) getView())).f47870f = this.f93374h;
            }
        }
    }

    @Override // yk1.p
    /* renamed from: onBind */
    public final void r3(yk1.r rVar) {
        k71.h view = (k71.h) rVar;
        Intrinsics.checkNotNullParameter(view, "view");
        super.r3((yk1.r) view);
        q3();
    }
}
