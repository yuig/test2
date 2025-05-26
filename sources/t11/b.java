package t11;

import aq.j;
import com.pinterest.api.model.ba;
import com.pinterest.api.model.v7;
import f11.i;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kg.o;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import m60.t;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import pg0.b0;
import sp2.k;
import t3.s1;
import yk1.v;

/* loaded from: classes5.dex */
public final class b implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f115792a;

    public b(f fVar) {
        this.f115792a = fVar;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f11.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        s11.c cVar = fVar.f115811k;
        if (cVar == null) {
            Intrinsics.r("editablePinFieldSource");
            throw null;
        }
        aq.d dVar = aq.d.ALT_TEXT;
        cVar.x(dVar, event.f60776a);
        LinkedHashMap linkedHashMap = fVar.f115812l;
        linkedHashMap.put(dVar, event.f60776a);
        Boolean bool = event.f60778c;
        if (bool != null) {
            s11.c cVar2 = fVar.f115811k;
            if (cVar2 == null) {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            aq.d dVar2 = aq.d.IS_SHOPPING_REC_ALLOWED;
            cVar2.x(dVar2, String.valueOf(bool));
            linkedHashMap.put(dVar2, String.valueOf(bool));
        }
        Boolean bool2 = event.f60777b;
        if (bool2 != null) {
            s11.c cVar3 = fVar.f115811k;
            if (cVar3 == null) {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            aq.d dVar3 = aq.d.IS_COMMENTING_ALLOWED;
            cVar3.x(dVar3, String.valueOf(bool2));
            linkedHashMap.put(dVar3, String.valueOf(bool2));
        }
        aq.d dVar4 = aq.d.SPONSOR_ID;
        String str = event.f60779d;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put(dVar4, str);
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        fVar.f115802b.i(event);
        s11.c cVar = fVar.f115811k;
        if (cVar != null) {
            aq.d dVar = aq.d.BOARD_ID;
            cVar.x(dVar, event.f60781b);
            LinkedHashMap linkedHashMap = fVar.f115812l;
            String str = event.f60780a;
            linkedHashMap.put(dVar, str);
            fVar.addDisposable(nl.b.s(s1.f(fVar.f115809i.P(str).H(tk2.e.f118017c), "observeOn(...)"), new c(fVar, 0), null, null, 6));
            aq.d field = aq.d.SECTION_ID;
            j jVar = fVar.f115801a;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(field, "field");
            jVar.f20348a.remove(field);
            jVar.f20349b.remove(field);
            linkedHashMap.remove(field);
            return;
        }
        Intrinsics.r("editablePinFieldSource");
        throw null;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull f11.j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        LinkedHashMap linkedHashMap = fVar.f115812l;
        aq.d dVar = aq.d.PUBLISH_TIME;
        linkedHashMap.put(dVar, String.valueOf(TimeUnit.MILLISECONDS.toSeconds(event.f60782a.getTime())));
        boolean u33 = fVar.u3();
        v vVar = fVar.f115804d;
        if (u33) {
            s11.c cVar = fVar.f115811k;
            if (cVar == null) {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            cVar.x(dVar, o.q(event.f60782a, null, vVar));
        } else {
            s11.c cVar2 = fVar.f115811k;
            if (cVar2 != null) {
                cVar2.x(dVar, ((yk1.a) vVar).f139224a.getString(p22.b.idea_pin_schedule_publish_date_default));
            } else {
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
        }
        if (fVar.u3()) {
            ((u11.c) ((q11.d) fVar.getView())).R8(true);
        } else {
            ((u11.c) ((q11.d) fVar.getView())).R8(false);
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull mt0.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        LinkedHashMap linkedHashMap = fVar.f115812l;
        aq.d dVar = aq.d.INTEREST_TAGGING;
        linkedHashMap.put(dVar, event.f88143a);
        LinkedHashMap linkedHashMap2 = fVar.f115812l;
        linkedHashMap2.put(aq.d.INTEREST_LABELS, event.f88144b);
        aq.d dVar2 = aq.d.FREEFORM_TAGGING;
        String str = event.f88145c;
        linkedHashMap2.put(dVar2, str);
        s11.c cVar = fVar.f115811k;
        if (cVar != null) {
            cVar.x(dVar, o.s(event.f88143a, str, fVar.f115804d));
        } else {
            Intrinsics.r("editablePinFieldSource");
            throw null;
        }
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull mt0.b event) {
        String quantityString;
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        s11.c cVar = fVar.f115811k;
        if (cVar != null) {
            int size = event.f88146a.size();
            HashMap hashMap = cVar.f110593j;
            aq.d dVar = aq.d.PRODUCT_TAGS;
            if (((Integer) hashMap.get(dVar)) != null) {
                Integer valueOf = Integer.valueOf(size);
                if (size == 0) {
                    quantityString = "";
                } else {
                    quantityString = ((yk1.a) cVar.f110592i).f139224a.getQuantityString(ry1.e.pin_edit_n_tags, size, valueOf);
                }
                cVar.x(dVar, quantityString);
            }
            fVar.f115801a.b0(dVar, CollectionsKt.Z(event.f88146a, ",", null, null, 0, null, null, 62), false);
            return;
        }
        Intrinsics.r("editablePinFieldSource");
        throw null;
    }

    @k(threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull b0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.getClass();
        s11.c cVar = this.f115792a.f115811k;
        if (cVar != null) {
            aq.d editablePinField = aq.d.PAID_PARTNERSHIP;
            Intrinsics.checkNotNullParameter(editablePinField, "editablePinField");
            Integer num = (Integer) cVar.f110593j.get(editablePinField);
            if (num != null) {
                cVar.removeItem(num.intValue());
            }
            cVar.u(cVar.d());
            return;
        }
        Intrinsics.r("editablePinFieldSource");
        throw null;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v11.d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        fVar.f115802b.i(event);
        v7 u13 = event.f123843a.u();
        if (u13 != null) {
            s11.c cVar = fVar.f115811k;
            if (cVar != null) {
                aq.d dVar = aq.d.BOARD_ID;
                String j13 = u13.j1();
                Intrinsics.checkNotNullExpressionValue(j13, "getName(...)");
                cVar.x(dVar, j13);
                LinkedHashMap linkedHashMap = fVar.f115812l;
                String uid = u13.getUid();
                Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
                linkedHashMap.put(dVar, uid);
                s11.c cVar2 = fVar.f115811k;
                if (cVar2 != null) {
                    ba baVar = event.f123843a;
                    String A = baVar.A();
                    Intrinsics.checkNotNullExpressionValue(A, "getTitle(...)");
                    cVar2.w(A);
                    aq.d dVar2 = aq.d.SECTION_ID;
                    String uid2 = baVar.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    linkedHashMap.put(dVar2, uid2);
                    return;
                }
                Intrinsics.r("editablePinFieldSource");
                throw null;
            }
            Intrinsics.r("editablePinFieldSource");
            throw null;
        }
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull v11.e event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        fVar.f115802b.i(event);
        s11.c cVar = fVar.f115811k;
        if (cVar != null) {
            aq.d dVar = aq.d.SECTION_ID;
            cVar.x(dVar, "");
            fVar.f115812l.put(dVar, "");
            return;
        }
        Intrinsics.r("editablePinFieldSource");
        throw null;
    }

    @k(sticky = true, threadMode = ThreadMode.MAIN)
    public final void onEventMainThread(@NotNull zp.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        f fVar = this.f115792a;
        fVar.f115802b.i(event);
        fVar.f115801a.b0(aq.d.IS_SHOPPING_REC_ALLOWED, String.valueOf(!event.f142331a), false);
    }
}
