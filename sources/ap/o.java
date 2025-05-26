package ap;

import android.content.Context;
import com.pinterest.api.model.wy0;
import fk2.x;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import lb0.q;
import lb0.r;
import m60.w;
import m60.x0;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ int f20280l = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f20281a;

    /* renamed from: b, reason: collision with root package name */
    public final pb0.a f20282b;

    /* renamed from: c, reason: collision with root package name */
    public final vb0.c f20283c;

    /* renamed from: d, reason: collision with root package name */
    public final tb0.h f20284d;

    /* renamed from: e, reason: collision with root package name */
    public final i20.a f20285e;

    /* renamed from: f, reason: collision with root package name */
    public final i92.k f20286f;

    /* renamed from: g, reason: collision with root package name */
    public final w f20287g;

    /* renamed from: h, reason: collision with root package name */
    public final b60.b f20288h;

    /* renamed from: i, reason: collision with root package name */
    public final q f20289i;

    /* renamed from: j, reason: collision with root package name */
    public final r f20290j;

    /* renamed from: k, reason: collision with root package name */
    public final int f20291k;

    static {
        new com.google.android.gms.common.api.d(19, 0);
    }

    public o(Context context, pb0.a clock, vb0.c applicationUtils, tb0.h crashReporting, i20.a contactsService, i92.k toastUtils, w eventManager, b60.b activeUserManager, q prefsManagerPersisted, r prefsManagerUser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(applicationUtils, "applicationUtils");
        Intrinsics.checkNotNullParameter(crashReporting, "crashReporting");
        Intrinsics.checkNotNullParameter(contactsService, "contactsService");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(prefsManagerUser, "prefsManagerUser");
        this.f20281a = context;
        this.f20282b = clock;
        this.f20283c = applicationUtils;
        this.f20284d = crashReporting;
        this.f20285e = contactsService;
        this.f20286f = toastUtils;
        this.f20287g = eventManager;
        this.f20288h = activeUserManager;
        this.f20289i = prefsManagerPersisted;
        this.f20290j = prefsManagerUser;
        this.f20291k = x0.loading;
    }

    public static String a(String str, LinkedHashSet linkedHashSet) {
        List f13;
        Collection collection;
        Iterator it = linkedHashSet.iterator();
        while (true) {
            String[] strArr = null;
            if (!it.hasNext()) {
                return null;
            }
            String str2 = (String) it.next();
            if (str2 != null && (f13 = new Regex(":").f(0, str2)) != null) {
                if (!f13.isEmpty()) {
                    ListIterator listIterator = f13.listIterator(f13.size());
                    while (listIterator.hasPrevious()) {
                        if (((String) listIterator.previous()).length() != 0) {
                            collection = CollectionsKt.y0(f13, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                collection = q0.f80391a;
                if (collection != null) {
                    strArr = (String[]) collection.toArray(new String[0]);
                }
            }
            if (strArr != null && strArr.length != 0 && Intrinsics.d(str, strArr[0])) {
                return str2;
            }
        }
    }

    public final LinkedHashSet b() {
        Set h10 = this.f20289i.h("PREF_ACCOUNTS_STORED_CONTACTS", null);
        if (h10 != null) {
            return CollectionsKt.I0(h10);
        }
        return null;
    }

    public final HashMap c() {
        HashMap a13 = b.a(this.f20281a);
        Intrinsics.checkNotNullExpressionValue(a13, "getLocalInvitabilityContacts(...)");
        return a13;
    }

    public final boolean d(HashMap hashMap) {
        String str;
        Collection collection;
        Collection collection2;
        LinkedHashSet b13 = b();
        if (b13 == null) {
            return false;
        }
        wy0 f13 = ((b60.d) this.f20288h).f();
        if (f13 == null || (str = f13.getUid()) == null) {
            str = "";
        }
        String a13 = a(str, b13);
        if (a13 == null) {
            return false;
        }
        List f14 = new Regex(":").f(0, a13);
        if (!f14.isEmpty()) {
            ListIterator listIterator = f14.listIterator(f14.size());
            while (listIterator.hasPrevious()) {
                if (((String) listIterator.previous()).length() != 0) {
                    collection = CollectionsKt.y0(f14, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        collection = q0.f80391a;
        String[] strArr = (String[]) collection.toArray(new String[0]);
        if (strArr.length > 1) {
            if (System.currentTimeMillis() <= Long.parseLong(strArr[1])) {
                return false;
            }
        }
        int hashCode = hashMap.hashCode();
        List f15 = new Regex(":").f(0, a13);
        if (!f15.isEmpty()) {
            ListIterator listIterator2 = f15.listIterator(f15.size());
            while (listIterator2.hasPrevious()) {
                if (((String) listIterator2.previous()).length() != 0) {
                    collection2 = CollectionsKt.y0(f15, listIterator2.nextIndex() + 1);
                    break;
                }
            }
        }
        collection2 = q0.f80391a;
        String[] strArr2 = (String[]) collection2.toArray(new String[0]);
        return strArr2.length <= 2 || hashCode != Integer.parseInt(strArr2[2]);
    }

    public final boolean e() {
        String str;
        LinkedHashSet b13 = b();
        wy0 f13 = ((b60.d) this.f20288h).f();
        if (b13 != null) {
            if (f13 == null || (str = f13.getUid()) == null) {
                str = "";
            }
            if (a(str, b13) != null) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        String str;
        Set b13 = b();
        if (b13 == null) {
            b13 = new HashSet(1);
        }
        wy0 f13 = ((b60.d) this.f20288h).f();
        if (f13 == null || (str = f13.getUid()) == null) {
            str = "";
        }
        b13.add(str);
        this.f20289i.j("PREF_ACCOUNTS_STORED_CONTACTS", b13);
    }

    public final uj2.b g(HashMap contacts) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        f();
        if (!d(contacts)) {
            fk2.m mVar = fk2.m.f62459a;
            Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
            return mVar;
        }
        int hashCode = contacts.hashCode();
        String str = "[" + CollectionsKt.Z(contacts.values(), ",", null, null, 0, null, null, 62) + ']';
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        String a13 = this.f20283c.a();
        Intrinsics.checkNotNullExpressionValue(a13, "getInstallId(...)");
        int i13 = 0;
        x e13 = new x(this.f20285e.a(a13, str).l(tk2.e.f118017c), new vo.a(19, new m(i13, contacts)), ck2.i.f27924d, ck2.i.f27923c).f(new vo.a(20, new n(this, i13))).e(new i(this, hashCode, i13));
        Intrinsics.checkNotNullExpressionValue(e13, "doOnComplete(...)");
        return e13;
    }

    public final fk2.l h() {
        final int i13 = 1;
        final int i14 = 0;
        fk2.l lVar = new fk2.l(new x(g(c()).h(wj2.c.a()), new vo.a(21, new n(this, i13)), ck2.i.f27924d, ck2.i.f27923c).e(new ak2.a(this) { // from class: ap.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f20272b;

            {
                this.f20272b = this;
            }

            @Override // ak2.a
            public final void run() {
                int i15 = i14;
                o this$0 = this.f20272b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f20286f.k(vc0.d.contacts_stored);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f20287g.d(new of0.b());
                        break;
                }
            }
        }), new ak2.a(this) { // from class: ap.j

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f20272b;

            {
                this.f20272b = this;
            }

            @Override // ak2.a
            public final void run() {
                int i15 = i13;
                o this$0 = this.f20272b;
                switch (i15) {
                    case 0:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f20286f.k(vc0.d.contacts_stored);
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(this$0, "this$0");
                        this$0.f20287g.d(new of0.b());
                        break;
                }
            }
        }, 0);
        Intrinsics.checkNotNullExpressionValue(lVar, "doFinally(...)");
        return lVar;
    }
}
