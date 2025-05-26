package w1;

import com.pinterest.activity.sendapin.model.TypeAheadItem;
import com.pinterest.api.model.PinnableImage;
import com.pinterest.api.model.b40;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.gs0;
import com.pinterest.api.model.of;
import com.pinterest.api.model.sf;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s80.n6;

/* loaded from: classes2.dex */
public final class g extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f127252i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ List f127253j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(List list, int i13) {
        super(1);
        this.f127252i = i13;
        this.f127253j = list;
    }

    public final fk1.d b(fk1.d it) {
        int i13 = this.f127252i;
        List list = this.f127253j;
        switch (i13) {
            case 26:
                Intrinsics.checkNotNullParameter(it, "it");
                return fk1.d.e(CollectionsKt.l0(list, it.f62348a));
            case 27:
                Intrinsics.checkNotNullParameter(it, "it");
                return fk1.d.e(CollectionsKt.l0(list, it.f62348a));
            case 28:
                Intrinsics.checkNotNullParameter(it, "it");
                return fk1.d.e(CollectionsKt.l0(list, it.f62348a));
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                it.getClass();
                return fk1.d.e(list);
        }
    }

    public final rn1.a e(rn1.a it) {
        switch (this.f127252i) {
            case 13:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, this.f127253j, null, null, 0, null, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097147);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                return rn1.a.y(it, null, null, null, null, null, 0, this.f127253j.isEmpty() ? fm1.c.VISIBLE : fm1.c.GONE, null, null, null, false, 0, null, null, null, null, null, false, null, null, 2097087);
        }
    }

    public final sl1.i f(sl1.i it) {
        int i13 = this.f127252i;
        List list = this.f127253j;
        switch (i13) {
            case 21:
                Intrinsics.checkNotNullParameter(it, "it");
                return sl1.i.e(it, list, list.size(), null, false, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
            case 22:
                Intrinsics.checkNotNullParameter(it, "it");
                return sl1.i.e(it, list, list.size(), null, false, null, null, RecyclerViewTypes.VIEW_TYPE_ANKET_INLINE_SURVEY_VIEW_FULL_SPAN);
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List list2 = this.f127253j;
                return sl1.i.e(it, list2, 0, null, false, null, list2.isEmpty() ^ true ? fm1.c.VISIBLE : fm1.c.GONE, RecyclerViewTypes.VIEW_TYPE_STORY_TODAY_TAB_UPSELL_SINGLE);
        }
    }

    public final uj2.t h(vd0.c it) {
        int i13 = this.f127252i;
        List list = this.f127253j;
        switch (i13) {
            case 5:
                Intrinsics.checkNotNullParameter(it, "it");
                List e03 = kotlin.jvm.internal.r.e0(it.k("data"));
                if (!e03.isEmpty()) {
                    List list2 = e03;
                    ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new pb2.k((TypeAheadItem) it2.next()));
                    }
                    list.addAll(arrayList);
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                List e04 = kotlin.jvm.internal.r.e0(it.k("data"));
                if (!e04.isEmpty()) {
                    List list3 = e04;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.g0.q(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(new pb2.l((TypeAheadItem) it3.next()));
                    }
                    list.addAll(arrayList2);
                }
                break;
        }
        return uj2.q.y(list);
    }

    public final void i(q3.b1 b1Var) {
        int i13 = this.f127252i;
        List list = this.f127253j;
        switch (i13) {
            case 0:
                int size = list.size();
                for (int i14 = 0; i14 < size; i14++) {
                    q3.b1.f(b1Var, (q3.c1) list.get(i14), 0, 0);
                }
                break;
            case 1:
                int size2 = list.size();
                for (int i15 = 0; i15 < size2; i15++) {
                    q3.b1.d(b1Var, (q3.c1) list.get(i15), 0, 0);
                }
                break;
            case 2:
                int size3 = list.size();
                for (int i16 = 0; i16 < size3; i16++) {
                    q3.b1.g(b1Var, (q3.c1) list.get(i16), 0, 0);
                }
                break;
            case 3:
                int size4 = list.size();
                for (int i17 = 0; i17 < size4; i17++) {
                    q3.b1.f(b1Var, (q3.c1) list.get(i17), 0, 0);
                }
                break;
            default:
                int i18 = kotlin.collections.f0.i(list);
                if (i18 >= 0) {
                    int i19 = 0;
                    while (true) {
                        q3.b1.f(b1Var, (q3.c1) list.get(i19), 0, 0);
                        if (i19 == i18) {
                            break;
                        } else {
                            i19++;
                        }
                    }
                }
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f127252i;
        int i14 = 2;
        int i15 = 1;
        List list = this.f127253j;
        switch (i13) {
            case 0:
                i((q3.b1) obj);
                break;
            case 1:
                i((q3.b1) obj);
                break;
            case 2:
                i((q3.b1) obj);
                break;
            case 3:
                i((q3.b1) obj);
                break;
            case 4:
                i((q3.b1) obj);
                break;
            case 7:
                f30 pin = (f30) obj;
                Intrinsics.checkNotNullParameter(pin, "pin");
                PinnableImage pinnableImage = new PinnableImage();
                pinnableImage.f35564a = pin.getUid();
                pinnableImage.f35569f = bs1.c.B0(pin);
                pinnableImage.f35565b = bs1.c.C0(pin);
                pinnableImage.f35566c = bs1.c.A0(pin);
                pinnableImage.f35568e = pin.c4();
                pinnableImage.f35570g = b40.h(pin);
                list.add(pinnableImage);
                break;
            case 8:
                an1.l it = (an1.l) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                List list2 = list;
                ArrayList arrayList = new ArrayList(kotlin.collections.g0.q(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String str = ((gs0) it2.next()).f38132e;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new an1.e(bs1.c.h2(str), null, null, false, 62));
                }
                break;
            case 9:
                n6 it3 = (n6) obj;
                Intrinsics.checkNotNullParameter(it3, "it");
                break;
            case 10:
                list.get(((Number) obj).intValue());
                break;
            case 11:
                r1.e0 LazyVerticalGrid = (r1.e0) obj;
                Intrinsics.checkNotNullParameter(LazyVerticalGrid, "$this$LazyVerticalGrid");
                tc0.d dVar = tc0.d.f117228m;
                int size = list.size();
                u80.s sVar = new u80.s(6, list, dVar);
                tc0.e eVar = new tc0.e(list, i15);
                Object obj2 = q2.i.f102113a;
                ((r1.l) LazyVerticalGrid).s(size, null, null, sVar, new q2.h(eVar, true, 699646206));
                break;
            case 12:
                q1.x LazyColumn = (q1.x) obj;
                Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
                tc0.d dVar2 = tc0.d.f117229n;
                int size2 = list.size();
                u80.s sVar2 = new u80.s(7, list, dVar2);
                tc0.e eVar2 = new tc0.e(list, i14);
                Object obj3 = q2.i.f102113a;
                ((q1.i) LazyColumn).s(size2, null, sVar2, new q2.h(eVar2, true, -632812321));
                break;
            case 15:
                dy0.e it4 = (dy0.e) obj;
                Intrinsics.checkNotNullParameter(it4, "it");
                break;
            case 16:
                y01.h0 it5 = (y01.h0) obj;
                Intrinsics.checkNotNullParameter(it5, "it");
                break;
            case 17:
                androidx.recyclerview.widget.w it6 = (androidx.recyclerview.widget.w) obj;
                switch (i13) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it6, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it6, "it");
                        break;
                }
            case 18:
                androidx.recyclerview.widget.w it7 = (androidx.recyclerview.widget.w) obj;
                switch (i13) {
                    case 17:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        break;
                    default:
                        Intrinsics.checkNotNullParameter(it7, "it");
                        break;
                }
            case 19:
                of it8 = (of) obj;
                Intrinsics.checkNotNullParameter(it8, "it");
                List<sf> b13 = it8.b();
                if (b13 != null) {
                    for (sf sfVar : b13) {
                        String h10 = sfVar.h();
                        if (h10 == null) {
                            h10 = "";
                        }
                        String g13 = sfVar.g();
                        if (g13 == null) {
                            g13 = "+0";
                        }
                        String f13 = sfVar.f();
                        if (f13 == null) {
                            f13 = "";
                        }
                        list.add(new ic1.w(h10, g13, f13));
                    }
                }
                kotlin.collections.j0.t(list, new t3.d0(3, new gv0.b(Collator.getInstance(new Locale(Locale.getDefault().getLanguage(), Locale.getDefault().getCountry())), 22)));
                break;
            case 20:
                os.g it9 = (os.g) obj;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 24:
                ni1.u0 it10 = (ni1.u0) obj;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 25:
                h32.y1 update = (h32.y1) obj;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                update.G = list;
                break;
        }
        return b((fk1.d) obj);
    }
}
