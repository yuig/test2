package com.pinterest.api.model;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B3\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0018¢\u0006\u0004\b \u0010!R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/pinterest/api/model/mp;", "Lcom/pinterest/api/model/wx;", "Ldl1/s;", "", "Landroid/graphics/PointF;", "a", "Ljava/util/List;", "j", "()Ljava/util/List;", "pointList", "Lcom/pinterest/api/model/go;", "b", "Lcom/pinterest/api/model/go;", "g", "()Lcom/pinterest/api/model/go;", "brushType", "", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "setBrushColor", "(Ljava/lang/String;)V", "brushColor", "", "d", "F", "h", "()F", "setBrushWidth", "(F)V", "brushWidth", "<init>", "(Ljava/util/List;Lcom/pinterest/api/model/go;Ljava/lang/String;F)V", "models_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final /* data */ class mp extends wx {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("pointList")
    @NotNull
    private final List<PointF> pointList;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @om.b("brushType")
    @NotNull
    private final go brushType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @om.b("brushColor")
    @NotNull
    private String brushColor;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @om.b("brushWidth")
    private float brushWidth;

    /* JADX WARN: Multi-variable type inference failed */
    public mp(@NotNull List<? extends PointF> pointList, @NotNull go brushType, @NotNull String brushColor, float f13) {
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        Intrinsics.checkNotNullParameter(brushColor, "brushColor");
        this.pointList = pointList;
        this.brushType = brushType;
        this.brushColor = brushColor;
        this.brushWidth = f13;
    }

    public static mp a(mp mpVar, ArrayList pointList, float f13) {
        go brushType = mpVar.brushType;
        String brushColor = mpVar.brushColor;
        Intrinsics.checkNotNullParameter(pointList, "pointList");
        Intrinsics.checkNotNullParameter(brushType, "brushType");
        Intrinsics.checkNotNullParameter(brushColor, "brushColor");
        return new mp(pointList, brushType, brushColor, f13);
    }

    @Override // dl1.s
    /* renamed from: b */
    public final String getId() {
        return String.valueOf(hashCode());
    }

    /* renamed from: e, reason: from getter */
    public final String getBrushColor() {
        return this.brushColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.d(mp.class, obj.getClass())) {
            return false;
        }
        mp mpVar = (mp) obj;
        return Intrinsics.d(this.pointList, mpVar.pointList) && this.brushType == mpVar.brushType && Intrinsics.d(this.brushColor, mpVar.brushColor) && this.brushWidth == mpVar.brushWidth;
    }

    /* renamed from: g, reason: from getter */
    public final go getBrushType() {
        return this.brushType;
    }

    /* renamed from: h, reason: from getter */
    public final float getBrushWidth() {
        return this.brushWidth;
    }

    public final int hashCode() {
        return Float.hashCode(this.brushWidth) + a.cb.d(this.brushColor, (this.brushType.hashCode() + (this.pointList.hashCode() * 31)) * 31, 31);
    }

    /* renamed from: j, reason: from getter */
    public final List getPointList() {
        return this.pointList;
    }

    public final String toString() {
        return "IdeaPinHandDrawingPath(pointList=" + this.pointList + ", brushType=" + this.brushType + ", brushColor=" + this.brushColor + ", brushWidth=" + this.brushWidth + ")";
    }

    public mp(List list, go goVar, String str, float f13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? np.f40453a : goVar, (i13 & 4) != 0 ? "#FFFFFF" : str, (i13 & 8) != 0 ? 4.0f : f13);
    }
}
