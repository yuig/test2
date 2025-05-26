package bw0;

import a.cb;
import com.pinterest.api.model.wn0;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final wn0 f23987a;

    /* renamed from: b, reason: collision with root package name */
    public final String f23988b;

    /* renamed from: c, reason: collision with root package name */
    public final String f23989c;

    /* renamed from: d, reason: collision with root package name */
    public final String f23990d;

    /* renamed from: e, reason: collision with root package name */
    public final Boolean f23991e;

    /* renamed from: f, reason: collision with root package name */
    public final String f23992f;

    /* renamed from: g, reason: collision with root package name */
    public final String f23993g;

    /* renamed from: h, reason: collision with root package name */
    public final String f23994h;

    /* renamed from: i, reason: collision with root package name */
    public final String f23995i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f23996j;

    /* renamed from: k, reason: collision with root package name */
    public final String f23997k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f23998l;

    /* renamed from: m, reason: collision with root package name */
    public final String f23999m;

    /* renamed from: n, reason: collision with root package name */
    public final String f24000n;

    /* renamed from: o, reason: collision with root package name */
    public final String f24001o;

    /* renamed from: p, reason: collision with root package name */
    public final String f24002p;

    /* renamed from: q, reason: collision with root package name */
    public final String f24003q;

    /* renamed from: r, reason: collision with root package name */
    public final String f24004r;

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f24005s;

    public h(wn0 storyPinMetadata, String boardId, String str, String str2, Boolean bool, String draftId, String str3, String str4, String str5, boolean z13, String str6, Integer num, String str7, String str8, String str9, String str10, String str11, String mediaExportSkipped, ArrayList sourceClipData) {
        Intrinsics.checkNotNullParameter(storyPinMetadata, "storyPinMetadata");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        Intrinsics.checkNotNullParameter(draftId, "draftId");
        Intrinsics.checkNotNullParameter(mediaExportSkipped, "mediaExportSkipped");
        Intrinsics.checkNotNullParameter(sourceClipData, "sourceClipData");
        this.f23987a = storyPinMetadata;
        this.f23988b = boardId;
        this.f23989c = str;
        this.f23990d = str2;
        this.f23991e = bool;
        this.f23992f = draftId;
        this.f23993g = str3;
        this.f23994h = str4;
        this.f23995i = str5;
        this.f23996j = z13;
        this.f23997k = str6;
        this.f23998l = num;
        this.f23999m = str7;
        this.f24000n = str8;
        this.f24001o = str9;
        this.f24002p = str10;
        this.f24003q = str11;
        this.f24004r = mediaExportSkipped;
        this.f24005s = sourceClipData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f23987a, hVar.f23987a) && Intrinsics.d(this.f23988b, hVar.f23988b) && Intrinsics.d(this.f23989c, hVar.f23989c) && Intrinsics.d(this.f23990d, hVar.f23990d) && Intrinsics.d(this.f23991e, hVar.f23991e) && Intrinsics.d(this.f23992f, hVar.f23992f) && Intrinsics.d(this.f23993g, hVar.f23993g) && Intrinsics.d(this.f23994h, hVar.f23994h) && Intrinsics.d(this.f23995i, hVar.f23995i) && this.f23996j == hVar.f23996j && Intrinsics.d(this.f23997k, hVar.f23997k) && Intrinsics.d(this.f23998l, hVar.f23998l) && Intrinsics.d(this.f23999m, hVar.f23999m) && Intrinsics.d(this.f24000n, hVar.f24000n) && Intrinsics.d(this.f24001o, hVar.f24001o) && Intrinsics.d(this.f24002p, hVar.f24002p) && Intrinsics.d(this.f24003q, hVar.f24003q) && Intrinsics.d(this.f24004r, hVar.f24004r) && Intrinsics.d(this.f24005s, hVar.f24005s);
    }

    public final int hashCode() {
        int d2 = cb.d(this.f23988b, this.f23987a.hashCode() * 31, 31);
        String str = this.f23989c;
        int hashCode = (d2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f23990d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f23991e;
        int d13 = cb.d(this.f23992f, (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31, 31);
        String str3 = this.f23993g;
        int hashCode3 = (d13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f23994h;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f23995i;
        int e13 = ep.b.e(this.f23996j, (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.f23997k;
        int hashCode5 = (e13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f23998l;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f23999m;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f24000n;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f24001o;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f24002p;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f24003q;
        return this.f24005s.hashCode() + cb.d(this.f24004r, (hashCode10 + (str11 != null ? str11.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "StoryPinCreateData(storyPinMetadata=" + this.f23987a + ", boardId=" + this.f23988b + ", boardSectionId=" + this.f23989c + ", boardName=" + this.f23990d + ", isDraft=" + this.f23991e + ", draftId=" + this.f23992f + ", entryType=" + this.f23993g + ", mediaType=" + this.f23994h + ", altText=" + this.f23995i + ", commentsEnabled=" + this.f23996j + ", link=" + this.f23997k + ", scheduleDateSeconds=" + this.f23998l + ", freeformTags=" + this.f23999m + ", interestIds=" + this.f24000n + ", interestLabels=" + this.f24001o + ", description=" + this.f24002p + ", descriptionUserTags=" + this.f24003q + ", mediaExportSkipped=" + this.f24004r + ", sourceClipData=" + this.f24005s + ")";
    }
}
