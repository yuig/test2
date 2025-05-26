package tg1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f117584a;

    /* renamed from: b, reason: collision with root package name */
    public final String f117585b;

    /* renamed from: c, reason: collision with root package name */
    public final String f117586c;

    /* renamed from: d, reason: collision with root package name */
    public final String f117587d;

    /* renamed from: e, reason: collision with root package name */
    public final c f117588e;

    public e(String boardUID, String str, String str2, String str3, c cVar) {
        Intrinsics.checkNotNullParameter(boardUID, "boardUID");
        this.f117584a = boardUID;
        this.f117585b = str;
        this.f117586c = str2;
        this.f117587d = str3;
        this.f117588e = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f117584a, eVar.f117584a) && Intrinsics.d(this.f117585b, eVar.f117585b) && Intrinsics.d(this.f117586c, eVar.f117586c) && Intrinsics.d(this.f117587d, eVar.f117587d) && Intrinsics.d(this.f117588e, eVar.f117588e);
    }

    public final int hashCode() {
        int hashCode = this.f117584a.hashCode() * 31;
        String str = this.f117585b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f117586c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f117587d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        c cVar = this.f117588e;
        return hashCode4 + (cVar != null ? cVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpotlightBoardViewModel(boardUID=" + this.f117584a + ", image=" + this.f117585b + ", title=" + this.f117586c + ", subtitle=" + this.f117587d + ", user=" + this.f117588e + ")";
    }
}
