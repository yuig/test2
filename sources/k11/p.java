package k11;

import androidx.appcompat.widget.c2;
import com.pinterest.api.model.e30;
import com.pinterest.api.model.f30;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import df.j1;
import h32.k2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lb0.q;
import lh0.a3;
import lh0.z3;
import m60.u0;
import nx.b0;
import nx.d0;
import nx.d1;
import rg0.h0;
import rg0.i0;
import x02.b2;
import x02.i2;
import yk1.v;
import z32.f2;
import z42.u;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final b60.b f78162a;

    /* renamed from: b, reason: collision with root package name */
    public final f21.e f78163b;

    /* renamed from: c, reason: collision with root package name */
    public final i92.k f78164c;

    /* renamed from: d, reason: collision with root package name */
    public final com.pinterest.feature.pin.j f78165d;

    /* renamed from: e, reason: collision with root package name */
    public final v f78166e;

    /* renamed from: f, reason: collision with root package name */
    public final a3 f78167f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.camera.core.impl.j f78168g;

    /* renamed from: h, reason: collision with root package name */
    public final d1 f78169h;

    /* renamed from: i, reason: collision with root package name */
    public final c f78170i;

    /* renamed from: j, reason: collision with root package name */
    public final i2 f78171j;

    /* renamed from: k, reason: collision with root package name */
    public final c2 f78172k;

    /* renamed from: l, reason: collision with root package name */
    public final q f78173l;

    /* renamed from: m, reason: collision with root package name */
    public final b0 f78174m;

    public p(b60.b activeUserManager, f21.e repinToProfileHelper, i92.k toastUtils, com.pinterest.feature.pin.j pinAction, v viewResources, a3 repinLibraryExperiments, androidx.camera.core.impl.j repinHelper, d1 trackingParamAttacher, c easyGiftGuideUpsellUtilFactory, i2 pinRepository, c2 repinToastHelper, q prefsManagerPersisted, b0 pinAuxHelper) {
        Intrinsics.checkNotNullParameter(activeUserManager, "activeUserManager");
        Intrinsics.checkNotNullParameter(repinToProfileHelper, "repinToProfileHelper");
        Intrinsics.checkNotNullParameter(toastUtils, "toastUtils");
        Intrinsics.checkNotNullParameter(pinAction, "pinAction");
        Intrinsics.checkNotNullParameter(viewResources, "viewResources");
        Intrinsics.checkNotNullParameter(repinLibraryExperiments, "repinLibraryExperiments");
        Intrinsics.checkNotNullParameter(repinHelper, "repinHelper");
        Intrinsics.checkNotNullParameter(trackingParamAttacher, "trackingParamAttacher");
        Intrinsics.checkNotNullParameter(easyGiftGuideUpsellUtilFactory, "easyGiftGuideUpsellUtilFactory");
        Intrinsics.checkNotNullParameter(pinRepository, "pinRepository");
        Intrinsics.checkNotNullParameter(repinToastHelper, "repinToastHelper");
        Intrinsics.checkNotNullParameter(prefsManagerPersisted, "prefsManagerPersisted");
        Intrinsics.checkNotNullParameter(pinAuxHelper, "pinAuxHelper");
        this.f78162a = activeUserManager;
        this.f78163b = repinToProfileHelper;
        this.f78164c = toastUtils;
        this.f78165d = pinAction;
        this.f78166e = viewResources;
        this.f78167f = repinLibraryExperiments;
        this.f78168g = repinHelper;
        this.f78169h = trackingParamAttacher;
        this.f78170i = easyGiftGuideUpsellUtilFactory;
        this.f78171j = pinRepository;
        this.f78172k = repinToastHelper;
        this.f78173l = prefsManagerPersisted;
        this.f78174m = pinAuxHelper;
    }

    public static void a(p pVar, f30 pin, boolean z13, boolean z14, boolean z15, String str, boolean z16, String str2, d0 pinalytics, gp1.k kVar, ha2.i iVar, Function0 showBoardPicker, int i13) {
        boolean z17 = (i13 & 4) != 0 ? false : z14;
        boolean z18 = (i13 & 8) != 0 ? false : z15;
        String str3 = (i13 & 32) != 0 ? null : str;
        boolean z19 = (i13 & 64) == 0 ? z16 : false;
        String str4 = (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str2;
        gp1.k repinSource = (i13 & 1024) != 0 ? gp1.k.UNKNOWN : kVar;
        ha2.i iVar2 = (i13 & 2048) != 0 ? null : iVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(pinalytics, "pinalytics");
        Intrinsics.checkNotNullParameter(repinSource, "repinSource");
        Intrinsics.checkNotNullParameter(showBoardPicker, "showBoardPicker");
        wy0 f13 = ((b60.d) pVar.f78162a).f();
        String uid = pin.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        z3 z3Var = z3.DO_NOT_ACTIVATE_EXPERIMENT;
        a3 a3Var = pVar.f78167f;
        boolean a13 = a3Var.a("enabled_5_boards", z3Var);
        v vVar = pVar.f78166e;
        kh2.j.y2(uid, vVar, a13 ? 5 : a3Var.a("enabled_7_boards", z3Var) ? 7 : a3Var.a("enabled_10_boards", z3Var) ? 10 : a3Var.a("enabled_12_boards", z3Var) ? 12 : ((yk1.a) vVar).f139224a.getInteger(u0.board_picker_page_count));
        if (Intrinsics.d(str4, "feed_holiday_finds")) {
            if (pVar.f78173l.g("PREF_HOLIDAY_FINDS_QUICK_SAVE_ICON", f2.NONE.getValue()) == f2.PIN_ICON.getValue()) {
                d1 d1Var = pVar.f78169h;
                if (!z13 || !z18 || !j1.U0(pin.B5())) {
                    String uid2 = pin.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid2, "getUid(...)");
                    x02.c2 c2Var = new x02.c2(uid2);
                    c2Var.f131305j = pin.z4();
                    c2Var.f131306k = d1Var.b(pin);
                    c2Var.f131311p = k2.FEATURED_BOARD_FEED;
                    Unit unit = Unit.f80348a;
                    pVar.f78165d.a(pin, c2Var, new i11.c(13, new k1.b0(pin, z17, pVar, pinalytics, 9)), new i11.c(14, o.f78159j));
                    return;
                }
                String B5 = pin.B5();
                if (B5 == null) {
                    B5 = "";
                }
                i2 i2Var = pVar.f78171j;
                f30 f30Var = (f30) gh0.b.C(i2Var.M(B5));
                if (f30Var != null) {
                    String uid3 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid3, "getUid(...)");
                    String c13 = d1Var.c(uid3);
                    String uid4 = f30Var.getUid();
                    Intrinsics.checkNotNullExpressionValue(uid4, "getUid(...)");
                    b2 params = new b2(uid4, c13);
                    e30 R6 = pin.R6();
                    R6.x1(null);
                    R6.C1(null);
                    f30 a14 = R6.a();
                    Intrinsics.checkNotNullExpressionValue(a14, "build(...)");
                    i2Var.W(a14);
                    Intrinsics.checkNotNullParameter(params, "params");
                    i2Var.m(params, null).i(new px0.b(f30Var, pinalytics, pVar, pin, 1), new i11.c(15, o.f78160k));
                    return;
                }
                return;
            }
        }
        if (f13 != null) {
            if (f13.m4().intValue() == u.SAVE_TO_PROFILE.getValue()) {
                b(pVar, pin, z13, str3, z19, iVar2, null, repinSource, 32);
                g4.u uVar = i0.f108029b;
                String uid5 = pin.getUid();
                Intrinsics.checkNotNullExpressionValue(uid5, "getUid(...)");
                g4.u.v0(uVar, uid5, h0.BOARDLESS, 4);
                return;
            }
        }
        showBoardPicker.invoke();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0183  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void b(k11.p r22, com.pinterest.api.model.f30 r23, boolean r24, java.lang.String r25, boolean r26, kotlin.jvm.functions.Function1 r27, java.lang.String r28, gp1.k r29, int r30) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k11.p.b(k11.p, com.pinterest.api.model.f30, boolean, java.lang.String, boolean, kotlin.jvm.functions.Function1, java.lang.String, gp1.k, int):void");
    }
}
