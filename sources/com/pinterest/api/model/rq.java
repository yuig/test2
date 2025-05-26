package com.pinterest.api.model;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/pinterest/api/model/rq;", "", "", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "id", "Lcom/pinterest/api/model/uq;", "b", "Lcom/pinterest/api/model/uq;", "f", "()Lcom/pinterest/api/model/uq;", "type", "colorHex", "Landroid/graphics/Matrix;", "d", "Landroid/graphics/Matrix;", "()Landroid/graphics/Matrix;", "matrix", "Lcom/pinterest/api/model/vq;", "e", "Lcom/pinterest/api/model/vq;", "()Lcom/pinterest/api/model/vq;", "rotatedRect", "<init>", "(Ljava/lang/String;Lcom/pinterest/api/model/uq;Ljava/lang/String;Landroid/graphics/Matrix;Lcom/pinterest/api/model/vq;)V", "hairball_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class rq {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("id")
    @NotNull
    private final String id;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("type")
    @NotNull
    private final uq type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("colorHex")
    @NotNull
    private final String colorHex;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("matrix")
    private final Matrix matrix;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @om.b("rotatedRect")
    private final vq rotatedRect;

    public rq(@NotNull String id3, @NotNull uq type, @NotNull String colorHex, Matrix matrix, vq vqVar) {
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        this.id = id3;
        this.type = type;
        this.colorHex = colorHex;
        this.matrix = matrix;
        this.rotatedRect = vqVar;
    }

    public static rq a(rq rqVar, String str, Matrix matrix, vq vqVar, int i13) {
        String id3 = rqVar.id;
        uq type = rqVar.type;
        if ((i13 & 4) != 0) {
            str = rqVar.colorHex;
        }
        String colorHex = str;
        if ((i13 & 8) != 0) {
            matrix = rqVar.matrix;
        }
        Matrix matrix2 = matrix;
        if ((i13 & 16) != 0) {
            vqVar = rqVar.rotatedRect;
        }
        rqVar.getClass();
        Intrinsics.checkNotNullParameter(id3, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(colorHex, "colorHex");
        return new rq(id3, type, colorHex, matrix2, vqVar);
    }

    /* renamed from: b, reason: from getter */
    public final String getColorHex() {
        return this.colorHex;
    }

    /* renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: d, reason: from getter */
    public final Matrix getMatrix() {
        return this.matrix;
    }

    /* renamed from: e, reason: from getter */
    public final vq getRotatedRect() {
        return this.rotatedRect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(rq.class, obj.getClass())) {
            return false;
        }
        rq rqVar = (rq) obj;
        return this.type == rqVar.type && Intrinsics.d(this.colorHex, rqVar.colorHex) && Intrinsics.d(this.matrix, rqVar.matrix) && Intrinsics.d(this.rotatedRect, rqVar.rotatedRect);
    }

    /* renamed from: f, reason: from getter */
    public final uq getType() {
        return this.type;
    }

    public final int hashCode() {
        int d2 = a.cb.d(this.colorHex, (this.type.hashCode() + (this.id.hashCode() * 31)) * 31, 31);
        Matrix matrix = this.matrix;
        int hashCode = (d2 + (matrix == null ? 0 : matrix.hashCode())) * 31;
        vq vqVar = this.rotatedRect;
        return hashCode + (vqVar != null ? vqVar.hashCode() : 0);
    }

    public final String toString() {
        return "IdeaPinOverlayBlockConfig(id=" + this.id + ", type=" + this.type + ", colorHex=" + this.colorHex + ", matrix=" + this.matrix + ", rotatedRect=" + this.rotatedRect + ")";
    }

    public /* synthetic */ rq(String str, uq uqVar, String str2, Matrix matrix, vq vqVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uqVar, str2, (i13 & 8) != 0 ? null : matrix, (i13 & 16) != 0 ? null : vqVar);
    }
}
