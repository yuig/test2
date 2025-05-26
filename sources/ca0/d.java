package ca0;

import a.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import net.quikkly.android.utils.BitmapUtils;
import r72.q1;

/* loaded from: classes5.dex */
public final class d implements u50.o {

    /* renamed from: a, reason: collision with root package name */
    public final u50.i0 f27082a;

    /* renamed from: b, reason: collision with root package name */
    public final List f27083b;

    /* renamed from: c, reason: collision with root package name */
    public final q1 f27084c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27085d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27086e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27087f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f27088g;

    /* renamed from: h, reason: collision with root package name */
    public final u50.i0 f27089h;

    /* renamed from: i, reason: collision with root package name */
    public final u2.c f27090i;

    /* renamed from: j, reason: collision with root package name */
    public final c f27091j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27092k;

    /* renamed from: l, reason: collision with root package name */
    public final zy.a0 f27093l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public d(u50.f0 r20, kotlin.collections.q0 r21, ca0.c r22, boolean r23, int r24) {
        /*
            r19 = this;
            r0 = r24
            r1 = r0 & 1
            java.lang.String r2 = "formatArgs"
            r3 = 0
            if (r1 == 0) goto L1c
            int r1 = s80.l7.publish_screen_title_create_pin
            java.lang.String[] r4 = new java.lang.String[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
            u50.k0 r5 = new u50.k0
            r5.<init>(r1, r4)
            r7 = r5
            goto L1e
        L1c:
            r7 = r20
        L1e:
            r1 = r0 & 2
            if (r1 == 0) goto L26
            kotlin.collections.q0 r1 = kotlin.collections.q0.f80391a
            r8 = r1
            goto L28
        L26:
            r8 = r21
        L28:
            r72.q1 r9 = r72.q1.f106625d
            int r1 = s80.l7.publish_cta_label_primary_create
            java.lang.String[] r4 = new java.lang.String[r3]
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            u50.k0 r14 = new u50.k0
            r14.<init>(r1, r2)
            u2.g r15 = u2.b.f120026n
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L46
            ca0.b r1 = ca0.b.f27072a
            r16 = r1
            goto L48
        L46:
            r16 = r22
        L48:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L4f
            r17 = r3
            goto L51
        L4f:
            r17 = r23
        L51:
            zy.a0 r18 = new zy.a0
            r18.<init>()
            java.lang.String r12 = ""
            r13 = 1
            r6 = r19
            r10 = r12
            r11 = r12
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca0.d.<init>(u50.f0, kotlin.collections.q0, ca0.c, boolean, int):void");
    }

    public static d e(d dVar, List list, q1 q1Var, String str, String str2, String str3, boolean z13, c cVar, boolean z14, zy.a0 a0Var, int i13) {
        u50.i0 screenTitle = dVar.f27082a;
        List collageItems = (i13 & 2) != 0 ? dVar.f27083b : list;
        q1 shuffleEffectData = (i13 & 4) != 0 ? dVar.f27084c : q1Var;
        String title = (i13 & 8) != 0 ? dVar.f27085d : str;
        String description = (i13 & 16) != 0 ? dVar.f27086e : str2;
        String altText = (i13 & 32) != 0 ? dVar.f27087f : str3;
        boolean z15 = (i13 & 64) != 0 ? dVar.f27088g : z13;
        u50.i0 primaryCta = dVar.f27089h;
        u2.c previewAlignment = dVar.f27090i;
        c selectedBoard = (i13 & BitmapUtils.BITMAP_TO_JPEG_SIZE) != 0 ? dVar.f27091j : cVar;
        boolean z16 = (i13 & 1024) != 0 ? dVar.f27092k : z14;
        zy.a0 pinalyticsDisplayState = (i13 & 2048) != 0 ? dVar.f27093l : a0Var;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(collageItems, "collageItems");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(previewAlignment, "previewAlignment");
        Intrinsics.checkNotNullParameter(selectedBoard, "selectedBoard");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        return new d(screenTitle, collageItems, shuffleEffectData, title, description, altText, z15, primaryCta, previewAlignment, selectedBoard, z16, pinalyticsDisplayState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f27082a, dVar.f27082a) && Intrinsics.d(this.f27083b, dVar.f27083b) && Intrinsics.d(this.f27084c, dVar.f27084c) && Intrinsics.d(this.f27085d, dVar.f27085d) && Intrinsics.d(this.f27086e, dVar.f27086e) && Intrinsics.d(this.f27087f, dVar.f27087f) && this.f27088g == dVar.f27088g && Intrinsics.d(this.f27089h, dVar.f27089h) && Intrinsics.d(this.f27090i, dVar.f27090i) && Intrinsics.d(this.f27091j, dVar.f27091j) && this.f27092k == dVar.f27092k && Intrinsics.d(this.f27093l, dVar.f27093l);
    }

    public final int hashCode() {
        return this.f27093l.hashCode() + ep.b.e(this.f27092k, (this.f27091j.hashCode() + a.a.a(((u2.g) this.f27090i).f120032a, ep.b.d(this.f27089h, ep.b.e(this.f27088g, cb.d(this.f27087f, cb.d(this.f27086e, cb.d(this.f27085d, (this.f27084c.hashCode() + ep.b.c(this.f27083b, this.f27082a.hashCode() * 31, 31)) * 31, 31), 31), 31), 31), 31), 31)) * 31, 31);
    }

    public final String toString() {
        return "CollagePublishDisplayState(screenTitle=" + this.f27082a + ", collageItems=" + this.f27083b + ", shuffleEffectData=" + this.f27084c + ", title=" + this.f27085d + ", description=" + this.f27086e + ", altText=" + this.f27087f + ", isRemixEnabled=" + this.f27088g + ", primaryCta=" + this.f27089h + ", previewAlignment=" + this.f27090i + ", selectedBoard=" + this.f27091j + ", publishEnabled=" + this.f27092k + ", pinalyticsDisplayState=" + this.f27093l + ")";
    }

    public d(u50.i0 screenTitle, List collageItems, q1 shuffleEffectData, String title, String description, String altText, boolean z13, u50.i0 primaryCta, u2.c previewAlignment, c selectedBoard, boolean z14, zy.a0 pinalyticsDisplayState) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(collageItems, "collageItems");
        Intrinsics.checkNotNullParameter(shuffleEffectData, "shuffleEffectData");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(altText, "altText");
        Intrinsics.checkNotNullParameter(primaryCta, "primaryCta");
        Intrinsics.checkNotNullParameter(previewAlignment, "previewAlignment");
        Intrinsics.checkNotNullParameter(selectedBoard, "selectedBoard");
        Intrinsics.checkNotNullParameter(pinalyticsDisplayState, "pinalyticsDisplayState");
        this.f27082a = screenTitle;
        this.f27083b = collageItems;
        this.f27084c = shuffleEffectData;
        this.f27085d = title;
        this.f27086e = description;
        this.f27087f = altText;
        this.f27088g = z13;
        this.f27089h = primaryCta;
        this.f27090i = previewAlignment;
        this.f27091j = selectedBoard;
        this.f27092k = z14;
        this.f27093l = pinalyticsDisplayState;
    }
}
