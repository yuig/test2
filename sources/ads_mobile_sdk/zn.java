package ads_mobile_sdk;

import kotlin.jvm.internal.Intrinsics;
import lb.l0;
import pk.v2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class zn {

    /* renamed from: b, reason: collision with root package name */
    public static final a.mg f14830b;

    /* renamed from: c, reason: collision with root package name */
    public static final zn f14831c;

    /* renamed from: d, reason: collision with root package name */
    public static final zn f14832d;

    /* renamed from: e, reason: collision with root package name */
    public static final zn f14833e;

    /* renamed from: f, reason: collision with root package name */
    public static final zn f14834f;

    /* renamed from: g, reason: collision with root package name */
    public static final zn f14835g;

    /* renamed from: h, reason: collision with root package name */
    public static final zn f14836h;

    /* renamed from: i, reason: collision with root package name */
    public static final zn f14837i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ zn[] f14838j;

    /* renamed from: a, reason: collision with root package name */
    public final pk.c1 f14839a;

    static {
        v2 w13 = pk.c1.w(10, 9);
        Intrinsics.checkNotNullExpressionValue(w13, "of(...)");
        zn znVar = new zn("TOP_LEFT", 0, w13);
        f14831c = znVar;
        v2 w14 = pk.c1.w(10, 14);
        Intrinsics.checkNotNullExpressionValue(w14, "of(...)");
        zn znVar2 = new zn("TOP_CENTER", 1, w14);
        f14832d = znVar2;
        v2 w15 = pk.c1.w(10, 11);
        Intrinsics.checkNotNullExpressionValue(w15, "of(...)");
        zn znVar3 = new zn("TOP_RIGHT", 2, w15);
        f14833e = znVar3;
        v2 v13 = pk.c1.v(13);
        Intrinsics.checkNotNullExpressionValue(v13, "of(...)");
        zn znVar4 = new zn("CENTER", 3, v13);
        f14834f = znVar4;
        v2 w16 = pk.c1.w(12, 9);
        Intrinsics.checkNotNullExpressionValue(w16, "of(...)");
        zn znVar5 = new zn("BOTTOM_LEFT", 4, w16);
        f14835g = znVar5;
        v2 w17 = pk.c1.w(12, 14);
        Intrinsics.checkNotNullExpressionValue(w17, "of(...)");
        zn znVar6 = new zn("BOTTOM_CENTER", 5, w17);
        f14836h = znVar6;
        v2 w18 = pk.c1.w(12, 11);
        Intrinsics.checkNotNullExpressionValue(w18, "of(...)");
        zn znVar7 = new zn("BOTTOM_RIGHT", 6, w18);
        f14837i = znVar7;
        zn[] znVarArr = {znVar, znVar2, znVar3, znVar4, znVar5, znVar6, znVar7};
        f14838j = znVarArr;
        l0.b0(znVarArr);
        f14830b = new a.mg();
    }

    public zn(String str, int i13, pk.c1 c1Var) {
        this.f14839a = c1Var;
    }

    public static zn[] values() {
        return (zn[]) f14838j.clone();
    }
}
