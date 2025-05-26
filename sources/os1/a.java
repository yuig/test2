package os1;

import com.pinterest.api.model.f30;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import h32.e;
import h32.k0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f97499a;

    /* renamed from: b, reason: collision with root package name */
    public final f30 f97500b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f97501c;

    /* renamed from: d, reason: collision with root package name */
    public final String f97502d;

    /* renamed from: e, reason: collision with root package name */
    public final String f97503e;

    /* renamed from: f, reason: collision with root package name */
    public final Integer f97504f;

    /* renamed from: g, reason: collision with root package name */
    public final k0 f97505g;

    /* renamed from: h, reason: collision with root package name */
    public final String f97506h;

    /* renamed from: i, reason: collision with root package name */
    public final String f97507i;

    /* renamed from: j, reason: collision with root package name */
    public final Short f97508j;

    /* renamed from: k, reason: collision with root package name */
    public final String f97509k;

    /* renamed from: l, reason: collision with root package name */
    public final e f97510l;

    public /* synthetic */ a(long j13, f30 f30Var, Boolean bool, String str, String str2, Integer num, k0 k0Var, String str3, String str4, Short sh3, String str5, e eVar, int i13) {
        this(j13, f30Var, bool, str, (i13 & 16) != 0 ? null : str2, (i13 & 32) != 0 ? null : num, (i13 & 64) != 0 ? null : k0Var, (i13 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? null : str3, (i13 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? null : str4, sh3, (i13 & 1024) != 0 ? null : str5, (i13 & 2048) != 0 ? null : eVar);
    }

    public final e a() {
        return this.f97510l;
    }

    public final long b() {
        return this.f97499a;
    }

    public final Integer c() {
        return this.f97504f;
    }

    public final k0 d() {
        return this.f97505g;
    }

    public final Short e() {
        return this.f97508j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f97499a == aVar.f97499a && Intrinsics.d(this.f97500b, aVar.f97500b) && Intrinsics.d(this.f97501c, aVar.f97501c) && Intrinsics.d(this.f97502d, aVar.f97502d) && Intrinsics.d(this.f97503e, aVar.f97503e) && Intrinsics.d(this.f97504f, aVar.f97504f) && Intrinsics.d(this.f97505g, aVar.f97505g) && Intrinsics.d(this.f97506h, aVar.f97506h) && Intrinsics.d(this.f97507i, aVar.f97507i) && Intrinsics.d(this.f97508j, aVar.f97508j) && Intrinsics.d(this.f97509k, aVar.f97509k) && Intrinsics.d(this.f97510l, aVar.f97510l);
    }

    public final String f() {
        return this.f97509k;
    }

    public final String g() {
        return this.f97503e;
    }

    public final Boolean h() {
        return this.f97501c;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.f97499a) * 31;
        f30 f30Var = this.f97500b;
        int hashCode2 = (hashCode + (f30Var == null ? 0 : f30Var.hashCode())) * 31;
        Boolean bool = this.f97501c;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f97502d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f97503e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f97504f;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        k0 k0Var = this.f97505g;
        int hashCode7 = (hashCode6 + (k0Var == null ? 0 : k0Var.hashCode())) * 31;
        String str3 = this.f97506h;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f97507i;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Short sh3 = this.f97508j;
        int hashCode10 = (hashCode9 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str5 = this.f97509k;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        e eVar = this.f97510l;
        return hashCode11 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String i() {
        return this.f97507i;
    }

    public final f30 j() {
        return this.f97500b;
    }

    public final String k() {
        return this.f97506h;
    }

    public final String l() {
        return this.f97502d;
    }

    public final String toString() {
        return "DeepLinkClickthroughData(clickthroughStartTime=" + this.f97499a + ", sourcePin=" + this.f97500b + ", mdlDidSucceed=" + this.f97501c + ", trackingParam=" + this.f97502d + ", insertionId=" + this.f97503e + ", collectionSelectedPosition=" + this.f97504f + ", dcoEventData=" + this.f97505g + ", storyType=" + this.f97506h + ", parentDlAdCloseupIngressVariant=" + this.f97507i + ", dlAdCloseupIngressVariant=" + this.f97508j + ", dlAdCloseupParentObjectId=" + this.f97509k + ", adDataEventData=" + this.f97510l + ")";
    }

    public a(long j13, f30 f30Var, Boolean bool, String str, String str2, Integer num, k0 k0Var, String str3, String str4, Short sh3, String str5, e eVar) {
        this.f97499a = j13;
        this.f97500b = f30Var;
        this.f97501c = bool;
        this.f97502d = str;
        this.f97503e = str2;
        this.f97504f = num;
        this.f97505g = k0Var;
        this.f97506h = str3;
        this.f97507i = str4;
        this.f97508j = sh3;
        this.f97509k = str5;
        this.f97510l = eVar;
    }
}
