package ads_mobile_sdk;

import a.l0;
import a.zb;
import android.os.SystemClock;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes2.dex */
public final class sy implements a.cd {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f11276c = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f11277d = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    /* renamed from: a, reason: collision with root package name */
    public final zb f11278a;

    /* renamed from: b, reason: collision with root package name */
    public final oh0 f11279b;

    public sy(oh0 flags, zb clock) {
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(flags, "flags");
        this.f11278a = clock;
        this.f11279b = flags;
    }

    @Override // a.cd
    public final Object a(ym0 ym0Var, Map map, bl2.c cVar) {
        List split$default;
        String str = (String) map.get("action");
        if (str != null) {
            int hashCode = str.hashCode();
            Object obj = null;
            if (hashCode != -85337091) {
                if (hashCode != 3559837) {
                    if (hashCode == 96965648 && str.equals("extra")) {
                        String str2 = (String) map.get("name");
                        String str3 = (String) map.get("value");
                        if (str2 == null || str2.length() == 0) {
                            Intrinsics.checkNotNullParameter("No name provided on CSI extra gmsg", "message");
                            ft2.a(true, "No name provided on CSI extra gmsg", null);
                            obj = Unit.f80348a;
                        } else if (((Boolean) this.f11279b.a("gads:csi_gmsg_parameter_validation:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() && !f11276c.matcher(str2).matches()) {
                            Intrinsics.checkNotNullParameter("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.", "message");
                            ft2.a(true, "Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null);
                            obj = Unit.f80348a;
                        } else if (str3 == null || str3.length() == 0) {
                            Intrinsics.checkNotNullParameter("No value provided on CSI extra gmsg", "message");
                            ft2.a(true, "No value provided on CSI extra gmsg", null);
                            obj = Unit.f80348a;
                        } else {
                            dz dzVar = ym0Var.f14318d;
                            if (dzVar != null && (obj = dzVar.a(str2, str3, true, cVar)) != cl2.a.COROUTINE_SUSPENDED) {
                                obj = Unit.f80348a;
                            }
                        }
                        return obj == cl2.a.COROUTINE_SUSPENDED ? obj : Unit.f80348a;
                    }
                } else if (str.equals("tick")) {
                    String str4 = (String) map.get("label");
                    String str5 = (String) map.get("start_label");
                    if (str5 == null) {
                        str5 = "native:view_load";
                    }
                    String str6 = (String) map.get("timestamp");
                    if (str4 == null || str4.length() == 0) {
                        Intrinsics.checkNotNullParameter("No label provided on CSI tick gmsg", "message");
                        ft2.a(true, "No label provided on CSI tick gmsg", null);
                        obj = Unit.f80348a;
                    } else {
                        oh0 oh0Var = this.f11279b;
                        Boolean bool = Boolean.FALSE;
                        wg0 wg0Var = oh0.f9281e;
                        if (((Boolean) oh0Var.a("gads:csi_gmsg_parameter_validation:enabled", bool, wg0Var)).booleanValue() && !f11276c.matcher(str4).matches()) {
                            Intrinsics.checkNotNullParameter("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", "message");
                            ft2.a(true, "Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null);
                            obj = Unit.f80348a;
                        } else if (((Boolean) this.f11279b.a("gads:csi_gmsg_parameter_validation:enabled", bool, wg0Var)).booleanValue() && !f11276c.matcher(str5).matches()) {
                            Intrinsics.checkNotNullParameter("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", "message");
                            ft2.a(true, "Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.", null);
                            obj = Unit.f80348a;
                        } else if (str6 == null || str6.length() == 0) {
                            Intrinsics.checkNotNullParameter("No timestamp provided on CSI tick gmsg", "message");
                            ft2.a(true, "No timestamp provided on CSI tick gmsg", null);
                            obj = Unit.f80348a;
                        } else {
                            try {
                                l0 l0Var = cm0.f3958f;
                                zb timestampToElapsedRealTime = this.f11278a;
                                long parseLong = Long.parseLong(str6);
                                Intrinsics.checkNotNullParameter(timestampToElapsedRealTime, "$this$timestampToElapsedRealTime");
                                timestampToElapsedRealTime.getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                zn2.a aVar = zn2.b.f142311b;
                                long Q2 = dl2.b.Q2(elapsedRealtime - (currentTimeMillis - parseLong), zn2.d.MILLISECONDS);
                                dz dzVar2 = ym0Var.f14318d;
                                if (dzVar2 != null && (obj = dzVar2.a(str4, str5, Q2, cVar)) != cl2.a.COROUTINE_SUSPENDED) {
                                    obj = Unit.f80348a;
                                }
                            } catch (NumberFormatException e13) {
                                Intrinsics.checkNotNullParameter("Malformed timestamp provided on CSI tick gmsg", "message");
                                cs2 a13 = qs2.a();
                                a13.f().f6994p.add("Malformed timestamp provided on CSI tick gmsg");
                                a13.f().f6988j = false;
                                a13.a(e13);
                                obj = Unit.f80348a;
                            }
                        }
                    }
                    return obj == cl2.a.COROUTINE_SUSPENDED ? obj : Unit.f80348a;
                }
            } else if (str.equals("experiment")) {
                String str7 = (String) map.get("value");
                if (str7 == null || str7.length() == 0) {
                    Intrinsics.checkNotNullParameter("No value provided on CSI experiment gmsg", "message");
                    ft2.a(true, "No value provided on CSI experiment gmsg", null);
                    obj = Unit.f80348a;
                } else if (!((Boolean) this.f11279b.a("gads:csi_gmsg_parameter_validation:enabled", Boolean.FALSE, oh0.f9281e)).booleanValue() || f11277d.matcher(str7).matches()) {
                    split$default = StringsKt__StringsKt.split$default(str7, new String[]{","}, false, 0, 6, null);
                    dz dzVar3 = ym0Var.f14318d;
                    if (dzVar3 != null && (obj = dzVar3.a("e", split$default, cVar)) != cl2.a.COROUTINE_SUSPENDED) {
                        obj = Unit.f80348a;
                    }
                } else {
                    Intrinsics.checkNotNullParameter("Invalid value given for CSI experiment. Should be a comma separated list of numbers.", "message");
                    ft2.a(true, "Invalid value given for CSI experiment. Should be a comma separated list of numbers.", null);
                    obj = Unit.f80348a;
                }
                return obj == cl2.a.COROUTINE_SUSPENDED ? obj : Unit.f80348a;
            }
        }
        return Unit.f80348a;
    }

    @Override // a.cd
    public final kl0 b() {
        return kl0.GMSG_INSTRUMENT;
    }
}
