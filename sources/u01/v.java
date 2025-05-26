package u01;

import a.cb;
import h32.a4;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v implements i01.e {

    /* renamed from: a, reason: collision with root package name */
    public final String f119948a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119949b;

    /* renamed from: c, reason: collision with root package name */
    public final String f119950c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f119951d;

    /* renamed from: e, reason: collision with root package name */
    public final String f119952e;

    /* renamed from: f, reason: collision with root package name */
    public final String f119953f;

    /* renamed from: g, reason: collision with root package name */
    public final a4 f119954g;

    /* renamed from: h, reason: collision with root package name */
    public final i01.p f119955h;

    /* renamed from: i, reason: collision with root package name */
    public final u f119956i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f119957j;

    /* renamed from: k, reason: collision with root package name */
    public final String f119958k;

    /* renamed from: l, reason: collision with root package name */
    public final int f119959l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f119960m;

    /* renamed from: n, reason: collision with root package name */
    public final String f119961n;

    public v(String pinUid, String navigationSource, String str, boolean z13, String str2, String str3, a4 a4Var, i01.p navigationArrivalExtras, u featuredCommentMetadata, boolean z14, String str4, int i13, ArrayList arrayList, String str5) {
        Intrinsics.checkNotNullParameter(pinUid, "pinUid");
        Intrinsics.checkNotNullParameter(navigationSource, "navigationSource");
        Intrinsics.checkNotNullParameter(navigationArrivalExtras, "navigationArrivalExtras");
        Intrinsics.checkNotNullParameter(featuredCommentMetadata, "featuredCommentMetadata");
        this.f119948a = pinUid;
        this.f119949b = navigationSource;
        this.f119950c = str;
        this.f119951d = z13;
        this.f119952e = str2;
        this.f119953f = str3;
        this.f119954g = a4Var;
        this.f119955h = navigationArrivalExtras;
        this.f119956i = featuredCommentMetadata;
        this.f119957j = z14;
        this.f119958k = str4;
        this.f119959l = i13;
        this.f119960m = arrayList;
        this.f119961n = str5;
    }

    public final u a() {
        return this.f119956i;
    }

    public final String b() {
        return this.f119952e;
    }

    public final i01.p c() {
        return this.f119955h;
    }

    public final String d() {
        return this.f119949b;
    }

    @Override // i01.e
    public final String e() {
        return this.f119961n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return Intrinsics.d(this.f119948a, vVar.f119948a) && Intrinsics.d(this.f119949b, vVar.f119949b) && Intrinsics.d(this.f119950c, vVar.f119950c) && this.f119951d == vVar.f119951d && Intrinsics.d(this.f119952e, vVar.f119952e) && Intrinsics.d(this.f119953f, vVar.f119953f) && this.f119954g == vVar.f119954g && Intrinsics.d(this.f119955h, vVar.f119955h) && Intrinsics.d(this.f119956i, vVar.f119956i) && this.f119957j == vVar.f119957j && Intrinsics.d(this.f119958k, vVar.f119958k) && this.f119959l == vVar.f119959l && Intrinsics.d(this.f119960m, vVar.f119960m) && Intrinsics.d(this.f119961n, vVar.f119961n);
    }

    @Override // i01.e
    public final String f() {
        return this.f119950c;
    }

    public final boolean g() {
        return this.f119951d;
    }

    public final String h() {
        return this.f119950c;
    }

    public final int hashCode() {
        int d2 = cb.d(this.f119949b, this.f119948a.hashCode() * 31, 31);
        String str = this.f119950c;
        int e13 = ep.b.e(this.f119951d, (d2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f119952e;
        int hashCode = (e13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f119953f;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        a4 a4Var = this.f119954g;
        int e14 = ep.b.e(this.f119957j, (this.f119956i.hashCode() + ((this.f119955h.hashCode() + ((hashCode2 + (a4Var == null ? 0 : a4Var.hashCode())) * 31)) * 31)) * 31, 31);
        String str4 = this.f119958k;
        int b13 = ep.b.b(this.f119959l, (e14 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        ArrayList arrayList = this.f119960m;
        int hashCode3 = (b13 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        String str5 = this.f119961n;
        return hashCode3 + (str5 != null ? str5.hashCode() : 0);
    }

    public final a4 i() {
        return this.f119954g;
    }

    public final boolean j() {
        return this.f119957j;
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("PinCloseupNavigationMetadata(pinUid=");
        sb3.append(this.f119948a);
        sb3.append(", navigationSource=");
        sb3.append(this.f119949b);
        sb3.append(", sourceSearchQuery=");
        sb3.append(this.f119950c);
        sb3.append(", showReactionList=");
        sb3.append(this.f119951d);
        sb3.append(", feedTrackingParam=");
        sb3.append(this.f119952e);
        sb3.append(", deepLinkCurrentPageUrl=");
        sb3.append(this.f119953f);
        sb3.append(", viewParameterTypeOverride=");
        sb3.append(this.f119954g);
        sb3.append(", navigationArrivalExtras=");
        sb3.append(this.f119955h);
        sb3.append(", featuredCommentMetadata=");
        sb3.append(this.f119956i);
        sb3.append(", isAdPreview=");
        sb3.append(this.f119957j);
        sb3.append(", navigationTopLevelSource=");
        sb3.append(this.f119958k);
        sb3.append(", navigationTopLevelSourceDepth=");
        sb3.append(this.f119959l);
        sb3.append(", contextPinIds=");
        sb3.append(this.f119960m);
        sb3.append(", closeupModuleSource=");
        return a.a.p(sb3, this.f119961n, ")");
    }

    @Override // i01.e
    public final ArrayList w() {
        return this.f119960m;
    }

    @Override // i01.e
    public final int y() {
        return this.f119959l;
    }

    @Override // i01.e
    public final String z() {
        return this.f119958k;
    }
}
