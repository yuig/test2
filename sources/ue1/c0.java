package ue1;

import a.cb;
import com.pinterest.api.model.wy0;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class c0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final wy0 f121990a;

    /* renamed from: b, reason: collision with root package name */
    public final oa2.l f121991b;

    /* renamed from: c, reason: collision with root package name */
    public final yl1.b f121992c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f121993d;

    /* renamed from: e, reason: collision with root package name */
    public final List f121994e;

    /* renamed from: f, reason: collision with root package name */
    public final String f121995f;

    /* renamed from: g, reason: collision with root package name */
    public final int f121996g;

    /* renamed from: h, reason: collision with root package name */
    public final xr0.a f121997h;

    /* renamed from: i, reason: collision with root package name */
    public final vn1.g f121998i;

    /* renamed from: j, reason: collision with root package name */
    public final e0 f121999j;

    public c0(@NotNull wy0 user, @NotNull oa2.l userRepActionListener, yl1.b bVar, boolean z13, List<String> list, @NotNull String storyId, int i13, @NotNull xr0.a userImpressionProvider, @NotNull vn1.g titleVariant, e0 e0Var) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(userRepActionListener, "userRepActionListener");
        Intrinsics.checkNotNullParameter(storyId, "storyId");
        Intrinsics.checkNotNullParameter(userImpressionProvider, "userImpressionProvider");
        Intrinsics.checkNotNullParameter(titleVariant, "titleVariant");
        this.f121990a = user;
        this.f121991b = userRepActionListener;
        this.f121992c = bVar;
        this.f121993d = z13;
        this.f121994e = list;
        this.f121995f = storyId;
        this.f121996g = i13;
        this.f121997h = userImpressionProvider;
        this.f121998i = titleVariant;
        this.f121999j = e0Var;
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getUid() {
        String uid = this.f121990a.getUid();
        Intrinsics.checkNotNullExpressionValue(uid, "getUid(...)");
        return uid;
    }

    @Override // ue1.a0
    public final String d() {
        List list = this.f121994e;
        if (list != null) {
            return (String) CollectionsKt.firstOrNull(list);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.d(this.f121990a, c0Var.f121990a) && Intrinsics.d(this.f121991b, c0Var.f121991b) && Intrinsics.d(this.f121992c, c0Var.f121992c) && this.f121993d == c0Var.f121993d && Intrinsics.d(this.f121994e, c0Var.f121994e) && Intrinsics.d(this.f121995f, c0Var.f121995f) && this.f121996g == c0Var.f121996g && Intrinsics.d(this.f121997h, c0Var.f121997h) && this.f121998i == c0Var.f121998i && this.f121999j == c0Var.f121999j;
    }

    @Override // ue1.a0
    public final boolean f() {
        e0 e0Var = this.f121999j;
        return e0Var != null && b0.f121988a[e0Var.ordinal()] == 1;
    }

    public final int hashCode() {
        int hashCode = (this.f121991b.hashCode() + (this.f121990a.hashCode() * 31)) * 31;
        yl1.b bVar = this.f121992c;
        int e13 = ep.b.e(this.f121993d, (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31);
        List list = this.f121994e;
        int hashCode2 = (this.f121998i.hashCode() + ((this.f121997h.hashCode() + ep.b.b(this.f121996g, cb.d(this.f121995f, (e13 + (list == null ? 0 : list.hashCode())) * 31, 31), 31)) * 31)) * 31;
        e0 e0Var = this.f121999j;
        return hashCode2 + (e0Var != null ? e0Var.hashCode() : 0);
    }

    @Override // ue1.a0
    public final p i() {
        return this.f121999j;
    }

    @Override // ue1.a0
    public final int m() {
        return RecyclerViewTypes.VIEW_TYPE_USER;
    }

    @Override // ue1.a0
    public final m p() {
        return null;
    }

    @Override // ue1.a0
    public final int t() {
        e0 e0Var = this.f121999j;
        return (e0Var != null && b0.f121988a[e0Var.ordinal()] == 1) ? xe1.v.B : xe1.v.f134804s;
    }

    public final String toString() {
        return "UserRepItemViewModel(user=" + this.f121990a + ", userRepActionListener=" + this.f121991b + ", actionButtonState=" + this.f121992c + ", isVerifiedMerchant=" + this.f121993d + ", previewImages=" + this.f121994e + ", storyId=" + this.f121995f + ", storyPosition=" + this.f121996g + ", userImpressionProvider=" + this.f121997h + ", titleVariant=" + this.f121998i + ", repStyle=" + this.f121999j + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c0(com.pinterest.api.model.wy0 r14, oa2.l r15, yl1.b r16, boolean r17, java.util.List r18, java.lang.String r19, int r20, xr0.a r21, vn1.g r22, ue1.e0 r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto Lc
            ps0.m r1 = vn1.h.f126275a
            vn1.g r1 = vn1.h.f126278d
            r11 = r1
            goto Le
        Lc:
            r11 = r22
        Le:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L15
            r0 = 0
            r12 = r0
            goto L17
        L15:
            r12 = r23
        L17:
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ue1.c0.<init>(com.pinterest.api.model.wy0, oa2.l, yl1.b, boolean, java.util.List, java.lang.String, int, xr0.a, vn1.g, ue1.e0, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
