package rq;

import com.pinterest.component.modal.BaseModalViewWrapper;
import com.pinterest.creatorHub.feature.hub.view.components.CreatorHubStatsRow;
import com.pinterest.feature.profile.header.UserProfileHeader;
import com.pinterest.feature.search.typeahead.view.SearchTypeaheadPeopleCell;
import com.pinterest.feature.sendshare.view.ContactSearchAndSelectModalView;
import com.pinterest.framework.screens.ScreenLocation;
import com.pinterest.gestalt.checkbox.GestaltCheckBox;
import com.pinterest.navigation.Navigation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class n3 implements gm1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f109401a;

    public /* synthetic */ n3(int i13) {
        this.f109401a = i13;
    }

    @Override // gm1.a
    public final void h3(gm1.c event) {
        switch (this.f109401a) {
            case 0:
                Intrinsics.checkNotNullParameter(event, "event");
                boolean z13 = event instanceof rn1.h;
                break;
            case 1:
                int i13 = ns.r.f91954c1;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 2:
                int i14 = BaseModalViewWrapper.f44748j;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 3:
                int i15 = BaseModalViewWrapper.f44748j;
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    jc0.r source = jc0.r.BTN_DONE;
                    Intrinsics.checkNotNullParameter(source, "source");
                    m60.u.f85943a.d(new jc0.s(true, jc0.a.None, source));
                    break;
                }
                break;
            case 4:
                int i16 = BaseModalViewWrapper.f44748j;
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    m60.u.f85943a.d(new jc0.s(true));
                    break;
                }
                break;
            case 5:
                int i17 = CreatorHubStatsRow.f44814h;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 6:
                int i18 = rn0.e.f108830v0;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 7:
                int i19 = b31.g.N0;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 8:
                int i23 = UserProfileHeader.f47517s;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 9:
                int i24 = SearchTypeaheadPeopleCell.f47864g;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 10:
                if (event instanceof om1.l) {
                    a.c.y(m60.u.f85943a);
                    break;
                }
                break;
            case 11:
                int i25 = ContactSearchAndSelectModalView.G;
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    a.c.y(m60.u.f85943a);
                    break;
                }
                break;
            case 12:
                int i26 = lc1.l.f82889f;
                Intrinsics.checkNotNullParameter(event, "it");
                m60.u.f85943a.d(Navigation.w1((ScreenLocation) com.pinterest.screens.j4.f51018d.getValue()));
                break;
            case 13:
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    h91.a.f68311d.f68312a.clear();
                    a.c.y(m60.u.f85943a);
                    break;
                }
                break;
            case 14:
                Intrinsics.checkNotNullParameter(event, "it");
                if (event instanceof om1.l) {
                    h91.a.f68311d.f68312a.clear();
                    a.c.y(m60.u.f85943a);
                    break;
                }
                break;
            case 15:
                em1.b bVar = GestaltCheckBox.f49354f;
                Intrinsics.checkNotNullParameter(event, "it");
                break;
            case 16:
                int i27 = fw1.i.f63057p;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.g) {
                    break;
                }
                break;
            default:
                int i28 = fw1.i.f63057p;
                Intrinsics.checkNotNullParameter(event, "event");
                if (event instanceof rn1.g) {
                    break;
                }
                break;
        }
    }
}
