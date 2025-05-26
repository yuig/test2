package r70;

import com.pinterest.api.model.wy0;
import h32.u0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import lh0.w;
import m60.f0;
import rm1.q;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final s70.b f106368a;

    /* renamed from: b, reason: collision with root package name */
    public final s70.e f106369b;

    /* renamed from: c, reason: collision with root package name */
    public final s70.a f106370c;

    /* renamed from: d, reason: collision with root package name */
    public final s70.d f106371d;

    /* renamed from: e, reason: collision with root package name */
    public final s70.c f106372e;

    /* renamed from: f, reason: collision with root package name */
    public final f0 f106373f;

    /* renamed from: g, reason: collision with root package name */
    public final b60.b f106374g;

    /* renamed from: h, reason: collision with root package name */
    public final w f106375h;

    /* renamed from: i, reason: collision with root package name */
    public final e f106376i;

    /* renamed from: j, reason: collision with root package name */
    public final e f106377j;

    public f(s70.b homeBottomNavModelFactory, s70.e searchBottomNavModelFactory, s70.a createBottomNavModelFactory, s70.d navigationBottomNavModelFactory, s70.c notificationsBottomNavForMinorsModelFactory, f0 profileBottomNavModelFactory, b60.b activeUserManager, w experiments) {
        Intrinsics.checkNotNullParameter(homeBottomNavModelFactory, "homeBottomNavModelFactory");
        Intrinsics.checkNotNullParameter(searchBottomNavModelFactory, "searchBottomNavModelFactory");
        Intrinsics.checkNotNullParameter(createBottomNavModelFactory, "createBottomNavModelFactory");
        Intrinsics.checkNotNullParameter(navigationBottomNavModelFactory, "navigationBottomNavModelFactory");
        Intrinsics.checkNotNullParameter(notificationsBottomNavForMinorsModelFactory, "notificationsBottomNavForMinorsModelFactory");
        Intrinsics.checkNotNullParameter(profileBottomNavModelFactory, "profileBottomNavModelFactory");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        this.f106368a = homeBottomNavModelFactory;
        this.f106369b = searchBottomNavModelFactory;
        this.f106370c = createBottomNavModelFactory;
        this.f106371d = navigationBottomNavModelFactory;
        this.f106372e = notificationsBottomNavForMinorsModelFactory;
        this.f106373f = profileBottomNavModelFactory;
        this.f106374g = activeUserManager;
        this.f106375h = experiments;
        this.f106376i = new e(this, 0);
        this.f106377j = new e(this, 1);
    }

    public final i a() {
        d navigation = d.f106360j;
        this.f106370c.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.CREATE;
        int i13 = t70.c.ic_plus_create_unselected_nonpds;
        int i14 = t70.c.ic_plus_create_nonpds;
        int i15 = t70.e.nav_bar_tab_label_create;
        int i16 = t70.d.menu_creation;
        u0 u0Var = u0.NAVIGATION_CREATE_BUTTON;
        int i17 = t70.e.nav_bar_tab_label_create_tab;
        q qVar = q.ADD;
        return new i(aVar, i13, i14, u0Var, i16, navigation, i15, i17, qVar, qVar);
    }

    public final ArrayList b(boolean z13) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(c());
        arrayList.add(g());
        arrayList.add(a());
        wy0 f13 = ((b60.d) this.f106374g).f();
        if (f13 == null || !dl2.b.G2(f13)) {
            arrayList.add(e());
        } else {
            arrayList.add(d(z13));
        }
        arrayList.add(f());
        return arrayList;
    }

    public final i c() {
        d navigation = d.f106361k;
        this.f106368a.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.HOME;
        int i13 = t70.c.tab_bar_home_icon;
        int i14 = t70.c.tab_bar_home_icon_selected;
        int i15 = t70.e.nav_bar_tab_label_home;
        int i16 = t70.d.bottom_nav_home_icon;
        return new i(aVar, i13, i14, u0.NAVIGATION_HOME_BUTTON, i16, navigation, i15, t70.e.nav_bar_tab_label_home_tab, q.HOME, q.HOME_FILL);
    }

    public final i d(boolean z13) {
        d navigation = d.f106362l;
        this.f106371d.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.NOTIFICATIONS;
        int i13 = t70.c.ic_speech_ellipsis_nonpds;
        int i14 = t70.c.ic_speech_ellipsis_selected_nonpds;
        int i15 = z13 ? t70.e.nav_bar_tab_label_inbox : t70.e.nav_bar_tab_label_notifications;
        return new i(aVar, i13, i14, u0.NOTIFICATIONS_ICON, t70.d.menu_notifications, navigation, i15, z13 ? t70.e.nav_bar_tab_label_inbox_tab : t70.e.nav_bar_tab_label_notifications_tab, q.SPEECH_ELLIPSIS, q.SPEECH_ELLIPSIS_FILL);
    }

    public final i e() {
        d navigation = d.f106362l;
        this.f106372e.getClass();
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.NOTIFICATIONS;
        int i13 = t70.c.ic_notifs_minors_nonpds;
        int i14 = t70.c.ic_notifs_selected_minors_nonpds;
        int i15 = t70.e.nav_bar_tab_label_notifications;
        return new i(aVar, i13, i14, u0.NOTIFICATIONS_ICON, t70.d.menu_notifications, navigation, i15, t70.e.nav_bar_tab_label_notifications_tab, q.BELL, q.BELL_FILL);
    }

    public final i f() {
        this.f106373f.getClass();
        e navigation = this.f106376i;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.PROFILE;
        int i13 = t70.c.tab_bar_profile;
        int i14 = t70.c.tab_bar_profile_selected;
        int i15 = t70.e.nav_bar_tab_label_saved;
        return new i(aVar, i13, i14, u0.PROFILE_BUTTON, t70.d.profile_menu_view, navigation, i15, t70.e.nav_bar_tab_label_saved_tab, q.PERSON, q.PERSON_FILL);
    }

    public final i g() {
        this.f106369b.getClass();
        e navigation = this.f106377j;
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        u70.a aVar = u70.a.SEARCH;
        int i13 = t70.c.tab_bar_search;
        int i14 = t70.c.tab_bar_search_selected;
        int i15 = t70.e.nav_bar_tab_label_search;
        return new i(aVar, i13, i14, u0.SEARCH_BUTTON, t70.d.menu_search, navigation, i15, t70.e.nav_bar_tab_label_search_tab, q.SEARCH, q.SEARCH_FILL);
    }
}
