package c72;

import kotlin.jvm.internal.Intrinsics;
import r72.x0;
import r72.y0;
import r72.z0;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n72.m f26896a;

    /* renamed from: b, reason: collision with root package name */
    public final org.chromium.net.y f26897b;

    /* renamed from: c, reason: collision with root package name */
    public final n f26898c;

    public f(m72.a shuffleCoreLogger, org.chromium.net.y shuffleStatsTracker, n entityMapperEffectData) {
        Intrinsics.checkNotNullParameter(shuffleCoreLogger, "shuffleCoreLogger");
        Intrinsics.checkNotNullParameter(shuffleStatsTracker, "shuffleStatsTracker");
        Intrinsics.checkNotNullParameter(entityMapperEffectData, "entityMapperEffectData");
        this.f26896a = shuffleCoreLogger;
        this.f26897b = shuffleStatsTracker;
        this.f26898c = entityMapperEffectData;
    }

    public static q72.c c(e72.i iVar) {
        if (iVar == null) {
            return null;
        }
        String str = iVar.f57655b;
        String str2 = str == null ? "" : str;
        String str3 = iVar.f57656c;
        String str4 = str3 == null ? "" : str3;
        String str5 = iVar.f57657d;
        String str6 = str5 == null ? "" : str5;
        String str7 = iVar.f57658e;
        String str8 = str7 == null ? "" : str7;
        String str9 = iVar.f57659f;
        String str10 = str9 == null ? "" : str9;
        String str11 = iVar.f57660g;
        String str12 = str11 == null ? "" : str11;
        String str13 = iVar.f57661h;
        return new q72.c(iVar.f57654a, str2, str4, str6, str8, str10, str12, str13 == null ? "" : str13);
    }

    public final x0 a(f72.i iVar) {
        y0 b13;
        if (iVar == null) {
            this.f26896a.a(e.f26895i);
            return x0.f106703e;
        }
        f72.f fVar = iVar.f61270b;
        if (fVar == null || (b13 = b(fVar, z0.Large.getWidth())) == null) {
            f72.f fVar2 = iVar.f61269a;
            b13 = fVar2 != null ? b(fVar2, z0.OldLarge.getWidth()) : null;
        }
        f72.f fVar3 = iVar.f61271c;
        y0 b14 = fVar3 != null ? b(fVar3, z0.Medium.getWidth()) : null;
        f72.f fVar4 = iVar.f61272d;
        y0 b15 = fVar4 != null ? b(fVar4, z0.Small.getWidth()) : null;
        f72.f fVar5 = iVar.f61273e;
        x0 x0Var = (fVar == null && fVar3 == null && fVar4 == null && fVar5 == null) ? null : new x0(b13, b14, b15, fVar5 != null ? b(fVar5, fVar5.f61246b) : null);
        return x0Var == null ? x0.f106703e : x0Var;
    }

    public final y0 b(f72.f from, int i13) {
        int i14;
        Intrinsics.checkNotNullParameter(from, "from");
        String imageUrl = from.f61245a;
        if (imageUrl.length() == 0) {
            return null;
        }
        int i15 = from.f61246b;
        if (i15 != 0 && (i14 = from.f61247c) != 0) {
            return new y0(imageUrl, i15, i14, i13);
        }
        this.f26897b.getClass();
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0069, code lost:
    
        if (r0 == null) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final r72.p1 d(f72.r r13) {
        /*
            r12 = this;
            e72.f r0 = r13.f61352d
            r1 = 0
            f72.m0 r2 = r13.f61353e
            if (r0 == 0) goto Lb
            f72.i r0 = r0.f57642f
            if (r0 != 0) goto L15
        Lb:
            f72.i r0 = r13.f61354f
            if (r0 != 0) goto L15
            if (r2 == 0) goto L14
            f72.i r0 = r2.f61311d
            goto L15
        L14:
            r0 = r1
        L15:
            java.lang.String r3 = r13.f61349a
            if (r0 == 0) goto La7
            f72.f r4 = r0.f61270b
            if (r4 != 0) goto L2b
            f72.f r4 = r0.f61269a
            if (r4 != 0) goto L2b
            f72.f r4 = r0.f61273e
            if (r4 != 0) goto L2b
            f72.f r4 = r0.f61271c
            if (r4 != 0) goto L2b
            f72.f r4 = r0.f61272d
        L2b:
            if (r4 == 0) goto L97
            int r0 = r4.f61247c
            int r3 = r4.f61246b
            if (r3 <= 0) goto L85
            if (r0 <= 0) goto L85
            int r0 = r72.c1.f106451a
            if (r2 == 0) goto L42
            java.lang.String r0 = r2.f61308a
            java.lang.String r3 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
        L40:
            r9 = r0
            goto L45
        L42:
            java.lang.String r0 = "-1"
            goto L40
        L45:
            java.lang.String r0 = r4.f61245a
            android.net.Uri r6 = android.net.Uri.parse(r0)
            if (r2 == 0) goto L6e
            r0 = 1
            int r2 = r2.f61309b
            if (r2 == r0) goto L67
            r0 = 2
            if (r2 == r0) goto L64
            r0 = 3
            if (r2 == r0) goto L61
            r0 = 4
            if (r2 == r0) goto L5e
            r72.w1 r0 = r72.w1.UNKNOWN
            goto L69
        L5e:
            r72.w1 r0 = r72.w1.DRAWING
            goto L69
        L61:
            r72.w1 r0 = r72.w1.UNSPLASH
            goto L69
        L64:
            r72.w1 r0 = r72.w1.GOOGLE_CREATIVE_COMMONS
            goto L69
        L67:
            r72.w1 r0 = r72.w1.CAMERA
        L69:
            if (r0 != 0) goto L6c
            goto L6e
        L6c:
            r10 = r0
            goto L71
        L6e:
            r72.w1 r0 = r72.w1.UNKNOWN
            goto L6c
        L71:
            f72.i r13 = r13.f61357i
            if (r13 == 0) goto L79
            r72.x0 r1 = r12.a(r13)
        L79:
            r11 = r1
            r72.p1 r13 = new r72.p1
            int r7 = r4.f61246b
            int r8 = r4.f61247c
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            return r13
        L85:
            java.lang.String r13 = "Incorrect image size: "
            java.lang.String r1 = "x"
            java.lang.String r13 = a.a.f(r13, r3, r1, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L97:
            java.lang.String r13 = "Pin large image must not be null for ShuffleAsset, item.id="
            java.lang.String r13 = a.a.j(r13, r3)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        La7:
            java.lang.String r13 = "Pin images must not be null for ShuffleAsset, item.id="
            java.lang.String r13 = a.a.j(r13, r3)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c72.f.d(f72.r):r72.p1");
    }
}
