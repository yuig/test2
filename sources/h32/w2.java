package h32;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class w2 {

    /* renamed from: f, reason: collision with root package name */
    public static final c50.w2 f67356f = new c50.w2(3);

    /* renamed from: a, reason: collision with root package name */
    public final Boolean f67357a;

    /* renamed from: b, reason: collision with root package name */
    public final Short f67358b;

    /* renamed from: c, reason: collision with root package name */
    public final String f67359c;

    /* renamed from: d, reason: collision with root package name */
    public final Short f67360d;

    /* renamed from: e, reason: collision with root package name */
    public final Short f67361e;

    public w2(Boolean bool, Short sh3, String str, Short sh4, Short sh5, y2 y2Var) {
        this.f67357a = bool;
        this.f67358b = sh3;
        this.f67359c = str;
        this.f67360d = sh4;
        this.f67361e = sh5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2)) {
            return false;
        }
        w2 w2Var = (w2) obj;
        if (!Intrinsics.d(this.f67357a, w2Var.f67357a) || !Intrinsics.d(this.f67358b, w2Var.f67358b) || !Intrinsics.d(this.f67359c, w2Var.f67359c) || !Intrinsics.d(this.f67360d, w2Var.f67360d) || !Intrinsics.d(this.f67361e, w2Var.f67361e)) {
            return false;
        }
        w2Var.getClass();
        return Intrinsics.d(null, null);
    }

    public final int hashCode() {
        Boolean bool = this.f67357a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Short sh3 = this.f67358b;
        int hashCode2 = (hashCode + (sh3 == null ? 0 : sh3.hashCode())) * 31;
        String str = this.f67359c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Short sh4 = this.f67360d;
        int hashCode4 = (hashCode3 + (sh4 == null ? 0 : sh4.hashCode())) * 31;
        Short sh5 = this.f67361e;
        return ((hashCode4 + (sh5 == null ? 0 : sh5.hashCode())) * 31) + 0;
    }

    public final String toString() {
        return "StoryPinData(isExpressive=" + this.f67357a + ", numPages=" + this.f67358b + ", storyPinDataIdStr=" + this.f67359c + ", numImages=" + this.f67360d + ", numVideos=" + this.f67361e + ", swipeEventData=" + ((Object) null) + ")";
    }
}
