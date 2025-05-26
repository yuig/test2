package h32;

import c50.t4;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class u {

    /* renamed from: i, reason: collision with root package name */
    public static final t4 f67259i = new t4(28);

    /* renamed from: a, reason: collision with root package name */
    public final Long f67260a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f67261b;

    /* renamed from: c, reason: collision with root package name */
    public final Long f67262c;

    /* renamed from: d, reason: collision with root package name */
    public final String f67263d;

    /* renamed from: e, reason: collision with root package name */
    public final Short f67264e;

    /* renamed from: f, reason: collision with root package name */
    public final Short f67265f;

    /* renamed from: g, reason: collision with root package name */
    public final String f67266g;

    /* renamed from: h, reason: collision with root package name */
    public final Short f67267h;

    public u(Long l13, Long l14, Long l15, String str, Short sh3, Short sh4, String str2, Short sh5) {
        this.f67260a = l13;
        this.f67261b = l14;
        this.f67262c = l15;
        this.f67263d = str;
        this.f67264e = sh3;
        this.f67265f = sh4;
        this.f67266g = str2;
        this.f67267h = sh5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f67260a, uVar.f67260a) && Intrinsics.d(this.f67261b, uVar.f67261b) && Intrinsics.d(this.f67262c, uVar.f67262c) && Intrinsics.d(this.f67263d, uVar.f67263d) && Intrinsics.d(this.f67264e, uVar.f67264e) && Intrinsics.d(this.f67265f, uVar.f67265f) && Intrinsics.d(this.f67266g, uVar.f67266g) && Intrinsics.d(this.f67267h, uVar.f67267h);
    }

    public final int hashCode() {
        Long l13 = this.f67260a;
        int hashCode = (l13 == null ? 0 : l13.hashCode()) * 31;
        Long l14 = this.f67261b;
        int hashCode2 = (hashCode + (l14 == null ? 0 : l14.hashCode())) * 31;
        Long l15 = this.f67262c;
        int hashCode3 = (hashCode2 + (l15 == null ? 0 : l15.hashCode())) * 31;
        String str = this.f67263d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Short sh3 = this.f67264e;
        int hashCode5 = (hashCode4 + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        Short sh4 = this.f67265f;
        int hashCode6 = (hashCode5 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        String str2 = this.f67266g;
        int hashCode7 = (hashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Short sh5 = this.f67267h;
        return hashCode7 + (sh5 != null ? sh5.hashCode() : 0);
    }

    public final String toString() {
        return "BoardMoreIdeasFeedUpsellImpression(boardId=" + this.f67260a + ", time=" + this.f67261b + ", endTime=" + this.f67262c + ", storyType=" + this.f67263d + ", slotIndex=" + this.f67264e + ", totalObjectCount=" + this.f67265f + ", boardIdStr=" + this.f67266g + ", storySlotIndex=" + this.f67267h + ")";
    }
}
