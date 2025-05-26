package com.pinterest.api.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/pinterest/api/model/fo;", "Lcom/pinterest/api/model/wx;", "", "a", "F", "e", "()F", "video", "b", "music", "<init>", "(FF)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class fo extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("video")
    private final float video;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("music")
    private final float music;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public fo() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.fo.<init>():void");
    }

    /* renamed from: a, reason: from getter */
    public final float getMusic() {
        return this.music;
    }

    @Override // dl1.s
    public final String b() {
        return String.valueOf(hashCode());
    }

    /* renamed from: e, reason: from getter */
    public final float getVideo() {
        return this.video;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo)) {
            return false;
        }
        fo foVar = (fo) obj;
        return Float.compare(this.video, foVar.video) == 0 && Float.compare(this.music, foVar.music) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.music) + (Float.hashCode(this.video) * 31);
    }

    public final String toString() {
        return "IdeaPinAudioVolumeMix(video=" + this.video + ", music=" + this.music + ")";
    }

    public /* synthetic */ fo(float f13, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.5f : f13, (i13 & 2) != 0 ? 0.5f : f14);
    }

    public fo(float f13, float f14) {
        this.video = f13;
        this.music = f14;
    }
}
