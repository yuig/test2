package nk1;

import a.cb;
import com.pinterest.api.model.wy0;
import java.util.List;
import kotlin.collections.q0;
import kotlin.jvm.internal.Intrinsics;
import z40.x;
import z40.y;

/* loaded from: classes5.dex */
public final class r implements y {

    /* renamed from: b, reason: collision with root package name */
    public final String f91167b;

    /* renamed from: c, reason: collision with root package name */
    public final String f91168c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f91169d;

    /* renamed from: e, reason: collision with root package name */
    public final int f91170e;

    /* renamed from: f, reason: collision with root package name */
    public final String f91171f;

    /* renamed from: g, reason: collision with root package name */
    public final String f91172g;

    /* renamed from: h, reason: collision with root package name */
    public final String f91173h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f91174i;

    /* renamed from: j, reason: collision with root package name */
    public final q f91175j;

    /* renamed from: k, reason: collision with root package name */
    public final q0 f91176k;

    /* renamed from: l, reason: collision with root package name */
    public final q0 f91177l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f91178m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f91179n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f91180o;

    public r(wy0 wy0Var) {
        String id3 = wy0Var.getId();
        Intrinsics.checkNotNullExpressionValue(id3, "getUid(...)");
        this.f91167b = id3;
        String id4 = wy0Var.getId();
        Intrinsics.checkNotNullExpressionValue(id4, "getUid(...)");
        this.f91168c = id4;
        Boolean R2 = wy0Var.R2();
        Intrinsics.checkNotNullExpressionValue(R2, "getExplicitlyFollowedByMe(...)");
        this.f91169d = R2.booleanValue();
        Integer V2 = wy0Var.V2();
        Intrinsics.checkNotNullExpressionValue(V2, "getFollowerCount(...)");
        this.f91170e = V2.intValue();
        this.f91171f = wy0Var.Z2();
        this.f91172g = wy0Var.l3();
        this.f91173h = wy0Var.z4();
        this.f91174i = cb.y(wy0Var, "getIsVerifiedMerchant(...)");
        this.f91175j = new q(wy0Var);
        q0 q0Var = q0.f80391a;
        this.f91176k = q0Var;
        this.f91177l = q0Var;
        Boolean u43 = wy0Var.u4();
        Intrinsics.checkNotNullExpressionValue(u43, "getShowCreatorProfile(...)");
        this.f91178m = u43.booleanValue();
        Boolean s22 = wy0Var.s2();
        Intrinsics.checkNotNullExpressionValue(s22, "getBlockedByMe(...)");
        this.f91179n = s22.booleanValue();
        Boolean J3 = wy0Var.J3();
        Intrinsics.checkNotNullExpressionValue(J3, "getIsPrivateProfile(...)");
        this.f91180o = J3.booleanValue();
    }

    @Override // z40.y
    public final String a() {
        return this.f91168c;
    }

    @Override // z40.y
    public final String b() {
        return this.f91172g;
    }

    @Override // z40.y
    public final Integer c() {
        return Integer.valueOf(this.f91170e);
    }

    @Override // z40.y
    public final Boolean d() {
        return Boolean.valueOf(this.f91169d);
    }

    @Override // z40.y
    public final String f() {
        return this.f91171f;
    }

    @Override // z40.y
    public final String g() {
        return this.f91173h;
    }

    @Override // z40.y
    public final String getId() {
        return this.f91167b;
    }

    @Override // z40.y
    public final Boolean h() {
        return Boolean.valueOf(this.f91174i);
    }

    @Override // z40.y
    public final x i() {
        return this.f91175j;
    }

    @Override // z40.y
    public final Boolean j() {
        return Boolean.valueOf(this.f91180o);
    }

    @Override // z40.y
    public final Boolean k() {
        return Boolean.valueOf(this.f91178m);
    }

    @Override // z40.y
    public final List l() {
        return this.f91176k;
    }

    @Override // z40.y
    public final Boolean m() {
        return Boolean.valueOf(this.f91179n);
    }

    @Override // z40.y
    public final List n() {
        return this.f91177l;
    }
}
