package com.pinterest.api.model;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010%\u001a\u00020 \u0012\b\b\u0002\u0010,\u001a\u00020&¢\u0006\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010%\u001a\u00020 8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020&8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u0006/"}, d2 = {"Lcom/pinterest/api/model/bo0;", "Lcom/pinterest/api/model/wx;", "Ldl1/s;", "Lcom/pinterest/api/model/d30;", "a", "Lcom/pinterest/api/model/d30;", "k", "()Lcom/pinterest/api/model/d30;", "photoItem", "Lcom/pinterest/api/model/k01;", "b", "Lcom/pinterest/api/model/k01;", "q", "()Lcom/pinterest/api/model/k01;", "videoItem", "", "c", "J", "n", "()J", "startTimeMs", "d", "h", "endTimeMs", "Landroid/graphics/Matrix;", "e", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "displayMatrix", "f", "j", "exportMatrix", "", "g", "F", "l", "()F", "speedMultiplier", "", "Z", "s", "()Z", "setFromFrontFacingCamera", "(Z)V", "isFromFrontFacingCamera", "<init>", "(Lcom/pinterest/api/model/d30;Lcom/pinterest/api/model/k01;JJLandroid/graphics/Matrix;Landroid/graphics/Matrix;FZ)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class bo0 extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("photoItem")
    private final d30 photoItem;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("videoItem")
    private final k01 videoItem;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("startTimeMs")
    private final long startTimeMs;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("endTimeMs")
    private final long endTimeMs;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("displayMatrix")
    private final Matrix displayMatrix;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @om.b("exportMatrix")
    private final Matrix exportMatrix;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @om.b("speedMultiplier")
    private final float speedMultiplier;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    @om.b("isFromFrontFacingCamera")
    private boolean isFromFrontFacingCamera;

    /* renamed from: i, reason: collision with root package name */
    public final long f36143i;

    public bo0() {
        this(null, null, 0L, 0L, null, null, 0.0f, false, 255, null);
    }

    public static bo0 a(bo0 bo0Var, k01 k01Var, long j13, long j14, Matrix matrix, Matrix matrix2, float f13, int i13) {
        d30 d30Var = bo0Var.photoItem;
        k01 k01Var2 = (i13 & 2) != 0 ? bo0Var.videoItem : k01Var;
        long j15 = (i13 & 4) != 0 ? bo0Var.startTimeMs : j13;
        long j16 = (i13 & 8) != 0 ? bo0Var.endTimeMs : j14;
        Matrix matrix3 = (i13 & 16) != 0 ? bo0Var.displayMatrix : matrix;
        Matrix matrix4 = (i13 & 32) != 0 ? bo0Var.exportMatrix : matrix2;
        float f14 = (i13 & 64) != 0 ? bo0Var.speedMultiplier : f13;
        boolean z13 = bo0Var.isFromFrontFacingCamera;
        bo0Var.getClass();
        return new bo0(d30Var, k01Var2, j15, j16, matrix3, matrix4, f14, z13);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        String str;
        String id3;
        k01 k01Var = this.videoItem;
        if (k01Var != null) {
            str = k01Var.getId() + "-" + this.startTimeMs + "-" + this.endTimeMs;
        } else {
            str = null;
        }
        d30 d30Var = this.photoItem;
        return (d30Var == null || (id3 = d30Var.getId()) == null) ? str == null ? "" : str : id3;
    }

    /* renamed from: e, reason: from getter */
    public final Matrix getDisplayMatrix() {
        return this.displayMatrix;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(bo0.class, obj.getClass())) {
            return false;
        }
        bo0 bo0Var = (bo0) obj;
        d30 d30Var = this.photoItem;
        String e13 = d30Var != null ? d30Var.e() : null;
        d30 d30Var2 = bo0Var.photoItem;
        if (Intrinsics.d(e13, d30Var2 != null ? d30Var2.e() : null)) {
            k01 k01Var = this.videoItem;
            String e14 = k01Var != null ? k01Var.e() : null;
            k01 k01Var2 = bo0Var.videoItem;
            if (Intrinsics.d(e14, k01Var2 != null ? k01Var2.e() : null) && this.startTimeMs == bo0Var.startTimeMs && this.endTimeMs == bo0Var.endTimeMs && Intrinsics.d(this.displayMatrix, bo0Var.displayMatrix) && Intrinsics.d(this.exportMatrix, bo0Var.exportMatrix) && this.speedMultiplier == bo0Var.speedMultiplier) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g, reason: from getter */
    public final long getF36143i() {
        return this.f36143i;
    }

    /* renamed from: h, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final int hashCode() {
        d30 d30Var = this.photoItem;
        int hashCode = (d30Var == null ? 0 : d30Var.hashCode()) * 31;
        k01 k01Var = this.videoItem;
        int c13 = a.a.c(this.endTimeMs, a.a.c(this.startTimeMs, (hashCode + (k01Var == null ? 0 : k01Var.hashCode())) * 31, 31), 31);
        Matrix matrix = this.displayMatrix;
        int hashCode2 = (c13 + (matrix == null ? 0 : matrix.hashCode())) * 31;
        Matrix matrix2 = this.exportMatrix;
        return Boolean.hashCode(this.isFromFrontFacingCamera) + a.a.a(this.speedMultiplier, (hashCode2 + (matrix2 != null ? matrix2.hashCode() : 0)) * 31, 31);
    }

    /* renamed from: j, reason: from getter */
    public final Matrix getExportMatrix() {
        return this.exportMatrix;
    }

    /* renamed from: k, reason: from getter */
    public final d30 getPhotoItem() {
        return this.photoItem;
    }

    /* renamed from: l, reason: from getter */
    public final float getSpeedMultiplier() {
        return this.speedMultiplier;
    }

    /* renamed from: n, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* renamed from: q, reason: from getter */
    public final k01 getVideoItem() {
        return this.videoItem;
    }

    /* renamed from: s, reason: from getter */
    public final boolean getIsFromFrontFacingCamera() {
        return this.isFromFrontFacingCamera;
    }

    public final String toString() {
        d30 d30Var = this.photoItem;
        k01 k01Var = this.videoItem;
        long j13 = this.startTimeMs;
        long j14 = this.endTimeMs;
        Matrix matrix = this.displayMatrix;
        Matrix matrix2 = this.exportMatrix;
        float f13 = this.speedMultiplier;
        boolean z13 = this.isFromFrontFacingCamera;
        StringBuilder sb3 = new StringBuilder("StoryPinMediaItem(photoItem=");
        sb3.append(d30Var);
        sb3.append(", videoItem=");
        sb3.append(k01Var);
        sb3.append(", startTimeMs=");
        sb3.append(j13);
        a.cb.v(sb3, ", endTimeMs=", j14, ", displayMatrix=");
        sb3.append(matrix);
        sb3.append(", exportMatrix=");
        sb3.append(matrix2);
        sb3.append(", speedMultiplier=");
        sb3.append(f13);
        sb3.append(", isFromFrontFacingCamera=");
        sb3.append(z13);
        sb3.append(")");
        return sb3.toString();
    }

    public final boolean u() {
        return this.photoItem != null;
    }

    public final boolean v() {
        return this.photoItem == null && this.videoItem != null;
    }

    public final boolean x() {
        return (this.photoItem == null || this.videoItem == null) ? false : true;
    }

    public bo0(d30 d30Var, k01 k01Var, long j13, long j14, Matrix matrix, Matrix matrix2, float f13, boolean z13) {
        this.photoItem = d30Var;
        this.videoItem = k01Var;
        this.startTimeMs = j13;
        this.endTimeMs = j14;
        this.displayMatrix = matrix;
        this.exportMatrix = matrix2;
        this.speedMultiplier = f13;
        this.isFromFrontFacingCamera = z13;
        this.f36143i = j14 - j13;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public bo0(com.pinterest.api.model.d30 r11, com.pinterest.api.model.k01 r12, long r13, long r15, android.graphics.Matrix r17, android.graphics.Matrix r18, float r19, boolean r20, int r21, kotlin.jvm.internal.DefaultConstructorMarker r22) {
        /*
            r10 = this;
            r0 = r21
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L9
            r1 = r2
            goto La
        L9:
            r1 = r11
        La:
            r3 = r0 & 2
            if (r3 == 0) goto L10
            r3 = r2
            goto L11
        L10:
            r3 = r12
        L11:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L19
            r7 = r5
            goto L1a
        L19:
            r7 = r13
        L1a:
            r4 = r0 & 8
            if (r4 == 0) goto L25
            if (r3 == 0) goto L23
            long r4 = r3.f39242e
            goto L26
        L23:
            r4 = r5
            goto L26
        L25:
            r4 = r15
        L26:
            r6 = r0 & 16
            if (r6 == 0) goto L2c
            r6 = r2
            goto L2e
        L2c:
            r6 = r17
        L2e:
            r9 = r0 & 32
            if (r9 == 0) goto L33
            goto L35
        L33:
            r2 = r18
        L35:
            r9 = r0 & 64
            if (r9 == 0) goto L3c
            r9 = 1065353216(0x3f800000, float:1.0)
            goto L3e
        L3c:
            r9 = r19
        L3e:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L44
            r0 = 0
            goto L46
        L44:
            r0 = r20
        L46:
            r11 = r10
            r12 = r1
            r13 = r3
            r14 = r7
            r16 = r4
            r18 = r6
            r19 = r2
            r20 = r9
            r21 = r0
            r11.<init>(r12, r13, r14, r16, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pinterest.api.model.bo0.<init>(com.pinterest.api.model.d30, com.pinterest.api.model.k01, long, long, android.graphics.Matrix, android.graphics.Matrix, float, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
