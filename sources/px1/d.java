package px1;

import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.f1;
import h32.g0;
import h32.u0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f101629i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ f f101630j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, int i13) {
        super(1);
        this.f101629i = i13;
        this.f101630j = fVar;
    }

    public final void b(long j13) {
        int i13 = this.f101629i;
        f fVar = this.f101630j;
        switch (i13) {
            case 7:
                j jVar = fVar.C0;
                if (jVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                i iVar = (i) jVar;
                iVar.v3(u0.ANALYTICS_START_DATEPICKER, xx.a.b(Long.valueOf(((yx.c) iVar.f101671b).c().f142973a.f142971c)), xx.a.b(Long.valueOf(j13)), f1.INPUT_CHANGE, g0.ANALYTICS_DATE_MENU);
                return;
            default:
                j jVar2 = fVar.C0;
                if (jVar2 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                i iVar2 = (i) jVar2;
                iVar2.v3(u0.ANALYTICS_END_DATEPICKER, xx.a.b(Long.valueOf(((yx.c) iVar2.f101671b).c().f142973a.f142972d)), xx.a.b(Long.valueOf(j13)), f1.INPUT_CHANGE, g0.ANALYTICS_DATE_MENU);
                return;
        }
    }

    public final void e(q it) {
        int i13 = this.f101629i;
        f fVar = this.f101630j;
        switch (i13) {
            case 0:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar = fVar.C0;
                if (jVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                String str = it.f101682b;
                zx.b filterParam = new zx.b(str, it.f101681a);
                i iVar = (i) jVar;
                Intrinsics.checkNotNullParameter(filterParam, "filterParam");
                u0 u0Var = u0.ANALYTICS_CLAIMED_ACCOUNT_FILTER;
                String str2 = ((yx.c) iVar.f101671b).c().f142977e.f142967a;
                Locale locale = Locale.ROOT;
                String lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                String lowerCase2 = str.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                i.w3(iVar, u0Var, lowerCase, lowerCase2, null, 24);
                k kVar = (k) iVar.getViewIfBound();
                if (kVar != null) {
                    ((f) kVar).b8(yx.a.a(iVar.f101671b, null, null, null, null, null, null, null, null, filterParam, false, 767));
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar2 = fVar.C0;
                if (jVar2 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                zx.h filterParam2 = zx.h.values()[it.f101681a];
                i iVar2 = (i) jVar2;
                Intrinsics.checkNotNullParameter(filterParam2, "filterParam");
                u0 u0Var2 = u0.ANALYTICS_DEVICE_FILTER;
                String name = ((yx.c) iVar2.f101671b).c().f142979g.name();
                Locale locale2 = Locale.ROOT;
                String lowerCase3 = name.toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                String lowerCase4 = filterParam2.name().toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                i.w3(iVar2, u0Var2, lowerCase3, lowerCase4, null, 24);
                k kVar2 = (k) iVar2.getViewIfBound();
                if (kVar2 != null) {
                    ((f) kVar2).b8(yx.a.a(iVar2.f101671b, null, null, null, null, null, null, filterParam2, null, null, false, 959));
                    return;
                }
                return;
            case 2:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar3 = fVar.C0;
                if (jVar3 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                zx.k filterParam3 = zx.k.values()[it.f101681a];
                i iVar3 = (i) jVar3;
                Intrinsics.checkNotNullParameter(filterParam3, "filterParam");
                u0 u0Var3 = u0.ANALYTICS_SOURCE_FILTER;
                String name2 = ((yx.c) iVar3.f101671b).c().f142980h.name();
                Locale locale3 = Locale.ROOT;
                String lowerCase5 = name2.toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase5, "toLowerCase(...)");
                String lowerCase6 = filterParam3.name().toLowerCase(locale3);
                Intrinsics.checkNotNullExpressionValue(lowerCase6, "toLowerCase(...)");
                i.w3(iVar3, u0Var3, lowerCase5, lowerCase6, null, 24);
                k kVar3 = (k) iVar3.getViewIfBound();
                if (kVar3 != null) {
                    ((f) kVar3).b8(yx.a.a(iVar3.f101671b, null, null, null, null, null, filterParam3, null, null, null, false, 991));
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar4 = fVar.C0;
                if (jVar4 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                zx.i filterParam4 = zx.i.values()[it.f101681a];
                i iVar4 = (i) jVar4;
                Intrinsics.checkNotNullParameter(filterParam4, "filterParam");
                u0 u0Var4 = u0.ANALYTICS_PIN_FORMAT_FILTER;
                String name3 = ((yx.c) iVar4.f101671b).c().f142981i.name();
                Locale locale4 = Locale.ROOT;
                String lowerCase7 = name3.toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase7, "toLowerCase(...)");
                String lowerCase8 = filterParam4.name().toLowerCase(locale4);
                Intrinsics.checkNotNullExpressionValue(lowerCase8, "toLowerCase(...)");
                i.w3(iVar4, u0Var4, lowerCase7, lowerCase8, null, 24);
                k kVar4 = (k) iVar4.getViewIfBound();
                if (kVar4 != null) {
                    ((f) kVar4).b8(yx.a.a(iVar4.f101671b, null, null, null, null, filterParam4, null, null, null, null, false, 1007));
                    return;
                }
                return;
            case 10:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar5 = fVar.C0;
                if (jVar5 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                zx.d filterParam5 = zx.d.values()[it.f101681a];
                i iVar5 = (i) jVar5;
                Intrinsics.checkNotNullParameter(filterParam5, "filterParam");
                u0 u0Var5 = u0.ANALYTICS_CONTENT_FILTER;
                String name4 = ((yx.c) iVar5.f101671b).c().f142974b.name();
                Locale locale5 = Locale.ROOT;
                String lowerCase9 = name4.toLowerCase(locale5);
                Intrinsics.checkNotNullExpressionValue(lowerCase9, "toLowerCase(...)");
                String lowerCase10 = filterParam5.name().toLowerCase(locale5);
                Intrinsics.checkNotNullExpressionValue(lowerCase10, "toLowerCase(...)");
                i.w3(iVar5, u0Var5, lowerCase9, lowerCase10, null, 24);
                k kVar5 = (k) iVar5.getViewIfBound();
                if (kVar5 != null) {
                    ((f) kVar5).b8(yx.a.a(iVar5.f101671b, null, filterParam5, null, null, null, null, null, null, null, false, 1021));
                    return;
                }
                return;
            case 11:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar6 = fVar.C0;
                if (jVar6 != null) {
                    ((i) jVar6).q3(it);
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
            default:
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar7 = fVar.C0;
                if (jVar7 != null) {
                    ((i) jVar7).q3(it);
                    return;
                } else {
                    Intrinsics.r("listener");
                    throw null;
                }
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i13 = this.f101629i;
        f fVar = this.f101630j;
        switch (i13) {
            case 0:
                e((q) obj);
                return Unit.f80348a;
            case 1:
                e((q) obj);
                return Unit.f80348a;
            case 2:
                e((q) obj);
                return Unit.f80348a;
            case 3:
                e((q) obj);
                return Unit.f80348a;
            case 4:
                on1.i it = (on1.i) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                j jVar = fVar.C0;
                if (jVar == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                boolean z13 = it instanceof on1.g;
                i iVar = (i) jVar;
                boolean z14 = ((yx.c) iVar.f101671b).c().f142982j;
                if (z14 != z13) {
                    i.w3(iVar, u0.ANALYTICS_CURATED_CONTENT_FILTER, String.valueOf(z14), String.valueOf(z13), null, 24);
                }
                k kVar = (k) iVar.getViewIfBound();
                if (kVar != null) {
                    ((f) kVar).b8(yx.a.a(iVar.f101671b, null, null, null, null, null, null, null, null, null, z13, 511));
                }
                return Unit.f80348a;
            case 5:
                zx.g filterParam = (zx.g) obj;
                Intrinsics.checkNotNullParameter(filterParam, "it");
                j jVar2 = fVar.C0;
                if (jVar2 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                i iVar2 = (i) jVar2;
                Intrinsics.checkNotNullParameter(filterParam, "filterParam");
                iVar2.getPinalytics().h0((r18 & 1) != 0 ? f1.TAP : f1.TAP, (r18 & 2) != 0 ? null : u0.DONE_BUTTON, (r18 & 4) != 0 ? null : g0.ANALYTICS_DATE_MENU, (r18 & 8) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) == 0 ? null : null, (r18 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? false : false);
                k kVar2 = (k) iVar2.getViewIfBound();
                if (kVar2 != null) {
                    ((f) kVar2).b8(yx.a.a(iVar2.f101671b, filterParam, null, null, null, null, null, null, null, null, false, 1022));
                }
                return Unit.f80348a;
            case 6:
                zx.f preset = (zx.f) obj;
                Intrinsics.checkNotNullParameter(preset, "it");
                j jVar3 = fVar.C0;
                if (jVar3 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                i iVar3 = (i) jVar3;
                Intrinsics.checkNotNullParameter(preset, "preset");
                i.w3(iVar3, u0.ANALYTICS_DATEPICKER_PRESET, ((yx.c) iVar3.f101671b).c().f142973a.f142969a.name(), preset.name(), g0.ANALYTICS_DATE_MENU, 8);
                return Unit.f80348a;
            case 7:
                b(((Number) obj).longValue());
                return Unit.f80348a;
            case 8:
                b(((Number) obj).longValue());
                return Unit.f80348a;
            case 9:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                j jVar4 = fVar.C0;
                if (jVar4 == null) {
                    Intrinsics.r("listener");
                    throw null;
                }
                i iVar4 = (i) jVar4;
                i.w3(iVar4, u0.ANALYTICS_REALTIME_FILTER, String.valueOf(((yx.c) iVar4.f101671b).c().f142973a.f142970b), String.valueOf(booleanValue), g0.ANALYTICS_DATE_MENU, 8);
                return Unit.f80348a;
            case 10:
                e((q) obj);
                return Unit.f80348a;
            case 11:
                e((q) obj);
                return Unit.f80348a;
            default:
                e((q) obj);
                return Unit.f80348a;
        }
    }
}
