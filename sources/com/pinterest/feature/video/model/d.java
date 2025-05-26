package com.pinterest.feature.video.model;

import a.cb;
import com.pinterest.feature.core.view.RecyclerViewTypes;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final e f48998a;

    /* renamed from: b, reason: collision with root package name */
    public final String f48999b;

    /* renamed from: c, reason: collision with root package name */
    public final int f49000c;

    /* renamed from: d, reason: collision with root package name */
    public final String f49001d;

    /* renamed from: e, reason: collision with root package name */
    public final float f49002e;

    /* renamed from: f, reason: collision with root package name */
    public final float f49003f;

    /* renamed from: g, reason: collision with root package name */
    public final long f49004g;

    /* renamed from: h, reason: collision with root package name */
    public final String f49005h;

    /* renamed from: i, reason: collision with root package name */
    public final String f49006i;

    /* renamed from: j, reason: collision with root package name */
    public final String f49007j;

    /* renamed from: k, reason: collision with root package name */
    public final String f49008k;

    public d(e state, String str, int i13, String str2, float f13, float f14, long j13, String str3, String str4, String str5, String str6, int i14) {
        String str7 = (i14 & 2) != 0 ? null : str;
        int i15 = (i14 & 4) != 0 ? pt1.c.notification_upload_begin : i13;
        String str8 = (i14 & 8) != 0 ? null : str2;
        float f15 = (i14 & 16) != 0 ? 0.0f : f13;
        float f16 = (i14 & 32) != 0 ? 1.0f : f14;
        long j14 = (i14 & 64) != 0 ? 500L : j13;
        String uniqueWorkName = (i14 & RecyclerViewTypes.VIEW_TYPE_ONE_TAP_SAVE_PIN_FEEDBACK_FULL_SPAN) != 0 ? "UPLOAD_MEDIA_WORKER_TAG" : str3;
        String pinId = (i14 & RecyclerViewTypes.VIEW_TYPE_OTHER_BOARD_MORE_IDEAS_FEED_PAGES_HEADER) != 0 ? "" : str4;
        String boardId = (i14 & BitmapUtils.BITMAP_TO_JPEG_SIZE) == 0 ? str5 : "";
        String str9 = (i14 & 1024) == 0 ? str6 : null;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(uniqueWorkName, "uniqueWorkName");
        Intrinsics.checkNotNullParameter(pinId, "pinId");
        Intrinsics.checkNotNullParameter(boardId, "boardId");
        this.f48998a = state;
        this.f48999b = str7;
        this.f49000c = i15;
        this.f49001d = str8;
        this.f49002e = f15;
        this.f49003f = f16;
        this.f49004g = j14;
        this.f49005h = uniqueWorkName;
        this.f49006i = pinId;
        this.f49007j = boardId;
        this.f49008k = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f48998a == dVar.f48998a && Intrinsics.d(this.f48999b, dVar.f48999b) && this.f49000c == dVar.f49000c && Intrinsics.d(this.f49001d, dVar.f49001d) && Float.compare(this.f49002e, dVar.f49002e) == 0 && Float.compare(this.f49003f, dVar.f49003f) == 0 && this.f49004g == dVar.f49004g && Intrinsics.d(this.f49005h, dVar.f49005h) && Intrinsics.d(this.f49006i, dVar.f49006i) && Intrinsics.d(this.f49007j, dVar.f49007j) && Intrinsics.d(this.f49008k, dVar.f49008k);
    }

    public final int hashCode() {
        int hashCode = this.f48998a.hashCode() * 31;
        String str = this.f48999b;
        int b13 = ep.b.b(this.f49000c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f49001d;
        int d2 = cb.d(this.f49007j, cb.d(this.f49006i, cb.d(this.f49005h, a.a.c(this.f49004g, a.a.a(this.f49003f, a.a.a(this.f49002e, (b13 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        String str3 = this.f49008k;
        return d2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("UploadEvent(state=");
        sb3.append(this.f48998a);
        sb3.append(", filePath=");
        sb3.append(this.f48999b);
        sb3.append(", textResource=");
        sb3.append(this.f49000c);
        sb3.append(", text=");
        sb3.append(this.f49001d);
        sb3.append(", initialProgress=");
        sb3.append(this.f49002e);
        sb3.append(", targetProgress=");
        sb3.append(this.f49003f);
        sb3.append(", progressDuration=");
        sb3.append(this.f49004g);
        sb3.append(", uniqueWorkName=");
        sb3.append(this.f49005h);
        sb3.append(", pinId=");
        sb3.append(this.f49006i);
        sb3.append(", boardId=");
        sb3.append(this.f49007j);
        sb3.append(", creationSessionId=");
        return a.a.p(sb3, this.f49008k, ")");
    }
}
