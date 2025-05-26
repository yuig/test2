package nm1;

import android.content.res.TypedArray;
import com.pinterest.gestalt.headerBar.GestaltHeaderBar;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d extends kotlin.jvm.internal.s implements Function1 {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f91411i;

    /* renamed from: j, reason: collision with root package name */
    public static final d f91394j = new d(0);

    /* renamed from: k, reason: collision with root package name */
    public static final d f91395k = new d(1);

    /* renamed from: l, reason: collision with root package name */
    public static final d f91396l = new d(2);

    /* renamed from: m, reason: collision with root package name */
    public static final d f91397m = new d(3);

    /* renamed from: n, reason: collision with root package name */
    public static final d f91398n = new d(4);

    /* renamed from: o, reason: collision with root package name */
    public static final d f91399o = new d(5);

    /* renamed from: p, reason: collision with root package name */
    public static final d f91400p = new d(6);

    /* renamed from: q, reason: collision with root package name */
    public static final d f91401q = new d(7);

    /* renamed from: r, reason: collision with root package name */
    public static final d f91402r = new d(8);

    /* renamed from: s, reason: collision with root package name */
    public static final d f91403s = new d(9);

    /* renamed from: t, reason: collision with root package name */
    public static final d f91404t = new d(10);

    /* renamed from: u, reason: collision with root package name */
    public static final d f91405u = new d(11);

    /* renamed from: v, reason: collision with root package name */
    public static final d f91406v = new d(12);

    /* renamed from: w, reason: collision with root package name */
    public static final d f91407w = new d(13);

    /* renamed from: x, reason: collision with root package name */
    public static final d f91408x = new d(14);

    /* renamed from: y, reason: collision with root package name */
    public static final d f91409y = new d(15);

    /* renamed from: z, reason: collision with root package name */
    public static final d f91410z = new d(16);
    public static final d A = new d(17);
    public static final d B = new d(18);
    public static final d C = new d(19);
    public static final d D = new d(20);
    public static final d E = new d(21);
    public static final d F = new d(22);
    public static final d G = new d(23);
    public static final d H = new d(24);
    public static final d I = new d(25);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i13) {
        super(1);
        this.f91411i = i13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        u50.i0 i0Var;
        u50.i0 i0Var2;
        y yVar;
        y xVar;
        int i13 = this.f91411i;
        switch (i13) {
            case 0:
                TypedArray $receiver = (TypedArray) obj;
                Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                Intrinsics.checkNotNullParameter($receiver, "<this>");
                int i14 = i1.GestaltHeaderBar_gestalt_headerBarType;
                b bVar = b.TITLE_AND_ACTIONS;
                int i15 = $receiver.getInt(i14, -1);
                if (i15 >= 0) {
                    bVar = b.values()[i15];
                }
                int i16 = e1.f91421b[bVar.ordinal()];
                u50.i0 contentDescription = u50.h0.f120562a;
                if (i16 == 1) {
                    String string = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarTitle);
                    if (string != null) {
                        i0Var = bs1.c.p2(string);
                    } else {
                        kotlin.collections.q0 q0Var = GestaltHeaderBar.f49371d;
                        i0Var = contentDescription;
                    }
                    String string2 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarSubtitle);
                    if (string2 != null) {
                        contentDescription = bs1.c.p2(string2);
                    } else {
                        kotlin.collections.q0 q0Var2 = GestaltHeaderBar.f49371d;
                    }
                    u50.i0 i0Var3 = contentDescription;
                    l T0 = kh2.m0.T0($receiver);
                    l S0 = kh2.m0.S0($receiver);
                    int i17 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                    h0 h0Var = h0.NORMAL;
                    int i18 = $receiver.getInt(i17, -1);
                    return new e0(i0Var, i0Var3, T0, S0, i18 >= 0 ? h0.values()[i18] : h0Var, 32);
                }
                if (i16 == 2) {
                    int i19 = $receiver.getInt(i1.GestaltHeaderBar_gestalt_headerBarUserColorIndex, -1);
                    if (i19 > -1) {
                        String string3 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarUserName);
                        if (string3 == null) {
                            string3 = "";
                        }
                        String string4 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarUserImageURL);
                        i iVar = new i(i19, string4 != null ? string4 : "", string3);
                        l S02 = kh2.m0.S0($receiver);
                        int i23 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                        h0 h0Var2 = h0.NORMAL;
                        int i24 = $receiver.getInt(i23, -1);
                        if (i24 >= 0) {
                            h0Var2 = h0.values()[i24];
                        }
                        return new f0(iVar, S02, h0Var2, 8);
                    }
                    String string5 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarUserID);
                    if (string5 == null) {
                        string5 = "0";
                    }
                    String string6 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarUserName);
                    if (string6 == null) {
                        string6 = "";
                    }
                    String string7 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarUserImageURL);
                    j jVar = new j(string5, string7 != null ? string7 : "", string6);
                    l S03 = kh2.m0.S0($receiver);
                    int i25 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                    h0 h0Var3 = h0.NORMAL;
                    int i26 = $receiver.getInt(i25, -1);
                    if (i26 >= 0) {
                        h0Var3 = h0.values()[i26];
                    }
                    return new f0(jVar, S03, h0Var3, 8);
                }
                if (i16 != 3) {
                    if (i16 == 4) {
                        kotlin.collections.q0 q0Var3 = GestaltHeaderBar.f49371d;
                        int i27 = $receiver.getInt(i1.GestaltHeaderBar_gestalt_headerBarTabsSelectedIndex, 0);
                        int i28 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                        h0 h0Var4 = h0.NORMAL;
                        int i29 = $receiver.getInt(i28, -1);
                        return new a0(q0Var3, i27, i29 >= 0 ? h0.values()[i29] : h0Var4, 8, 0);
                    }
                    if (i16 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c0 c0Var = GestaltHeaderBar.f49372e;
                    c0 c0Var2 = (c0) CollectionsKt.firstOrNull(GestaltHeaderBar.f49371d);
                    int i33 = $receiver.getInt(i1.GestaltHeaderBar_gestalt_headerBarTabsSelectedIndex, 0);
                    int i34 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                    h0 h0Var5 = h0.NORMAL;
                    int i35 = $receiver.getInt(i34, -1);
                    return new b0(c0Var, c0Var2, i33, i35 >= 0 ? h0.values()[i35] : h0Var5, kh2.m0.T0($receiver), kh2.m0.S0($receiver), 64, 0);
                }
                int i36 = i1.GestaltHeaderBar_gestalt_headerBarSearchTrailingIconType;
                j1 j1Var = j1.EMPTY;
                int i37 = $receiver.getInt(i36, -1);
                if (i37 >= 0) {
                    j1Var = j1.values()[i37];
                }
                String string8 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarHintText);
                if (string8 != null) {
                    i0Var2 = bs1.c.p2(string8);
                } else {
                    kotlin.collections.q0 q0Var4 = GestaltHeaderBar.f49371d;
                    i0Var2 = contentDescription;
                }
                int i38 = e1.f91420a[j1Var.ordinal()];
                if (i38 != 1) {
                    if (i38 == 2) {
                        rm1.q a13 = rm1.r.a($receiver, i1.GestaltHeaderBar_gestalt_headerBarSearchTrailingIcon, rm1.q.PINTEREST);
                        String string9 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarSearchTrailingIconContentDescription);
                        xVar = new x(string9 != null ? bs1.c.p2(string9) : null, a13);
                    } else if (i38 == 3) {
                        int i39 = i1.GestaltHeaderBar_gestalt_headerBarSearchLeftTrailingIconContentDescription;
                        int i43 = i1.GestaltHeaderBar_gestalt_headerBarSearchRightTrailingIconContentDescription;
                        int i44 = i1.GestaltHeaderBar_gestalt_headerBarSearchLeftTrailingIcon;
                        rm1.q qVar = rm1.q.PINTEREST;
                        rm1.q a14 = rm1.r.a($receiver, i44, qVar);
                        rm1.q a15 = rm1.r.a($receiver, i1.GestaltHeaderBar_gestalt_headerBarSearchRightTrailingIcon, qVar);
                        String string10 = $receiver.getString(i39);
                        u50.f0 p23 = string10 != null ? bs1.c.p2(string10) : null;
                        String string11 = $receiver.getString(i43);
                        yVar = new w(a14, a15, p23, string11 != null ? bs1.c.p2(string11) : null);
                    } else {
                        if (i38 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        int i45 = cn1.h0.lottie_audio_animation_loop_3_sec;
                        Intrinsics.checkNotNullParameter(contentDescription, "contentDescription");
                        Integer b13 = dl2.b.b1($receiver, i1.GestaltHeaderBar_gestalt_headerBarSearchTrailingAnimatedIcon);
                        if (b13 != null) {
                            i45 = b13.intValue();
                        }
                        String string12 = $receiver.getString(i1.GestaltHeaderBar_gestalt_headerBarSearchTrailingIconContentDescription);
                        if (string12 != null) {
                            contentDescription = bs1.c.p2(string12);
                        }
                        xVar = new v(new cn1.e(i45, contentDescription));
                    }
                    yVar = xVar;
                } else {
                    yVar = null;
                }
                l S04 = kh2.m0.S0($receiver);
                int i46 = i1.GestaltHeaderBar_gestalt_headerBarVariant;
                h0 h0Var6 = h0.NORMAL;
                int i47 = $receiver.getInt(i46, -1);
                return new z(i0Var2, yVar, S04, i47 >= 0 ? h0.values()[i47] : h0Var6, 16);
            case 1:
                d0 checkAndApplyDiff = (d0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.getId());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff.a());
                }
            case 2:
                d0 checkAndApplyDiff2 = (d0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff2, "$this$checkAndApplyDiff");
                return checkAndApplyDiff2.d();
            case 3:
                d0 checkAndApplyDiff3 = (d0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff3, "$this$checkAndApplyDiff");
                return checkAndApplyDiff3.c();
            case 4:
                d0 checkAndApplyDiff4 = (d0) obj;
                switch (i13) {
                    case 1:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.getId());
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff4, "$this$checkAndApplyDiff");
                        return Integer.valueOf(checkAndApplyDiff4.a());
                }
            case 5:
                m it = (m) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.f80348a;
            case 6:
                gm1.a it2 = (gm1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return Unit.f80348a;
            case 7:
                cn1.d state = (cn1.d) obj;
                Intrinsics.checkNotNullParameter(state, "state");
                return cn1.d.e(state, null, null, null, null, null, null, null, dn1.e.DEFAULT, null, null, null, 424959);
            case 8:
                z checkAndApplyDiff5 = (z) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff5, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff5.f91517e);
            case 9:
                z checkAndApplyDiff6 = (z) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff6, "$this$checkAndApplyDiff");
                return checkAndApplyDiff6.f91516d;
            case 10:
                z checkAndApplyDiff7 = (z) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff7, "$this$checkAndApplyDiff");
                return checkAndApplyDiff7.f91513a;
            case 11:
                z checkAndApplyDiff8 = (z) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff8, "$this$checkAndApplyDiff");
                return checkAndApplyDiff8.f91514b;
            case 12:
                z checkAndApplyDiff9 = (z) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff9, "$this$checkAndApplyDiff");
                return checkAndApplyDiff9.f91515c;
            case 13:
                b0 checkAndApplyDiff10 = (b0) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff10, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff10.f91383e;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff10, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff10.f91384f;
                }
            case 14:
                b0 checkAndApplyDiff11 = (b0) obj;
                switch (i13) {
                    case 13:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff11, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff11.f91383e;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff11, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff11.f91384f;
                }
            case 15:
                e0 checkAndApplyDiff12 = (e0) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff12, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff12.f91416c;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff12, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff12.f91417d;
                }
            case 16:
                e0 checkAndApplyDiff13 = (e0) obj;
                switch (i13) {
                    case 15:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff13, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff13.f91416c;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff13, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff13.f91417d;
                }
            case 17:
                e0 checkAndApplyDiff14 = (e0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff14, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff14.f91419f);
            case 18:
                e0 checkAndApplyDiff15 = (e0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff15, "$this$checkAndApplyDiff");
                return checkAndApplyDiff15.f91418e;
            case 19:
                e0 checkAndApplyDiff16 = (e0) obj;
                switch (i13) {
                    case 19:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff16, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff16.f91414a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff16, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff16.f91415b;
                }
            case 20:
                e0 checkAndApplyDiff17 = (e0) obj;
                switch (i13) {
                    case 19:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff17, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff17.f91414a;
                    default:
                        Intrinsics.checkNotNullParameter(checkAndApplyDiff17, "$this$checkAndApplyDiff");
                        return checkAndApplyDiff17.f91415b;
                }
            case 21:
                rl1.q state2 = (rl1.q) obj;
                Intrinsics.checkNotNullParameter(state2, "state");
                return rl1.q.e(state2, null, null, false, null, null, false, false, null, f1.user_and_actions_avatar, null, null, 1791);
            case 22:
                f0 checkAndApplyDiff18 = (f0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff18, "$this$checkAndApplyDiff");
                return Integer.valueOf(checkAndApplyDiff18.f91427d);
            case 23:
                f0 checkAndApplyDiff19 = (f0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff19, "$this$checkAndApplyDiff");
                return checkAndApplyDiff19.f91426c;
            case 24:
                f0 checkAndApplyDiff20 = (f0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff20, "$this$checkAndApplyDiff");
                return checkAndApplyDiff20.f91424a;
            default:
                f0 checkAndApplyDiff21 = (f0) obj;
                Intrinsics.checkNotNullParameter(checkAndApplyDiff21, "$this$checkAndApplyDiff");
                return checkAndApplyDiff21.f91425b;
        }
    }
}
